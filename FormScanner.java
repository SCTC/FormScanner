/*
 *
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class FormScanner
{
	private static void buildGUI()
	{
		Font font_title = new Font("Arial", Font.PLAIN, 24);
	
		JFrame frame = new JFrame("WGF 2014 Checkin");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Winter GameFest 2014 Check-In");
		label.setFont(font_title);
		
		frame.getContentPane().add(label);
		
		frame.setVisible(true);
	}
	public static void main(String[] args)
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				buildGUI();
			}
		});
	}
}