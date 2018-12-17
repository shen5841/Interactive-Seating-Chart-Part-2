import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AriStassinopoulos extends Student implements StudentAthlete, SpecialInterestOrHobby, Aburrido
{

    /*
     * Constructor for the AriStassinopoulos class.
     * Constructors are special methods with the same exact name as the class name.  
     * Constructors to not have return types.
     * Constructors can be overloaded. This means we can call a constructor with different sets of parameter
     *  lists to initalize for different conditions (depending on what constructors have been written.
     * @param String firstName (Student's first name.)
     * @param String lastName (Student's last name.)
     * @param int row (Seat row.)
     * @param int seat (seat number in row.)
     * 
     */
    
 
    public AriStassinopoulos(String firstName, String lastName, int row, int seat) {
        this.firstName = firstName; // Initialise value firstName as param firstName
        this.lastName = lastName; // Initialise value lastName as param lastName
        myRow = row; // Initialise value myRow as param row
        mySeat = seat; // Initialise value seat as param seat
        imgFile = firstName.toLowerCase()+lastName.toLowerCase()+".jpg";    // Construct path for actor image
        soundFile = firstName.toLowerCase()+lastName.toLowerCase()+".wav";  // Construct path for actor sound
        setImage(imgFile); // Set image for actor to the imgFile
    } // End main constructor
    
    /*
     * Convenience initialiser, used to initiate easily
     */
    public AriStassinopoulos() {
        firstName="Ari"; // Default firstName to "Ari"
        lastName="Stassinopoulos"; // Default lastName to "Stassinopoulos"
        myRow=4; // Set row to 4
        mySeat=1; // Set seat to 1
        imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg"; // Prepare image for Classroom environment
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav"; // Set sound file for easy retrieval
        setImage(imgFile); // Set actor image to imgFile, will throw error if imgFile doesn't exist
    } // End convenience init
    
     /**
     * Act - This method checks for clicks and, if there are any, performs the animation and the sound.
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
        if(Greenfoot.mouseClicked(this)){ // If this actor has been clicked on
            System.out.println(""); // Print a blank line to create space between any student output.
            getName(); // Say the name of the actor
            sayName(soundFile); // Play the audio file of my name through the speakers.
            
            mySport("I run cross country and track & field."); // Say what sport I enjoy
            myHobby("I work with the Dublin SHield ");

            walkAllOverYou();  //Go over all the other classmates.
          
        } // End if
    } // End method act 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName); // Print first name and last name, followed by a space
    } // End method getName
    
    /*
     * Walks over other classmates as an animation
     */
    private void walkAllOverYou(){
        
        this.getWorld().setBackground("aristassinopoulos-bg.jpg"); // Set world background to alternate background
        Actor prevActor = null; // Create placeholder for actor to add back after removal
        int prevActorX = 0; // Create placeholder int for prevActor's X location (seat)
        int prevActorY = 0; // Create placeholder int for prevActor's Y location (row)
        
        Greenfoot.delay(10); // Wait ten steps before continuing animation
        
         for(int newRow = 5; newRow > 0; newRow--) { // Loop through all the rows (y-values) from 4-1
             for(int newCol = 9; newCol > 0; newCol--) { // Loop through all the seats (x-values) from 9-1
                 setLocation(newCol,newRow); // Place actor in the iterated location
                 
                 if(prevActor != null) { // If there is an actor which I have removed,
                     getWorld().addObject(prevActor, prevActorX, prevActorY); // Add the actor back in the world at the saved location
                 } // End if
                 
                 Actor intersectingActor = (Actor) getOneIntersectingObject(Actor.class); // Find actors which this actor is colliding with
                 
                 if(intersectingActor != null) { // If there is an intersectingActor
                     prevActor = intersectingActor; // Set the prevActor to the intersectingActor
                     prevActorX = prevActor.getX(); // Set the X location to reinstantiate at to the X location of the intersecting actor
                     prevActorY = prevActor.getY(); // Set the Y location to reinstantiate at to the Y location of the intersecting actor
                 } // End if
                 
                 getWorld().removeObject(intersectingActor); // Remove the intersecting actor from the world
                 
                 Greenfoot.delay(5); // Wait 5 animation steps before continuing
             } // End seat loop
         } // End row loop
         if(prevActor != null) { // If there is an actor to reinstantiate,
             getWorld().addObject(prevActor, prevActorX, prevActorY); // Reinstantiate them at their previous location
             prevActor = null; // Reset the previous actor to prevent infinite copies
         } // End if
        
         sitDown(); // Reset actor location
         this.getWorld().setBackground("csa.jpg"); // Set the world background to the primary background
    } // End method walkAllOverYou
    
    /*
     * Prints which sport I do
     */
    public void mySport(String mySportSentence) {
    System.out.println(mySportSentence); // Print input
    } // End method mySport
    
    /*
     * Prints my hobby
     */
    public void myHobby(String myHobbySentence) {
        System.out.println(myHobbySentence);
    }
    
    public void elChasquido() {
        if(Math.random() < 0.5) {
            getImage().setTransparency(0);
        } else {
            getImage().setTransparency(255);
        }
    }
    
    public void agarDeath() {
        walkAllOverYou();
    }
    
    public void noSupervision() {
        
    }
    
} // End class AriStassinopoulos
