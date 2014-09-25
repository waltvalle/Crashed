package com.me.Crashed;


import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;



public class Crashed implements ApplicationListener, InputProcessor
{
	//Instanciacion de todos los objetos(actors) dentro del juego
	Stage stage;
	Image image;
	static CarroUsuario carro_usuario;
	static Carro1 carro1;
	static Carro2 carro2;
	static Carro3 carro3;
	static Division1 division1;
	static Division2 division2;
	static Division3 division3;
	static Division4 division4;
	static Titulo titulo;
	//Establezco variables globales para los puntos vidas y un limite para ganar el juego
	public static int Puntos = 0;
	public static int Vidas = 3;
	public static int GanaJuego = 2000;
	
	
	@Override
	public void create()
	{
		//Desde aqui se inicializan todos los objetos que contendra el juego incluyendo el fondo y cada uno de los actors
		stage = new Stage();
		image = new Image(new Texture(Gdx.files.internal("data/calle.png")));
		stage.addActor(image);
		carro1 = new Carro1();
		carro2 = new Carro2();
		carro3 = new Carro3();
		stage.addActor(carro1);
		stage.addActor(carro2);
		stage.addActor(carro3);
		carro_usuario = new CarroUsuario(carro1, carro2, carro3);
		stage.addActor(carro_usuario);
		stage.addActor(new Titulo());
		stage.addActor(new Division1());
		stage.addActor(new Division2());
		stage.addActor(new Division3());
		stage.addActor(new Division4());
		
		//Con esta linea le doy el control de cualquier input al objeto CarroUsuario
		Gdx.input.setInputProcessor(carro_usuario);	
	}

	@Override
	public void dispose() {
	}

	@Override
	public void render() 
	{
		//Opciones predeterminadas del metodo render
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		stage.draw();
		stage.act();
		
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	@Override
	public boolean keyDown(int keycode)
	{
		return false;
	}
	
	//Metodos creados por la implementacion InputProcessor

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
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