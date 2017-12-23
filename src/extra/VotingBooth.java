package extra;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	
	String Answer = JOptionPane.showInputDialog("How old are you?");
	int age = Integer.parseInt(Answer);
	if(age > 18) {
		String answer = JOptionPane.showInputDialog("Who the next president should be?");
		System.out.println(answer);
	}else {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think about who the next president should be!");
	}
}
}
