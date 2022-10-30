package com.example.practika16

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






}

    @SuppressLint("SuspiciousIndentation")
    fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        val standardSwitch: Switch = findViewById(R.id.switch1)

            if (isChecked) {
                setTheme(R.style.Theme_Light)
            } else {
                setTheme(R.style.Theme_Dark)
            }


    }


}