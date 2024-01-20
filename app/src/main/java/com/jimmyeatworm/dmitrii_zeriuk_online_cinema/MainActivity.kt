package com.jimmyeatworm.dmitrii_zeriuk_online_cinema

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.appbar.AppBarLayout

import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickToast(view : View){
        val buttonText : String = (view as Button).text.toString()
        Toast.makeText(this, buttonText, Toast.LENGTH_SHORT).show()
    }
}