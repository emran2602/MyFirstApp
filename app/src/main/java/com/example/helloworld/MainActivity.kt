package com.example.helloworld

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

// kotlin file handles user interaction
class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // show the layout file: activity main
        setContentView(R.layout.activity_main)
        // user can tap button to change the text colour of the label
        // add a button to our layout
        // set up logic to know when user has tapped on button
        // get reference to button
        findViewById<Button>(R.id.button).setOnClickListener{
            // handle button tap
            // change the colour of the text
            Log.i("Emran","Tapped on button")
            // get reference to text view and then set colour
            findViewById<TextView>(R.id.textView).setTextColor(resources.getColor(R.color.black))

        }
        findViewById<Button>(R.id.button2).setOnClickListener{
            Log.i("Ranee","Changed background colour")
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(R.color.teal_700)


    }
    }
}
