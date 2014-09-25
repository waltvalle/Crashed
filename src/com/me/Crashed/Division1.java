package com.me.Crashed;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Division1 extends Image 
{
	//Estas variables publicas con valores predeterminados por el usuario se pueden llamar y modificar desde cualquier clase
	public float PosY = 1150;
	public float PosX = 155;
	public float Movimiento = 7;
	Division1()
	{
		//Se llama la imagen interna para el carro y establezco las posiciones en X y Y
		super(new Texture("data/division1.png"));
		this.setY(PosY);
		this.setX(PosX);
	}
	public void act(float delta)
	{
		//aqui se crea el movimiento con un set y get restandole la variable movimiento
		setY(getY()- Movimiento);
		
		//este if sirve como limite, si se cumple regresa a la posicion inical en Y
		if (getY() < -150)
			setY(PosY);
			
	}

}