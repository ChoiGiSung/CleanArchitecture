package com.clean.architecture.chapter7.dip

open interface ServiceFactory {
    fun makeService():Service
}