package ru.mirea.documents;

public class MusicDocument implements IDocument {

    @Override
    public void mainWindow() {
        System.out.println("Cоздано главное окно " + this.getClass());
    }

    @Override
    public void toolBar() {
        System.out.println("Cоздана панель инструментов" + this.getClass());
    }
    public void listenToMusic(){
        System.out.println("Слушаем музыку " + this.getClass());
    }
}
