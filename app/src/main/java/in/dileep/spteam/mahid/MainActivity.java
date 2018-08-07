package in.dileep.spteam.mahid;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {


    Button b1,b2,b3,b4,b5,b6,logob;
    Spinner sp1;
    String ip="10.1.1.113";
    int c1=0,c2=0,c3=0,c4=0,c5=0;
    FileOutputStream fo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);
        b6=(Button) findViewById(R.id.button6);
        logob=(Button) findViewById(R.id.logob);
                    Items();
                    b1.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                            if(c1==0){
                                try {
                                    fo=new FileOutputStream("dileep.txt");
                                    fo.write(1);
                                    fo.close();

                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                String str1 =sp1.getSelectedItem().toString();
                                String key="turn on the lights in";
                                String str3=key+" "+str1;
                                Toast.makeText(MainActivity.this,str3, Toast.LENGTH_SHORT).show();
                                new Sendmsge().execute(str3);
                                String txt=b1.getText().toString();
                    //b1.setText("turning on"+" "+txt);
                    GradientDrawable bgShape = (GradientDrawable)b1.getBackground();
                    bgShape.setColor(Color.argb(255,215,178,167));

                    c1=c1+1;
                }
                else if(c1==1){
                    String str2=sp1.getSelectedItem().toString();
                    String key2="turn off the lights in";
                    String strkey=key2+" "+str2;
                    Toast.makeText(MainActivity.this,strkey, Toast.LENGTH_SHORT).show();
                    new Sendmsge().execute(strkey);
                    //b1.setBackgroundColor(255);
                    String txt=b1.getText().toString();
                    //b1.setText("turning off"+" "+txt);
                    GradientDrawable bgShape = (GradientDrawable)b1.getBackground();
                    bgShape.setColor(Color.argb(255,150,150,150));

                    c1=0;
                }



            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c2==0){
                    String str1 =sp1.getSelectedItem().toString();
                    String key="turn on the fans in";
                    String str3=key+" "+str1;
                    Toast.makeText(MainActivity.this,str3, Toast.LENGTH_SHORT).show();
                    new Sendmsge().execute(str3);
                    String txt=b2.getText().toString();
                    // b2.setText("turning on"+" "+txt);
                    GradientDrawable bgShape = (GradientDrawable)b2.getBackground();
                    bgShape.setColor(Color.argb(255,215,178,167));

                    c2=c2+1;
                }
                else if(c2==1){
                    String str2=sp1.getSelectedItem().toString();
                    String key2="turn off the fans in";
                    String strkey=key2+" "+str2;
                    Toast.makeText(MainActivity.this,strkey, Toast.LENGTH_SHORT).show();
                    new Sendmsge().execute(strkey);
                    //b1.setBackgroundColor(255);
                    String txt=b2.getText().toString();
                    // b2.setText("turning on"+" "+txt);
                    GradientDrawable bgShape = (GradientDrawable)b2.getBackground();
                    bgShape.setColor(Color.argb(255,150,150,150));
                    c2=0;
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c3==0){
                    String str1 =sp1.getSelectedItem().toString();
                    String key="open the curtains";
                    String str3=key+" "+str1;
                    Toast.makeText(MainActivity.this,str3, Toast.LENGTH_SHORT).show();
                    new Sendmsge().execute(str3);
                    String txt=b3.getText().toString();
                    // b2.setText("turning on"+" "+txt);
                    GradientDrawable bgShape = (GradientDrawable)b3.getBackground();
                    bgShape.setColor(Color.argb(255,215,178,167));

                    c3=c3+1;
                }
                else if(c3==1){
                    String str2=sp1.getSelectedItem().toString();
                    String key2="close the curtains";
                    String strkey=key2+" "+str2;
                    Toast.makeText(MainActivity.this,strkey, Toast.LENGTH_SHORT).show();
                    new Sendmsge().execute(strkey);
                    //b1.setBackgroundColor(255);
                    String txt=b3.getText().toString();
                    // b2.setText("turning on"+" "+txt);
                    GradientDrawable bgShape = (GradientDrawable)b3.getBackground();
                    bgShape.setColor(Color.argb(255,150,150,150));
                    c3=0;
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String str1 =sp1.getSelectedItem().toString();
                String key="open the door";
                String str3=key+" "+str1;
                Toast.makeText(MainActivity.this,str3, Toast.LENGTH_SHORT).show();
                new Sendmsge().execute(str3);
                String txt=b4.getText().toString();
                // b2.setText("turning on"+" "+txt);
                GradientDrawable bgShape = (GradientDrawable)b4.getBackground();
                bgShape.setColor(Color.argb(255,215,178,167));


            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c4==0){
                    String str1 =sp1.getSelectedItem().toString();
                    String key="blink LED";

                    Toast.makeText(MainActivity.this,key, Toast.LENGTH_SHORT).show();
                    new Sendmsge().execute(key);
                    String txt=b1.getText().toString();
                    //b1.setText("turning on"+" "+txt);
                    GradientDrawable bgShape = (GradientDrawable)b5.getBackground();
                    bgShape.setColor(Color.argb(255,215,178,167));

                    c4=c4+1;
                }
                else if(c4==1){
                    String str2=sp1.getSelectedItem().toString();
                    String key2="stop LED";

                    Toast.makeText(MainActivity.this,key2, Toast.LENGTH_SHORT).show();
                    new Sendmsge().execute(key2);
                    //b1.setBackgroundColor(255);
                    String txt=b1.getText().toString();
                    //b1.setText("turning off"+" "+txt);
                    GradientDrawable bgShape = (GradientDrawable)b5.getBackground();
                    bgShape.setColor(Color.argb(255,150,150,150));

                    c4=0;
                }

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        logob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c5==0){
                    String k="0";
                    Toast.makeText(MainActivity.this, "turning on Logo", Toast.LENGTH_SHORT).show();
                    new Sendmsge().execute(k);
                    c5=1;
                }
                else if(c5==1){
                    String k="1";
                    Toast.makeText(MainActivity.this, "turning off Logo", Toast.LENGTH_SHORT).show();
                    new Sendmsge().execute(k);
                    c5=0;
                }
            }
        });
    }

    private void Items() {
        sp1=(Spinner) findViewById(R.id.sp1);
        sp1 = (Spinner) findViewById(R.id.sp1);
        List<String> list = new ArrayList<String>();
        list.add("all rooms");
        list.add("room  1");
        list.add("room  2");
        list.add("room  3");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(dataAdapter);
    }

    public void getSpeechInput(View view) {

        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, 10);
        } else {
            Toast.makeText(this, "Your Device Don't Support Speech Input", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case 10:
                if (resultCode == RESULT_OK && data != null) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    // txvResult.setText(result.get(0));
                    new Sendmsge().execute(result.get(0));
                }
                break;
        }
    }


    public class Sendmsge extends AsyncTask<String, String, String> {
        String resmsg = "";

        @Override
        protected String doInBackground(String... strings) {
            try {
                try {
                    Socket socket = new Socket(ip, 8888);
                    PrintWriter outs = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
                    outs.print(strings[0]);
                    outs.flush();

                   /* ByteArrayOutputStream byteArrayOutputStream =
                            new ByteArrayOutputStream(1024);
                    byte[] buffer = new byte[1024];

                    int bytesRead;
                    InputStream inputStream=socket.getInputStream();

                    while ((bytesRead = inputStream.read(buffer)) != -1){
                        byteArrayOutputStream.write(buffer, 0, bytesRead);
                        resmsg += byteArrayOutputStream.toString("UTF-8");
                    }
                    txtv.setText(resmsg);*/


                } catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            //txvResult.setText("done");
            super.onPostExecute(s);
        }
    }

}
