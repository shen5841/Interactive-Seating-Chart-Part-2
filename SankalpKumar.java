import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SankalpKumar here.
 * 
 * @author Sankalp Kumar 
 * @version 9/4/2018
 */
public class SankalpKumar extends Student
{
    public SankalpKumar(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        myRow=r;
        mySeat=s;
        imgFile=f.toLowerCase()+l.toLowerCase()+".jpg";    
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  
        setImage(imgFile);
    }
    /*
     * Default constructor, if you don't pass in a name and seating location
     */
    public SankalpKumar() {
        firstName="Sankalp";
        lastName="Kumar";
        myRow=4;
        mySeat=3;
        imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(imgFile);
    }
    
     /**
     * Act - do whatever Sankalp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        discoParty();
        if(Greenfoot.isKeyDown("e")) {
            Classroom.isSnap = true;
        }
        if(Classroom.isSnap == true && Greenfoot.isKeyDown("e")) {
            elChasquido();
            Classroom.isSnap = false;
        }
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            System.out.println(""); // Print a blank line to create space between any student output.
            getName();
            sayName(soundFile);
            
            myHobby("I like to play tennis and code."); // my hobbies.
            
            
            circleClass();  // calls the SankalpKumar circleClass.
        }
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    public void circleClass(){
        // moves actor to top right hand corner.
        setLocation(0,0);
        Greenfoot.delay(10);
        // move right and slowly spin
        for (int i=1;i<=9;i++){
            setLocation(i,0);
            turn(10);
            Greenfoot.delay(4);
        }
        // spin really fast
        for (int k=0; k<3; k++){
            for (int i=0; i<=360; i=i+15){ 
                turn(i);
                Greenfoot.delay(1);
            }
        }
        // move backward and slowly spin
        for (int i=1;i<=5;i++){
            setLocation(9,i);
            turn(10);
            Greenfoot.delay(4);
        }      
        // spin really fast
        for (int k=0; k<3; k++){
            for (int i=0; i<=360; i=i+15){ 
                turn(i);
                Greenfoot.delay(1);
            }
        }
        // move left and slowly spin
        for (int i=9;i>=0;i--){
            setLocation(i,5);
            turn(10);
            Greenfoot.delay(4);
        }      
        // spin really fast
        for (int k=0; k<3; k++){
            for (int i=0; i<=360; i=i+15){ 
                turn(i);
                Greenfoot.delay(1);
            }
        }      
        // move forward and slowly spin
        for (int i=5;i>=0;i--){
            setLocation(0,i);
            turn(10);
            Greenfoot.delay(4);
        }   
        // spin really fast
        for (int k=0; k<3; k++){
            for (int i=0; i<=360; i=i+15){ 
                turn(i);
                Greenfoot.delay(1);
            }
        }
           Greenfoot.delay(2);
           setRotation(0);
           sitDown();
    }
     public void myHobby(String s) {
         System.out.println(s);
         // prints the string that is given as an argument.
}
}
