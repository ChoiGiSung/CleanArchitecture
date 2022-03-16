package com.clean.architecture.chapter7.srp

class PayCalculator(
    override var workTime: Int
) : EmployeeData(workTime) {

    fun calculatePay(){}
}