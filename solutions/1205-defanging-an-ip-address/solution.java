class Solution {
    public String defangIPaddr(String ad) {

        return ad.replace("." , "[.]");
    }
}
