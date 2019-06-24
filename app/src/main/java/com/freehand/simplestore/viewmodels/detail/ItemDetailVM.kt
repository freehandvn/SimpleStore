package com.freehand.simplestore.viewmodels.detail

import com.freehand.base_component.core.view_model.BaseViewModel
import com.freehand.simplestore.BR
import com.freehand.simplestore.R

class ItemDetailVM : BaseViewModel() {
    override fun defineVariableID(): Int {
        return BR.vm
    }

    override fun defineLayoutDefault(): Int {
        return R.layout.frg_item_detail
    }
}