/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingapp;

/**
 *
 * @author erink
 */
public class bookCottage extends booking{
    private String address;
    private char keyCollect;

    public bookCottage(String address, char keyCollect, String clientName, int bookRef, String startDate, int duration) {
        super(clientName, bookRef, startDate, duration);
        this.address = address;
        this.keyCollect = keyCollect;
    }
    
    public bookCottage(){
        super();
        address = " ";
        keyCollect = ' ';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getKeyCollect() {
        return keyCollect;
    }

    public void setKeyCollect(char keyCollect) {
        this.keyCollect = keyCollect;
    }
    
    @Override
    public void computePrice(){
        price = (duration*60)+50;
    }    
    
}
