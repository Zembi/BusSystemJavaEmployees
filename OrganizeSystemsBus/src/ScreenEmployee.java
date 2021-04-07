import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class ScreenEmployee extends JFrame {
	
	private JPanel mainPanel;
	private JPanel canvasPanel;
	private JLabel branchLbl;
	private JTextField idBranchTxt;
	private JTextField locationBranchTxt;
	private JTextField maxPeopleBranchTxt;
	private JTextField curPeopleBranchTxt;
	private JButton readyBtn;
	private Server server = new Server();
	private ArrayList<Branch> branches = new ArrayList<Branch>();
	
	public ScreenEmployee(User employee) {
		
	}
	
	public void createGUI() {
		mainPanel = new JPanel();
		canvasPanel = new JPanel();
		branchLbl = new JLabel("Create a new Branch");
		idBranchTxt = new JTextField();
		idBranchTxt.setHorizontalAlignment((int) this.CENTER_ALIGNMENT);
		locationBranchTxt = new JTextField();
		locationBranchTxt.setHorizontalAlignment((int) this.CENTER_ALIGNMENT);
		maxPeopleBranchTxt = new JTextField();
		maxPeopleBranchTxt.setHorizontalAlignment((int) this.CENTER_ALIGNMENT);
		curPeopleBranchTxt = new JTextField();
		curPeopleBranchTxt.setHorizontalAlignment((int) this.CENTER_ALIGNMENT);
		readyBtn = new JButton("Add new Branch");
		ButtonListener branchAddListener = new ButtonListener();
		readyBtn.addActionListener(branchAddListener);
		
		canvasPanel.setLayout(new GridLayout(0, 1));
		canvasPanel.add(branchLbl);
		canvasPanel.add(idBranchTxt);
		canvasPanel.add(locationBranchTxt);
		canvasPanel.add(maxPeopleBranchTxt);
		canvasPanel.add(curPeopleBranchTxt);
		canvasPanel.add(readyBtn);
		mainPanel.add(canvasPanel);
		
		this.setContentPane(mainPanel);
		
		this.setVisible(true);
		this.setSize(800, 600);
		this.setLocation(200, 0);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
	}
	
	class ButtonListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			createAndAddBranch();
			try {
				server.StartServer();
				server.AddDataToXMLBranch(branches);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	private void createAndAddBranch() {
		
		int id = Integer.parseInt(idBranchTxt.getText());
		String loc = locationBranchTxt.getText();
		int maxPeople = Integer.parseInt(maxPeopleBranchTxt.getText());
		int curPeople = Integer.parseInt(curPeopleBranchTxt.getText());
		
		Branch branch = new Branch(id, loc, maxPeople, curPeople);
		branches.add(branch);
	}
}
