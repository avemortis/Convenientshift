package com.example.convenientshift.ui.history_tasks

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.convenientshift.R

class HistoryTasksFragment : Fragment() {

    companion object {
        fun newInstance() = HistoryTasksFragment()
    }

    private lateinit var viewModel: HistoryTasksViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_history_tasks, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HistoryTasksViewModel::class.java)
        // TODO: Use the ViewModel
    }

}