public class ContohmethodStaticdanNonStatic {
    public static double hitungLuasPersegi(double sisi){
        return sisi*sisi;
    }

    public static void main(String[] args) {
     double luasPersegi =  ContohmethodStaticdanNonStatic.hitungLuasPersegi(20);
        System.out.println("luas persegi: "+luasPersegi);

        ContohmethodStaticdanNonStatic object = new ContohmethodStaticdanNonStatic();
        object.tampilakanPesanSelamatDatang("joel");
    }

    private void tampilakanPesanSelamatDatang(String nama) {
        System.out.println("selamat datang,"+ nama+"!");
    }
}
