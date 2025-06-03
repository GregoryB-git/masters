package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class I5 extends F5 {
    @Override // com.google.android.gms.internal.measurement.F5
    public final int a(int i7, byte[] bArr, int i8, int i9) {
        while (i8 < i9 && bArr[i8] >= 0) {
            i8++;
        }
        if (i8 >= i9) {
            return 0;
        }
        while (i8 < i9) {
            int i10 = i8 + 1;
            byte b7 = bArr[i8];
            if (b7 < 0) {
                if (b7 < -32) {
                    if (i10 >= i9) {
                        return b7;
                    }
                    if (b7 >= -62) {
                        i8 += 2;
                        if (bArr[i10] > -65) {
                        }
                    }
                    return -1;
                }
                if (b7 >= -16) {
                    if (i10 >= i9 - 2) {
                        return E5.c(bArr, i10, i9);
                    }
                    int i11 = i8 + 2;
                    byte b8 = bArr[i10];
                    if (b8 <= -65 && (((b7 << 28) + (b8 + 112)) >> 30) == 0) {
                        int i12 = i8 + 3;
                        if (bArr[i11] <= -65) {
                            i8 += 4;
                            if (bArr[i12] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i10 >= i9 - 1) {
                    return E5.c(bArr, i10, i9);
                }
                int i13 = i8 + 2;
                byte b9 = bArr[i10];
                if (b9 <= -65 && ((b7 != -32 || b9 >= -96) && (b7 != -19 || b9 < -96))) {
                    i8 += 3;
                    if (bArr[i13] > -65) {
                    }
                }
                return -1;
            }
            i8 = i10;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r10 + r0;
     */
    @Override // com.google.android.gms.internal.measurement.F5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.I5.b(java.lang.CharSequence, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.measurement.F5
    public final String c(byte[] bArr, int i7, int i8) {
        if ((i7 | i8 | ((bArr.length - i7) - i8)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
        }
        int i9 = i7 + i8;
        char[] cArr = new char[i8];
        int i10 = 0;
        while (i7 < i9) {
            byte b7 = bArr[i7];
            if (b7 < 0) {
                break;
            }
            i7++;
            G5.d(b7, cArr, i10);
            i10++;
        }
        int i11 = i10;
        while (i7 < i9) {
            int i12 = i7 + 1;
            byte b8 = bArr[i7];
            if (b8 >= 0) {
                int i13 = i11 + 1;
                G5.d(b8, cArr, i11);
                while (i12 < i9) {
                    byte b9 = bArr[i12];
                    if (b9 < 0) {
                        break;
                    }
                    i12++;
                    G5.d(b9, cArr, i13);
                    i13++;
                }
                i11 = i13;
                i7 = i12;
            } else if (b8 < -32) {
                if (i12 >= i9) {
                    throw C0950k4.c();
                }
                i7 += 2;
                G5.c(b8, bArr[i12], cArr, i11);
                i11++;
            } else if (b8 < -16) {
                if (i12 >= i9 - 1) {
                    throw C0950k4.c();
                }
                int i14 = i7 + 2;
                i7 += 3;
                G5.b(b8, bArr[i12], bArr[i14], cArr, i11);
                i11++;
            } else {
                if (i12 >= i9 - 2) {
                    throw C0950k4.c();
                }
                byte b10 = bArr[i12];
                int i15 = i7 + 3;
                byte b11 = bArr[i7 + 2];
                i7 += 4;
                G5.a(b8, b10, b11, bArr[i15], cArr, i11);
                i11 += 2;
            }
        }
        return new String(cArr, 0, i11);
    }
}
