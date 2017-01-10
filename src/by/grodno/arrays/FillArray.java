package by.grodno.arrays;

public class FillArray {
    public static int size = 20000;
    public static final int count = (size % 2)==0?size/2:size/2+1;

    public static void main(String[] args) {
        int a[][] = new int[size][size];
        long time = System.currentTimeMillis();
        a = simpleSnakeFill(a,1,0);
//        print(a);
//        a = pyramidFill(a,size,0);
        time = System.currentTimeMillis()-time;
        System.out.println(time);
//        print(a);
    }

    //filling array like Pyramide
    public static int[][] pyramidFill(int array[][], int size,int step)
    {
        size--;
        for (int i = step; i <= size ; i++) {
            array[step][i] = step + 1;      //fill top border
            array[i][size] = step + 1;      //fill right border
            array[size][i] = step + 1;      //fill bottom border
            array[i][step] = step + 1;      //fill left border
        }
        step++;

        if (count >= step)
        {
            pyramidFill(array, size, step);
        }
        return array;
    }

    //filling array in snake method
    public static int[][] simpleSnakeFill(int array[][],int num,int step)
    {
        int size = FillArray.size - step - 1;     //актуальная размерность массива на данной итерации
        if (((count-step == 1)&&(FillArray.size % 2 != 0))||((count-step == 0)&&(FillArray.size % 2 == 0))) //условие конца рекурсии
        {
            array[step][step] = num;
            return array;
        }
        for (int i = step; i < size; i++)
        {
            array[step][i] = num*2;                                   //fill top border
            array[i][size] = 2*(num + size -step) ;                      //fill right border
            array[size][size - i + step] = 2*(num + (size- step)*2) ;   //fill bottom border
            array[size-i+step][step] = 2*(num + (size - step)*3) ;       //fill left border
            num++;
        }
        num +=(size - step)*3;
        step++;
        if (count-step >= 1)
        {
            simpleSnakeFill(array, num, step);
        }
        return array;
    }

    //printing out array
    public static void print(int a[][]){
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                System.out.printf("%4d",a[i][j]);
            }
            System.out.println();
        }
    }
}
