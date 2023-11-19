package com.example.convenientshift.ui.task

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.convenientshift.data.Task
import com.example.convenientshift.databinding.ViewholderTaskBinding

class TaskAdapter(val list: List<Task>) : RecyclerView.Adapter<TaskViewItem>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewItem {
        val binding = ViewholderTaskBinding.inflate(LayoutInflater.from(parent.context))
        return TaskViewItem(binding)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: TaskViewItem, position: Int) {
        holder.bind(list[position])
    }
}

class TaskViewItem(val binding: ViewholderTaskBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(task: Task) {
    }
}