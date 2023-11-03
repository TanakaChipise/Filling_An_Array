public class Arrays {
    public static void main(String[] args) {
        int myArray[] = new int[10];
        for (int i=0; i<myArray.length; i++) {
            myArray[i]=9-i;
        }

        for (int element : myArray) {
            System.out.println(element);

        }
    }
}
