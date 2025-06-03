package k4;

import a4.d;
import android.util.SparseArray;
import b.a0;
import c4.v;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import k4.a;
import k4.h;
import v3.a1;
import v3.i0;
import v5.c0;
import v5.e0;
import v5.q;
import v5.u;

/* loaded from: classes.dex */
public final class e implements c4.h {
    public static final byte[] I = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final i0 J;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public c4.j E;
    public v[] F;
    public v[] G;
    public boolean H;

    /* renamed from: a, reason: collision with root package name */
    public final int f8966a;

    /* renamed from: b, reason: collision with root package name */
    public final j f8967b;

    /* renamed from: c, reason: collision with root package name */
    public final List<i0> f8968c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray<b> f8969d;

    /* renamed from: e, reason: collision with root package name */
    public final u f8970e;
    public final u f;

    /* renamed from: g, reason: collision with root package name */
    public final u f8971g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f8972h;

    /* renamed from: i, reason: collision with root package name */
    public final u f8973i;

    /* renamed from: j, reason: collision with root package name */
    public final c0 f8974j;

    /* renamed from: k, reason: collision with root package name */
    public final r4.c f8975k;

    /* renamed from: l, reason: collision with root package name */
    public final u f8976l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayDeque<a.C0127a> f8977m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayDeque<a> f8978n;

    /* renamed from: o, reason: collision with root package name */
    public final v f8979o;

    /* renamed from: p, reason: collision with root package name */
    public int f8980p;

    /* renamed from: q, reason: collision with root package name */
    public int f8981q;

    /* renamed from: r, reason: collision with root package name */
    public long f8982r;

    /* renamed from: s, reason: collision with root package name */
    public int f8983s;
    public u t;

    /* renamed from: u, reason: collision with root package name */
    public long f8984u;

    /* renamed from: v, reason: collision with root package name */
    public int f8985v;

    /* renamed from: w, reason: collision with root package name */
    public long f8986w;

    /* renamed from: x, reason: collision with root package name */
    public long f8987x;

    /* renamed from: y, reason: collision with root package name */
    public long f8988y;

    /* renamed from: z, reason: collision with root package name */
    public b f8989z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f8990a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f8991b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8992c;

