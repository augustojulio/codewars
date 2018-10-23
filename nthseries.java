//Sum of the first nth term of Series

public class NthSeries {
	
	public static String seriesSum(int n) {
		// Happy Coding ^_^		
    double sum = 0.0;
   for(int i=0;i<n;i++){
    sum += (1.0/(1+(i*3)));
   }
   //double d = (double) Math.round(sum * 100) / 100;
   //String result = Double.toString(d);
  return String.format("%.2f", sum);

	}
}