package ru.mirea.chairs;

public class VictorianChair implements  Chair {
    private int age;

    public int getAge() {
        return age;
    }
    VictorianChair(int age){
        this.age=age;
    }
    @Override
    public void sit() {
        System.out.println("Сел на "+ this.getClass());
    }
}
