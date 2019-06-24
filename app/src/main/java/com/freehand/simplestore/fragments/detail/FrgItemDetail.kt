package com.freehand.simplestore.fragments.detail

import com.freehand.base_component.core.fragment.BaseFragmentBinding
import com.freehand.simplestore.viewmodels.detail.ItemDetailVM

class FrgItemDetail : BaseFragmentBinding<ItemDetailVM>() {
    override fun onCreateViewModel(): ItemDetailVM {
        return ItemDetailVM()
    }
}