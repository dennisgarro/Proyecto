import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0, D = 0;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Bienvenido al proyecto");
            System.out.println("Ingrese el punto que desea 1, 2,3 pulse 4 para salir");
            while (!sc.hasNextInt()) {
                System.out.println("por favor ingrese el valor numericó ");
                sc.next();
            }
            opt = sc.nextInt();
            sc.nextLine();
            if (opt < 1 || opt > 4) {
                System.out.println("Por favor ingrese una opcion del 1 al 3");
                continue;
            }

            switch (opt) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("INGRESE LA DIMENSION DE LA MATRIZ ");
                    sc.nextInt();
                    ObjLibreria[][] ML = new ObjLibreria[D][D];
                    break;

                default:
                System.out.println("Hasta pronto");
                    break;
            }
        }
    }
}
