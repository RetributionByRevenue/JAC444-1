package task1;

/**********************************************
Workshop #10
Course: JAC444 - Summer 2020
Last Name: Daryan
First Name: Chan
ID: 113973192
Section: NAA
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date: 8/12/2020
**********************************************/

public class Time implements Cloneable, Comparable<Time> {

   private long elapsedTime;

   //constructor that constructs the current time
   public Time() {
	   elapsedTime = System.currentTimeMillis() / 1000;
   }

   public Time(int hours, int minutes, int seconds) {
	   elapsedTime = (( (hours * 60) + minutes ) * 60) + seconds;
   }

   public Time(long elapsedTime) {
       this.elapsedTime = elapsedTime;
   }

   //return current hour
   public int getHour() {
       return (int) (elapsedTime / 3600);
   }

   //return current minute
   public int getMinute() {
       return (int) (elapsedTime - (getHour() * 3600)) / 60;
   }

   //returns the current second, 0 to 59.
   public int getSecond() {
       return (int) elapsedTime - (getHour() * 3600) - (getMinute() * 60);
   }
  
   public long getSeconds(){
       return elapsedTime;
   }

   @Override
   public int compareTo(Time obj) {
       return (int) (elapsedTime - ((Time)obj).elapsedTime);
   }
   
   public Time clone(){
       Time Time2 = new Time();
       Time2.elapsedTime = elapsedTime;
       return Time2;
   }   
   
   public String toString() {
       return String.format("%d hours %d minutes %d seconds", getHour(), getMinute(), getSecond());
   }
    
   public boolean equals(Time T){
       return T.elapsedTime == elapsedTime;
   }
}