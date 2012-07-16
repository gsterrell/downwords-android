package polymath.gan.dw4a;

import java.util.List;
import java.util.Random;

import android.graphics.Color;
import android.view.MotionEvent;

import polymath.gan.dw4a.framework.Game;
import polymath.gan.dw4a.framework.Graphics;
import polymath.gan.dw4a.framework.Input.TouchEvent;
import polymath.gan.dw4a.framework.Pixmap;
import polymath.gan.dw4a.framework.Screen;

public class GameScreen extends Screen {
	enum GameState {
		Ready,
		Running,
		Paused,
		GameOver
	}
	
	GameState state = GameState.Ready;
	World world;
	int oldScore = 0;
	String score = "0";
	Random rand = new Random();
	
	
	
	public GameScreen(Game game) {
		super(game);
		world = new World();
	}
	
	@Override
	public void update(float deltaTime) {
		List<TouchEvent> touchEvents = game.getInput().getTouchEvents();
		game.getInput().getKeyEvents();
		
		if(state == GameState.Ready)
			updateReady(touchEvents);
		if(state == GameState.Running)
			updateRunning(touchEvents, deltaTime);
		if(state == GameState.Paused)
			updatePaused(touchEvents);
		if(state == GameState.GameOver)
			updateGameOver(touchEvents);
	}
	
	private void updateReady(List<TouchEvent> touchEvents) {
		if(touchEvents.size() > 0)
			state = GameState.Running;
	}
	
	private void updateRunning(List<TouchEvent> touchEvents, float deltaTime) {
		int len = touchEvents.size();
		for(int i = 0; i < len; i++){
		TouchEvent event = touchEvents.get(i);
			if(event.type == TouchEvent.TOUCH_DOWN) {
				if(event.x >= world.letter.x && event.y >= world.letter.y ) {
					if(event.x <= world.letter.x + 40 && event.y <= world.letter.y + 60){
					world.letter.advance();
					}	
				}
			}
		}
		
		world.update(deltaTime);
		if(world.gameOver) {
			if(Settings.soundEnabled)
				Assets.dropsound.play(1);
			state = GameState.GameOver;
		}
		if(oldScore != world.score) {
			oldScore = world.score;
			score = "" + oldScore;
			if(Settings.soundEnabled)
				Assets.dropsound.play(1);
		}
	}
	
	private void updatePaused(List<TouchEvent> touchEvents) {
			int len = touchEvents.size();
			for(int i = 0; i < len; i++) {
				TouchEvent event = touchEvents.get(i);
				//if(event.type == TouchEvent)
			}
	}
	
	private void updateGameOver(List<TouchEvent> touchEvents) {
			int len = touchEvents.size();
			for(int i = 0; i < len; i++) {
				TouchEvent event = touchEvents.get(i);
				//if(event.type == TouchEvent)
			}
	}
	
	@Override
	public void present(float deltaTime) { 
		
		Graphics g = game.getGraphics();
		
		g.drawPixmap(Assets.background1, 0, 0);
		
		drawWorld(world);
		if(state == GameState.Ready)
			drawReadyUI();
		if(state == GameState.Running)
			drawRunningUI();
		if(state == GameState.Paused)
			drawPausedUI();
		if(state == GameState.GameOver)
			drawGameOverUI();
		
		drawText(g, score, g.getWidth() / 2 - score.length()*20 / 2, 
				g.getHeight() - 42);
	}
	
