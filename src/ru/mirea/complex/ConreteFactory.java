package ru.mirea.complex;

public class ConreteFactory implements  ComplexAbstractFactory{

    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real,image);
    }
}
