import java.net.HttpURLConnection;
import java.io.DataOutputStream;
import java.net.*;

public class Authentification {
    private boolean found = false;
    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String POST_URL = "http://localhost/loginPage/form.php";

    public boolean authentificate(String vPassword) throws Exception {
        try {
            URL url = new URL("http://localhost/loginPage/traitement.php");
            String postData = "password=" + vPassword + "&username=moussa";

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Length", Integer.toString(postData.length()));
            DataOutputStream dos = new DataOutputStream(conn.getOutputStream());
            dos.writeBytes(postData);
            dos.close();

            if (conn.getURL().toString().equals("http://localhost/pageLogin/index.php")) {
                found = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return found;
    }
}
