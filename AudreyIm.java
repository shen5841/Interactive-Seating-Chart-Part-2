import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is Audrey Im's student subclass.
 * 
 * Audrey Im
 * 8/22/18 AP CSA Period 2
 */
public class AudreyIm extends Student implements StudentAthlete, SpecialInterestOrHobby     
{
    public AudreyIm(String f, String l, int r, int s) {
       firstName=f;
       lastName=l;
       myRow=r;
       mySeat=s;
       imgFile=f.toLowerCase()+l.toLowerCase()+".jpg"; 
       soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  
       setImage(imgFile);
    }   
    public AudreyIm() {
       firstName="Audrey";
       lastName="Im";
       myRow=2;
       mySeat=1;
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
        if(Greenfoot.mouseClicked(this)){
            System.out.println(""); 
            getName();
            sayName(soundFile);
            Greenfoot.delay(100);
            GreenfootSound bgSound = new GreenfootSound("lit.mp3");
            bgSound.play(); 
            
            Greenfoot.delay(10);
            this.setImage("travis.jpg"); //changes image to travis 
            mySport("I play varsity golf as a sport in DHS!"); //added sport interface
            myHobby("My hobbies are cybersecurity and computer science!"); //added hobby interface
            
            
            moveImage();  //executes moveImage() which moves the image
            
            this.setImage("audreyim.jpg"); //changes travis image back to audreyim
        }
    } 
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName); //states audrey's name
    }
    /**
     * below is the code 
     * to move the image
     * first it sets the coordinates
     * then proceeds to move the image and rotate it multiple times
     * after that the image excecutes the sitdown the moveImage() is completed
     */
    public void moveImage(){
        int centerX = 100;
        int centerY = 100;
        int radius = 50;
        int rotation = 0;
        int turnSpeed = 100;
        setLocation(centerX, centerY); 
        setRotation(rotation); 
        Greenfoot.delay(30);
        turn(turnSpeed); 
        rotation = getRotation(); 
        Greenfoot.delay(30);
        move(radius); 
        Greenfoot.delay(30);
        setRotation(0); 
        Greenfoot.delay(30);
        setRotation(360);
        sitDown();
    }
    public void mySport(String a) {
         System.out.println(a); //prints sport interface
        }
    public void myHobby(String s) {
         System.out.println(s); //prints hobby interface
        }
}

