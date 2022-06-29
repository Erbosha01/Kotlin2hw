package com.geektech.kotlin2hw.extensions

import android.content.Context
import android.widget.Toast
import com.bumptech.glide.Glide

fun Context.makeToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

