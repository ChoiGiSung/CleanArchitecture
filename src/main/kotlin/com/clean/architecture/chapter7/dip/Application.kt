package com.clean.architecture.chapter7.dip

class Application(
    private val serviceFactory: ServiceFactory
) {
    private var service:Service = serviceFactory.makeService()
}