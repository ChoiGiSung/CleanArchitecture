package com.clean.architecture.chapter7.isp

class User2(
    private val ops: Ops2 = Ops()
) {

    fun op2() {
        ops.op2()
    }
}