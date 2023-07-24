import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;
/**
 * Write a description of class fondo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fondo extends World
{

    /**
     * Constructor for objects of class fondo.
     * 
     */
    public fondo()
    {    
        
        super(600, 400, 1); 
        barra b=new barra();
        addObject(b, 300, 250);
        
        basura basura= new basura();
        addObject(basura, 50, 400);
        
        reciclable re=new reciclable();
        addObject(re, 550, 400);
        
        //anico or= new organico();
        //addObject(or, 300, 0);
        
        inorganico in= new inorganico();
        addObject(in, 300, 0 );
    }
}
