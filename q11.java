public class q11 {
    q11() {
        int i = 0;
        int s = 0;
        int t = 1;
        while (i < 10) {
            s = s + i;
            int j = i;
            while (j > 0) {
                t = t * (j - i);
                j--;
            }
            s = s * t;
            System.out.println("T is " + t);
            i++;
        }
        System.out.println("S is " + s);
    }
}
