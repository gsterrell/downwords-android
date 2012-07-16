package polymath.gan.dw4a;

import polymath.gan.dw4a.framework.Screen;
import polymath.gan.dw4a.framework.Game;
import polymath.gan.dw4a.framework.Graphics;
import polymath.gan.dw4a.framework.Graphics.PixmapFormat;

public class LoadingScreen extends Screen {
	
	public LoadingScreen(Game game) {
			super(game);
	}
	
	@Override
	public void update(float deltaTime) {
		Graphics g = game.getGraphics();
		Assets.mainmenu = g.newPixmap("mainmenu.png", PixmapFormat.ARGB4444);
		Assets.pausemenu = g.newPixmap("pausemenu.png", PixmapFormat.ARGB4444);
		Assets.buttons = g.newPixmap("buttons.png", PixmapFormat.ARGB4444);
		Assets.numbers = g.newPixmap("numbers.png", PixmapFormat.ARGB4444);
		Assets.points = g.newPixmap("allLevels/pts.png", PixmapFormat.ARGB4444);
		Assets.background1 = g.newPixmap("level1/background.png", PixmapFormat.RGB565);
		Assets.background2 = g.newPixmap("level2/background.png", PixmapFormat.RGB565);
		Assets.background3 = g.newPixmap("level3/background.png", PixmapFormat.RGB565);
		Assets.background4 = g.newPixmap("level4/background.png", PixmapFormat.RGB565);
		Assets.pts2l1 = g.newPixmap("level1/2pts.png", PixmapFormat.ARGB4444);
		Assets.pts3l1 = g.newPixmap("level1/3pts.png", PixmapFormat.ARGB4444);
		Assets.pts4l1 = g.newPixmap("level1/4pts.png", PixmapFormat.ARGB4444);
		Assets.pts2l2 = g.newPixmap("level2/2pts.png", PixmapFormat.ARGB4444);
		Assets.pts3l2 = g.newPixmap("level2/3pts.png", PixmapFormat.ARGB4444);
		Assets.pts4l2 = g.newPixmap("level2/4pts.png", PixmapFormat.ARGB4444);
		Assets.pts2l3 = g.newPixmap("level3/2pts.png", PixmapFormat.ARGB4444);
		Assets.pts3l3 = g.newPixmap("level3/3pts.png", PixmapFormat.ARGB4444);
		Assets.pts4l3 = g.newPixmap("level3/4pts.png", PixmapFormat.ARGB4444);
		Assets.clock1 = g.newPixmap("level1/clock.png", PixmapFormat.ARGB4444);
		Assets.clock2 = g.newPixmap("level2/clock.png", PixmapFormat.ARGB4444);
		Assets.clock3 = g.newPixmap("level3/clock.png", PixmapFormat.ARGB4444);
		Assets.clock4 = g.newPixmap("level4/clock.png", PixmapFormat.ARGB4444);
		Assets.doubleblock = g.newPixmap("level1/doubleblock.png", PixmapFormat.ARGB4444);
		Assets.leftblocks = g.newPixmap("level1/leftblocks.png", PixmapFormat.ARGB4444);
		Assets.middleblocks = g.newPixmap("level1/middleblocks.png", PixmapFormat.ARGB4444);
		Assets.rightblocks = g.newPixmap("level1/rightblocks.png", PixmapFormat.ARGB4444);
		Assets.sidepanel = g.newPixmap("level1/sidepanel.png", PixmapFormat.ARGB4444);
		Assets.sidepanel2 = g.newPixmap("level2/sidepanel.png", PixmapFormat.ARGB4444);
		Assets.sidepanel3 = g.newPixmap("level3/sidepanel.png", PixmapFormat.ARGB4444);
		Assets.sidepanel4 = g.newPixmap("level4/sidepanel.png", PixmapFormat.ARGB4444);
		Assets.singleblock = g.newPixmap("level1/singleblock.png", PixmapFormat.ARGB4444);
		Assets.level1A = g.newPixmap("level1/A.png", PixmapFormat.ARGB8888);
		Assets.level1B = g.newPixmap("level1/B.png", PixmapFormat.ARGB8888);
		Assets.level1C = g.newPixmap("level1/C.png", PixmapFormat.ARGB8888);
		Assets.level1D = g.newPixmap("level1/D.png", PixmapFormat.ARGB8888);
		Assets.level1E = g.newPixmap("level1/E.png", PixmapFormat.ARGB8888);
		Assets.level1F = g.newPixmap("level1/F.png", PixmapFormat.ARGB8888);
		Assets.level1G = g.newPixmap("level1/G.png", PixmapFormat.ARGB8888);
		Assets.level1H = g.newPixmap("level1/H.png", PixmapFormat.ARGB8888);
		Assets.level1I = g.newPixmap("level1/I.png", PixmapFormat.ARGB8888);
		Assets.level1J = g.newPixmap("level1/J.png", PixmapFormat.ARGB8888);
		Assets.level1K = g.newPixmap("level1/K.png", PixmapFormat.ARGB8888);
		Assets.level1L = g.newPixmap("level1/L.png", PixmapFormat.ARGB8888);
		Assets.level1M = g.newPixmap("level1/M.png", PixmapFormat.ARGB8888);
		Assets.level1N = g.newPixmap("level1/N.png", PixmapFormat.ARGB8888);
		Assets.level1O = g.newPixmap("level1/O.png", PixmapFormat.ARGB8888);
		Assets.level1P = g.newPixmap("level1/P.png", PixmapFormat.ARGB8888);
		Assets.level1Q = g.newPixmap("level1/Q.png", PixmapFormat.ARGB8888);
		Assets.level1R = g.newPixmap("level1/R.png", PixmapFormat.ARGB8888);
		Assets.level1S = g.newPixmap("level1/S.png", PixmapFormat.ARGB8888);
		Assets.level1T = g.newPixmap("level1/T.png", PixmapFormat.ARGB8888);
		Assets.level1U = g.newPixmap("level1/U.png", PixmapFormat.ARGB8888);
		Assets.level1V = g.newPixmap("level1/V.png", PixmapFormat.ARGB8888);
		Assets.level1W = g.newPixmap("level1/W.png", PixmapFormat.ARGB8888);
		Assets.level1X = g.newPixmap("level1/X.png", PixmapFormat.ARGB8888);
		Assets.level1Y = g.newPixmap("level1/Y.png", PixmapFormat.ARGB8888);
		Assets.level1Z = g.newPixmap("level1/Z.png", PixmapFormat.ARGB8888);
		Assets.letters = g.newPixmap("level1/stage1letters.png", PixmapFormat.ARGB4444);
		Assets.lettersold = g.newPixmap("level1/lettersold.png", PixmapFormat.ARGB4444);
		Assets.letterspaces = g.newPixmap("level1/letterspaces.png", PixmapFormat.ARGB4444);
		Assets.letter2 = g.newPixmap("level2/letter2.png", PixmapFormat.ARGB4444);
		Assets.letters2 = g.newPixmap("level2/letters.png", PixmapFormat.ARGB4444);
		Assets.letterspaces2 = g.newPixmap("level2/letterspaces.png", PixmapFormat.ARGB4444);
		Assets.letters3 = g.newPixmap("level3/letters.png", PixmapFormat.ARGB4444);
		Assets.letterspaces3 = g.newPixmap("level3/letterspaces.png", PixmapFormat.ARGB4444);
		Assets.letters4 = g.newPixmap("level4/letters.png", PixmapFormat.ARGB4444);
		Assets.letterspaces4 = g.newPixmap("level4/letterspaces.png", PixmapFormat.ARGB4444);
		Assets.logo = g.newPixmap("Downwards.ico", PixmapFormat.ARGB4444);
		Assets.click = game.getAudio().newSound("click.ogg");
		Assets.dropsound = game.getAudio().newSound("allLevels/dropsound.ogg");
		Assets.music01 = game.getAudio().newMusic("level1/music01.ogg");
		Assets.music02 = game.getAudio().newMusic("level2/music02.ogg");
		Assets.music03 = game.getAudio().newMusic("level3/music03.ogg");
		Assets.music04 = game.getAudio().newMusic("level4/music04.ogg");
		Assets.rainstorm = game.getAudio().newMusic("rainstorm.ogg");
		Settings.load(game.getFileIO());
		game.setScreen(new MainMenuScreen(game));
	}
	
	@Override
	public void present(float deltaTime) {}
	
	@Override
	public void pause() {}
	
	@Override
	public void resume() {}
	
	@Override
	public void dispose() {}

}
