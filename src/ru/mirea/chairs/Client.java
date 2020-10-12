package ru.mirea.chairs;

public class Client {
   Chair chair;
   public void sit(){
       chair.sit();
   }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
