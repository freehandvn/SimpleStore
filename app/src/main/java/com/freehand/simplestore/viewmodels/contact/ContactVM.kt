package com.freehand.simplestore.viewmodels.contact

import com.freehand.base_component.core.view_model.BaseViewModel
import com.freehand.simplestore.BR
import com.freehand.simplestore.R

class ContactVM : BaseViewModel() {
    override fun defineVariableID(): Int {
        return BR.vm
    }

    override fun defineLayoutDefault(): Int {
        return R.layout.frg_contact
    }
}