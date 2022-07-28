
// import java.net.HttpURLConnection;
// import java.net.URL;
// import java.nio.BufferOverflowException;
// import java.io.InputStream;
// import java.io.InputStreamReader;
// import java.io.OutputStream;
// import java.io.BufferedReader;
// import java.io.FileOutputStream;
import java.io.IOException;

public class BruteForce {

    public static void passwordTest2() throws IOException {
        Authentification auth = new Authentification();
        String chaine = "";
        String[] characters = { "q", "w", "e", "r", "t", "y", "u",
                "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m", "0", "1",
                "2", "3", "4", "5", "6", "7", "8", "9" };

        niveau0: {
            for (int i1 = 0; i1 < characters.length; i1++) {
                try {
                    chaine = characters[i1];
                    if (auth.authentificate(chaine)) {
                        System.out.println("le mot de passe est " + chaine);
                        break niveau0;
                    }

                    else {
                        for (int i2 = 0; i2 < characters.length; i2++) {
                            chaine = characters[i1] + characters[i2];
                            if (auth.authentificate(chaine)) {
                                System.out.println("le mot de passe est " + chaine);
                                break niveau0;
                            }

                            else {
                                for (int i3 = 0; i3 < characters.length; i3++) {
                                    chaine = characters[i1] + characters[i2] + characters[i3];
                                    if (auth.authentificate(chaine)) {
                                        System.out.println("le mot de passe est " + chaine);
                                        break niveau0;
                                    }

                                    else {
                                        for (int i4 = 0; i4 < characters.length; i4++) {
                                            chaine = characters[i1] + characters[i2] + characters[i3] + characters[i4];
                                            if (auth.authentificate(chaine)) {
                                                System.out.println("le mot de passe est " + chaine);
                                                break niveau0;
                                            }

                                            else {
                                                for (int i5 = 0; i5 < characters.length; i5++) {
                                                    chaine = characters[i1] + characters[i2] + characters[i3]
                                                            + characters[i4] + characters[i5];
                                                    if (auth.authentificate(chaine)) {
                                                        System.out.println("le mot de passe est " + chaine);
                                                        break niveau0;
                                                    }

                                                    else {
                                                        for (int i6 = 0; i6 < characters.length; i6++) {
                                                            chaine = characters[i1] + characters[i2] + characters[i3]
                                                                    + characters[i4] + characters[i5] + characters[i6];
                                                            if (auth.authentificate(chaine)) {
                                                                System.out.println("le mot de passe est " + chaine);
                                                                break niveau0;
                                                            }

                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("mot de passe non trouvé");
            }
        }
    }
}
// }

// private static final String POST_PARAMS = "username=moussa&password=passer";

// URL url = new URL(GET_URL);
// HttpURLConnection con = (HttpURLConnection) url
// .openConnection();con.setRequestMethod("GET");con.setRequestProperty("User-Agent",USER_AGENT);
// int responseCode = con.getResponseCode();if(responseCode==200)
// {
// URL obj = new URL(POST_URL);
// HttpURLConnection con2 = (HttpURLConnection) obj.openConnection();
// con2.setRequestMethod("POST");
// con2.setRequestProperty("User-Agent", USER_AGENT);
// // con.setDoOutput(true);
// OutputStream os = con2.getOutputStream();
// os.write(POST_PARAMS.getBytes());
// os.flush();
// os.close();
// if (responseCode == 308) {
// System.out.println("le mot de passe est trouve");
// }
// }

// }}}}
//
// if(con.getResponseCode()==200){
// InputStream im=con.getInputStresam();
// StringBuffer sb= new StringBuffer();
// BufferedReader br=new BufferedReader(new InputStreamReader(im));
// FileOutputStream
// String line = br.readLine();
// while(line!=null){
// line =br.readLine();