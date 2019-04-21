package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() { // AppCompatActivity 상속

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // 오버라이드 시 반드시 부모 클래스의 생성자를 호출 할 것
        setContentView(R.layout.activity_main)

        clickButton.setOnClickListener{
            textView.text = "버튼을 눌렀습니다"
        }
    }
}
