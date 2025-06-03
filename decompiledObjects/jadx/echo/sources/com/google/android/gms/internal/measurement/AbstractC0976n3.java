package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0976n3 {
    public static double a(byte[] bArr, int i7) {
        return Double.longBitsToDouble(q(bArr, i7));
    }

    public static int b(int i7, byte[] bArr, int i8, int i9, InterfaceC0923h4 interfaceC0923h4, C0994p3 c0994p3) {
        C0878c4 c0878c4 = (C0878c4) interfaceC0923h4;
        int o7 = o(bArr, i8, c0994p3);
        while (true) {
            c0878c4.g(c0994p3.f11095a);
            if (o7 >= i9) {
                break;
            }
            int o8 = o(bArr, o7, c0994p3);
            if (i7 != c0994p3.f11095a) {
                break;
            }
            o7 = o(bArr, o8, c0994p3);
        }
        return o7;
    }

    public static int c(int i7, byte[] bArr, int i8, int i9, C1049v5 c1049v5, C0994p3 c0994p3) {
        if ((i7 >>> 3) == 0) {
            throw C0950k4.b();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int p7 = p(bArr, i8, c0994p3);
            c1049v5.e(i7, Long.valueOf(c0994p3.f11096b));
            return p7;
        }
        if (i10 == 1) {
            c1049v5.e(i7, Long.valueOf(q(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int o7 = o(bArr, i8, c0994p3);
            int i11 = c0994p3.f11095a;
            if (i11 < 0) {
                throw C0950k4.d();
            }
            if (i11 > bArr.length - o7) {
                throw C0950k4.f();
            }
            c1049v5.e(i7, i11 == 0 ? AbstractC1003q3.f11110p : AbstractC1003q3.q(bArr, o7, i11));
            return o7 + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw C0950k4.b();
            }
            c1049v5.e(i7, Integer.valueOf(n(bArr, i8)));
            return i8 + 4;
        }
        C1049v5 l7 = C1049v5.l();
        int i12 = (i7 & (-8)) | 4;
        int i13 = 0;
        while (true) {
            if (i8 >= i9) {
                break;
            }
            int o8 = o(bArr, i8, c0994p3);
            int i14 = c0994p3.f11095a;
            i13 = i14;
            if (i14 == i12) {
                i8 = o8;
                break;
            }
            int c7 = c(i13, bArr, o8, i9, l7, c0994p3);
            i13 = i14;
            i8 = c7;
        }
        if (i8 > i9 || i13 != i12) {
            throw C0950k4.e();
        }
        c1049v5.e(i7, l7);
        return i8;
    }

    public static int d(int i7, byte[] bArr, int i8, C0994p3 c0994p3) {
        int i9;
        int i10 = i7 & 127;
        int i11 = i8 + 1;
        byte b7 = bArr[i8];
        if (b7 >= 0) {
            i9 = b7 << 7;
        } else {
            int i12 = i10 | ((b7 & Byte.MAX_VALUE) << 7);
            int i13 = i8 + 2;
            byte b8 = bArr[i11];
            if (b8 >= 0) {
                c0994p3.f11095a = i12 | (b8 << 14);
                return i13;
            }
            i10 = i12 | ((b8 & Byte.MAX_VALUE) << 14);
            i11 = i8 + 3;
            byte b9 = bArr[i13];
            if (b9 >= 0) {
                i9 = b9 << 21;
            } else {
                int i14 = i10 | ((b9 & Byte.MAX_VALUE) << 21);
                int i15 = i8 + 4;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    c0994p3.f11095a = i14 | (b10 << 28);
                    return i15;
                }
                int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 28);
                while (true) {
                    int i17 = i15 + 1;
                    if (bArr[i15] >= 0) {
                        c0994p3.f11095a = i16;
                        return i17;
                    }
                    i15 = i17;
                }
            }
        }
        c0994p3.f11095a = i10 | i9;
        return i11;
    }

    public static int e(Z4 z42, int i7, byte[] bArr, int i8, int i9, InterfaceC0923h4 interfaceC0923h4, C0994p3 c0994p3) {
        int g7 = g(z42, bArr, i8, i9, c0994p3);
        while (true) {
            interfaceC0923h4.add(c0994p3.f11097c);
            if (g7 >= i9) {
                break;
            }
            int o7 = o(bArr, g7, c0994p3);
            if (i7 != c0994p3.f11095a) {
                break;
            }
            g7 = g(z42, bArr, o7, i9, c0994p3);
        }
        return g7;
    }

    public static int f(Z4 z42, byte[] bArr, int i7, int i8, int i9, C0994p3 c0994p3) {
        Object a7 = z42.a();
        int h7 = h(a7, z42, bArr, i7, i8, i9, c0994p3);
        z42.e(a7);
        c0994p3.f11097c = a7;
        return h7;
    }

    public static int g(Z4 z42, byte[] bArr, int i7, int i8, C0994p3 c0994p3) {
        Object a7 = z42.a();
        int i9 = i(a7, z42, bArr, i7, i8, c0994p3);
        z42.e(a7);
        c0994p3.f11097c = a7;
        return i9;
    }

    public static int h(Object obj, Z4 z42, byte[] bArr, int i7, int i8, int i9, C0994p3 c0994p3) {
        int m7 = ((M4) z42).m(obj, bArr, i7, i8, i9, c0994p3);
        c0994p3.f11097c = obj;
        return m7;
    }

    public static int i(Object obj, Z4 z42, byte[] bArr, int i7, int i8, C0994p3 c0994p3) {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = d(i10, bArr, i9, c0994p3);
            i10 = c0994p3.f11095a;
        }
        int i11 = i9;
        if (i10 < 0 || i10 > i8 - i11) {
            throw C0950k4.f();
        }
        int i12 = i10 + i11;
        z42.g(obj, bArr, i11, i12, c0994p3);
        c0994p3.f11097c = obj;
        return i12;
    }

    public static int j(byte[] bArr, int i7, C0994p3 c0994p3) {
        int o7 = o(bArr, i7, c0994p3);
        int i8 = c0994p3.f11095a;
        if (i8 < 0) {
            throw C0950k4.d();
        }
        if (i8 > bArr.length - o7) {
            throw C0950k4.f();
        }
        if (i8 == 0) {
            c0994p3.f11097c = AbstractC1003q3.f11110p;
            return o7;
        }
        c0994p3.f11097c = AbstractC1003q3.q(bArr, o7, i8);
        return o7 + i8;
    }

    public static int k(byte[] bArr, int i7, InterfaceC0923h4 interfaceC0923h4, C0994p3 c0994p3) {
        C0878c4 c0878c4 = (C0878c4) interfaceC0923h4;
        int o7 = o(bArr, i7, c0994p3);
        int i8 = c0994p3.f11095a + o7;
        while (o7 < i8) {
            o7 = o(bArr, o7, c0994p3);
            c0878c4.g(c0994p3.f11095a);
        }
        if (o7 == i8) {
            return o7;
        }
        throw C0950k4.f();
    }

    public static float l(byte[] bArr, int i7) {
        return Float.intBitsToFloat(n(bArr, i7));
    }

    public static int m(byte[] bArr, int i7, C0994p3 c0994p3) {
        int o7 = o(bArr, i7, c0994p3);
        int i8 = c0994p3.f11095a;
        if (i8 < 0) {
            throw C0950k4.d();
        }
        if (i8 == 0) {
            c0994p3.f11097c = "";
            return o7;
        }
        c0994p3.f11097c = E5.e(bArr, o7, i8);
        return o7 + i8;
    }

    public static int n(byte[] bArr, int i7) {
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public static int o(byte[] bArr, int i7, C0994p3 c0994p3) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return d(b7, bArr, i8, c0994p3);
        }
        c0994p3.f11095a = b7;
        return i8;
    }

    public static int p(byte[] bArr, int i7, C0994p3 c0994p3) {
        int i8 = i7 + 1;
        long j7 = bArr[i7];
        if (j7 >= 0) {
            c0994p3.f11096b = j7;
            return i8;
        }
        int i9 = i7 + 2;
        byte b7 = bArr[i8];
        long j8 = (j7 & 127) | ((b7 & Byte.MAX_VALUE) << 7);
        int i10 = 7;
        while (b7 < 0) {
            int i11 = i9 + 1;
            i10 += 7;
            j8 |= (r10 & Byte.MAX_VALUE) << i10;
            b7 = bArr[i9];
            i9 = i11;
        }
        c0994p3.f11096b = j8;
        return i9;
    }

    public static long q(byte[] bArr, int i7) {
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }
}
