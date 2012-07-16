package polymath.gan.dw4a.framework;

import polymath.gan.dw4a.framework.Graphics.PixmapFormat;

public interface Pixmap {
	
	public int getWidth();
	
	public int getHeight();
	
	public PixmapFormat getFormat();
	
	public void dispose();

}
