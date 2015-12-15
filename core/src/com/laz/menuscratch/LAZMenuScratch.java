package com.laz.menuscratch;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.utils.Align;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javafx.stage.Screen;
public class LAZMenuScratch implements {

	SpriteBatch batch;
	Texture txBackground;
	//TextureAtlas taButton;
	ImageButton.ImageButtonStyle ibsStart;
	ImageButton ibStart;
	Stage stage;
	ScreenHandler screenHandler;
	
	public LAZMenuScratch (ScreenHandler _screenhandler){
this.screenHandler = _screenhandler;
		stage = new Stage();
		Gdx.input.setInputProcessor(stage);
        batch = new SpriteBatch();
		txBackground = new Texture ("background.png");


	public void render (float delta) {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(txBackground, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		batch.end();
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();
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
		public void hide() {

		}

		@Override
		public void dispose() {

		}
	}




