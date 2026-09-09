class Solution {
    public long countCommas(long n) {
        String s = Long.toString(n);
        long ncom = 0;

        if (s.length() < 4) {
            return 0;
        }
        else if (s.length() < 7) {
            ncom = n - 999;
        }
        else if (s.length() < 10) {
            ncom = n - 999;
            ncom += n - 999_999L;
        }
        else if (s.length() < 13) {
            ncom = n - 999;
            ncom += n - 999_999L;
            ncom += n - 999_999_999L;
        }
        else if (s.length() < 16) {
            ncom = n - 999;
            ncom += n - 999_999L;
            ncom += n - 999_999_999L;
            ncom += n - 999_999_999_999L;
        }
        else {
            ncom = n - 999;
            ncom += n - 999_999L;
            ncom += n - 999_999_999L;
            ncom += n - 999_999_999_999L;
            ncom += n - 999_999_999_999_999L;
        }

        return ncom;
    }
}
