package com.me.Crashed;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.me.Crashed.Carro1;
import com.me.Crashed.Carro2;
import com.me.Crashed.Carro3;

public class CarroUsuario extends Image implements InputProcessor
{
	//estas variables son para asignarle una posicion como limite a los carriles
	public float Carril1 = 30, Carril2 = 170, Carril3 = 315;
    public int MiCarrilActual = 2;	
	
    //la posicion inicial sera el carril 2 
    public float PosX = Carril2;
    //Hago la instanciacion de 3 variables para los 3 carros
	Carro1 car1;
	Carro2 car2;
	Carro3 car3;
	
	//Esta funcion tendra como parametros las clases u objetos con su respectiva variable
	public CarroUsuario(Carro1 c1, Carro2 c2, Carro3 c3)
	{
		super(new Texture("data/carrousuario.png"));
		//se llama la imagen y se establecen las variables creadas anteriormente como las variables dentro del metodo
		this.car1 = c1;
		this.car2 = c2;
		this.car3 = c3;
		this.setX(PosX);
	}

	//Funciones creadas por el InputProcessor
	@Override
	public boolean keyDown(int keycode)
	{
		//Aqui se atrapa el codigo de cualquier tecla, la izquierda tiene codigo 21 y se compara en el if
		if (keycode == 21)
		{
			//si se cumple la condicion MiCarrilActual sera igual a lo que tenga en ese momento restandole 1 (iria a la izquierda)
			MiCarrilActual= MiCarrilActual - 1;
			//si el carril actual es igual a 1 entonces se queda en 1
			if (MiCarrilActual < 1)
				MiCarrilActual = 1;
			
		}
		//Aqui se atrapa el codigo de cualquier tecla, la derecha tiene codigo 22 y se compara en el if
		if (keycode == 22)
		{
			//si se cumple la condicion MiCarrilActual sera igual a lo que tenga en ese momento sumandole 1 (iria a la derecha)
			MiCarrilActual= MiCarrilActual + 1;
			//si el carril actual es igual a 3 entonces se queda en 3
			if (MiCarrilActual > 3)
				MiCarrilActual = 3;
		}
		//este switch tendra como parametro la variable MiCarrilActual
		switch (MiCarrilActual)
		{
		//en el caso 1 se hara un set del carril actual en el carril 1
		case 1:
			setX(Carril1);
			break;
		case 2:
		//en el caso 1 se hara un set del carril actual en el carril 1
			setX(Carril2);
			break;
		//en el caso 1 se hara un set del carril actual en el carril 1
		case 3:
			setX(Carril3);
			break;
		}
		return false;
	}
	

	public boolean keyUp(int keycode) 
	{
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button)
	{
//		ESTE ES EL RESET. Funciona como un listener ya que es un touchDown
//		Hago los 3 sets en el eje Y para las variables anteriormente establecidas y se envian a su posicion inicial asi como las demas variables vuelven a tener su valor inicial
		car1.setY(1050);
		car2.setY(1450);
		car3.setY(1450);
		Crashed.Puntos = 0;
		Crashed.Vidas = 3;
	    System.out.println("RESET");
	    System.out.println("Puntos: " + Crashed.Puntos);
	    System.out.println("Vidas: " + Crashed.Vidas);
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}
	
		
}
	

	