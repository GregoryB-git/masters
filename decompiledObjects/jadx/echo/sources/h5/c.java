package h5;

import V4.h;
import g5.EnumC1320a;
import g5.EnumC1321b;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f14592a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14593a;

        static {
            int[] iArr = new int[EnumC1321b.values().length];
            f14593a = iArr;
            try {
                iArr[EnumC1321b.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14593a[EnumC1321b.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14593a[EnumC1321b.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14593a[EnumC1321b.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void a(String str, Y4.a aVar, String str2) {
        try {
            for (byte b7 : str.getBytes(str2)) {
                aVar.d(b7, 8);
            }
        } catch (UnsupportedEncodingException e7) {
            throw new h(e7);
        }
    }

    public static void b(CharSequence charSequence, Y4.a aVar) {
        int length = charSequence.length();
        int i7 = 0;
        while (i7 < length) {
            int p7 = p(charSequence.charAt(i7));
            if (p7 == -1) {
                throw new h();
            }
            int i8 = i7 + 1;
            if (i8 < length) {
                int p8 = p(charSequence.charAt(i8));
                if (p8 == -1) {
                    throw new h();
                }
                aVar.d((p7 * 45) + p8, 11);
                i7 += 2;
            } else {
                aVar.d(p7, 6);
                i7 = i8;
            }
        }
    }

    public static void c(String str, EnumC1321b enumC1321b, Y4.a aVar, String str2) {
        int i7 = a.f14593a[enumC1321b.ordinal()];
        if (i7 == 1) {
            h(str, aVar);
            return;
        }
        if (i7 == 2) {
            b(str, aVar);
        } else if (i7 == 3) {
            a(str, aVar, str2);
        } else {
            if (i7 != 4) {
                throw new h("Invalid mode: ".concat(String.valueOf(enumC1321b)));
            }
            e(str, aVar);
        }
    }

    public static void d(Y4.c cVar, Y4.a aVar) {
        aVar.d(EnumC1321b.ECI.c(), 4);
        aVar.d(cVar.e(), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[LOOP:0: B:4:0x0008->B:11:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(java.lang.String r6, Y4.a r7) {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L4d
            int r0 = r6.length
            r1 = 0
        L8:
            if (r1 >= r0) goto L4c
            r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L24
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L24
        L22:
            int r2 = r2 - r3
            goto L33
        L24:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L32
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L32
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L22
        L32:
            r2 = r4
        L33:
            if (r2 == r4) goto L44
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.d(r3, r2)
            int r1 = r1 + 2
            goto L8
        L44:
            V4.h r6 = new V4.h
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L4c:
            return
        L4d:
            r6 = move-exception
            V4.h r7 = new V4.h
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.c.e(java.lang.String, Y4.a):void");
    }

    public static void f(int i7, g5.c cVar, EnumC1321b enumC1321b, Y4.a aVar) {
        int e7 = enumC1321b.e(cVar);
        int i8 = 1 << e7;
        if (i7 < i8) {
            aVar.d(i7, e7);
            return;
        }
        throw new h(i7 + " is bigger than " + (i8 - 1));
    }

    public static void g(EnumC1321b enumC1321b, Y4.a aVar) {
        aVar.d(enumC1321b.c(), 4);
    }

    public static void h(CharSequence charSequence, Y4.a aVar) {
        int length = charSequence.length();
        int i7 = 0;
        while (i7 < length) {
            int charAt = charSequence.charAt(i7) - '0';
            int i8 = i7 + 2;
            if (i8 < length) {
                aVar.d((charAt * 100) + ((charSequence.charAt(i7 + 1) - '0') * 10) + (charSequence.charAt(i8) - '0'), 10);
                i7 += 3;
            } else {
                i7++;
                if (i7 < length) {
                    aVar.d((charAt * 10) + (charSequence.charAt(i7) - '0'), 7);
                    i7 = i8;
                } else {
                    aVar.d(charAt, 4);
                }
            }
        }
    }

    public static int i(EnumC1321b enumC1321b, Y4.a aVar, Y4.a aVar2, g5.c cVar) {
        return aVar.l() + enumC1321b.e(cVar) + aVar2.l();
    }

    public static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    public static int k(Y4.a aVar, EnumC1320a enumC1320a, g5.c cVar, b bVar) {
        int i7 = Integer.MAX_VALUE;
        int i8 = -1;
        for (int i9 = 0; i9 < 8; i9++) {
            e.a(aVar, enumC1320a, cVar, i9, bVar);
            int j7 = j(bVar);
            if (j7 < i7) {
                i8 = i9;
                i7 = j7;
            }
        }
        return i8;
    }

    public static EnumC1321b l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && s(str)) {
            return EnumC1321b.KANJI;
        }
        boolean z7 = false;
        boolean z8 = false;
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (charAt >= '0' && charAt <= '9') {
                z8 = true;
            } else {
                if (p(charAt) == -1) {
                    return EnumC1321b.BYTE;
                }
                z7 = true;
            }
        }
        return z7 ? EnumC1321b.ALPHANUMERIC : z8 ? EnumC1321b.NUMERIC : EnumC1321b.BYTE;
    }

    public static g5.c m(int i7, EnumC1320a enumC1320a) {
        for (int i8 = 1; i8 <= 40; i8++) {
            g5.c e7 = g5.c.e(i8);
            if (v(i7, e7, enumC1320a)) {
                return e7;
            }
        }
        throw new h("Data too big");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static h5.f n(java.lang.String r6, g5.EnumC1320a r7, java.util.Map r8) {
        /*
            if (r8 == 0) goto Lc
            V4.c r0 = V4.c.CHARACTER_SET
            boolean r0 = r8.containsKey(r0)
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L1a
            V4.c r1 = V4.c.CHARACTER_SET
            java.lang.Object r1 = r8.get(r1)
            java.lang.String r1 = r1.toString()
            goto L1c
        L1a:
            java.lang.String r1 = "ISO-8859-1"
        L1c:
            g5.b r2 = l(r6, r1)
            Y4.a r3 = new Y4.a
            r3.<init>()
            g5.b r4 = g5.EnumC1321b.BYTE
            if (r2 != r4) goto L34
            if (r0 == 0) goto L34
            Y4.c r0 = Y4.c.c(r1)
            if (r0 == 0) goto L34
            d(r0, r3)
        L34:
            if (r8 == 0) goto L55
            V4.c r0 = V4.c.GS1_FORMAT
            boolean r5 = r8.containsKey(r0)
            if (r5 == 0) goto L55
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L55
            g5.b r0 = g5.EnumC1321b.FNC1_FIRST_POSITION
            g(r0, r3)
        L55:
            g(r2, r3)
            Y4.a r0 = new Y4.a
            r0.<init>()
            c(r6, r2, r0, r1)
            if (r8 == 0) goto L8d
            V4.c r1 = V4.c.QR_VERSION
            boolean r5 = r8.containsKey(r1)
            if (r5 == 0) goto L8d
            java.lang.Object r8 = r8.get(r1)
            java.lang.String r8 = r8.toString()
            int r8 = java.lang.Integer.parseInt(r8)
            g5.c r8 = g5.c.e(r8)
            int r1 = i(r2, r3, r0, r8)
            boolean r1 = v(r1, r8, r7)
            if (r1 == 0) goto L85
            goto L91
        L85:
            V4.h r6 = new V4.h
            java.lang.String r7 = "Data too big for requested version"
            r6.<init>(r7)
            throw r6
        L8d:
            g5.c r8 = t(r7, r2, r3, r0)
        L91:
            Y4.a r1 = new Y4.a
            r1.<init>()
            r1.b(r3)
            if (r2 != r4) goto La0
            int r6 = r0.n()
            goto La4
        La0:
            int r6 = r6.length()
        La4:
            f(r6, r8, r2, r1)
            r1.b(r0)
            g5.c$b r6 = r8.c(r7)
            int r0 = r8.d()
            int r3 = r6.d()
            int r0 = r0 - r3
            u(r0, r1)
            int r3 = r8.d()
            int r6 = r6.c()
            Y4.a r6 = r(r1, r3, r0, r6)
            h5.f r0 = new h5.f
            r0.<init>()
            r0.c(r7)
            r0.f(r2)
            r0.g(r8)
            int r1 = r8.b()
            h5.b r2 = new h5.b
            r2.<init>(r1, r1)
            int r1 = k(r6, r7, r8, r2)
            r0.d(r1)
            h5.e.a(r6, r7, r8, r1, r2)
            r0.e(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.c.n(java.lang.String, g5.a, java.util.Map):h5.f");
    }

    public static byte[] o(byte[] bArr, int i7) {
        int length = bArr.length;
        int[] iArr = new int[length + i7];
        for (int i8 = 0; i8 < length; i8++) {
            iArr[i8] = bArr[i8] & 255;
        }
        new Z4.c(Z4.a.f7864l).b(iArr, i7);
        byte[] bArr2 = new byte[i7];
        for (int i9 = 0; i9 < i7; i9++) {
            bArr2[i9] = (byte) iArr[length + i9];
        }
        return bArr2;
    }

    public static int p(int i7) {
        int[] iArr = f14592a;
        if (i7 < iArr.length) {
            return iArr[i7];
        }
        return -1;
    }

    public static void q(int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2) {
        if (i10 >= i9) {
            throw new h("Block ID too large");
        }
        int i11 = i7 % i9;
        int i12 = i9 - i11;
        int i13 = i7 / i9;
        int i14 = i13 + 1;
        int i15 = i8 / i9;
        int i16 = i15 + 1;
        int i17 = i13 - i15;
        int i18 = i14 - i16;
        if (i17 != i18) {
            throw new h("EC bytes mismatch");
        }
        if (i9 != i12 + i11) {
            throw new h("RS blocks mismatch");
        }
        if (i7 != ((i15 + i17) * i12) + ((i16 + i18) * i11)) {
            throw new h("Total bytes mismatch");
        }
        if (i10 < i12) {
            iArr[0] = i15;
            iArr2[0] = i17;
        } else {
            iArr[0] = i16;
            iArr2[0] = i18;
        }
    }

    public static Y4.a r(Y4.a aVar, int i7, int i8, int i9) {
        if (aVar.n() != i8) {
            throw new h("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i9);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i9; i13++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            q(i7, i8, i9, i13, iArr, iArr2);
            int i14 = iArr[0];
            byte[] bArr = new byte[i14];
            aVar.p(i10 << 3, bArr, 0, i14);
            byte[] o7 = o(bArr, iArr2[0]);
            arrayList.add(new C1338a(bArr, o7));
            i11 = Math.max(i11, i14);
            i12 = Math.max(i12, o7.length);
            i10 += iArr[0];
        }
        if (i8 != i10) {
            throw new h("Data bytes does not match offset");
        }
        Y4.a aVar2 = new Y4.a();
        for (int i15 = 0; i15 < i11; i15++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] a7 = ((C1338a) it.next()).a();
                if (i15 < a7.length) {
                    aVar2.d(a7[i15], 8);
                }
            }
        }
        for (int i16 = 0; i16 < i12; i16++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] b7 = ((C1338a) it2.next()).b();
                if (i16 < b7.length) {
                    aVar2.d(b7[i16], 8);
                }
            }
        }
        if (i7 == aVar2.n()) {
            return aVar2;
        }
        throw new h("Interleaving error: " + i7 + " and " + aVar2.n() + " differ.");
    }

    public static boolean s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i7 = 0; i7 < length; i7 += 2) {
                int i8 = bytes[i7] & 255;
                if ((i8 < 129 || i8 > 159) && (i8 < 224 || i8 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    public static g5.c t(EnumC1320a enumC1320a, EnumC1321b enumC1321b, Y4.a aVar, Y4.a aVar2) {
        return m(i(enumC1321b, aVar, aVar2, m(i(enumC1321b, aVar, aVar2, g5.c.e(1)), enumC1320a)), enumC1320a);
    }

    public static void u(int i7, Y4.a aVar) {
        int i8 = i7 << 3;
        if (aVar.l() > i8) {
            throw new h("data bits cannot fit in the QR Code" + aVar.l() + " > " + i8);
        }
        for (int i9 = 0; i9 < 4 && aVar.l() < i8; i9++) {
            aVar.a(false);
        }
        int l7 = aVar.l() & 7;
        if (l7 > 0) {
            while (l7 < 8) {
                aVar.a(false);
                l7++;
            }
        }
        int n7 = i7 - aVar.n();
        for (int i10 = 0; i10 < n7; i10++) {
            aVar.d((i10 & 1) == 0 ? 236 : 17, 8);
        }
        if (aVar.l() != i8) {
            throw new h("Bits size does not equal capacity");
        }
    }

    public static boolean v(int i7, g5.c cVar, EnumC1320a enumC1320a) {
        return cVar.d() - cVar.c(enumC1320a).d() >= (i7 + 7) / 8;
    }
}
