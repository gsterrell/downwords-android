package polymath.gan.dw4a;

import javax.microedition.khronos.opengles.GL10;

import polymath.gan.dw4a.framework.Game;
import polymath.gan.dw4a.framework.Screen;
import polymath.gan.dw4a.framework.gl.FPSCounter;
import polymath.gan.dw4a.framework.gl.Texture;
import polymath.gan.dw4a.framework.gl.Vertices;
import polymath.gan.dw4a.framework.impl.GLGame;
import polymath.gan.dw4a.framework.impl.GLGraphics;
import java.util.List;
import java.util.ArrayList;

public class GameScreen extends GLGame {
	
	@Override
	public Screen getStartScreen() {
		return new LetterScreen(this);
	}
	 
	class LetterScreen extends Screen {
		static final int NUM_Letters = 10;
		GLGraphics glGraphics;
		Texture LetterTexture;
		Vertices LetterModel;
		Letter[] letters;
		FPSCounter fpsCounter;
		Letter letter;
	
		
		public LetterScreen(Game game) {
			super(game);
			glGraphics = ((GLGame)game).getGLGraphics();
			
			letters = new Letter[10];
			for (int i = 0; i < 10; i++) {
				letters[i] =  new Letter();
				
			}
						
			switch (Letter.whichLetter) {
			case Letter.A:
				LetterTexture = new Texture((GLGame)game, "level1/A.png");
				break;
			case Letter.B:
				LetterTexture = new Texture((GLGame)game, "level1/B.png");
				break;
			case Letter.C:
				LetterTexture = new Texture((GLGame)game, "level1/C.png");
				break;
			case Letter.D:
				LetterTexture = new Texture((GLGame)game, "level1/D.png");
				break;
			case Letter.E:
				LetterTexture = new Texture((GLGame)game, "level1/E.png");
				break;
			case Letter.F:
				LetterTexture = new Texture((GLGame)game, "level1/F.png");
				break;
			case Letter.G:
				LetterTexture = new Texture((GLGame)game, "level1/G.png");
				break;
			case Letter.H:
				LetterTexture = new Texture((GLGame)game, "level1/H.png");
				break;
			case Letter.I:
				LetterTexture = new Texture((GLGame)game, "level1/I.png");
				break;
			case Letter.J:
				LetterTexture = new Texture((GLGame)game, "level1/J.png");
				break;
			case Letter.K:
				LetterTexture = new Texture((GLGame)game, "level1/K.png");
				break;
			case Letter.L:
				LetterTexture = new Texture((GLGame)game, "level1/L.png");
				break;
			case Letter.M:
				LetterTexture = new Texture((GLGame)game, "level1/M.png");
				break;
			case Letter.N:
				LetterTexture = new Texture((GLGame)game, "level1/N.png");
				break;
			case Letter.O:
				LetterTexture = new Texture((GLGame)game, "level1/O.png");
				break;
			case Letter.P:
				LetterTexture = new Texture((GLGame)game, "level1/P.png");
				break;
			case Letter.Q:
				LetterTexture = new Texture((GLGame)game, "level1/Q.png");
				break;
			case Letter.R:
				LetterTexture = new Texture((GLGame)game, "level1/R.png");
				break;
			case Letter.S:
				LetterTexture = new Texture((GLGame)game, "level1/S.png");
				break;
			case Letter.T:
				LetterTexture = new Texture((GLGame)game, "level1/T.png");
				break;
			case Letter.U:
				LetterTexture = new Texture((GLGame)game, "level1/U.png");
				break;
			case Letter.V:
				LetterTexture = new Texture((GLGame)game, "level1/V.png");
				break;
			case Letter.W:
				LetterTexture = new Texture((GLGame)game, "level1/W.png");
				break;
			case Letter.X:
				LetterTexture = new Texture((GLGame)game, "level1/X.png");
				break;
			case Letter.Y:
				LetterTexture = new Texture((GLGame)game, "level1/Y.png");
				break;
				default:
				LetterTexture = new Texture((GLGame)game, "level1/Z.png");
			} 
			
			
			LetterModel = new Vertices(glGraphics, 4, 12, false, true);
			LetterModel.setVertices(new float[] { -16, -16, 0, 1,
												   16, -16, 1, 1,
												   16,  16, 1, 0,
												  -16,  16, 0, 0, }, 0, 16);
			LetterModel.setIndices(new short[] {0, 1, 2, 2, 3, 0}, 0, 6);
			
			fpsCounter = new FPSCounter();

		}

		@Override
		public void update(float deltaTime) {
			game.getInput().getTouchEvents();
			game.getInput().getKeyEvents();
			
			for(int i = 0; i < NUM_Letters; i++) {
				letters[i].update(deltaTime);
			}
			
		}

		@Override
		public void present(float deltaTime) {
			GL10 gl = glGraphics.getGL();
			gl.glClearColor(1,1,1,1);
			gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
			gl.glMatrixMode(GL10.GL_PROJECTION);
			gl.glLoadIdentity();
			gl.glOrthof(0, 320, 0, 480, 1, -1);
			
			gl.glEnable(GL10.GL_TEXTURE_2D);
			LetterTexture.bind();
			
			gl.glMatrixMode(GL10.GL_MODELVIEW);
			for(int i = 0; i < NUM_Letters; i++) {
				gl.glLoadIdentity();
				gl.glTranslatef(letters[i].x,letters[i].y, 0);
				gl.glRotatef(0, 0, 0, 1);
				gl.glScalef(2, 2, 0);
				LetterModel.draw(GL10.GL_TRIANGLES, 0, 6);
			}
			
			fpsCounter.logFrame();
		}

		@Override
		public void pause() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void resume() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void dispose() {
			// TODO Auto-generated method stub
			
		}
	}
}