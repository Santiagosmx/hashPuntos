public static void main(String[] args ) throws NoSuchAlgorithmException{
    String usuarioDefinido = "Carlos";
    String contrasenaDefinida = "1234";

    Scanner scanner = new Scanner(System.in);

    System.out.print("Usuario: ");
    String usuario = scanner.nextLine();

    System.out.print("Contraseña: ");
    String contrasena = scanner.nextLine();

    if (usuario.equals(usuarioDefinido)) {
        String definido = HashFunction.hash(contrasenaDefinida);
        String ingresado = HashFunction.hash(contrasena);
        System.out.println(definido);
        System.out.println(ingresado);

        if (definido.equals(ingresado)) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Contraseña incorrecta");
        }

    } else {
        System.out.println("Usuario incorrecto");
    }

    /*

    String usuarioDefinido = "Carlos";
    String contrasenaDefinida = "123a4";

    Scanner scanner = new Scanner(System.in);

    System.out.print("Usuario: ");
    String usuario = scanner.nextLine();

    System.out.print("Contraseña: ");
    String contrasena = scanner.nextLine();

    if (usuario.equals(usuarioDefinido)) {

        int definido = HashFunction.hash(contrasenaDefinida);
        int ingresado = HashFunction.hash(contrasena);
        System.out.println(definido);
        System.out.println(ingresado);

        if (definido == ingresado) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Contraseña incorrecta");
        }

    } else {
        System.out.println("Usuario incorrecto");
    }
     */
}

