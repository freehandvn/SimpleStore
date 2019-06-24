package com.freehand.simplestore.utils

import android.view.View
import android.widget.Toast

/**
 * Created by minhpham on 6/24/19.
 * Purpose: .
 * Copyright © 2019 Pham Duy Minh. All rights reserved.
 */
fun <T : View> T.toast(message: String): Toast {
    return Toast.makeText(context, message, Toast.LENGTH_SHORT).apply { show() }
}