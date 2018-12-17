import greenfoot.*;
public class GorkemGuclu extends Student
{
public GorkemGuclu(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        myRow=r;
        mySeat=s;
        imgFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(imgFile);
    }
public GorkemGuclu() {
        Greenfoot.delay(10);
        firstName="Gorkem";
        lastName="Guclu";
        myRow=5;
        mySeat=3;
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
        if(Greenfoot.mouseClicked(this))
        {   System.out.println(""); 
            getName();
            setImage(imgFile);
            sayName(soundFile);
            Greenfoot.playSound("gorkemgucludank.wav");
            int first = getRotation();
            setRotation(first);
            GreenfootImage myImage = getImage();
            int myNewHeight = (int)myImage.getHeight()/2;
            int myNewWidth = (int)myImage.getWidth()/2;
            myImage.scale(myNewWidth,myNewHeight);        
            Greenfoot.delay(10);
            myHobby("I like to do robotics and fly planes!");
            circleClass();
        }
        if(Greenfoot.isKeyDown("L"))
        {
            System.out.println("Jolly good fellow");
        }
}     
public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
public void circleClass()
    {
    int currentX = getX();
    int currentY = getY();
    Greenfoot.delay(10);
    setLocation(3,5);
    Greenfoot.delay(10);
    setRotation(0);
    GreenfootImage myImage = getImage();
    int counter = 3;
    while(counter > 1)
    {
        int myNewHeight = (int)myImage.getHeight()-10;
        int myNewWidth = (int)myImage.getWidth()-10;
        myImage.scale(myNewWidth,myNewHeight);
        counter = counter - 1;
    }
        for (int i = 1;i<=9;i++) 
    {
            setLocation(i,0);
            Greenfoot.delay(5);
    }
    setLocation(1,10);
        for (int i = 1;i<=9;i++) 
    {
            int a=((2*i)-1);
            int b=-((-2 * i)+1);
            setLocation(a,b);
            Greenfoot.delay(5);
    }
        for (int i = 1;i<=9;i++) 
    {
            int angle = getRotation() - i;
            setRotation(angle);
            setLocation(i,5);
            Greenfoot.delay(10);
    }
    String GorkemGlasses = "Gorkem" + "Glasses" + ".jpg";
    setLocation(4,3);
    setImage(GorkemGlasses);
    GreenfootImage myNewImage = getImage();
    myNewImage.scale(500,500);
    for (int i = 1;i<=16;i++) {
            int angle = getRotation() - i;
            setRotation(angle);
            Greenfoot.delay(10);
    }
    setImage("gorkemluminati.jpg");
    setLocation(currentX, currentY);
    Greenfoot.delay(100);
    setRotation(0);
    setImage(imgFile);
    sitDown();
}
     public void myHobby(String s){
         System.out.println("I do not know how to breath");
}
}