package test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;


public class LambdaDemo {
    public static void main(String[] args) {
        int[] scores = {100, 40, 87, 60};
        for(int score :scores){
            System.out.println(score);
        }
        
        // Modern Java( Java 8 (含)以後支援)
        Arrays.stream(scores).forEach(score -> System.out.println(score));
        Arrays.stream(scores).forEach(System.out::println);
        
        // 計算總分 = ?
        /*
        int sum=0;
        int i=0;
        for(i=0;i<scores.length;i++){
            sum+=scores[i];
        }
        System.out.println("平均： "+(double)sum/(double)i);
        */
        double avg = Arrays.stream(scores)
                           .filter(score -> score >=60)
                           .average()
                           .getAsDouble();
        System.out.println(avg);
        
        IntSummaryStatistics stat = Arrays.stream(scores).summaryStatistics();
        System.out.println(stat.getAverage());
        System.out.println(stat.getSum());
        System.out.println(stat.getMax());
        System.out.println(stat.getMin());
        System.out.println(stat);
    }
}
