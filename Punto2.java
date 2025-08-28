import java.util.Scanner;


public class Punto2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Metodosp2 M = new Metodosp2();
      int n = 0;
      System.out.println("Ingrese la dimension de la matriz");
      n= sc.nextInt();
      objpunto2[][] m = M.LLenarmatrizp2(n);
      M.Mostrarmatrizp2(m);

    }
}