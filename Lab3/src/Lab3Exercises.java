import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Giovanni Gardon");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(860, 440);
		myFrame.setSize(400, 250);
		myFrame.setVisible(true);
		
		MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
	}
}