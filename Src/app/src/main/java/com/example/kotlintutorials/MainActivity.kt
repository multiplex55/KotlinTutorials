package com.example.kotlintutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        doLearningKotlin()
    }

    fun doLearningKotlin()
    {
        //log template
//        Log.d("MULTIPLEX", "")

        /* Intro to basics  */
        /*
        //variable declaration
        //{var/val} {name}: {type} = {value}
        //val is const: cannot be changed, var is changing variable
        var myVar: Int = 5
        //can also write and type inference will work
//        var myVar = 5
//        Log.d("MULTIPLEX", myVar.toString())
        //inline string writing uses $
        Log.d("MULTIPLEX", "Value of myVar is $myVar")

        var myBool : Boolean = true
        //can also be inferenced
//        var myBool = true
         */

        /* LEARNING ARITHMETIC OPERATORS  */
        // + - * / ; / does int division
        // += -= *= /= work as expected
        /*
        val x = 15
        val y = 7
        val res = x + y
        Log.d("MULTIPLEX", "$res")
        Log.d("MULTIPLEX", "inline evaluate: ${x + y}")
         */

        /* Doubles and Floats */
        /*
        //Without the F it uses doubles for decimal numbers
        //        var x = 20F
        //        var y = 8F
        //Examples of double
        var x = 20.123512
        var y = 4.123451
        Log.d("MULTIPLEX", "inline evaluate: ${x / y}")
         */


        /* STRINGS */
        /*
        val myStr = "This is some generic string text to play with"
        Log.d("MULTIPLEX", "String printing ${myStr.uppercase()}")
        */

        /*Logical operators*/
        //Same as C#

        /*If Conditions*/
        //same as C#
        //you can do stuff like this
        val x = 7
        val y = 7
        val z = if(x + y == 14) 3 else 5
        Log.d("MULTIPLEX", "If statements and assignment ${z}")
    }
}