import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class here.
 * 
 * @author (ThomasChou) 
 * @version (V2)
 */
public class ThomasChou extends Student implements SpecialInterestOrHobby
{

    public ThomasChou(String f, String l, int r, int s) {
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
    public ThomasChou() {
        firstName="Thomas";
        lastName="Chou";
        myRow=2;
        mySeat=2;
        imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(imgFile);
    }
    
     /**
     * Act - do whatever the ThomasChou actor wants to do. This method is called whenever
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
            
            myHobby("I like the outdoors as a part of Boy Scouts!");
            SpecialInterestOrHobby();
            NumberOfSiblings();
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
            
            leaveClass();  // Thomas Chou's special method
          
        }
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    public void leaveClass(){
        setLocation(0,0);
         Greenfoot.delay(10);
        // move right
        for (int i=1;i<=9;i++){
            setLocation(i,0);
            turn(5*i);
            Greenfoot.delay(5);
        }
        // move down
        Greenfoot.playSound("GetMeOuttaHere.wav");
        for (int i=1;i<=5;i++){
            setLocation(9,i);
            turn(5*i);
            Greenfoot.delay(5);
        }
        
           for (int i=1;i<=5;i++){
            setLocation(9,9);
            turn(4*i);
            Greenfoot.delay(5);
            setImage("exitSign.jpg");
        }
           Greenfoot.delay(100);
           setImage(imgFile);
           setRotation(0);
           sitDown();
    }
    public void myHobby(String s) {
         System.out.println(s);
        }
    public void SpecialInterestOrHobby() {
        System.out.println("I also like to swim and play games, even though I'm not very good.");
    }
    public int NumberOfBrothers(){
        return 1;
    }
    public int NumberOfSisters(){
        return 1;
    }
    public void NumberOfSiblings(){
        System.out.println("I have " + NumberOfBrothers() + "  brother named Robert and " + NumberOfSisters() + " sister named Elaine.");
        
    }
}