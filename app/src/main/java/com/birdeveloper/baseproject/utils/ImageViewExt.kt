package com.birdeveloper.baseproject.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.birdeveloper.baseproject.R

fun ImageView.loadImage(url: String?) {
    url?.let {
        Glide.with(this)
            .load(url)
            .placeholder(R.drawable.ic_launcher_background)
            .apply(RequestOptions().override(600, 200).fitCenter())
            .into(this)
    }
}