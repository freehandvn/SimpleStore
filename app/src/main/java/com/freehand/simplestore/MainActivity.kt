package com.freehand.simplestore

import android.support.v4.widget.DrawerLayout
import com.freehand.base_component.core.activity.BaseDrawerActivity
import com.freehand.simplestore.fragments.home.FrgHome
import com.freehand.simplestore.fragments.left_menu.FrgLeftMenu

class MainActivity : BaseDrawerActivity() {

    override fun defineLayout() = R.layout.activity_main

    override fun getFragmentContainerResId() = R.id.rl_main_container

    override fun defineLeftMenuContainId() = R.id.fl_left_menu

    override fun getDrawer() = findViewById<DrawerLayout>(R.id.draw_layout)

    override fun initView() {
        super.initView()
        //TODO add left menu here
        replaceLeftMenu(FrgLeftMenu())
        pushFrg(FrgHome(), true)
    }
}