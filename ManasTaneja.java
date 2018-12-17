import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class ManasTaneja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ManasTaneja extends Student implements SpecialInterestOrHobby,StudentAthlete, Aburrido
{
    /**
     * Act - do whatever the ManasTaneja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ManasTaneja(String fn, String ln, int r, int s) { //main consructor
        firstName = fn; // set firstName to fn param
        lastName = ln; // set lastName to ln param
        myRow = r; // set myRow to r param
        mySeat = s; // set mySeat to s param
        imgFile = firstName.toLowerCase()+lastName.toLowerCase()+".png";    // construct path for image
        soundFile = firstName.toLowerCase()+lastName.toLowerCase()+".wav";  // construct path for sound
        setImage(imgFile); // set actor's image to imgFile
    }
    
    public ManasTaneja() { //constructor for convenience
        firstName="Manas"; // firstName defaulted to "Manas"
        lastName="Taneja"; // lastName defaulted to "Taneja"
        myRow=4; // row set to 4
        mySeat=2; // seat set to 2
        imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".png"; // construct path for image
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav"; // construct path for sound
        setImage(imgFile); // set acto's image to imgFile, error thrown of file DNE
    }
    
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
        if (Greenfoot.mouseClicked(this)){ // if actor is clicked on
            System.out.println(""); // print blank line to create space between any other output
            getName(); // print the name of the actor
            myHobby("Yes, I code for fun, at school, and for a living. Deal with it."); //print hobby
            mySport("I do various forms of street dance: hip hop, popping, breakdance, etc."); //print sport
            System.out.println("I have " + numberOfSiblings() + " sibling."); //print # of siblings
            sayName(soundFile); // play audio file of my name
            doSomething(); //do the unique motion method for this actor
            System.out.println(""); // print blank line to create space between any other output
        }
        agarDeath();
        noSupervision();
    }
    
    public void getName() {
        System.out.println("My name is " + firstName + " " + lastName + "."); //prints firstName and lastName as part of introductory phrase
    }
    
    public void doSomething() {
        this.getWorld().setBackground("mtback.png");
        for (int i = 0; i < 360; i++){
            turn(10);
            Greenfoot.delay(1);
            if (i % 2 == 0){
                move(1);
            }
            Greenfoot.delay(1);
        }
        sitDown();
        setRotation(0);
        this.getWorld().setBackground("csa.jpg");
    }
    
    public void myHobby(String myHobbySentence) {
        System.out.println(myHobbySentence);
    }
    
    public void mySport(String mySportSentence) {
        System.out.println(mySportSentence);
    }
    
    public int numberOfBrothers(){
        return 0;
    }
    
    public int numberOfSisters(){
        return 1;
    }
    
    public int numberOfSiblings(){
        return numberOfSisters() + numberOfBrothers();
    }
    
    public void agarDeath(){
        if(Greenfoot.isKeyDown("d")) { 
            setRotation(0); 
            move(1);
            Greenfoot.delay(8);
        } 
        if(Greenfoot.isKeyDown("s")) { 
            setRotation(90); 
            move(1); 
            setRotation(0);
            Greenfoot.delay(8);
        } 
        if(Greenfoot.isKeyDown("a")) { 
           setRotation(180); 
           move(1); 
           setRotation(0);
           Greenfoot.delay(8);
        } 
        if(Greenfoot.isKeyDown("w")) { 
           setRotation(270); 
           move(1); 
           setRotation(0);
           Greenfoot.delay(8);
        } 
    }
    
    public void noSupervision(){
        if(Greenfoot.isKeyDown("n")){
            for(int i = 0; i < 360; i++){
                turn(5);
                Greenfoot.delay(1);
            }
        }
    }
}
