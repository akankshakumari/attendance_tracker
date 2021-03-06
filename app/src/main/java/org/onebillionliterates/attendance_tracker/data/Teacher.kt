package org.onebillionliterates.attendance_tracker.data

import org.threeten.bp.LocalDateTime

data class Teacher (
    val id: String? = null,
    val adminRef: String,
    val mobileNumber: String? = null,
    val name: String? = null,
    val passCode: String? = null,
    val remarks: String? = null,
    val createdAt: LocalDateTime? = null
)
