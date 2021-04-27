package UTS;

public class Barang extends Pembeli{

public String nama2,nama3,kategori,kategori2;
public int harga,harga2,jml,jml2;

Barang(){
    
}
    public Barang(String nama1, String alamat , int id,String nama2, String kategori, 
            int jml, int harga, String nama3, String kategori2, int harga2, int jml2){
        super(nama1,alamat,id);
        this.nama2 = nama2;
        this.kategori = kategori;
        this.jml = jml;
        this.harga = harga;
        this.nama3 = nama3;
        this.kategori2 = kategori2;
        this.harga2 = harga2;
        this.jml2 = jml2;
    }
    public void dataBarang1(){
        
        System.out.println("Nama Barang\t\t\t: " + nama2);
        System.out.println("Kategori Barang\t\t\t: " + kategori);
        System.out.println("Harga\t\t\t\t: Rp " + harga);
        System.out.println("Jumlah\t\t\t\t: " + jml + " item");
        System.out.println("Total\t\t\t\t: Rp " + (jml * harga));
       
    }
    public void dataBarang2(){
        System.out.println("Nama Barang\t\t\t: " + nama3);
        System.out.println("Kategori Barang\t\t\t: " + kategori2);
        System.out.println("Harga\t\t\t\t: Rp " + harga2);
        System.out.println("Jumlah\t\t\t\t: " + jml2 + " item");
        System.out.println("Total\t\t\t\t: Rp " + (jml2 * harga2));  
    }
}
