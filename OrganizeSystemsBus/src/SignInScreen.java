import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class SignInScreen extends JFrame {

	private JPanel mainPanel;
	private JPanel canvasPanel;
	private JLabel signInLbl;
	private JTextField usernameTxt;
	private JTextField passwordTxt;
	private JButton signInBtn;
	private Server server = new Server();
	private User user;
	
	public SignInScreen() {
		
	}
	
	public void createGUI() {
		server = new Server();
		
		mainPanel = new JPanel();
		canvasPanel = new JPanel();
		signInLbl = new JLabel("Create a new Branch");
		usernameTxt = new JTextField();
		usernameTxt.setHorizontalAlignment((int) Component.CENTER_ALIGNMENT);
		passwordTxt = new JTextField();
		passwordTxt.setHorizontalAlignment((int) Component.CENTER_ALIGNMENT);
		signInBtn = new JButton("Add new Branch");
		ButtonListener branchAddListener = new ButtonListener();
		signInBtn.addActionListener(branchAddListener);
		
		canvasPanel.setLayout(new GridLayout(0, 1));
		canvasPanel.add(signInLbl);
		canvasPanel.add(usernameTxt);
		canvasPanel.add(passwordTxt);
		canvasPanel.add(signInBtn);
		mainPanel.add(canvasPanel);
		
		this.setContentPane(mainPanel);
		
		this.setVisible(true);
		this.setSize(800, 600);
		this.setLocation(200, 0);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	class ButtonListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			server.StartServer();
			
			/*
			//CHECK SIGN IN INFO
			File file = new File("xmlFiles/usersData.xml");
			user = new User(usernameTxt.getText(), passwordTxt.getText());
			DataParser dP = new DataParser(user);
			int foundUser = 0;
			try {
				foundUser = server.CheckGetXMLDataWithInput(file, dP);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
			//PRINT THE ANALOG MESSAGE
			MessagingBotAndSendToNewScreen(foundUser, dP);
			*/
		}
	}
	
	//BASIC MESSAGES AT SIGN-IN SCREEN
	private void MessagingBotAndSendToNewScreen(int foundUser, DataParser dP) {

		User uEmployee = new User();
		User uAdmin = new User();
		
		if(foundUser == 0) {//SOMETHING WENT WRONG WITH USER'S INPUT
			System.out.println("HEY MY FRIEND. YOU MUST DID SOMETHING WRONG ;)\nTRY AGAIN <>");
		}
		else if(foundUser == 1) {//EMPLOYEE IN
			System.out.println("HELLO, MY FELLOW WORKER\nYOU ARE IN ->");
			uEmployee = dP.getUser();
			System.out.println(uEmployee.getUsername());
			SendMeToEmployeeScreen(uEmployee);
		}
		else if(foundUser == 1000) {//ADMIN IN
			System.out.println("HELLO, BOSS. I HOPE YOU DOING FINE\nDO YOU WANT ME TO ORDER YOUR COFFEE? :)");
			uAdmin = dP.getUser();
			SendMeToAdminScreen(uAdmin);
		}
		else if(foundUser == -1) {//SOMETHING WENT WRONG WITH PROGRAM
			System.out.println("HEY, I AM REALLY SORRY. I MUST HAVE DID SOMETHING WRONG :0\nGIVE ME SOME TIME AND COME BACK LATER");
		}
	}
	
	private void SendMeToAdminScreen(User uAdmin) {
		
		ScreenAdmin screenAdmin = new ScreenAdmin(uAdmin);
		screenAdmin.createGUI();
		screenAdmin.setVisible(true);
		this.setVisible(false);
	}
	
	private void SendMeToEmployeeScreen(User uEmployee) {
		
		ScreenEmployee screenEmployee = new ScreenEmployee(uEmployee);
		screenEmployee.createGUI();
		screenEmployee.setVisible(true);
		this.setVisible(false);
	}
}
