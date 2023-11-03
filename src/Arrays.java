public class Arrays {
    public static void main(String[] args) {
        int Num[] = new int[10];
        for (int i=0; i<Num.length; i++) {
            Num[i]=9-i;
        }

        for (int element : Num) {
            System.out.println(element);
        }
    }
}
