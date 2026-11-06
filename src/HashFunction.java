import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashFunction {
    /*
    public static int hash(String contrasena) {
        int valor = 0;
        for (int i = 0; i < contrasena.length(); i++) {
//            System.out.println(contrasena.charAt(i));

            valor = valor + contrasena.charAt(i);
//            System.out.println(valor);

        }
        return valor;
    }
     */
    public static String hash(String contrasena) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(contrasena.getBytes());

        StringBuilder resultado = new StringBuilder();

        for (byte b : hash) {
            resultado.append(String.format("%02x", b & 0xff));
        }

        return resultado.toString();
    }
}
