package com.geek.spaceshooter.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.geek.spaceshooter.game.SpaceGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		System.setProperty("user.name","\\xD0\\x9C\\xD0\\xB8\\xD1\\x85\\xD0\\xB0\\xD0\\xB8\\xD0\\xBB");
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 1280;
		config.height = 720;
		new LwjglApplication(new SpaceGame(), config);
	}
}
