package BlinovTests;

public class Zad15 {
    public static void main (String[] args){
        double sum=0;
        for (int i=0; i<args.length;i++){
            //System.out.println(args[i]);

            double isum = Double.parseDouble(args[i]);
            System.out.println(isum);
            sum=sum+isum;
        }
        System.out.println();
        System.out.println("Сумма аргументов командной строки равна: "+sum);

    }

}
