package com.example.lab_week_05

import android.widget.ImageView
import com.bumptech.glide.Glide

class ImageLoader(private val activity: MainActivity) {

    fun loadImage(imageUrl: String, imageView: ImageView) {
        Glide.with(activity)
            .load(imageUrl)
            .centerCrop()
            .into(imageView)
    }
}
