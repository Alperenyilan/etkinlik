import java.util.Scanner;
public class etkinlik {
    public static void main(String[] args) {
    int sıcaklık;
    Scanner input1 = new Scanner(System.in);
    System.out.println("Sıcaklık giriniz : ");
    sıcaklık = input1.nextInt();
if(sıcaklık<5){
    System.out.print("Kayak yapmaya gidebilirsin");
}
else if (sıcaklık <= 25 ){
    if(sıcaklık <10){
        System.out.println("Sinemaya gidebilirsin");

    }
    else if(sıcaklık <=15){
        System.out.println("sinema veya pikniğe gidebilirsin");
    }
    else {
        System.out.println("Pikniğe gidebilirsin");
    }

} else {
    System.out.println("Yüzmeye gidebilirsin");
}

    }
}
