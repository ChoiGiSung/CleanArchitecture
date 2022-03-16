package com.clean.architecture.chapter7

class HourReporter(
    override var workTime: Int
) : EmployeeData(workTime) {

    fun reportHours(){}
}