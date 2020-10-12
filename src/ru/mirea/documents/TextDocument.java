package ru.mirea.documents;


public class TextDocument implements IDocument {


    @Override
    public void mainWindow() {
        System.out.println("Cоздано главное окно " + this.getClass());
    }

    @Override
    public void toolBar() {
        System.out.println("Cоздана панель инструментов" + this.getClass());
    }

    public void createText(){
        System.out.println("Cоздаём текст "+ this.getClass());
    }
}
