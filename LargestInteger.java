 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int a = integers[0];
        int b = integers[1];
        int c = integers[2];
       
        int x = (a > b) ? a:b;
        int answer = (x > c) ? x:c;
        return answer;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int a = integers[0];
        int b = integers[1];
        int c = integers[2];
        
        int x = Math.max(a, b);
        int answer = Math.max(x, c);
          
        return answer;
    }
}
