package com.freehand.simplestore.fragments.left_menu

import com.freehand.base_component.core.fragment.BaseFragmentBinding
import com.freehand.simplestore.viewmodels.left_menu.LeftMenuVM

class FrgLeftMenu : BaseFragmentBinding<LeftMenuVM>() {
    override fun onCreateViewModel(): LeftMenuVM {
        return LeftMenuVM()
    }
}