
package UTS;

public class Main {
    public static void main(String[] args) {
        Kurir c = new Kurir("Naruto","Perumahan Asabri Bumiayu C5",142,"PowerBank Anker",
                "Aksesoris Handphone",2,150000,"Speaker JBL","Hobi & Olahraga",250000,
        1, 0.2, 0.2, "JNE","Jl.Kolonel Sugiono 23B Jakarta",25000,"JNE2319");
        
        System.out.println("<<<---------------------STRUK------------------->>>");
        System.out.println("");
        c.dataKurir();
        c.dataTotal();
        
    }
   
}
