package com.dm.tutorialseekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                //inserire qui il codice che deve essere eseguito quando si sposta il cursore
                textView.text = progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                //inserire qui il codice che deve essere eseguito quando si inizia a
                //spostare il cursore
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                //inserire qui il codice che deve essere eseguito quando si finisce di
                //spostare il cursore
            }
        })
        }
    }
