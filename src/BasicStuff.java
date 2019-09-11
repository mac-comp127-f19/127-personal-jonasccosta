import java.sql.SQLOutput;

public class BasicStuff {
    public static void main(String[] args) {
        double age0 = 19;
        double age1 = 20;
        System.out.println("We are " + age0 + " and " + age1 + " years old!");
//        int sumOfAges = age0 + age1;
//        System.out.println("The sum of our ages is " + sumOfAges + "!");
        System.out.println("The sum of our ages is " + (age0 + age1) + "!");
        System.out.println((6/3));
        System.out.println((6.0/4));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE-1);
        int hours = 1600;
        double days = hours/24;
        double weeks = days/7;
        System.out.println(hours + " hours, " + days + " days, " + weeks + " weeks.");
        double r = 2;
        double h = 5;
        double volume = (1.0/3)*Math.PI*r*r*h;
        double area = Math.PI*r*r+Math.PI*r*Math.sqrt(r*r+h*h);
        System.out.println(volume);
        System.out.println(area);


    }

}
