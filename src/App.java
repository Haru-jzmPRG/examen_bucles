public class App {

    
    public static void main(String[] args) throws Exception {
        
        long min = 0;
        long max = 0;
        int longitud = 0;
        long digito = 0;        

        do {
            
            min = Integer.parseInt(System.console().readLine("Intoduce el valor mínimo del rango: "));
            max = Integer.parseInt(System.console().readLine("Intoduce el valor máximo del rango: "));
            
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
        
        long aux = 0;
        long digitoM = 0;
        int i = 0;            
        while (aleatorio > 0) {
            digito = ((long)aleatorio % 10); 
            aleatorio /= 10;
            longitud++; 

            System.out.printf(" --- %n");
            System.out.printf("| %d |%n", digito);

            // if (digito>aux) {
            //     aux = digito;
            //     digitoM = digito;
            // }
            // for (i = digitoM + 1; i > 0; i--) {
            //     System.out.printf(" --- ");                           
            // }
            // System.out.println();
            // for (i = digitoM + 1; i > 0; i--) {
            //     System.out.printf("| %s ", "*");
            // }
            // System.out.print("|");
            // System.out.println();
        }
        if (i == 0){
            for (i = longitud; i > 0; i--){
                System.out.printf(" --- ");
            }
        }
        
        
        
        

        

    }
}
