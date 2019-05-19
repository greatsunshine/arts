2019年5月19日 第三周
* Algorithm：leetcode第101题https://github.com/greatsunshine/arts/blob/master/src/main/java/leetcode/Test101.java
* Review：http://www.cs.umd.edu/~pugh/java/memoryModel/jsr-133-faq.html#finalWrong  讲述java内存模型中的一些问题
* Tips：学习java并发中的互斥锁，线程安全性问题，性能问题
* 存在共享数据并且该数据会发生变化，就是有多个线程会同时读写同一个数据。
  竞态条件，指的是程序的执行结果依赖线程执行的顺序。
  面对数据竞争和竞态条件，如何保证线程的安全性呢？ 使用互斥实现
* Share：https://blog.csdn.net/sunfeizhi/article/details/51926396 基于zk的分布式锁实现