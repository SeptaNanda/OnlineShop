package UTS;

public class Pembeli {

    public String nama1, alamat;
    public int id;
    
    Pembeli(){ 
    }
    public Pembeli(String nama1, String alamat , int id){
        this.nama1 = nama1;
        this.alamat = alamat;
        this.id = id;
    }
    public void dataPembeli(){
        System.out.println("ID User\t\t\t\t: " + id);
        System.out.println("Nama\t\t\t\t: " + nama1);
      
        
    }
}
