# 根据菜鸟教程总结的部分知识点
#### 修饰符
<p>
    scala 的修饰符private protected 和 public 和 java 里的作用范围不一样 , private 只能在类的内部使用 , protected 可以在子类中使用 , public 都可以使用
</p>

### 判断语句
if else 和 java中基本类似 , 但是可以写成一行表达式 , 详情见 ConditionalStatements
### 循环语句
scala 中循环条件 , while , do .. while 和 for 循环
### 函数
Scala 有函数和方法 , 二者在语义上的区别很小 . Scala 方法是类的一部分 , 而函数是一个对象可以赋值给一个变量 . 换句话来说在类中定义的函数即是方法 . 等号在没有返回值的时候可以省略 , 返回类型在不是递归的时候可以省略. 具体的内容看 Function Obj
### 闭包
此处是在函数内部调用函数外的参数
### 数组
数组 Array 是不可变的 , ArrayBuffer 是可变的
### 集合
集合包含 : List Set Map Tuple
### 迭代器
Iterator 和 java 里的迭代器类似
### 类和对象
类是对象的抽象 , 而对象是类的具体实例 . 类是抽象的 , 不占内存的 , 而对象是具体的 , 占用存储空间
### 特征
trait 类似于 java 的接口 , 准确的说类似于新版的 java 接口 ，可以写方法的具体实现
### 模式匹配
math { case } 类似于 switch case , 注意 在一些操作中直接使用 case (x) => x 也是利用了模式表达式
### 正则表达式
### 异常处理
### 提取器
Apply 和 Unapply
### 文件 I/O