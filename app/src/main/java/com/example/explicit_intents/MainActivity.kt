package com.example.explicit_intents

import android.content.Intent
import android.graphics.Camera
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIntent= findViewById<Button>(R.id.button2)
        val webButton= findViewById<Button>(R.id.button3)
        val CameraButton= findViewById<Button>(R.id.button4)

        btnIntent.setOnClickListener {
            intent= Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }
        webButton.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://harimohanrai.wordpress.com/")
            startActivity(intent)
        }

        CameraButton.setOnClickListener {
            val intent= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}