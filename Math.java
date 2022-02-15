
public class Math{

    public static double pow( double numero, int potencia ){
        double resultado = 1.0;
        double pot = potencia;

        if( potencia < 0 ){
            pot *= -1;
        }

        for( int i = 1; i <= pot; i ++ ){
            resultado *= numero;
        }

        if( potencia < 0 ){
            resultado = 1.0 / resultado;
        }

        return resultado;
    }

    public static double suma( double num1, double num2 ){
        return num1 + num2;
    }

    public static double resta( double num1, double num2 ){
        return num1 - num2;
    }

    public static double multiplicacion( double num1, double num2 ){
        return num1 * num2;
    }

    public static double division( double num1, double num2 ){
        return num1 / num2;
    }
}