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
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener

class TaskFragment : Fragment() {
    private lateinit var viewModel: TaskViewModel
    private lateinit var binding: FragmentTaskBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this)[TaskViewModel::class.java]
        binding = FragmentTaskBinding.inflate(inflater, container, false)
        binding.tab.selectTab(binding.tab.getTabAt(viewModel.position))
        binding.tab.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> {
                        viewModel.position = 0
                        binding.fragmentContainerView.findNavController().navigate(R.id.action_historyTasksFragment_to_newTasksFragment)
                    }
                    1 -> {
                        viewModel.position = 1
                        binding.fragmentContainerView.findNavController().navigate(R.id.action_newTasksFragment_to_historyTasksFragment)
                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })

        return binding.root
    }
}