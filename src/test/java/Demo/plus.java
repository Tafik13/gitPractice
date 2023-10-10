package Demo;



public class plus {

    public static void main(String[] args) {
        int []array =new int[]{11,5,-4,8,4,7,9};
        for (int i = 0; i < array.length ; i+=2) {
            System.out.println(i+"");

        }
        byte x = 64;
        int i;
        byte y;
        i = x<< 2;
        y = (byte) (x<< 2 );
        System.out.println(i + " " + y);



    }
}
