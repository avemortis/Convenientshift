package com.example.convenientshift.data

import java.sql.Time

data class Task(
    val taskName: String,
    val type: TaskType,
    val start: Long,
    val end: Long,
    val stock: String,
    val shiftType: ShiftType,
    val employee: String
)