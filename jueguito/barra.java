import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class barra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class barra extends Actor
{
    /**
     * Act - do whatever the barra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static final int INCLINACION_GRADOS = 15; // Grados de inclinación

        public void act() {
            checkKeys();
        }

        private void checkKeys() {
            if (Greenfoot.isKeyDown("left")) {
            inclinarIzquierda();
            } else if (Greenfoot.isKeyDown("right")) {
            inclinarDerecha();
            }
        }

        private void inclinarIzquierda() {
            GreenfootImage imagenOriginal = getImage();
            GreenfootImage nuevaImagen = new GreenfootImage(imagenOriginal);
            nuevaImagen.rotate(-INCLINACION_GRADOS);
            setImage(nuevaImagen);
        }

        private void inclinarDerecha() {
            GreenfootImage imagenOriginal = getImage();
            GreenfootImage nuevaImagen = new GreenfootImage(imagenOriginal);
            nuevaImagen.rotate(INCLINACION_GRADOS);
            setImage(nuevaImagen);
        }
    
    public barra()
    {
        GreenfootImage myImage = getImage();
        myImage.scale(600, 300);
        
        
    }
}
