import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JeffreyTian here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JeffreyTian extends Student implements SpecialInterestOrHobby, StudentAthlete
{

    public JeffreyTian(String f, String l, int r, int s) {
        firstName=f; 
        lastName=l;
        myRow=r;
        mySeat=s;
        imgFile=f.toLowerCase() + l.toLowerCase()+".JPG";    
        soundFile=f.toLowerCase() + l.toLowerCase()+".wav";  
        setImage(new GreenfootImage(imgFile));

    }
    /*
     * Default constructor, if you don't pass in a name and seating location
     */
    public JeffreyTian() {
        firstName="Jeffrey";
        lastName="Tian";
        myRow = 3;
        mySeat = 1;
        imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".JPG";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav"; 
        setImage(new GreenfootImage(imgFile));
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
            System.out.println(""); 
            sayName(soundFile);
            Greenfoot.delay(15);
            getName();
            myHobby("I like to eat unhealthy amounts of macaroni");
            mySport("I run track and field, but the macaroni doesn't help");
            diagnol();
            vert();
            moveClass();
        }   
        noSupervision();
        //agarDeath();
    }
    public void noSupervision(){
        if(Greenfoot.isKeyDown("p")){
            for(int i = 0; i < 120; i++){
                turn(10);
                Greenfoot.delay(1);
            }
            setRotation(0);
            Greenfoot.delay(10);
        }
    }
        /**public void agarDeath(){
        if(Greenfoot.isKeyDown("d")) { 
            move(1); 
            Greenfoot.delay(2);
        } 
        if(Greenfoot.isKeyDown("s")) { 
            setRotation(90);
            move(1);
            setRotation(0);
            Greenfoot.delay(2);
        } 
        if(Greenfoot.isKeyDown("a")) { 
           move(-1); 
           Greenfoot.delay(2);
        } 
        if(Greenfoot.isKeyDown("w")) { 
           setRotation(-90);
           move(1);
           setRotation(0);
           Greenfoot.delay(2);
        } 
    } **/
     public void getName(){
        System.out.println("I am " + firstName + " " + lastName);
    }
     public void moveClass()
     {
       this.getWorld().setBackground("jeffreytian_trey.jpg"); //sets background as certain image
       setLocation(4, 2);
       Greenfoot.delay(10);
        for (int i=1;i<=30;i++){
        setImage(new GreenfootImage(imgFile));
        GreenfootImage imgFile = getImage();  
        imgFile.scale(imgFile.getWidth()*i/2, imgFile.getHeight()*i/2); //gradually increases image size
        getImage().setTransparency(255-5*i); //makes object more transparent
        setRotation(20*i); //causes image to rotate
        Greenfoot.delay(5);
       }
       setImage(new GreenfootImage(imgFile)); //reset image and rotation and location and background
       setRotation(0);
       sitDown();
       this.getWorld().setBackground("csa.jpg");
    }
    public void diagnol()
    {
       setLocation(0,0);
        for(int r = 0; r <= 3; r++){
        setLocation(r, r); //sets image location diagnolly down
        Greenfoot.delay(10); 
           if(r == 3){
               for(int c = 4; c < 8; c++){
               setLocation(c,3); //sets location across row 3
               Greenfoot.delay(15);
            } 
        }
       }
       for (int i = 8; i <= 9; i++){
            setLocation(i, i-4); //sets location diagnolly downward near bottom right corner
            Greenfoot.delay(15);
        }
    }
    public void vert(){
     for(int i = 5; i >= 0; i--){
         setLocation(4, i);//moves object up column 4
         setImage(new GreenfootImage(imgFile)); 
         GreenfootImage imgFile = getImage();  
         imgFile.scale(imgFile.getWidth()*5/4*(i+1), imgFile.getHeight()*5/4*(i+1)); //increases size
         Greenfoot.delay(12);
         setRotation(70*i); //rotates image   
         imgFile.scale(imgFile.getWidth()/7, imgFile.getHeight()/7); //decreases size
         Greenfoot.delay(8);
        }
        setImage(new GreenfootImage(imgFile)); //resets image to normal
    }
     public void myHobby(String s) {
         System.out.println(s);
    }
    public void mySport (String p){
      System.out.println(p);
    }
}
  
