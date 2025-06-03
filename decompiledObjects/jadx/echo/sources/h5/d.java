package h5;

/* loaded from: classes.dex */
public abstract class d {
    public static int a(b bVar) {
        return b(bVar, true) + b(bVar, false);
    }

    public static int b(b bVar, boolean z7) {
        int d7 = z7 ? bVar.d() : bVar.e();
        int e7 = z7 ? bVar.e() : bVar.d();
        byte[][] c7 = bVar.c();
        int i7 = 0;
        for (int i8 = 0; i8 < d7; i8++) {
            byte b7 = -1;
            int i9 = 0;
            for (int i10 = 0; i10 < e7; i10++) {
                byte b8 = z7 ? c7[i8][i10] : c7[i10][i8];
                if (b8 == b7) {
                    i9++;
                } else {
                    if (i9 >= 5) {
                        i7 += i9 - 2;
                    }
                    i9 = 1;
                    b7 = b8;
                }
            }
            if (i9 >= 5) {
                i7 += i9 - 2;
            }
        }
        return i7;
    }

    public static int c(b bVar) {
        byte[][] c7 = bVar.c();
        int e7 = bVar.e();
        int d7 = bVar.d();
        int i7 = 0;
        for (int i8 = 0; i8 < d7 - 1; i8++) {
            byte[] bArr = c7[i8];
            int i9 = 0;
            while (i9 < e7 - 1) {
                byte b7 = bArr[i9];
                int i10 = i9 + 1;
                if (b7 == bArr[i10]) {
                    byte[] bArr2 = c7[i8 + 1];
                    if (b7 == bArr2[i9] && b7 == bArr2[i10]) {
                        i7++;
                    }
                }
                i9 = i10;
            }
        }
        return i7 * 3;
    }

    public static int d(b bVar) {
        byte[][] c7 = bVar.c();
        int e7 = bVar.e();
        int d7 = bVar.d();
        int i7 = 0;
        for (int i8 = 0; i8 < d7; i8++) {
            for (int i9 = 0; i9 < e7; i9++) {
                byte[] bArr = c7[i8];
                int i10 = i9 + 6;
                if (i10 < e7 && bArr[i9] == 1 && bArr[i9 + 1] == 0 && bArr[i9 + 2] == 1 && bArr[i9 + 3] == 1 && bArr[i9 + 4] == 1 && bArr[i9 + 5] == 0 && bArr[i10] == 1 && (g(bArr, i9 - 4, i9) || g(bArr, i9 + 7, i9 + 11))) {
                    i7++;
                }
                int i11 = i8 + 6;
                if (i11 < d7 && c7[i8][i9] == 1 && c7[i8 + 1][i9] == 0 && c7[i8 + 2][i9] == 1 && c7[i8 + 3][i9] == 1 && c7[i8 + 4][i9] == 1 && c7[i8 + 5][i9] == 0 && c7[i11][i9] == 1 && (h(c7, i9, i8 - 4, i8) || h(c7, i9, i8 + 7, i8 + 11))) {
                    i7++;
                }
            }
        }
        return i7 * 40;
    }

    public static int e(b bVar) {
        byte[][] c7 = bVar.c();
        int e7 = bVar.e();
        int d7 = bVar.d();
        int i7 = 0;
        for (int i8 = 0; i8 < d7; i8++) {
            byte[] bArr = c7[i8];
            for (int i9 = 0; i9 < e7; i9++) {
                if (bArr[i9] == 1) {
                    i7++;
                }
            }
        }
        int d8 = bVar.d() * bVar.e();
        return ((Math.abs((i7 << 1) - d8) * 10) / d8) * 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean f(int r1, int r2, int r3) {
        /*
            r0 = 1
            switch(r1) {
                case 0: goto L30;
                case 1: goto L31;
                case 2: goto L38;
                case 3: goto L34;
                case 4: goto L2c;
                case 5: goto L25;
                case 6: goto L1e;
                case 7: goto L14;
                default: goto L4;
            }
        L4:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Invalid mask pattern: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L14:
            int r1 = r3 * r2
            int r1 = r1 % 3
            int r3 = r3 + r2
            r2 = r3 & 1
            int r1 = r1 + r2
        L1c:
            r1 = r1 & r0
            goto L3a
        L1e:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L1c
        L25:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L3a
        L2c:
            int r3 = r3 / 2
            int r2 = r2 / 3
        L30:
            int r3 = r3 + r2
        L31:
            r1 = r3 & 1
            goto L3a
        L34:
            int r3 = r3 + r2
            int r1 = r3 % 3
            goto L3a
        L38:
            int r1 = r2 % 3
        L3a:
            if (r1 != 0) goto L3d
            return r0
        L3d:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.d.f(int, int, int):boolean");
    }

    public static boolean g(byte[] bArr, int i7, int i8) {
        int min = Math.min(i8, bArr.length);
        for (int max = Math.max(i7, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(byte[][] bArr, int i7, int i8, int i9) {
        int min = Math.min(i9, bArr.length);
        for (int max = Math.max(i8, 0); max < min; max++) {
            if (bArr[max][i7] == 1) {
                return false;
            }
        }
        return true;
    }
}
