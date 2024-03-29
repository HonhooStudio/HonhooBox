package com.honhoo.honhooboxcore.utils

import java.lang.reflect.Proxy

class JavaDynamicProxy {


    private fun proxy(classLoader: ClassLoader,interfaceArray:Array<Class<Any?>?>?){
        Proxy.newProxyInstance(classLoader,interfaceArray
        ) {
          proxy, method, args ->


        }
    }



}