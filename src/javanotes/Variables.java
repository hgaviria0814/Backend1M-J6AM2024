package javanotes;

public class Variables {
    public static void main(String[] args) {
        byte moveLeft; //declarando una variable
        moveLeft = 127; //hasta 127 me da para el tipo byte, pero si pasa de tamaño el byte no me sirve
        short moveLeft2 = (short) moveLeft; //para este cambio de tamaño defino de tipo short,aca en este caso la estoy reemplazando
        System.out.println(moveLeft2);






        // recibe dos valores numeriso pero uno de ellos es de tipo string
        int num1 = 19;

        String num2 = "23";

//parseo de variabesl:_ como convierto una variable de tipo string a tipo a numerico y viceversa
        int newNum2= Integer.parseInt(num2);

        float promedio = (num1 + newNum2)/ 2;

    }
}
