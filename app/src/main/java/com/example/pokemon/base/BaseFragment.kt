package com.example.pokemon.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VM : ViewModel, VB : ViewBinding>(
    @LayoutRes layoutId: Int) : Fragment(layoutId) {

    abstract val binding : VB
    abstract val viewModel: VM

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupListeners()
        setupSubscribes()
        setupRequests()
        setupObserve()
    }

    protected open fun setupObserve() {}

    protected open fun initialize() {}

    protected open fun setupListeners() {}

    protected open fun setupSubscribes() {}

    protected open fun setupRequests() {}
}