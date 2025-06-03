/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Random
 */
package Y3;

import Y3.m;
import Y3.n;
import java.util.Random;

public abstract class j {
    public static final Random a = new Random();
    public static long b = 0L;
    public static final int[] c = new int[12];

    public static final String a(String string2) {
        n.g(string2);
        Integer n8 = m.k(string2);
        if (n8 != null) {
            if (n8 == Integer.MIN_VALUE) {
                return "[MIN_NAME]";
            }
            return String.valueOf((int)(n8 - 1));
        }
        if ((string2 = new StringBuilder(string2)).charAt(string2.length() - 1) == '-') {
            if (string2.length() == 1) {
                return String.valueOf((int)Integer.MAX_VALUE);
            }
            return string2.substring(0, string2.length() - 1);
        }
        string2.setCharAt(string2.length() - 1, "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".indexOf((int)string2.charAt(string2.length() - 1)) - 1));
        string2.append(new String(new char[786 - string2.length()]).replace((CharSequence)"\u0000", (CharSequence)"z"));
        return string2.toString();
    }

    public static final String b(String string2) {
        int n8;
        n.g(string2);
        Integer n9 = m.k(string2);
        if (n9 != null) {
            if (n9 == Integer.MAX_VALUE) {
                return String.valueOf((char)'-');
            }
            return String.valueOf((int)(n9 + 1));
        }
        if ((string2 = new StringBuilder(string2)).length() < 786) {
            string2.append('-');
            return string2.toString();
        }
        for (n8 = string2.length() - 1; n8 >= 0 && string2.charAt(n8) == 'z'; --n8) {
        }
        if (n8 == -1) {
            return "[MAX_KEY]";
        }
        char c8 = "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".indexOf((int)string2.charAt(n8)) + 1);
        int n10 = n8 + 1;
        string2.replace(n8, n10, String.valueOf((char)c8));
        return string2.substring(0, n10);
    }
}

