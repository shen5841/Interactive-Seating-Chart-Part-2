import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ManavKant extends Student implements SpecialInterestOrHobby, NumberOfSiblings
{

    /*
     * Constructor for the KilgoreTrout class.
     * Constructors are special methods with the same exact name as the class name.  
     * Constructors to not have return types.
     * Constructors can be overloaded. This means we can call a constructor with different sets of parameter
     *  lists to initalize for different conditions (depending on what constructors have been written.
     * @param String f (firstname)
     * @param String l (lastname)
     * @param int r (row of seating arrangement)
     * @param int s (seat number within row seating arrangement)
     * 
     */
    public ManavKant(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        myRow=r;
        mySeat=s;
        imgFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(imgFile);
    }
    /*
     * Default constructor, if you don't pass in a name and seating location
     */
    public ManavKant() {
        firstName="Manav";
        lastName="Kant";
        myRow=2;
        mySeat=6;
        imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(imgFile);
    }
    
     /**
     * Act - do whatever the KilgoreTrout actor wants to do. This method is called whenever
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
            
            myHobby("I like to breathe!");
            int n = numberOfSiblings();
            if (n == 0) {
                System.out.println("I don't have any siblings!");
            }else if (n == 1) {
                System.out.println("I have one sibling!");
            }else {
                System.out.println("I have " + n + " siblings!");
            }
            int b = numberOfBrothers();
            if (b == 0) {
                System.out.println("I don't have any brothers!");
            }else if (b == 1) {
                System.out.println("I have one brother!");
            }else {
                System.out.println("I have " + b + " brothers!");
            }
            int s = numberOfSisters();
            if (s == 0) {
                System.out.println("I don't have any sisters!");
            }else if (s == 1) {
                System.out.println("I have one sister!");
            }else {
                System.out.println("I have " + s + " sisters!");
            }
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
            
            bounce();  // Kilgore Trount's special method... Please write one of your own. You can use this, but please modify it and be creative.
            sayName(soundFile);
        }
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    public void bounce(){
        setLocation(0,0);
        Greenfoot.playSound("boing.wav");
        Greenfoot.delay(80);
        for(int i=1; i<=9; i++) {
            if((i%2)==1) {
                setLocation(i, 5);
                Greenfoot.playSound("boing.wav");
                Greenfoot.delay(80 - 4*i);
            }else {
                setLocation(i, 0);
                Greenfoot.playSound("boing.wav");
                Greenfoot.delay(80 - 4*i);
            }
            turn(90);
        }
        sitDown();
        Greenfoot.delay(60);
        setRotation(0);
    }
    public void myHobby(String s) {
        System.out.println(s);
    }
    public int numberOfSiblings() {
        return 1;
    }
    public int numberOfBrothers() {
        return 1;
    }
    public int numberOfSisters() {
        return 0;
    }
}
