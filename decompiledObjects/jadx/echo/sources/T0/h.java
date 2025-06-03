package T0;

import X2.AbstractC0703v;
import d0.AbstractC1203z;
import d0.C1201x;
import g0.M;
import g0.y;
import g0.z;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class h extends O0.c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f6037b = new a() { // from class: T0.g
        @Override // T0.h.a
        public final boolean a(int i7, int i8, int i9, int i10, int i11) {
            boolean A7;
            A7 = h.A(i7, i8, i9, i10, i11);
            return A7;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final a f6038a;

    public interface a {
        boolean a(int i7, int i8, int i9, int i10, int i11);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f6039a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f6040b;

        /* renamed from: c, reason: collision with root package name */
        public final int f6041c;

        public b(int i7, boolean z7, int i8) {
            this.f6039a = i7;
            this.f6040b = z7;
            this.f6041c = i8;
        }
    }

    public h() {
        this(null);
    }

    public static /* synthetic */ boolean A(int i7, int i8, int i9, int i10, int i11) {
        return false;
    }

    public static int B(z zVar, int i7) {
        byte[] e7 = zVar.e();
        int f7 = zVar.f();
        int i8 = f7;
        while (true) {
            int i9 = i8 + 1;
            if (i9 >= f7 + i7) {
                return i7;
            }
            if ((e7[i8] & 255) == 255 && e7[i9] == 0) {
                System.arraycopy(e7, i8 + 2, e7, i9, (i7 - (i8 - f7)) - 2);
                i7--;
            }
            i8 = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0089, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean C(g0.z r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.f()
        L8:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L25
            int r7 = r18.p()     // Catch: java.lang.Throwable -> L22
            long r8 = r18.I()     // Catch: java.lang.Throwable -> L22
            int r10 = r18.M()     // Catch: java.lang.Throwable -> L22
            goto L2f
        L22:
            r0 = move-exception
            goto Lb2
        L25:
            int r7 = r18.J()     // Catch: java.lang.Throwable -> L22
            int r8 = r18.J()     // Catch: java.lang.Throwable -> L22
            long r8 = (long) r8
            r10 = r6
        L2f:
            r11 = 0
            if (r7 != 0) goto L3d
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3d
            if (r10 != 0) goto L3d
            r1.T(r2)
            return r4
        L3d:
            r7 = 4
            if (r0 != r7) goto L6e
            if (r21 != 0) goto L6e
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4e
            r1.T(r2)
            return r6
        L4e:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6e:
            if (r0 != r7) goto L7e
            r3 = r10 & 64
            if (r3 == 0) goto L76
            r3 = r4
            goto L77
        L76:
            r3 = r6
        L77:
            r7 = r10 & 1
            if (r7 == 0) goto L7c
            goto L8e
        L7c:
            r4 = r6
            goto L8e
        L7e:
            if (r0 != r3) goto L8c
            r3 = r10 & 32
            if (r3 == 0) goto L86
            r3 = r4
            goto L87
        L86:
            r3 = r6
        L87:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L7c
            goto L8e
        L8c:
            r3 = r6
            r4 = r3
        L8e:
            if (r4 == 0) goto L92
            int r3 = r3 + 4
        L92:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9b
            r1.T(r2)
            return r6
        L9b:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L22
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La8
            r1.T(r2)
            return r6
        La8:
            int r3 = (int) r8
            r1.U(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        Lae:
            r1.T(r2)
            return r4
        Lb2:
            r1.T(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.h.C(g0.z, int, int, boolean):boolean");
    }

    public static byte[] d(byte[] bArr, int i7, int i8) {
        return i8 <= i7 ? M.f14266f : Arrays.copyOfRange(bArr, i7, i8);
    }

    public static T0.a f(z zVar, int i7, int i8) {
        int z7;
        String str;
        int G6 = zVar.G();
        Charset w7 = w(G6);
        int i9 = i7 - 1;
        byte[] bArr = new byte[i9];
        zVar.l(bArr, 0, i9);
        if (i8 == 2) {
            str = "image/" + W2.c.e(new String(bArr, 0, 3, W2.e.f6820b));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            z7 = 2;
        } else {
            z7 = z(bArr, 0);
            String e7 = W2.c.e(new String(bArr, 0, z7, W2.e.f6820b));
            if (e7.indexOf(47) == -1) {
                str = "image/" + e7;
            } else {
                str = e7;
            }
        }
        int i10 = bArr[z7 + 1] & 255;
        int i11 = z7 + 2;
        int y7 = y(bArr, i11, G6);
        return new T0.a(str, new String(bArr, i11, y7 - i11, w7), i10, d(bArr, y7 + v(G6), i9));
    }

    public static T0.b g(z zVar, int i7, String str) {
        byte[] bArr = new byte[i7];
        zVar.l(bArr, 0, i7);
        return new T0.b(str, bArr);
    }

    public static c h(z zVar, int i7, int i8, boolean z7, int i9, a aVar) {
        int f7 = zVar.f();
        int z8 = z(zVar.e(), f7);
        String str = new String(zVar.e(), f7, z8 - f7, W2.e.f6820b);
        zVar.T(z8 + 1);
        int p7 = zVar.p();
        int p8 = zVar.p();
        long I6 = zVar.I();
        long j7 = I6 == 4294967295L ? -1L : I6;
        long I7 = zVar.I();
        long j8 = I7 == 4294967295L ? -1L : I7;
        ArrayList arrayList = new ArrayList();
        int i10 = f7 + i7;
        while (zVar.f() < i10) {
            i k7 = k(i8, zVar, z7, i9, aVar);
            if (k7 != null) {
                arrayList.add(k7);
            }
        }
        return new c(str, p7, p8, j7, j8, (i[]) arrayList.toArray(new i[0]));
    }

    public static d i(z zVar, int i7, int i8, boolean z7, int i9, a aVar) {
        int f7 = zVar.f();
        int z8 = z(zVar.e(), f7);
        String str = new String(zVar.e(), f7, z8 - f7, W2.e.f6820b);
        zVar.T(z8 + 1);
        int G6 = zVar.G();
        boolean z9 = (G6 & 2) != 0;
        boolean z10 = (G6 & 1) != 0;
        int G7 = zVar.G();
        String[] strArr = new String[G7];
        for (int i10 = 0; i10 < G7; i10++) {
            int f8 = zVar.f();
            int z11 = z(zVar.e(), f8);
            strArr[i10] = new String(zVar.e(), f8, z11 - f8, W2.e.f6820b);
            zVar.T(z11 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i11 = f7 + i7;
        while (zVar.f() < i11) {
            i k7 = k(i8, zVar, z7, i9, aVar);
            if (k7 != null) {
                arrayList.add(k7);
            }
        }
        return new d(str, z9, z10, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e j(z zVar, int i7) {
        if (i7 < 4) {
            return null;
        }
        int G6 = zVar.G();
        Charset w7 = w(G6);
        byte[] bArr = new byte[3];
        zVar.l(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i8 = i7 - 4;
        byte[] bArr2 = new byte[i8];
        zVar.l(bArr2, 0, i8);
        int y7 = y(bArr2, 0, G6);
        String str2 = new String(bArr2, 0, y7, w7);
        int v7 = y7 + v(G6);
        return new e(str, str2, p(bArr2, v7, y(bArr2, v7, G6), w7));
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0193, code lost:
    
        if (r13 == 67) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static T0.i k(int r20, g0.z r21, boolean r22, int r23, T0.h.a r24) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.h.k(int, g0.z, boolean, int, T0.h$a):T0.i");
    }

    public static f l(z zVar, int i7) {
        int G6 = zVar.G();
        Charset w7 = w(G6);
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        zVar.l(bArr, 0, i8);
        int z7 = z(bArr, 0);
        String t7 = AbstractC1203z.t(new String(bArr, 0, z7, W2.e.f6820b));
        int i9 = z7 + 1;
        int y7 = y(bArr, i9, G6);
        String p7 = p(bArr, i9, y7, w7);
        int v7 = y7 + v(G6);
        int y8 = y(bArr, v7, G6);
        return new f(t7, p7, p(bArr, v7, y8, w7), d(bArr, y8 + v(G6), i8));
    }

    public static b m(z zVar) {
        StringBuilder sb;
        String str;
        boolean z7 = false;
        if (zVar.a() < 10) {
            str = "Data too short to be an ID3 tag";
        } else {
            int J6 = zVar.J();
            if (J6 == 4801587) {
                int G6 = zVar.G();
                zVar.U(1);
                int G7 = zVar.G();
                int F6 = zVar.F();
                if (G6 == 2) {
                    if ((G7 & 64) != 0) {
                        str = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                    }
                } else if (G6 == 3) {
                    if ((G7 & 64) != 0) {
                        int p7 = zVar.p();
                        zVar.U(p7);
                        F6 -= p7 + 4;
                    }
                } else if (G6 == 4) {
                    if ((G7 & 64) != 0) {
                        int F7 = zVar.F();
                        zVar.U(F7 - 4);
                        F6 -= F7;
                    }
                    if ((G7 & 16) != 0) {
                        F6 -= 10;
                    }
                } else {
                    sb = new StringBuilder();
                    sb.append("Skipped ID3 tag with unsupported majorVersion=");
                    sb.append(G6);
                }
                if (G6 < 4 && (G7 & 128) != 0) {
                    z7 = true;
                }
                return new b(G6, z7, F6);
            }
            sb = new StringBuilder();
            sb.append("Unexpected first three bytes of ID3 tag header: 0x");
            sb.append(String.format("%06X", Integer.valueOf(J6)));
            str = sb.toString();
        }
        g0.o.h("Id3Decoder", str);
        return null;
    }

    public static l n(z zVar, int i7) {
        int M6 = zVar.M();
        int J6 = zVar.J();
        int J7 = zVar.J();
        int G6 = zVar.G();
        int G7 = zVar.G();
        y yVar = new y();
        yVar.m(zVar);
        int i8 = ((i7 - 10) * 8) / (G6 + G7);
        int[] iArr = new int[i8];
        int[] iArr2 = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            int h7 = yVar.h(G6);
            int h8 = yVar.h(G7);
            iArr[i9] = h7;
            iArr2[i9] = h8;
        }
        return new l(M6, J6, J7, iArr, iArr2);
    }

    public static m o(z zVar, int i7) {
        byte[] bArr = new byte[i7];
        zVar.l(bArr, 0, i7);
        int z7 = z(bArr, 0);
        return new m(new String(bArr, 0, z7, W2.e.f6820b), d(bArr, z7 + 1, i7));
    }

    public static String p(byte[] bArr, int i7, int i8, Charset charset) {
        return (i8 <= i7 || i8 > bArr.length) ? "" : new String(bArr, i7, i8 - i7, charset);
    }

    public static n q(z zVar, int i7, String str) {
        if (i7 < 1) {
            return null;
        }
        int G6 = zVar.G();
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        zVar.l(bArr, 0, i8);
        return new n(str, null, r(bArr, G6, 0));
    }

    public static AbstractC0703v r(byte[] bArr, int i7, int i8) {
        if (i8 >= bArr.length) {
            return AbstractC0703v.Z("");
        }
        AbstractC0703v.a M6 = AbstractC0703v.M();
        while (true) {
            int y7 = y(bArr, i8, i7);
            if (i8 >= y7) {
                break;
            }
            M6.a(new String(bArr, i8, y7 - i8, w(i7)));
            i8 = v(i7) + y7;
        }
        AbstractC0703v k7 = M6.k();
        return k7.isEmpty() ? AbstractC0703v.Z("") : k7;
    }

    public static n s(z zVar, int i7) {
        if (i7 < 1) {
            return null;
        }
        int G6 = zVar.G();
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        zVar.l(bArr, 0, i8);
        int y7 = y(bArr, 0, G6);
        return new n("TXXX", new String(bArr, 0, y7, w(G6)), r(bArr, G6, y7 + v(G6)));
    }

    public static o t(z zVar, int i7, String str) {
        byte[] bArr = new byte[i7];
        zVar.l(bArr, 0, i7);
        return new o(str, null, new String(bArr, 0, z(bArr, 0), W2.e.f6820b));
    }

    public static o u(z zVar, int i7) {
        if (i7 < 1) {
            return null;
        }
        int G6 = zVar.G();
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        zVar.l(bArr, 0, i8);
        int y7 = y(bArr, 0, G6);
        String str = new String(bArr, 0, y7, w(G6));
        int v7 = y7 + v(G6);
        return new o("WXXX", str, p(bArr, v7, z(bArr, v7), W2.e.f6820b));
    }

    public static int v(int i7) {
        return (i7 == 0 || i7 == 3) ? 1 : 2;
    }

    public static Charset w(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? W2.e.f6820b : W2.e.f6821c : W2.e.f6822d : W2.e.f6824f;
    }

    public static String x(int i7, int i8, int i9, int i10, int i11) {
        return i7 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static int y(byte[] bArr, int i7, int i8) {
        int z7 = z(bArr, i7);
        if (i8 == 0 || i8 == 3) {
            return z7;
        }
        while (z7 < bArr.length - 1) {
            if ((z7 - i7) % 2 == 0 && bArr[z7 + 1] == 0) {
                return z7;
            }
            z7 = z(bArr, z7 + 1);
        }
        return bArr.length;
    }

    public static int z(byte[] bArr, int i7) {
        while (i7 < bArr.length) {
            if (bArr[i7] == 0) {
                return i7;
            }
            i7++;
        }
        return bArr.length;
    }

    @Override // O0.c
    public C1201x b(O0.b bVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public C1201x e(byte[] bArr, int i7) {
        ArrayList arrayList = new ArrayList();
        z zVar = new z(bArr, i7);
        b m7 = m(zVar);
        if (m7 == null) {
            return null;
        }
        int f7 = zVar.f();
        int i8 = m7.f6039a == 2 ? 6 : 10;
        int i9 = m7.f6041c;
        if (m7.f6040b) {
            i9 = B(zVar, m7.f6041c);
        }
        zVar.S(f7 + i9);
        boolean z7 = false;
        if (!C(zVar, m7.f6039a, i8, false)) {
            if (m7.f6039a != 4 || !C(zVar, 4, i8, true)) {
                g0.o.h("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m7.f6039a);
                return null;
            }
            z7 = true;
        }
        while (zVar.a() >= i8) {
            i k7 = k(m7.f6039a, zVar, z7, i8, this.f6038a);
            if (k7 != null) {
                arrayList.add(k7);
            }
        }
        return new C1201x(arrayList);
    }

    public h(a aVar) {
        this.f6038a = aVar;
    }
}
