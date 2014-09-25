package com.me.Crashed;

import javax.swing.JOptionPane;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Carro3 extends Image
{
	//Estas variables publicas con valores predeterminados por el usuario se pueden llamar y modificar desde cualquier clase
	public static float PosY = 2250;
	public static float PosX = 315;
	public float Movimiento = 7;

	Carro3()
	{
		//Se llama la imagen interna para el carro y establezco las posiciones en X y Y
		super(new Texture("data/carro1.png"));
		this.setY(PosY);
		this.setX(PosX);
	}
	public void act(float delta)
	{

		//Este es el movimiento que tendra el carro haciendo un set y get RESTANDO el movimiento establecido
		setY(getY()- Movimiento);
		//este if establece una frontera o limite
		if (getY() < -100)
		{
			//si se llega el limite se suman 100  puntos y el carro vuelve a su posicion en Y
			Crashed.Puntos = Crashed.Puntos + 100;
			System.out.println("Puntos: " + Crashed.Puntos);
			setY(PosY);
		}
		// este if se encarga de tomar la posicion que tiene el carro(verde) y compararlo con el carro_usuario sumandole la altura de el carro verde para que el calculo sea exacto 
		if (getY() <= Crashed.carro_usuario.getY() + this.getImageHeight() && getX() == Crashed.carro_usuario.getX())
		{	
			//si se cumple la condicion se resta una vida y el carro vuelve a la posicion inicial
			Crashed.Vidas = Crashed.Vidas - 1;
			System.out.println("Te quedan "+Crashed.Vidas + " vidas!");
			setY(PosY);
		}
		//este if compara los puntos acumulados con la variable GanaJuego de la clase principal
		if(Crashed.Puntos == Crashed.GanaJuego)
		{
			// si son iguales se muestra un mensaje de victoria con los puntos acumulados y el juego termina
			JOptionPane.showMessageDialog(null, Crashed.GanaJuego + " PUNTOS! Haz ganado!");
			System.exit(0);
		}
		//este if compara las vidas con 0
		if (Crashed.Vidas <= 0)
		{
			//si es igual a 0 se muestra un mensaje de derrota y el juego termina
			System.out.println("Haz Perdido :(");
			JOptionPane.showMessageDialog(null, "Haz Perdido :( Puntaje: " + Crashed.Puntos);
			System.exit(0);
		}
	}
}