package com.me.Crashed;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Titulo extends Image
{
	//posiciones inciales predeterminadas por el usuario
	public float PosX = 450;
	public float PosY = 190;
	
	Titulo()
	{
		//se llama la imagen y se hace un set X y Y con las variables establecidas previamente
		super(new Texture("data/CRASHED.png"));
		setX(PosX);
		setY(PosY);
	}
}
