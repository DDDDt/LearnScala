package com.study.first

import com.study.first.`class`.{Order, Person, TestAbstract1}


/**
  * Created by dt on 17-7-23.
  */
object TestClass extends App{




    val p = new Person("Adam","Meyer","123","456","789")

    p.firstName = "dt"

    p.lastName = "dd"

    p.age = 123

    println(p.userName)

    //无效
//    p.getUserName1

    println(p.age)

    TestObject.write("123");

    val order = new Order(11);

    println(order.crustSIze)

    val testAbstract = new TestAbstract1();

    println(testAbstract)

    //danli
    TestSingleton.open
    TestSingleton.close



}
