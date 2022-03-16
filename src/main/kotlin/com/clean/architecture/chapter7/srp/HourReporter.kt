package com.clean.architecture.chapter7.srp

class HourReporter(
    override var workTime: Int
) : EmployeeData(workTime) {

    fun reportHours(){}
}