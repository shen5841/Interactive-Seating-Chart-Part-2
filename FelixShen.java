import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FelixShen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FelixShen extends Student
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
    public FelixShen(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        myRow=r;
        mySeat=s;
        imgFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(imgFile);
        GreenfootImage normal = getImage();
        normal.scale(100, 150);
    }
    /*
     * Default constructor, if you don't pass in a name and seating location
     */
    public FelixShen() {
        firstName="Felix";
        lastName="Shen";
        myRow=3;
        mySeat=7;
        imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(imgFile);
        GreenfootImage normal = getImage();
        normal.scale(100, 150);
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
            //System.out.println(""); // Print a blank line to create space between any student output.
            //getName();
            sayName(soundFile);
            
            //myHobby("I like to time travel!");
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
            
            circleClass();  // Kilgore Trount's special method... Please write one of your own. You can use this, but please modify it and be creative.
          
        }
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    public void circleClass(){
        setImage("fun.jpg");
        GreenfootImage image = getImage();
        for (int j=0; j<5; j++){
            for (int i=0; i<=350; i=i+10){ 
                setRotation(i);
                Greenfoot.delay(1);
                image.scale(100+2*i, 150+3*i);
                setImage(image);
            }
        }
        setRotation(0);
        setLocation(0,0);
        Greenfoot.delay(10);
        for (int j=0; j<3; j++){
        // move right
            for (int i=1;i<=9;i++){
                setLocation(i,0);
                Greenfoot.delay(2);
            }
        // move back
            for (int i=1;i<=5;i++){
                setLocation(9,i);
                Greenfoot.delay(2);
            }      
         // move left
            for (int i=9;i>=0;i--){
                setLocation(i,5);
                Greenfoot.delay(2);
            }      
              // move Forward
            for (int i=5;i>=0;i--){
                setLocation(0,i);
                Greenfoot.delay(2);
            }   
        }
           Greenfoot.delay(20);
           setImage(imgFile);
           GreenfootImage normal = getImage();
           normal.scale(100, 150);
           sitDown();
    }
     public void myHobby(String s) {
         System.out.println(s);
        }   
}
