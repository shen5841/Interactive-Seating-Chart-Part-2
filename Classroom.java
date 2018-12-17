import java.util.*;
import greenfoot.*;
import java.util.ArrayList;
 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
 * Write a description of class Classroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Classroom extends World
{
    private ArrayList<Object> listo = new ArrayList<Object>();
    
    private GreenfootSound disco = new GreenfootSound("disco.wav");
    private GreenfootSound snap = new GreenfootSound("snap.wav"); 
    private GreenfootSound balanced = new GreenfootSound("balanced.wav");
    
    public static boolean isSnap = false;
    //Janice Liu worked on the disco sound
    /**
     * Constructor for objects of class Classroom.
     * 
     */
    public Classroom()
    {    
        // Create a new world with 10x6 cells with a cell size of 130x130 pixels.
        super(10, 6, 130); 
        prepare();

    }
    
    public void act(){
        //Gorkem Guclu worked on these commands
        if (Greenfoot.isKeyDown("space")) { 
            disco.play(); 
        } else {
            disco.stop();
        }
        //Ayra Jafri did stuff. Like this i guess.
        if(Greenfoot.isKeyDown("e")) {
                    snap.play();
                    balanced.play();
        } else {
                    snap.stop();
                    balanced.stop();
        }
    }
    private void prepare() {
        AadhavSivakumar aadhavSivakumar = new AadhavSivakumar();
        addObject(aadhavSivakumar, aadhavSivakumar.GetSeat(), aadhavSivakumar.GetRow());
        AlexMiller alexMiller = new AlexMiller();
        addObject(alexMiller, alexMiller.GetSeat(), alexMiller.GetRow());
        AnvithaKachinthaya anvithaKachinthaya = new AnvithaKachinthaya();
        addObject(anvithaKachinthaya, anvithaKachinthaya.GetSeat(), anvithaKachinthaya.GetRow());
        AriStassinopoulos ariStassinopoulos = new AriStassinopoulos();
        addObject(ariStassinopoulos, ariStassinopoulos.GetSeat(), ariStassinopoulos.GetRow());
        AudreyIm audreyIm = new AudreyIm();
        addObject(audreyIm, audreyIm.GetSeat(), audreyIm.GetRow());
        AylaTeittinen aylaTeittinen = new AylaTeittinen();
        addObject(aylaTeittinen, aylaTeittinen.GetSeat(), aylaTeittinen.GetRow());
        AyraJafri ayraJafri = new AyraJafri();
        addObject(ayraJafri, ayraJafri.GetSeat(), ayraJafri.GetRow());
        DanielZhong danielZhong = new DanielZhong();
        addObject(danielZhong, danielZhong.GetSeat(), danielZhong.GetRow());
        EvanXu evanXu = new EvanXu();
        addObject(evanXu, evanXu.GetSeat(), evanXu.GetRow());
        FelixShen felixShen = new FelixShen();
        addObject(felixShen, felixShen.GetSeat(), felixShen.GetRow());
        GorkemGuclu gorkemGuclu = new GorkemGuclu();
        addObject(gorkemGuclu, gorkemGuclu.GetSeat(), gorkemGuclu.GetRow());
        JaniceLiu janiceLiu = new JaniceLiu();
        addObject(janiceLiu, janiceLiu.GetSeat(), janiceLiu.GetRow());
        JaredPippin jaredPippin = new JaredPippin();
        addObject(jaredPippin, jaredPippin.GetSeat(), jaredPippin.GetRow());
        JeffreyTian jeffreyTian = new JeffreyTian();
        addObject(jeffreyTian, jeffreyTian.GetSeat(), jeffreyTian.GetRow());
        JustinThai justinThai = new JustinThai();
        addObject(justinThai, justinThai.GetSeat(), justinThai.GetRow());
        KevinLi kevinLi = new KevinLi();
        addObject(kevinLi, kevinLi.GetSeat(), kevinLi.GetRow());
        ManasTaneja manasTaneja = new ManasTaneja();
        addObject(manasTaneja, manasTaneja.GetSeat(), manasTaneja.GetRow());
        ManavKant manavKant = new ManavKant();
        addObject(manavKant, manavKant.GetSeat(), manavKant.GetRow());
        MicahBoursier micahBoursier = new MicahBoursier();
        addObject(micahBoursier, micahBoursier.GetSeat(), micahBoursier.GetRow());
        NaveenSoundram naveenSoundram = new NaveenSoundram();
        addObject(naveenSoundram, naveenSoundram.GetSeat(), naveenSoundram.GetRow());
        RoshniVakil roshniVakil = new RoshniVakil();
        addObject(roshniVakil, roshniVakil.GetSeat(), roshniVakil.GetRow());
        SafwanKasim safwanKasim = new SafwanKasim();
        addObject(safwanKasim, safwanKasim.GetSeat(), safwanKasim.GetRow());
        SankalpKumar sankalpKumar = new SankalpKumar();
        addObject(sankalpKumar, sankalpKumar.GetSeat(), sankalpKumar.GetRow());
        SheljaSarin sheljaSarin = new SheljaSarin();
        addObject(sheljaSarin, sheljaSarin.GetSeat(), sheljaSarin.GetRow());
        ShyamPandya shyamPandya = new ShyamPandya();
        addObject(shyamPandya, shyamPandya.GetSeat(), shyamPandya.GetRow());
        ThomasChou thomasChou = new ThomasChou();
        addObject(thomasChou, thomasChou.GetSeat(), thomasChou.GetRow());
    }
}
