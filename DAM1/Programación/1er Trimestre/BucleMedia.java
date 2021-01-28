public class BucleMedia {
    static double myMethod(double[] media) {
        double a = 0;
        for (double numero : media) {
            a = a + numero;
        }
        return a / media.length;
    }
    public static void main(String[] args) {
        if (args.length > 0) {
            double[] numeros = new double[args.length];
            for (int b = 0; b < args.length; b++) {
                double numero = Double.parseDouble(args[b]);
                numeros[b] = numero;
            }
            double media = myMethod(numeros);
            System.out.println("La media es " + media);
        } else {
            System.out.println("Por favor, introduzca al menos 1 argumento");
        }
    }
}