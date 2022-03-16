package com.clean.architecture.chapter7.srp

class EmployeeFacade(
    private val payCalculator : PayCalculator,
    private val hourReporter : HourReporter,
    private val employeeSaver : EmployeeSaver
)

{
    fun calculatePay(){
        payCalculator.calculatePay()
    }

    fun reportHours(){
        hourReporter.reportHours()
    }

    fun saveEmployee(){
        employeeSaver.saveEmployee()
    }
}