
public class Aplicacion{
    public static void main( String args[] ){
        double numero = 4.0;
        int potencia = 4;
        double num1 = 15.5;
        double num2 = 24.5;

        double resultado = Math.pow( numero, potencia );
        System.out.println( "4^4 = " + resultado );
        resultado = Math.suma( num1, num2 );
        System.out.println( "15.5 + 24.5 = " + resultado );
    }
}