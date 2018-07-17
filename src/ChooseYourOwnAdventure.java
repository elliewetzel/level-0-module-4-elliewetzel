import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Once upon a time, in a far away ");
		int setting = JOptionPane.showOptionDialog(null, "Choose the option you prefer?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "land", "swamp", "kingdom" , "palace"}, null);
		if(setting == 3) {
			JOptionPane.showMessageDialog(null, "You will embark on a journey.");
			JOptionPane.showMessageDialog(null, "You have made it as far as the lake of killer poison.");
			int poison =  JOptionPane.showOptionDialog(null, "What do you do?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Go around", "Balance on the precariously placed tree that reaches across", "Take the risk and try to swim"}, null);
			if(poison == 2) {
				JOptionPane.showMessageDialog(null, "You have died");
			}
			else if(poison == 1) {
				JOptionPane.showMessageDialog(null, "The tree breaks, and you fall in.  Then you die");
			}
			else {
				JOptionPane.showMessageDialog(null, "You make it across, and you continue on your quest.");
			}
		}
		else if(setting == 2) {
			JOptionPane.showMessageDialog(null, "You will embark on a journey.");
			
			
		}
		else if(setting == 1) {
			JOptionPane.showMessageDialog(null, "You will embark on a journey.");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "You will embark on a journey.");
			
		}
	}
}
