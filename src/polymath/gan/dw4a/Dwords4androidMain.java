package polymath.gan.dw4a;

import polymath.gan.dw4a.framework.Screen;
import polymath.gan.dw4a.framework.impl.AndroidGame;

public class Dwords4androidMain extends AndroidGame {
    @Override
    public Screen getStartScreen() {
    	return new LoadingScreen(this);
    }
}