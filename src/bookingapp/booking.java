/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingapp;

/**
 *
 * @author erink
 */
public abstract class booking {
    protected String clientName;
    protected int bookRef;
    protected String startDate;
    protected int duration;
    protected double price;
    
    public booking(){
        clientName = " ";
        bookRef = 0;
        startDate = " ";
        duration = 0;
    }
    
    public booking(String clientName, int bookRef, String startDate, int duration){
        this.clientName = clientName;
        this.bookRef = bookRef;
        this.startDate = startDate;
        this.duration = duration;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getBookRef() {
        return bookRef;
    }

    public void setBookRef(int bookRef) {
        this.bookRef = bookRef;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public abstract void computePrice();

    public double getPrice() {
        return price;
    }    
    
    
}
