public class HashFunction {
    public static int hash(String contrasena) {
        int valor = 0;
        for (int i = 0; i < contrasena.length(); i++) {
            valor = valor + contrasena.charAt(i);
        }
        return valor;
    }
}
