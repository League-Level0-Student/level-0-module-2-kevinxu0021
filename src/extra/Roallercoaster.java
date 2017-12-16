package extra;

import javax.swing.JOptionPane;

public class Roallercoaster {
public static void main(String[] args) {
	
	
	 String answer = JOptionPane.showInputDialog("What is your height in inches?");
	 int height = Integer.parseInt(answer);
	 if(height > 48) {
		 JOptionPane.showMessageDialog(null, "You can go to the roallercoaster!");
	 }else {
		 JOptionPane.showMessageDialog(null, "You need to grow first.");
	 }
	 
}
}


