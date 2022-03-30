package com.monkeynino.utilslibrary

import android.util.Log

object Mlog {
    private const val TAG = "Finals"
    // 是否需要打印bug，可以在application的onCreate函数里面初始化
    var isDebug = true


    @JvmStatic
    fun e(tag: String?, msg: String?) {
        if (isDebug) {
            Log.e(tag, msg!!)
        }
    }

    @JvmStatic
    fun e(msg: String?) {
        if (isDebug) {
            Log.e(TAG, msg!!)
        }
    }

    @JvmStatic
    fun i(tag: String?, msg: String?) {
        if (isDebug) {
            Log.i(tag, msg!!)
        }
    }

    @JvmStatic
    fun i(msg: String?) {
        if (isDebug) {
            Log.i(TAG, msg!!)
        }
    }

    @JvmStatic
    fun d(tag: String?, msg: String?) {
        if (isDebug) {
            Log.d(tag, msg!!)
        }
    }

    @JvmStatic
    fun d(msg: String?) {
        if (isDebug) {
            Log.d(TAG, msg!!)
        }
    }

    @JvmStatic
    fun w(tag: String?, msg: String?) {
        if (isDebug) {
            Log.w(tag, msg!!)
        }
    }

    @JvmStatic
    fun w(msg: String?) {
        if (isDebug) {
            Log.w(TAG, msg!!)
        }
    }

    @JvmStatic
    fun v(tag: String?, msg: String?) {
        if (isDebug) {
            Log.v(tag, msg!!)
        }
    }

    @JvmStatic
    fun v(msg: String?) {
        if (isDebug) {
            Log.v(TAG, msg!!)
        }
    }

    fun i_Long(tag: String, msg: String) {  //信息太长,分段打印

        //因为String的length是字符数量不是字节数量所以为了防止中文字符过多，

        //  把4*1024的MAX字节打印长度改为2001字符数
        var msg = msg
        val max_str_length = 2001 - tag.length

        //大于4000时
        while (msg.length > max_str_length) {
            Log.i(tag, msg.substring(0, max_str_length))
            msg = msg.substring(max_str_length)
        }

        //剩余部分
        Log.i(tag, msg)
    }
}