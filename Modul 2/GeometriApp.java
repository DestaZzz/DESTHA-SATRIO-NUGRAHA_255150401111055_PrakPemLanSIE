public class GeometriApp {
    public static void main(String[] args) {
        Lingkaran lingKecil = new Lingkaran(2.0f);
        Lingkaran lingBesar = new Lingkaran(11.0f);

        float kK = lingKecil.keliling();
        float kB = lingBesar.keliling();

        System.out.println("Keliling Lingkaran Kecil: " + kK);
        System.out.println("Keliling Lingkaran Besar: " + kB);
    }
}

