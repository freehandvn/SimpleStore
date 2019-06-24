package com.freehand.simplestore.viewmodels.home

import com.freehand.base_component.stateful.BaseStateVM
import com.freehand.simplestore.BR
import com.freehand.simplestore.R

class HomeVM : BaseStateVM() {

    init {
        val banner = BannerVM()
        addBinding(banner, banner.layoutID, banner.variableID, R.id.fm_banner, true)
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