        public a(int i10, long j10, boolean z10) {
            this.f8990a = j10;
            this.f8991b = z10;
            this.f8992c = i10;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final v f8993a;

        /* renamed from: d, reason: collision with root package name */
        public m f8996d;

        /* renamed from: e, reason: collision with root package name */
        public c f8997e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f8998g;

        /* renamed from: h, reason: collision with root package name */
        public int f8999h;

        /* renamed from: i, reason: collision with root package name */
        public int f9000i;

        /* renamed from: l, reason: collision with root package name */
        public boolean f9003l;

        /* renamed from: b, reason: collision with root package name */
        public final l f8994b = new l();

        /* renamed from: c, reason: collision with root package name */
        public final u f8995c = new u();

        /* renamed from: j, reason: collision with root package name */
        public final u f9001j = new u(1);

        /* renamed from: k, reason: collision with root package name */
        public final u f9002k = new u();

        public b(v vVar, m mVar, c cVar) {
            this.f8993a = vVar;
            this.f8996d = mVar;
            this.f8997e = cVar;
            this.f8996d = mVar;
            this.f8997e = cVar;
            vVar.d(mVar.f9073a.f);
            d();
        }

        public final k a() {
            if (!this.f9003l) {
                return null;
            }
            l lVar = this.f8994b;
            c cVar = lVar.f9057a;
            int i10 = e0.f15881a;
            int i11 = cVar.f8961a;
            k kVar = lVar.f9068m;
            if (kVar == null) {
                k[] kVarArr = this.f8996d.f9073a.f9051k;
                kVar = kVarArr == null ? null : kVarArr[i11];
            }
            if (kVar == null || !kVar.f9052a) {
                return null;
            }
            return kVar;
        }

        public final boolean b() {
            this.f++;
            if (!this.f9003l) {
                return false;
            }
            int i10 = this.f8998g + 1;
            this.f8998g = i10;
            int[] iArr = this.f8994b.f9062g;
            int i11 = this.f8999h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f8999h = i11 + 1;
            this.f8998g = 0;
            return false;
        }

        public final int c(int i10, int i11) {
            u uVar;
            k a10 = a();
            if (a10 == null) {
                return 0;
            }
            int i12 = a10.f9055d;
            if (i12 != 0) {
                uVar = this.f8994b.f9069n;
            } else {
                byte[] bArr = a10.f9056e;
                int i13 = e0.f15881a;
                this.f9002k.E(bArr, bArr.length);
                u uVar2 = this.f9002k;
                i12 = bArr.length;
                uVar = uVar2;
            }
            l lVar = this.f8994b;
            boolean z10 = lVar.f9066k && lVar.f9067l[this.f];
            boolean z11 = z10 || i11 != 0;
            u uVar3 = this.f9001j;
            uVar3.f15974a[0] = (byte) ((z11 ? 128 : 0) | i12);
            uVar3.G(0);
            this.f8993a.a(1, this.f9001j);
            this.f8993a.a(i12, uVar);
            if (!z11) {
                return i12 + 1;
            }
            if (!z10) {
                this.f8995c.D(8);
                u uVar4 = this.f8995c;
                byte[] bArr2 = uVar4.f15974a;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = (byte) ((i11 >> 8) & 255);
                bArr2[3] = (byte) (i11 & 255);
                bArr2[4] = (byte) ((i10 >> 24) & 255);
                bArr2[5] = (byte) ((i10 >> 16) & 255);
                bArr2[6] = (byte) ((i10 >> 8) & 255);
                bArr2[7] = (byte) (i10 & 255);
                this.f8993a.a(8, uVar4);
                return i12 + 1 + 8;
            }
            u uVar5 = this.f8994b.f9069n;
            int A = uVar5.A();
            uVar5.H(-2);
            int i14 = (A * 6) + 2;
            if (i11 != 0) {
                this.f8995c.D(i14);
                byte[] bArr3 = this.f8995c.f15974a;
                uVar5.d(bArr3, 0, i14);
                int i15 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i11;
                bArr3[2] = (byte) ((i15 >> 8) & 255);
                bArr3[3] = (byte) (i15 & 255);
                uVar5 = this.f8995c;
            }
            this.f8993a.a(i14, uVar5);
            return i12 + 1 + i14;
        }

        public final void d() {
            l lVar = this.f8994b;
            lVar.f9060d = 0;
            lVar.f9071p = 0L;
            lVar.f9072q = false;
            lVar.f9066k = false;
            lVar.f9070o = false;
            lVar.f9068m = null;
            this.f = 0;
            this.f8999h = 0;
            this.f8998g = 0;
            this.f9000i = 0;
            this.f9003l = false;
        }
    }

    static {
        i0.a aVar = new i0.a();
        aVar.f15472k = "application/x-emsg";
        J = aVar.a();
    }

    public e() {
        this(0, null, null, Collections.emptyList());
    }

    public e(int i10, c0 c0Var, j jVar, List<i0> list) {
        this(i10, c0Var, jVar, list, null);
    }

    public e(int i10, c0 c0Var, j jVar, List<i0> list, v vVar) {
        this.f8966a = i10;
        this.f8974j = c0Var;
        this.f8967b = jVar;
        this.f8968c = Collections.unmodifiableList(list);
        this.f8979o = vVar;
        this.f8975k = new r4.c();
        this.f8976l = new u(16);
        this.f8970e = new u(q.f15932a);
        this.f = new u(5);
        this.f8971g = new u();
        byte[] bArr = new byte[16];
        this.f8972h = bArr;
        this.f8973i = new u(bArr);
        this.f8977m = new ArrayDeque<>();
        this.f8978n = new ArrayDeque<>();
        this.f8969d = new SparseArray<>();
        this.f8987x = -9223372036854775807L;
        this.f8986w = -9223372036854775807L;
        this.f8988y = -9223372036854775807L;
        this.E = c4.j.f2288i;
        this.F = new v[0];
        this.G = new v[0];
    }

