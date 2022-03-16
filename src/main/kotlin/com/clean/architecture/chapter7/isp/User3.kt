package com.clean.architecture.chapter7.isp

class User3(
    private val ops: Ops3 = Ops()
) {

    fun op3(){
        ops.op3()
    }
}