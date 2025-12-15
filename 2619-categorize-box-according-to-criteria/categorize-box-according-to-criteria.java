class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long f=(long)Math.pow(10,4);
        long n=(long)Math.pow(10,9);
        long volume=(long)length*width*height;

        boolean bulky=((length>=f)||(width>=f)||(height>=f)||(volume>=n));
        boolean heavy=(mass>=100);
        if(bulky&&heavy) return "Both";
        if(bulky) return "Bulky";
        if(heavy) return "Heavy";
        return "Neither";

    }
}