import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KevinLi extends Student implements SpecialInterestOrHobby
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
    public KevinLi(String f, String l, int r, int s) {
        //constructor
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
    public KevinLi() {
        firstName="Kevin";
        lastName="Li";
        myRow=2;
        mySeat=3;
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
            System.out.println("");
            // Print a blank line to create space between any student output.
            // add instance field to world class
            getName();
            sayName(soundFile);
            //retrieves the name and plays the name soundfile
            Greenfoot.delay(100);
            this.setImage("sanic.jpg");
            //sets image to "sanic.jpg"
            GreenfootSound bgSound = new GreenfootSound("sanic.mp3");
            bgSound.play(); 
            //creates new backgroundsound "sanic.mp3" and plays it
            
            myHobby("gotta go fast. nothin personnel kid :p epic gamer win");
            //call my hobby
            
            circleClass(); 
            //calls the kevinli circleclass
            bgSound.pause();
            //pauses background music
            this.setImage("kevinli.jpg");
            //images is returned to normal
        }
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    public void circleClass(){
    // move the sprite to the top left corner
        setLocation(0,0);
        Greenfoot.delay(10);
        // move right and turn at each iteration
        for (int i=1;i<=9;i++){
            setLocation(i,0);
            turn(45);
            Greenfoot.delay(10);
        }
        // move back and turn at each iteration
        for (int i=1;i<=5;i++){
            setLocation(9,i);
            turn(45);
            Greenfoot.delay(10);
        }      
         // move left and turn at each iteration
        for (int i=9;i>=0;i--){
            setLocation(i,5);
            turn(45);
            Greenfoot.delay(10);
        }      
        // move Forward and turn at each iteration
        for (int i=5;i>=0;i--){
            setLocation(0,i);
            turn(45);
            Greenfoot.delay(10);
        }  
        //makes the image upuright and puts it back at the base location
        setRotation(0);
        Greenfoot.delay(20);
        setLocation(this.myRow,this.myRow);
        //causes the image to spin 10 times quickly
        for(int i =0; i <40; i++){
            turn(45);
            Greenfoot.delay(2);
        }
        sitDown();
        //object sits back down
    }
     public void myHobby(String s) {
         System.out.println(s);
         //prints the string given as an argument
}

}