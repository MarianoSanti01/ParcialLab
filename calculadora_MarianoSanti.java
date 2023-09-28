import java.util.Scanner;
public class calculadora_MarianoSanti {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        boolean salir= false;
        //Se pide por teclado dos numeros
        System.out.println("Ingrese el primer numero a utilizar");
        int num1=leer.nextInt();
        System.out.println("Ingrese el segundo numero a utilizar");
        int num2=leer.nextInt();
        //Se pide por teclado, lo que el usuario desea realizar
        //Mediante un while, repetira el menú hasta que se seleccione la opcion 6, la cual utiliza un boolean para salír
        while (!salir) {
            System.out.println("Ingrese la opcion que desea utilizar");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Division");
            System.out.println("5.Secuencia de operaciones");
            System.out.println("6.Salir");
            int resultado;
            int opc=leer.nextInt();
            //Con un switch se elige que opcion utilizar
            switch (opc) {
                case 1 -> {
                    //suma
                    resultado = num1 + num2;
                    System.out.println(resultado + " es el resultado de su suma");
                }
                case 2 -> {
                    //resta
                    resultado = num1 - num2;
                    System.out.println(resultado + " Es el resultado de su resta");
                }
                case 3 -> {
                    //multiplicacion
                    resultado = num1 * num2;
                    System.out.println(resultado + " Es el resultado de su multiplicacion");
                }
                case 4 -> {
                    //division
                    if (num2 == 0) {
                        System.out.println("Error: No se puede dividir por cero.");
                    } else {
                        resultado = num1 / num2;
                        System.out.println(resultado + " Es el resultado de su division");
                    }
                }
                case 5 -> {
                    //reinicio
                    System.out.println("Ingrese el primer numero a utilizar");
                    num1 = leer.nextInt();
                    System.out.println("Ingrese el segundo numero a utilizar");
                    num2 = leer.nextInt();
                }
                case 6 -> {
                    //Boolean para salir
                    salir = true;
                    System.out.println("Hasta la proxima!");
                }
            }
}
}
    }