import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AyraJafri extends Student implements SpecialInterestOrHobby, CSALearnedSoFar
{

    /*
     * Constructor for the AyraJafri class.
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
    private String n = "So far, I've learned a lot in this class! For example,\nI learned about what one can do with Java, Github and its versatility,\nand about how I can rickroll all you guys with Greenfoot.";
    private int x = 0;
    public AyraJafri(String f, String l, int r, int s) {
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
    public AyraJafri() {
        firstName="Ayra";
        lastName="Jafri";
        myRow=4;
        mySeat=5;
        imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(imgFile);
    }
    
     /**
     * Act - do whatever the AyraJafri actor wants to do. This method is called whenever
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
            getName();
            sayName(soundFile);
            myHobby("I like to read, draw cats, draw stuff in general, read,\nand waste time on my laptop drawing, watching videos, and waiting for Windows Updates.");
            LearnedSoFar();
            neverGonna();  // Ayra Jafri's special method!
          
        }
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("Hey!\nMy name is " + firstName + " " + lastName); //it prints out my name!
    }
    public void neverGonna(){
        setImage("rickWaifu.jpg"); //hehe
        Greenfoot.playSound("rickroll2.wav"); //yes, I am not trying to hide this
        setLocation(0,0);
        Greenfoot.delay(10);
        // move right
        for (int i=1;i<=9;i++){
            setLocation(i,0);
            setRotation(x);
            x = x + 10;
            Greenfoot.delay(2);
        }
        // move down
        for (int i=1;i<=5;i++){
            setLocation(9,i);
            setRotation(x);
            x = x + 10;
            Greenfoot.delay(2);
        }      
        // move left
        for (int i=9;i>=0;i--){
            setLocation(i,5);
            setRotation(x);
            x = x + 10;
            Greenfoot.delay(2);
        }      
        // move up
        for (int i=5;i>=0;i--){
            setLocation(0,i);
            setRotation(x);
            x = x + 10;
            Greenfoot.delay(2);
        }
        //move down again
        for (int i=0;i<=5;i++){
            setLocation(0,i);
            setRotation(x);
            x = x + 10;
            Greenfoot.delay(2);
        }  
            // move left again
        for (int i=0;i<=9;i++){
            setLocation(i,5);
            setRotation(x);
            x = x + 10;
            Greenfoot.delay(2);
        }
             // move up again
        for (int i=5;i>=0;i--){
            setLocation(9,i);
            setRotation(x);
            x = x + 10;
            Greenfoot.delay(2);
        }
            // move right again
        for (int i=9;i>=1;i--){
            setLocation(i,0);
            setRotation(x);
            x = x + 10;
            Greenfoot.delay(2);
        }
        setLocation(4,2);
        Greenfoot.delay(5);
        setRotation(0);
        for (int i=1;i<=130;i++){
            setRotation(x);
            x = x + 5;
            Greenfoot.delay(1);
        }
        for (int i=1;i<=150;i++){
            setRotation(x);
            x = x - 5;
            Greenfoot.delay(1);
        }
        setImage("rickCool.jpg");
        setRotation(0);
        for (int i=1;i<=5;i++){
            setLocation(getX()+1, getY());
            Greenfoot.delay(3);
            setLocation(getX()-1, getY());
            Greenfoot.delay(3);
        }
        setRotation(0);
        setLocation(4,2);
        for (int i=1;i<=65;i++){
            setRotation(x);
            x = x + 10;
            Greenfoot.delay(1);
        }
        setRotation(0);
        setImage("shrek.jpg");
        Greenfoot.delay(5);
        setImage("ayrajafri.jpg");
        Greenfoot.delay(20);
        sitDown();
    }
    //the myHobby method; it prints out my hobbies!
     public void myHobby(String s) {
         System.out.println(s);
    }
    //the LearnedSoFar method prints out what I've learned so far!
    public void LearnedSoFar(){
        System.out.println("I have learned a lot so far!\nFor Example, I've learned about all the IDES one can use\nand I learned about what one can do with Java\nI've also learned how to rickroll people too.\nJust like in 2008!");
    }
}