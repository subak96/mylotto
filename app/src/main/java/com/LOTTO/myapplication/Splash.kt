package com.LOTTO.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //일정 시간 지연 이후 실행하기 위한 코드
        Handler(Looper.getMainLooper()).postDelayed(
            {
                //일정 시간후 메인 엑티비티로 이동
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
        },1000)//1초 이후 실행
    }
}