public class Ejercicio {
        public static void main(String[] args) {
            var frutas = "Mandarinas";
            var cantidad = 33;
            var precio = 3550;
            var precioapagarsiniva = cantidad * precio;
            System.out.println("La cantidad de mandarinas compradas es: " +cantidad);
            System.out.println("El precio de las mandarinas es de : $ " + precio);
            System.out.println("El total a pagar sin IVA es de :$" + precioapagarsiniva );
            var IVA = 0.19;
            System.out.println("El porcentaje del IVA de la compra es del 19%");
            var costomasiva = precioapagarsiniva * IVA;
            System.out.println("El IVA de la compra es : $" + costomasiva);
            var totalapagar = precioapagarsiniva + costomasiva;
            System.out.println("El precio a pagar de la " + frutas+" " +"es de: $ " + totalapagar);
        }
    }

