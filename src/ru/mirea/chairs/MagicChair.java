package ru.mirea.chairs;

public class MagicChair implements Chair{
    public void doMagic(){
        System.out.println("Магичу");
    };
    @Override
    public void sit() {
        System.out.println("Сел на "+ this.getClass());
    }

}
