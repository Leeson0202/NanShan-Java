# 作业

### Level1

> 写一个自己的动物园吧！运用以上讲解的和自己课后自学的关于面向对象的知识点来写一个自己的动物园吧！

`TIPS：可以不按照我的提示创建自己的动物园哦`

**提示**

- 声明一个抽象类`Pet`，封装属性`name`和`sex`，声明一个带有两个参数的构造函数，声明抽象方法`void talk()`和`void eat()`；
- 声明一个`Dog`类继承自`Pet`，封装属性`color`，声明带有三个参数的构造函数，复写`talk()`和`eat()`方法；
- 声明一个`Cat`类继承自`Pet`，封装属性`weight`，声明带有三个参数的构造函数，复写`talk()`和`eat()`方法；
- 编写测试类，通过有参构造函数实例化`Dog`类对象，调用`talk()`方法和`eat()`方法；通过有参构造函数实例化`Cat`类对象 ，调用`talk()`方法和`eat()`方法；
- 在各自的动物子类定义定义一个自己特有的方法



#### Level1 Solution

- Pet抽象类

  ```java
  public abstract class Pet {
      private String name;
      private String sex;
  
      public Pet() {
      }
  
      public Pet(String name, String sex) {
          this.name = name;
          this.sex = sex;
      }
  
      abstract void talk();
  
      abstract void eat();
  }
  ```

  

- Dao子类

  ```java
  public class Dog extends Pet {
      private String color;
  
      public Dog() {
      }
  
      public Dog(String name, String sex, String color) {
          super(name, sex);
          this.color = color;
      }
  
      @Override
      public void talk() {
          System.out.println("Dog talk()");
      }
  
      @Override
      public void eat() {
          System.out.println("Dog eat()");
      }
  
      public void wang() {
          System.out.println("dog is wanging");
      }
  }
  ```

  

- Cat子类

  ```java
  public class Cat extends Pet {
      private String weight;
  
      public Cat() {
      }
  
      public Cat(String name, String sex, String weight) {
          super(name, sex);
          this.weight = weight;
      }
  
      @Override
      public void talk() {
          System.out.println("Cat talk()");
      }
  
      @Override
      public void eat() {
          System.out.println("Cat eat()");
      }
  
      public void sleep() {
          System.out.println("cat is sleeping");
      }
  }
  ```

  

- 测试方法

  ```java
  public class Main {
      public static void main(String[] args) {
          // dog
          Dog dog = new Dog("wangwang", "female", "black and white");
          dog.talk();
          dog.eat();
  
          // cat
          Cat cat = new Cat("Tom", "female", "black and yellow");
          cat.talk();
          cat.eat();
  
          // 自定义特有方法
          dog.wang();
          cat.sleep();
      }
  }
  ```

  



### Level2

> 做一个属于自己的英雄联盟吧（如果有同学没玩过的话，就做个自己熟悉的游戏）
>
> 要求：
>
> - 简单的类的创建，
> - 类的属性可以包括但并不下限于：血量，蓝条，装备，攻击力，防御力，敏捷
> - 将英雄之间的战斗做成回合制游戏，(可以while循环实现)
> - 任何你所想的到的功能，尽可能的花哨



#### Level2 Solution

自定义了一个复杂类Word（英语单词），懒得搞逻辑

所有实体类在 ./word 包下

主启动类为：<a href="./Main.java">./Main.java</a>

