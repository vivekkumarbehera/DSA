public class PatternProblem {
    public static void main(String[] args) {
        int i=4;
        for (int j = 1; j <=i ; j++) {
            for(int n=1;n<=j;j++){
                if((i+j)%2 !=0){
                    System.out.println("A");
                }
                else {
                    System.out.println("B");
                }
            }
            System.out.println("\n");

        }
    }

    }
