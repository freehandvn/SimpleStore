package com.freehand.simplestore.viewmodels.home

import com.freehand.base_component.core.view_model.BaseViewModel
import com.freehand.simplestore.BR
import com.freehand.simplestore.R
import com.freehand.simplestore.viewmodels.home.adapters.BannerAdap
import android.content.Context
import android.support.v7.widget.RecyclerView
import com.freehand.base_component.core.inteface.IListVM
import com.freehand.base_component.core.recycle.OnItemListener
import com.freehand.simplestore.data.IItem

class BannerVM : BaseViewModel(), IListVM<IItem, BannerAdap> {
    override fun getAdapter(): BannerAdap {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLayoutManager(context: Context?): RecyclerView.LayoutManager {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getOnItemListener(): OnItemListener<IItem> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun defineVariableID(): Int {
        return BR.vm
    }

    override fun defineLayoutDefault(): Int {
        return R.layout.view_banner
    }
}