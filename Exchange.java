public class Exchange{
    public static void main(String[] args) {
        double[] test = {1.00, 0.25, 0.10, 0.05, 0.01};
        System.out.println(bestExchange(test, 2.89));        
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
}