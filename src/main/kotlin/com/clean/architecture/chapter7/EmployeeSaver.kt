package com.clean.architecture.chapter7

class EmployeeSaver(
    override var workTime: Int
) : EmployeeData(workTime) {

    fun saveEmployee(){}
}