package com.laz.menuscratch.States;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.laz.menuscratch.LAZMenuScratch;

/**
 * Created by Aidan on 2015-12-17.
 */
public class Gamescreen implements Screen{

    LAZMenuScratch LAZMenuscratch;

    public Gamescreen(LAZMenuScratch LAZMenuscratch ){
        this.LAZMenuscratch=LAZMenuscratch;
    }
    @Override
    public void show(){
}
    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 1, 1); //Blue background.
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
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

