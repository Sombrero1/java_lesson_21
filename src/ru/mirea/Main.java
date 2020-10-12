package ru.mirea;

import ru.mirea.chairs.ChairFactory;
import ru.mirea.chairs.Client;
import ru.mirea.complex.Complex;
import ru.mirea.complex.ConreteFactory;
import ru.mirea.documents.*;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ConreteFactory fct1= new ConreteFactory();//1 пункт
        Complex a1=fct1.createComplex();
        Complex a2=fct1.createComplex(3,5);

        ChairFactory fct2 = new ChairFactory();
        System.out.println("-----------------");
        Client Berg= new Client();
        Berg.setChair(fct2.createFunctionalChair());
        Berg.sit();
        Berg.setChair(fct2.createMagicanChair());
        Berg.sit();
        Berg.setChair(fct2.createVictorianChair(20));
        Berg.sit();

        System.out.println("-----------------");
        App app =new App();


        Documents fct3=new Documents();
        TextDocument g1= (TextDocument) fct3.createNew("text");
        g1.mainWindow();
        g1.toolBar();
        g1.createText();
        System.out.println();
        MusicDocument g2=(MusicDocument)fct3.createNew("music");
        g2.listenToMusic();
        g2.mainWindow();
        g2.toolBar();
        System.out.println();
        ImageDocument g3= (ImageDocument) fct3.createNew("image");
        g3.imageShow();
        g3.mainWindow();
        g3.toolBar();



    }
}
