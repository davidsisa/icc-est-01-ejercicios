public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Crear una instancia de la clase Repaso.
         * 
         * Una 'instancia' es un objeto concreto creado a partir de una clase.
         * En este caso, estamos creando un nuevo objeto llamado 'dataStructuresPrep' a
         * partir
         * de la clase 'Repaso'. Cada instancia de una clase tiene sus propios
         * atributos y métodos, lo que significa que podemos usar 'dataStructuresPrep'
         * para
         * acceder a los métodos definidos dentro de la clase 'Repaso'.
         */
        DataStructuresPrep dataStructuresPrep = new DataStructuresPrep();

        /*
         * Usar la instancia 'dataStructuresPrep' para llamar al método
         * 'subtractWithoutSubtracting'.
         * 
         * Ahora que tenemos una instancia de 'Repaso', podemos usarla para llamar a sus
         * métodos.
         * Aquí, llamamos al método 'subtractWithoutSubtracting', pasando 15 y 5 como
         * argumentos.
         * Este método está diseñado para restar el segundo número del primero sin usar
         * el
         * operador de resta tradicional. Es un buen ejercicio para entender cómo
         * podemos
         * realizar operaciones básicas de manera creativa en programación.
         */
        int resultado = dataStructuresPrep.subtractAlgorithm(15, 5);
        int multiplicacion = dataStructuresPrep.multiplyAlgorithm(10, 5);
        int division = dataStructuresPrep.divideWAlgorithm(20, 2);
        boolean numero = dataStructuresPrep.isPerfectNumber(6);
        int factorial = dataStructuresPrep.getFactorial(6);
        boolean primos = dataStructuresPrep.isPrime(5);
        int exponente = dataStructuresPrep.powerAlgorithm(8, 3);

        /*
         * Imprimir el resultado de la operación.   
         * 
         * Finalmente, imprimimos el resultado de la operación a la consola. Esto nos
         * permite
         * ver el resultado de nuestro método 'subtractWithoutSubtracting'. En este
         * ejemplo,
         * estamos esperando que el resultado sea 10, ya que 15 menos 5 es igual a 10.
         * Esta línea demuestra cómo podemos interactuar con los métodos de nuestras
         * instancias
         * y usar los resultados de sus operaciones en otras partes de nuestro código,
         * como
         * parte de mensajes de salida o en lógicas de decisión más complejas.
         */
        System.out.println("El resultado de subtractAlgorithm  es: " + resultado);
        /*
         * EJERCICIO SISA: MULTIPLICACION
         */
        System.out.println("El resultado de multiplyAlgorithm es: " + multiplicacion);
        /*
         * EJERCICIO SISA: DIVISION
         */
        System.out.println("El resultado de divideAlgorithm es: " + division);
         /*
         * EJERCICIO SISA: DIVISION
         */
        System.out.println("El resultado de isPerfectNumber es: " + numero);
        /*
         * EJERCICIO SISA: FACTORIAL
         */
        System.out.println("El resultado de getFactorial es: " + factorial);
                /*
         * EJERCICIO SISA: PRIMOS
         */
        System.out.println("El resultado de getPrimos es: " + primos);
                        /*
         * EJERCICIO SISA: EXPONENTE
         */
        System.out.println("El resultado de powerAlgorith es: " + exponente);
    }
}
