package com.example.calcusis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etnota1,etnota2,etnota3;
    TextView resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnota1=(EditText)findViewById(R.id.valor1);
        etnota2=(EditText)findViewById(R.id.valor2);
        etnota3=(EditText)findViewById(R.id.valor3);
        resultado=(TextView)findViewById(R.id.resul);
    }
    public void suma(View view)
    {
        /*capturamos valores de las cajas de texto*/
        String val1=etnota1.getText().toString();
        String val2=etnota2.getText().toString();
        String val3=etnota3.getText().toString();
        /*Convertimos de String A  Int*/
        int num1=Integer.parseInt(val1);
        int num2=Integer.parseInt(val2);
        int num3=Integer.parseInt(val3);
        /*Realizamos la operacion*/
        int suma=num1+num2+num3;
        /*Convertimos a string de int para que se
         pueda imprimir en el textview*/
        String resultadosuma=String.valueOf(suma);
        /*Imprimimos los resultados*/
        resultado.setText(resultadosuma);

    }
    public void resta(View view)
    {
        /*capturamos valores de las cajas de texto*/
        String val1=etnota1.getText().toString();
        String val2=etnota2.getText().toString();
        String val3=etnota3.getText().toString();
        /*Convertimos de String A  Int*/
        int num1=Integer.parseInt(val1);
        int num2=Integer.parseInt(val2);
        int num3=Integer.parseInt(val3);
        /*Realizamos la operacion*/
        int suma=num1-num2-num3;
        /*Convertimos a string de int para que
        se pueda imprimir en el textview*/
        String resultadosuma=String.valueOf(suma);
        /*Imprimimos los resultados*/
        resultado.setText(resultadosuma);

    }
    public void division(View view)
    {
        /*capturamos valores de las cajas de texto*/
        String val1=etnota1.getText().toString();
        String val2=etnota2.getText().toString();
        String val3=etnota3.getText().toString();
        /*Convertimos de String A  Int*/
        float num1=Integer.parseInt(val1);
        float num2=Integer.parseInt(val2);
        float num3=Integer.parseInt(val3);
        /*Realizamos la operacion*/
        if()
        float suma=(num1/ num2)/num3;
        /*Convertimos a string de int para que se
        pueda imprimir en el textview*/
        String resultadosuma=String.valueOf(suma);

        /*Imprimimos los resultados*/
        resultado.setText(resultadosuma);

    }
    public void multiplicacion(View view)
    {
        /*capturamos valores de las cajas de texto*/
        String val1=etnota1.getText().toString();
        String val2=etnota2.getText().toString();
        String val3=etnota3.getText().toString();
        /*Convertimos de String A  Int*/
        int num1=Integer.parseInt(val1);
        int num2=Integer.parseInt(val2);
        int num3=Integer.parseInt(val3);
        /*Realizamos la operacion*/
        int suma=(num1*num2)*num3;
        /*Convertimos a string de int para que se
       pueda imprimir en el textview*/
        String resultadosuma=String.valueOf(suma);
        /*Imprimimos los resultados*/
        resultado.setText(resultadosuma);

    }

}