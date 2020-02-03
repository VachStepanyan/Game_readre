import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Game_Readre extends JFrame {
	public static void main(String[] args) {

		Random rand = new Random();
		int rows = 2;
		int cols = 2;

		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

		JFrame jFrame = new JFrame("Game");
		jFrame.setLayout(null);
		jFrame.setBounds(0,0,700,800);
		JPanel panel = new JPanel();
		panel.setBounds(30,30,500,500);
		panel.setLayout(new GridLayout(rows,cols,0,0));


		final ArrayList<ImageIcon> gameCardCollector = new ArrayList<>();



		final ImageIcon queen = new ImageIcon("Game/Images/queen.png");
		final ImageIcon valet = new ImageIcon("Game/Images/valet.png");
		final ImageIcon seven = new ImageIcon("Game/Images/seven.png");
		final ImageIcon six = new ImageIcon("Game/Images/six.png");
		final ImageIcon two = new ImageIcon("Game/Images/two.png");
		final ImageIcon backCard = new ImageIcon("Game/Images/back.png");


		for (int i = 0; i < rows; i++) {
			gameCardCollector.add(queen);
		}
		for (int i = 0; i < cols; i++) {
			gameCardCollector.add(valet);
		}



		for (int i = 0; i < rows ; i++) {
			for (int j = 0; j < cols; j++) {

			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				JLabel label = new JLabel();
				label.setIcon(new ImageIcon(backCard.getImage().getScaledInstance(70, 120, Image.SCALE_SMOOTH)));
				panel.add(label);

				label.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						super.mouseClicked(e);
						int num = rand.nextInt(gameCardCollector.size());
						label.setIcon(new ImageIcon(gameCardCollector.get(num).getImage().getScaledInstance(70, 120, Image.SCALE_SMOOTH)));
						gameCardCollector.remove(num);
					}
				});
			}
		}


		jFrame.add(panel);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);


	}

}




