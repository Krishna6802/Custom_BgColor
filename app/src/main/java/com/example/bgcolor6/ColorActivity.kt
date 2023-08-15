package com.example.bgcolor6

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_color.*

class ColorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)

        btnSet.setOnClickListener()
        {
            var i = Intent()
            if(rdPink.isChecked)
            {
                i.putExtra("Color","pink")
            }
            else if(rdBlue.isChecked)
            {
                i.putExtra("Color","blue")
            }
            else if(rdGreen.isChecked)
            {
                i.putExtra("Color","green")
            }
            setResult(Activity.RESULT_OK,i)
            finish()
        }
    }
}
