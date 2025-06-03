package Z0;

import F0.AbstractC0356a;
import F0.AbstractC0357b;
import F0.AbstractC0358c;
import F0.AbstractC0375u;
import F0.C0359d;
import F0.C0370o;
import F0.E;
import F0.F;
import F0.K;
import F0.W;
import X2.AbstractC0703v;
import Z0.a;
import android.util.Pair;
import d0.AbstractC1203z;
import d0.C1162A;
import d0.C1185h;
import d0.C1190m;
import d0.C1194q;
import d0.C1201x;
import g0.AbstractC1297a;
import g0.AbstractC1300d;
import g0.M;
import g0.z;
import h0.C1326a;
import h0.C1327b;
import h0.C1328c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f7638a = M.r0("OpusHead");

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7639a;

        /* renamed from: b, reason: collision with root package name */
        public int f7640b;

        /* renamed from: c, reason: collision with root package name */
        public int f7641c;

        /* renamed from: d, reason: collision with root package name */
        public long f7642d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f7643e;

        /* renamed from: f, reason: collision with root package name */
        public final z f7644f;

        /* renamed from: g, reason: collision with root package name */
        public final z f7645g;

        /* renamed from: h, reason: collision with root package name */
        public int f7646h;

        /* renamed from: i, reason: collision with root package name */
        public int f7647i;

        public a(z zVar, z zVar2, boolean z7) {
            this.f7645g = zVar;
            this.f7644f = zVar2;
            this.f7643e = z7;
            zVar2.T(12);
            this.f7639a = zVar2.K();
            zVar.T(12);
            this.f7647i = zVar.K();
            AbstractC0375u.a(zVar.p() == 1, "first_chunk must be 1");
            this.f7640b = -1;
        }

        public boolean a() {
            int i7 = this.f7640b + 1;
            this.f7640b = i7;
            if (i7 == this.f7639a) {
                return false;
            }
            this.f7642d = this.f7643e ? this.f7644f.L() : this.f7644f.I();
            if (this.f7640b == this.f7646h) {
                this.f7641c = this.f7645g.K();
                this.f7645g.U(4);
                int i8 = this.f7647i - 1;
                this.f7647i = i8;
                this.f7646h = i8 > 0 ? this.f7645g.K() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: Z0.b$b, reason: collision with other inner class name */
    public static final class C0135b {

        /* renamed from: a, reason: collision with root package name */
        public final String f7648a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f7649b;

        /* renamed from: c, reason: collision with root package name */
        public final long f7650c;

        /* renamed from: d, reason: collision with root package name */
        public final long f7651d;

        public C0135b(String str, byte[] bArr, long j7, long j8) {
            this.f7648a = str;
            this.f7649b = bArr;
            this.f7650c = j7;
            this.f7651d = j8;
        }
    }

    public interface c {
        int a();

        int b();

        int c();
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final t[] f7652a;

        /* renamed from: b, reason: collision with root package name */
        public C1194q f7653b;

        /* renamed from: c, reason: collision with root package name */
        public int f7654c;

        /* renamed from: d, reason: collision with root package name */
        public int f7655d = 0;

        public d(int i7) {
            this.f7652a = new t[i7];
        }
    }

    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        public final int f7656a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7657b;

        /* renamed from: c, reason: collision with root package name */
        public final z f7658c;

        public e(a.b bVar, C1194q c1194q) {
            z zVar = bVar.f7637b;
            this.f7658c = zVar;
            zVar.T(12);
            int K6 = zVar.K();
            if ("audio/raw".equals(c1194q.f12726n)) {
                int g02 = M.g0(c1194q.f12704D, c1194q.f12702B);
                if (K6 == 0 || K6 % g02 != 0) {
                    g0.o.h("AtomParsers", "Audio sample size mismatch. stsd sample size: " + g02 + ", stsz sample size: " + K6);
                    K6 = g02;
                }
            }
            this.f7656a = K6 == 0 ? -1 : K6;
            this.f7657b = zVar.K();
        }

        @Override // Z0.b.c
        public int a() {
            return this.f7656a;
        }

        @Override // Z0.b.c
        public int b() {
            return this.f7657b;
        }

        @Override // Z0.b.c
        public int c() {
            int i7 = this.f7656a;
            return i7 == -1 ? this.f7658c.K() : i7;
        }
    }

    public static final class f implements c {

        /* renamed from: a, reason: collision with root package name */
        public final z f7659a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7660b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7661c;

        /* renamed from: d, reason: collision with root package name */
        public int f7662d;

        /* renamed from: e, reason: collision with root package name */
        public int f7663e;

        public f(a.b bVar) {
            z zVar = bVar.f7637b;
            this.f7659a = zVar;
            zVar.T(12);
            this.f7661c = zVar.K() & 255;
            this.f7660b = zVar.K();
        }

        @Override // Z0.b.c
        public int a() {
            return -1;
        }

        @Override // Z0.b.c
        public int b() {
            return this.f7660b;
        }

        @Override // Z0.b.c
        public int c() {
            int i7 = this.f7661c;
            if (i7 == 8) {
                return this.f7659a.G();
            }
            if (i7 == 16) {
                return this.f7659a.M();
            }
            int i8 = this.f7662d;
            this.f7662d = i8 + 1;
            if (i8 % 2 != 0) {
                return this.f7663e & 15;
            }
            int G6 = this.f7659a.G();
            this.f7663e = G6;
            return (G6 & 240) >> 4;
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f7664a;

        /* renamed from: b, reason: collision with root package name */
        public final long f7665b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7666c;

        public g(int i7, long j7, int i8) {
            this.f7664a = i7;
            this.f7665b = j7;
            this.f7666c = i8;
        }
    }

    public static s A(a.C0134a c0134a, a.b bVar, long j7, C1190m c1190m, boolean z7, boolean z8) {
        a.b bVar2;
        long j8;
        long[] jArr;
        long[] jArr2;
        a.C0134a f7;
        Pair j9;
        a.C0134a c0134a2 = (a.C0134a) AbstractC1297a.e(c0134a.f(1835297121));
        int e7 = e(m(((a.b) AbstractC1297a.e(c0134a2.g(1751411826))).f7637b));
        if (e7 == -1) {
            return null;
        }
        g z9 = z(((a.b) AbstractC1297a.e(c0134a.g(1953196132))).f7637b);
        if (j7 == -9223372036854775807L) {
            bVar2 = bVar;
            j8 = z9.f7665b;
        } else {
            bVar2 = bVar;
            j8 = j7;
        }
        long j10 = r(bVar2.f7637b).f14523q;
        long W02 = j8 != -9223372036854775807L ? M.W0(j8, 1000000L, j10) : -9223372036854775807L;
        a.C0134a c0134a3 = (a.C0134a) AbstractC1297a.e(((a.C0134a) AbstractC1297a.e(c0134a2.f(1835626086))).f(1937007212));
        Pair o7 = o(((a.b) AbstractC1297a.e(c0134a2.g(1835296868))).f7637b);
        a.b g7 = c0134a3.g(1937011556);
        if (g7 == null) {
            throw C1162A.a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        d x7 = x(g7.f7637b, z9.f7664a, z9.f7666c, (String) o7.second, c1190m, z8);
        if (z7 || (f7 = c0134a.f(1701082227)) == null || (j9 = j(f7)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) j9.first;
            jArr2 = (long[]) j9.second;
            jArr = jArr3;
        }
        if (x7.f7653b == null) {
            return null;
        }
        return new s(z9.f7664a, e7, ((Long) o7.first).longValue(), j10, W02, x7.f7653b, x7.f7655d, x7.f7652a, x7.f7654c, jArr, jArr2);
    }

    public static List B(a.C0134a c0134a, E e7, long j7, C1190m c1190m, boolean z7, boolean z8, W2.g gVar) {
        s sVar;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < c0134a.f7636d.size(); i7++) {
            a.C0134a c0134a2 = (a.C0134a) c0134a.f7636d.get(i7);
            if (c0134a2.f7633a == 1953653099 && (sVar = (s) gVar.apply(A(c0134a2, (a.b) AbstractC1297a.e(c0134a.g(1836476516)), j7, c1190m, z7, z8))) != null) {
                arrayList.add(w(sVar, (a.C0134a) AbstractC1297a.e(((a.C0134a) AbstractC1297a.e(((a.C0134a) AbstractC1297a.e(c0134a2.f(1835297121))).f(1835626086))).f(1937007212)), e7));
            }
        }
        return arrayList;
    }

    public static C1201x C(a.b bVar) {
        C1201x F6;
        z zVar = bVar.f7637b;
        zVar.T(8);
        C1201x c1201x = new C1201x(new C1201x.b[0]);
        while (zVar.a() >= 8) {
            int f7 = zVar.f();
            int p7 = zVar.p();
            int p8 = zVar.p();
            if (p8 == 1835365473) {
                zVar.T(f7);
                F6 = D(zVar, f7 + p7);
            } else if (p8 == 1936553057) {
                zVar.T(f7);
                F6 = q.b(zVar, f7 + p7);
            } else if (p8 == -1451722374) {
                F6 = F(zVar);
            } else {
                zVar.T(f7 + p7);
            }
            c1201x = c1201x.b(F6);
            zVar.T(f7 + p7);
        }
        return c1201x;
    }

    public static C1201x D(z zVar, int i7) {
        zVar.U(8);
        f(zVar);
        while (zVar.f() < i7) {
            int f7 = zVar.f();
            int p7 = zVar.p();
            if (zVar.p() == 1768715124) {
                zVar.T(f7);
                return n(zVar, f7 + p7);
            }
            zVar.T(f7 + p7);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.util.List] */
    public static void E(z zVar, int i7, int i8, int i9, int i10, int i11, C1190m c1190m, d dVar, int i12) {
        C1190m c1190m2;
        int i13;
        String str;
        float f7;
        int i14;
        int i15;
        int i16;
        int i17 = i8;
        int i18 = i9;
        C1190m c1190m3 = c1190m;
        d dVar2 = dVar;
        zVar.T(i17 + 16);
        zVar.U(16);
        int M6 = zVar.M();
        int M7 = zVar.M();
        zVar.U(50);
        int f8 = zVar.f();
        int i19 = i7;
        if (i19 == 1701733238) {
            Pair u7 = u(zVar, i17, i18);
            if (u7 != null) {
                i19 = ((Integer) u7.first).intValue();
                c1190m3 = c1190m3 == null ? null : c1190m3.c(((t) u7.second).f7797b);
                dVar2.f7652a[i12] = (t) u7.second;
            }
            zVar.T(f8);
        }
        String str2 = "video/3gpp";
        String str3 = i19 == 1831958048 ? "video/mpeg" : i19 == 1211250227 ? "video/3gpp" : null;
        float f9 = 1.0f;
        int i20 = 8;
        int i21 = 8;
        AbstractC0703v abstractC0703v = null;
        String str4 = null;
        byte[] bArr = null;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        ByteBuffer byteBuffer = null;
        C0135b c0135b = null;
        boolean z7 = false;
        while (f8 - i17 < i18) {
            zVar.T(f8);
            int f10 = zVar.f();
            int p7 = zVar.p();
            if (p7 == 0 && zVar.f() - i17 == i18) {
                break;
            }
            AbstractC0375u.a(p7 > 0, "childAtomSize must be positive");
            int p8 = zVar.p();
            if (p8 == 1635148611) {
                AbstractC0375u.a(str3 == null, null);
                zVar.T(f10 + 8);
                C0359d b7 = C0359d.b(zVar);
                ?? r8 = b7.f1861a;
                dVar2.f7654c = b7.f1862b;
                if (!z7) {
                    f9 = b7.f1871k;
                }
                String str5 = b7.f1872l;
                int i27 = b7.f1870j;
                int i28 = b7.f1867g;
                int i29 = b7.f1868h;
                int i30 = b7.f1869i;
                int i31 = b7.f1865e;
                c1190m2 = c1190m3;
                i13 = i19;
                str = str2;
                i23 = i27;
                i24 = i28;
                i25 = i29;
                i26 = i30;
                i21 = b7.f1866f;
                i20 = i31;
                abstractC0703v = r8;
                str3 = "video/avc";
                str4 = str5;
            } else if (p8 == 1752589123) {
                AbstractC0375u.a(str3 == null, null);
                zVar.T(f10 + 8);
                F a7 = F.a(zVar);
                ?? r22 = a7.f1757a;
                dVar2.f7654c = a7.f1758b;
                if (!z7) {
                    f9 = a7.f1766j;
                }
                int i32 = a7.f1767k;
                String str6 = a7.f1768l;
                c1190m2 = c1190m3;
                i23 = i32;
                i13 = i19;
                str = str2;
                i24 = a7.f1763g;
                i25 = a7.f1764h;
                i26 = a7.f1765i;
                str3 = "video/hevc";
                i20 = a7.f1761e;
                str4 = str6;
                abstractC0703v = r22;
                i21 = a7.f1762f;
            } else {
                if (p8 == 1685480259 || p8 == 1685485123) {
                    c1190m2 = c1190m3;
                    i13 = i19;
                    str = str2;
                    f7 = f9;
                    i14 = i20;
                    i15 = i24;
                    i16 = i26;
                    C0370o a8 = C0370o.a(zVar);
                    if (a8 != null) {
                        str4 = a8.f1941c;
                        str3 = "video/dolby-vision";
                    }
                } else if (p8 == 1987076931) {
                    AbstractC0375u.a(str3 == null, null);
                    String str7 = i19 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                    zVar.T(f10 + 12);
                    zVar.U(2);
                    int G6 = zVar.G();
                    int i33 = G6 >> 4;
                    boolean z8 = (G6 & 1) != 0;
                    int G7 = zVar.G();
                    int G8 = zVar.G();
                    i24 = C1185h.j(G7);
                    i25 = z8 ? 1 : 2;
                    i26 = C1185h.k(G8);
                    c1190m2 = c1190m3;
                    i20 = i33;
                    i21 = i20;
                    i13 = i19;
                    str = str2;
                    str3 = str7;
                } else if (p8 == 1635135811) {
                    int i34 = p7 - 8;
                    byte[] bArr2 = new byte[i34];
                    zVar.l(bArr2, 0, i34);
                    abstractC0703v = AbstractC0703v.Z(bArr2);
                    zVar.T(f10 + 8);
                    C1185h h7 = h(zVar);
                    int i35 = h7.f12632e;
                    int i36 = h7.f12633f;
                    int i37 = h7.f12628a;
                    int i38 = h7.f12629b;
                    i26 = h7.f12630c;
                    c1190m2 = c1190m3;
                    i13 = i19;
                    str = str2;
                    i24 = i37;
                    i25 = i38;
                    str3 = "video/av01";
                    i20 = i35;
                    i21 = i36;
                } else if (p8 == 1668050025) {
                    if (byteBuffer == null) {
                        byteBuffer = a();
                    }
                    ByteBuffer byteBuffer2 = byteBuffer;
                    byteBuffer2.position(21);
                    byteBuffer2.putShort(zVar.C());
                    byteBuffer2.putShort(zVar.C());
                    byteBuffer = byteBuffer2;
                    c1190m2 = c1190m3;
                    i13 = i19;
                    str = str2;
                } else if (p8 == 1835295606) {
                    if (byteBuffer == null) {
                        byteBuffer = a();
                    }
                    ByteBuffer byteBuffer3 = byteBuffer;
                    short C7 = zVar.C();
                    short C8 = zVar.C();
                    short C9 = zVar.C();
                    i13 = i19;
                    short C10 = zVar.C();
                    str = str2;
                    short C11 = zVar.C();
                    short C12 = zVar.C();
                    int i39 = i20;
                    short C13 = zVar.C();
                    c1190m2 = c1190m3;
                    short C14 = zVar.C();
                    long I6 = zVar.I();
                    long I7 = zVar.I();
                    byteBuffer3.position(1);
                    byteBuffer3.putShort(C11);
                    byteBuffer3.putShort(C12);
                    byteBuffer3.putShort(C7);
                    byteBuffer3.putShort(C8);
                    byteBuffer3.putShort(C9);
                    byteBuffer3.putShort(C10);
                    byteBuffer3.putShort(C13);
                    byteBuffer3.putShort(C14);
                    byteBuffer3.putShort((short) (I6 / 10000));
                    byteBuffer3.putShort((short) (I7 / 10000));
                    byteBuffer = byteBuffer3;
                    i20 = i39;
                    f9 = f9;
                } else {
                    c1190m2 = c1190m3;
                    i13 = i19;
                    str = str2;
                    f7 = f9;
                    i14 = i20;
                    if (p8 == 1681012275) {
                        AbstractC0375u.a(str3 == null, null);
                        str3 = str;
                    } else if (p8 == 1702061171) {
                        AbstractC0375u.a(str3 == null, null);
                        c0135b = k(zVar, f10);
                        String str8 = c0135b.f7648a;
                        byte[] bArr3 = c0135b.f7649b;
                        if (bArr3 != null) {
                            abstractC0703v = AbstractC0703v.Z(bArr3);
                        }
                        str3 = str8;
                    } else if (p8 == 1885434736) {
                        f9 = s(zVar, f10);
                        i20 = i14;
                        z7 = true;
                    } else if (p8 == 1937126244) {
                        bArr = t(zVar, f10, p7);
                    } else if (p8 == 1936995172) {
                        int G9 = zVar.G();
                        zVar.U(3);
                        if (G9 == 0) {
                            int G10 = zVar.G();
                            if (G10 == 0) {
                                i22 = 0;
                            } else if (G10 == 1) {
                                i22 = 1;
                            } else if (G10 == 2) {
                                i22 = 2;
                            } else if (G10 == 3) {
                                i22 = 3;
                            }
                        }
                    } else if (p8 == 1668246642) {
                        i15 = i24;
                        i16 = i26;
                        if (i15 == -1 && i16 == -1) {
                            int p9 = zVar.p();
                            if (p9 == 1852009592 || p9 == 1852009571) {
                                int M8 = zVar.M();
                                int M9 = zVar.M();
                                zVar.U(2);
                                boolean z9 = p7 == 19 && (zVar.G() & 128) != 0;
                                i24 = C1185h.j(M8);
                                i25 = z9 ? 1 : 2;
                                i26 = C1185h.k(M9);
                                i20 = i14;
                                f9 = f7;
                            } else {
                                g0.o.h("AtomParsers", "Unsupported color type: " + Z0.a.a(p9));
                            }
                        }
                    } else {
                        i15 = i24;
                        i16 = i26;
                    }
                    i20 = i14;
                    f9 = f7;
                }
                i24 = i15;
                i26 = i16;
                i20 = i14;
                f9 = f7;
            }
            f8 += p7;
            i17 = i8;
            i18 = i9;
            dVar2 = dVar;
            i19 = i13;
            str2 = str;
            c1190m3 = c1190m2;
        }
        C1190m c1190m4 = c1190m3;
        float f11 = f9;
        int i40 = i20;
        int i41 = i24;
        int i42 = i26;
        if (str3 == null) {
            return;
        }
        C1194q.b P6 = new C1194q.b().Z(i10).o0(str3).O(str4).v0(M6).Y(M7).k0(f11).n0(i11).l0(bArr).r0(i22).b0(abstractC0703v).g0(i23).U(c1190m4).P(new C1185h.b().d(i41).c(i25).e(i42).f(byteBuffer != null ? byteBuffer.array() : null).g(i40).b(i21).a());
        if (c0135b != null) {
            P6.M(a3.f.m(c0135b.f7650c)).j0(a3.f.m(c0135b.f7651d));
        }
        dVar.f7653b = P6.K();
    }

    public static C1201x F(z zVar) {
        short C7 = zVar.C();
        zVar.U(2);
        String D7 = zVar.D(C7);
        int max = Math.max(D7.lastIndexOf(43), D7.lastIndexOf(45));
        try {
            return new C1201x(new C1327b(Float.parseFloat(D7.substring(0, max)), Float.parseFloat(D7.substring(max, D7.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    public static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static boolean b(long[] jArr, long j7, long j8, long j9) {
        int length = jArr.length - 1;
        return jArr[0] <= j8 && j8 < jArr[M.p(4, 0, length)] && jArr[M.p(jArr.length - 4, 0, length)] < j9 && j9 <= j7;
    }

    public static boolean c(int i7) {
        return i7 != 1;
    }

    public static int d(z zVar, int i7, int i8, int i9) {
        int f7 = zVar.f();
        AbstractC0375u.a(f7 >= i8, null);
        while (f7 - i8 < i9) {
            zVar.T(f7);
            int p7 = zVar.p();
            AbstractC0375u.a(p7 > 0, "childAtomSize must be positive");
            if (zVar.p() == i7) {
                return f7;
            }
            f7 += p7;
        }
        return -1;
    }

    public static int e(int i7) {
        if (i7 == 1936684398) {
            return 1;
        }
        if (i7 == 1986618469) {
            return 2;
        }
        if (i7 == 1952807028 || i7 == 1935832172 || i7 == 1937072756 || i7 == 1668047728) {
            return 3;
        }
        return i7 == 1835365473 ? 5 : -1;
    }

    public static void f(z zVar) {
        int f7 = zVar.f();
        zVar.U(4);
        if (zVar.p() != 1751411826) {
            f7 += 4;
        }
        zVar.T(f7);
    }

    public static void g(z zVar, int i7, int i8, int i9, int i10, String str, boolean z7, C1190m c1190m, d dVar, int i11) {
        int i12;
        int M6;
        int H6;
        int p7;
        int i13;
        String str2;
        String str3;
        char c7;
        char c8;
        C1194q h7;
        int i14;
        int i15 = i8;
        int i16 = i9;
        C1190m c1190m2 = c1190m;
        zVar.T(i15 + 16);
        if (z7) {
            i12 = zVar.M();
            zVar.U(6);
        } else {
            zVar.U(8);
            i12 = 0;
        }
        if (i12 == 0 || i12 == 1) {
            M6 = zVar.M();
            zVar.U(6);
            H6 = zVar.H();
            zVar.T(zVar.f() - 4);
            p7 = zVar.p();
            if (i12 == 1) {
                zVar.U(16);
            }
            i13 = -1;
        } else {
            if (i12 != 2) {
                return;
            }
            zVar.U(16);
            H6 = (int) Math.round(zVar.o());
            M6 = zVar.K();
            zVar.U(4);
            int K6 = zVar.K();
            int K7 = zVar.K();
            boolean z8 = (K7 & 1) != 0;
            boolean z9 = (K7 & 2) != 0;
            if (z8) {
                if (K6 == 32) {
                    i13 = 4;
                    zVar.U(8);
                    p7 = 0;
                }
                i13 = -1;
                zVar.U(8);
                p7 = 0;
            } else {
                if (K6 == 8) {
                    i13 = 3;
                } else if (K6 == 16) {
                    i13 = z9 ? 268435456 : 2;
                } else if (K6 == 24) {
                    i13 = z9 ? 1342177280 : 21;
                } else {
                    if (K6 == 32) {
                        i13 = z9 ? 1610612736 : 22;
                    }
                    i13 = -1;
                }
                zVar.U(8);
                p7 = 0;
            }
        }
        int f7 = zVar.f();
        int i17 = i7;
        if (i17 == 1701733217) {
            Pair u7 = u(zVar, i15, i16);
            if (u7 != null) {
                i17 = ((Integer) u7.first).intValue();
                c1190m2 = c1190m2 == null ? null : c1190m2.c(((t) u7.second).f7797b);
                dVar.f7652a[i11] = (t) u7.second;
            }
            zVar.T(f7);
        }
        String str4 = "audio/mhm1";
        if (i17 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i17 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i17 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i17 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i17 == 1685353320 || i17 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i17 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i17 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i17 == 1935764850) {
            str2 = "audio/3gpp";
        } else if (i17 == 1935767394) {
            str2 = "audio/amr-wb";
        } else {
            if (i17 != 1936684916) {
                if (i17 == 1953984371) {
                    str2 = "audio/raw";
                    i13 = 268435456;
                } else if (i17 != 1819304813) {
                    str2 = (i17 == 778924082 || i17 == 778924083) ? "audio/mpeg" : i17 == 1835557169 ? "audio/mha1" : i17 == 1835560241 ? "audio/mhm1" : i17 == 1634492771 ? "audio/alac" : i17 == 1634492791 ? "audio/g711-alaw" : i17 == 1970037111 ? "audio/g711-mlaw" : i17 == 1332770163 ? "audio/opus" : i17 == 1716281667 ? "audio/flac" : i17 == 1835823201 ? "audio/true-hd" : null;
                } else if (i13 != -1) {
                    str2 = "audio/raw";
                }
            }
            str2 = "audio/raw";
            i13 = 2;
        }
        int i18 = i13;
        String str5 = null;
        List list = null;
        C0135b c0135b = null;
        while (f7 - i15 < i16) {
            zVar.T(f7);
            int p8 = zVar.p();
            AbstractC0375u.a(p8 > 0, "childAtomSize must be positive");
            int p9 = zVar.p();
            if (p9 == 1835557187) {
                zVar.T(f7 + 8);
                zVar.U(1);
                int G6 = zVar.G();
                zVar.U(1);
                if (Objects.equals(str2, str4)) {
                    i14 = 0;
                    str5 = String.format("mhm1.%02X", Integer.valueOf(G6));
                    str3 = str4;
                } else {
                    i14 = 0;
                    str3 = str4;
                    str5 = String.format("mha1.%02X", Integer.valueOf(G6));
                }
                int M7 = zVar.M();
                byte[] bArr = new byte[M7];
                zVar.l(bArr, i14, M7);
                list = list == null ? AbstractC0703v.Z(bArr) : AbstractC0703v.a0(bArr, (byte[]) list.get(i14));
            } else {
                str3 = str4;
                if (p9 == 1835557200) {
                    zVar.T(f7 + 8);
                    int G7 = zVar.G();
                    if (G7 > 0) {
                        byte[] bArr2 = new byte[G7];
                        zVar.l(bArr2, 0, G7);
                        list = list == null ? AbstractC0703v.Z(bArr2) : AbstractC0703v.a0((byte[]) list.get(0), bArr2);
                    }
                } else {
                    if (p9 == 1702061171 || (z7 && p9 == 2002876005)) {
                        int d7 = p9 == 1702061171 ? f7 : d(zVar, 1702061171, f7, p8);
                        if (d7 != -1) {
                            c0135b = k(zVar, d7);
                            str2 = c0135b.f7648a;
                            byte[] bArr3 = c0135b.f7649b;
                            if (bArr3 != null) {
                                if ("audio/vorbis".equals(str2)) {
                                    list = W.e(bArr3);
                                } else {
                                    if ("audio/mp4a-latm".equals(str2)) {
                                        AbstractC0356a.b e7 = AbstractC0356a.e(bArr3);
                                        int i19 = e7.f1839a;
                                        M6 = e7.f1840b;
                                        str5 = e7.f1841c;
                                        H6 = i19;
                                    }
                                    list = AbstractC0703v.Z(bArr3);
                                }
                            }
                        }
                    } else {
                        if (p9 == 1684103987) {
                            c7 = '\b';
                            zVar.T(f7 + 8);
                            h7 = AbstractC0357b.d(zVar, Integer.toString(i10), str, c1190m2);
                        } else {
                            c7 = '\b';
                            if (p9 == 1684366131) {
                                zVar.T(f7 + 8);
                                h7 = AbstractC0357b.h(zVar, Integer.toString(i10), str, c1190m2);
                            } else if (p9 == 1684103988) {
                                zVar.T(f7 + 8);
                                dVar.f7653b = AbstractC0358c.b(zVar, Integer.toString(i10), str, c1190m2);
                                c8 = 24931;
                            } else if (p9 == 1684892784) {
                                if (p7 <= 0) {
                                    throw C1162A.a("Invalid sample rate for Dolby TrueHD MLP stream: " + p7, null);
                                }
                                H6 = p7;
                                M6 = 2;
                            } else if (p9 == 1684305011 || p9 == 1969517683) {
                                c8 = 24931;
                                dVar.f7653b = new C1194q.b().Z(i10).o0(str2).N(M6).p0(H6).U(c1190m2).e0(str).K();
                            } else if (p9 == 1682927731) {
                                int i20 = p8 - 8;
                                byte[] bArr4 = f7638a;
                                byte[] copyOf = Arrays.copyOf(bArr4, bArr4.length + i20);
                                zVar.T(f7 + 8);
                                zVar.l(copyOf, bArr4.length, i20);
                                list = K.a(copyOf);
                            } else if (p9 == 1684425825) {
                                byte[] bArr5 = new byte[p8 - 8];
                                bArr5[0] = 102;
                                bArr5[1] = 76;
                                bArr5[2] = 97;
                                bArr5[3] = 67;
                                zVar.T(f7 + 12);
                                zVar.l(bArr5, 4, p8 - 12);
                                list = AbstractC0703v.Z(bArr5);
                            } else {
                                c8 = 24931;
                                if (p9 == 1634492771) {
                                    int i21 = p8 - 12;
                                    byte[] bArr6 = new byte[i21];
                                    zVar.T(f7 + 12);
                                    zVar.l(bArr6, 0, i21);
                                    Pair e8 = AbstractC1300d.e(bArr6);
                                    int intValue = ((Integer) e8.first).intValue();
                                    M6 = ((Integer) e8.second).intValue();
                                    list = AbstractC0703v.Z(bArr6);
                                    H6 = intValue;
                                }
                            }
                        }
                        dVar.f7653b = h7;
                        c8 = 24931;
                    }
                    f7 += p8;
                    i15 = i8;
                    i16 = i9;
                    str4 = str3;
                }
            }
            f7 += p8;
            i15 = i8;
            i16 = i9;
            str4 = str3;
        }
        if (dVar.f7653b != null || str2 == null) {
            return;
        }
        C1194q.b e02 = new C1194q.b().Z(i10).o0(str2).O(str5).N(M6).p0(H6).i0(i18).b0(list).U(c1190m2).e0(str);
        if (c0135b != null) {
            e02.M(a3.f.m(c0135b.f7650c)).j0(a3.f.m(c0135b.f7651d));
        }
        dVar.f7653b = e02.K();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static d0.C1185h h(g0.z r15) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.b.h(g0.z):d0.h");
    }

    public static Pair i(z zVar, int i7, int i8) {
        int i9 = i7 + 8;
        int i10 = -1;
        int i11 = 0;
        String str = null;
        Integer num = null;
        while (i9 - i7 < i8) {
            zVar.T(i9);
            int p7 = zVar.p();
            int p8 = zVar.p();
            if (p8 == 1718775137) {
                num = Integer.valueOf(zVar.p());
            } else if (p8 == 1935894637) {
                zVar.U(4);
                str = zVar.D(4);
            } else if (p8 == 1935894633) {
                i10 = i9;
                i11 = p7;
            }
            i9 += p7;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        AbstractC0375u.a(num != null, "frma atom is mandatory");
        AbstractC0375u.a(i10 != -1, "schi atom is mandatory");
        t v7 = v(zVar, i10, i11, str);
        AbstractC0375u.a(v7 != null, "tenc atom is mandatory");
        return Pair.create(num, (t) M.i(v7));
    }

    public static Pair j(a.C0134a c0134a) {
        a.b g7 = c0134a.g(1701606260);
        if (g7 == null) {
            return null;
        }
        z zVar = g7.f7637b;
        zVar.T(8);
        int c7 = Z0.a.c(zVar.p());
        int K6 = zVar.K();
        long[] jArr = new long[K6];
        long[] jArr2 = new long[K6];
        for (int i7 = 0; i7 < K6; i7++) {
            jArr[i7] = c7 == 1 ? zVar.L() : zVar.I();
            jArr2[i7] = c7 == 1 ? zVar.z() : zVar.p();
            if (zVar.C() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zVar.U(2);
        }
        return Pair.create(jArr, jArr2);
    }

    public static C0135b k(z zVar, int i7) {
        zVar.T(i7 + 12);
        zVar.U(1);
        l(zVar);
        zVar.U(2);
        int G6 = zVar.G();
        if ((G6 & 128) != 0) {
            zVar.U(2);
        }
        if ((G6 & 64) != 0) {
            zVar.U(zVar.G());
        }
        if ((G6 & 32) != 0) {
            zVar.U(2);
        }
        zVar.U(1);
        l(zVar);
        String h7 = AbstractC1203z.h(zVar.G());
        if ("audio/mpeg".equals(h7) || "audio/vnd.dts".equals(h7) || "audio/vnd.dts.hd".equals(h7)) {
            return new C0135b(h7, null, -1L, -1L);
        }
        zVar.U(4);
        long I6 = zVar.I();
        long I7 = zVar.I();
        zVar.U(1);
        int l7 = l(zVar);
        byte[] bArr = new byte[l7];
        zVar.l(bArr, 0, l7);
        return new C0135b(h7, bArr, I7 > 0 ? I7 : -1L, I6 > 0 ? I6 : -1L);
    }

    public static int l(z zVar) {
        int G6 = zVar.G();
        int i7 = G6 & 127;
        while ((G6 & 128) == 128) {
            G6 = zVar.G();
            i7 = (i7 << 7) | (G6 & 127);
        }
        return i7;
    }

    public static int m(z zVar) {
        zVar.T(16);
        return zVar.p();
    }

    public static C1201x n(z zVar, int i7) {
        zVar.U(8);
        ArrayList arrayList = new ArrayList();
        while (zVar.f() < i7) {
            C1201x.b c7 = j.c(zVar);
            if (c7 != null) {
                arrayList.add(c7);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C1201x(arrayList);
    }

    public static Pair o(z zVar) {
        zVar.T(8);
        int c7 = Z0.a.c(zVar.p());
        zVar.U(c7 == 0 ? 8 : 16);
        long I6 = zVar.I();
        zVar.U(c7 == 0 ? 4 : 8);
        int M6 = zVar.M();
        return Pair.create(Long.valueOf(I6), "" + ((char) (((M6 >> 10) & 31) + 96)) + ((char) (((M6 >> 5) & 31) + 96)) + ((char) ((M6 & 31) + 96)));
    }

    public static C1201x p(a.C0134a c0134a) {
        a.b g7 = c0134a.g(1751411826);
        a.b g8 = c0134a.g(1801812339);
        a.b g9 = c0134a.g(1768715124);
        if (g7 == null || g8 == null || g9 == null || m(g7.f7637b) != 1835299937) {
            return null;
        }
        z zVar = g8.f7637b;
        zVar.T(12);
        int p7 = zVar.p();
        String[] strArr = new String[p7];
        for (int i7 = 0; i7 < p7; i7++) {
            int p8 = zVar.p();
            zVar.U(4);
            strArr[i7] = zVar.D(p8 - 8);
        }
        z zVar2 = g9.f7637b;
        zVar2.T(8);
        ArrayList arrayList = new ArrayList();
        while (zVar2.a() > 8) {
            int f7 = zVar2.f();
            int p9 = zVar2.p();
            int p10 = zVar2.p() - 1;
            if (p10 < 0 || p10 >= p7) {
                g0.o.h("AtomParsers", "Skipped metadata with unknown key index: " + p10);
            } else {
                C1326a h7 = j.h(zVar2, f7 + p9, strArr[p10]);
                if (h7 != null) {
                    arrayList.add(h7);
                }
            }
            zVar2.T(f7 + p9);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C1201x(arrayList);
    }

    public static void q(z zVar, int i7, int i8, int i9, d dVar) {
        zVar.T(i8 + 16);
        if (i7 == 1835365492) {
            zVar.A();
            String A7 = zVar.A();
            if (A7 != null) {
                dVar.f7653b = new C1194q.b().Z(i9).o0(A7).K();
            }
        }
    }

    public static C1328c r(z zVar) {
        long z7;
        long z8;
        zVar.T(8);
        if (Z0.a.c(zVar.p()) == 0) {
            z7 = zVar.I();
            z8 = zVar.I();
        } else {
            z7 = zVar.z();
            z8 = zVar.z();
        }
        return new C1328c(z7, z8, zVar.I());
    }

    public static float s(z zVar, int i7) {
        zVar.T(i7 + 8);
        return zVar.K() / zVar.K();
    }

    public static byte[] t(z zVar, int i7, int i8) {
        int i9 = i7 + 8;
        while (i9 - i7 < i8) {
            zVar.T(i9);
            int p7 = zVar.p();
            if (zVar.p() == 1886547818) {
                return Arrays.copyOfRange(zVar.e(), i9, p7 + i9);
            }
            i9 += p7;
        }
        return null;
    }

    public static Pair u(z zVar, int i7, int i8) {
        Pair i9;
        int f7 = zVar.f();
        while (f7 - i7 < i8) {
            zVar.T(f7);
            int p7 = zVar.p();
            AbstractC0375u.a(p7 > 0, "childAtomSize must be positive");
            if (zVar.p() == 1936289382 && (i9 = i(zVar, f7, p7)) != null) {
                return i9;
            }
            f7 += p7;
        }
        return null;
    }

    public static t v(z zVar, int i7, int i8, String str) {
        int i9;
        int i10;
        int i11 = i7 + 8;
        while (true) {
            byte[] bArr = null;
            if (i11 - i7 >= i8) {
                return null;
            }
            zVar.T(i11);
            int p7 = zVar.p();
            if (zVar.p() == 1952804451) {
                int c7 = Z0.a.c(zVar.p());
                zVar.U(1);
                if (c7 == 0) {
                    zVar.U(1);
                    i10 = 0;
                    i9 = 0;
                } else {
                    int G6 = zVar.G();
                    i9 = G6 & 15;
                    i10 = (G6 & 240) >> 4;
                }
                boolean z7 = zVar.G() == 1;
                int G7 = zVar.G();
                byte[] bArr2 = new byte[16];
                zVar.l(bArr2, 0, 16);
                if (z7 && G7 == 0) {
                    int G8 = zVar.G();
                    bArr = new byte[G8];
                    zVar.l(bArr, 0, G8);
                }
                return new t(z7, str, G7, bArr2, i10, i9, bArr);
            }
            i11 += p7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x042b A[EDGE_INSN: B:97:0x042b->B:98:0x042b BREAK  A[LOOP:2: B:76:0x03ca->B:92:0x0424], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static Z0.v w(Z0.s r37, Z0.a.C0134a r38, F0.E r39) {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.b.w(Z0.s, Z0.a$a, F0.E):Z0.v");
    }

    public static d x(z zVar, int i7, int i8, String str, C1190m c1190m, boolean z7) {
        int i9;
        zVar.T(12);
        int p7 = zVar.p();
        d dVar = new d(p7);
        for (int i10 = 0; i10 < p7; i10++) {
            int f7 = zVar.f();
            int p8 = zVar.p();
            AbstractC0375u.a(p8 > 0, "childAtomSize must be positive");
            int p9 = zVar.p();
            if (p9 == 1635148593 || p9 == 1635148595 || p9 == 1701733238 || p9 == 1831958048 || p9 == 1836070006 || p9 == 1752589105 || p9 == 1751479857 || p9 == 1932670515 || p9 == 1211250227 || p9 == 1987063864 || p9 == 1987063865 || p9 == 1635135537 || p9 == 1685479798 || p9 == 1685479729 || p9 == 1685481573 || p9 == 1685481521) {
                i9 = f7;
                E(zVar, p9, i9, p8, i7, i8, c1190m, dVar, i10);
            } else if (p9 == 1836069985 || p9 == 1701733217 || p9 == 1633889587 || p9 == 1700998451 || p9 == 1633889588 || p9 == 1835823201 || p9 == 1685353315 || p9 == 1685353317 || p9 == 1685353320 || p9 == 1685353324 || p9 == 1685353336 || p9 == 1935764850 || p9 == 1935767394 || p9 == 1819304813 || p9 == 1936684916 || p9 == 1953984371 || p9 == 778924082 || p9 == 778924083 || p9 == 1835557169 || p9 == 1835560241 || p9 == 1634492771 || p9 == 1634492791 || p9 == 1970037111 || p9 == 1332770163 || p9 == 1716281667) {
                i9 = f7;
                g(zVar, p9, f7, p8, i7, str, z7, c1190m, dVar, i10);
            } else {
                if (p9 == 1414810956 || p9 == 1954034535 || p9 == 2004251764 || p9 == 1937010800 || p9 == 1664495672) {
                    y(zVar, p9, f7, p8, i7, str, dVar);
                } else if (p9 == 1835365492) {
                    q(zVar, p9, f7, i7, dVar);
                } else if (p9 == 1667329389) {
                    dVar.f7653b = new C1194q.b().Z(i7).o0("application/x-camera-motion").K();
                }
                i9 = f7;
            }
            zVar.T(i9 + p8);
        }
        return dVar;
    }

    public static void y(z zVar, int i7, int i8, int i9, int i10, String str, d dVar) {
        zVar.T(i8 + 16);
        String str2 = "application/ttml+xml";
        AbstractC0703v abstractC0703v = null;
        long j7 = Long.MAX_VALUE;
        if (i7 != 1414810956) {
            if (i7 == 1954034535) {
                int i11 = i9 - 16;
                byte[] bArr = new byte[i11];
                zVar.l(bArr, 0, i11);
                abstractC0703v = AbstractC0703v.Z(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i7 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i7 == 1937010800) {
                j7 = 0;
            } else {
                if (i7 != 1664495672) {
                    throw new IllegalStateException();
                }
                dVar.f7655d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        dVar.f7653b = new C1194q.b().Z(i10).o0(str2).e0(str).s0(j7).b0(abstractC0703v).K();
    }

    public static g z(z zVar) {
        long j7;
        zVar.T(8);
        int c7 = Z0.a.c(zVar.p());
        zVar.U(c7 == 0 ? 8 : 16);
        int p7 = zVar.p();
        zVar.U(4);
        int f7 = zVar.f();
        int i7 = c7 == 0 ? 4 : 8;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            j7 = -9223372036854775807L;
            if (i9 >= i7) {
                zVar.U(i7);
                break;
            }
            if (zVar.e()[f7 + i9] != -1) {
                long I6 = c7 == 0 ? zVar.I() : zVar.L();
                if (I6 != 0) {
                    j7 = I6;
                }
            } else {
                i9++;
            }
        }
        zVar.U(16);
        int p8 = zVar.p();
        int p9 = zVar.p();
        zVar.U(4);
        int p10 = zVar.p();
        int p11 = zVar.p();
        if (p8 == 0 && p9 == 65536 && p10 == -65536 && p11 == 0) {
            i8 = 90;
        } else if (p8 == 0 && p9 == -65536 && p10 == 65536 && p11 == 0) {
            i8 = 270;
        } else if (p8 == -65536 && p9 == 0 && p10 == 0 && p11 == -65536) {
            i8 = 180;
        }
        return new g(p7, j7, i8);
    }
}
