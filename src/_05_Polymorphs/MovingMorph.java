package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{

	public MovingMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	int xSpeed = 1;
	int ySpeed = 1;
	@Override
	public void update() {
		// TODO Auto-generated method stub
	x += xSpeed;
	y+=ySpeed;
	if (x<0) {
		xSpeed=1;
	}
	else if (x>400) {
		xSpeed=-1;
	}
	else if (y>450) {
		ySpeed=-1;
	}
	else if (y<0) {
		ySpeed=1;
	}
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLUE);
		g.fillOval(x, y, width, height);
		g.setColor(Color.BLACK);
		g.drawOval(x, y, width, height);
	}

}
