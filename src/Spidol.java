public class Spidol {
    String warnatutup;
    String tinta;
    String Merk;

    public Spidol( ){ //Constraktor tipe 1
        Spidol test=new Spidol();
        test.warnatutup="merah";
        test.tinta="merah";
        test.Merk="U";

    }
    public Spidol(String tutup,String tnt, String merk){ //constraktor tipe 2
        this.warnatutup=tutup;
        this.tinta=tnt;
        this.Merk=merk;

    //dalam OOP kontraktor tidak harus 2, boleh salah satu saja
    }

    public static void main(String[] args) {
        Spidol snw= new Spidol("Biru", "Biru", "Snowman");
    }
}
