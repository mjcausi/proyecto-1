package metodo;

public class Main {

    public static void main(String[] args) {
        double calificacion[][] = new double[5][10];
        llenar(calificacion);
        mostrar(calificacion);
    }

    public static void llenar(double calificacion[][]){
        for(int filas=0; filas<calificacion.length; filas++){
            for(int colum=0; colum<calificacion[filas].length; colum++){
                calificacion[filas][colum]=Math.round((Math.random()*5)+5);
            }
        }
    }

    public static void mostrar (double calificacion[][]){
        for(int filas=0; filas<calificacion.length; filas++){
            double prom=0;
            System.out.print("salon "+filas+" =");
            for(int colum=0; colum<calificacion[filas].length; colum++){
                System.out.print(calificacion[filas][colum] + " ");
                prom+=calificacion[filas][colum];
            }
            System.out.println(" promedio: "+(prom/calificacion[filas].length));
        }
    }
}

