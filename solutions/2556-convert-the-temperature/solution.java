class Solution {
    public double[] convertTemperature(double celsius) {
        double[] tmp = new double[2];

        tmp[0] = celsius + 273.15;
        tmp[1] = celsius * 1.80 + 32.00;

        return tmp;
    }
}
