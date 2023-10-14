/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bookingapp;

import javax.swing.JOptionPane;

/**
 *
 * @author erink
 */
public class BookingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int option, duration, bookRef, roomNum;
        String clientName, startDate, address, keyCollect;
        boolean breakfast = false;
        int breakfastOp = 0;
        //Example of an update
        
        clientName= JOptionPane.showInputDialog(null, "Enter Name: ");
        startDate= JOptionPane.showInputDialog(null, "Enter Starting Date: ");
        bookRef= Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Booking Reference: "));
        duration= Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Duration of Stay: "));
        
        option= Integer.parseInt(JOptionPane.showInputDialog(null, "Choose one of the following: 1. Hotel Booking 2. Cottage Booking "));
        if(option == 1){
            roomNum=Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Room Number: "));
            breakfastOp=JOptionPane.showConfirmDialog(null, "Is Breakfast Included?: ", "Please Choose", JOptionPane.YES_NO_OPTION);
          
                if(breakfastOp == JOptionPane.YES_OPTION){
                    breakfast = true;
                }
                else if(breakfastOp == JOptionPane.NO_OPTION){
                    breakfast = false;
                }
          
            bookHotel h = new bookHotel(roomNum, breakfast, clientName, bookRef, startDate, duration);
            h.computePrice();
            JOptionPane.showMessageDialog(null, "Total: " + h.getPrice()+ " euro.");
        }
        else if (option == 2){
             address=JOptionPane.showInputDialog(null, "Enter Location: ");
             
             while((keyCollect=JOptionPane.showInputDialog("Enter Collection Point: ")).length() != 1){
             char charInput = keyCollect.charAt(0);}
             
             bookCottage c = new bookCottage(address, keyCollect.charAt(0), clientName, bookRef, startDate, duration);
             c.computePrice();
             JOptionPane.showMessageDialog(null, "Total: " + c.getPrice()+ " euro.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid, Please try again");
        }
        
            
            
    }
   
    
}
