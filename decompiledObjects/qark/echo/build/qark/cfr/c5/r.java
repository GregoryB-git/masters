/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c5;

import c5.p;

public abstract class r
extends p {
    public static final int[] f = new int[]{1, 1, 1, 1, 1, 1};
    public static final int[][] g = new int[][]{{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, {7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    public static String c(String string2) {
        char[] arrc = new char[6];
        string2.getChars(1, 7, arrc, 0);
        StringBuilder stringBuilder = new StringBuilder(12);
        stringBuilder.append(string2.charAt(0));
        char c8 = arrc[5];
        switch (c8) {
            default: {
                stringBuilder.append(arrc, 0, 5);
                stringBuilder.append("0000");
                stringBuilder.append(c8);
                break;
            }
            case '4': {
                stringBuilder.append(arrc, 0, 4);
                stringBuilder.append("00000");
                stringBuilder.append(arrc[4]);
                break;
            }
            case '3': {
                stringBuilder.append(arrc, 0, 3);
                stringBuilder.append("00000");
                stringBuilder.append(arrc, 3, 2);
                break;
            }
            case '0': 
            case '1': 
            case '2': {
                stringBuilder.append(arrc, 0, 2);
                stringBuilder.append(c8);
                stringBuilder.append("0000");
                stringBuilder.append(arrc, 2, 3);
            }
        }
        if (string2.length() >= 8) {
            stringBuilder.append(string2.charAt(7));
        }
        return stringBuilder.toString();
    }
}

