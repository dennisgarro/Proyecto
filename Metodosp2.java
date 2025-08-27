
import java.util.Scanner;

public class Metodosp2 {
    Scanner sc = new Scanner(System.in);

    public int[][] LLenarmatrizp2(int n) {
        int [][] m = new int [n][n];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                objpunto2 o1 = new objpunto2();
                System.out.println("Ingrese nombre del producto");
                o1.setNombre(sc.next());
                System.out.println("Ingrese la cantidad del producto");
                o1.setCantidad(sc.nextInt());
            }
        }
        return m;


    }

    public void Mostrarmatrizp2(objpunto2[][] m){
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m.length; j++) {
                    System.out.println("Nombre producto:" + m[i][j].getNombre());
                    System.out.println("Cantidad: " + m[i][j].getCantidad());
                }
            }
    }

    public void sumacantidad(objpunto2[][] m) {
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getCantidad())
            }
        }
    }
    

}