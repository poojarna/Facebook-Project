import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class FacebookLikeButton extends JFrame {
	// Following method is going to call like button when method is called.
	private HashSet<String> hashSet = new HashSet<>();
	// This is the serial version
	private static final long serialVersionUID = 1L;
	private JList<Object> viewer = new JList<>();
    // TreeSet and HashMap are here
	static HashMap<String, Integer> counts = null;
	static TreeSet<String> likes = null;
	public FacebookLikeButton() {
		
		setTitle("Facebook Like/Dislike Panel");
		setSize(300, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 1));
		
		JScrollPane scroll = new JScrollPane(viewer);
		add(scroll);
		
		JButton addButton = new JButton("like");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = JOptionPane.showInputDialog(FacebookLikeButton.this, 
						"Enter what you like: ");
				
				if (input == null || input.length() == 0) {
					return;
				}
				
				hashSet.add(input);
				updateViewer();
		}});
		/*
		JButton removeButton = new JButton("Remove");
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (hashSet.size() == 0) {
					JOptionPane.showMessageDialog(FacebookLikeButton.this, 
							"The set is empty", "Uh oh...", 
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				String input = JOptionPane.showInputDialog(FacebookLikeButton.this, 
						"String to remove: ");
				
				if (input == null || input.length() == 0) {
					return;
				}
				
				if (!hashSet.contains(input)) {
					JOptionPane.showMessageDialog(FacebookLikeButton.this, 
							input + " isn't in the set", "Uh oh...", 
							JOptionPane.ERROR_MESSAGE);
					return;
				} 
				
				hashSet.remove(input);
				updateViewer();
		}});
		
		JButton containsButton = new JButton("Contains");
		containsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (hashSet.size() == 0) {
					JOptionPane.showMessageDialog(FacebookLikeButton.this, 
							"The set is empty", "Uh oh...", 
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				String input = JOptionPane.showInputDialog(FacebookLikeButton.this, 
						"String to find: ");
				
				if (input == null || input.length() == 0) {
					return;
				}
				
				if (!hashSet.contains(input)) {
					JOptionPane.showMessageDialog(FacebookLikeButton.this, 
							input + " isn't in the set", "Contains Result", 
							JOptionPane.INFORMATION_MESSAGE);
					return;
				} else {
					JOptionPane.showMessageDialog(FacebookLikeButton.this, 
							input + " is in the set", "Contains Result", 
							JOptionPane.INFORMATION_MESSAGE);
				}
		}});
		*/
		JPanel controls = new JPanel();
		controls.setLayout(new GridLayout(3,1));
		controls.add(addButton);
		//controls.add(removeButton);
		//controls.add(containsButton);
		add(controls);
		
		setVisible(true);
	}
	
	
	private void updateViewer() {
		viewer.setListData(hashSet.toArray());
		repaint();
	}

	
	public static void main(String[] args) {
		new FacebookLikeButton();
	}
	
}
