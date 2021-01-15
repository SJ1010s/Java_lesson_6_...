package Lesson_3_6;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main NewArray = new Main();
        int[] array = new int[]{1, 2, 4, 5, 7, 4, 3, 6, 3};

        int newArray[] = NewArray.array4(array);
        System.out.println(Arrays.toString(newArray));
    }

    public int[] array4(int[] array) throws RuntimeException {
        byte LastIndexNumber4 = -1;
        for (byte i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                LastIndexNumber4 = i;
            }
        }
        if (LastIndexNumber4 == -1){
            throw new RuntimeException("В массиве должна быть хотя бы одна четверка");
        }else{
            return Arrays.stream(array).skip(LastIndexNumber4+1).toArray();
        }
    }
    public boolean array4_1(byte[] array){
        boolean isFour = false;
        boolean isOne = false;
        boolean isOtherNumber = false;
        for (byte a: array) {
            if(a == 1) {
                isOne = true;
            } else if(a == 4){
                isFour = true;
            } else {
                isOtherNumber = true;
            }
        }
        return isFour && isOne && !isOtherNumber;
    }
}
