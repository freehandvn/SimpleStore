package com.freehand.simplestore.utils

import android.databinding.BindingAdapter
import android.graphics.PorterDuff
import android.widget.TextView


/**
 * Created by minhpham on 6/20/19.
 * Purpose: .
 * Copyright © 2019 Pham Duy Minh. All rights reserved.
 */
@BindingAdapter("textDrawableTint")
fun textDrawableTint(text: TextView, color: Int) {
    val drawables = text.compoundDrawables
    if (drawables[0] != null) {  // left drawable
        drawables[0].setColorFilter(color, PorterDuff.Mode.MULTIPLY)
    }
}