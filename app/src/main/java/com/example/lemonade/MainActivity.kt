package com.example.lemonade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var count=0
    var squeeze = (1..5).random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Clicking the button
        val lemonadeBtn: Button = findViewById(R.id.button)

        //setting a click listner on the buuton to go to change image
        lemonadeBtn.setOnClickListener {
            if(count==0)
            {
                squeeze = (1..5).random()
                val toast = Toast.makeText(this, "Click ${squeeze} times", Toast.LENGTH_SHORT)
                toast.show()
                val lemonImage: ImageView = findViewById(R.id.imageView)
                lemonImage.setImageResource(R.drawable.lemon)
                lemonImage.contentDescription = getString(R.string.LemonJuice)
                val lemonText: TextView = findViewById(R.id.textView)
                lemonText.text=getString(R.string.LemonJuice)
                count+=1
            }
            else if(count==10)
            {
                val glassImg: ImageView = findViewById(R.id.imageView)
                glassImg.setImageResource(R.drawable.glass)
                glassImg.contentDescription = getString(R.string.glass)
                val glassTxt: TextView = findViewById(R.id.textView)
                glassTxt.text=getString(R.string.glass)
                count+=1
            }
            else if(count==11)
            {
                val initialImg: ImageView = findViewById(R.id.imageView)
                initialImg.setImageResource(R.drawable.lemonselect)
                initialImg.contentDescription = getString(R.string.click_to_select_a_lemonade)
                val initialTxt: TextView = findViewById(R.id.textView)
                initialTxt.text=getString(R.string.click_to_select_a_lemonade)
                count=0
            }
            else
            {
                count+=1
                if((count-1)==squeeze)
                {
                    val lemonadeImg: ImageView = findViewById(R.id.imageView)
                    lemonadeImg.setImageResource(R.drawable.lemonade)
                    lemonadeImg.contentDescription = getString(R.string.Lemonade)
                    val lemonadeTxt: TextView = findViewById(R.id.textView)
                    lemonadeTxt.text=getString(R.string.Lemonade)
                    count=10
                }
            }
    }

    }
}

