import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class DanielZhong here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DanielZhong extends Student  
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class DanielZhong
     */
    public DanielZhong(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        myRow=r;
        mySeat=s;
        imgFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(imgFile);
    }

    public DanielZhong() {
        firstName="Daniel";
        lastName="Zhong";
        myRow=4;
        mySeat=7;
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
            sayName(soundFile);
            
            myHobby("I like basketball!!!");
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
        GreenfootImage image = getImage();
        image.scale(400,600);
        setImage(image);
        for (int j=0; j<9; j++){
            for (int i=0; i<=350; i=i+100) {
                setRotation(i);
                Greenfoot.delay(1);
            }
        }
    setRotation(0);
    setLocation(0,0);
    Greenfoot.delay(1);
            // move right
        for (int i=1;i<=9;i++){
            setLocation(i,0);
            Greenfoot.delay(1);
        }
        for (int i=0; i<=1000; i=i+50)
        {
         setRotation(i);
         Greenfoot.delay(1);
        }
   
    setLocation(0,0);
    Greenfoot.delay(10);
        // move right
        for (int i=1;i<=9;i++){
            setLocation(i,0);
            Greenfoot.delay(1);
        }
        for (int i=0; i<=1000; i=i+50)
        {
         setRotation(i);
         Greenfoot.delay(1);
         image.scale(1000,600);
        setImage(image);
        }
        ;
        
        for (int j=0; j<9; j++){
            for (int i=0; i<=350; i=i+100) {
                setRotation(i);
                Greenfoot.delay(1);
                image.scale(400,1200);
                setImage(image);
            }
        }
        
        image.scale(3000,3000);
        setImage(image);
        // move back
        for (int i=1;i<=5;i++){
            setLocation(9,i);
            Greenfoot.delay(1);
        }      
         // move left
        for (int i=9;i>=0;i--){
            setLocation(i,5);
            Greenfoot.delay(1);
        }
        for (int i=0; i<=36000; i=i+50)
        {
         setRotation(i);
         Greenfoot.delay(1);
        }
        
              // move Forward
        for (int i=5;i>=0;i--){
            setLocation(0,i);
            Greenfoot.delay(1);
        }   
           Greenfoot.delay(2);
           image.scale(100,130);
           setImage(image);
           sitDown();
    }
     public void myHobby(String s) {
         System.out.println(s);
}

}
