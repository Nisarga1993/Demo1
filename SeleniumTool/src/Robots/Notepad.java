package Robots;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
/**
 * 
 * @author NISARGA
 *
 */

public class Notepad {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		Runtime.getRuntime().exec("notepad");
		Thread.sleep(1000);
		
		Robot r=new Robot();
r.keyPress((KeyEvent.VK_SHIFT));
r.keyPress((KeyEvent.VK_H));
r.keyRelease((KeyEvent.VK_SHIFT));
Thread.sleep(1000);
r.keyPress((KeyEvent.VK_I));

for(int i=10;i<=500;i=+10)
{
	r.mouseMove(200+i, 500);
	Thread.sleep(1000);
}

	}

}
