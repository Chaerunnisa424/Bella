import javax.print.attribute.standard.JobOriginatingUserName;
import java.util.ArrayList;

public class FB {
    public int getEmail() {
        return Email;
    }

    public void setEmail(int email) {
        Email = email;
    }

    public int getJumlahPOST() {
        return JumlahPOST;
    }

    public void setJumlahPOST(int jumlahPOST) {
        JumlahPOST = jumlahPOST;
    }

    public int getTotalPostingan() {
        return TotalPostingan;
    }

    public void setTotalPostingan(int totalPostingan) {
        TotalPostingan = totalPostingan;
    }

    private int Email;
    private int JumlahPOST;
    private int TotalPostingan;

    public FB() {
        System.out.println("Facebook Processing...");
    }

    public void SearchFB(String UserID, String UserName) {
        System.out.println("UserID :" + UserID);
        System.out.println("UserName:" + UserName);
    }

    public static void main(String[] args) {
        FB Username = new FB();
        Username.setJumlahPOST(5);
        Username.setTotalPostingan(10);
    }

    ArrayList<FB> Postingan = new ArrayList<>();
    int Postingan = 5;
    for( int index = 0; index<JumlahPostingan;index++) {
        Postingan = new Postingan();
    }
}