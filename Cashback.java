package UTS;
public class Cashback extends Barang{

public double potongan,diskon;

Cashback(){
    
}  
   public Cashback(String nama1, String alamat , int id,String nama2, String kategori, int jml, int harga, String nama3, 
           String kategori2, int harga2, int jml2,double potongan,double diskon){
       super(nama1,alamat,id,nama2,kategori,jml,harga,nama3,kategori2,harga2,jml2);
       this.potongan = potongan;
       this.diskon = diskon;
    }

    public void dataCashback(){
        super.dataBarang1();
        
        System.out.println("Potongan " + nama2 + "\t: " + potongan * 100 + " %");
        System.out.println("Total Potongan " + nama2 + "\t: Rp " + (jml * harga * potongan));
        System.out.println("Harga " + nama2 + "\t\t: Rp " + ((harga * jml) -(jml * harga * potongan)));
        System.out.println("-----------------------------------------------------------");
        super.dataBarang2();
        
        System.out.println("Potongan " + nama3 + "\t\t: " + diskon * 100 + " %");
        System.out.println("Total Potongan " + nama3 + "\t: Rp " + (jml2 * harga2 * diskon));
        System.out.println("Harga " + nama3 + "\t\t: Rp " + ((harga2 * jml2) - (jml2 * harga2 * diskon)));
        System.out.println("-----------------------------------------------------------");
        
    }
}
