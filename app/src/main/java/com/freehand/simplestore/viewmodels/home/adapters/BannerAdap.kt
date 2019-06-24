package com.freehand.simplestore.viewmodels.home.adapters

import android.support.v7.widget.RecyclerView
import android.view.View
import com.freehand.base_component.core.recycle.BaseRecyclerAdapter
import com.freehand.simplestore.R
import com.freehand.simplestore.data.IItem
import com.freehand.simplestore.utils.load
import kotlinx.android.synthetic.main.item_banner.view.*

class BannerAdap : BaseRecyclerAdapter<IItem, BannerAdap.Holder>() {
    override fun CreateHolder(view: View?, viewType: Int): Holder {
        return Holder(view!!) //To change body of created functions use File | Settings | File Templates.
    }

    override fun defineItemLayout(viewType: Int): Int {
        return R.layout.item_banner //To change body of created functions use File | Settings | File Templates.
    }

    override fun bindData(holder: Holder?, position: Int) {
        holder?.name?.text = getItem(position).getName()
        holder?.banner?.load(getItem(position).getUrl())
    }

    class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.tx_name
        val banner = itemView.iv_banner
    }
}