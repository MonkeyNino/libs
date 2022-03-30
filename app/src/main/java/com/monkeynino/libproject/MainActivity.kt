package com.monkeynino.libproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.monkeynino.utilslibrary.Mlog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn).setOnClickListener {
            Mlog.e("测试显示效果")
        }
    }
}