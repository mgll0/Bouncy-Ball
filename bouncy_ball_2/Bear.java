import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class Bear extends Actor
{
    private int offsetX = 5;
    private int offsetY = 5;
    private int nextOffset = 5;
    private int counterAddObject = 0;
    //private Random random = new Random();
    
    public Bear(){
        offsetX = nextOffset;
        offsetY = nextOffset;
        
        nextOffset += 3;
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
        
        Turtle turtle = (Turtle) getOneIntersectingObject(Turtle.class);
        
        if(turtle != null && counterAddObject == 0){
            counterAddObject = 10;
            World world = getWorld();
            Bomb bomb = new Bomb();
            world.addObject(bomb,x,y);
        }
        if (counterAddObject > 0){
            counterAddObject --;
        }
        
        
    }
}
