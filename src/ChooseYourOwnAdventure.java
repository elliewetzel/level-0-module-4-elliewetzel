import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Once upon a time, in a far away ");
		int setting = JOptionPane.showOptionDialog(null, "Choose the option you prefer?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "land", "swamp", "kingdom" , "palace"}, null);
		if(setting == 0) {
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
		else if(setting == 1) {
			JOptionPane.showMessageDialog(null, "You will embark on a journey.");
			JOptionPane.showMessageDialog(null, "The swamp is filled with piranhas and crocodiles.");
			int swamp = JOptionPane.showOptionDialog(null, "What do you do?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"Jump on to of the crocodiles" , "Go around" , "Give up"}, null);
			if(swamp == 0) {
				JOptionPane.showMessageDialog(null, "You start out succesful, but are then eaten by the crocodiles.");
			}
			else if (swamp == 1) {
				JOptionPane.showConfirmDialog(null, "You continue on your quest.");
			}
			else {
				JOptionPane.showMessageDialog(null, "You absolutely suck.");
			}
			}
		else if(setting == 2) {
			JOptionPane.showMessageDialog(null, "You will embark on a journey.");
			JOptionPane.showMessageDialog(null, "A dragon comes and terrorizes your kingdom.");
			int kingdom = JOptionPane.showOptionDialog(null, "Do you, ", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] {"Go to slay it" , "Cower in fear" , "Give up"}, null);
			if(kingdom == 0) {
				JOptionPane.showMessageDialog(null, "You are succesful.");
			}
			else if(kingdom == 1) {
				JOptionPane.showMessageDialog(null, "The dragon steps on the place where you hide.");
			}
			else {
				JOptionPane.showMessageDialog(null, "You are such a disappointment.");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Today is your day off, congradulations.");
			
		}
	}
}
