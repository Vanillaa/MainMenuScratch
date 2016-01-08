package com.laz.menuscratch;

import com.badlogic.gdx.Game;
import com.laz.menuscratch.States.Gamescreen;
import com.laz.menuscratch.States.MainMenuState;

/**
 * Created by Aidan on 2015-12-17.
 */
public class LAZMenuScratch extends Game{

    MainMenuState mainMenuState;
    Gamescreen gamescreen;

    @Override
    public void create () {

        mainMenuState = new MainMenuState(this);
        gamescreen = new Gamescreen(this);

        setScreen(mainMenuState);
    }
}
