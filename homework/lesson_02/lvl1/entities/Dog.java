package lesson_02.lvl1.entities;

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
