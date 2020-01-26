public class FibonnaciSeries {
    public static void main(String[] args) {
        FibonnaciSeries fibonnaciSeries=new FibonnaciSeries();
        fibonnaciSeries.printFibonnaciSeries(10);
    }

    private void printFibonnaciSeries(int num) {
        int cur=1;
        int prev=0;
        int next;

        for(int i=0;i<10;i++){
            next=cur+prev;
            prev=cur;
            cur=next;
            System.out.print(next+" ");
        }   }
    }

