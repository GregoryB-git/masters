/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package q3;

public abstract class k {
    public static byte[] a(String string2) {
        if (string2.length() % 2 == 0) {
            int n8 = string2.length() / 2;
            byte[] arrby = new byte[n8];
            for (int i8 = 0; i8 < n8; ++i8) {
                int n9 = i8 * 2;
                int n10 = Character.digit((char)string2.charAt(n9), (int)16);
                n9 = Character.digit((char)string2.charAt(n9 + 1), (int)16);
                if (n10 != -1 && n9 != -1) {
                    arrby[i8] = (byte)(n10 * 16 + n9);
                    continue;
                }
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            return arrby;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }

    public static String b(byte[] arrby) {
        StringBuilder stringBuilder = new StringBuilder(arrby.length * 2);
        int n8 = arrby.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            int n9 = arrby[i8] & 255;
            stringBuilder.append("0123456789abcdef".charAt(n9 / 16));
            stringBuilder.append("0123456789abcdef".charAt(n9 % 16));
        }
        return stringBuilder.toString();
    }
}

