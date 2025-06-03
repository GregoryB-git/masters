package b5;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class j {
    public static int a(CharSequence charSequence, int i7) {
        int length = charSequence.length();
        int i8 = 0;
        if (i7 < length) {
            loop0: while (true) {
                char charAt = charSequence.charAt(i7);
                while (f(charAt) && i7 < length) {
                    i8++;
                    i7++;
                    if (i7 < length) {
                        break;
                    }
                }
            }
        }
        return i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8 A[LOOP:1: B:28:0x00b2->B:30:0x00b8, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r8, b5.l r9, V4.b r10, V4.b r11) {
        /*
            b5.a r0 = new b5.a
            r0.<init>()
            b5.c r1 = new b5.c
            r1.<init>()
            b5.m r2 = new b5.m
            r2.<init>()
            b5.n r3 = new b5.n
            r3.<init>()
            b5.f r4 = new b5.f
            r4.<init>()
            b5.b r5 = new b5.b
            r5.<init>()
            r6 = 6
            b5.g[] r6 = new b5.g[r6]
            r7 = 0
            r6[r7] = r0
            r0 = 1
            r6[r0] = r1
            r1 = 2
            r6[r1] = r2
            r2 = 3
            r6[r2] = r3
            r2 = 4
            r6[r2] = r4
            r3 = 5
            r6[r3] = r5
            b5.h r4 = new b5.h
            r4.<init>(r8)
            r4.n(r9)
            r4.l(r10, r11)
            java.lang.String r9 = "[)>\u001e05\u001d"
            boolean r9 = r8.startsWith(r9)
            java.lang.String r10 = "\u001e\u0004"
            if (r9 == 0) goto L5d
            boolean r9 = r8.endsWith(r10)
            if (r9 == 0) goto L5d
            r8 = 236(0xec, float:3.31E-43)
        L50:
            r4.r(r8)
            r4.m(r1)
            int r8 = r4.f9987d
            int r8 = r8 + 7
            r4.f9987d = r8
            goto L6e
        L5d:
            java.lang.String r9 = "[)>\u001e06\u001d"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L6e
            boolean r8 = r8.endsWith(r10)
            if (r8 == 0) goto L6e
            r8 = 237(0xed, float:3.32E-43)
            goto L50
        L6e:
            boolean r8 = r4.i()
            if (r8 == 0) goto L87
            r8 = r6[r7]
            r8.a(r4)
            int r8 = r4.e()
            if (r8 < 0) goto L6e
            int r7 = r4.e()
            r4.j()
            goto L6e
        L87:
            int r8 = r4.a()
            r4.p()
            b5.k r9 = r4.g()
            int r9 = r9.a()
            if (r8 >= r9) goto La3
            if (r7 == 0) goto La3
            if (r7 == r3) goto La3
            if (r7 == r2) goto La3
            r8 = 254(0xfe, float:3.56E-43)
            r4.r(r8)
        La3:
            java.lang.StringBuilder r8 = r4.b()
            int r10 = r8.length()
            r11 = 129(0x81, float:1.81E-43)
            if (r10 >= r9) goto Lb2
            r8.append(r11)
        Lb2:
            int r10 = r8.length()
            if (r10 >= r9) goto Lc5
            int r10 = r8.length()
            int r10 = r10 + r0
            char r10 = o(r11, r10)
            r8.append(r10)
            goto Lb2
        Lc5:
            java.lang.StringBuilder r8 = r4.b()
            java.lang.String r8 = r8.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.j.b(java.lang.String, b5.l, V4.b, V4.b):java.lang.String");
    }

    public static int c(float[] fArr, int[] iArr, int i7, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i8 = 0; i8 < 6; i8++) {
            int ceil = (int) Math.ceil(fArr[i8]);
            iArr[i8] = ceil;
            if (i7 > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i7 = ceil;
            }
            if (i7 == ceil) {
                bArr[i8] = (byte) (bArr[i8] + 1);
            }
        }
        return i7;
    }

    public static int d(byte[] bArr) {
        int i7 = 0;
        for (int i8 = 0; i8 < 6; i8++) {
            i7 += bArr[i8];
        }
        return i7;
    }

    public static void e(char c7) {
        String hexString = Integer.toHexString(c7);
        throw new IllegalArgumentException("Illegal character: " + c7 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    public static boolean f(char c7) {
        return c7 >= '0' && c7 <= '9';
    }

    public static boolean g(char c7) {
        return c7 >= 128 && c7 <= 255;
    }

    public static boolean h(char c7) {
        if (c7 == ' ') {
            return true;
        }
        if (c7 < '0' || c7 > '9') {
            return c7 >= 'A' && c7 <= 'Z';
        }
        return true;
    }

    public static boolean i(char c7) {
        return c7 >= ' ' && c7 <= '^';
    }

    public static boolean j(char c7) {
        if (c7 == ' ') {
            return true;
        }
        if (c7 < '0' || c7 > '9') {
            return c7 >= 'a' && c7 <= 'z';
        }
        return true;
    }

    public static boolean k(char c7) {
        if (m(c7) || c7 == ' ') {
            return true;
        }
        if (c7 < '0' || c7 > '9') {
            return c7 >= 'A' && c7 <= 'Z';
        }
        return true;
    }

    public static boolean l(char c7) {
        return false;
    }

    public static boolean m(char c7) {
        return c7 == '\r' || c7 == '*' || c7 == '>';
    }

    public static int n(CharSequence charSequence, int i7, int i8) {
        float[] fArr;
        char c7;
        char charAt;
        int i9 = 6;
        float f7 = 2.0f;
        if (i7 >= charSequence.length()) {
            return i8;
        }
        if (i8 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            float[] fArr2 = {1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr2[i8] = 0.0f;
            fArr = fArr2;
        }
        int i10 = 0;
        while (true) {
            int i11 = i7 + i10;
            if (i11 == charSequence.length()) {
                byte[] bArr = new byte[i9];
                int[] iArr = new int[i9];
                int c8 = c(fArr, iArr, Integer.MAX_VALUE, bArr);
                int d7 = d(bArr);
                if (iArr[0] == c8) {
                    return 0;
                }
                if (d7 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (d7 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (d7 != 1 || bArr[2] <= 0) {
                    return (d7 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt2 = charSequence.charAt(i11);
            i10++;
            if (f(charAt2)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (g(charAt2)) {
                float ceil = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil;
                fArr[0] = ceil + f7;
            } else {
                float ceil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil2;
                fArr[0] = ceil2 + 1.0f;
            }
            if (h(charAt2)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (g(charAt2)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (j(charAt2)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (g(charAt2)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (k(charAt2)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (g(charAt2)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (i(charAt2)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (g(charAt2)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (l(charAt2)) {
                c7 = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c7 = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i10 >= 4) {
                int[] iArr2 = new int[i9];
                byte[] bArr2 = new byte[i9];
                c(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int d8 = d(bArr2);
                int i12 = iArr2[0];
                int i13 = iArr2[c7];
                if (i12 < i13 && i12 < iArr2[1] && i12 < iArr2[2] && i12 < iArr2[3] && i12 < iArr2[4]) {
                    return 0;
                }
                if (i13 < i12) {
                    return 5;
                }
                byte b7 = bArr2[1];
                byte b8 = bArr2[2];
                byte b9 = bArr2[3];
                byte b10 = bArr2[4];
                if (b7 + b8 + b9 + b10 == 0) {
                    return 5;
                }
                if (d8 == 1 && b10 > 0) {
                    return 4;
                }
                if (d8 == 1 && b8 > 0) {
                    return 2;
                }
                if (d8 == 1 && b9 > 0) {
                    return 3;
                }
                int i14 = iArr2[1];
                if (i14 + 1 < i12 && i14 + 1 < i13 && i14 + 1 < iArr2[4] && i14 + 1 < iArr2[2]) {
                    int i15 = iArr2[3];
                    if (i14 < i15) {
                        return 1;
                    }
                    if (i14 == i15) {
                        int i16 = i7 + i10;
                        do {
                            i16++;
                            if (i16 >= charSequence.length()) {
                                break;
                            }
                            charAt = charSequence.charAt(i16);
                            if (m(charAt)) {
                                return 3;
                            }
                        } while (k(charAt));
                        return 1;
                    }
                }
            }
            i9 = 6;
            f7 = 2.0f;
        }
    }

    public static char o(char c7, int i7) {
        int i8 = c7 + ((i7 * 149) % 253) + 1;
        if (i8 > 254) {
            i8 -= 254;
        }
        return (char) i8;
    }
}
