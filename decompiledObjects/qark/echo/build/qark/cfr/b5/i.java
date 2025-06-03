/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package b5;

import b5.k;

public abstract class i {
    public static final int[] a = new int[]{5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};
    public static final int[][] b;
    public static final int[] c;
    public static final int[] d;

    static {
        int[] arrn = new int[]{28, 24, 185, 166, 223, 248, 116, 255, 110, 61};
        int[] arrn2 = new int[]{175, 138, 205, 12, 194, 168, 39, 245, 60, 97, 120};
        int[] arrn3 = new int[]{41, 153, 158, 91, 61, 42, 142, 213, 97, 178, 100, 242};
        int[] arrn4 = new int[]{156, 97, 192, 252, 95, 9, 157, 119, 138, 45, 18, 186, 83, 185};
        int[] arrn5 = new int[]{52, 190, 88, 205, 109, 39, 176, 21, 155, 197, 251, 223, 155, 21, 5, 172, 254, 124, 12, 181, 184, 96, 50, 193};
        int[] arrn6 = new int[]{175, 9, 223, 238, 12, 17, 220, 208, 100, 29, 175, 170, 230, 192, 215, 235, 150, 159, 36, 223, 38, 200, 132, 54, 228, 146, 218, 234, 117, 203, 29, 232, 144, 238, 22, 150, 201, 117, 62, 207, 164, 13, 137, 245, 127, 67, 247, 28, 155, 43, 203, 107, 233, 53, 143, 46};
        b = new int[][]{{228, 48, 15, 111, 62}, {23, 68, 144, 134, 240, 92, 254}, arrn, arrn2, arrn3, arrn4, {83, 195, 100, 39, 188, 75, 66, 61, 241, 213, 109, 129, 94, 254, 225, 48, 90, 188}, {15, 195, 244, 9, 233, 71, 168, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, 172}, arrn5, {211, 231, 43, 97, 71, 96, 103, 174, 37, 151, 170, 53, 75, 34, 249, 121, 17, 138, 110, 213, 141, 136, 120, 151, 233, 168, 93, 255}, {245, 127, 242, 218, 130, 250, 162, 181, 102, 120, 84, 179, 220, 251, 80, 182, 229, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, 175, 184, 59, 25, 225, 98, 81, 112}, {77, 193, 137, 31, 19, 38, 22, 153, 247, 105, 122, 2, 245, 133, 242, 8, 175, 95, 100, 9, 167, 105, 214, 111, 57, 121, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, 150, 177, 226, 5, 9, 5}, {245, 132, 172, 223, 96, 32, 117, 22, 238, 133, 238, 231, 205, 188, 237, 87, 191, 106, 16, 147, 118, 23, 37, 90, 170, 205, 131, 88, 120, 100, 66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 160, 175, 69, 213, 92, 253, 225, 19}, arrn6, {242, 93, 169, 50, 144, 210, 39, 118, 202, 188, 201, 189, 143, 108, 196, 37, 185, 112, 134, 230, 245, 63, 197, 190, 250, 106, 185, 221, 175, 64, 114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 4, 107, 232, 7, 94, 166, 224, 124, 86, 47, 11, 204}, {220, 228, 173, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, 127, 213, 136, 248, 180, 234, 197, 158, 177, 68, 122, 93, 213, 15, 160, 227, 236, 66, 139, 153, 185, 202, 167, 179, 25, 220, 232, 96, 210, 231, 136, 223, 239, 181, 241, 59, 52, 172, 25, 49, 232, 211, 189, 64, 54, 108, 153, 132, 63, 96, 103, 82, 186}};
        c = new int[256];
        d = new int[255];
        int n8 = 1;
        for (int i8 = 0; i8 < 255; ++i8) {
            int n9;
            i.d[i8] = n8;
            i.c[n8] = i8;
            n8 = n9 = n8 << 1;
            if (n9 < 256) continue;
            n8 = n9 ^ 301;
        }
    }

    public static String a(CharSequence charSequence, int n8) {
        return i.b(charSequence, 0, charSequence.length(), n8);
    }

    public static String b(CharSequence arrc, int n8, int n9, int n10) {
        int[] arrn;
        int n11;
        block9 : {
            int n12 = 0;
            for (n11 = 0; n11 < (arrn = a).length; ++n11) {
                if (arrn[n11] != n10) {
                    continue;
                }
                break block9;
            }
            n11 = -1;
        }
        if (n11 >= 0) {
            int[] arrn2 = b[n11];
            arrn = new char[n10];
            for (n11 = 0; n11 < n10; ++n11) {
                arrn[n11] = 0;
            }
            for (n11 = n8; n11 < n8 + n9; ++n11) {
                int[] arrn3;
                int n13;
                int[] arrn4;
                int n14 = arrn[n13] ^ arrc.charAt(n11);
                for (n13 = n10 - 1; n13 > 0; --n13) {
                    int n15;
                    if (n14 != 0 && (n15 = arrn2[n13]) != 0) {
                        int n16 = arrn[n13 - 1];
                        arrn4 = d;
                        arrn3 = c;
                        arrn[n13] = (char)(arrn4[(arrn3[n14] + arrn3[n15]) % 255] ^ n16);
                        continue;
                    }
                    arrn[n13] = arrn[n13 - 1];
                }
                if (n14 != 0 && (n13 = arrn2[0]) != 0) {
                    arrn4 = d;
                    arrn3 = c;
                    arrn[0] = (char)arrn4[(arrn3[n14] + arrn3[n13]) % 255];
                    continue;
                }
                arrn[0] = 0;
            }
            arrc = new char[n10];
            for (n8 = n12; n8 < n10; ++n8) {
                arrc[n8] = arrn[n10 - n8 - 1];
            }
            return String.valueOf((char[])arrc);
        }
        throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf((int)n10)));
    }

    public static String c(String string2, k k8) {
        if (string2.length() == k8.a()) {
            StringBuilder stringBuilder = new StringBuilder(k8.a() + k8.c());
            stringBuilder.append(string2);
            int n8 = k8.f();
            if (n8 == 1) {
                stringBuilder.append(i.a(string2, k8.c()));
            } else {
                int n9;
                stringBuilder.setLength(stringBuilder.capacity());
                int[] arrn = new int[n8];
                int[] arrn2 = new int[n8];
                Object object = new int[n8];
                int n10 = 0;
                while (n10 < n8) {
                    n9 = n10 + 1;
                    arrn[n10] = k8.b(n9);
                    arrn2[n10] = k8.d(n9);
                    object[n10] = false;
                    if (n10 > 0) {
                        object[n10] = object[n10 - 1] + arrn[n10];
                    }
                    n10 = n9;
                }
                for (n10 = 0; n10 < n8; ++n10) {
                    object = new StringBuilder(arrn[n10]);
                    for (n9 = n10; n9 < k8.a(); n9 += n8) {
                        object.append(string2.charAt(n9));
                    }
                    object = i.a(object.toString(), arrn2[n10]);
                    int n11 = n10;
                    n9 = 0;
                    while (n11 < arrn2[n10] * n8) {
                        stringBuilder.setCharAt(k8.a() + n11, object.charAt(n9));
                        n11 += n8;
                        ++n9;
                    }
                }
            }
            return stringBuilder.toString();
        }
        throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
    }
}

