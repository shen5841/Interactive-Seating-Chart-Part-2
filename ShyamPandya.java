import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Shyam Pandya Subclass 3.0
 * 
 * Shyam Pandya
 * 9/4/18 AP CSA Period 2
 */
public class ShyamPandya extends Student implements StudentAthlete, SpecialInterestOrHobby     
{
    private static GreenfootSound soundSound = new GreenfootSound("shyampandya2.wav");

    public ShyamPandya(String f, String l, int r, int s) {
       firstName=f;
       lastName=l;
       myRow=r;
       mySeat=s;
       imgFile=f.toLowerCase()+l.toLowerCase()+".jpg"; 
       soundFile="shyampandya.wav";  
       setImage(imgFile);
    }   
    public ShyamPandya() {
       firstName="Shyam";
       lastName="Pandya";
       myRow=3;
       mySeat=2;
       imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       soundFile="shyampandya.wav";
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
        if(Greenfoot.mouseClicked(this)){
            soundSound.play();
            System.out.println(""); 
            getName();
            
            
            mySport("I used to be a pole vaulter");
            myHobby("I enjoy doing anything with my camera!");
            
            
            moveImage();  
          
        }
    } 
    public void getName(){
        System.out.println("Helloooooooo my name is " + firstName + " " + lastName);
    }
    public void moveImage(){

        int rotStall = 10;
        int turn = 1;
        int degree = getRotation();
        int degreeTurn = 90;
        
        
        while (turn <= 8){
            if (degree >= 0 ){
                
                getImage().rotate(degreeTurn);
                degree = degree + 90;
            }
            Greenfoot.delay(rotStall);
            turn ++;
            
    
        }
    }
    public void mySport(String a) {
         System.out.println(a);
        }
    public void myHobby(String s) {
         System.out.println(s);
        }
}

