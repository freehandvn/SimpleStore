package com.freehand.simplestore.viewmodels.home

import com.freehand.base_component.stateful.BaseStateVM
import com.freehand.simplestore.BR
import com.freehand.simplestore.R
import kotlinx.android.synthetic.main.view_home.view.*

class HomeVM : BaseStateVM() {

    init {
        val banner = BannerVM()
        addBinding(banner, banner.layoutID, banner.variableID, R.id.fm_banner, true)
        val category = CategoryVM()
        addBinding(category,category.layoutID,category.variableID,R.id.fm_list,true)
    }

    override fun getAllState(): IntArray {
        return IntArray(0) //To change body of created functions use File | Settings | File Templates.
    }

    override fun defineVariableID(): Int {
        return BR.vm
    }

    override fun defineLayoutDefault(): Int {
        return R.layout.view_home
    }
}