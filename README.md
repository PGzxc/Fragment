# Fragment的两种加载方式

- 静态加载
 1. 创建一个Layout文件，就是我们的Fragment的UI界面
 2. 创建一个类继承Fragment，然后重写里面的onCreateView方法，将Fragment的Layout变成View
 3. 在Layout布局文件中声明fragment，android:name属性里是我们上面创建的类，另外，fragment必须用id或tag作为唯一标识

- 动态加载
 通过FragmentManager.beginTransaction()我们可以开始一个事务。在事务中，我们可以对Fragment进行的操作以及对应的方法如下：  
 添加：add()  
 移除：remove()  
 替换：replace()  
 提交事务：commit()

