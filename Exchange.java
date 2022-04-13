public class Exchange{
    public static void main(String[] args) {
        //double[] test = {1.00, 0.25, 0.10, 0.05, 0.01};
        //System.out.println(bestExchange(test, 2.89));
        int[] s = {2, 4, 1, 6, 4, 6, 7, 9, 9, 3, 13};
        int[] f = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}; // 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1

        int[] result = sdm(s, f, 11);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }

    public static String bestExchange(double[] coinsValue, double value){
        int[] quantity = new int[coinsValue.length];
        double currentValue = 0;
        int counter = 0;
        while (currentValue < value) {
            if (counter >= coinsValue.length) {
                break;
            }
            if (currentValue + coinsValue[counter] < value) {
                quantity[counter]++;
                currentValue += coinsValue[counter];
            } else{
                counter++;
            }

        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < quantity.length; i++) {
            result.append(coinsValue[i]);
            result.append(":");
            result.append(quantity[i]);
            result.append("; ");

        }
        return result.toString();
    }
    
    public static int[] sdm (int[] start, int[] end, int quantity) {        
        int[] x = new int[quantity];
        for (int i = 0; i < x.length; i++) {
            x[i] = 0;
        }
        x[0] = 1;
        int i = 0;
        for (int k = 1; k < quantity; k++) {
            if(start[k] > end[i]){
                x[k] = 1;
                i = k;
            }
        }
        return x;
    }

    public static int[][] rainhas(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("Invalid value for n");
        }        
        int[][] result = new int[n][2];

        int counter = 0;
        for (int i = 0; i < result.length; i++) {
            
        }
        
        return null;
    }
}
