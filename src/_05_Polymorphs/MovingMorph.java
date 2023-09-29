package _05_Polymorphs;

import java.awt.Graphics;

public class MovingMorph extends Polymorph{

	public MovingMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
	x++;
	y--;
	if (x<0) {
		x++;
	}
	else if (x>900) {
		x--;
	}
	else if (y>600) {
		y--;
	}
	else if (y<0) {
		y++;
	}
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.fillOval(x, y, width, height);
	}

}
