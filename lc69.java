class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        if(x <= 3) return 1;
        if(x <= 8) return 2;
        if(x <= 15) return 3;
        if(x <= 24) return 4;
        if(x <= 35) return 5;
        if(x <= 48) return 6;
        if(x >= 2147395600) return 46340;

        int l = 0, r = x / 3, m;
        long mid;
        while(l < r - 1) {
            m = l + (r - l) / 2;
            mid = m;
            mid *= m;
            if(mid == x) return m;
            else if(mid < x) l = m;
            else r = m;
        }
        return l;
    }
}