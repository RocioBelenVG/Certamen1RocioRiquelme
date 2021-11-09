package com.example.certamen1rocioriquelme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        private TextView textView;
        private EditText editText1;
        private EditText editText2;
        private EditText editText3;
        private Button button;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       editText1=(EditText) findViewById(R.id.editText1);
       editText2=(EditText) findViewById(R.id.editText2);
       editText3=(EditText) findViewById(R.id.editText3);
       textView=(TextView)  findViewById(R.id.textView);
    }
    public void evaluar (View view){

        String primerCal= editText1.getText().toString();
        String segundoCal= editText2.getText().toString();
        String terceraCal= editText3.getText().toString();

        int calificacion1=Integer.parseInt(primerCal);
        int calificacion2=Integer.parseInt(segundoCal);
        int calificacion3=Integer.parseInt(terceraCal);

        int promedio = (calificacion1+calificacion2+calificacion3)/3;

        if (promedio >=6){

            textView.setText("Aprobo con"+promedio);

        } else if  (promedio<=3){

            textView.setText("Reprobo con"+promedio);
        }



    }
}