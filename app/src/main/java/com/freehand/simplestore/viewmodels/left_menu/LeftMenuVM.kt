package com.freehand.simplestore.viewmodels.left_menu

import com.freehand.base_component.core.view_model.BaseViewModel
import com.freehand.simplestore.BR
import com.freehand.simplestore.R

class LeftMenuVM : BaseViewModel() {
    override fun defineVariableID(): Int {
        return BR.vm
    }

    override fun defineLayoutDefault(): Int {
        return R.layout.frg_left_menu
    }
}