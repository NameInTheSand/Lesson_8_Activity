package com.example.intentandlyfecycle

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		findViewById<TextView>(R.id.tv_activity_title).setOnClickListener {
			val intent = Intent(this, ActivitySecond::class.java)
			val path = Uri.parse("file://sdcard//text.txt")
			val location= Uri.parse("geo:37.422219,-122.08364?z=14")
			val intent2 = Intent(Intent.ACTION_VIEW, location)
			startActivity(intent2)
		}
	}
}