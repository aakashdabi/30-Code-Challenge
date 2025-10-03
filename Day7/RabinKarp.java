package Day5.Day7;
class RabinKarp {
    public int search(String pat, String txt, int q) {
        int d = 256, m = pat.length(), n = txt.length();
        int i, j, p = 0, t = 0, h = 1;
        for (i = 0; i < m - 1; i++) h = (h * d) % q;
        for (i = 0; i < m; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }
        for (i = 0; i <= n - m; i++) {
            if (p == t) {
                for (j = 0; j < m; j++)
                    if (txt.charAt(i + j) != pat.charAt(j)) break;
                if (j == m) return i;
            }
            if (i < n - m) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;
                if (t < 0) t += q;
            }
        }
        return -1;
    }
}
