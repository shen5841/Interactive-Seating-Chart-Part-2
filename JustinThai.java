import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JustinThai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JustinThai extends Student implements SpecialInterestOrHobby
{
    int brother;
    int sister;
    public JustinThai(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        myRow=r;
        mySeat=s;
        imgFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(imgFile);
    }
    public JustinThai() {
        firstName="Justin";
        lastName="Thai";
        myRow=1;
        mySeat=4;
        imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(imgFile);
    }
    /**
     * Act - do whatever the JustinThai wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
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
            
            myHobby("I like to eat!");
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
            
            method();
        }
    }    
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    public void myHobby(String s) {
         System.out.println(s);
        }
    public void method() {
        setLocation(mySeat + 1, myRow);
        Greenfoot.delay(10);
        setLocation(mySeat + 1, myRow + 1);
        Greenfoot.delay(10);
        setLocation(mySeat, myRow + 1);
        Greenfoot.delay(10);
        setLocation(mySeat - 1, myRow + 1);
        Greenfoot.delay(10);
        setLocation(mySeat - 1, myRow);
        Greenfoot.delay(10);
        setLocation(mySeat - 1, myRow - 1);
        Greenfoot.delay(10);
        setLocation(mySeat, myRow - 1);
        Greenfoot.delay(10);
        setLocation(mySeat + 1, myRow - 1);
        Greenfoot.delay(10);
        sitDown();
    }
}
