public class ContohParameterMethod {
    public static int kaliDua(int angka){
        return angka*2;

    }
    public static double hitunglahLuasSegitiga(double alas, double tinggi){
        return 0.5 *alas*tinggi;

    }

    public static void main(String[] args) {
        int hasilKaliDua= kaliDua(5);
        System.out.println("5x2 ="+hasilKaliDua);
        double luasSegitiga = hitunglahLuasSegitiga(5, 2);
        System.out.println("luas segitifa= "+luasSegitiga);
    }
}
