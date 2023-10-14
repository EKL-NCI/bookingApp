/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingapp;

import javax.swing.JOptionPane;

/**
 *
 * @author erink
 */
public class bookHotel extends booking{
    private int roomNum;
    private boolean breakfast;
    private int breakfastOp;
    
    

    public bookHotel(int roomNum, boolean breakfast, String clientName, int bookRef, String startDate, int duration) {
        super(clientName, bookRef, startDate, duration);
        this.roomNum = roomNum;
        this.breakfast = breakfast;
    }
    
    public bookHotel(){
        super();
        roomNum = 0;
        breakfast = false;
        breakfastOp = 0;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }
    
    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }

    public boolean getBreakfast() {
        return breakfast;
    }

    public void setBreakfastOp(int breakfastOp) {
        this.breakfastOp = breakfastOp;
    }

    public int getBreakfastOp() {
        return breakfastOp;
    }
    
    @Override
    public void computePrice(){
        
       if (breakfast == true){
           price = 140*duration;
       }
       else if(breakfast == false){
           price = 130*duration;
       }
        
    }

}
