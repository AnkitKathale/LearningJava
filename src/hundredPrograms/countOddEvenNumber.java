package hundredPrograms;

public class countOddEvenNumber {
    static void oddEven(int[] a,int oddcount,int evencount){
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("Odd numbers count is ="+ oddcount);
        System.out.println("Even numbers count is ="+ evencount);
    }

    public static void main(String[] args) {
        int a[]={1,22,33,20,41,56,71,75};

        oddEven(a,0,0);
    }
}
