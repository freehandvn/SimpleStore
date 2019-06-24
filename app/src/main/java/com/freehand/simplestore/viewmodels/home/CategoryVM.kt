package com.freehand.simplestore.viewmodels.home

import com.freehand.base_component.core.view_model.BaseViewModel
import com.freehand.simplestore.BR
import com.freehand.simplestore.R
import com.freehand.simplestore.viewmodels.home.adapters.CategoryAdap
import android.content.Context
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.freehand.base_component.core.inteface.IListVM
import com.freehand.base_component.core.recycle.OnItemListener
import com.freehand.simplestore.data.IItem
import com.freehand.simplestore.data.MockData
import com.freehand.simplestore.utils.toast

class CategoryVM : BaseViewModel(), IListVM<IItem, CategoryAdap> {
    private val adap = CategoryAdap()

    init {
        adap.items = MockData.genCategories(20)
    }

    override fun getAdapter(): CategoryAdap {
        return adap
    }

    override fun getLayoutManager(context: Context?): RecyclerView.LayoutManager {
        return GridLayoutManager(context,1)
    }

    override fun getOnItemListener(): OnItemListener<IItem> {
       return OnItemListener { v, item, position ->
            v.toast("click on item $position")
       }
    }

    override fun defineVariableID(): Int {
        return BR.vm
    }

    override fun defineLayoutDefault(): Int {
        return R.layout.view_category
    }
}