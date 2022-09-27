/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposdatos;

/**
 *
 * @author ingri
 */
public class TiposDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        *ENTEROS
            -byte 8 bits (-128 a 127)| Byte.MIN_value - Byte.MAX_value
            -short: 16 bits (-32768 - 32767)Short.MIN_value - Short.MAX_value
            -int: 32 bits | Integer.MIN_VALUE - Integer.MAX_VALUE
            -long: 64 bits | Long.MIN_VALUE - Long.MAX_VALUE
        *DECIMAL
            - float: 32 bits Float.MIN_VALUE - Float.MAX_VALUE
            - double: 64 bits Double.MIN_VALUE - Double.MAX_VALUE
        *Caracter:
            -char:
        */
        Byte enteroByte = 5;
        System.out.println("Byte");
        System.out.println("Valor del tipo byte: "+ Byte.MIN_VALUE);
        System.out.println("Valor del tipo byte: "+ Byte.MAX_VALUE);
        
        Short enteroShort = 1000;
        System.out.println("\nShort");
        System.out.println("Valor del tipo short: "+ Short.MIN_VALUE);
        System.out.println("Valor del tipo short: "+ Short.MAX_VALUE);
        
        int enteroInteger = 35000;
        System.out.println("\nInteger");
        System.out.println("Valor del tipo int: "+ Integer.MIN_VALUE);
        System.out.println("Valor del tipo int: "+ Integer.MAX_VALUE);
        
        long enteroLong = 630000000000l;
        System.out.println("\nLong");
        System.out.println("Valor del tipo long: "+ Long.MIN_VALUE);
        System.out.println("Valor del tipo long: "+ Long.MAX_VALUE);
        
        float decimalFloat = 10.0F;
        System.out.println("\nFloat");
        System.out.println("Valor del tipo float: "+ Float.MIN_VALUE);
        System.out.println("Valor del tipo float: "+ Float.MAX_VALUE);
        
        double decimalDouble = 420.00254;
        System.out.println("\nDouble");
        System.out.println("Valor del tipo double: "+ Double.MIN_VALUE);
        System.out.println("Valor del tipo double: "+ Double.MAX_VALUE);
        
        System.out.println("\nChar");
        char miCaracter = 'A';
        System.out.println("Valor del tipo miCaracter: "+ miCaracter);
        
        char segundoCaracter = '\u0021';
        System.out.println("Valor del tipo segundoCaracter: "+segundoCaracter); 
        
        char tercerCaracter = 33;
        System.out.println("Valor del tipo tercerCaracter: "+ tercerCaracter);
        
        
    }
    
}
