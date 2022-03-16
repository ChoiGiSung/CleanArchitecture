package com.clean.architecture.chapter7.srp

class EmployeeSaver(
    override var workTime: Int
) : EmployeeData(workTime) {

    fun saveEmployee(){}
}