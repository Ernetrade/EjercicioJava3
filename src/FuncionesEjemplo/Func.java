package FuncionesEjemplo;

import javax.print.DocFlavor.STRING;

public class Func {
    public static void main(String[] args) {
        //Opción 1: Funciones sin parametros ni tipos de retorno
        showMenu();

        //Opción 2: Funcón  sin parámetro y con tipo de retorno
        String menu = getMenu();
        System.out.println(menu);
        
        //Opción 3: Función con parámetro y sin retorno
        imprimirSaludo("OpenBootCamp");

        //Opción 4: Función con parámetros y con retorno
        String nombre = "Ernesto";
        String apellido = "Hurtado";
        String saludar = obtenerSaludo(nombre, apellido);
        System.out.println(saludar);


    }
    //1
    static void showMenu(){
       System.out.println("Esta es la función 1");
    }
    //2
    static String getMenu(){
        return "Bienvenidos al E-commerce";
    }
    //3
    static void imprimirSaludo(String saludo){
        System.out.println("Buenas tardes " + saludo);
    }
    //4
    static String obtenerSaludo(String nombre, String apellido){
        return "Hola " + nombre + " " + apellido;
    
    }

    // Función anónima () -> System.out.println();

}
