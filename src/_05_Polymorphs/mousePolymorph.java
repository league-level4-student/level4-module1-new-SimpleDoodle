package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class mousePolymorph extends Polymorph implements MouseMotionListener {
	int mouseX = 300;
	int mouseY = 300;
	public mousePolymorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.GREEN);
		g.fillRect(x, y, 80, 80);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		x = mouseX;
		y = mouseY;
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseX = e.getXOnScreen();
		System.out.println(mouseX);
		mouseY = e.getYOnScreen();
	}



}
