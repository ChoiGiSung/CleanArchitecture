package com.clean.architecture.chapter7

class Employee(
    private val employeeFacade: EmployeeFacade
) {

    fun calculatePay(){
        employeeFacade.calculatePay()
    }

    fun hourReporter(){
        employeeFacade.reportHours()
    }

    fun saveEmployee(){
        employeeFacade.saveEmployee()
    }
}