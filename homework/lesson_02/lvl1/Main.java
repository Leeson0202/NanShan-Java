package lesson_02.lvl1;


import lesson_02.lvl1.entities.Cat;
import lesson_02.lvl1.entities.Dog;

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
