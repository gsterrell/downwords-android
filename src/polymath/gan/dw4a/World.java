package polymath.gan.dw4a;

import java.util.Random;


public class World {
	
	static final int WORLD_WIDTH = 10;
	static final int WORLD_HEIGHT = 13;
	static final float TICK_INITIAL = 0.5f;
	
	public Letter letter;
	public Clock clock = new Clock(10);
	public boolean gameOver = false;
	public boolean letter1placed = false;
	public boolean letter2placed = false;
	public boolean letter3placed = false;
	public boolean letter4placed = false;
	public boolean isWord = false;
	public int score = 0;
	public boolean pointGoalMet = false;
	
	boolean fields[][] = new boolean [WORLD_WIDTH][WORLD_HEIGHT];
	Random random = new Random();
	float tickTime = 0;
	static float tick = TICK_INITIAL;
	
	public World() {
		
		placeLetter();
	}
	
	private void placeLetter() {	
		for (int x = 0; x < WORLD_WIDTH; x++) {
			for (int y = 0; y < WORLD_HEIGHT; y++) {
				fields[x][y] = false;
			}
		}
	int letterX = random.nextInt(WORLD_WIDTH);
	int marker = letterX;
	int letterY = 0; 
	while(true) {	
		if(fields[letterX][letterY] == false)
			break;
		letterX += 1;
		if(letterX >= WORLD_WIDTH){
			letterX = 0;
		
		}
	}
	
	letter = new Letter(letterX, letterY, random.nextInt(25));
	if(letter.x == marker)
		letter.x = random.nextInt(WORLD_WIDTH);
	}
	
	
	

	public void update(float deltaTime) {
		if(gameOver) 
			return;
		
		tickTime += deltaTime;
		
		while(tickTime > tick) {
			tickTime -= tick;
			letter.advance();
		int Y = letter.getY();
		if( Y >= WORLD_HEIGHT/2){
			placeLetter();
		}
			
			
		}	
			
	}
		
	
	
	

}
