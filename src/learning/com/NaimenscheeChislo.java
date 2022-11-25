package learning.com;

public class NaimenscheeChislo {
    public static void main(String[] args) {
        int[] m = {34, 26, 12, 90, 65, 69};
        int malchis = m [0];
        for (int i = 0; i < m.length; i++) {
            if (malchis > m[i]) {
                malchis = m[i];
            }
        }
            System.out.println(malchis);
    }
}