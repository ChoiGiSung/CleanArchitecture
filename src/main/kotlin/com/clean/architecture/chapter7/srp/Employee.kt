package com.clean.architecture.chapter7.srp

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