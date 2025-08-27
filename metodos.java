
import java.util.Scanner;

public class metodos {

    Scanner sc = new Scanner(System.in);

    public ObjLibreria[][] LlenarMatriz(int d) {

        ObjLibreria[][] m = new ObjLibreria[d][d];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjLibreria o = new ObjLibreria();
                System.out.println("Ingrese el titulo del libro: ");
                o.setTitulo(sc.next());

                System.out.println("Ingrese el nombre del autor:");
                o.setAutor(sc.next());

                System.out.println("Ingrese el precio del libro: ");
                o.setPrecio(sc.nextDouble());
                m[i][j] = o;

            }

        }
        return m;
    }

}