	private void drawWorld(World world) {
		Graphics g = game.getGraphics();
		Letter letter = world.letter;
		
		Pixmap letterPixmap = null;
		if(letter.whichLetter == Letter.A)
			letterPixmap = Assets.level1A;
		if(letter.whichLetter == Letter.B)
			letterPixmap = Assets.level1B;
		if(letter.whichLetter == Letter.C)
			letterPixmap = Assets.level1C;
		if(letter.whichLetter == Letter.D)
			letterPixmap = Assets.level1D;
		if(letter.whichLetter == Letter.E)
			letterPixmap = Assets.level1E;
		if(letter.whichLetter == Letter.F)
			letterPixmap = Assets.level1F;
		if(letter.whichLetter == Letter.G)
			letterPixmap = Assets.level1G;
		if(letter.whichLetter == Letter.H)
			letterPixmap = Assets.level1I;
		if(letter.whichLetter == Letter.I)
			letterPixmap = Assets.level1I;
		if(letter.whichLetter == Letter.J)
			letterPixmap = Assets.level1J;
		if(letter.whichLetter == Letter.K)
			letterPixmap = Assets.level1K;
		if(letter.whichLetter == Letter.L)
			letterPixmap = Assets.level1O;
		if(letter.whichLetter == Letter.M)
			letterPixmap = Assets.level1M;
		if(letter.whichLetter == Letter.N)
			letterPixmap = Assets.level1N;
		if(letter.whichLetter == Letter.O)
			letterPixmap = Assets.level1O;
		if(letter.whichLetter == Letter.P)
			letterPixmap = Assets.level1P;
		if(letter.whichLetter == Letter.Q)
			letterPixmap = Assets.level1Q;
		if(letter.whichLetter == Letter.R)
			letterPixmap = Assets.level1R;
		if(letter.whichLetter == Letter.S)
			letterPixmap = Assets.level1S;
		if(letter.whichLetter == Letter.T)
			letterPixmap = Assets.level1T;
		if(letter.whichLetter == Letter.U)
			letterPixmap = Assets.level1U;
		if(letter.whichLetter == Letter.V)
			letterPixmap = Assets.level1V;
		if(letter.whichLetter == Letter.W)
			letterPixmap = Assets.level1W;
		if(letter.whichLetter == Letter.X)
			letterPixmap = Assets.level1X;
		if(letter.whichLetter == Letter.Y)
			letterPixmap = Assets.level1Y;
		if(letter.whichLetter == Letter.Z)
			letterPixmap = Assets.level1Z;
				
		int x = letter.x * 32;
		int y = letter.y * 32;
		g.drawPixmap(letterPixmap, x, y);
	}
		
	private void drawReadyUI() {
		Graphics g = game.getGraphics();
		g.drawLine(0, 416, 480, 416, Color.rgb(rand.nextInt(9), rand.nextInt(9), rand.nextInt(9)));
	}
	
	private void drawRunningUI() {
		Graphics g = game.getGraphics();
		g.drawLine(0, 416, 480, 416, Color.rgb(rand.nextInt(9), rand.nextInt(9), rand.nextInt(9)));
	}
	
	private void drawPausedUI() {
		Graphics g = game.getGraphics();
		g.drawLine(0, 416, 480, 416, Color.rgb(rand.nextInt(9), rand.nextInt(9), rand.nextInt(9)));
	}
	
	private void drawGameOverUI() {
		Graphics g = game.getGraphics();
		g.drawLine(0, 416, 480, 416, Color.rgb(rand.nextInt(9), rand.nextInt(9), rand.nextInt(9)));
	}
	
	private void drawText(Graphics g, String line, int x, int y){
		int len = line.length();
		for(int i = 0; i < len; i++) {
			char character = line.charAt(i);
			
			if(character == ' ') {
				x += 20;
				continue;
			}
			
			int srcX = 0;
			int srcWidth = 0;
			if(character == '.') {
				srcX = 200;
				srcWidth = 10;
			} else {
				srcX = (character - '0') * 20;
				srcWidth = 20;
			}
			
			g.drawPixmap(Assets.numbers, x, y, srcX, 0, srcWidth, 32);
			x += srcWidth;
		}
	}
	
	@Override
	public void pause() {
		if(state == GameState.Running)
			state = GameState.Paused;
		
		if(world.gameOver) {
			Settings.addScore(world.score);
			Settings.save(game.getFileIO());
		}
	}
	
	@Override
	public void resume() {}
	
	@Override
	public void dispose() {}
	
}
