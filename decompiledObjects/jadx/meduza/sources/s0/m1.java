package s0;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f14049a;

    public static class a {
        public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
            if (!c(b11)) {
                if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !c(b12) && !c(b13)) {
                    int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                    cArr[i10] = (char) ((i11 >>> 10) + 55232);
                    cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                    return;
                }
            }
            throw y.a();
        }

        public static void b(byte b10, byte b11, byte b12, char[] cArr, int i10) {
            if (c(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || c(b12)))) {
                throw y.a();
            }
            cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
        }

        public static boolean c(byte b10) {
            return b10 > -65;
        }
    }

    public static abstract class b {
        public abstract String a(byte[] bArr, int i10, int i11);

        public abstract int b(CharSequence charSequence, byte[] bArr, int i10, int i11);

        public abstract int c(byte[] bArr, int i10, int i11);
    }

    public static final class c extends b {
        @Override // s0.m1.b
        public final String a(byte[] bArr, int i10, int i11) {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = bArr[i10];
                if (!(b10 >= 0)) {
                    break;
                }
                i10++;
                cArr[i13] = (char) b10;
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b11 = bArr[i10];
                if (b11 >= 0) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) b11;
                    i10 = i15;
                    while (true) {
                        i14 = i16;
                        if (i10 >= i12) {
                            break;
                        }
                        byte b12 = bArr[i10];
                        if (!(b12 >= 0)) {
                            break;
                        }
                        i10++;
                        i16 = i14 + 1;
                        cArr[i14] = (char) b12;
                    }
                } else {
                    if (!(b11 < -32)) {
                        if (b11 < -16) {
                            if (i15 >= i12 - 1) {
                                throw y.a();
                            }
                            int i17 = i15 + 1;
                            a.b(b11, bArr[i15], bArr[i17], cArr, i14);
                            i10 = i17 + 1;
                            i14++;
                        } else {
                            if (i15 >= i12 - 2) {
                                throw y.a();
                            }
                            int i18 = i15 + 1;
                            byte b13 = bArr[i15];
                            int i19 = i18 + 1;
                            a.a(b11, b13, bArr[i18], bArr[i19], cArr, i14);
                            i14 = i14 + 1 + 1;
                            i10 = i19 + 1;
                        }
                    } else {
                        if (i15 >= i12) {
                            throw y.a();
                        }
                        int i20 = i15 + 1;
                        byte b14 = bArr[i15];
                        int i21 = i14 + 1;
                        if (b11 < -62 || a.c(b14)) {
                            throw y.a();
                        }
                        cArr[i14] = (char) (((b11 & 31) << 6) | (b14 & 63));
                        i10 = i20;
                        i14 = i21;
                    }
                }
            }
            return new String(cArr, 0, i14);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // s0.m1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int b(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: s0.m1.c.b(java.lang.CharSequence, byte[], int, int):int");
        }

        @Override // s0.m1.b
        public final int c(byte[] bArr, int i10, int i11) {
            int b10;
            while (i10 < i11 && bArr[i10] >= 0) {
                i10++;
            }
            if (i10 < i11) {
                while (i10 < i11) {
                    int i12 = i10 + 1;
                    byte b11 = bArr[i10];
                    if (b11 < 0) {
                        if (b11 >= -32) {
                            if (b11 < -16) {
                                if (i12 < i11 - 1) {
                                    int i13 = i12 + 1;
                                    byte b12 = bArr[i12];
                                    if (b12 > -65) {
                                        return -1;
                                    }
                                    if (b11 == -32 && b12 < -96) {
                                        return -1;
                                    }
                                    if (b11 == -19 && b12 >= -96) {
                                        return -1;
                                    }
                                    i10 = i13 + 1;
                                    if (bArr[i13] > -65) {
                                        return -1;
                                    }
                                }
                            } else if (i12 < i11 - 2) {
                                int i14 = i12 + 1;
                                byte b13 = bArr[i12];
                                if (b13 > -65) {
                                    return -1;
                                }
                                if ((((b13 + 112) + (b11 << 28)) >> 30) != 0) {
                                    return -1;
                                }
                                int i15 = i14 + 1;
                                if (bArr[i14] > -65) {
                                    return -1;
                                }
                                i12 = i15 + 1;
                                if (bArr[i15] > -65) {
                                    return -1;
                                }
                            }
                            b11 = bArr[i12 - 1];
                            int i16 = i11 - i12;
                            if (i16 == 0) {
                                if (b11 > -12) {
                                    return -1;
                                }
                                return b11;
                            }
                            if (i16 == 1) {
                                b10 = m1.b(b11, bArr[i12]);
                            } else {
                                if (i16 != 2) {
                                    throw new AssertionError();
                                }
                                b10 = m1.c(b11, bArr[i12], bArr[i12 + 1]);
                            }
                            return b10;
                        }
                        if (i12 >= i11) {
                            return b11;
                        }
                        if (b11 < -62) {
                            return -1;
                        }
                        i10 = i12 + 1;
                        if (bArr[i12] > -65) {
                            return -1;
                        }
                    }
                    i10 = i12;
                }
            }
            return 0;
        }
    }

    public static class d extends IllegalArgumentException {
        public d(int i10, int i11) {
            super(defpackage.f.i("Unpaired surrogate at index ", i10, " of ", i11));
        }
    }

    public static final class e extends b {
        public static int d(byte[] bArr, int i10, long j10, int i11) {
            if (i11 == 0) {
                b bVar = m1.f14049a;
                if (i10 > -12) {
                    return -1;
                }
                return i10;
            }
            if (i11 == 1) {
                return m1.b(i10, l1.g(bArr, j10));
            }
            if (i11 == 2) {
                return m1.c(i10, l1.g(bArr, j10), l1.g(bArr, j10 + 1));
            }
            throw new AssertionError();
        }

        @Override // s0.m1.b
        public final String a(byte[] bArr, int i10, int i11) {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte g10 = l1.g(bArr, i10);
                if (!(g10 >= 0)) {
                    break;
                }
                i10++;
                cArr[i13] = (char) g10;
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte g11 = l1.g(bArr, i10);
                if (g11 >= 0) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) g11;
                    i10 = i15;
                    while (true) {
                        i14 = i16;
                        if (i10 >= i12) {
                            break;
                        }
                        byte g12 = l1.g(bArr, i10);
                        if (!(g12 >= 0)) {
                            break;
                        }
                        i10++;
                        i16 = i14 + 1;
                        cArr[i14] = (char) g12;
                    }
                } else {
                    if (!(g11 < -32)) {
                        if (g11 < -16) {
                            if (i15 >= i12 - 1) {
                                throw y.a();
                            }
                            int i17 = i15 + 1;
                            a.b(g11, l1.g(bArr, i15), l1.g(bArr, i17), cArr, i14);
                            i10 = i17 + 1;
                            i14++;
                        } else {
                            if (i15 >= i12 - 2) {
                                throw y.a();
                            }
                            int i18 = i15 + 1;
                            byte g13 = l1.g(bArr, i15);
                            int i19 = i18 + 1;
                            a.a(g11, g13, l1.g(bArr, i18), l1.g(bArr, i19), cArr, i14);
                            i14 = i14 + 1 + 1;
                            i10 = i19 + 1;
                        }
                    } else {
                        if (i15 >= i12) {
                            throw y.a();
                        }
                        int i20 = i15 + 1;
                        byte g14 = l1.g(bArr, i15);
                        int i21 = i14 + 1;
                        if (g11 < -62 || a.c(g14)) {
                            throw y.a();
                        }
                        cArr[i14] = (char) (((g11 & 31) << 6) | (g14 & 63));
                        i10 = i20;
                        i14 = i21;
                    }
                }
            }
            return new String(cArr, 0, i14);
        }

        @Override // s0.m1.b
        public final int b(CharSequence charSequence, byte[] bArr, int i10, int i11) {
            long j10;
            char c10;
            long j11;
            int i12;
            char charAt;
            long j12 = i10;
            long j13 = i11 + j12;
            int length = charSequence.length();
            if (length > i11 || bArr.length - i11 < i10) {
                StringBuilder l10 = defpackage.f.l("Failed writing ");
                l10.append(charSequence.charAt(length - 1));
                l10.append(" at index ");
                l10.append(i10 + i11);
                throw new ArrayIndexOutOfBoundsException(l10.toString());
            }
            int i13 = 0;
            while (true) {
                j10 = 1;
                c10 = 128;
                if (i13 >= length || (charAt = charSequence.charAt(i13)) >= 128) {
                    break;
                }
                l1.p(bArr, j12, (byte) charAt);
                i13++;
                j12 = 1 + j12;
            }
            if (i13 == length) {
                return (int) j12;
            }
            while (i13 < length) {
                char charAt2 = charSequence.charAt(i13);
                if (charAt2 >= c10 || j12 >= j13) {
                    if (charAt2 < 2048 && j12 <= j13 - 2) {
                        long j14 = j12 + j10;
                        l1.p(bArr, j12, (byte) ((charAt2 >>> 6) | 960));
                        j11 = j14 + j10;
                        l1.p(bArr, j14, (byte) ((charAt2 & '?') | 128));
                    } else {
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || j12 > j13 - 3) {
                            if (j12 > j13 - 4) {
                                if (55296 <= charAt2 && charAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i12)))) {
                                    throw new d(i13, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j12);
                            }
                            int i14 = i13 + 1;
                            if (i14 != length) {
                                char charAt3 = charSequence.charAt(i14);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    long j15 = j12 + 1;
                                    l1.p(bArr, j12, (byte) ((codePoint >>> 18) | 240));
                                    long j16 = 1 + j15;
                                    l1.p(bArr, j15, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j17 = 1 + j16;
                                    l1.p(bArr, j16, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j10 = 1;
                                    l1.p(bArr, j17, (byte) ((codePoint & 63) | 128));
                                    i13 = i14;
                                    c10 = 128;
                                    j12 = j17 + 1;
                                } else {
                                    i13 = i14;
                                }
                            }
                            throw new d(i13 - 1, length);
                        }
                        long j18 = j12 + j10;
                        l1.p(bArr, j12, (byte) ((charAt2 >>> '\f') | 480));
                        long j19 = j10 + j18;
                        l1.p(bArr, j18, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j11 = 1 + j19;
                        l1.p(bArr, j19, (byte) ((charAt2 & '?') | 128));
                        j10 = 1;
                    }
                    long j20 = j11;
                    c10 = 128;
                    j12 = j20;
                } else {
                    l1.p(bArr, j12, (byte) charAt2);
                    j12 += j10;
                }
                i13++;
            }
            return (int) j12;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        
            return d(r20, r2, r7, r1);
         */
        @Override // s0.m1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int c(byte[] r20, int r21, int r22) {
            /*
                Method dump skipped, instructions count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: s0.m1.e.c(byte[], int, int):int");
        }
    }

    static {
        f14049a = (!(l1.f && l1.f14044e) || s0.d.a()) ? new c() : new e();
    }

    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                throw new d(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder l10 = defpackage.f.l("UTF-8 length does not fit in int: ");
        l10.append(i12 + 4294967296L);
        throw new IllegalArgumentException(l10.toString());
    }

    public static int b(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    public static int c(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }
}
