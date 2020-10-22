package com.sinanercetin.sayacprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //abstract class
        // 15 sn ve 1 sn 1 sn aşağıya doğru sayıyor
        object : CountDownTimer(15000, 1000)  {
            override fun onTick(p0: Long) {
                textView.text = "Kalan : ${p0 / 1000}" // burada p0 milisaniye cinsinden olduğu için 1000 böldük
            }

            override fun onFinish() {
                textView.text="Süre Bitti Baboli"
            }

        }.start()

    }
}