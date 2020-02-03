import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Game_Readre extends JFrame {
		public static void main(String[] args) { 
			 	

			JFrame jFrame = new JFrame("Game");
	        jFrame.setLayout(null);
	        jFrame.setBounds(0,0,1000,500);
	        JPanel jPanel1 = new JPanel();
	        JPanel jPanel2 = new JPanel();
	        JPanel jPanel3 = new JPanel();
	        JPanel jPanel4 = new JPanel();
	        final ArrayList<ImageIcon> game = new ArrayList<ImageIcon>();
	        
	        jPanel1.setBounds(50,50,190,280);
	        jPanel2.setBounds(250,50,190,280);
	        jPanel3.setBounds(450,50,190,280);
	        jPanel4.setBounds(650,50,190,280);

	        final ImageIcon queen = new ImageIcon("C:/Users/Vach/Desktop/queen_of_diamonds2.png");
	        final ImageIcon card = new ImageIcon("C:/Users/Vach/Desktop/images.png");
	        final ImageIcon back = new ImageIcon("C:/Users/Vach/Desktop/45.PNG");
	        
	        final JLabel image1 = new JLabel(queen);
	        image1.setBounds(642, 230, 100, 100);
	        image1.setVisible(false);
	        
	        
	        
	        
	        final JLabel image2 = new JLabel(back);
	        image2.setBounds(642, 230, 100, 100);
	        image2.setVisible(true);
	        
	        image2.addMouseListener(new MouseAdapter() {
		        
	     	   
	        	@Override
                public void mousePressed(MouseEvent e) {	
	        		image2.setVisible(false);
	        		image1.setVisible(true);
	        		game.add(image1);
	        	}
	        	});
	        
	        final JLabel image3 = new JLabel(queen);
	        image3.setBounds(642, 230, 100, 100);
	        image3.setVisible(false);
	        if(image3.getIcon().equals(image1.getIcon())) {
	        	
	        }
	        
	        final JLabel image4 = new JLabel(back);
	        image4.setBounds(642, 230, 100, 100);
	        image4.setVisible(true);
	        
	        image4.addMouseListener(new MouseAdapter() {
		        
		     	   
	        	@Override
                public void mousePressed(MouseEvent e) {	
	        		image4.setVisible(false);
	        		image3.setVisible(true);
	        	}
	        	});
	        
	        final JLabel image5 = new JLabel(card);
	        image5.setBounds(642, 230, 100, 100);
	        image5.setVisible(false);
	        
	        final JLabel image6 = new JLabel(back);
	        image6.setBounds(642, 230, 100, 100);
	        image6.setVisible(true);
	        
	        image6.addMouseListener(new MouseAdapter() {
		        
		     	   
	        	@Override
                public void mousePressed(MouseEvent e) {	
	        		image6.setVisible(false);
	        		image5.setVisible(true);
	        	}
	        	});
	        
	        
	        final JLabel image7 = new JLabel(card);
	        image7.setBounds(642, 230, 100, 100);
	        image7.setVisible(false);
	        
	        final JLabel image8 = new JLabel(back);
	        image8.setBounds(642, 230, 100, 100);
	        image8.setVisible(true);
	        	       
	        image8.addMouseListener(new MouseAdapter() {
		        
		     	   
	        	@Override
                public void mousePressed(MouseEvent e) {	
	        		image8.setVisible(false);
	        		image7.setVisible(true);
	        	}
	        	});
	        

	        jPanel1.add(image1);
	        jPanel1.add(image2);
	        jPanel2.add(image3);
	        jPanel2.add(image4);
	        jPanel3.add(image5);
	        jPanel3.add(image6);
	        jPanel4.add(image7);
	        jPanel4.add(image8);
	        
	        
	        jFrame.add(jPanel1);
	        jFrame.add(jPanel2);
	        jFrame.add(jPanel3);
	        jFrame.add(jPanel4);

	        
	        
	        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	jFrame.setVisible(true);
	        
	      
		}
		 
}


