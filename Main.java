import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        selamla();
        selamla("Yiğit");
        String name="Gülsüm";
        selamla(name);
        String message= greeting("Hatice","İlhan");
        System.out.println(message);

        Scanner scn=new Scanner(System.in);
        System.out.print("Vize notunuzu giriniz :");
        int vize=scn.nextInt();
        System.out.print("Final notunuzu giriniz :");
        int dsonu=scn.nextInt();

        double ort=ortalama(vize,dsonu);
        System.out.println("Dersin Ortalaması :" + ort);

        calculate_average(vize, dsonu)
    }


    static void selamla() {
        System.out.println("Merhaba");
    }
    static void selamla(String isim) {
        System.out.println("Merhaba " + isim);
    }

    static String greeting(String name, String surname) {
        return "Hello Mr/Mrs "+ surname + " " + name;
    }

    static double ortalama(int vize, int dsonu) {
        double ort;
        ort=(vize*0.4)+(dsonu*0.6);
        return ort;
    }
}