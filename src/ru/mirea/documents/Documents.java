package ru.mirea.documents;

public class Documents implements ICreateDocument{
    enum Name{
        text,image,music
    }

    @Override
    public IDocument createNew(String m) {
        System.out.println("Cоздаём документ");
        switch (Name.valueOf(m)){
            case text:
                return new TextDocument();

            case image:
                return new ImageDocument();

            case music:
                return new MusicDocument();

        }
        return null;
    }

    @Override
    public IDocument CreateOpen(String m) {
        System.out.println("Открываем документ");
        switch (Name.valueOf(m)){
            case text:
                return new TextDocument();
            case image:
                return new ImageDocument();
            case music:
                return new MusicDocument();

        }
        return null;
    }
}
