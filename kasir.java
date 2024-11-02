import java.util.Scanner;
public class kasir{
        public static void main(String[] args) {
                String belanja[] = new String[5];
                int harga[] = new int[5];
                int jumlah[] = new int[5];
                int total[] = new int[5];

                int grandTotal = 0;
                int jum = 0; 
                int pilih = 0;
                int item = 0;
                Scanner sc = new Scanner(System.in);
                

            do {
                System.out.println("Kasir Toko Makmur");
                System.out.println("1). Tas [100.000]");
                System.out.println("2). Sandal [150.000]");
                System.out.println("3). Sepatu [50.000]");
                System.out.println("4). Baju [55.000]");
                System.out.println("5). Jaket [200.000]");
                System.out.println("6). Selesai");
                System.out.print("Pilih = ");
                pilih = sc.nextInt();

                switch(pilih){
                        case 1:
                                if(item < belanja.length){
                                        belanja[item] = "Tas";
                                        harga[item] = 100000;

                                        System.out.print("Masukkan jumlah : ");
                                        jum = sc.nextInt();
                                        jumlah[item] = jum;
                                        total[item] = harga[item] * jum;

                                        grandTotal = grandTotal + total[item];
                                }
                                else System.out.println("Keranjang penuh");
                                break;
                        case 2:
                                if(item < belanja.length){
                                        belanja[item] = "Sepatu";
                                        harga[item] = 150000;

                                        System.out.print("Masukkan jumlah : ");
                                        jum = sc.nextInt();
                                        jumlah[item] = jum;
                                        total[item] = harga[item] * jum;

                                        grandTotal = grandTotal + total[item];
                                }
                                else System.out.println("Keranjang penuh");
                                break;
                        case 3:
                                if(item < belanja.length){
                                        belanja[item] = "Sandal";
                                        harga[item] = 50000;

                                        System.out.print("Masukkan jumlah : ");
                                        jum = sc.nextInt();
                                        jumlah[item] = jum;
                                        total[item] = harga[item] * jum;

                                        grandTotal = grandTotal + total[item];
                                }
                                else System.out.println("Keranjang penuh");
                                break;
                        case 4:
                                if(item < belanja.length){
                                        belanja[item] = "Baju";
                                        harga[item] = 55000;

                                        System.out.print("Masukkan jumlah : ");
                                        jum = sc.nextInt();
                                        jumlah[item] = jum;
                                        total[item] = harga[item] * jum;

                                        grandTotal = grandTotal + total[item];
                                }
                                else System.out.println("Keranjang penuh");
                                break;
                        case 5:
                                if(item < belanja.length){
                                        belanja[item] = "Jaket";
                                        harga[item] = 200000;

                                        System.out.print("Masukkan jumlah : ");
                                        jum = sc.nextInt();
                                        jumlah[item] = jum;
                                        total[item] = harga[item] * jum;

                                        grandTotal = grandTotal + total[item];
                                }
                                else System.out.println("Keranjang penuh");
                                break;
                        case 6:
                                System.out.println("== Daftar belanja ==");
                                for(int i = 0;i < item;i++){
                                        System.out.print((i+1) +"." + belanja[i] + " " +  harga[i] + " " + jumlah[i] + " " + total[i]);
                                        System.out.println(" ");
                                }
                                System.out.println("Grand totalnya adalah : " + grandTotal);
                                break;
                                
                }
                item++;
                if(item > 5){
                        item = 5;
                        System.out.println("Jumlah item : " + item);
                }

            } while (pilih != 6);
        }
}