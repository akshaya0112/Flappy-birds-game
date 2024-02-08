package flappybirds;
import Flappybackend.Objects; import Flappybackend.SoundPlayer; import java.awt.Rectangle;
import java.io.File;
public class Bird extends Objects{
 
private float vt = 0;
private boolean isFlying = false; private Rectangle rect;
private boolean isLive=true;
public SoundPlayer f1apSound, bupSound, getMoneySound;


public Bird(int x, int y, int w, int h){ super(x, y, w, h);
rect = new Rectangle(x, y, w, h);
f1apSound= new SoundPlayer(new File("Assets/flap.wav")); bupSound = new SoundPlayer(new File("Assets/bup.wav"));
getMoneySound = new SoundPlayer(new File("Assets/getMoney.wav"));
}
public void setLive(boolean b){ isLive=b;
}
public boolean getLive(){ return isLive;
}
public Rectangle getRect(){ return rect;
}
public void setVt(float vt){ this.vt=vt;
}
public void update(long deltaTime){ vt+=FlappyBirds.g; this.setPosY(this.getPosY()+vt);
this.rect.setLocation((int) this.getPosX(),(int) this.getPosY());
 
if(vt < 0) isFlying = true; else isFlying = false;
}
public void fly(){ vt = -3; f1apSound.play();
}
public boolean getIsFlying()
{
return isFlying;
}
}
