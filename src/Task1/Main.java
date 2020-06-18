package Task1;

public class Main {

    public static void main(String[] args) {
//	Cut cut = new Cut(1.1,5.3,3.2,3.3);
        Cut cut1 = new Cut(1, 1, 2, 2);
        Cut cut2 = new Cut(-3, 0, 1, 1);
        if (cut1.isEqual(cut2)){
            System.out.println("Отрезки равны");
        }else System.out.println("Отрезки не равны");
    }
}
