package com.clean.architecture.chapter7.dip

class ServiceFactoryImpl : ServiceFactory {
    override fun makeService(): Service{
        return ConcreteImpl();
    }
}