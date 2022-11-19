public class Main {
    public static void main(String[] args) {
        int totalMoney = 137;
        int numberTenDollar;
        int numberFiveDollar;
        int numberOneDollar;
        int i;


        //10元可從0~13個，5元可從0~26個
//        10 * numberTenDollar + 5 * numberFiveDollar + numberOneDollar == 137;

        numberTenDollar = 137 / 10;
        i = 137 % 10;
        numberFiveDollar = i / 5;
        numberOneDollar = i % 5;


        System.out.println("最少的硬幣數量為； ");
        System.out.println("10元硬幣" + numberTenDollar + "個");
        System.out.println("5元硬幣" + numberFiveDollar + "個");
        System.out.println("1元硬幣" + numberOneDollar + "個");

    }
}
