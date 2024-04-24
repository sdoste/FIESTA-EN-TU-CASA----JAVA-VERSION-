import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        // ArrayList <String> listaCompra = new ArrayList<String>(Array)
        //arraylist.isEmpty()
        //arrayList.contains()
        //arrayList.indexOf("zanahoria") = 3
        //arrayList.lastIndexOf("zanahoria"0
    
    //     1- FIESTA EN TU CASA!  (JAVA VERSION)
    //     Montas una fiesta este finde en tu casa! Tienes una lista de 10 invitados en un arraylist
        ArrayList<String> listaInvitados = new ArrayList<String>(Arrays.asList("Michael", "Filomena", "Pepe", "Lucía", "Verónica", "Diego", "Susana", "Roberto", "Tatiana", "Mercedes"));
        System.out.println(listaInvitados);
    //     – Michael, que estaba el primero de la lista, resulta que está de viaje y no puede venir
        System.out.println("Michael en la posición 1 está de viaje y no puede venir");
        listaInvitados.remove(0);
        System.out.println(listaInvitados);

        System.out.println("Pepi que se apunta con su novio Silvester");
        listaInvitados.add("Pepi");
        listaInvitados.add("Silvester");
        System.out.println(listaInvitados);

        System.out.println("Eva dice que le cueles la tercera");
        listaInvitados.add(2, "Eva");
        System.out.println(listaInvitados);

        System.out.println("Hay otra fiesta al lado con 10 personas más. ¡Se apuntan a tu fiesta!");
        ArrayList<String> invitadosExtra = new ArrayList<>(Arrays.asList("Juan", "María", "Pedro", "Ana", "Luis", "Laura", "Carlos", "Sofía", "Pablo", "Elena"));
        listaInvitados.addAll(invitadosExtra);
        System.out.println(listaInvitados);

        System.out.println("Lista definitiva en orden alfabético.");
        Collections.sort(listaInvitados);
        System.out.println(listaInvitados);
        System.out.println("Último invitado de la lista: " + listaInvitados.get(listaInvitados.size()-1));

        System.out.println("¿Está Pedro incluido en la lista?");
        // Si está, decir en qué posición está. Si no, decir que no está.
        if (listaInvitados.contains("Pedro")){
            System.out.println("Sí, Pedro está en la posición nº " + listaInvitados.indexOf("Pedro") + " de la lista");
        } else{
            System.out.println("No, Pedro no está en la lista.");
        }


    
    
    //     2- ArrayList de números enteros:
    //     • Pedir cuantos números quiere el usuario entrar
    //     • Hacer entrada de datos (números) en el bucle
    //     • Cuando tengas el ArrayList completo, hacer la media de todos los números y dar ese resultado en pantalla
        ArrayList<Integer> numerosUsuario = new ArrayList<Integer>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos números quieres introducir?");
        Integer veces = Integer.parseInt(teclado.nextLine());
        for (int i = 0; i < veces; i++){
            System.out.println("Introduce el siguiente número:"); 
            numerosUsuario.add(Integer.parseInt(teclado.nextLine()));
        }
        Integer suma = 0;
        for (int numero : numerosUsuario){
            suma += numero;
        }
        double media = (double) suma / (double) veces;
        System.out.println("La media de los números que has dado es: " + media);


        
    //     3- En la siguiente frase:
        
        String fraseAleatoria = "Los errores del pasado son la sabiduría del presente";
        
    //     Decir si existe la letra "e", cuántas veces aparece, y en qué posiciones.
    System.out.println("¿Existe la letra 'e' en la frase 'Los errores del pasado son la sabiduría del presente'?");
    if (fraseAleatoria.contains("e")){
        ArrayList<Integer> posiciones = new ArrayList<Integer>();
        for (int i = 0; i < fraseAleatoria.length(); i++){
            if (fraseAleatoria.charAt(i) == 'e'){
                posiciones.add(i);
            }
        }
            System.out.println("Esta frase sí contiene la letra 'e' " + (posiciones.size()-1) + "veces en las siguientes posiciones:" + posiciones + ".");

    }else {
        System.out.println("Esta frase no contiene la letra 'e'.");
    }

    teclado.close();
    }
}
