public class ContohOverLoading {
    public static double hitunglLuas(double sisi){
        return sisi *sisi;

    }
    public static double hhitungLuas(double panjang, double lebar){
        return panjang*lebar;

    }
    public static double hitungLuas(double jariJari, boolean isLingkaran){
        if (isLingkaran) {

            return Math.PI * jariJari* jariJari;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        double luasPersegi = hitunglLuas(5);
        System.out.println("Luas persegi : "+luasPersegi);

        double luasPersegiPanjang = hhitungLuas(4, 6);
        System.out.println("Luas persegi panjang adalah : "+luasPersegiPanjang);

        double lusaLingkaran = hitungLuas(4, true);
        System.out.println("Luas lingkaran: "+lusaLingkaran);
        }
    }

