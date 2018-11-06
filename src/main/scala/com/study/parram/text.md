# scala 学习使用
### scala 学习第一章
1. val 和 var 声明变量的区别  
    val 声明的变量是不可变的 , 而 var 声明的变量是可变的
2. scala 的数值类型 : Byte Char Short Int Long Float Double Boolean , 和 JAVA 基本类似.
    不同的是 scala 并没有可以区分基本类型和引用类型 , 这之间的转换是 scala 编译器的工作.
     可以使用to*转换为任意类型 .   Unit( 表示无值 , 和其他语言中void等同 . 用作不返回任何结果的方法的结果类型 . Unit 只有一个实例值 , 写成 ())
     Null null 或空引用 Nothing Nothing 类型在Scala的类层级的最低端; 它是任何其他类型的子类型. Any 是所有其他类的超类 
     AnyRef 类是 Scala 里所有引用类( reference class ) 的基类
3. 在 scala 中所有的操作符都是方法 , 如 a+b 就相当于 a.+(b) , 在 scala中通常可以用 a 方法 b 作为 a.方法(b)的简写
