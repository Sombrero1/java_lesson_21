package ru.mirea.documents;

public class ImageDocument implements IDocument {

    @Override
    public void mainWindow() {
        System.out.println("Cоздано главное окно " + this.getClass());
    }

    @Override
    public void toolBar() {
        System.out.println("Cоздана панель инструментов" + this.getClass());
    }
    public void imageShow(){
        System.out.println("Показываем картинку " + this.getClass());
    }
}