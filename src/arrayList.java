import java.util.ArrayList;

public class arrayList {
        public static void main(String[] args) {
            //Deklarasi ArrayList
            ArrayList<String> Kalimat = new ArrayList<>();
            Kalimat.add(0, "Hello");
            Kalimat.add(1, "Kelas 1B");
            for (int index = 0; index < Kalimat.size(); index++) {
                System.out.println(Kalimat.get(index));
            }

            //Buatlah code untuk memasukan angka dari 10 sampai 40
            //ke dalam ArrayList AngkaSaya
            ArrayList<Integer> AngkaSaya = new ArrayList<>();
            int Index = 0;
            for (int number = 10; number <= 40; number++) {
                AngkaSaya.add(Index, number);
                Index++;
            }

            for (int i = 0; i < AngkaSaya.size(); i++){
                System.out.println(AngkaSaya.get(i));
            }

        }

}
