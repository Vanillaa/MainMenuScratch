package com.laz.menuscratch;

/**
 * Created by Aidan on 2015-12-14.
 */
public class ScreenHandler extends LAZMenuScratch {
    GameScreen = new GameScreen(this);
    LAZMenuScratch = new LAZMenuScratch(this);
    setScreen(LAZMenuScratch);
}
    public void screenChange(String sBtn) {
        if (sBtn.equalsIgnoreCase("play")) {
        setScreen(GameScreen);

        }
        }
        }

