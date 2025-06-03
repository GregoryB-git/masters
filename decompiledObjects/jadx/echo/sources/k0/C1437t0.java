package k0;

import A0.D;
import X2.AbstractC0703v;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import d0.AbstractC1170I;
import d0.C1162A;
import d0.C1164C;
import d0.C1194q;
import d0.C1198u;
import d0.C1201x;
import g0.AbstractC1297a;
import g0.InterfaceC1299c;
import g0.InterfaceC1307k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.B0;
import k0.C1434s;
import k0.InterfaceC1442w;
import k0.InterfaceC1445x0;
import k0.T0;
import k0.V0;
import k0.Y0;
import k0.a1;
import l0.InterfaceC1533a;
import l0.y1;
import p0.InterfaceC1782n;
import u0.C2001c;
import x0.C2121b;
import x0.InterfaceC2140v;
import x0.InterfaceC2142x;
import z0.C2290i;

/* renamed from: k0.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1437t0 implements Handler.Callback, InterfaceC2140v.a, D.a, T0.d, C1434s.a, V0.a {

    /* renamed from: l0, reason: collision with root package name */
    public static final long f15936l0 = g0.M.i1(10000);

    /* renamed from: A, reason: collision with root package name */
    public final long f15937A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f15938B;

    /* renamed from: C, reason: collision with root package name */
    public final C1434s f15939C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f15940D;

    /* renamed from: E, reason: collision with root package name */
    public final InterfaceC1299c f15941E;

    /* renamed from: F, reason: collision with root package name */
    public final f f15942F;

    /* renamed from: G, reason: collision with root package name */
    public final E0 f15943G;

    /* renamed from: H, reason: collision with root package name */
    public final T0 f15944H;

    /* renamed from: I, reason: collision with root package name */
    public final InterfaceC1443w0 f15945I;

    /* renamed from: J, reason: collision with root package name */
    public final long f15946J;

    /* renamed from: K, reason: collision with root package name */
    public final y1 f15947K;

    /* renamed from: L, reason: collision with root package name */
    public final boolean f15948L;

    /* renamed from: M, reason: collision with root package name */
    public d1 f15949M;

    /* renamed from: N, reason: collision with root package name */
    public U0 f15950N;

    /* renamed from: O, reason: collision with root package name */
    public e f15951O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f15952P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f15953Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f15954R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f15955S;

    /* renamed from: U, reason: collision with root package name */
    public boolean f15957U;

    /* renamed from: V, reason: collision with root package name */
    public int f15958V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f15959W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f15960X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f15961Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f15962Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f15963a0;

    /* renamed from: b0, reason: collision with root package name */
    public h f15964b0;

    /* renamed from: c0, reason: collision with root package name */
    public long f15965c0;

    /* renamed from: d0, reason: collision with root package name */
    public long f15966d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f15967e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f15968f0;

    /* renamed from: g0, reason: collision with root package name */
    public C1438u f15969g0;

    /* renamed from: h0, reason: collision with root package name */
    public long f15970h0;

    /* renamed from: j0, reason: collision with root package name */
    public InterfaceC1442w.c f15972j0;

    /* renamed from: o, reason: collision with root package name */
    public final Y0[] f15974o;

    /* renamed from: p, reason: collision with root package name */
    public final Set f15975p;

    /* renamed from: q, reason: collision with root package name */
    public final a1[] f15976q;

    /* renamed from: r, reason: collision with root package name */
    public final A0.D f15977r;

    /* renamed from: s, reason: collision with root package name */
    public final A0.E f15978s;

    /* renamed from: t, reason: collision with root package name */
    public final InterfaceC1445x0 f15979t;

    /* renamed from: u, reason: collision with root package name */
    public final B0.e f15980u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC1307k f15981v;

    /* renamed from: w, reason: collision with root package name */
    public final HandlerThread f15982w;

    /* renamed from: x, reason: collision with root package name */
    public final Looper f15983x;

    /* renamed from: y, reason: collision with root package name */
    public final AbstractC1170I.c f15984y;

    /* renamed from: z, reason: collision with root package name */
    public final AbstractC1170I.b f15985z;

    /* renamed from: i0, reason: collision with root package name */
    public long f15971i0 = -9223372036854775807L;

    /* renamed from: T, reason: collision with root package name */
    public long f15956T = -9223372036854775807L;

    /* renamed from: k0, reason: collision with root package name */
    public AbstractC1170I f15973k0 = AbstractC1170I.f12388a;

    /* renamed from: k0.t0$a */
    public class a implements Y0.a {
        public a() {
        }

        @Override // k0.Y0.a
        public void a() {
            C1437t0.this.f15961Y = true;
        }

        @Override // k0.Y0.a
        public void b() {
            if (C1437t0.this.f15948L || C1437t0.this.f15962Z) {
                C1437t0.this.f15981v.c(2);
            }
        }
    }

    /* renamed from: k0.t0$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final List f15987a;

        /* renamed from: b, reason: collision with root package name */
        public final x0.T f15988b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15989c;

        /* renamed from: d, reason: collision with root package name */
        public final long f15990d;

        public b(List list, x0.T t7, int i7, long j7) {
            this.f15987a = list;
            this.f15988b = t7;
            this.f15989c = i7;
            this.f15990d = j7;
        }

        public /* synthetic */ b(List list, x0.T t7, int i7, long j7, a aVar) {
            this(list, t7, i7, j7);
        }
    }

    /* renamed from: k0.t0$c */
    public static class c {
    }

    /* renamed from: k0.t0$d */
    public static final class d implements Comparable {

        /* renamed from: o, reason: collision with root package name */
        public final V0 f15991o;

        /* renamed from: p, reason: collision with root package name */
        public int f15992p;

        /* renamed from: q, reason: collision with root package name */
        public long f15993q;

        /* renamed from: r, reason: collision with root package name */
        public Object f15994r;

        public d(V0 v02) {
            this.f15991o = v02;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f15994r;
            if ((obj == null) != (dVar.f15994r == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i7 = this.f15992p - dVar.f15992p;
            return i7 != 0 ? i7 : g0.M.n(this.f15993q, dVar.f15993q);
        }

        public void e(int i7, long j7, Object obj) {
            this.f15992p = i7;
            this.f15993q = j7;
            this.f15994r = obj;
        }
    }

    /* renamed from: k0.t0$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public boolean f15995a;

        /* renamed from: b, reason: collision with root package name */
        public U0 f15996b;

        /* renamed from: c, reason: collision with root package name */
        public int f15997c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f15998d;

        /* renamed from: e, reason: collision with root package name */
        public int f15999e;

        public e(U0 u02) {
            this.f15996b = u02;
        }

        public void b(int i7) {
            this.f15995a |= i7 > 0;
            this.f15997c += i7;
        }

        public void c(U0 u02) {
            this.f15995a |= this.f15996b != u02;
            this.f15996b = u02;
        }

        public void d(int i7) {
            if (this.f15998d && this.f15999e != 5) {
                AbstractC1297a.a(i7 == 5);
                return;
            }
            this.f15995a = true;
            this.f15998d = true;
            this.f15999e = i7;
        }
    }

    /* renamed from: k0.t0$f */
    public interface f {
        void a(e eVar);
    }

    /* renamed from: k0.t0$g */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC2142x.b f16000a;

        /* renamed from: b, reason: collision with root package name */
        public final long f16001b;

        /* renamed from: c, reason: collision with root package name */
        public final long f16002c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f16003d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f16004e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f16005f;

        public g(InterfaceC2142x.b bVar, long j7, long j8, boolean z7, boolean z8, boolean z9) {
            this.f16000a = bVar;
            this.f16001b = j7;
            this.f16002c = j8;
            this.f16003d = z7;
            this.f16004e = z8;
            this.f16005f = z9;
        }
    }

    /* renamed from: k0.t0$h */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC1170I f16006a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16007b;

        /* renamed from: c, reason: collision with root package name */
        public final long f16008c;

        public h(AbstractC1170I abstractC1170I, int i7, long j7) {
            this.f16006a = abstractC1170I;
            this.f16007b = i7;
            this.f16008c = j7;
        }
    }

    public C1437t0(Y0[] y0Arr, A0.D d7, A0.E e7, InterfaceC1445x0 interfaceC1445x0, B0.e eVar, int i7, boolean z7, InterfaceC1533a interfaceC1533a, d1 d1Var, InterfaceC1443w0 interfaceC1443w0, long j7, boolean z8, boolean z9, Looper looper, InterfaceC1299c interfaceC1299c, f fVar, y1 y1Var, Looper looper2, InterfaceC1442w.c cVar) {
        this.f15942F = fVar;
        this.f15974o = y0Arr;
        this.f15977r = d7;
        this.f15978s = e7;
        this.f15979t = interfaceC1445x0;
        this.f15980u = eVar;
        this.f15958V = i7;
        this.f15959W = z7;
        this.f15949M = d1Var;
        this.f15945I = interfaceC1443w0;
        this.f15946J = j7;
        this.f15970h0 = j7;
        this.f15953Q = z8;
        this.f15948L = z9;
        this.f15941E = interfaceC1299c;
        this.f15947K = y1Var;
        this.f15972j0 = cVar;
        this.f15937A = interfaceC1445x0.h(y1Var);
        this.f15938B = interfaceC1445x0.f(y1Var);
        U0 k7 = U0.k(e7);
        this.f15950N = k7;
        this.f15951O = new e(k7);
        this.f15976q = new a1[y0Arr.length];
        a1.a d8 = d7.d();
        for (int i8 = 0; i8 < y0Arr.length; i8++) {
            y0Arr[i8].D(i8, y1Var, interfaceC1299c);
            this.f15976q[i8] = y0Arr[i8].G();
            if (d8 != null) {
                this.f15976q[i8].x(d8);
            }
        }
        this.f15939C = new C1434s(this, interfaceC1299c);
        this.f15940D = new ArrayList();
        this.f15975p = X2.a0.h();
        this.f15984y = new AbstractC1170I.c();
        this.f15985z = new AbstractC1170I.b();
        d7.e(this, eVar);
        this.f15968f0 = true;
        InterfaceC1307k e8 = interfaceC1299c.e(looper, null);
        this.f15943G = new E0(interfaceC1533a, e8, new B0.a() { // from class: k0.s0
            @Override // k0.B0.a
            public final B0 a(C0 c02, long j8) {
                B0 t7;
                t7 = C1437t0.this.t(c02, j8);
                return t7;
            }
        }, cVar);
        this.f15944H = new T0(this, interfaceC1533a, e8, y1Var);
        if (looper2 != null) {
            this.f15982w = null;
            this.f15983x = looper2;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.f15982w = handlerThread;
            handlerThread.start();
            this.f15983x = handlerThread.getLooper();
        }
        this.f15981v = interfaceC1299c.e(this.f15983x, this);
    }

    public static void D0(AbstractC1170I abstractC1170I, d dVar, AbstractC1170I.c cVar, AbstractC1170I.b bVar) {
        int i7 = abstractC1170I.n(abstractC1170I.h(dVar.f15994r, bVar).f12399c, cVar).f12434o;
        Object obj = abstractC1170I.g(i7, bVar, true).f12398b;
        long j7 = bVar.f12400d;
        dVar.e(i7, j7 != -9223372036854775807L ? j7 - 1 : Long.MAX_VALUE, obj);
    }

    public static C1194q[] E(A0.y yVar) {
        int length = yVar != null ? yVar.length() : 0;
        C1194q[] c1194qArr = new C1194q[length];
        for (int i7 = 0; i7 < length; i7++) {
            c1194qArr[i7] = yVar.b(i7);
        }
        return c1194qArr;
    }

    public static boolean E0(d dVar, AbstractC1170I abstractC1170I, AbstractC1170I abstractC1170I2, int i7, boolean z7, AbstractC1170I.c cVar, AbstractC1170I.b bVar) {
        Object obj = dVar.f15994r;
        if (obj == null) {
            Pair H02 = H0(abstractC1170I, new h(dVar.f15991o.h(), dVar.f15991o.d(), dVar.f15991o.f() == Long.MIN_VALUE ? -9223372036854775807L : g0.M.J0(dVar.f15991o.f())), false, i7, z7, cVar, bVar);
            if (H02 == null) {
                return false;
            }
            dVar.e(abstractC1170I.b(H02.first), ((Long) H02.second).longValue(), H02.first);
            if (dVar.f15991o.f() == Long.MIN_VALUE) {
                D0(abstractC1170I, dVar, cVar, bVar);
            }
            return true;
        }
        int b7 = abstractC1170I.b(obj);
        if (b7 == -1) {
            return false;
        }
        if (dVar.f15991o.f() == Long.MIN_VALUE) {
            D0(abstractC1170I, dVar, cVar, bVar);
            return true;
        }
        dVar.f15992p = b7;
        abstractC1170I2.h(dVar.f15994r, bVar);
        if (bVar.f12402f && abstractC1170I2.n(bVar.f12399c, cVar).f12433n == abstractC1170I2.b(dVar.f15994r)) {
            Pair j7 = abstractC1170I.j(cVar, bVar, abstractC1170I.h(dVar.f15994r, bVar).f12399c, dVar.f15993q + bVar.n());
            dVar.e(abstractC1170I.b(j7.first), ((Long) j7.second).longValue(), j7.first);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static k0.C1437t0.g G0(d0.AbstractC1170I r30, k0.U0 r31, k0.C1437t0.h r32, k0.E0 r33, int r34, boolean r35, d0.AbstractC1170I.c r36, d0.AbstractC1170I.b r37) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.C1437t0.G0(d0.I, k0.U0, k0.t0$h, k0.E0, int, boolean, d0.I$c, d0.I$b):k0.t0$g");
    }

    public static Pair H0(AbstractC1170I abstractC1170I, h hVar, boolean z7, int i7, boolean z8, AbstractC1170I.c cVar, AbstractC1170I.b bVar) {
        Pair j7;
        int I02;
        AbstractC1170I abstractC1170I2 = hVar.f16006a;
        if (abstractC1170I.q()) {
            return null;
        }
        AbstractC1170I abstractC1170I3 = abstractC1170I2.q() ? abstractC1170I : abstractC1170I2;
        try {
            j7 = abstractC1170I3.j(cVar, bVar, hVar.f16007b, hVar.f16008c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (abstractC1170I.equals(abstractC1170I3)) {
            return j7;
        }
        if (abstractC1170I.b(j7.first) != -1) {
            return (abstractC1170I3.h(j7.first, bVar).f12402f && abstractC1170I3.n(bVar.f12399c, cVar).f12433n == abstractC1170I3.b(j7.first)) ? abstractC1170I.j(cVar, bVar, abstractC1170I.h(j7.first, bVar).f12399c, hVar.f16008c) : j7;
        }
        if (z7 && (I02 = I0(cVar, bVar, i7, z8, j7.first, abstractC1170I3, abstractC1170I)) != -1) {
            return abstractC1170I.j(cVar, bVar, I02, -9223372036854775807L);
        }
        return null;
    }

    public static int I0(AbstractC1170I.c cVar, AbstractC1170I.b bVar, int i7, boolean z7, Object obj, AbstractC1170I abstractC1170I, AbstractC1170I abstractC1170I2) {
        Object obj2 = abstractC1170I.n(abstractC1170I.h(obj, bVar).f12399c, cVar).f12420a;
        for (int i8 = 0; i8 < abstractC1170I2.p(); i8++) {
            if (abstractC1170I2.n(i8, cVar).f12420a.equals(obj2)) {
                return i8;
            }
        }
        int b7 = abstractC1170I.b(obj);
        int i9 = abstractC1170I.i();
        int i10 = b7;
        int i11 = -1;
        for (int i12 = 0; i12 < i9 && i11 == -1; i12++) {
            i10 = abstractC1170I.d(i10, bVar, cVar, i7, z7);
            if (i10 == -1) {
                break;
            }
            i11 = abstractC1170I2.b(abstractC1170I.m(i10));
        }
        if (i11 == -1) {
            return -1;
        }
        return abstractC1170I2.f(i11, bVar).f12399c;
    }

    public static boolean V(boolean z7, InterfaceC2142x.b bVar, long j7, InterfaceC2142x.b bVar2, AbstractC1170I.b bVar3, long j8) {
        if (!z7 && j7 == j8 && bVar.f20848a.equals(bVar2.f20848a)) {
            return (bVar.b() && bVar3.r(bVar.f20849b)) ? (bVar3.h(bVar.f20849b, bVar.f20850c) == 4 || bVar3.h(bVar.f20849b, bVar.f20850c) == 2) ? false : true : bVar2.b() && bVar3.r(bVar2.f20849b);
        }
        return false;
    }

    public static boolean X(Y0 y02) {
        return y02.getState() != 0;
    }

    public static boolean Z(U0 u02, AbstractC1170I.b bVar) {
        InterfaceC2142x.b bVar2 = u02.f15631b;
        AbstractC1170I abstractC1170I = u02.f15630a;
        return abstractC1170I.q() || abstractC1170I.h(bVar2.f20848a, bVar).f12402f;
    }

    public final void A(Y0 y02) {
        if (y02.getState() == 2) {
            y02.stop();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (r5.equals(r33.f15950N.f15631b) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.C1437t0.A0(boolean, boolean, boolean, boolean):void");
    }

    public final void A1(AbstractC1170I abstractC1170I, InterfaceC2142x.b bVar, AbstractC1170I abstractC1170I2, InterfaceC2142x.b bVar2, long j7, boolean z7) {
        if (!q1(abstractC1170I, bVar)) {
            C1164C c1164c = bVar.b() ? C1164C.f12353d : this.f15950N.f15644o;
            if (this.f15939C.h().equals(c1164c)) {
                return;
            }
            V0(c1164c);
            Q(this.f15950N.f15644o, c1164c.f12356a, false, false);
            return;
        }
        abstractC1170I.n(abstractC1170I.h(bVar.f20848a, this.f15985z).f12399c, this.f15984y);
        this.f15945I.b((C1198u.g) g0.M.i(this.f15984y.f12429j));
        if (j7 != -9223372036854775807L) {
            this.f15945I.d(F(abstractC1170I, bVar.f20848a, j7));
            return;
        }
        if (!g0.M.c(!abstractC1170I2.q() ? abstractC1170I2.n(abstractC1170I2.h(bVar2.f20848a, this.f15985z).f12399c, this.f15984y).f12420a : null, this.f15984y.f12420a) || z7) {
            this.f15945I.d(-9223372036854775807L);
        }
    }

    public void B(long j7) {
        this.f15970h0 = j7;
    }

    public final void B0() {
        B0 t7 = this.f15943G.t();
        this.f15954R = t7 != null && t7.f15512f.f15530h && this.f15953Q;
    }

    public final void B1(boolean z7, boolean z8) {
        this.f15955S = z7;
        this.f15956T = (!z7 || z8) ? -9223372036854775807L : this.f15941E.b();
    }

    public final AbstractC0703v C(A0.y[] yVarArr) {
        AbstractC0703v.a aVar = new AbstractC0703v.a();
        boolean z7 = false;
        for (A0.y yVar : yVarArr) {
            if (yVar != null) {
                C1201x c1201x = yVar.b(0).f12723k;
                if (c1201x == null) {
                    aVar.a(new C1201x(new C1201x.b[0]));
                } else {
                    aVar.a(c1201x);
                    z7 = true;
                }
            }
        }
        return z7 ? aVar.k() : AbstractC0703v.Y();
    }

    public final void C0(long j7) {
        B0 t7 = this.f15943G.t();
        long B7 = t7 == null ? j7 + 1000000000000L : t7.B(j7);
        this.f15965c0 = B7;
        this.f15939C.c(B7);
        for (Y0 y02 : this.f15974o) {
            if (X(y02)) {
                y02.z(this.f15965c0);
            }
        }
        n0();
    }

    public final void C1(float f7) {
        for (B0 t7 = this.f15943G.t(); t7 != null; t7 = t7.k()) {
            for (A0.y yVar : t7.p().f43c) {
                if (yVar != null) {
                    yVar.r(f7);
                }
            }
        }
    }

    public final long D() {
        U0 u02 = this.f15950N;
        return F(u02.f15630a, u02.f15631b.f20848a, u02.f15648s);
    }

    public final synchronized void D1(W2.s sVar, long j7) {
        long b7 = this.f15941E.b() + j7;
        boolean z7 = false;
        while (!((Boolean) sVar.get()).booleanValue() && j7 > 0) {
            try {
                this.f15941E.f();
                wait(j7);
            } catch (InterruptedException unused) {
                z7 = true;
            }
            j7 = b7 - this.f15941E.b();
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
    }

    public final long F(AbstractC1170I abstractC1170I, Object obj, long j7) {
        abstractC1170I.n(abstractC1170I.h(obj, this.f15985z).f12399c, this.f15984y);
        AbstractC1170I.c cVar = this.f15984y;
        if (cVar.f12425f != -9223372036854775807L && cVar.f()) {
            AbstractC1170I.c cVar2 = this.f15984y;
            if (cVar2.f12428i) {
                return g0.M.J0(cVar2.a() - this.f15984y.f12425f) - (j7 + this.f15985z.n());
            }
        }
        return -9223372036854775807L;
    }

    public final void F0(AbstractC1170I abstractC1170I, AbstractC1170I abstractC1170I2) {
        if (abstractC1170I.q() && abstractC1170I2.q()) {
            return;
        }
        for (int size = this.f15940D.size() - 1; size >= 0; size--) {
            if (!E0((d) this.f15940D.get(size), abstractC1170I, abstractC1170I2, this.f15958V, this.f15959W, this.f15984y, this.f15985z)) {
                ((d) this.f15940D.get(size)).f15991o.k(false);
                this.f15940D.remove(size);
            }
        }
        Collections.sort(this.f15940D);
    }

    public final long G() {
        B0 u7 = this.f15943G.u();
        if (u7 == null) {
            return 0L;
        }
        long m7 = u7.m();
        if (!u7.f15510d) {
            return m7;
        }
        int i7 = 0;
        while (true) {
            Y0[] y0Arr = this.f15974o;
            if (i7 >= y0Arr.length) {
                return m7;
            }
            if (X(y0Arr[i7]) && this.f15974o[i7].i() == u7.f15509c[i7]) {
                long w7 = this.f15974o[i7].w();
                if (w7 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                m7 = Math.max(w7, m7);
            }
            i7++;
        }
    }

    public final Pair H(AbstractC1170I abstractC1170I) {
        if (abstractC1170I.q()) {
            return Pair.create(U0.l(), 0L);
        }
        Pair j7 = abstractC1170I.j(this.f15984y, this.f15985z, abstractC1170I.a(this.f15959W), -9223372036854775807L);
        InterfaceC2142x.b L6 = this.f15943G.L(abstractC1170I, j7.first, 0L);
        long longValue = ((Long) j7.second).longValue();
        if (L6.b()) {
            abstractC1170I.h(L6.f20848a, this.f15985z);
            longValue = L6.f20850c == this.f15985z.k(L6.f20849b) ? this.f15985z.g() : 0L;
        }
        return Pair.create(L6, Long.valueOf(longValue));
    }

    public Looper I() {
        return this.f15983x;
    }

    public final long J() {
        return K(this.f15950N.f15646q);
    }

    public final void J0(long j7) {
        long j8 = (this.f15950N.f15634e != 3 || (!this.f15948L && o1())) ? f15936l0 : 1000L;
        if (this.f15948L && o1()) {
            for (Y0 y02 : this.f15974o) {
                if (X(y02)) {
                    j8 = Math.min(j8, g0.M.i1(y02.q(this.f15965c0, this.f15966d0)));
                }
            }
        }
        this.f15981v.e(2, j7 + j8);
    }

    public final long K(long j7) {
        B0 m7 = this.f15943G.m();
        if (m7 == null) {
            return 0L;
        }
        return Math.max(0L, j7 - m7.A(this.f15965c0));
    }

    public void K0(AbstractC1170I abstractC1170I, int i7, long j7) {
        this.f15981v.g(3, new h(abstractC1170I, i7, j7)).a();
    }

    public final void L(InterfaceC2140v interfaceC2140v) {
        if (this.f15943G.B(interfaceC2140v)) {
            this.f15943G.F(this.f15965c0);
            c0();
        }
    }

    public final void L0(boolean z7) {
        InterfaceC2142x.b bVar = this.f15943G.t().f15512f.f15523a;
        long O02 = O0(bVar, this.f15950N.f15648s, true, false);
        if (O02 != this.f15950N.f15648s) {
            U0 u02 = this.f15950N;
            this.f15950N = S(bVar, O02, u02.f15632c, u02.f15633d, z7, 5);
        }
    }

    public final void M(IOException iOException, int i7) {
        C1438u c7 = C1438u.c(iOException, i7);
        B0 t7 = this.f15943G.t();
        if (t7 != null) {
            c7 = c7.a(t7.f15512f.f15523a);
        }
        g0.o.d("ExoPlayerImplInternal", "Playback error", c7);
        t1(false, false);
        this.f15950N = this.f15950N.f(c7);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ac A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:6:0x00a2, B:8:0x00ac, B:15:0x00b6, B:17:0x00bc, B:18:0x00bf, B:19:0x00c5, B:21:0x00cf, B:23:0x00d7, B:27:0x00df, B:28:0x00e9, B:30:0x00f9, B:34:0x0103, B:37:0x0115, B:40:0x011e), top: B:5:0x00a2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M0(k0.C1437t0.h r19) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.C1437t0.M0(k0.t0$h):void");
    }

    public final void N(boolean z7) {
        B0 m7 = this.f15943G.m();
        InterfaceC2142x.b bVar = m7 == null ? this.f15950N.f15631b : m7.f15512f.f15523a;
        boolean z8 = !this.f15950N.f15640k.equals(bVar);
        if (z8) {
            this.f15950N = this.f15950N.c(bVar);
        }
        U0 u02 = this.f15950N;
        u02.f15646q = m7 == null ? u02.f15648s : m7.j();
        this.f15950N.f15647r = J();
        if ((z8 || z7) && m7 != null && m7.f15510d) {
            w1(m7.f15512f.f15523a, m7.o(), m7.p());
        }
    }

    public final long N0(InterfaceC2142x.b bVar, long j7, boolean z7) {
        return O0(bVar, j7, this.f15943G.t() != this.f15943G.u(), z7);
    }

    /* JADX WARN: Not initialized variable reg: 25, insn: 0x0093: MOVE (r5 I:??[long, double]) = (r25 I:??[long, double]) (LINE:148), block:B:113:0x0092 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O(d0.AbstractC1170I r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.C1437t0.O(d0.I, boolean):void");
    }

    public final long O0(InterfaceC2142x.b bVar, long j7, boolean z7, boolean z8) {
        u1();
        B1(false, true);
        if (z8 || this.f15950N.f15634e == 3) {
            l1(2);
        }
        B0 t7 = this.f15943G.t();
        B0 b02 = t7;
        while (b02 != null && !bVar.equals(b02.f15512f.f15523a)) {
            b02 = b02.k();
        }
        if (z7 || t7 != b02 || (b02 != null && b02.B(j7) < 0)) {
            for (Y0 y02 : this.f15974o) {
                v(y02);
            }
            if (b02 != null) {
                while (this.f15943G.t() != b02) {
                    this.f15943G.b();
                }
                this.f15943G.I(b02);
                b02.z(1000000000000L);
                y();
            }
        }
        E0 e02 = this.f15943G;
        if (b02 != null) {
            e02.I(b02);
            if (!b02.f15510d) {
                b02.f15512f = b02.f15512f.b(j7);
            } else if (b02.f15511e) {
                j7 = b02.f15507a.s(j7);
                b02.f15507a.q(j7 - this.f15937A, this.f15938B);
            }
            C0(j7);
            c0();
        } else {
            e02.f();
            C0(j7);
        }
        N(false);
        this.f15981v.c(2);
        return j7;
    }

    public final void P(InterfaceC2140v interfaceC2140v) {
        if (this.f15943G.B(interfaceC2140v)) {
            B0 m7 = this.f15943G.m();
            m7.q(this.f15939C.h().f12356a, this.f15950N.f15630a);
            w1(m7.f15512f.f15523a, m7.o(), m7.p());
            if (m7 == this.f15943G.t()) {
                C0(m7.f15512f.f15524b);
                y();
                U0 u02 = this.f15950N;
                InterfaceC2142x.b bVar = u02.f15631b;
                long j7 = m7.f15512f.f15524b;
                this.f15950N = S(bVar, j7, u02.f15632c, j7, false, 5);
            }
            c0();
        }
    }

    public final void P0(V0 v02) {
        if (v02.f() == -9223372036854775807L) {
            Q0(v02);
            return;
        }
        if (this.f15950N.f15630a.q()) {
            this.f15940D.add(new d(v02));
            return;
        }
        d dVar = new d(v02);
        AbstractC1170I abstractC1170I = this.f15950N.f15630a;
        if (!E0(dVar, abstractC1170I, abstractC1170I, this.f15958V, this.f15959W, this.f15984y, this.f15985z)) {
            v02.k(false);
        } else {
            this.f15940D.add(dVar);
            Collections.sort(this.f15940D);
        }
    }

    public final void Q(C1164C c1164c, float f7, boolean z7, boolean z8) {
        if (z7) {
            if (z8) {
                this.f15951O.b(1);
            }
            this.f15950N = this.f15950N.g(c1164c);
        }
        C1(c1164c.f12356a);
        for (Y0 y02 : this.f15974o) {
            if (y02 != null) {
                y02.I(f7, c1164c.f12356a);
            }
        }
    }

    public final void Q0(V0 v02) {
        if (v02.c() != this.f15983x) {
            this.f15981v.g(15, v02).a();
            return;
        }
        u(v02);
        int i7 = this.f15950N.f15634e;
        if (i7 == 3 || i7 == 2) {
            this.f15981v.c(2);
        }
    }

    public final void R(C1164C c1164c, boolean z7) {
        Q(c1164c, c1164c.f12356a, true, z7);
    }

    public final void R0(final V0 v02) {
        Looper c7 = v02.c();
        if (c7.getThread().isAlive()) {
            this.f15941E.e(c7, null).j(new Runnable() { // from class: k0.r0
                @Override // java.lang.Runnable
                public final void run() {
                    C1437t0.this.b0(v02);
                }
            });
        } else {
            g0.o.h("TAG", "Trying to send message on a dead thread.");
            v02.k(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    public final U0 S(InterfaceC2142x.b bVar, long j7, long j8, long j9, boolean z7, int i7) {
        AbstractC0703v abstractC0703v;
        x0.Z z8;
        A0.E e7;
        this.f15968f0 = (!this.f15968f0 && j7 == this.f15950N.f15648s && bVar.equals(this.f15950N.f15631b)) ? false : true;
        B0();
        U0 u02 = this.f15950N;
        x0.Z z9 = u02.f15637h;
        A0.E e8 = u02.f15638i;
        ?? r12 = u02.f15639j;
        if (this.f15944H.t()) {
            B0 t7 = this.f15943G.t();
            x0.Z o7 = t7 == null ? x0.Z.f20700d : t7.o();
            A0.E p7 = t7 == null ? this.f15978s : t7.p();
            AbstractC0703v C7 = C(p7.f43c);
            if (t7 != null) {
                C0 c02 = t7.f15512f;
                if (c02.f15525c != j8) {
                    t7.f15512f = c02.a(j8);
                }
            }
            g0();
            z8 = o7;
            e7 = p7;
            abstractC0703v = C7;
        } else if (bVar.equals(this.f15950N.f15631b)) {
            abstractC0703v = r12;
            z8 = z9;
            e7 = e8;
        } else {
            z8 = x0.Z.f20700d;
            e7 = this.f15978s;
            abstractC0703v = AbstractC0703v.Y();
        }
        if (z7) {
            this.f15951O.d(i7);
        }
        return this.f15950N.d(bVar, j7, j8, j9, J(), z8, e7, abstractC0703v);
    }

    public final void S0(long j7) {
        for (Y0 y02 : this.f15974o) {
            if (y02.i() != null) {
                T0(y02, j7);
            }
        }
    }

    public final boolean T(Y0 y02, B0 b02) {
        B0 k7 = b02.k();
        return b02.f15512f.f15528f && k7.f15510d && ((y02 instanceof C2290i) || (y02 instanceof C2001c) || y02.w() >= k7.n());
    }

    public final void T0(Y0 y02, long j7) {
        y02.u();
        if (y02 instanceof C2290i) {
            ((C2290i) y02).w0(j7);
        }
    }

    public final boolean U() {
        B0 u7 = this.f15943G.u();
        if (!u7.f15510d) {
            return false;
        }
        int i7 = 0;
        while (true) {
            Y0[] y0Arr = this.f15974o;
            if (i7 >= y0Arr.length) {
                return true;
            }
            Y0 y02 = y0Arr[i7];
            x0.Q q7 = u7.f15509c[i7];
            if (y02.i() != q7 || (q7 != null && !y02.p() && !T(y02, u7))) {
                break;
            }
            i7++;
        }
        return false;
    }

    public final void U0(boolean z7, AtomicBoolean atomicBoolean) {
        if (this.f15960X != z7) {
            this.f15960X = z7;
            if (!z7) {
                for (Y0 y02 : this.f15974o) {
                    if (!X(y02) && this.f15975p.remove(y02)) {
                        y02.b();
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

    public final void V0(C1164C c1164c) {
        this.f15981v.f(16);
        this.f15939C.k(c1164c);
    }

    public final boolean W() {
        B0 m7 = this.f15943G.m();
        return (m7 == null || m7.r() || m7.l() == Long.MIN_VALUE) ? false : true;
    }

    public final void W0(b bVar) {
        this.f15951O.b(1);
        if (bVar.f15989c != -1) {
            this.f15964b0 = new h(new W0(bVar.f15987a, bVar.f15988b), bVar.f15989c, bVar.f15990d);
        }
        O(this.f15944H.C(bVar.f15987a, bVar.f15988b), false);
    }

    public void X0(List list, int i7, long j7, x0.T t7) {
        this.f15981v.g(17, new b(list, t7, i7, j7, null)).a();
    }

    public final boolean Y() {
        B0 t7 = this.f15943G.t();
        long j7 = t7.f15512f.f15527e;
        return t7.f15510d && (j7 == -9223372036854775807L || this.f15950N.f15648s < j7 || !o1());
    }

    public final void Y0(boolean z7) {
        if (z7 == this.f15962Z) {
            return;
        }
        this.f15962Z = z7;
        if (z7 || !this.f15950N.f15645p) {
            return;
        }
        this.f15981v.c(2);
    }

    public final void Z0(boolean z7) {
        this.f15953Q = z7;
        B0();
        if (!this.f15954R || this.f15943G.u() == this.f15943G.t()) {
            return;
        }
        L0(true);
        N(false);
    }

    @Override // A0.D.a
    public void a(Y0 y02) {
        this.f15981v.c(26);
    }

    public final /* synthetic */ Boolean a0() {
        return Boolean.valueOf(this.f15952P);
    }

    public void a1(boolean z7, int i7, int i8) {
        this.f15981v.b(1, z7 ? 1 : 0, i7 | (i8 << 4)).a();
    }

    @Override // k0.T0.d
    public void b() {
        this.f15981v.f(2);
        this.f15981v.c(22);
    }

    public final /* synthetic */ void b0(V0 v02) {
        try {
            u(v02);
        } catch (C1438u e7) {
            g0.o.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e7);
            throw new RuntimeException(e7);
        }
    }

    public final void b1(boolean z7, int i7, boolean z8, int i8) {
        this.f15951O.b(z8 ? 1 : 0);
        this.f15950N = this.f15950N.e(z7, i8, i7);
        B1(false, false);
        o0(z7);
        if (!o1()) {
            u1();
            z1();
            return;
        }
        int i9 = this.f15950N.f15634e;
        if (i9 == 3) {
            this.f15939C.e();
            r1();
        } else if (i9 != 2) {
            return;
        }
        this.f15981v.c(2);
    }

    @Override // k0.V0.a
    public synchronized void c(V0 v02) {
        if (!this.f15952P && this.f15983x.getThread().isAlive()) {
            this.f15981v.g(14, v02).a();
            return;
        }
        g0.o.h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        v02.k(false);
    }

    public final void c0() {
        boolean n12 = n1();
        this.f15957U = n12;
        if (n12) {
            this.f15943G.m().e(this.f15965c0, this.f15939C.h().f12356a, this.f15956T);
        }
        v1();
    }

    public void c1(C1164C c1164c) {
        this.f15981v.g(4, c1164c).a();
    }

    @Override // A0.D.a
    public void d() {
        this.f15981v.c(10);
    }

    public final void d0() {
        this.f15951O.c(this.f15950N);
        if (this.f15951O.f15995a) {
            this.f15942F.a(this.f15951O);
            this.f15951O = new e(this.f15950N);
        }
    }

    public final void d1(C1164C c1164c) {
        V0(c1164c);
        R(this.f15939C.h(), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r1 < r8.f15940D.size()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        r3 = (k0.C1437t0.d) r8.f15940D.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if (r3 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r3.f15994r == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        r4 = r3.f15992p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if (r4 < r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (r4 != r0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        if (r3.f15993q > r9) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
    
        if (r3 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
    
        if (r3.f15994r == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        if (r3.f15992p != r0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
    
        r4 = r3.f15993q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
    
        if (r4 <= r9) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a8, code lost:
    
        if (r4 > r11) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00aa, code lost:
    
        Q0(r3.f15991o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b5, code lost:
    
        if (r3.f15991o.b() != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bd, code lost:
    
        if (r3.f15991o.j() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c0, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ce, code lost:
    
        if (r1 >= r8.f15940D.size()) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d9, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d0, code lost:
    
        r3 = (k0.C1437t0.d) r8.f15940D.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c3, code lost:
    
        r8.f15940D.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00db, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r3.f15991o.b() != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f1, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ec, code lost:
    
        r8.f15940D.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f2, code lost:
    
        r8.f15967e0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x008b, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0093, code lost:
    
        if (r1 >= r8.f15940D.size()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0078, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0079, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0093 -> B:24:0x006f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e0(long r9, long r11) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.C1437t0.e0(long, long):void");
    }

    public final void e1(InterfaceC1442w.c cVar) {
        this.f15972j0 = cVar;
        this.f15943G.Q(this.f15950N.f15630a, cVar);
    }

    public final boolean f0() {
        C0 s7;
        this.f15943G.F(this.f15965c0);
        boolean z7 = false;
        if (this.f15943G.O() && (s7 = this.f15943G.s(this.f15965c0, this.f15950N)) != null) {
            B0 g7 = this.f15943G.g(s7);
            g7.f15507a.u(this, s7.f15524b);
            if (this.f15943G.t() == g7) {
                C0(s7.f15524b);
            }
            N(false);
            z7 = true;
        }
        if (this.f15957U) {
            this.f15957U = W();
            v1();
        } else {
            c0();
        }
        return z7;
    }

    public void f1(int i7) {
        this.f15981v.b(11, i7, 0).a();
    }

    public final void g0() {
        boolean z7;
        B0 t7 = this.f15943G.t();
        if (t7 != null) {
            A0.E p7 = t7.p();
            boolean z8 = false;
            int i7 = 0;
            boolean z9 = false;
            while (true) {
                if (i7 >= this.f15974o.length) {
                    z7 = true;
                    break;
                }
                if (p7.c(i7)) {
                    if (this.f15974o[i7].l() != 1) {
                        z7 = false;
                        break;
                    } else if (p7.f42b[i7].f15694a != 0) {
                        z9 = true;
                    }
                }
                i7++;
            }
            if (z9 && z7) {
                z8 = true;
            }
            Y0(z8);
        }
    }

    public final void g1(int i7) {
        this.f15958V = i7;
        if (!this.f15943G.S(this.f15950N.f15630a, i7)) {
            L0(true);
        }
        N(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h0() {
        /*
            r14 = this;
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r14.m1()
            if (r2 == 0) goto L6e
            if (r1 == 0) goto Ld
            r14.d0()
        Ld:
            k0.E0 r1 = r14.f15943G
            k0.B0 r1 = r1.b()
            java.lang.Object r1 = g0.AbstractC1297a.e(r1)
            k0.B0 r1 = (k0.B0) r1
            k0.U0 r2 = r14.f15950N
            x0.x$b r2 = r2.f15631b
            java.lang.Object r2 = r2.f20848a
            k0.C0 r3 = r1.f15512f
            x0.x$b r3 = r3.f15523a
            java.lang.Object r3 = r3.f20848a
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 == 0) goto L45
            k0.U0 r2 = r14.f15950N
            x0.x$b r2 = r2.f15631b
            int r4 = r2.f20849b
            r5 = -1
            if (r4 != r5) goto L45
            k0.C0 r4 = r1.f15512f
            x0.x$b r4 = r4.f15523a
            int r6 = r4.f20849b
            if (r6 != r5) goto L45
            int r2 = r2.f20852e
            int r4 = r4.f20852e
            if (r2 == r4) goto L45
            r2 = r3
            goto L46
        L45:
            r2 = r0
        L46:
            k0.C0 r1 = r1.f15512f
            x0.x$b r5 = r1.f15523a
            long r10 = r1.f15524b
            long r8 = r1.f15525c
            r12 = r2 ^ 1
            r13 = 0
            r4 = r14
            r6 = r10
            k0.U0 r1 = r4.S(r5, r6, r8, r10, r12, r13)
            r14.f15950N = r1
            r14.B0()
            r14.z1()
            k0.U0 r1 = r14.f15950N
            int r1 = r1.f15634e
            r2 = 3
            if (r1 != r2) goto L69
            r14.r1()
        L69:
            r14.r()
            r1 = r3
            goto L2
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.C1437t0.h0():void");
    }

    public final void h1(d1 d1Var) {
        this.f15949M = d1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r15v0, types: [k0.t0] */
    /* JADX WARN: Type inference failed for: r1v2, types: [p0.n$a] */
    /* JADX WARN: Type inference failed for: r1v32, types: [i0.h] */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        C2121b c2121b;
        int i7;
        U0 f7;
        int i8;
        B0 u7;
        int i9;
        try {
            switch (message.what) {
                case 1:
                    boolean z7 = message.arg1 != 0;
                    int i10 = message.arg2;
                    b1(z7, i10 >> 4, true, i10 & 15);
                    break;
                case 2:
                    w();
                    break;
                case 3:
                    M0((h) message.obj);
                    break;
                case 4:
                    d1((C1164C) message.obj);
                    break;
                case 5:
                    h1((d1) message.obj);
                    break;
                case 6:
                    t1(false, true);
                    break;
                case 7:
                    u0();
                    return true;
                case 8:
                    P((InterfaceC2140v) message.obj);
                    break;
                case 9:
                    L((InterfaceC2140v) message.obj);
                    break;
                case 10:
                    y0();
                    break;
                case 11:
                    g1(message.arg1);
                    break;
                case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    j1(message.arg1 != 0);
                    break;
                case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    U0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    P0((V0) message.obj);
                    break;
                case 15:
                    R0((V0) message.obj);
                    break;
                case 16:
                    R((C1164C) message.obj, false);
                    break;
                case 17:
                    W0((b) message.obj);
                    break;
                case 18:
                    q((b) message.obj, message.arg1);
                    break;
                case 19:
                    android.support.v4.media.a.a(message.obj);
                    m0(null);
                    break;
                case 20:
                    w0(message.arg1, message.arg2, (x0.T) message.obj);
                    break;
                case 21:
                    k1((x0.T) message.obj);
                    break;
                case 22:
                    l0();
                    break;
                case 23:
                    Z0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    s();
                    break;
                case 26:
                    z0();
                    break;
                case 27:
                    x1(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    e1((InterfaceC1442w.c) message.obj);
                    break;
                case 29:
                    s0();
                    break;
            }
        } catch (C1162A e7) {
            int i11 = e7.f12343p;
            if (i11 == 1) {
                i9 = e7.f12342o ? 3001 : 3003;
            } else {
                if (i11 == 4) {
                    i9 = e7.f12342o ? 3002 : 3004;
                }
                M(e7, r4);
            }
            r4 = i9;
            M(e7, r4);
        } catch (i0.h e8) {
            ?? r12 = e8;
            i7 = r12.f14645o;
            c2121b = r12;
            M(c2121b, i7);
        } catch (IOException e9) {
            c2121b = e9;
            i7 = 2000;
            M(c2121b, i7);
        } catch (RuntimeException e10) {
            C1438u d7 = C1438u.d(e10, ((e10 instanceof IllegalStateException) || (e10 instanceof IllegalArgumentException)) ? 1004 : 1000);
            g0.o.d("ExoPlayerImplInternal", "Playback error", d7);
            t1(true, false);
            f7 = this.f15950N.f(d7);
            this.f15950N = f7;
        } catch (C1438u e11) {
            C1438u c1438u = e11;
            if (c1438u.f16019x == 1 && (u7 = this.f15943G.u()) != null) {
                c1438u = c1438u.a(u7.f15512f.f15523a);
            }
            if (c1438u.f16018D && (this.f15969g0 == null || (i8 = c1438u.f12350o) == 5004 || i8 == 5003)) {
                g0.o.i("ExoPlayerImplInternal", "Recoverable renderer error", c1438u);
                C1438u c1438u2 = this.f15969g0;
                if (c1438u2 != null) {
                    c1438u2.addSuppressed(c1438u);
                    c1438u = this.f15969g0;
                } else {
                    this.f15969g0 = c1438u;
                }
                InterfaceC1307k interfaceC1307k = this.f15981v;
                interfaceC1307k.d(interfaceC1307k.g(25, c1438u));
            } else {
                C1438u c1438u3 = this.f15969g0;
                if (c1438u3 != null) {
                    c1438u3.addSuppressed(c1438u);
                    c1438u = this.f15969g0;
                }
                C1438u c1438u4 = c1438u;
                g0.o.d("ExoPlayerImplInternal", "Playback error", c1438u4);
                if (c1438u4.f16019x == 1 && this.f15943G.t() != this.f15943G.u()) {
                    while (this.f15943G.t() != this.f15943G.u()) {
                        this.f15943G.b();
                    }
                    B0 b02 = (B0) AbstractC1297a.e(this.f15943G.t());
                    d0();
                    C0 c02 = b02.f15512f;
                    InterfaceC2142x.b bVar = c02.f15523a;
                    long j7 = c02.f15524b;
                    this.f15950N = S(bVar, j7, c02.f15525c, j7, true, 0);
                }
                t1(true, false);
                f7 = this.f15950N.f(c1438u4);
                this.f15950N = f7;
            }
        } catch (InterfaceC1782n.a e12) {
            ?? r13 = e12;
            i7 = r13.f18328o;
            c2121b = r13;
            M(c2121b, i7);
        } catch (C2121b e13) {
            c2121b = e13;
            i7 = 1002;
            M(c2121b, i7);
        }
        d0();
        return true;
    }

    public final void i0(boolean z7) {
        if (this.f15972j0.f16060a != -9223372036854775807L) {
            if (z7 || !this.f15950N.f15630a.equals(this.f15973k0)) {
                AbstractC1170I abstractC1170I = this.f15950N.f15630a;
                this.f15973k0 = abstractC1170I;
                this.f15943G.x(abstractC1170I);
            }
        }
    }

    public void i1(boolean z7) {
        this.f15981v.b(12, z7 ? 1 : 0, 0).a();
    }

    @Override // k0.C1434s.a
    public void j(C1164C c1164c) {
        this.f15981v.g(16, c1164c).a();
    }

    public final void j0() {
        B0 u7 = this.f15943G.u();
        if (u7 == null) {
            return;
        }
        int i7 = 0;
        if (u7.k() != null && !this.f15954R) {
            if (U()) {
                if (u7.k().f15510d || this.f15965c0 >= u7.k().n()) {
                    A0.E p7 = u7.p();
                    B0 c7 = this.f15943G.c();
                    A0.E p8 = c7.p();
                    AbstractC1170I abstractC1170I = this.f15950N.f15630a;
                    A1(abstractC1170I, c7.f15512f.f15523a, abstractC1170I, u7.f15512f.f15523a, -9223372036854775807L, false);
                    if (c7.f15510d && c7.f15507a.l() != -9223372036854775807L) {
                        S0(c7.n());
                        if (c7.s()) {
                            return;
                        }
                        this.f15943G.I(c7);
                        N(false);
                        c0();
                        return;
                    }
                    for (int i8 = 0; i8 < this.f15974o.length; i8++) {
                        boolean c8 = p7.c(i8);
                        boolean c9 = p8.c(i8);
                        if (c8 && !this.f15974o[i8].A()) {
                            boolean z7 = this.f15976q[i8].l() == -2;
                            b1 b1Var = p7.f42b[i8];
                            b1 b1Var2 = p8.f42b[i8];
                            if (!c9 || !b1Var2.equals(b1Var) || z7) {
                                T0(this.f15974o[i8], c7.n());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!u7.f15512f.f15531i && !this.f15954R) {
            return;
        }
        while (true) {
            Y0[] y0Arr = this.f15974o;
            if (i7 >= y0Arr.length) {
                return;
            }
            Y0 y02 = y0Arr[i7];
            x0.Q q7 = u7.f15509c[i7];
            if (q7 != null && y02.i() == q7 && y02.p()) {
                long j7 = u7.f15512f.f15527e;
                T0(y02, (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? -9223372036854775807L : u7.m() + u7.f15512f.f15527e);
            }
            i7++;
        }
    }

    public final void j1(boolean z7) {
        this.f15959W = z7;
        if (!this.f15943G.T(this.f15950N.f15630a, z7)) {
            L0(true);
        }
        N(false);
    }

    @Override // x0.InterfaceC2140v.a
    public void k(InterfaceC2140v interfaceC2140v) {
        this.f15981v.g(8, interfaceC2140v).a();
    }

    public final void k0() {
        B0 u7 = this.f15943G.u();
        if (u7 == null || this.f15943G.t() == u7 || u7.f15513g || !x0()) {
            return;
        }
        y();
    }

    public final void k1(x0.T t7) {
        this.f15951O.b(1);
        O(this.f15944H.D(t7), false);
    }

    public final void l0() {
        O(this.f15944H.i(), true);
    }

    public final void l1(int i7) {
        U0 u02 = this.f15950N;
        if (u02.f15634e != i7) {
            if (i7 != 2) {
                this.f15971i0 = -9223372036854775807L;
            }
            this.f15950N = u02.h(i7);
        }
    }

    public final void m0(c cVar) {
        this.f15951O.b(1);
        throw null;
    }

    public final boolean m1() {
        B0 t7;
        B0 k7;
        return o1() && !this.f15954R && (t7 = this.f15943G.t()) != null && (k7 = t7.k()) != null && this.f15965c0 >= k7.n() && k7.f15513g;
    }

    public final void n0() {
        for (B0 t7 = this.f15943G.t(); t7 != null; t7 = t7.k()) {
            for (A0.y yVar : t7.p().f43c) {
                if (yVar != null) {
                    yVar.t();
                }
            }
        }
    }

    public final boolean n1() {
        if (!W()) {
            return false;
        }
        B0 m7 = this.f15943G.m();
        long K6 = K(m7.l());
        InterfaceC1445x0.a aVar = new InterfaceC1445x0.a(this.f15947K, this.f15950N.f15630a, m7.f15512f.f15523a, m7 == this.f15943G.t() ? m7.A(this.f15965c0) : m7.A(this.f15965c0) - m7.f15512f.f15524b, K6, this.f15939C.h().f12356a, this.f15950N.f15641l, this.f15955S, q1(this.f15950N.f15630a, m7.f15512f.f15523a) ? this.f15945I.e() : -9223372036854775807L);
        boolean c7 = this.f15979t.c(aVar);
        B0 t7 = this.f15943G.t();
        if (c7 || !t7.f15510d || K6 >= 500000) {
            return c7;
        }
        if (this.f15937A <= 0 && !this.f15938B) {
            return c7;
        }
        t7.f15507a.q(this.f15950N.f15648s, false);
        return this.f15979t.c(aVar);
    }

    public final void o0(boolean z7) {
        for (B0 t7 = this.f15943G.t(); t7 != null; t7 = t7.k()) {
            for (A0.y yVar : t7.p().f43c) {
                if (yVar != null) {
                    yVar.h(z7);
                }
            }
        }
    }

    public final boolean o1() {
        U0 u02 = this.f15950N;
        return u02.f15641l && u02.f15643n == 0;
    }

    public final void p0() {
        for (B0 t7 = this.f15943G.t(); t7 != null; t7 = t7.k()) {
            for (A0.y yVar : t7.p().f43c) {
                if (yVar != null) {
                    yVar.u();
                }
            }
        }
    }

    public final boolean p1(boolean z7) {
        if (this.f15963a0 == 0) {
            return Y();
        }
        if (!z7) {
            return false;
        }
        if (!this.f15950N.f15636g) {
            return true;
        }
        B0 t7 = this.f15943G.t();
        long e7 = q1(this.f15950N.f15630a, t7.f15512f.f15523a) ? this.f15945I.e() : -9223372036854775807L;
        B0 m7 = this.f15943G.m();
        return (m7.s() && m7.f15512f.f15531i) || (m7.f15512f.f15523a.b() && !m7.f15510d) || this.f15979t.e(new InterfaceC1445x0.a(this.f15947K, this.f15950N.f15630a, t7.f15512f.f15523a, t7.A(this.f15965c0), J(), this.f15939C.h().f12356a, this.f15950N.f15641l, this.f15955S, e7));
    }

    public final void q(b bVar, int i7) {
        this.f15951O.b(1);
        T0 t02 = this.f15944H;
        if (i7 == -1) {
            i7 = t02.r();
        }
        O(t02.f(i7, bVar.f15987a, bVar.f15988b), false);
    }

    @Override // x0.S.a
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void e(InterfaceC2140v interfaceC2140v) {
        this.f15981v.g(9, interfaceC2140v).a();
    }

    public final boolean q1(AbstractC1170I abstractC1170I, InterfaceC2142x.b bVar) {
        if (bVar.b() || abstractC1170I.q()) {
            return false;
        }
        abstractC1170I.n(abstractC1170I.h(bVar.f20848a, this.f15985z).f12399c, this.f15984y);
        if (!this.f15984y.f()) {
            return false;
        }
        AbstractC1170I.c cVar = this.f15984y;
        return cVar.f12428i && cVar.f12425f != -9223372036854775807L;
    }

    public final void r() {
        A0.E p7 = this.f15943G.t().p();
        for (int i7 = 0; i7 < this.f15974o.length; i7++) {
            if (p7.c(i7)) {
                this.f15974o[i7].j();
            }
        }
    }

    public void r0() {
        this.f15981v.k(29).a();
    }

    public final void r1() {
        B0 t7 = this.f15943G.t();
        if (t7 == null) {
            return;
        }
        A0.E p7 = t7.p();
        for (int i7 = 0; i7 < this.f15974o.length; i7++) {
            if (p7.c(i7) && this.f15974o[i7].getState() == 1) {
                this.f15974o[i7].start();
            }
        }
    }

    public final void s() {
        z0();
    }

    public final void s0() {
        this.f15951O.b(1);
        A0(false, false, false, true);
        this.f15979t.a(this.f15947K);
        l1(this.f15950N.f15630a.q() ? 4 : 2);
        this.f15944H.w(this.f15980u.a());
        this.f15981v.c(2);
    }

    public void s1() {
        this.f15981v.k(6).a();
    }

    public final B0 t(C0 c02, long j7) {
        return new B0(this.f15976q, j7, this.f15977r, this.f15979t.i(), this.f15944H, c02, this.f15978s);
    }

    public synchronized boolean t0() {
        if (!this.f15952P && this.f15983x.getThread().isAlive()) {
            this.f15981v.c(7);
            D1(new W2.s() { // from class: k0.q0
                @Override // W2.s
                public final Object get() {
                    Boolean a02;
                    a02 = C1437t0.this.a0();
                    return a02;
                }
            }, this.f15946J);
            return this.f15952P;
        }
        return true;
    }

    public final void t1(boolean z7, boolean z8) {
        A0(z7 || !this.f15960X, false, true, false);
        this.f15951O.b(z8 ? 1 : 0);
        this.f15979t.g(this.f15947K);
        l1(1);
    }

    public final void u(V0 v02) {
        if (v02.j()) {
            return;
        }
        try {
            v02.g().t(v02.i(), v02.e());
        } finally {
            v02.k(true);
        }
    }

    public final void u0() {
        try {
            A0(true, false, true, false);
            v0();
            this.f15979t.d(this.f15947K);
            l1(1);
            HandlerThread handlerThread = this.f15982w;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.f15952P = true;
                notifyAll();
            }
        } catch (Throwable th) {
            HandlerThread handlerThread2 = this.f15982w;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.f15952P = true;
                notifyAll();
                throw th;
            }
        }
    }

    public final void u1() {
        this.f15939C.f();
        for (Y0 y02 : this.f15974o) {
            if (X(y02)) {
                A(y02);
            }
        }
    }

    public final void v(Y0 y02) {
        if (X(y02)) {
            this.f15939C.a(y02);
            A(y02);
            y02.g();
            this.f15963a0--;
        }
    }

    public final void v0() {
        for (int i7 = 0; i7 < this.f15974o.length; i7++) {
            this.f15976q[i7].o();
            this.f15974o[i7].release();
        }
    }

    public final void v1() {
        B0 m7 = this.f15943G.m();
        boolean z7 = this.f15957U || (m7 != null && m7.f15507a.b());
        U0 u02 = this.f15950N;
        if (z7 != u02.f15636g) {
            this.f15950N = u02.b(z7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w() {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.C1437t0.w():void");
    }

    public final void w0(int i7, int i8, x0.T t7) {
        this.f15951O.b(1);
        O(this.f15944H.A(i7, i8, t7), false);
    }

    public final void w1(InterfaceC2142x.b bVar, x0.Z z7, A0.E e7) {
        this.f15979t.b(this.f15947K, this.f15950N.f15630a, bVar, this.f15974o, z7, e7.f43c);
    }

    public final void x(int i7, boolean z7, long j7) {
        Y0 y02 = this.f15974o[i7];
        if (X(y02)) {
            return;
        }
        B0 u7 = this.f15943G.u();
        boolean z8 = u7 == this.f15943G.t();
        A0.E p7 = u7.p();
        b1 b1Var = p7.f42b[i7];
        C1194q[] E6 = E(p7.f43c[i7]);
        boolean z9 = o1() && this.f15950N.f15634e == 3;
        boolean z10 = !z7 && z9;
        this.f15963a0++;
        this.f15975p.add(y02);
        y02.C(b1Var, E6, u7.f15509c[i7], this.f15965c0, z10, z8, j7, u7.m(), u7.f15512f.f15523a);
        y02.t(11, new a());
        this.f15939C.b(y02);
        if (z9 && z8) {
            y02.start();
        }
    }

    public final boolean x0() {
        B0 u7 = this.f15943G.u();
        A0.E p7 = u7.p();
        int i7 = 0;
        boolean z7 = false;
        while (true) {
            Y0[] y0Arr = this.f15974o;
            if (i7 >= y0Arr.length) {
                return !z7;
            }
            Y0 y02 = y0Arr[i7];
            if (X(y02)) {
                boolean z8 = y02.i() != u7.f15509c[i7];
                if (!p7.c(i7) || z8) {
                    if (!y02.A()) {
                        y02.F(E(p7.f43c[i7]), u7.f15509c[i7], u7.n(), u7.m(), u7.f15512f.f15523a);
                        if (this.f15962Z) {
                            Y0(false);
                        }
                    } else if (y02.c()) {
                        v(y02);
                    } else {
                        z7 = true;
                    }
                }
            }
            i7++;
        }
    }

    public final void x1(int i7, int i8, List list) {
        this.f15951O.b(1);
        O(this.f15944H.E(i7, i8, list), false);
    }

    public final void y() {
        z(new boolean[this.f15974o.length], this.f15943G.u().n());
    }

    public final void y0() {
        float f7 = this.f15939C.h().f12356a;
        B0 u7 = this.f15943G.u();
        A0.E e7 = null;
        boolean z7 = true;
        for (B0 t7 = this.f15943G.t(); t7 != null && t7.f15510d; t7 = t7.k()) {
            A0.E x7 = t7.x(f7, this.f15950N.f15630a);
            if (t7 == this.f15943G.t()) {
                e7 = x7;
            }
            if (!x7.a(t7.p())) {
                E0 e02 = this.f15943G;
                if (z7) {
                    B0 t8 = e02.t();
                    boolean I6 = this.f15943G.I(t8);
                    boolean[] zArr = new boolean[this.f15974o.length];
                    long b7 = t8.b((A0.E) AbstractC1297a.e(e7), this.f15950N.f15648s, I6, zArr);
                    U0 u02 = this.f15950N;
                    boolean z8 = (u02.f15634e == 4 || b7 == u02.f15648s) ? false : true;
                    U0 u03 = this.f15950N;
                    this.f15950N = S(u03.f15631b, b7, u03.f15632c, u03.f15633d, z8, 5);
                    if (z8) {
                        C0(b7);
                    }
                    boolean[] zArr2 = new boolean[this.f15974o.length];
                    int i7 = 0;
                    while (true) {
                        Y0[] y0Arr = this.f15974o;
                        if (i7 >= y0Arr.length) {
                            break;
                        }
                        Y0 y02 = y0Arr[i7];
                        boolean X6 = X(y02);
                        zArr2[i7] = X6;
                        x0.Q q7 = t8.f15509c[i7];
                        if (X6) {
                            if (q7 != y02.i()) {
                                v(y02);
                            } else if (zArr[i7]) {
                                y02.z(this.f15965c0);
                            }
                        }
                        i7++;
                    }
                    z(zArr2, this.f15965c0);
                } else {
                    e02.I(t7);
                    if (t7.f15510d) {
                        t7.a(x7, Math.max(t7.f15512f.f15524b, t7.A(this.f15965c0)), false);
                    }
                }
                N(true);
                if (this.f15950N.f15634e != 4) {
                    c0();
                    z1();
                    this.f15981v.c(2);
                    return;
                }
                return;
            }
            if (t7 == u7) {
                z7 = false;
            }
        }
    }

    public final void y1() {
        if (this.f15950N.f15630a.q() || !this.f15944H.t()) {
            return;
        }
        boolean f02 = f0();
        j0();
        k0();
        h0();
        i0(f02);
    }

    public final void z(boolean[] zArr, long j7) {
        B0 u7 = this.f15943G.u();
        A0.E p7 = u7.p();
        for (int i7 = 0; i7 < this.f15974o.length; i7++) {
            if (!p7.c(i7) && this.f15975p.remove(this.f15974o[i7])) {
                this.f15974o[i7].b();
            }
        }
        for (int i8 = 0; i8 < this.f15974o.length; i8++) {
            if (p7.c(i8)) {
                x(i8, zArr[i8], j7);
            }
        }
        u7.f15513g = true;
    }

    public final void z0() {
        y0();
        L0(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z1() {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.C1437t0.z1():void");
    }
}
