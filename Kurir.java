package UTS;

public class Kurir extends Cashback {

public String kurir,alamat2,resi;
public int ongkir;

Kurir(){
}
    public Kurir(String nama1, String alamat , int id,String nama2, String kategori, int jml, int harga, String nama3, 
            String kategori2, int harga2, int jml2,double potongan,double diskon,String kurir,String alamat2,int ongkir,String resi){
        super(nama1,alamat,id,nama2,kategori,jml,harga,nama3,kategori2,harga2,jml2,potongan,diskon);
        this.kurir = kurir;
        this.ongkir = ongkir;
        this.alamat2 = alamat2;
        this.resi = resi;
    }
    
    public void dataKurir(){
       super.dataCashback();
        System.out.println("Dikirim Oleh\t\t\t: " + kurir);
        System.out.println("Alamat Pengirim\t\t\t: " + alamat2);
        System.out.println("Alamat Tujuan\t\t\t: " + alamat);
        System.out.println("Ongkos Kirim\t\t\t: Rp " + ongkir);
        System.out.println("-----------------------------------------------------------");
    }
    public void dataTotal(){
        super.dataPembeli();
        System.out.println("Keranjang\t\t\t: " + nama2 + " & " + nama3);
        System.out.println("Nomor Resi\t\t\t: " + resi);
        System.out.println("Total Belanja\t\t\t: Rp " + (((harga * jml) -(jml * harga * potongan))  + ((harga2 * jml2) - (jml2 * harga2 * diskon)) + ongkir));

    }
}
