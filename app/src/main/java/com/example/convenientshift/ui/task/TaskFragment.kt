package com.example.convenientshift.ui.task

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.convenientshift.R
import com.example.convenientshift.databinding.FragmentTaskBinding
import com.example.convenientshift.ui.schedule.ScheduleFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener

class TaskFragment : Fragment() {
    private lateinit var viewModel: TaskViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this)[TaskViewModel::class.java]
        val binding = FragmentTaskBinding.inflate(inflater, container, false)
       /* binding.tab.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> binding.fragmentContainerView.findNavController().navigate(R.id.newTasksFragment)
                    1 -> binding.fragmentContainerView.findNavController().navigate(R.id.historyTasksFragment)
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })*/
        return binding.root
    }
}