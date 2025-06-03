package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public abstract class E5 {

    /* renamed from: a, reason: collision with root package name */
    public static final F5 f10364a;

    static {
        if (D5.w()) {
            D5.z();
        }
        f10364a = new I5();
    }

    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        int i8 = 0;
        while (i8 < length && charSequence.charAt(i8) < 128) {
            i8++;
        }
        int i9 = length;
        while (true) {
            if (i8 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i8);
            if (charAt < 2048) {
                i9 += (127 - charAt) >>> 31;
                i8++;
            } else {
                int length2 = charSequence.length();
                while (i8 < length2) {
                    char charAt2 = charSequence.charAt(i8);
                    if (charAt2 < 2048) {
                        i7 += (127 - charAt2) >>> 31;
                    } else {
                        i7 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i8) < 65536) {
                                throw new H5(i8, length2);
                            }
                            i8++;
                        }
                    }
                    i8++;
                }
                i9 += i7;
            }
        }
        if (i9 >= length) {
            return i9;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i9 + 4294967296L));
    }

    public static int b(CharSequence charSequence, byte[] bArr, int i7, int i8) {
        return f10364a.b(charSequence, bArr, i7, i8);
    }

    public static /* synthetic */ int c(byte[] bArr, int i7, int i8) {
        byte b7 = bArr[i7 - 1];
        int i9 = i8 - i7;
        if (i9 == 0) {
            if (b7 > -12) {
                return -1;
            }
            return b7;
        }
        if (i9 == 1) {
            byte b8 = bArr[i7];
            if (b7 > -12 || b8 > -65) {
                return -1;
            }
            return (b8 << 8) ^ b7;
        }
        if (i9 != 2) {
            throw new AssertionError();
        }
        byte b9 = bArr[i7];
        byte b10 = bArr[i7 + 1];
        if (b7 > -12 || b9 > -65 || b10 > -65) {
            return -1;
        }
        return (b10 << 16) ^ ((b9 << 8) ^ b7);
    }

    public static boolean d(byte[] bArr) {
        return f10364a.d(bArr, 0, bArr.length);
    }

    public static String e(byte[] bArr, int i7, int i8) {
        return f10364a.c(bArr, i7, i8);
    }

    public static boolean f(byte[] bArr, int i7, int i8) {
        return f10364a.d(bArr, i7, i8);
    }
}
