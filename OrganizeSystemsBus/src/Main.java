import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

	private static SignInScreen signInScreen;
	private static ScreenAdmin screenAdmin;
	
	public static void main(String[] args) {
	
            //createStartScreen();
            User user = new User("Zembilas", "Billy Zembilas", "power123", "employee");
            screenAdmin = new ScreenAdmin(user);
            screenAdmin.createGUI();
	}
	
	private static void createStartScreen() {
	
            signInScreen = new SignInScreen();
            signInScreen.createGUI();
	}
}
