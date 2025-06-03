package v3;

import a4.e;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import o7.t;
import p4.a;
import r5.o;
import v3.g1;
import v3.k;
import v3.r1;
import v3.z0;
import z4.r;
import z4.t;

/* loaded from: classes.dex */
public final class g0 implements Handler.Callback, r.a, o.a, z0.d, k.a, g1.a {
    public final s0 A;
    public final z0 B;
    public final m0 C;
    public final long D;
    public n1 E;
    public d1 F;
    public d G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public g S;
    public long T;
    public int U;
    public boolean V;
    public n W;
    public long X = -9223372036854775807L;

    /* renamed from: a, reason: collision with root package name */
    public final j1[] f15352a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<j1> f15353b;

    /* renamed from: c, reason: collision with root package name */
    public final k1[] f15354c;

    /* renamed from: d, reason: collision with root package name */
    public final r5.o f15355d;

    /* renamed from: e, reason: collision with root package name */
    public final r5.p f15356e;
    public final n0 f;

    /* renamed from: o, reason: collision with root package name */
    public final t5.e f15357o;

    /* renamed from: p, reason: collision with root package name */
    public final v5.k f15358p;

    /* renamed from: q, reason: collision with root package name */
    public final HandlerThread f15359q;

    /* renamed from: r, reason: collision with root package name */
    public final Looper f15360r;

    /* renamed from: s, reason: collision with root package name */
    public final r1.c f15361s;
    public final r1.b t;

    /* renamed from: u, reason: collision with root package name */
    public final long f15362u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f15363v;

    /* renamed from: w, reason: collision with root package name */
    public final k f15364w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList<c> f15365x;

    /* renamed from: y, reason: collision with root package name */
    public final v5.c f15366y;

    /* renamed from: z, reason: collision with root package name */
    public final e f15367z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final List<z0.c> f15368a;

        /* renamed from: b, reason: collision with root package name */
        public final z4.e0 f15369b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15370c;

        /* renamed from: d, reason: collision with root package name */
        public final long f15371d;

