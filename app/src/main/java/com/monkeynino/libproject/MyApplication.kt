package com.monkeynino.libproject

import android.app.Application
import com.monkeynino.utilslibrary.Mlog

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
//        Mlog.isDebug = false
    }
}