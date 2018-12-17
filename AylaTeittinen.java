import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AylaTeittinen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AylaTeittinen extends Student
{
    private String chillaryClinton; // declare this audio name variable
    private String babyAyla; // declare this picture variable
    
    public AylaTeittinen(String f, String l, int r, int s) {
        firstName=f; // first name
        lastName=l; // last name
        myRow=r; // y location
        mySeat=s; // x location
        imgFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // name your image files firstlast.jpg, all lowercase!!!
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // name your sound files firstlast.wav, all lowercase!!!
        babyAyla="bbayla.jpg"; // gives baby pic
        chillaryClinton="hillaryclinton.wav"; // another audio clip that plays afterward
        setImage(imgFile); // sets image to my face
    }
    
    /*
     * Default constructor, if you don't pass in a name and seating location
     */
    public AylaTeittinen() {
        firstName="Ayla"; // gives first name
        lastName="Teittinen"; // gives last name
        myRow=1; // gives row (y)
        mySeat=1; // gives column (x)
        imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg"; // gives what the image file is
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav"; // gives what the sound file is
        chillaryClinton="hillaryclinton.wav"; // sets chillaryClinton variable
        babyAyla="bbayla.jpg"; // gives baby pic
        setImage(imgFile); // sets the image to my face
    }
    
    public void getName()
    {
        System.out.println("My name is " + firstName + " " + lastName + "."); // says what my name is
    }
    
    public void aylaMove() {
        setLocation(1,1); // initial location
        setImage(babyAyla); // baby picture lol
        Greenfoot.delay(10);
        // move right
        for (int i=1;i<=2;i++){
            setLocation(i,1);
            Greenfoot.delay(10);
        }
        // move left
        for (int i=2;i>=0;i--){
            setLocation(i,1);
            Greenfoot.delay(10);
        }
        // move right
        for (int i=1;i<=2;i++){
            setLocation(i,1);
            Greenfoot.delay(10);
        }
        // move left
        for (int i=2;i>=0;i--){
            setLocation(i,1);
            Greenfoot.delay(10);
        }
        // move right
        for (int i=1;i<=2;i++){
            setLocation(i,1);
            Greenfoot.delay(10);
        }
        
        // move back
        for (int i=1;i<=2;i++){
            setLocation(1,i);
            Greenfoot.delay(10);
        }      
        // move forward
        for (int i=2;i>=0;i--){
            setLocation(1,i);
            Greenfoot.delay(10);
        }
        // move back
        for (int i=1;i<=2;i++){
            setLocation(1,i);
            Greenfoot.delay(10);
        }
        // move forward
        for (int i=2;i>=0;i--){
            setLocation(1,i);
            Greenfoot.delay(10);
        }
        // move back
        for (int i=1;i<=2;i++){
            setLocation(1,i);
            Greenfoot.delay(10);
        }
        Greenfoot.delay(20);
        sitDown(); // sits down back at seat
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
        if(Greenfoot.mouseClicked(this)){
            System.out.println(""); // Print a blank line to create space between any student output.
            getName();
            sayName(soundFile);
            sayName(chillaryClinton);
            
            myHobby("In my spare time, I like to travel.");
            numberOfSiblings(1);
            
            aylaMove();  // Kilgore Trount's special method... Please write one of your own. You can use this, but please modify it and be creative.
            setImage(imgFile);
          
        }
    }
    
    public void myHobby(String h)
    {
        System.out.println(h);
    }
    
    public void numberOfSiblings(int si)
    {
        System.out.println(si);
    }
}
