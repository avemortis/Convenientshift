package com.example.convenientshift.ui.new_tasks

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.convenientshift.R

class NewTasksFragment : Fragment() {

    companion object {
        fun newInstance() = NewTasksFragment()
    }

    private lateinit var viewModel: NewTasksViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_new_tasks, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[NewTasksViewModel::class.java]
        // TODO: Use the ViewModel
    }

}