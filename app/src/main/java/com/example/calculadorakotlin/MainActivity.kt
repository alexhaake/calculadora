package com.example.calculadorakotlin

import android.os.Build
import android.os.Bundle
import android.util.Half
import android.util.Half.toFloat
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity() : AppCompatActivity() , View.OnClickListener {
    //numeros
    var cero : Button?=null;
    var uno : Button?=null;
    var dos : Button?=null;
    var tres : Button?=null;
    var cuatro : Button?=null;
    var cinco : Button?=null;
    var seis : Button?=null;
    var siete : Button?=null;
    var ocho : Button?=null;
    var nueve : Button?=null;
    //caracteres
    var suma : Button?=null;
    var resta : Button?=null;
    var multiplicacion : Button?=null;
    var division : Button?=null;
    var punto : Button?=null;
    var igual : Button?=null;
    var borrar : Button?=null;
    var borrarT : Button?=null;
    //texto
    var texto : TextView?=null;
    var texto2 : TextView?=null;
    var resultado: String="";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cero= findViewById(R.id.cero);
        uno= findViewById(R.id.uno);
        dos= findViewById(R.id.dos);
        tres= findViewById(R.id.tres);
        cuatro= findViewById(R.id.cuatro);
        cinco= findViewById(R.id.cinco);
        seis= findViewById(R.id.seis);
        siete= findViewById(R.id.siete);
        ocho= findViewById(R.id.ocho);
        nueve= findViewById(R.id.nueve);
        //
        suma= findViewById(R.id.suma);
        resta= findViewById(R.id.resta);
        multiplicacion= findViewById(R.id.multiplica);
        division= findViewById(R.id.divide);
        punto= findViewById(R.id.punto);
        igual= findViewById(R.id.igual);
        borrarT= findViewById(R.id.borrarT);
        borrar= findViewById(R.id.borrar2);

        uno!!.setOnClickListener(this);
        dos!!.setOnClickListener(this);
        tres!!.setOnClickListener(this);
        cuatro!!.setOnClickListener(this);
        cinco!!.setOnClickListener(this);
        seis!!.setOnClickListener(this);
        siete!!.setOnClickListener(this);
        ocho!!.setOnClickListener(this);
        nueve!!.setOnClickListener(this);

        suma!!.setOnClickListener(this);
        resta!!.setOnClickListener(this);
        multiplicacion!!.setOnClickListener(this);
        division!!.setOnClickListener(this);
        punto!!.setOnClickListener(this);
        igual!!.setOnClickListener(this);
        borrarT!!.setOnClickListener(this);
        borrar!!.setOnClickListener(this);

        texto = findViewById(R.id.textonumeros);
        texto2 = findViewById(R.id.textonumeros2);
    }
 



    fun suma(cadena: String){
        var delimitador = "+";
        var part = cadena.split(delimitador);
        var res = 0f;
        var position = 0;
        for (i in part.indices) {
        var partes: Float = part[i].toFloat();
             res =res +partes;
        }

        textonumeros2.setText(res.toString());
    }
    fun resta(cadena: String){
        var delimitador = "-";
        var part = cadena.split(delimitador);
        var res = 0f;
        var position = 0;
        for (i in part.indices) {
            var partes: Float = part[i].toFloat();
            res =partes-res;
        }

        textonumeros2.setText(res.toString());
    }

    fun multiplica(cadena: String){
        var delimitador = "*";
        var part = cadena.split(delimitador);
        var result:Float = 1.0f
        var partes:Float =0f ;
        for(i in 1..part.size){
             partes = part[i-1].toFloat();
             result = result*partes;}
        textonumeros2.setText(result.toString());
    }
    fun diivide(cadena: String){
        var delimitador = "/";
        var part = cadena.split(delimitador);
        var result:Float = part[0].toFloat();
        var partes:Float =0f ;
        var logitud:Int = part.size-1;
        for(i in 1..logitud){
            partes = part[i].toFloat();
            result = result/partes;}
        textonumeros2.setText(result.toString());
    }
    fun divide(cadena: String){
        var delimitador = "*";
        var part = cadena.split(delimitador);
        var res = part[0].toFloat();
        var position = 0;
        //  for (i in part.indices) {
        var partes: Float = part[1].toFloat();
        res =res/partes;
        // }
        textonumeros2.setText(res.toString());
    }
    fun  borrarchar(c:String) {
        if (c == null || c.length == 0) {
            resultado=c;
        }
       resultado=c.substring(0, c.length-1);
    }

    fun sum(a: Double, b: Double): Double = a + b //suma
    fun rest(a: Double, b: Double): Double = a - b //resta
    fun mult(a: Double, b: Double): Double = a * b //multiplicar
    fun div(a: Double, b: Double): Double = a / b //division
    override fun onClick(v: View?) {

        when(v?.id){
            R.id.cero -> {
                resultado = resultado + cero?.text
                textonumeros.setText(resultado)

            }
            R.id.uno -> {
                resultado = resultado + uno?.text
                textonumeros.setText(resultado)

            }
            R.id.dos -> {
                resultado = resultado + dos?.text
                textonumeros.setText(resultado)

            }
            R.id.tres -> {
                resultado = resultado + tres?.text
                textonumeros.setText(resultado)
            }
            R.id.cuatro -> {
                resultado = resultado + cuatro?.text
                textonumeros.setText(resultado)

            }
            R.id.cinco -> {
                resultado = resultado + cinco?.text
                textonumeros.setText(resultado)

            }
            R.id.seis -> {
                resultado = resultado + seis?.text
                textonumeros.setText(resultado)

            }
            R.id.siete -> {
                resultado = resultado + siete?.text
                textonumeros.setText(resultado)

            }
            R.id.ocho -> {
                resultado = resultado + ocho?.text
                textonumeros.setText(resultado)
            }
            R.id.nueve -> {
                resultado = resultado + nueve?.text
                textonumeros.setText(resultado)
            }
            R.id.suma -> {
                resultado = resultado + suma?.text
                textonumeros.setText(resultado)
                //contar++;
            }

            R.id.resta -> {
                resultado = resultado + resta?.text
                textonumeros.setText(resultado)
                //contar++;
            }

            R.id.multiplica -> {
                resultado = resultado + multiplicacion?.text
                textonumeros.setText(resultado)
                //contar++;
            }

            R.id.divide -> {
                resultado = resultado + division?.text
                textonumeros.setText(resultado)
                //contar++;
            }
            R.id.punto -> {
                resultado = resultado + punto?.text
                textonumeros.setText(resultado)
                contar++;
            }
            R.id.igual -> {
                var par= resultado.split("+","-","*","/");
                

                if(resultado.contains("+")){
                    suma(resultado);
                }
                if(resultado.contains("-")){
                    resta(resultado);
                }
                if(resultado.contains("*")){
                    multiplica(resultado);
                }
                if(resultado.contains("/")){
                    diivide(resultado);
                }

            }
            R.id.borrar2 -> {
                borrarchar(resultado);
                textonumeros.setText(resultado);
            }
            R.id.borrarT -> {
                resultado="";
                textonumeros.setText("");
                textonumeros2.setText("");
            }

        }

    }


}