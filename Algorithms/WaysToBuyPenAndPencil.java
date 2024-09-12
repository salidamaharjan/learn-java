package Algorithms;

public class WaysToBuyPenAndPencil {
    public static void main(String[] args){
    int cost1 = 10;
    int total = 20;
    int cost2 = 5;
    long waysToBuyPAndPen = wayToBuy( total, cost1, cost2);
    System.out.println(waysToBuyPAndPen);
    }

    static long wayToBuy(int total, int cost1, int cost2) {
        double numOfPen = Math.floor((double)total/cost1);
        long numPen = Math.round(numOfPen);
        long ways = 0;
        for(long i = numPen; i >= 0; i--){
            long remTotal = total - (cost1 * i);
            double numOfPencil = Math.floor((double)remTotal/cost2);
            long numPencil = Math.round(numOfPencil);
            ways = ways + numPencil + 1;
        }
         return ways;
    }
}
