public class App {
   
    public static void main(String[] args) throws Exception {
        System.out.println("GRAPHIFY");
        System.out.println("===================");

        int min = 0;
        int max = 0;
        int longitud = 0;
        int digito = 0;        

        do {
            
            min = Integer.parseInt(System.console().readLine("Introduce el valor mínimo del rango: "));
            max = Integer.parseInt(System.console().readLine("Introduce el valor máximo del rango: "));
            
            if (min < 0 || max < 0)
                System.out.println("ERROR: los valores del rango deben ser mayores o iguales a cero.");

        }while(min < 0 || max < 0);
        
        double aleatorio = Math.random() * ( max - min + 1) + min;

        String colorIntro = System.console().readLine("Dibujo la gráfica en blanco y negro o en color (BIC): ");

        int color = switch (colorIntro.toLowerCase()) {
                        case "b" -> 1;
                        case "c" -> 2;        
                        default -> 1;
        };

        int alreves = 0;
        int aux = 0;
        int digitoM = 0;
        
        

        while ((int)Math.round(aleatorio) > 0) {
            alreves = (alreves * 10) + ((int)aleatorio % 10);
            aleatorio /= 10;
            longitud++;
        } 
        int aux1 = alreves;

        while (aux1 > 0) {
            digito = aux1 % 10; 
            aux1 /= 10;            

            if (digito > digitoM) {
                digitoM = digito;
            }            
        }      
        
        for (int i = longitud; i > 0; i--) {
                digito = alreves % 10;
                alreves /= 10;
                aux = digito;
                // int aux3 = digitoM;
                for (int j = digitoM + 1; j > 0; j--) {
                    System.out.printf(" ---");
                }
                System.out.println();
                for (int j = digitoM + 1; j > 0; j--) {
                    if (aux > 0) {
                        System.out.printf("| %d ",aux);
                        aux -= digito;
                    }else {
                        System.out.printf("| %s ", "*");
                    }
                }
                System.out.print("|");
                System.out.println();               

        }
        for (int j = digitoM + 1; j > 0; j--) {
                    System.out.printf(" ---");
                }
    }
}
