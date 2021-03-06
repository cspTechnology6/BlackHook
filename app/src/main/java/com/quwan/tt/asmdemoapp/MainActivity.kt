package com.quwan.tt.asmdemoapp

import android.content.Intent
import android.content.res.Resources
import android.os.AsyncTask
import android.os.Build
import android.os.Bundle
import android.os.HandlerThread
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi


class MainActivity : BaseActivity() {

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView: ImageView =findViewById(R.id.iv)
        imageView.setImageDrawable(getDrawable(R.drawable.ic_launcher_background))
        println("====>imageView:${ resources.getResourceEntryName(imageView.id)}")
        println("====>tv:${ findViewById<TextView>(R.id.tv).toString()}")
        Thread()
        object : AsyncTask<Void?, Void?, Void?>() {
            override fun doInBackground(vararg params: Void?): Void? {
                return null
            }

        }.execute()
        Thread()
        Thread()
        HandlerThread("test")
//        A().test()
        val startIntent = Intent(this, TestService::class.java)
        startService(startIntent)
    }



}