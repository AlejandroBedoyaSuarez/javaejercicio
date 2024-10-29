        /* Crea un comentario en el código y coloca la URL del sitio web oficial del
 *   lenguaje de programación que has seleccionado.
 * - Representa las diferentes sintaxis que existen de crear comentarios
 *   en el lenguaje (en una línea, varias...).
 * - Crea una variable (y una constante si el lenguaje lo soporta).
 * - Crea variables representando todos los tipos de datos primitivos
 *   del lenguaje (cadenas de texto, enteros, booleanos...).
 * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"
 *
 * ¿Fácil? No te preocupes, recuerda que esta es una ruta de estudio y
 * debemos comenzar por el principio.

 */
public class Javaejercicio1 {
    public static void main(String[] args) {
        //sitio oficial de Java: https://www.java.com/es/
        int primeraVariable= 14;
        System.out.println(primeraVariable);
        //final tipo de dato variable nombreVariable = valor
        final int constanteUno = 4;
        System.out.println(constanteUno);
        byte segundaVariable= 1;
        System.out.println(segundaVariable);
        float terceraVariable= 4f;
        System.out.println("añadir f siempre en un float " + terceraVariable);
        boolean cuartaVariable= true;
        System.out.println("El asesino de Marta fue Carlos" + cuartaVariable);
        char curso= 'A';
        System.out.println("Alejandro esta en segundo de bachillerato paralelo? : " + curso);
        String texto = "Tu ñaña";
        System.out.println("Con qué familiar te conociste primero en la casa de Juan : " + texto);
        String saludo= "Hola, Java!";
        System.out.println(saludo);
    }
}