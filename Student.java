import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Student extends Actor
{
   //Instance variables
   public String firstName;
   public String lastName;
   public int myRow;         // rows start in the front of class (1), and end in the back of class
   public int mySeat;        // seats are left to right, 1-8
   public boolean isActive;  // can you think of an algorithm that would allow you to use this
                             // variable to use keyboard entry for all the instance of a student
                             // that we will create?
   
   public String imgFile;   // These will be created in subclass as firstName.toLowerCase()+
   public String soundFile; //      firstName.toLowerCase()+lastName.toLowerCase()+".ext"; (.wav or .jpg)
   public String musicFile;
   Classroom clas = (Classroom) getWorld();
   public void setRow(int r){
       myRow=r;
    }
    
    public void setSeat(int s){
       mySeat=s;
    }
    
    public abstract void  getName(); //This is an abstract classs. You will have to implement it
                                     // in your own class file
    /**
     * When the space bar is pressed a "disco party" is intiatated where each student
     * changes colors and disco music is played until the space bar is released.
     */
       public void discoParty(){
       if (Greenfoot.isKeyDown("space"))
        { 
            //this.getWorld().setBackground(gifImage.getCurrentImage());
            System.out.println("Warning, you may get a seizure.");
            int die = Greenfoot.getRandomNumber(4);
            GreenfootImage myImage = getImage();
            //Gorkem Guclu worked on the first three lines
            if (die > 1)    
               {
                   if (die > 2) {
                        setImage("blue.jpg");
                    } 
                    else {
                        setImage("red.jpg");
                    }
            } 
            else 
            {
                 setImage("green.jpg");
            }
            //Micah Boursier worked on this if-else statement
        } 
       /*if (Greenfoot.isKeyUp("space"))*/else
        {
            setImage(imgFile);
        }
        //Sankalp Kumar worked on the images, documentation, and helped figure out logic.
    }
    //Ayra Jafri and Manav Kant did the elChasquido method.
    public void elChasquido() {
        double death = Math.random();
        int visibility = 255;
            if(death >= 0.50) {
                while(visibility != 0){
                visibility = visibility - 3;
                getImage().setTransparency(visibility);
                Greenfoot.delay(1);
            }
            getImage().setTransparency(0);
            Greenfoot.delay(100);
        }
    }
    
    public int GetRow(){
        return myRow;
    }
    
    public int GetSeat(){
        return mySeat;
    }
    
    public void sayName(String myNameFile){
        Greenfoot.playSound(myNameFile);
    }
    
    public void sitDown(){
        setLocation(mySeat,myRow);
    }
        
 
}
