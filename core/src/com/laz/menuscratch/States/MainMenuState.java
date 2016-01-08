package com.laz.menuscratch.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.laz.menuscratch.LAZMenuScratch;
/**
 * Created by Aidan on 2015-12-17.
 */
public class MainMenuState implements Screen{

    LAZMenuScratch lazMenuScratch;

    public MainMenuState (LAZMenuScratch lazMenuScratch){
this.lazMenuScratch=lazMenuScratch;
    }
@Override
public void show () {
}
    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1); //Red background.
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        if(Gdx.input.justTouched()){ //If you touch the screen, set the current state to be the play state, which will change to the game screen
            lazMenuScratch.setScreen(new Gamescreen(lazMenuScratch));
        }
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
    public void hide() { //This is called when the other screen is displayed.

    }

    @Override
    public void dispose() {

    }
   }