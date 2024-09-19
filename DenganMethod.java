public class DenganMethod {
    public static void main(String[] args) {
        int gajiPokok = 700000;
        int tunjanganTrasport = 500000;
        int tunjanganMakan = 400000;
        int bonus = 1000000;

        int totalPengahasilan = hitunglahTotalPenghasilan (gajiPokok, tunjanganTrasport, tunjanganMakan, bonus);
        int pajak = hitungPajak(totalPengahasilan);
        int gajiBersih = hitungGajiBersih(totalPengahasilan, pajak);

    }



    private static int hitunglahTotalPenghasilan(int gajiPokok, int tunjanganTrasport, int tunjanganMakan, int bonus) {
        return gajiPokok+tunjanganMakan+tunjanganTrasport+bonus;
    }

    private static int hitungPajak(int totalPengahasilan) {
        return totalPengahasilan * 10/100;
    }

    private static int hitungGajiBersih(int totalPengahasilan, int pajak) {
        return totalPengahasilan-pajak;
    }

    public static void tampikanDataGaji(int gajiPokok, int tunjangantransport, int tunjanganMakan, int bonus, int totalPenghasilan, int pajak, int gajiBersih) {
        System.out.println("gaji pokok:"+ gajiPokok);
        System.out.println("tunjangan tranport: "+tunjangantransport);
        System.out.println("tunjsngsn Makan: "+ tunjanganMakan);
        System.out.println("bonus : "+ bonus);
        System.out.println("total penghasilan : "+ totalPenghasilan);
        System.out.println("pajak anda :"+pajak);
        System.out.println("gaji :"+ gajiBersih);

    }

}
