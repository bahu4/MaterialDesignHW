package com.example.materialdesignhw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_start.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enterBtn.setOnClickListener {
            val i = Intent(this,TabActivity::class.java)
            startActivity(i)
        }
    }
}