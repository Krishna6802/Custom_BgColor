package com.example.bgcolor6

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val COLOR_ACTIVITY = 2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCng.setOnClickListener()
        {
            var intent = Intent(this, ColorActivity::class.java)
            startActivityForResult(intent, COLOR_ACTIVITY)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == COLOR_ACTIVITY)
        {
            if(resultCode == Activity.RESULT_OK)
            {
                var c = data?.getStringExtra("Color");
                if(c == "pink") {
                    Layout1.setBackgroundColor(resources.getColor(R.color.LightPink))
                }
                else if(c == "blue") {
                    Layout1.setBackgroundColor(resources.getColor(R.color.LightBlue))
                }
                else if(c == "green") {
                    Layout1.setBackgroundColor(resources.getColor(R.color.LightGreen))
                }
            }
        }
    }
}
