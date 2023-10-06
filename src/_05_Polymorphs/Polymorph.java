package _05_Polymorphs;

import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public abstract class Polymorph implements MouseMotionListener, MouseListener {
    public int x;
    public int y;
    public int width;
    public int height;
    
    public Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
   	 width = 100;
   	 height = 50;
    }
    
    public abstract void update();
    
    public abstract void draw(Graphics g);
    
}
