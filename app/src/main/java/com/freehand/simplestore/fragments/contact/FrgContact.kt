package com.freehand.simplestore.fragments.contact

import com.freehand.base_component.core.fragment.BaseFragmentBinding
import com.freehand.simplestore.viewmodels.contact.ContactVM

class FrgContact : BaseFragmentBinding<ContactVM>() {
    override fun onCreateViewModel(): ContactVM {
        return ContactVM()
    }
}