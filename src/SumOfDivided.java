public class SumOfDivided {
    public static String sumOfDivided(int[] l) {

        String res = "";

        int max = 0;
        for (int i = 0; i < l.length; i++) {
            if (isSimple(l[i])) {
                if (l[i] < 0) {
                    if (-l[i]*2 > max) max = -l[i]*2;
                } else {
                    if (l[i]*2 > max) max = l[i]*2;
                }
                continue;
            }
            if (l[i] < 0) {
                if (-l[i] > max) max = -l[i];
            } else {
                if (l[i] > max) max = l[i];
            }
        }

        for (int test = 2; test <= max/2; test++) {

            if (!isSimple(test)) continue;

            boolean needAdd = false;

            int sum = 0;

            for (int i = 0; i < l.length; i++) {
                if (l[i] % test == 0) {
                    sum += l[i];
                    needAdd = true;
                }
            }

            if (needAdd) res = res + "(" + test + " " + sum + ")";

        }

        return res;

    }

    private static boolean isSimple(int test) {
        for (int i = 2; i <= test / 2; i++) {
            if (test % i == 0) return false;
        }
        return true;
    }
}