/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package E2;

public abstract class j {
    public static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] arrby) {
        int n8 = arrby.length;
        char[] arrc = new char[n8 + n8];
        int n9 = 0;
        n8 = 0;
        do {
            int n10 = n8;
            if (n9 >= arrby.length) break;
            byte by = arrby[n9];
            char[] arrc2 = b;
            arrc[n10] = arrc2[(by & 255) >>> 4];
            n8 = n10 + 2;
            arrc[n10 + 1] = arrc2[by & 15];
            ++n9;
        } while (true);
        return new String(arrc);
    }

    public static String b(byte[] arrby, boolean bl) {
        int n8 = arrby.length;
        StringBuilder stringBuilder = new StringBuilder(n8 + n8);
        for (int i8 = 0; !(i8 >= n8 || bl && i8 == n8 - 1 && (arrby[i8] & 255) == 0); ++i8) {
            char[] arrc = a;
            stringBuilder.append(arrc[(arrby[i8] & 240) >>> 4]);
            stringBuilder.append(arrc[arrby[i8] & 15]);
        }
        return stringBuilder.toString();
    }
}

