 public class Bonjour1
 {
 public static void main(String[] args)
 {
 System.out.println("Bonjour !! ");
  System.out.println("1er cours de java ");
  String s= " Encore Bounjour";
  System.out.println(s);
  int n = s.length();
  System.out.println("Nombre de caractere" +n);
  System.out.println("Bon\tjour !!"); // \t pour faire une tabulation
  System.out.println("Bonj\njour !!"); // \t pour faire une retour a la ligne
  short i = 15 ;  // short est le type de la variable numerique 
   System.out.println(i);
  double x = 456.2982 ;
   System.out.println(x);
   float y =12345.8923 ;
   System.out.println(y);
   ///////////////////////////////////
   char c;
   c = 'p' ;
  System.out.println(c);
  char e ;
  e = 0x44 ;
  System.out.println(e);
  char f = 68 ;
  System.out.println(f);
  boolean a;
  a = true ; 
  System.out.println(a);
  String phrase ;
  phrase = "Toto va a l'ecole" ;
  System.out.println(phrase);
  e = phrase.charAt (11);
  System.out.println(e);
  
  int z = 21;
  int w = 5;
  int q = z / w;
  int r = z % w;
System.out.println(q+ "  "+r);  
  z++ ; // equivalent a z = z+1 
  System.out.println(z);
  ++z; // equivalent a z+1
System.out.println(z++); //23+1 =>  
  
  
  
  
 }
 }