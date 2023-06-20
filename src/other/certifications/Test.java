package other.certifications;

public class Test {
     private static void m1() throws Exception {
         throw new Exception();
     }
 
     public static void main(String[] args) {
         try {
             m1();
         } catch (Exception e) { // Remove catch for producing compilation error
             System.out.println("Exception handled");
         } finally {
             System.out.println("A");
         }
     }
}