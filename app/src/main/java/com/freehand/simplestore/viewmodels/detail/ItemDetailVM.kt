package com.freehand.simplestore.viewmodels.detail

import android.databinding.Bindable
import com.freehand.base_component.core.view_model.BaseViewModel
import com.freehand.simplestore.BR
import com.freehand.simplestore.R
import com.freehand.simplestore.data.IItemDetail

class ItemDetailVM : BaseViewModel() {

    public var item : IItemDetail? = null
    @Bindable get
    set(value) {
        field = value
        notifyPropertyChanged(BR.item)
    }

    override fun defineVariableID(): Int {
        return BR.vm
    }

    override fun defineLayoutDefault(): Int {
        return R.layout.frg_item_detail
    }

}