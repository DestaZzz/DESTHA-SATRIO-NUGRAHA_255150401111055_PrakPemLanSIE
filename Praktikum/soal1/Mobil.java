public class Mobil { 
 private String nopol; 
 private String warna; 
 private String merk; 
 private int kecepatan; 
 private int jaraktempuh; 

 public void setNopol(String n) { 
  nopol = n; 
 } 

 public void setWarna(String s) { 
  warna = s; 
 } 

 public void setMerk(String m) { 
  merk = m; 
 } 

 public void setKecepatan(int k) { 
  kecepatan = k; 
 } 

 public void hitungJarak(int waktu){
  jaraktempuh = kecepatan * waktu;
 }

 public void tampilKecepatanMps(){
  double mps = (kecepatan * 1000.0) / 3600.0;
  System.out.println("Kecepatan dalam m/s : " + mps);
 }

 public void display() { 
  System.out.println("Mobil bermerk " + merk); 
  System.out.println("bernomor polisi " + nopol); 
  System.out.println("serta memiliki warna " + warna); 
  System.out.println("bergerak dengan kecepatan " + kecepatan + " kpj"); 
  System.out.println("jarak tempuh mobil " + jaraktempuh + " km");
 }
}
