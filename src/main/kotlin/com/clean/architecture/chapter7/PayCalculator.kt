package com.clean.architecture.chapter7

class PayCalculator(
    override var workTime: Int
) : EmployeeData(workTime) {

    fun calculatePay(){}
}