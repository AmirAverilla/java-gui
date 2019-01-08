import javax.swing.Jframe;

public class BasicElements{

	public static void main (String[] args){
		Jframe myFrame = new Jframe();

		myFrame.setDefaultCLoseOperation(myFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setSize(900, 600);
		
		System.out.println("basic java elements");

	}
}