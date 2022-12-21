public class SumOfDivided {
    public static String sumOfDivided(int[] l) {

        String res = "";

        int max = 0;
        for (int i = 0; i < l.length; i++) {
            if (l[i] < 0) {
                if (-l[i] > max) max = -l[i];
            } else {
                if (l[i] > max) max = l[i];
            }
        }

        for (int test = 2; test <= max; test++) {

            boolean isSimple = true;
            for (int i = 2; i*i <= test; i++) {
                if (test % i == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (!isSimple) continue;

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

}