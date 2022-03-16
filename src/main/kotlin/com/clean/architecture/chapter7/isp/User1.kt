package com.clean.architecture.chapter7.isp

class User1(
    private val ops: Ops
) {

    fun op1(){
        ops.op1()
    }
}