package HackerRank;

public class StaticBlock {

        static int B=1;
        static int H=3;
        static int area;

        public static void main(String[] args) {

            if(B>0 && H>0){
                area=B*H;
                System.out.println(area);
            }
            else{
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }

}
