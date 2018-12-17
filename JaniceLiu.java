import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
  

/**
 * Write a description of class JaniceLiu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JaniceLiu extends Student implements SpecialInterestOrHobby, NumberOfSiblings  
{
    public JaniceLiu(String f, String l, int r, int s) {
       firstName=f;
       lastName=l;
       myRow=r;
       mySeat=s;
       imgFile=f.toLowerCase()+l.toLowerCase()+".jpg"; 
       soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  
       setImage(imgFile);
    }   
    public JaniceLiu() {
       firstName="Janice";
       lastName="Liu";
       myRow=4;
       mySeat=4;
       imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
       setImage(imgFile);
    }
    /**
     * Act - do whatever the JaniceLiu wants to do. This method is called whenever
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
        if(Greenfoot.mouseClicked(this)){
            System.out.println(""); 
            getName();
            sayName(soundFile);
            
          
            myHobby("My hobbies include drawing, reading, and coding!");
            mySiblings("I have " + numberOfSisters() + " older sister.");
            //my action code
            rotateImage(); 
            Dinosaur();
            
            
        }    
    }
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
     public void rotateImage(){
      GreenfootImage myImage = new GreenfootImage("janiceliu.jpg");
        setImage(myImage);
        for (int i=1;i<=30;i++){
           setRotation(20*i);
         
           Greenfoot.delay(5);
        }
        Greenfoot.delay(5);
        sitDown();
    }
    public void Dinosaur(){
        GreenfootImage movingimg = new GreenfootImage("chromedinosaur.jpg");
        
        
        movingimg.scale(movingimg.getWidth()/5, movingimg.getHeight()/5);
        setImage(movingimg);
        
        setLocation(10,0);
        Greenfoot.delay(10);
          // move left
        for (int i=10;i>=0;i--){
            setLocation(i,0);
            setRotation(10*i);
            Greenfoot.delay(10);
        }      
        movingimg.scale(movingimg.getWidth()/2, movingimg.getHeight()/2);
         // move down
        for (int i=1;i<=7;i++){
            setLocation(0,i);
            setRotation(5*i);
            Greenfoot.delay(10);
        }
        movingimg.scale(movingimg.getWidth()/2, movingimg.getHeight()/2);
        // move right
        for (int i=1;i<=7;i++){
            setLocation(i,7);
            setRotation(10*i);
            Greenfoot.delay(10);
        }
        movingimg.scale(movingimg.getWidth()/2, movingimg.getHeight()/2);
        // move up
        for (int i=7;i>=0;i--){
            setLocation(7,i);
            setRotation(5*i);
            Greenfoot.delay(10);
        }  
        Greenfoot.delay(5);
        setImage(imgFile);
        sitDown();
    }
  
    public void myHobby(String s) {
         System.out.println(s);
        }
    public void mySiblings(String n) {
        System.out.println(n);
    }
    public int numberOfSisters(){
        return 1;
    }
    public int numberOfBrothers(){
        return 0;
    }
    public int numberOfSiblings(){
        return numberOfSisters() + numberOfBrothers();
    }
}