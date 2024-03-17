public class MultiArray {
    public static void main(String[] args) {
        int mArray[][] = new int[5][6];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                mArray[i][j] = (int) (Math.random() * 10);/*
                                                           * the int is here for typecasting, bcs Math.random is
                                                           * generating double.
                                                           * here multiplying with number 10 is for avoiding decimal
                                                           * numbers
                                                           */
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(mArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