    public static a4.d a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar = (a.b) arrayList.get(i10);
            if (bVar.f8931a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.f8935b.f15974a;
                h.a b10 = h.b(bArr);
                UUID uuid = b10 == null ? null : b10.f9032a;
                if (uuid == null) {
                    v5.m.f("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new d.b(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new a4.d(null, false, (d.b[]) arrayList2.toArray(new d.b[0]));
    }

    public static void c(u uVar, int i10, l lVar) {
        uVar.G(i10 + 8);
        int f = uVar.f() & 16777215;
        if ((f & 1) != 0) {
            throw a1.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (f & 2) != 0;
        int y10 = uVar.y();
        if (y10 == 0) {
            Arrays.fill(lVar.f9067l, 0, lVar.f9061e, false);
            return;
        }
        if (y10 != lVar.f9061e) {
            StringBuilder n2 = a0.j.n("Senc sample count ", y10, " is different from fragment sample count");
            n2.append(lVar.f9061e);
            throw a1.a(n2.toString(), null);
        }
        Arrays.fill(lVar.f9067l, 0, y10, z10);
        lVar.f9069n.D(uVar.f15976c - uVar.f15975b);
        lVar.f9066k = true;
        lVar.f9070o = true;
        u uVar2 = lVar.f9069n;
        uVar.d(uVar2.f15974a, 0, uVar2.f15976c);
        lVar.f9069n.G(0);
        lVar.f9070o = false;
    }

    @Override // c4.h
    public final void b(c4.j jVar) {
        int i10;
        this.E = jVar;
        this.f8980p = 0;
        this.f8983s = 0;
        v[] vVarArr = new v[2];
        this.F = vVarArr;
        v vVar = this.f8979o;
        if (vVar != null) {
            vVarArr[0] = vVar;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i11 = 100;
        if ((this.f8966a & 4) != 0) {
            vVarArr[i10] = jVar.r(100, 5);
            i10++;
            i11 = 101;
        }
        v[] vVarArr2 = (v[]) e0.K(i10, this.F);
        this.F = vVarArr2;
        for (v vVar2 : vVarArr2) {
            vVar2.d(J);
        }
        this.G = new v[this.f8968c.size()];
        int i12 = 0;
        while (i12 < this.G.length) {
            v r10 = this.E.r(i11, 3);
            r10.d(this.f8968c.get(i12));
            this.G[i12] = r10;
            i12++;
            i11++;
        }
        j jVar2 = this.f8967b;
        if (jVar2 != null) {
            this.f8969d.put(0, new b(jVar.r(0, jVar2.f9043b), new m(this.f8967b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0)));
            this.E.m();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:251:0x077c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x077e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0788 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02f7 A[SYNTHETIC] */
    @Override // c4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(c4.i r29, c4.s r30) {
        /*
            Method dump skipped, instructions count: 1935
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.e.d(c4.i, c4.s):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:199:0x03a2, code lost:
    
        if (r0 >= r2.f9046e) goto L161;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(long r48) {
        /*
            Method dump skipped, instructions count: 2028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.e.e(long):void");
    }

    @Override // c4.h
    public final void f(long j10, long j11) {
        int size = this.f8969d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f8969d.valueAt(i10).d();
        }
        this.f8978n.clear();
        this.f8985v = 0;
        this.f8986w = j11;
        this.f8977m.clear();
        this.f8980p = 0;
        this.f8983s = 0;
    }

    @Override // c4.h
    public final boolean i(c4.i iVar) {
        return a0.L(iVar, true, false);
    }

    @Override // c4.h
    public final void release() {
    }
}
