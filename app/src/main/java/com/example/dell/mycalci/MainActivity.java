package com.example.dell.mycalci;




        import android.os.Bundle;
        import android.app.Activity;
        import android.view.Menu;
        import android.view.View;
        import android.widget.EditText;


public class MainActivity extends Activity {

    //Defining Variables
    EditText e1,e2,e3;
    double a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Add(View v)
    {
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editResult);

        String s1=e1.getText().toString();
        String s2=e2.getText().toString();

        a=Double.parseDouble(s1);
        b=Double.parseDouble(s2);

        c=a+b;

        String s3=Double.toString(c);

        e3.setText(s3);



    }

    public void Sub(View v)
    {
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editResult);

        String s1=e1.getText().toString();
        String s2=e2.getText().toString();

        a=Double.parseDouble(s1);
        b=Double.parseDouble(s2);

        c=a-b;

        String s3=Double.toString(c);

        e3.setText(s3);



    }

    public void Mul(View v)
    {
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editResult);

        String s1=e1.getText().toString();
        String s2=e2.getText().toString();

        a=Double.parseDouble(s1);
        b=Double.parseDouble(s2);

        c=a*b;

        String s3=Double.toString(c);

        e3.setText(s3);



    }

    public void Div(View v)
    {
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editResult);

        String s1=e1.getText().toString();
        String s2=e2.getText().toString();

        a=Double.parseDouble(s1);
        b=Double.parseDouble(s2);

        c=a/b;

        String s3=Double.toString(c);

        e3.setText(s3);



    }
    public void Percent(View v)
    {
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editResult);

        String s1=e1.getText().toString();
        String s2=e2.getText().toString();

        a=Double.parseDouble(s1);
        b=Double.parseDouble(s2);

        c=(a*b)/100;

        String s3=Double.toString(c);

        e3.setText(s3);



    }

    public void Sin(View v)
    {
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editResult);

        String s1=e1.getText().toString();

        a=Double.parseDouble(s1);
        c = Math.sin(a);

        String s3=Double.toString(c);
        e2.setText("");
        e3.setText(s3);



    }
    public void Cos(View v)
    {
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editResult);

        String s1=e1.getText().toString();

        a=Double.parseDouble(s1);
        c= Math.cos(a);;

        String s3=Double.toString(c);
        e2.setText("");
        e3.setText(s3);



    }
    public void Square(View v)
    {
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editResult);

        String s1=e1.getText().toString();

        a=Double.parseDouble(s1);

        c=(a*a);

        String s3=Double.toString(c);
        e2.setText("");
        e3.setText(s3);



    }
    public void Sqrt(View v)
    {
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editResult);

        String s1=e1.getText().toString();

        a=Double.parseDouble(s1);

        c= Math.sqrt(a);

        String s3=Double.toString(c);
        e2.setText("");
        e3.setText(s3);



    }
    public void Tan(View v)
    {
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editResult);

        String s1=e1.getText().toString();

        a=Double.parseDouble(s1);
        c=Math.tan(a);

        String s3=Double.toString(c);
        e2.setText("");
        e3.setText(s3);



    }
    public void Log(View v)
    {
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editResult);

        String s1=e1.getText().toString();

        a=Double.parseDouble(s1);
        c = Math.log(a);

        String s3=Double.toString(c);
        e2.setText("");
        e3.setText(s3);



    }

    public void Clear(View v)
    {
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editResult);

        e1.setText("");
        e2.setText("");
        e3.setText("");

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
