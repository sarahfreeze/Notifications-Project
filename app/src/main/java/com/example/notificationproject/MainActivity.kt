package com.example.notificationproject

import android.app.*
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RemoteViews
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationManagerCompat
import com.example.notificationproject.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_notify.setOnClickListener {
            //creates intent to start the service
            val intent = Intent(this,MyService::class.java).also { intent ->
                intent.putExtra("key1", "btn_notify")
                startService(intent)
            }

       }

        btn_notify2.setOnClickListener {
            //creates intent to start the service
            val intent2 = Intent(this,MyService::class.java).also { intent2 ->
                intent2.putExtra("key2", "btn_notify2")
                startService(intent2)
            }
        }
    }
}