        public a(ArrayList arrayList, z4.e0 e0Var, int i10, long j10) {
            this.f15368a = arrayList;
            this.f15369b = e0Var;
            this.f15370c = i10;
            this.f15371d = j10;
        }
    }

    public static class b {
    }

    public static final class c implements Comparable<c> {
        public c() {
            throw null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            cVar.getClass();
            return 0;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f15372a;

        /* renamed from: b, reason: collision with root package name */
        public d1 f15373b;

        /* renamed from: c, reason: collision with root package name */
        public int f15374c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f15375d;

        /* renamed from: e, reason: collision with root package name */
        public int f15376e;
        public boolean f;

        /* renamed from: g, reason: collision with root package name */
        public int f15377g;

        public d(d1 d1Var) {
            this.f15373b = d1Var;
        }

        public final void a(int i10) {
            this.f15372a |= i10 > 0;
            this.f15374c += i10;
        }
    }

    public interface e {
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final t.b f15378a;

        /* renamed from: b, reason: collision with root package name */
        public final long f15379b;

        /* renamed from: c, reason: collision with root package name */
        public final long f15380c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f15381d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f15382e;
        public final boolean f;

        public f(t.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f15378a = bVar;
            this.f15379b = j10;
            this.f15380c = j11;
            this.f15381d = z10;
            this.f15382e = z11;
            this.f = z12;
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final r1 f15383a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15384b;

        /* renamed from: c, reason: collision with root package name */
        public final long f15385c;

        public g(r1 r1Var, int i10, long j10) {
            this.f15383a = r1Var;
            this.f15384b = i10;
            this.f15385c = j10;
        }
    }

    public g0(j1[] j1VarArr, r5.o oVar, r5.p pVar, n0 n0Var, t5.e eVar, int i10, boolean z10, w3.a aVar, n1 n1Var, m0 m0Var, long j10, boolean z11, Looper looper, v5.c cVar, io.flutter.plugins.firebase.auth.g gVar, w3.a0 a0Var) {
        this.f15367z = gVar;
        this.f15352a = j1VarArr;
        this.f15355d = oVar;
        this.f15356e = pVar;
        this.f = n0Var;
        this.f15357o = eVar;
        this.M = i10;
        this.N = z10;
        this.E = n1Var;
        this.C = m0Var;
        this.D = j10;
        this.I = z11;
        this.f15366y = cVar;
        this.f15362u = n0Var.c();
        this.f15363v = n0Var.b();
        d1 h10 = d1.h(pVar);
        this.F = h10;
        this.G = new d(h10);
        this.f15354c = new k1[j1VarArr.length];
        for (int i11 = 0; i11 < j1VarArr.length; i11++) {
            j1VarArr[i11].i(i11, a0Var);
            this.f15354c[i11] = j1VarArr[i11].k();
        }
        this.f15364w = new k(this, cVar);
        this.f15365x = new ArrayList<>();
        this.f15353b = Collections.newSetFromMap(new IdentityHashMap());
        this.f15361s = new r1.c();
        this.t = new r1.b();
        oVar.f13773a = this;
        oVar.f13774b = eVar;
        this.V = true;
        v5.a0 b10 = cVar.b(looper, null);
        this.A = new s0(aVar, b10);
        this.B = new z0(this, aVar, b10, a0Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f15359q = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f15360r = looper2;
        this.f15358p = cVar.b(looper2, this);
    }

    public static Pair<Object, Long> F(r1 r1Var, g gVar, boolean z10, int i10, boolean z11, r1.c cVar, r1.b bVar) {
        Pair<Object, Long> i11;
        Object G;
        r1 r1Var2 = gVar.f15383a;
        if (r1Var.p()) {
            return null;
        }
        r1 r1Var3 = r1Var2.p() ? r1Var : r1Var2;
        try {
            i11 = r1Var3.i(cVar, bVar, gVar.f15384b, gVar.f15385c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (r1Var.equals(r1Var3)) {
            return i11;
        }
        if (r1Var.b(i11.first) != -1) {
            return (r1Var3.g(i11.first, bVar).f && r1Var3.m(bVar.f15750c, cVar).f15767w == r1Var3.b(i11.first)) ? r1Var.i(cVar, bVar, r1Var.g(i11.first, bVar).f15750c, gVar.f15385c) : i11;
        }
        if (z10 && (G = G(cVar, bVar, i10, z11, i11.first, r1Var3, r1Var)) != null) {
            return r1Var.i(cVar, bVar, r1Var.g(G, bVar).f15750c, -9223372036854775807L);
        }
        return null;
    }

    public static Object G(r1.c cVar, r1.b bVar, int i10, boolean z10, Object obj, r1 r1Var, r1 r1Var2) {
        int b10 = r1Var.b(obj);
        int h10 = r1Var.h();
        int i11 = b10;
        int i12 = -1;
        for (int i13 = 0; i13 < h10 && i12 == -1; i13++) {
            i11 = r1Var.d(i11, bVar, cVar, i10, z10);
            if (i11 == -1) {
                break;
            }
            i12 = r1Var2.b(r1Var.l(i11));
        }
        if (i12 == -1) {
            return null;
        }
        return r1Var2.l(i12);
    }

    public static void N(j1 j1Var, long j10) {
        j1Var.j();
        if (j1Var instanceof h5.n) {
            h5.n nVar = (h5.n) j1Var;
            x6.b.H(nVar.f15339s);
            nVar.I = j10;
        }
    }

    public static boolean r(j1 j1Var) {
        return j1Var.e() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A() {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.g0.A():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
    
        if (r4.equals(r34.F.f15307b) == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.g0.B(boolean, boolean, boolean, boolean):void");
    }

    public final void C() {
        q0 q0Var = this.A.f15778h;
        this.J = q0Var != null && q0Var.f.f15741h && this.I;
    }

    public final void D(long j10) {
        q0 q0Var = this.A.f15778h;
        long j11 = j10 + (q0Var == null ? 1000000000000L : q0Var.f15712o);
        this.T = j11;
        this.f15364w.f15502a.a(j11);
        for (j1 j1Var : this.f15352a) {
            if (r(j1Var)) {
                j1Var.u(this.T);
            }
        }
        for (q0 q0Var2 = this.A.f15778h; q0Var2 != null; q0Var2 = q0Var2.f15709l) {
            for (r5.h hVar : q0Var2.f15711n.f13777c) {
                if (hVar != null) {
                    hVar.t();
                }
            }
        }
    }

    public final void E(r1 r1Var, r1 r1Var2) {
        if (r1Var.p() && r1Var2.p()) {
            return;
        }
        int size = this.f15365x.size() - 1;
        if (size < 0) {
            Collections.sort(this.f15365x);
        } else {
            this.f15365x.get(size).getClass();
            throw null;
        }
    }

    public final void H(long j10, long j11) {
        this.f15358p.h(j10 + j11);
    }

    public final void I(boolean z10) {
        t.b bVar = this.A.f15778h.f.f15735a;
        long K = K(bVar, this.F.f15322r, true, false);
        if (K != this.F.f15322r) {
            d1 d1Var = this.F;
            this.F = p(bVar, K, d1Var.f15308c, d1Var.f15309d, z10, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a7 A[Catch: all -> 0x0143, TryCatch #0 {all -> 0x0143, blocks: (B:6:0x009d, B:8:0x00a7, B:15:0x00ad, B:17:0x00b3, B:18:0x00b6, B:19:0x00bb, B:21:0x00c5, B:23:0x00cb, B:27:0x00d3, B:28:0x00dd, B:30:0x00ed, B:34:0x00f7, B:36:0x010b, B:39:0x0114, B:42:0x011f), top: B:5:0x009d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(v3.g0.g r20) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.g0.J(v3.g0$g):void");
    }

    public final long K(t.b bVar, long j10, boolean z10, boolean z11) {
        s0 s0Var;
        c0();
        this.K = false;
        if (z11 || this.F.f15310e == 3) {
            X(2);
        }
        q0 q0Var = this.A.f15778h;
        q0 q0Var2 = q0Var;
        while (q0Var2 != null && !bVar.equals(q0Var2.f.f15735a)) {
            q0Var2 = q0Var2.f15709l;
        }
        if (z10 || q0Var != q0Var2 || (q0Var2 != null && q0Var2.f15712o + j10 < 0)) {
            for (j1 j1Var : this.f15352a) {
                d(j1Var);
            }
            if (q0Var2 != null) {
                while (true) {
                    s0Var = this.A;
                    if (s0Var.f15778h == q0Var2) {
                        break;
                    }
                    s0Var.a();
                }
                s0Var.l(q0Var2);
                q0Var2.f15712o = 1000000000000L;
                f(new boolean[this.f15352a.length]);
            }
        }
        s0 s0Var2 = this.A;
        if (q0Var2 != null) {
            s0Var2.l(q0Var2);
            if (!q0Var2.f15702d) {
                q0Var2.f = q0Var2.f.b(j10);
            } else if (q0Var2.f15703e) {
                long l10 = q0Var2.f15699a.l(j10);
                q0Var2.f15699a.s(l10 - this.f15362u, this.f15363v);
                j10 = l10;
            }
            D(j10);
            t();
        } else {
            s0Var2.b();
            D(j10);
        }
        l(false);
        this.f15358p.i(2);
        return j10;
    }

    public final void L(g1 g1Var) {
        if (g1Var.f != this.f15360r) {
            this.f15358p.k(15, g1Var).a();
            return;
        }
        synchronized (g1Var) {
        }
        try {
            g1Var.f15386a.q(g1Var.f15389d, g1Var.f15390e);
            g1Var.b(true);
            int i10 = this.F.f15310e;
            if (i10 == 3 || i10 == 2) {
                this.f15358p.i(2);
            }
        } catch (Throwable th) {
            g1Var.b(true);
            throw th;
        }
    }

    public final void M(g1 g1Var) {
        Looper looper = g1Var.f;
        if (looper.getThread().isAlive()) {
            this.f15366y.b(looper, null).e(new x0.f(6, this, g1Var));
        } else {
            v5.m.f("TAG", "Trying to send message on a dead thread.");
            g1Var.b(false);
        }
    }

    public final void O(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.O != z10) {
            this.O = z10;
            if (!z10) {
                for (j1 j1Var : this.f15352a) {
                    if (!r(j1Var) && this.f15353b.remove(j1Var)) {
                        j1Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void P(a aVar) {
        this.G.a(1);
        if (aVar.f15370c != -1) {
            this.S = new g(new h1(aVar.f15368a, aVar.f15369b), aVar.f15370c, aVar.f15371d);
        }
        z0 z0Var = this.B;
        List<z0.c> list = aVar.f15368a;
        z4.e0 e0Var = aVar.f15369b;
        z0Var.g(0, z0Var.f15825b.size());
        m(z0Var.a(z0Var.f15825b.size(), list, e0Var), false);
    }

    public final void Q(boolean z10) {
        if (z10 == this.Q) {
            return;
        }
        this.Q = z10;
        if (z10 || !this.F.f15319o) {
            return;
        }
        this.f15358p.i(2);
    }

    public final void R(boolean z10) {
        this.I = z10;
        C();
        if (this.J) {
            s0 s0Var = this.A;
            if (s0Var.f15779i != s0Var.f15778h) {
                I(true);
                l(false);
            }
        }
    }

    public final void S(int i10, int i11, boolean z10, boolean z11) {
        this.G.a(z11 ? 1 : 0);
        d dVar = this.G;
        dVar.f15372a = true;
        dVar.f = true;
        dVar.f15377g = i11;
        this.F = this.F.c(i10, z10);
        this.K = false;
        for (q0 q0Var = this.A.f15778h; q0Var != null; q0Var = q0Var.f15709l) {
            for (r5.h hVar : q0Var.f15711n.f13777c) {
                if (hVar != null) {
                    hVar.e();
                }
            }
        }
        if (!Y()) {
            c0();
            e0();
            return;
        }
        int i12 = this.F.f15310e;
        if (i12 == 3) {
            a0();
        } else if (i12 != 2) {
            return;
        }
        this.f15358p.i(2);
    }

    public final void T(e1 e1Var) {
        this.f15358p.j(16);
        this.f15364w.c(e1Var);
        e1 f10 = this.f15364w.f();
        o(f10, f10.f15327a, true, true);
    }

    public final void U(int i10) {
        this.M = i10;
        s0 s0Var = this.A;
        r1 r1Var = this.F.f15306a;
        s0Var.f = i10;
        if (!s0Var.o(r1Var)) {
            I(true);
        }
        l(false);
    }

    public final void V(boolean z10) {
        this.N = z10;
        s0 s0Var = this.A;
        r1 r1Var = this.F.f15306a;
        s0Var.f15777g = z10;
        if (!s0Var.o(r1Var)) {
            I(true);
        }
        l(false);
    }

    public final void W(z4.e0 e0Var) {
        this.G.a(1);
        z0 z0Var = this.B;
        int size = z0Var.f15825b.size();
        if (e0Var.getLength() != size) {
            e0Var = e0Var.g().e(0, size);
        }
        z0Var.f15832j = e0Var;
        m(z0Var.c(), false);
    }

    public final void X(int i10) {
        d1 d1Var = this.F;
        if (d1Var.f15310e != i10) {
            if (i10 != 2) {
                this.X = -9223372036854775807L;
            }
            this.F = d1Var.f(i10);
        }
    }

    public final boolean Y() {
        d1 d1Var = this.F;
        return d1Var.f15316l && d1Var.f15317m == 0;
    }

    public final boolean Z(r1 r1Var, t.b bVar) {
        if (bVar.a() || r1Var.p()) {
            return false;
        }
        r1Var.m(r1Var.g(bVar.f17725a, this.t).f15750c, this.f15361s);
        if (!this.f15361s.a()) {
            return false;
        }
        r1.c cVar = this.f15361s;
        return cVar.f15762q && cVar.f != -9223372036854775807L;
    }

    @Override // z4.d0.a
    public final void a(z4.r rVar) {
        this.f15358p.k(9, rVar).a();
    }

    public final void a0() {
        this.K = false;
        k kVar = this.f15364w;
        kVar.f = true;
        v5.y yVar = kVar.f15502a;
        if (!yVar.f15990b) {
            yVar.f15992d = yVar.f15989a.d();
            yVar.f15990b = true;
        }
        for (j1 j1Var : this.f15352a) {
            if (r(j1Var)) {
                j1Var.start();
            }
        }
    }

    @Override // z4.r.a
    public final void b(z4.r rVar) {
        this.f15358p.k(8, rVar).a();
    }

    public final void b0(boolean z10, boolean z11) {
        B(z10 || !this.O, false, true, false);
        this.G.a(z11 ? 1 : 0);
        this.f.i();
        X(1);
    }

    public final void c(a aVar, int i10) {
        this.G.a(1);
        z0 z0Var = this.B;
        if (i10 == -1) {
            i10 = z0Var.f15825b.size();
        }
        m(z0Var.a(i10, aVar.f15368a, aVar.f15369b), false);
    }

    public final void c0() {
        k kVar = this.f15364w;
        kVar.f = false;
        v5.y yVar = kVar.f15502a;
        if (yVar.f15990b) {
            yVar.a(yVar.l());
            yVar.f15990b = false;
        }
        for (j1 j1Var : this.f15352a) {
            if (r(j1Var) && j1Var.e() == 2) {
                j1Var.stop();
            }
        }
    }

    public final void d(j1 j1Var) {
        if (j1Var.e() != 0) {
            k kVar = this.f15364w;
            if (j1Var == kVar.f15504c) {
                kVar.f15505d = null;
                kVar.f15504c = null;
                kVar.f15506e = true;
            }
            if (j1Var.e() == 2) {
                j1Var.stop();
            }
            j1Var.g();
            this.R--;
        }
    }

    public final void d0() {
        q0 q0Var = this.A.f15780j;
        boolean z10 = this.L || (q0Var != null && q0Var.f15699a.isLoading());
        d1 d1Var = this.F;
        if (z10 != d1Var.f15311g) {
            this.F = new d1(d1Var.f15306a, d1Var.f15307b, d1Var.f15308c, d1Var.f15309d, d1Var.f15310e, d1Var.f, z10, d1Var.f15312h, d1Var.f15313i, d1Var.f15314j, d1Var.f15315k, d1Var.f15316l, d1Var.f15317m, d1Var.f15318n, d1Var.f15320p, d1Var.f15321q, d1Var.f15322r, d1Var.f15319o);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (r0.f15781k < 100) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0501, code lost:
    
        if (r4.g(r7 == null ? 0 : java.lang.Math.max(0L, r5 - (r57.T - r7.f15712o)), r57.f15364w.f().f15327a, r57.K, r31) != false) goto L341;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02f8 A[EDGE_INSN: B:202:0x02f8->B:203:0x02f8 BREAK  A[LOOP:4: B:170:0x0292->B:181:0x02f5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x038c A[EDGE_INSN: B:236:0x038c->B:244:0x038c BREAK  A[LOOP:6: B:207:0x0304->B:233:0x0368], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0184  */
    /* JADX WARN: Type inference failed for: r1v102 */
    /* JADX WARN: Type inference failed for: r1v81 */
    /* JADX WARN: Type inference failed for: r1v82, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 1640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.g0.e():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0175  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x014b -> B:62:0x014d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e0() {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.g0.e0():void");
    }

    public final void f(boolean[] zArr) {
        v5.o oVar;
        q0 q0Var = this.A.f15779i;
        r5.p pVar = q0Var.f15711n;
        for (int i10 = 0; i10 < this.f15352a.length; i10++) {
            if (!pVar.b(i10) && this.f15353b.remove(this.f15352a[i10])) {
                this.f15352a[i10].reset();
            }
        }
        for (int i11 = 0; i11 < this.f15352a.length; i11++) {
            if (pVar.b(i11)) {
                boolean z10 = zArr[i11];
                j1 j1Var = this.f15352a[i11];
                if (r(j1Var)) {
                    continue;
                } else {
                    s0 s0Var = this.A;
                    q0 q0Var2 = s0Var.f15779i;
                    boolean z11 = q0Var2 == s0Var.f15778h;
                    r5.p pVar2 = q0Var2.f15711n;
                    l1 l1Var = pVar2.f13776b[i11];
                    r5.h hVar = pVar2.f13777c[i11];
                    int length = hVar != null ? hVar.length() : 0;
                    i0[] i0VarArr = new i0[length];
                    for (int i12 = 0; i12 < length; i12++) {
                        i0VarArr[i12] = hVar.b(i12);
                    }
                    boolean z12 = Y() && this.F.f15310e == 3;
                    boolean z13 = !z10 && z12;
                    this.R++;
                    this.f15353b.add(j1Var);
                    j1Var.y(l1Var, i0VarArr, q0Var2.f15701c[i11], this.T, z13, z11, q0Var2.e(), q0Var2.f15712o);
                    j1Var.q(11, new f0(this));
                    k kVar = this.f15364w;
                    kVar.getClass();
                    v5.o w10 = j1Var.w();
                    if (w10 != null && w10 != (oVar = kVar.f15505d)) {
                        if (oVar != null) {
                            throw new n(2, 1000, new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                        kVar.f15505d = w10;
                        kVar.f15504c = j1Var;
                        w10.c(kVar.f15502a.f15993e);
                    }
                    if (z12) {
                        j1Var.start();
                    }
                }
            }
        }
        q0Var.f15704g = true;
    }

    public final void f0(r1 r1Var, t.b bVar, r1 r1Var2, t.b bVar2, long j10, boolean z10) {
        if (!Z(r1Var, bVar)) {
            e1 e1Var = bVar.a() ? e1.f15326d : this.F.f15318n;
            if (this.f15364w.f().equals(e1Var)) {
                return;
            }
            this.f15358p.j(16);
            this.f15364w.c(e1Var);
            o(this.F.f15318n, e1Var.f15327a, false, false);
            return;
        }
        r1Var.m(r1Var.g(bVar.f17725a, this.t).f15750c, this.f15361s);
        this.C.d(this.f15361s.f15764s);
        if (j10 != -9223372036854775807L) {
            this.C.e(g(r1Var, bVar.f17725a, j10));
            return;
        }
        if (!v5.e0.a(r1Var2.p() ? null : r1Var2.m(r1Var2.g(bVar2.f17725a, this.t).f15750c, this.f15361s).f15755a, this.f15361s.f15755a) || z10) {
            this.C.e(-9223372036854775807L);
        }
    }

    public final long g(r1 r1Var, Object obj, long j10) {
        r1Var.m(r1Var.g(obj, this.t).f15750c, this.f15361s);
        r1.c cVar = this.f15361s;
        if (cVar.f != -9223372036854775807L && cVar.a()) {
            r1.c cVar2 = this.f15361s;
            if (cVar2.f15762q) {
                return v5.e0.I(v5.e0.u(cVar2.f15760o) - this.f15361s.f) - (j10 + this.t.f15752e);
            }
        }
        return -9223372036854775807L;
    }

    public final synchronized void g0(defpackage.e eVar, long j10) {
        long d10 = this.f15366y.d() + j10;
        boolean z10 = false;
        while (!((Boolean) eVar.get()).booleanValue() && j10 > 0) {
            try {
                this.f15366y.c();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = d10 - this.f15366y.d();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final long h() {
        q0 q0Var = this.A.f15779i;
        if (q0Var == null) {
            return 0L;
        }
        long j10 = q0Var.f15712o;
        if (!q0Var.f15702d) {
            return j10;
        }
        int i10 = 0;
        while (true) {
            j1[] j1VarArr = this.f15352a;
            if (i10 >= j1VarArr.length) {
                return j10;
            }
            if (r(j1VarArr[i10]) && this.f15352a[i10].r() == q0Var.f15701c[i10]) {
                long t = this.f15352a[i10].t();
                if (t == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j10 = Math.max(t, j10);
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [v3.g0] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r7v16, types: [t5.l] */
    /* JADX WARN: Type inference failed for: r7v18, types: [a4.e$a] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10;
        n nVar;
        q0 q0Var;
        int i11;
        z4.b bVar;
        try {
            switch (message.what) {
                case 0:
                    x();
                    break;
                case 1:
                    S(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    e();
                    break;
                case 3:
                    J((g) message.obj);
                    break;
                case 4:
                    T((e1) message.obj);
                    break;
                case 5:
                    this.E = (n1) message.obj;
                    break;
                case 6:
                    b0(false, true);
                    break;
                case 7:
                    y();
                    return true;
                case 8:
                    n((z4.r) message.obj);
                    break;
                case 9:
                    j((z4.r) message.obj);
                    break;
                case 10:
                    A();
                    break;
                case 11:
                    U(message.arg1);
                    break;
                case 12:
                    V(message.arg1 != 0);
                    break;
                case 13:
                    O(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    g1 g1Var = (g1) message.obj;
                    g1Var.getClass();
                    L(g1Var);
                    break;
                case 15:
                    M((g1) message.obj);
                    break;
                case 16:
                    e1 e1Var = (e1) message.obj;
                    o(e1Var, e1Var.f15327a, true, false);
                    break;
                case 17:
                    P((a) message.obj);
                    break;
                case 18:
                    c((a) message.obj, message.arg1);
                    break;
                case 19:
                    w((b) message.obj);
                    break;
                case 20:
                    z(message.arg1, message.arg2, (z4.e0) message.obj);
                    break;
                case 21:
                    W((z4.e0) message.obj);
                    break;
                case 22:
                    v();
                    break;
                case 23:
                    R(message.arg1 != 0);
                    break;
                case 24:
                    Q(message.arg1 == 1);
                    break;
                case 25:
                    I(true);
                    break;
                default:
                    return false;
            }
        } catch (e.a e10) {
            i10 = e10.f176a;
            bVar = e10;
            k(bVar, i10);
        } catch (t5.l e11) {
            i10 = e11.f14532a;
            bVar = e11;
            k(bVar, i10);
        } catch (a1 e12) {
            int i12 = e12.f15238b;
            if (i12 == 1) {
                i11 = e12.f15237a ? 3001 : 3003;
            } else {
                if (i12 == 4) {
                    i11 = e12.f15237a ? 3002 : 3004;
                }
                k(e12, r2);
            }
            r2 = i11;
            k(e12, r2);
        } catch (IOException e13) {
            i10 = 2000;
            bVar = e13;
            k(bVar, i10);
        } catch (RuntimeException e14) {
            nVar = new n(2, ((e14 instanceof IllegalStateException) || (e14 instanceof IllegalArgumentException)) ? 1004 : 1000, e14);
            v5.m.d("ExoPlayerImplInternal", "Playback error", nVar);
            b0(true, false);
            this.F = this.F.d(nVar);
        } catch (n e15) {
            e = e15;
            if (e.f15519c == 1 && (q0Var = this.A.f15779i) != null) {
                e = e.a(q0Var.f.f15735a);
            }
            nVar = e;
            if (nVar.f15524q && this.W == null) {
                v5.m.g("ExoPlayerImplInternal", "Recoverable renderer error", nVar);
                this.W = nVar;
                v5.k kVar = this.f15358p;
                kVar.c(kVar.k(25, nVar));
            } else {
                n nVar2 = this.W;
                if (nVar2 != null) {
                    nVar2.addSuppressed(nVar);
                    nVar = this.W;
                }
                v5.m.d("ExoPlayerImplInternal", "Playback error", nVar);
                b0(true, false);
                this.F = this.F.d(nVar);
            }
        } catch (z4.b e16) {
            i10 = 1002;
            bVar = e16;
            k(bVar, i10);
        }
        u();
        return true;
    }

    public final Pair<t.b, Long> i(r1 r1Var) {
        if (r1Var.p()) {
            return Pair.create(d1.f15305s, 0L);
        }
        Pair<Object, Long> i10 = r1Var.i(this.f15361s, this.t, r1Var.a(this.N), -9223372036854775807L);
        t.b n2 = this.A.n(r1Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (n2.a()) {
            r1Var.g(n2.f17725a, this.t);
            longValue = n2.f17727c == this.t.f(n2.f17726b) ? this.t.f15753o.f216c : 0L;
        }
        return Pair.create(n2, Long.valueOf(longValue));
    }

    public final void j(z4.r rVar) {
        q0 q0Var = this.A.f15780j;
        if (q0Var != null && q0Var.f15699a == rVar) {
            long j10 = this.T;
            if (q0Var != null) {
                x6.b.H(q0Var.f15709l == null);
                if (q0Var.f15702d) {
                    q0Var.f15699a.h(j10 - q0Var.f15712o);
                }
            }
            t();
        }
    }

    public final void k(IOException iOException, int i10) {
        n nVar = new n(0, i10, iOException);
        q0 q0Var = this.A.f15778h;
        if (q0Var != null) {
            nVar = nVar.a(q0Var.f.f15735a);
        }
        v5.m.d("ExoPlayerImplInternal", "Playback error", nVar);
        b0(false, false);
        this.F = this.F.d(nVar);
    }

    public final void l(boolean z10) {
        q0 q0Var = this.A.f15780j;
        t.b bVar = q0Var == null ? this.F.f15307b : q0Var.f.f15735a;
        boolean z11 = !this.F.f15315k.equals(bVar);
        if (z11) {
            this.F = this.F.a(bVar);
        }
        d1 d1Var = this.F;
        d1Var.f15320p = q0Var == null ? d1Var.f15322r : q0Var.d();
        d1 d1Var2 = this.F;
        long j10 = d1Var2.f15320p;
        q0 q0Var2 = this.A.f15780j;
        d1Var2.f15321q = q0Var2 != null ? Math.max(0L, j10 - (this.T - q0Var2.f15712o)) : 0L;
        if ((z11 || z10) && q0Var != null && q0Var.f15702d) {
            this.f.a(this.f15352a, q0Var.f15711n.f13777c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0214 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0394  */
    /* JADX WARN: Type inference failed for: r22v0, types: [long] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(v3.r1 r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.g0.m(v3.r1, boolean):void");
    }

    public final void n(z4.r rVar) {
        q0 q0Var = this.A.f15780j;
        if (q0Var != null && q0Var.f15699a == rVar) {
            float f10 = this.f15364w.f().f15327a;
            r1 r1Var = this.F.f15306a;
            q0Var.f15702d = true;
            q0Var.f15710m = q0Var.f15699a.q();
            r5.p g10 = q0Var.g(f10, r1Var);
            r0 r0Var = q0Var.f;
            long j10 = r0Var.f15736b;
            long j11 = r0Var.f15739e;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                j10 = Math.max(0L, j11 - 1);
            }
            long a10 = q0Var.a(g10, j10, false, new boolean[q0Var.f15706i.length]);
            long j12 = q0Var.f15712o;
            r0 r0Var2 = q0Var.f;
            q0Var.f15712o = (r0Var2.f15736b - a10) + j12;
            q0Var.f = r0Var2.b(a10);
            this.f.a(this.f15352a, q0Var.f15711n.f13777c);
            if (q0Var == this.A.f15778h) {
                D(q0Var.f.f15736b);
                f(new boolean[this.f15352a.length]);
                d1 d1Var = this.F;
                t.b bVar = d1Var.f15307b;
                long j13 = q0Var.f.f15736b;
                this.F = p(bVar, j13, d1Var.f15308c, j13, false, 5);
            }
            t();
        }
    }

    public final void o(e1 e1Var, float f10, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                this.G.a(1);
            }
            this.F = this.F.e(e1Var);
        }
        float f11 = e1Var.f15327a;
        q0 q0Var = this.A.f15778h;
        while (true) {
            i10 = 0;
            if (q0Var == null) {
                break;
            }
            r5.h[] hVarArr = q0Var.f15711n.f13777c;
            int length = hVarArr.length;
            while (i10 < length) {
                r5.h hVar = hVarArr[i10];
                if (hVar != null) {
                    hVar.r(f11);
                }
                i10++;
            }
            q0Var = q0Var.f15709l;
        }
        j1[] j1VarArr = this.f15352a;
        int length2 = j1VarArr.length;
        while (i10 < length2) {
            j1 j1Var = j1VarArr[i10];
            if (j1Var != null) {
                j1Var.m(f10, e1Var.f15327a);
            }
            i10++;
        }
    }

    public final d1 p(t.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        z4.j0 j0Var;
        r5.p pVar;
        List<p4.a> list;
        o7.l0 l0Var;
        this.V = (!this.V && j10 == this.F.f15322r && bVar.equals(this.F.f15307b)) ? false : true;
        C();
        d1 d1Var = this.F;
        z4.j0 j0Var2 = d1Var.f15312h;
        r5.p pVar2 = d1Var.f15313i;
        List<p4.a> list2 = d1Var.f15314j;
        if (this.B.f15833k) {
            q0 q0Var = this.A.f15778h;
            z4.j0 j0Var3 = q0Var == null ? z4.j0.f17689d : q0Var.f15710m;
            r5.p pVar3 = q0Var == null ? this.f15356e : q0Var.f15711n;
            r5.h[] hVarArr = pVar3.f13777c;
            t.a aVar = new t.a();
            boolean z11 = false;
            for (r5.h hVar : hVarArr) {
                if (hVar != null) {
                    p4.a aVar2 = hVar.b(0).f15455r;
                    if (aVar2 == null) {
                        aVar.c(new p4.a(new a.b[0]));
                    } else {
                        aVar.c(aVar2);
                        z11 = true;
                    }
                }
            }
            if (z11) {
                l0Var = aVar.e();
            } else {
                t.b bVar2 = o7.t.f12050b;
                l0Var = o7.l0.f12009e;
            }
            if (q0Var != null) {
                r0 r0Var = q0Var.f;
                if (r0Var.f15737c != j11) {
                    q0Var.f = r0Var.a(j11);
                }
            }
            list = l0Var;
            j0Var = j0Var3;
            pVar = pVar3;
        } else if (bVar.equals(d1Var.f15307b)) {
            j0Var = j0Var2;
            pVar = pVar2;
            list = list2;
        } else {
            j0Var = z4.j0.f17689d;
            pVar = this.f15356e;
            list = o7.l0.f12009e;
        }
        if (z10) {
            d dVar = this.G;
            if (!dVar.f15375d || dVar.f15376e == 5) {
                dVar.f15372a = true;
                dVar.f15375d = true;
                dVar.f15376e = i10;
            } else {
                x6.b.q(i10 == 5);
            }
        }
        d1 d1Var2 = this.F;
        long j13 = d1Var2.f15320p;
        q0 q0Var2 = this.A.f15780j;
        return d1Var2.b(bVar, j10, j11, j12, q0Var2 == null ? 0L : Math.max(0L, j13 - (this.T - q0Var2.f15712o)), j0Var, pVar, list);
    }

    public final boolean q() {
        q0 q0Var = this.A.f15780j;
        if (q0Var == null) {
            return false;
        }
        return (!q0Var.f15702d ? 0L : q0Var.f15699a.c()) != Long.MIN_VALUE;
    }

    public final boolean s() {
        q0 q0Var = this.A.f15778h;
        long j10 = q0Var.f.f15739e;
        return q0Var.f15702d && (j10 == -9223372036854775807L || this.F.f15322r < j10 || !Y());
    }

    public final void t() {
        boolean e10;
        if (q()) {
            q0 q0Var = this.A.f15780j;
            long c10 = !q0Var.f15702d ? 0L : q0Var.f15699a.c();
            q0 q0Var2 = this.A.f15780j;
            long max = q0Var2 == null ? 0L : Math.max(0L, c10 - (this.T - q0Var2.f15712o));
            if (q0Var != this.A.f15778h) {
                long j10 = q0Var.f.f15736b;
            }
            e10 = this.f.e(max, this.f15364w.f().f15327a);
            if (!e10 && max < 500000 && (this.f15362u > 0 || this.f15363v)) {
                this.A.f15778h.f15699a.s(this.F.f15322r, false);
                e10 = this.f.e(max, this.f15364w.f().f15327a);
            }
        } else {
            e10 = false;
        }
        this.L = e10;
        if (e10) {
            q0 q0Var3 = this.A.f15780j;
            long j11 = this.T;
            x6.b.H(q0Var3.f15709l == null);
            q0Var3.f15699a.d(j11 - q0Var3.f15712o);
        }
        d0();
    }

    public final void u() {
        d dVar = this.G;
        d1 d1Var = this.F;
        boolean z10 = dVar.f15372a | (dVar.f15373b != d1Var);
        dVar.f15372a = z10;
        dVar.f15373b = d1Var;
        if (z10) {
            d0 d0Var = (d0) ((io.flutter.plugins.firebase.auth.g) this.f15367z).f8032b;
            d0Var.f15281i.e(new g.q(4, d0Var, dVar));
            this.G = new d(this.F);
        }
    }

    public final void v() {
        m(this.B.c(), true);
    }

    public final void w(b bVar) {
        this.G.a(1);
        z0 z0Var = this.B;
        bVar.getClass();
        z0Var.getClass();
        x6.b.q(z0Var.f15825b.size() >= 0);
        z0Var.f15832j = null;
        m(z0Var.c(), false);
    }

    public final void x() {
        this.G.a(1);
        B(false, false, false, true);
        this.f.d();
        X(this.F.f15306a.p() ? 4 : 2);
        z0 z0Var = this.B;
        t5.q f10 = this.f15357o.f();
        x6.b.H(!z0Var.f15833k);
        z0Var.f15834l = f10;
        for (int i10 = 0; i10 < z0Var.f15825b.size(); i10++) {
            z0.c cVar = (z0.c) z0Var.f15825b.get(i10);
            z0Var.f(cVar);
            z0Var.f15829g.add(cVar);
        }
        z0Var.f15833k = true;
        this.f15358p.i(2);
    }

    public final void y() {
        B(true, false, true, false);
        this.f.f();
        X(1);
        HandlerThread handlerThread = this.f15359q;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.H = true;
            notifyAll();
        }
    }

    public final void z(int i10, int i11, z4.e0 e0Var) {
        this.G.a(1);
        z0 z0Var = this.B;
        z0Var.getClass();
        x6.b.q(i10 >= 0 && i10 <= i11 && i11 <= z0Var.f15825b.size());
        z0Var.f15832j = e0Var;
        z0Var.g(i10, i11);
        m(z0Var.c(), false);
    }
}
