package com.freehand.simplestore.utils

import android.databinding.BindingAdapter
import android.graphics.PorterDuff
import android.support.v7.widget.PagerSnapHelper
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.freehand.base_component.core.view_model.BaseViewModel
import com.freehand.base_component.core.utils.ViewUtils.encreaseTouch
import com.freehand.base_component.core.utils.ViewUtils.clickableEffect


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

@BindingAdapter("pagerEffect")
fun pagerEffect(view: RecyclerView, vm: BaseViewModel) {
    val effect = PagerSnapHelper()
    effect.attachToRecyclerView(view)
}

@BindingAdapter("clickEffect")
fun setActivated(view: View, vm: BaseViewModel) {
    clickableEffect(view)
    encreaseTouch(view, 10)
}

@BindingAdapter("image")
fun loadImage(view: ImageView, url: String) {
    view.load(url)
}

