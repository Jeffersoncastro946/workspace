
package utilidades;

public class SobreCargasMetodos {
        
//       public static String texto(String text ){
//           return text;
//       }
       private static int suma (int a, int b, int c){
           System.out.println("suma de 3 arg");
           return a+b+c;
                            
        }
        
        public static int suma(int a, int b){
           System.out.println("suma de 2 arg");
            return a+b;
       } 
         static public double suma(double a, double b){
             System.out.println("suma de 2 arg double");
             return a+b;
         } 
        
      public int getSuma (int a, int b, int c){
          return SobreCargasMetodos.suma(a, b, c);
      } 
    }
    

