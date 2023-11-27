public class Main {
    public static void main(String[] args) {

        System.out.println("задача №1");
        for (int i = 1; i <=10; i ++) {
            System.out.println(i);
        }
        System.out.println("задача №2");
        for (int i = 10; i >= 1; i --) {
            System.out.println(i);
        }
        System.out.println("задача №3");
        for (int i = 0; i <=17; i += 2) {
            System.out.println(i);
        }
        System.out.println("задача №4");
        for (int i = 10; i >= -10; i --) {
            System.out.println(i);
        }
        System.out.println("задача №5");
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year);
        }
        System.out.println("задача №6");
        for (int i = 7; i <= 98; i += 7){
            System.out.println(i);}
        System.out.println("задача №7");
        for (int i = 1; i <= 512; i *= 2){
            System.out.println(i);}
        System.out.println("задача №8");
        int money = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + money;
        }
        System.out.println(total);

        System.out.println("задача №9");
        int money1 = 29000;
        int total1 = 0;
        for (int x = 0; x < 12; x++) {
            total1 = total1 + total1/100;
            total1 = total1 + money1;
            System.out.println("Месяц " + x + " Итого " + total1);
        }
        System.out.println("задача №10");
        for (int z = 1; z <=10; z ++) {
            System.out.println("2*" + z + "=" + z*2);}
    }
}