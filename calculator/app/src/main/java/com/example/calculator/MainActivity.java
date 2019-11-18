package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public EditText pant;
    public double num1;
    public double num2;
    public double res;
    public int op;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pant = (EditText)findViewById(R.id.pantalla);
    }

    public void button0(View v)
    {
        String mostrar = pant.getText().toString();
        mostrar = mostrar + "0";
        pant.setText(mostrar);

    }

    public void button1(View v)
    {
            String mostrar = pant.getText().toString();
            mostrar = mostrar + "1";
            pant.setText(mostrar);

    }

    public void button2(View v)
    {
        String mostrar = pant.getText().toString();
        mostrar = mostrar + "2";
        pant.setText(mostrar);

    }
    public void button3(View v)
    {
        String mostrar = pant.getText().toString();
        mostrar = mostrar + "3";
        pant.setText(mostrar);

    }
    public void button4(View v)
    {
        String mostrar = pant.getText().toString();
        mostrar = mostrar + "4";
        pant.setText(mostrar);

    }
    public void button5(View v)
    {
        String mostrar = pant.getText().toString();
        mostrar = mostrar + "5";
        pant.setText(mostrar);

    }
    public void button6(View v)
    {
        String mostrar = pant.getText().toString();
        mostrar = mostrar + "6";
        pant.setText(mostrar);

    }
    public void button7(View v)
    {
        String mostrar = pant.getText().toString();
        mostrar = mostrar + "7";
        pant.setText(mostrar);

    }
    public void button8(View v)
    {
        String mostrar = pant.getText().toString();
        mostrar = mostrar + "8";
        pant.setText(mostrar);

    }
    public void button9(View v)
    {
        String mostrar = pant.getText().toString();
        mostrar = mostrar + "9";
        pant.setText(mostrar);

    }



    //operaciones suma resta cos sin tan
    public void sumbutton (View v){
        try{
            String aux1=pant.getText().toString();
            num1=Double.parseDouble(aux1);
        }
        catch(NumberFormatException nfe){}
        pant.setText("");
        op=1;
    }
    public void restarbutton (View v){
        try{
            String aux1=pant.getText().toString();
            num1=Double.parseDouble(aux1);
        }
        catch(NumberFormatException nfe){}
        pant.setText("");
        op=2;
    }
    public void multbutton (View v){
        try{
            String aux1=pant.getText().toString();
            num1=Double.parseDouble(aux1);
        }
        catch(NumberFormatException nfe){}
        pant.setText("");
        op=3;
    }
    public void divbutton (View v){
        try{
            String aux1=pant.getText().toString();
            num1=Double.parseDouble(aux1);
        }
        catch(NumberFormatException nfe){}
        pant.setText("");
        op=4;
    }
    public void cosbutton (View v){
        try{
            String aux1=pant.getText().toString();
            num1=Double.parseDouble(aux1);
        }
        catch(NumberFormatException nfe){}
        pant.setText("Cos("+num1+")");
        op=5;
    }
    public void sinbutton (View v){
        try{
            String aux1=pant.getText().toString();
            num1=Double.parseDouble(aux1);
        }
        catch(NumberFormatException nfe){}
        pant.setText("Sin("+num1+")");
        op=6;
    }
    public void tanbutton (View v){
        try{
            String aux1=pant.getText().toString();
            num1=Double.parseDouble(aux1);
        }
        catch(NumberFormatException nfe){}
        pant.setText("Tan("+num1+")");
        op=7;
    }



       //definimos el segundo numero y le damos a igual
    public void igualbutton (View v) {
        try {
            String aux2 = pant.getText().toString();
            num2 = Double.parseDouble(aux2);
        } catch (NumberFormatException nfe) {
        }
        pant.setText("");

        if (op == 1) {
            res = num1 + num2;

        }
        else if (op == 2) {
            res = num1 - num2;
        }
        else if (op == 2) {
            res = num1 - num2;
        }
        else if (op == 3) {
            res = num1*num2;
        }
        else if (op == 4) {
            if (num2 == 0)
            {
                pant.setText("Error, no se puede dividir entre 0");
            }
            res = num1/num2;
        }
        else if (op==5) {
            double rad = Math.toRadians(num1);
            res = Math.cos(rad);
        }
        else if (op==6) {
            double rad = Math.toRadians(num1);
            res = Math.sin(rad);
        }
        else if (op==7) {
            double rad = Math.toRadians(num1);
            res = Math.tan(rad);
        }

        pant.setText("" + res);
        num1=res;
    }

    public void borrarultimo (View v) {    //borrar el ultimo numero puesto
        if (!pant.getText().toString().equals("")) {
            pant.setText(pant.getText().subSequence(0, pant.getText().length() - 1) + "");
        }
    }

    // borrar la pantalla entera y el valor de los numeros
    public void clearbutton(View v) {
        //ES COMO RESET TOTAL
        pant.setText("");
        num1=0.0;
        num2=0.0;
        res=0.0;

    }
}
