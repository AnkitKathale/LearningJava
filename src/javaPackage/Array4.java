package javaPackage;

public class Array4 {
    public static void main(String[] args) {
        //Defining multidimentional array
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        int row=a.length;//length is property of an array
        System.out.println(row);
        int columns=a[0].length;//number of columns
        System.out.println(columns);

        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                System.out.print(a[i][j]+"    ");
            }
            System.out.println();
        }
        System.out.println(a[2][2]);

    }

}
