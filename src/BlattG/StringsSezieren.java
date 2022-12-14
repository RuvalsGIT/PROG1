package BlattG;

import java.sql.SQLOutput;

public class StringsSezieren {
    public static void main(String[] args) {
        // Taumatawhakatangihangakoauauotamateaturipukakapikimaungahoronukupokaiwhenuakitan
        //atahu:

        String Maori = "Taumatawhakatangihangakoauauotamateaturipukakapikimaungahoronukupokaiwhenuakitanatahu";
        //String[] gesplittet = Maori.toLowerCase().split(" ");
        //System.out.println(gesplittet);

        Maori = Maori.toLowerCase();

        for (int i = 0; i < Maori.length(); i++) {
            switch (Maori.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.print('X');
                    break;

                default:
                    System.out.print('-');
            }
        }
        System.out.printf("\n" + Maori + "\n");
    }
}