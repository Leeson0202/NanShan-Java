package lesson_02.lvl1.entities;

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
