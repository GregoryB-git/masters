package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f11431a;

    public static class a {
        public static void h(byte b7, byte b8, byte b9, byte b10, char[] cArr, int i7) {
            if (m(b8) || (((b7 << 28) + (b8 + 112)) >> 30) != 0 || m(b9) || m(b10)) {
                throw A.d();
            }
            int r7 = ((b7 & 7) << 18) | (r(b8) << 12) | (r(b9) << 6) | r(b10);
            cArr[i7] = l(r7);
            cArr[i7 + 1] = q(r7);
        }

        public static void i(byte b7, char[] cArr, int i7) {
            cArr[i7] = (char) b7;
        }

        public static void j(byte b7, byte b8, byte b9, char[] cArr, int i7) {
            if (m(b8) || ((b7 == -32 && b8 < -96) || ((b7 == -19 && b8 >= -96) || m(b9)))) {
                throw A.d();
            }
            cArr[i7] = (char) (((b7 & 15) << 12) | (r(b8) << 6) | r(b9));
        }

        public static void k(byte b7, byte b8, char[] cArr, int i7) {
            if (b7 < -62 || m(b8)) {
                throw A.d();
            }
            cArr[i7] = (char) (((b7 & 31) << 6) | r(b8));
        }

        public static char l(int i7) {
            return (char) ((i7 >>> 10) + 55232);
        }

        public static boolean m(byte b7) {
            return b7 > -65;
        }

        public static boolean n(byte b7) {
            return b7 >= 0;
        }

        public static boolean o(byte b7) {
            return b7 < -16;
        }

        public static boolean p(byte b7) {
            return b7 < -32;
        }

        public static char q(int i7) {
            return (char) ((i7 & 1023) + 56320);
        }

        public static int r(byte b7) {
            return b7 & 63;
        }
    }

    public static abstract class b {
        public abstract String a(byte[] bArr, int i7, int i8);

        public abstract int b(CharSequence charSequence, byte[] bArr, int i7, int i8);

        public final boolean c(byte[] bArr, int i7, int i8) {
            return d(0, bArr, i7, i8) == 0;
        }

        public abstract int d(int i7, byte[] bArr, int i8, int i9);
    }

    public static final class c extends b {
        public static int e(byte[] bArr, int i7, int i8) {
            while (i7 < i8 && bArr[i7] >= 0) {
                i7++;
            }
            if (i7 >= i8) {
                return 0;
            }
            return f(bArr, i7, i8);
        }

        public static int f(byte[] bArr, int i7, int i8) {
            while (i7 < i8) {
                int i9 = i7 + 1;
                byte b7 = bArr[i7];
                if (b7 < 0) {
                    if (b7 < -32) {
                        if (i9 >= i8) {
                            return b7;
                        }
                        if (b7 >= -62) {
                            i7 += 2;
                            if (bArr[i9] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b7 >= -16) {
                        if (i9 >= i8 - 2) {
                            return p0.l(bArr, i9, i8);
                        }
                        int i10 = i7 + 2;
                        byte b8 = bArr[i9];
                        if (b8 <= -65 && (((b7 << 28) + (b8 + 112)) >> 30) == 0) {
                            int i11 = i7 + 3;
                            if (bArr[i10] <= -65) {
                                i7 += 4;
                                if (bArr[i11] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i9 >= i8 - 1) {
                        return p0.l(bArr, i9, i8);
                    }
                    int i12 = i7 + 2;
                    byte b9 = bArr[i9];
                    if (b9 <= -65 && ((b7 != -32 || b9 >= -96) && (b7 != -19 || b9 < -96))) {
                        i7 += 3;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                }
                i7 = i9;
            }
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.b
        public String a(byte[] bArr, int i7, int i8) {
            if ((i7 | i8 | ((bArr.length - i7) - i8)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
            }
            int i9 = i7 + i8;
            char[] cArr = new char[i8];
            int i10 = 0;
            while (i7 < i9) {
                byte b7 = bArr[i7];
                if (!a.n(b7)) {
                    break;
                }
                i7++;
                a.i(b7, cArr, i10);
                i10++;
            }
            int i11 = i10;
            while (i7 < i9) {
                int i12 = i7 + 1;
                byte b8 = bArr[i7];
                if (a.n(b8)) {
                    int i13 = i11 + 1;
                    a.i(b8, cArr, i11);
                    while (i12 < i9) {
                        byte b9 = bArr[i12];
                        if (!a.n(b9)) {
                            break;
                        }
                        i12++;
                        a.i(b9, cArr, i13);
                        i13++;
                    }
                    i11 = i13;
                    i7 = i12;
                } else if (a.p(b8)) {
                    if (i12 >= i9) {
                        throw A.d();
                    }
                    i7 += 2;
                    a.k(b8, bArr[i12], cArr, i11);
                    i11++;
                } else if (a.o(b8)) {
                    if (i12 >= i9 - 1) {
                        throw A.d();
                    }
                    int i14 = i7 + 2;
                    i7 += 3;
                    a.j(b8, bArr[i12], bArr[i14], cArr, i11);
                    i11++;
                } else {
                    if (i12 >= i9 - 2) {
                        throw A.d();
                    }
                    byte b10 = bArr[i12];
                    int i15 = i7 + 3;
                    byte b11 = bArr[i7 + 2];
                    i7 += 4;
                    a.h(b8, b10, b11, bArr[i15], cArr, i11);
                    i11 += 2;
                }
            }
            return new String(cArr, 0, i11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.p0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int b(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.p0.c.b(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.p0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int d(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.crypto.tink.shaded.protobuf.p0.a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = com.google.crypto.tink.shaded.protobuf.p0.a(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = com.google.crypto.tink.shaded.protobuf.p0.b(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = e(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.p0.c.d(int, byte[], int, int):int");
        }
    }

    public static class d extends IllegalArgumentException {
        public d(int i7, int i8) {
            super("Unpaired surrogate at index " + i7 + " of " + i8);
        }
    }

    public static final class e extends b {
        public static boolean e() {
            return o0.E() && o0.F();
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x0039, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int f(byte[] r10, long r11, int r13) {
            /*
                int r0 = g(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = com.google.crypto.tink.shaded.protobuf.o0.u(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r11
                byte r11 = com.google.crypto.tink.shaded.protobuf.o0.u(r10, r11)
                if (r11 <= r6) goto L37
                goto L39
            L37:
                r11 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = h(r10, r1, r11, r0)
                return r10
            L48:
                int r13 = r13 + (-3)
                long r2 = r2 + r11
                byte r0 = com.google.crypto.tink.shaded.protobuf.o0.u(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r11 = r11 + r8
                byte r0 = com.google.crypto.tink.shaded.protobuf.o0.u(r10, r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = h(r10, r1, r11, r0)
                return r10
            L6d:
                int r13 = r13 + (-4)
                long r2 = r2 + r11
                byte r0 = com.google.crypto.tink.shaded.protobuf.o0.u(r10, r11)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r11
                byte r0 = com.google.crypto.tink.shaded.protobuf.o0.u(r10, r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = com.google.crypto.tink.shaded.protobuf.o0.u(r10, r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.p0.e.f(byte[], long, int):int");
        }

        public static int g(byte[] bArr, long j7, int i7) {
            int i8 = 0;
            if (i7 < 16) {
                return 0;
            }
            int i9 = 8 - (((int) j7) & 7);
            while (i8 < i9) {
                long j8 = 1 + j7;
                if (o0.u(bArr, j7) < 0) {
                    return i8;
                }
                i8++;
                j7 = j8;
            }
            while (true) {
                int i10 = i8 + 8;
                if (i10 > i7 || (o0.A(bArr, o0.f11408h + j7) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j7 += 8;
                i8 = i10;
            }
            while (i8 < i7) {
                long j9 = j7 + 1;
                if (o0.u(bArr, j7) < 0) {
                    return i8;
                }
                i8++;
                j7 = j9;
            }
            return i7;
        }

        public static int h(byte[] bArr, int i7, long j7, int i8) {
            if (i8 == 0) {
                return p0.i(i7);
            }
            if (i8 == 1) {
                return p0.j(i7, o0.u(bArr, j7));
            }
            if (i8 == 2) {
                return p0.k(i7, o0.u(bArr, j7), o0.u(bArr, j7 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.b
        public String a(byte[] bArr, int i7, int i8) {
            Charset charset = AbstractC1110z.f11553b;
            String str = new String(bArr, i7, i8, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i7, i8 + i7))) {
                throw A.d();
            }
            return str;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.b
        public int b(CharSequence charSequence, byte[] bArr, int i7, int i8) {
            long j7;
            String str;
            String str2;
            int i9;
            long j8;
            long j9;
            char charAt;
            long j10 = i7;
            long j11 = i8 + j10;
            int length = charSequence.length();
            String str3 = " at index ";
            String str4 = "Failed writing ";
            if (length > i8 || bArr.length - i8 < i7) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i7 + i8));
            }
            int i10 = 0;
            while (true) {
                j7 = 1;
                if (i10 >= length || (charAt = charSequence.charAt(i10)) >= 128) {
                    break;
                }
                o0.K(bArr, j10, (byte) charAt);
                i10++;
                j10 = 1 + j10;
            }
            if (i10 == length) {
                return (int) j10;
            }
            while (i10 < length) {
                char charAt2 = charSequence.charAt(i10);
                if (charAt2 >= 128 || j10 >= j11) {
                    if (charAt2 >= 2048 || j10 > j11 - 2) {
                        str = str3;
                        str2 = str4;
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || j10 > j11 - 3) {
                            if (j10 > j11 - 4) {
                                if (55296 <= charAt2 && charAt2 <= 57343 && ((i9 = i10 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i9)))) {
                                    throw new d(i10, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str2 + charAt2 + str + j10);
                            }
                            int i11 = i10 + 1;
                            if (i11 != length) {
                                char charAt3 = charSequence.charAt(i11);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    j8 = 1;
                                    o0.K(bArr, j10, (byte) ((codePoint >>> 18) | 240));
                                    j9 = j11;
                                    o0.K(bArr, j10 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j12 = j10 + 3;
                                    o0.K(bArr, j10 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j10 += 4;
                                    o0.K(bArr, j12, (byte) ((codePoint & 63) | 128));
                                    i10 = i11;
                                } else {
                                    i10 = i11;
                                }
                            }
                            throw new d(i10 - 1, length);
                        }
                        o0.K(bArr, j10, (byte) ((charAt2 >>> '\f') | 480));
                        long j13 = j10 + 2;
                        o0.K(bArr, j10 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j10 += 3;
                        o0.K(bArr, j13, (byte) ((charAt2 & '?') | 128));
                    } else {
                        str = str3;
                        str2 = str4;
                        long j14 = j10 + j7;
                        o0.K(bArr, j10, (byte) ((charAt2 >>> 6) | 960));
                        j10 += 2;
                        o0.K(bArr, j14, (byte) ((charAt2 & '?') | 128));
                    }
                    j9 = j11;
                    j8 = 1;
                } else {
                    o0.K(bArr, j10, (byte) charAt2);
                    j9 = j11;
                    str2 = str4;
                    j8 = j7;
                    j10 += j7;
                    str = str3;
                }
                i10++;
                str3 = str;
                str4 = str2;
                j7 = j8;
                j11 = j9;
            }
            return (int) j10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.o0.u(r13, r1) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.o0.u(r13, r1) > (-65)) goto L59;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.p0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int d(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 204
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.p0.e.d(int, byte[], int, int):int");
        }
    }

    static {
        f11431a = (!e.e() || AbstractC1089d.c()) ? new c() : new e();
    }

    public static String e(byte[] bArr, int i7, int i8) {
        return f11431a.a(bArr, i7, i8);
    }

    public static int f(CharSequence charSequence, byte[] bArr, int i7, int i8) {
        return f11431a.b(charSequence, bArr, i7, i8);
    }

    public static int g(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        while (i7 < length && charSequence.charAt(i7) < 128) {
            i7++;
        }
        int i8 = length;
        while (true) {
            if (i7 < length) {
                char charAt = charSequence.charAt(i7);
                if (charAt >= 2048) {
                    i8 += h(charSequence, i7);
                    break;
                }
                i8 += (127 - charAt) >>> 31;
                i7++;
            } else {
                break;
            }
        }
        if (i8 >= length) {
            return i8;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i8 + 4294967296L));
    }

    public static int h(CharSequence charSequence, int i7) {
        int length = charSequence.length();
        int i8 = 0;
        while (i7 < length) {
            char charAt = charSequence.charAt(i7);
            if (charAt < 2048) {
                i8 += (127 - charAt) >>> 31;
            } else {
                i8 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i7) < 65536) {
                        throw new d(i7, length);
                    }
                    i7++;
                }
            }
            i7++;
        }
        return i8;
    }

    public static int i(int i7) {
        if (i7 > -12) {
            return -1;
        }
        return i7;
    }

    public static int j(int i7, int i8) {
        if (i7 > -12 || i8 > -65) {
            return -1;
        }
        return i7 ^ (i8 << 8);
    }

    public static int k(int i7, int i8, int i9) {
        if (i7 > -12 || i8 > -65 || i9 > -65) {
            return -1;
        }
        return (i7 ^ (i8 << 8)) ^ (i9 << 16);
    }

    public static int l(byte[] bArr, int i7, int i8) {
        byte b7 = bArr[i7 - 1];
        int i9 = i8 - i7;
        if (i9 == 0) {
            return i(b7);
        }
        if (i9 == 1) {
            return j(b7, bArr[i7]);
        }
        if (i9 == 2) {
            return k(b7, bArr[i7], bArr[i7 + 1]);
        }
        throw new AssertionError();
    }

    public static boolean m(byte[] bArr) {
        return f11431a.c(bArr, 0, bArr.length);
    }

    public static boolean n(byte[] bArr, int i7, int i8) {
        return f11431a.c(bArr, i7, i8);
    }
}
