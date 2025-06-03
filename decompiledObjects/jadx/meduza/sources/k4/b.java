package k4;

import android.util.Pair;
import k4.a;
import v3.i0;
import v5.e0;
import v5.p;
import v5.u;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f8936a = e0.B("OpusHead");

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8937a;

        /* renamed from: b, reason: collision with root package name */
        public int f8938b;

        /* renamed from: c, reason: collision with root package name */
        public int f8939c;

        /* renamed from: d, reason: collision with root package name */
        public long f8940d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f8941e;
        public final u f;

        /* renamed from: g, reason: collision with root package name */
        public final u f8942g;

        /* renamed from: h, reason: collision with root package name */
        public int f8943h;

        /* renamed from: i, reason: collision with root package name */
        public int f8944i;

        public a(u uVar, u uVar2, boolean z10) {
            this.f8942g = uVar;
            this.f = uVar2;
            this.f8941e = z10;
            uVar2.G(12);
            this.f8937a = uVar2.y();
            uVar.G(12);
            this.f8944i = uVar.y();
            x6.b.u("first_chunk must be 1", uVar.f() == 1);
            this.f8938b = -1;
        }

        public final boolean a() {
            int i10 = this.f8938b + 1;
            this.f8938b = i10;
            if (i10 == this.f8937a) {
                return false;
            }
            this.f8940d = this.f8941e ? this.f.z() : this.f.w();
            if (this.f8938b == this.f8943h) {
                this.f8939c = this.f8942g.y();
                this.f8942g.H(4);
                int i11 = this.f8944i - 1;
                this.f8944i = i11;
                this.f8943h = i11 > 0 ? this.f8942g.y() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: k4.b$b, reason: collision with other inner class name */
    public static final class C0128b {

        /* renamed from: a, reason: collision with root package name */
        public final String f8945a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f8946b;

        /* renamed from: c, reason: collision with root package name */
        public final long f8947c;

        /* renamed from: d, reason: collision with root package name */
        public final long f8948d;

        public C0128b(String str, byte[] bArr, long j10, long j11) {
            this.f8945a = str;
            this.f8946b = bArr;
            this.f8947c = j10;
            this.f8948d = j11;
        }
    }

    public interface c {
        int a();

        int b();

        int c();
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final k[] f8949a;

        /* renamed from: b, reason: collision with root package name */
        public i0 f8950b;

        /* renamed from: c, reason: collision with root package name */
        public int f8951c;

        /* renamed from: d, reason: collision with root package name */
        public int f8952d = 0;

        public d(int i10) {
            this.f8949a = new k[i10];
        }
    }

    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        public final int f8953a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8954b;

        /* renamed from: c, reason: collision with root package name */
        public final u f8955c;

        public e(a.b bVar, i0 i0Var) {
            u uVar = bVar.f8935b;
            this.f8955c = uVar;
            uVar.G(12);
            int y10 = uVar.y();
            if ("audio/raw".equals(i0Var.t)) {
                int w10 = e0.w(i0Var.I, i0Var.G);
                if (y10 == 0 || y10 % w10 != 0) {
                    v5.m.f("AtomParsers", "Audio sample size mismatch. stsd sample size: " + w10 + ", stsz sample size: " + y10);
                    y10 = w10;
                }
            }
            this.f8953a = y10 == 0 ? -1 : y10;
            this.f8954b = uVar.y();
        }

        @Override // k4.b.c
        public final int a() {
            return this.f8953a;
        }

        @Override // k4.b.c
        public final int b() {
            return this.f8954b;
        }

        @Override // k4.b.c
        public final int c() {
            int i10 = this.f8953a;
            return i10 == -1 ? this.f8955c.y() : i10;
        }
    }

    public static final class f implements c {

        /* renamed from: a, reason: collision with root package name */
        public final u f8956a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8957b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8958c;

        /* renamed from: d, reason: collision with root package name */
        public int f8959d;

        /* renamed from: e, reason: collision with root package name */
        public int f8960e;

        public f(a.b bVar) {
            u uVar = bVar.f8935b;
            this.f8956a = uVar;
            uVar.G(12);
            this.f8958c = uVar.y() & 255;
            this.f8957b = uVar.y();
        }

        @Override // k4.b.c
        public final int a() {
            return -1;
        }

        @Override // k4.b.c
        public final int b() {
            return this.f8957b;
        }

        @Override // k4.b.c
        public final int c() {
            int i10 = this.f8958c;
            if (i10 == 8) {
                return this.f8956a.v();
            }
            if (i10 == 16) {
                return this.f8956a.A();
            }
            int i11 = this.f8959d;
            this.f8959d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f8960e & 15;
            }
            int v10 = this.f8956a.v();
            this.f8960e = v10;
            return (v10 & 240) >> 4;
        }
    }

    public static C0128b a(int i10, u uVar) {
        uVar.G(i10 + 8 + 4);
        uVar.H(1);
        b(uVar);
        uVar.H(2);
        int v10 = uVar.v();
        if ((v10 & 128) != 0) {
            uVar.H(2);
        }
        if ((v10 & 64) != 0) {
            uVar.H(uVar.v());
        }
        if ((v10 & 32) != 0) {
            uVar.H(2);
        }
        uVar.H(1);
        b(uVar);
        String f10 = p.f(uVar.v());
        if ("audio/mpeg".equals(f10) || "audio/vnd.dts".equals(f10) || "audio/vnd.dts.hd".equals(f10)) {
            return new C0128b(f10, null, -1L, -1L);
        }
        uVar.H(4);
        long w10 = uVar.w();
        long w11 = uVar.w();
        uVar.H(1);
        int b10 = b(uVar);
        byte[] bArr = new byte[b10];
        uVar.d(bArr, 0, b10);
        return new C0128b(f10, bArr, w11 > 0 ? w11 : -1L, w10 > 0 ? w10 : -1L);
    }

    public static int b(u uVar) {
        int v10 = uVar.v();
        int i10 = v10 & 127;
        while ((v10 & 128) == 128) {
            v10 = uVar.v();
            i10 = (i10 << 7) | (v10 & 127);
        }
        return i10;
    }

    public static Pair c(int i10, int i11, u uVar) {
        Integer num;
        k kVar;
        Pair create;
        int i12;
        int i13;
        byte[] bArr;
        int i14 = uVar.f15975b;
        while (i14 - i10 < i11) {
            uVar.G(i14);
            int f10 = uVar.f();
            x6.b.u("childAtomSize must be positive", f10 > 0);
            if (uVar.f() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = 0;
                int i17 = -1;
                String str = null;
                Integer num2 = null;
                while (i15 - i14 < f10) {
                    uVar.G(i15);
                    int f11 = uVar.f();
                    int f12 = uVar.f();
                    if (f12 == 1718775137) {
                        num2 = Integer.valueOf(uVar.f());
                    } else if (f12 == 1935894637) {
                        uVar.H(4);
                        str = uVar.s(4);
                    } else if (f12 == 1935894633) {
                        i17 = i15;
                        i16 = f11;
                    }
                    i15 += f11;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    x6.b.u("frma atom is mandatory", num2 != null);
                    x6.b.u("schi atom is mandatory", i17 != -1);
                    int i18 = i17 + 8;
                    while (true) {
                        if (i18 - i17 >= i16) {
                            num = num2;
                            kVar = null;
                            break;
                        }
                        uVar.G(i18);
                        int f13 = uVar.f();
                        if (uVar.f() == 1952804451) {
                            int f14 = (uVar.f() >> 24) & 255;
                            uVar.H(1);
                            if (f14 == 0) {
                                uVar.H(1);
                                i12 = 0;
                                i13 = 0;
                            } else {
                                int v10 = uVar.v();
                                int i19 = (v10 & 240) >> 4;
                                i12 = v10 & 15;
                                i13 = i19;
                            }
                            boolean z10 = uVar.v() == 1;
                            int v11 = uVar.v();
                            byte[] bArr2 = new byte[16];
                            uVar.d(bArr2, 0, 16);
                            if (z10 && v11 == 0) {
                                int v12 = uVar.v();
                                byte[] bArr3 = new byte[v12];
                                uVar.d(bArr3, 0, v12);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            kVar = new k(z10, str, v11, bArr2, i13, i12, bArr);
                        } else {
                            i18 += f13;
                        }
                    }
                    x6.b.u("tenc atom is mandatory", kVar != null);
                    int i20 = e0.f15881a;
                    create = Pair.create(num, kVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i14 += f10;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static k4.b.d d(v5.u r41, int r42, int r43, java.lang.String r44, a4.d r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 2846
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.b.d(v5.u, int, int, java.lang.String, a4.d, boolean):k4.b$d");
    }

    /* JADX WARN: Code restructure failed: missing block: B:356:0x00e0, code lost:
    
        if (r8 == 0) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x076e A[EDGE_INSN: B:134:0x076e->B:135:0x076e BREAK  A[LOOP:6: B:114:0x070b->B:130:0x0764], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList e(k4.a.C0127a r41, c4.p r42, long r43, a4.d r45, boolean r46, boolean r47, n7.e r48) {
        /*
            Method dump skipped, instructions count: 2144
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.b.e(k4.a$a, c4.p, long, a4.d, boolean, boolean, n7.e):java.util.ArrayList");
    }
}
