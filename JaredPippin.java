import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JaredPippin extends Student implements SpecialInterestOrHobby
{

    public JaredPippin(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        myRow=r;
        mySeat=s;
        imgFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(imgFile);
    }
    
    public JaredPippin() {
        firstName="Jared";
        lastName="Pippin";
        myRow=1;
        mySeat=2;
        imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(imgFile);
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
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            System.out.println(""); // Print a blank line to create space between any student output.
            getName();
            sayName(soundFile);
            
            myHobby("I like to watch movies!");
            NumberOfSiblings();
            circleClass();
        }
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    public void circleClass(){
        setLocation(2,1);
         Greenfoot.delay(10);
      // move down the 2nd column
        for (int i=1;i<=9;i++){
            setLocation(2,i);
            Greenfoot.delay(5);
        }
        // move into the 3rd column
        for (int i=2;i<=3;i++){
            setLocation(i,9);
            Greenfoot.delay(5);
        }      
        // move back up the 3nd column
        for (int i=9;i>=1;i--){
            setLocation(3,i);
            Greenfoot.delay(5);
        }
        // move into the 4th column
        for (int i=3;i<=4;i++){
            setLocation(i,1);
            Greenfoot.delay(5);
        }  
        // move down the 4th column
         for (int i=1;i<=9;i++){
            setLocation(4,i);
            Greenfoot.delay(5);
        }
        // move into the 5th column
          for (int i=4;i<=5;i++){
            setLocation(i,9);
            Greenfoot.delay(5);
        }
        // move back up the 5th column
          for (int i=9;i>=1;i--){
            setLocation(5,i);
            Greenfoot.delay(5);
        }
        // move into the 6th column
          for (int i=5;i<=6;i++){
            setLocation(i,1);
            Greenfoot.delay(5);
        }
        // move down the 6th column
          for (int i=1;i<=9;i++){
            setLocation(6,i);
            Greenfoot.delay(5);
        }
        // move to the right side of the seating chart
          for (int i=6;i<=9;i++){
            setLocation(i,9);
            Greenfoot.delay(5);
        }
        // move back up the right side of the seating chart
          for (int i=9;i>=0;i--){
            setLocation(9,i);
            Greenfoot.delay(5);
        }
        // move above my seat
          for (int i=9;i>=2;i--){
            setLocation(i,0);
            Greenfoot.delay(5);
        }
           Greenfoot.delay(20);
           sitDown();
    }
    public void myHobby(String s) {
         System.out.println(s);
    }
    // sets the amount of brothers that I have
    public int NumberOfBrothers(){
        return 0;
    }
    // sets the amount of sisters that I have
    public int NumberOfSisters(){
        return 1;
    }
    // prints the amount of brotherss and sisters I have
    public void NumberOfSiblings(){
        System.out.println("I have " + NumberOfBrothers() + " brothers and " + NumberOfSisters() + " sister named Michelle.");
    }
}