import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5}; //Array inicial
        int[] inversed = new int[numbers.length]; //Creamos el array invertido, de momento vacio, solo le damos el tamaño igual al inicial
        int position = numbers.length-1; //Creamos una variable con la posicion del ultimo elemento del array

        System.out.println("Array inicial: "+ Arrays.toString(numbers)); //Imprimimos array inicial

        //Iteramos sobre el array y vamos asignando al elemento actual del array invertido el ultimo valor del array inicial
        for (int i = 0; i < numbers.length; i++) {
            inversed[i] = numbers[position];
            position--; //Decrementamos la variable position para que a la siguiente iteracion este en la posicion anterior
        }

        //Imprimimos el array invertido
        System.out.println("Array final: "+ Arrays.toString(inversed));

    }
}