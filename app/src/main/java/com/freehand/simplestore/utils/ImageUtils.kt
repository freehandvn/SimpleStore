package com.freehand.simplestore.utils

import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * Created by minhpham on 6/23/19.
 * Purpose: .
 * Copyright © 2019 Pham Duy Minh. All rights reserved.
 */
fun <T : ImageView> T.load(url:Any):T {
    when(url){
        is Int -> this.setImageResource(url)
        is String -> Glide.with(this).load(url).into(this)
    }
    return this
}