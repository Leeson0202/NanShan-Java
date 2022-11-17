package lesson_02.lvl1.entities;

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
