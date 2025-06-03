package ma;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f11095a;

    public static class a {
        public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
            if (!d(b11)) {
                if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !d(b12) && !d(b13)) {
                    int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                    cArr[i10] = (char) ((i11 >>> 10) + 55232);
                    cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                    return;
                }
            }
            throw b0.c();
        }

        public static void b(byte b10, byte b11, char[] cArr, int i10) {
            if (b10 < -62 || d(b11)) {
                throw b0.c();
            }
            cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
        }

        public static void c(byte b10, byte b11, byte b12, char[] cArr, int i10) {
            if (d(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || d(b12)))) {
                throw b0.c();
            }
            cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
        }

        public static boolean d(byte b10) {
            return b10 > -65;
        }
    }

    public static abstract class b {
        public static String b(int i10, ByteBuffer byteBuffer, int i11) {
            if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = byteBuffer.get(i10);
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
                byte b11 = byteBuffer.get(i10);
                if (b11 >= 0) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) b11;
                    i10 = i15;
                    while (true) {
                        i14 = i16;
                        if (i10 >= i12) {
                            break;
                        }
                        byte b12 = byteBuffer.get(i10);
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
                                throw b0.c();
                            }
                            int i17 = i15 + 1;
                            a.c(b11, byteBuffer.get(i15), byteBuffer.get(i17), cArr, i14);
                            i10 = i17 + 1;
                            i14++;
                        } else {
                            if (i15 >= i12 - 2) {
                                throw b0.c();
                            }
                            int i18 = i15 + 1;
                            byte b13 = byteBuffer.get(i15);
                            int i19 = i18 + 1;
                            a.a(b11, b13, byteBuffer.get(i18), byteBuffer.get(i19), cArr, i14);
                            i14 = i14 + 1 + 1;
                            i10 = i19 + 1;
                        }
                    } else {
                        if (i15 >= i12) {
                            throw b0.c();
                        }
                        a.b(b11, byteBuffer.get(i15), cArr, i14);
                        i10 = i15 + 1;
                        i14++;
                    }
                }
            }
            return new String(cArr, 0, i14);
        }

        public abstract String a(byte[] bArr, int i10, int i11);

        public abstract String c(int i10, ByteBuffer byteBuffer, int i11);

        public abstract int d(CharSequence charSequence, byte[] bArr, int i10, int i11);

        public abstract int e(int i10, byte[] bArr, int i11, int i12);
    }

    public static final class c extends b {
        @Override // ma.u1.b
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
                                throw b0.c();
                            }
                            int i17 = i15 + 1;
                            a.c(b11, bArr[i15], bArr[i17], cArr, i14);
                            i10 = i17 + 1;
                            i14++;
                        } else {
                            if (i15 >= i12 - 2) {
                                throw b0.c();
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
                            throw b0.c();
                        }
                        a.b(b11, bArr[i15], cArr, i14);
                        i10 = i15 + 1;
                        i14++;
                    }
                }
            }
            return new String(cArr, 0, i14);
        }

        @Override // ma.u1.b
        public final String c(int i10, ByteBuffer byteBuffer, int i11) {
            return b.b(i10, byteBuffer, i11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // ma.u1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int d(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ma.u1.c.d(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        
            if (r13[r14] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
        
            if (r13[r14] > (-65)) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
        
            if (r13[r14] > (-65)) goto L50;
         */
        /* JADX WARN: Removed duplicated region for block: B:101:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x00d4  */
        @Override // ma.u1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int e(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 278
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ma.u1.c.e(int, byte[], int, int):int");
        }
    }

    public static class d extends IllegalArgumentException {
        public d(int i10, int i11) {
            super(defpackage.f.i("Unpaired surrogate at index ", i10, " of ", i11));
        }
    }

    public static final class e extends b {
        public static int f(byte[] bArr, int i10, long j10, int i11) {
            if (i11 == 0) {
                b bVar = u1.f11095a;
                if (i10 > -12) {
                    return -1;
                }
                return i10;
            }
            if (i11 == 1) {
                return u1.c(i10, t1.i(bArr, j10));
            }
            if (i11 == 2) {
                return u1.d(i10, t1.i(bArr, j10), t1.i(bArr, j10 + 1));
            }
            throw new AssertionError();
        }

        @Override // ma.u1.b
        public final String a(byte[] bArr, int i10, int i11) {
            Charset charset = a0.f10909a;
            String str = new String(bArr, i10, i11, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
                throw b0.c();
            }
            return str;
        }

        @Override // ma.u1.b
        public final String c(int i10, ByteBuffer byteBuffer, int i11) {
            if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            long j10 = t1.f11086c.j(byteBuffer, t1.f11089g) + i10;
            long j11 = i11 + j10;
            char[] cArr = new char[i11];
            int i12 = 0;
            while (j10 < j11) {
                byte h10 = t1.h(j10);
                if (!(h10 >= 0)) {
                    break;
                }
                j10++;
                cArr[i12] = (char) h10;
                i12++;
            }
            while (true) {
                int i13 = i12;
                while (j10 < j11) {
                    long j12 = j10 + 1;
                    byte h11 = t1.h(j10);
                    if (h11 >= 0) {
                        cArr[i13] = (char) h11;
                        i13++;
                        j10 = j12;
                        while (j10 < j11) {
                            byte h12 = t1.h(j10);
                            if (!(h12 >= 0)) {
                                break;
                            }
                            j10++;
                            cArr[i13] = (char) h12;
                            i13++;
                        }
                    } else {
                        if (!(h11 < -32)) {
                            if (h11 < -16) {
                                if (j12 >= j11 - 1) {
                                    throw b0.c();
                                }
                                long j13 = j12 + 1;
                                a.c(h11, t1.h(j12), t1.h(j13), cArr, i13);
                                i13++;
                                j10 = j13 + 1;
                            } else {
                                if (j12 >= j11 - 2) {
                                    throw b0.c();
                                }
                                long j14 = j12 + 1;
                                byte h13 = t1.h(j12);
                                long j15 = j14 + 1;
                                byte h14 = t1.h(j14);
                                j10 = j15 + 1;
                                a.a(h11, h13, h14, t1.h(j15), cArr, i13);
                                i12 = i13 + 1 + 1;
                            }
                        } else {
                            if (j12 >= j11) {
                                throw b0.c();
                            }
                            j10 = j12 + 1;
                            a.b(h11, t1.h(j12), cArr, i13);
                            i13++;
                        }
                    }
                }
                return new String(cArr, 0, i13);
            }
        }

        @Override // ma.u1.b
        public final int d(CharSequence charSequence, byte[] bArr, int i10, int i11) {
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
                t1.s(bArr, j12, (byte) charAt);
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
                        t1.s(bArr, j12, (byte) ((charAt2 >>> 6) | 960));
                        j11 = j14 + j10;
                        t1.s(bArr, j14, (byte) ((charAt2 & '?') | 128));
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
                                    t1.s(bArr, j12, (byte) ((codePoint >>> 18) | 240));
                                    long j16 = 1 + j15;
                                    t1.s(bArr, j15, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j17 = 1 + j16;
                                    t1.s(bArr, j16, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j10 = 1;
                                    t1.s(bArr, j17, (byte) ((codePoint & 63) | 128));
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
                        t1.s(bArr, j12, (byte) ((charAt2 >>> '\f') | 480));
                        long j19 = j10 + j18;
                        t1.s(bArr, j18, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j11 = 1 + j19;
                        t1.s(bArr, j19, (byte) ((charAt2 & '?') | 128));
                        j10 = 1;
                    }
                    long j20 = j11;
                    c10 = 128;
                    j12 = j20;
                } else {
                    t1.s(bArr, j12, (byte) charAt2);
                    j12 += j10;
                }
                i13++;
            }
            return (int) j12;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            if (ma.t1.i(r25, r8) > (-65)) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
        
            if (ma.t1.i(r25, r8) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
        
            return f(r25, r2, r8, r0);
         */
        @Override // ma.u1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int e(int r24, byte[] r25, int r26, int r27) {
            /*
                Method dump skipped, instructions count: 431
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ma.u1.e.e(int, byte[], int, int):int");
        }
    }

    static {
        f11095a = (!(t1.f11088e && t1.f11087d) || ma.d.a()) ? new c() : new e();
    }

    public static String a(int i10, ByteBuffer byteBuffer, int i11) {
        b bVar = f11095a;
        bVar.getClass();
        if (byteBuffer.hasArray()) {
            return bVar.a(byteBuffer.array(), byteBuffer.arrayOffset() + i10, i11);
        }
        return byteBuffer.isDirect() ? bVar.c(i10, byteBuffer, i11) : b.b(i10, byteBuffer, i11);
    }

    public static int b(CharSequence charSequence) {
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

    public static int c(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    public static int d(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    public static boolean e(byte[] bArr, int i10, int i11) {
        return f11095a.e(0, bArr, i10, i11) == 0;
    }
}
