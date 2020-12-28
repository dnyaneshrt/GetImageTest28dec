package com.tech.getimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    var btn: Button?=null
    var img: ImageView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       init()

        btn?.setOnClickListener {
           img?.setImageResource(R.drawable.imagetest)
        }
    }

    private fun init() {
        btn=findViewById(R.id.btn_get_image)
        img=findViewById(R.id.imageView)
    }
}