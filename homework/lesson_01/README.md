## Lesson_01 作业

## 预习

### 继承，封装，多态

- **封装**
    - 封装是把客观事物封装成抽象的类，并且类可以把自己的数据和方法只对让可信的类或对象操作，对不可信的类或对象隐藏信息。
- **继承**
    - 继承是指一张能力：他可以使用现有类的所有功能，并在无须重新编写原来类的情况下对这些类进行拓展。
- **多态**
    - 指为不同数据类型的实体提供统一的接口。
    - Java中多态就是同一个操作作用于不同的对象，可以有不同的解释，产生不同的执行结果。
    - 三个条件：
        - 有类继承或者接口实现
        - 子类要重写夫类的方法
        - 父类的引用指向子类的对象

### this和super

- **this**
    - this代表着当前对象的引用，this代表的是执行者，this本质是一个执行当前对象的指针。
- **super**
    - super可以理解为“父类的”，super可以在子类中调用父类的属性，方法，构造器，super关键字和this一样能省就省，super在java的子类中指代父类引用
- **注意**
    - 1、this和super很像，this指向的是当前对象的调用，super指向的是当前调用对象的父类
    - 2、类加载完毕，创建对象，父类的构造方法会被调用

### Java的基本包装类

| 基本数据类型 | 描述                                                         | 默认值         | 包装数据类型 |
| ------------ | ------------------------------------------------------------ | -------------- | ------------ |
| byte         | 占用一个字节，范围是-2^7~2^7-1，-128~127；                   | 0              | Byte         |
| short        | 占用两个字节，范围是-2^15~2^15-1，-32768~32767；             | 0              | Short        |
| int          | 占用四个字节，范围是-2^31~2^31-1，2147483647,-2147483648     | 0              | Integer      |
| long         | 占用八个字节，范围是-2^63~2^63-1，                           | 0L             | Long         |
| float        | 4字节 大约±3.402 823 47E+38F （有效位数为6~7位），**没有后缀F的浮点数值（如3.14）默认为double类型**，当然，也可以在浮点数值后面添加后缀D或的（例如，3.14D）。 | 0.0f           | Float        |
| double       | 8字节 大约±1.797 693 134 862 315 70E+308（有效位数为15位）。double表示这种类型的数值[精度](https://so.csdn.net/so/search?q=精度&spm=1001.2101.3001.7020)是float类型的两倍（有人称之为双精度数值）。绝大部分应用程序都采用double类型。在很多情况下，float类型的精度很难满足需求 | 0.0d           | Double       |
| char         | 2字节，16位。char在java中是16位，用于存放单个字符。用单引号【' '】括住，'A';表示一个字符，"A"表示一个字符串，即一个字符序列 | '/uoooo'(null) | Character    |
| boolean      | 变量存储为1 个字节，只能是 True 或是 False                   | false          | Boolean      |

- **包装类的意义**
  - 因为Java是面向对象的编程语言，所有很多地方都不是用的基本数据类型，比如集合要求的是Object类型。
  - 为了让基本数据类型也具有对象的特征，就出现了包装类，具备了对象的性质，并且为其添加了属性和方法，丰富了基本类型的操作。
  - 自动装箱和自动拆箱有效解决了基本数据类型和包装类的转换。





### 预习作业

```java
String str = "123";  // 在字符串常量池查找->没有，创建一个“123”字符串常量并放到池子里面，返回对象引用
String str1 = "123"; // 在字符串常量池查找->有，直接返回对象引用
String str2 = new String("123"); // 这里在堆里面创建了一个新对象 和常量池无关
System.out.println(str == str1); // 两个都是指向常量池中的字符串常量“123”，“==“判断的是对象引用，true
System.out.println(str == str2); // str为常量池中的“123”，str2是对里面的对象“123”，false
```











## Leecode

####  [两数之和](https://leetcode.cn/problems/two-sum/)

给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。

示例 1：

    输入：nums = [2,7,11,15], target = 9
    输出：[0,1]
    解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。

**Solution**

方法1：Hash表

```java
public int[] twoSum(int[] nums, int target) {
  Map<Integer, Integer> map = new HashMap<>();
  for (int i = 0; i < nums.length; i++) {
    if (map.containsKey(target - nums[i])) {
      return new int[]{map.get(target - nums[i]), i};
    }
    map.put(nums[i], i);
  }
  return new int[2];
}
```



#### [回文](https://leetcode.cn/problems/palindrome-number/)

给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。

回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

例如，121 是回文，而 123 不是。


示例 1：

    输入：x = 121
    输出：true

**Solution**

方法1: 双指针-容易想到

```java
// 双指针
public boolean isPalindrome(int x) {
    String chars = String.valueOf(x);
    int p1 = 0, p2 = chars.length() - 1;
    while (p1 < p2 && chars.charAt(p1) == chars.charAt(p2)) {
        p1++;
        p2--;
    }
    return p1 >= p2;
}
```

方法2: 反转一半的数

```java
// 反转一半的数
public boolean isPalindrome(int x) {
  // 负数、个位为0
  if (x < 0 || (x % 10 == 0 && x != 0)) {
    return false;
  }
  int reX = 0;
  while (x > reX) {
    reX = reX * 10 + x % 10;
    x = x / 10;
  }
  // 长度为偶数：直接相等
  // 长度为奇数：反转数/10等于原数
  return x == reX || reX / 10 == x;
}
```



