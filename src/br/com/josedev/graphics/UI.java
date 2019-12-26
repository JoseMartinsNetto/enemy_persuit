package br.com.josedev.graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import br.com.josedev.main.Game;

public class UI {
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(8, 4, 70, 8);
		
		g.setColor(Color.green);
		g.fillRect(8, 4, (int)((Game.player.life / Game.player.maxLife)* 70) , 8);
		
		g.setColor(Color.white);
		g.setFont(new Font("arial", Font.BOLD, 8));
		g.drawString((int)Game.player.life+"/"+(int)Game.player.maxLife,  30, 11);
		
	}
}
