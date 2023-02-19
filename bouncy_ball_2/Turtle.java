import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Actor
{
    private int offsetX;
    private int offsetY;
    private static int nextOffset = 15;
    //private Random random = new Random();
    
    public Turtle(){
        offsetX = -nextOffset;
        offsetY = -nextOffset;
        
        if (nextOffset > 5){
            nextOffset -= 3;
        }
    }
    
    
    
    public void act()
    {
        int x = getX();
        int y = getY();
        
        setLocation(x + offsetX, y + offsetY);
        
        if (getY() >= 399 || getY() <= 0){
            offsetY *= -1;
        }

         if (getX() >= 599 || getX() <= 0){
                offsetX *= -1;
        }
        
        
    }
}
