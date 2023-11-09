public class TugasIndividu4_16 {
    public static void main(String[] args) {
        // Inisialisasi array 2 dimensi untuk menyimpan nama atlet dan nama cabang olahraga
        String[][] atletPerCabang = {
            {"Badminton", "Nova", "Lelyta", "Dhiya", "Annisa", "Salsa"},
            {"Tenis Meja", "Vanesa", "Yefta", "Hikmah", "Fajar", "Erik"},
            {"Basket", "Diyaz", "Heru", "Billy", "Tora", "Gilang"},
            {"Bola Voly", "Gege", "Haqi", "Aziz", "Rocky", "Wahib"}
        };

        // Mengurutkan dan menampilkan nama atlet secara ascending per cabang
        for (int i = 0; i < atletPerCabang.length; i++) {
            // Mengurutkan nama atlet per cabang olahraga
            for (int j = 1; j < atletPerCabang[i].length - 1; j++) {
                for (int k = j + 1; k < atletPerCabang[i].length; k++) {
                    if (atletPerCabang[i][j].compareTo(atletPerCabang[i][k]) > 0) {
                        String temp = atletPerCabang[i][j];
                        atletPerCabang[i][j] = atletPerCabang[i][k];
                        atletPerCabang[i][k] = temp;
                    }
                }
            }

            // Menampilkan nama atlet dan nama cabang yang telah diurutkan
            System.out.println("Nama Atlet Cabang " + atletPerCabang[i][0] + " (ascending):");
            for (int j = 1; j < atletPerCabang[i].length; j++) {
                System.out.println(atletPerCabang[i][j]);
            }
            System.out.println();
        }
    }
}
