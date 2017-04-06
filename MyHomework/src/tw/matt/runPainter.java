package tw.matt;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class runPainter extends JFrame {
	private JButton open, save, exit;
	runPainter(){                
		super("視窗程式"); //取自父類別  下面開始取JFram方法
		setSize(640,480);
		setVisible(true);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setDefaultCloseOperation(this.DISPOSE_ON_CLOSE); 
		
	}
	
	public static void main(String[] args) {
		new runPainter();

	}

}
