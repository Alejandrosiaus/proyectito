import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class organico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class organico extends Actor
{
    public organico()
    {
        GreenfootImage myImage = getImage();
        myImage.scale(100, 100);
    }
    private int velocidadY = 0;
    private int velocidadX = 3; 

    public void act() {
        //gravedad
        velocidadY = velocidadY + 1; 

        // choca con la barra
        Actor barra = getOneIntersectingObject(barra.class);
        if (barra != null) {
            velocidadY = -velocidadY; 
            velocidadX = -velocidadX; 
        }

        
        setLocation(getX() + velocidadX, getY() + velocidadY);

        // desaparece abajo
        if (getY() >= getWorld().getHeight() - getImage().getHeight() / 2) {
            getWorld().removeObject(this);
        }
    }
}
