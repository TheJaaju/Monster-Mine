import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseInput extends MouseAdapter{
	
	
	private Handler handler;
	private GameObject tempPlayer = null;
	
	public MouseInput(Handler handler) {
		this.handler = handler;
	}
	
	public void findPlayer() {
		for(int i = 0; i < handler.object.size(); i++) {
			if(handler.object.get(i).getId() == ID.Player) {
				tempPlayer = handler.object.get(i);
				break;
			}
		}
	}
	
	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		
		if(tempPlayer != null) {
			GameObject tempBullet = handler.addObject(new Bullet(tempPlayer.x+16, tempPlayer.y+16, ID.Bullet));
		}else findPlayer();
	
	}
	
}