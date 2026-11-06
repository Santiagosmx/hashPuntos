public static void main(String[] args) {

    String usuarioDefinido = "Carlos";
    String contrasenaDefinida = "1234";

    Scanner scanner = new Scanner(System.in);

    System.out.print("Usuario: ");
    String usuario = scanner.nextLine();

    System.out.print("Contraseña: ");
    String contrasena = scanner.nextLine();

    if (usuario.equals(usuarioDefinido)) {

        int definido = HashFunction.hash(contrasenaDefinida);
        int ingresado = HashFunction.hash(contrasena);

        if (definido == ingresado) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Contraseña incorrecta");
        }

    } else {
        System.out.println("Usuario incorrecto");
    }
}