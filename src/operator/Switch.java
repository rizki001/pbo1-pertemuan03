package operator;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch(nilai) {
            case 'A':
                System.out.println("Mahasiswa	: \"Terima kasih pak\"");
                System.out.println("Dosen	: \"Selamat ya...\"");
                break;
            case 'B':
                System.out.println("Mahasiswa	: \"Kenapa saya tidak mendapat nilai A, pak?\"");
                System.out.println("Dosen	: \"&*^%$#\"");
                break;
            case 'C':
                System.out.println("Mahasiswa	: \"Kenapa saya menurun, padahal saya selalu mengumpul tugas\"");
                System.out.println("Dosen	: \"Tapi apakah bisa menjawab soal ujian?\"");
                System.out.println("Mahasiswa	: \"hehehe...\"");
                break;
            default:
                System.out.println("Mahasiswa	: \"saya selalu masuk dan tugas saya mengumpul semua, kenapa nilai saya cuman segini, pak?\"");
                System.out.println("Dosen	: \"bener? coba bapak cek dulu..\"");
                System.out.println("Dosen	: \"*memeriksa berkas\"");
                System.out.println("Dosen	: \"*marah\"");
                System.out.println("Mahasiswa	: \"hehe, ampun pak...\"");
                break;

            }
        }
    }
