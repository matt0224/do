package tw.matt;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class runPainter extends JFrame {
	private JButton open, save, exit;
	runPainter(){                
		super("�����{��"); //���ۤ����O  �U���}�l��JFram��k
		setSize(640,480);
		setVisible(true);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setDefaultCloseOperation(this.DISPOSE_ON_CLOSE); 
		
	}
	
	public static void main(String[] args) {
		new runPainter();

	}

}
