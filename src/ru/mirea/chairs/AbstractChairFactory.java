package ru.mirea.chairs;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);
    MagicChair createMagicanChair();
    FunctionalChair createFunctionalChair();
}
