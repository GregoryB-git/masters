// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import x0.t;
import android.media.MediaFormat;
import m0.z;
import l0.w1;
import android.media.AudioDeviceInfo;
import java.util.Iterator;
import java.util.concurrent.TimeoutException;
import d0.s;
import java.util.Collection;
import d0.C;
import android.view.SurfaceHolder$Callback;
import android.view.TextureView$SurfaceTextureListener;
import java.util.Collections;
import x0.Z;
import android.util.Pair;
import d0.p;
import android.graphics.SurfaceTexture;
import d0.K;
import d0.B;
import android.media.AudioDeviceCallback;
import l0.y1;
import android.os.Handler$Callback;
import d0.L;
import A0.y;
import java.util.ArrayList;
import z0.h;
import android.os.Handler;
import g0.M;
import d0.v;
import g0.c;
import B0.e;
import d0.P;
import android.os.Looper;
import d0.l;
import l0.a;
import x0.x;
import java.util.List;
import d0.I;
import java.util.concurrent.CopyOnWriteArraySet;
import g0.n;
import g0.k;
import g0.A;
import android.content.Context;
import android.view.TextureView;
import A0.E;
import android.view.SurfaceHolder;
import android.view.Surface;
import android.media.AudioTrack;
import d0.q;
import d0.D;
import x0.T;
import android.media.AudioManager;
import d0.f;

public final class f0 extends d0.f implements w
{
    public final k0.b A;
    public final m B;
    public final g1 C;
    public final i1 D;
    public final j1 E;
    public final long F;
    public AudioManager G;
    public final boolean H;
    public int I;
    public boolean J;
    public int K;
    public int L;
    public boolean M;
    public d1 N;
    public T O;
    public w.c P;
    public boolean Q;
    public D.b R;
    public d0.w S;
    public d0.w T;
    public q U;
    public q V;
    public AudioTrack W;
    public Object X;
    public Surface Y;
    public SurfaceHolder Z;
    public boolean a0;
    public final E b;
    public TextureView b0;
    public final D.b c;
    public int c0;
    public final g0.f d;
    public int d0;
    public final Context e;
    public A e0;
    public final D f;
    public o f0;
    public final Y0[] g;
    public o g0;
    public final A0.D h;
    public int h0;
    public final k i;
    public d0.b i0;
    public final t0.f j;
    public float j0;
    public final t0 k;
    public boolean k0;
    public final n l;
    public f0.b l0;
    public final CopyOnWriteArraySet m;
    public boolean m0;
    public final I.b n;
    public boolean n0;
    public final List o;
    public int o0;
    public final boolean p;
    public boolean p0;
    public final x.a q;
    public boolean q0;
    public final a r;
    public l r0;
    public final Looper s;
    public P s0;
    public final B0.e t;
    public d0.w t0;
    public final long u;
    public U0 u0;
    public final long v;
    public int v0;
    public final long w;
    public int w0;
    public final g0.c x;
    public long x0;
    public final d y;
    public final e z;
    
    static {
        v.a("media3.exoplayer");
    }
    
    public f0(w.b b, D e) {
        g0.f d;
        Object z;
        Context applicationContext;
        Object o;
        d y;
        Handler handler;
        Y0[] a;
        boolean f;
        A0.D h;
        B0.e t;
        Looper j;
        g0.c b2;
        E b3;
        D.b e2;
        Q i;
        int a2;
        d0.w h2;
        int h3;
        long c;
        final w.b b4;
        Label_1192_Outer:Label_1272_Outer:Label_1309_Outer:
        while (true) {
            d = new g0.f();
            this.d = d;
            while (true) {
            Label_1506:
                while (true) {
                Label_1500:
                    while (true) {
                    Label_1497:
                        while (true) {
                            Label_1492: {
                                while (true) {
                                    try {
                                        z = new StringBuilder();
                                        ((StringBuilder)z).append("Init ");
                                        ((StringBuilder)z).append(Integer.toHexString(System.identityHashCode(this)));
                                        ((StringBuilder)z).append(" [");
                                        ((StringBuilder)z).append("AndroidXMedia3/1.4.1");
                                        ((StringBuilder)z).append("] [");
                                        ((StringBuilder)z).append(g0.M.e);
                                        ((StringBuilder)z).append("]");
                                        g0.o.f("ExoPlayerImpl", ((StringBuilder)z).toString());
                                        applicationContext = b.a.getApplicationContext();
                                        this.e = applicationContext;
                                        o = b.i.apply(b.b);
                                        this.r = (a)o;
                                        this.o0 = b.k;
                                        this.i0 = b.l;
                                        this.c0 = b.r;
                                        this.d0 = b.s;
                                        this.k0 = b.p;
                                        this.F = b.A;
                                        y = new d(null);
                                        this.y = y;
                                        z = new e(null);
                                        this.z = (e)z;
                                        handler = new Handler(b.j);
                                        a = ((c1)b.d.get()).a(handler, y, y, y, y);
                                        this.g = a;
                                        f = (a.length > 0);
                                        g0.a.f(f);
                                        h = (A0.D)b.f.get();
                                        this.h = h;
                                        this.q = (x.a)b.e.get();
                                        t = (B0.e)b.h.get();
                                        this.t = t;
                                        this.p = b.t;
                                        this.N = b.u;
                                        this.u = b.v;
                                        this.v = b.w;
                                        this.w = b.x;
                                        this.Q = b.B;
                                        j = b.j;
                                        this.s = j;
                                        b2 = b.b;
                                        this.x = b2;
                                        if (e == null) {
                                            e = this;
                                        }
                                        this.f = e;
                                        f = b.F;
                                        this.H = f;
                                        this.l = new n(j, b2, (n.b)new O(this));
                                        this.m = new CopyOnWriteArraySet();
                                        this.o = new ArrayList();
                                        this.O = new T.a(0);
                                        this.P = k0.w.c.b;
                                        b3 = new E(new b1[a.length], new y[a.length], d0.L.b, null);
                                        this.b = b3;
                                        this.n = new I.b();
                                        e2 = new D.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).d(29, h.h()).d(23, b.q).d(25, b.q).d(33, b.q).d(26, b.q).d(34, b.q).e();
                                        this.c = e2;
                                        this.R = new D.b.a().b(e2).a(4).a(10).e();
                                        this.i = b2.e(j, null);
                                        i = new Q(this);
                                        this.j = i;
                                        this.u0 = U0.k(b3);
                                        ((a)o).o0(e, j);
                                        a2 = g0.M.a;
                                        if (a2 < 31) {
                                            e = (D)new y1(b.G);
                                        }
                                        else {
                                            e = (D)k0.f0.c.a(applicationContext, this, b.C, b.G);
                                        }
                                        e = (D)new t0(a, h, b3, (x0)b.g.get(), t, this.I, this.J, (a)o, this.N, b.y, b.z, this.Q, b.H, j, b2, (t0.f)i, (y1)e, b.D, this.P);
                                        this.k = (t0)e;
                                        this.j0 = 1.0f;
                                        this.I = 0;
                                        h2 = d0.w.H;
                                        this.S = h2;
                                        this.T = h2;
                                        this.t0 = h2;
                                        this.v0 = -1;
                                        if (a2 < 21) {
                                            h3 = this.x1(0);
                                        }
                                        else {
                                            h3 = g0.M.J(applicationContext);
                                        }
                                        this.h0 = h3;
                                        this.l0 = f0.b.c;
                                        this.m0 = true;
                                        this.v((D.d)o);
                                        t.i(new Handler(j), (B0.e.a)o);
                                        this.d1(y);
                                        c = b.c;
                                        if (c > 0L) {
                                            ((t0)e).B(c);
                                        }
                                        e = (D)new k0.b(b.a, handler, (k0.b.b)y);
                                        (this.A = (k0.b)e).b(b.o);
                                        o = new m(b.a, handler, (m.b)y);
                                        this.B = (m)o;
                                        if (!b.m) {
                                            break Label_1492;
                                        }
                                        e = (D)this.i0;
                                        ((m)o).m((d0.b)e);
                                        if (!f || a2 < 23) {
                                            break Label_1497;
                                        }
                                        e = (D)applicationContext.getSystemService("audio");
                                        k0.f0.b.b(this.G = (AudioManager)e, new g(null), new Handler(j));
                                        if (b.q) {
                                            e = (D)new g1(b.a, handler, (g1.b)y);
                                            (this.C = (g1)e).h(g0.M.k0(this.i0.c));
                                        }
                                        else {
                                            this.C = null;
                                        }
                                        e = (D)new i1(b.a);
                                        this.D = (i1)e;
                                        if (b.n == 0) {
                                            break Label_1500;
                                        }
                                        f = true;
                                        ((i1)e).a(f);
                                        e = (D)new j1(b.a);
                                        this.E = (j1)e;
                                        if (b.n == 2) {
                                            f = true;
                                            ((j1)e).a(f);
                                            this.r0 = h1(this.C);
                                            this.s0 = d0.P.e;
                                            this.e0 = g0.A.c;
                                            h.l(this.i0);
                                            this.f2(1, 10, this.h0);
                                            this.f2(2, 10, this.h0);
                                            this.f2(1, 3, this.i0);
                                            this.f2(2, 4, this.c0);
                                            this.f2(2, 5, this.d0);
                                            this.f2(1, 9, this.k0);
                                            this.f2(2, 7, z);
                                            this.f2(6, 8, z);
                                            this.g2(16, this.o0);
                                            d.e();
                                            return;
                                        }
                                        break Label_1506;
                                        this.d.e();
                                    }
                                    finally {}
                                    b = b4;
                                    continue;
                                }
                            }
                            e = null;
                            continue Label_1192_Outer;
                        }
                        continue Label_1272_Outer;
                    }
                    f = false;
                    continue Label_1309_Outer;
                }
                f = false;
                continue;
            }
        }
    }
    
    public static /* synthetic */ boolean A0(final f0 f0, final boolean k0) {
        return f0.k0 = k0;
    }
    
    public static /* synthetic */ f0.b B0(final f0 f0, final f0.b l0) {
        return f0.l0 = l0;
    }
    
    public static /* synthetic */ d0.w C0(final f0 f0) {
        return f0.t0;
    }
    
    public static /* synthetic */ d0.w D0(final f0 f0, final d0.w t0) {
        return f0.t0 = t0;
    }
    
    public static /* synthetic */ d0.w F0(final f0 f0) {
        return f0.S;
    }
    
    public static /* synthetic */ d0.w G0(final f0 f0, final d0.w s) {
        return f0.S = s;
    }
    
    public static /* synthetic */ boolean H0(final f0 f0) {
        return f0.a0;
    }
    
    public static /* synthetic */ g1 O0(final f0 f0) {
        return f0.C;
    }
    
    public static /* synthetic */ l Q0(final f0 f0) {
        return f0.r0;
    }
    
    public static /* synthetic */ l R0(final f0 f0, final l r0) {
        return f0.r0 = r0;
    }
    
    public static /* synthetic */ U0 U0(final f0 f0) {
        return f0.u0;
    }
    
    public static /* synthetic */ o W0(final f0 f0, final o f2) {
        return f0.f0 = f2;
    }
    
    public static /* synthetic */ a X0(final f0 f0) {
        return f0.r;
    }
    
    public static /* synthetic */ q Y0(final f0 f0, final q u) {
        return f0.U = u;
    }
    
    public static /* synthetic */ P Z0(final f0 f0, final P s0) {
        return f0.s0 = s0;
    }
    
    public static /* synthetic */ n a1(final f0 f0) {
        return f0.l;
    }
    
    public static /* synthetic */ Object b1(final f0 f0) {
        return f0.X;
    }
    
    public static l h1(final g1 g1) {
        final int n = 0;
        final l.b b = new l.b(0);
        int d;
        if (g1 != null) {
            d = g1.d();
        }
        else {
            d = 0;
        }
        final l.b g2 = b.g(d);
        int c = n;
        if (g1 != null) {
            c = g1.c();
        }
        return g2.f(c).e();
    }
    
    public static int q1(final int n) {
        if (n == -1) {
            return 2;
        }
        return 1;
    }
    
    public static long u1(final U0 u0) {
        final I.c c = new I.c();
        final I.b b = new I.b();
        u0.a.h(u0.b.a, b);
        if (u0.c == -9223372036854775807L) {
            return u0.a.n(b.c, c).c();
        }
        return b.n() + u0.c;
    }
    
    public static /* synthetic */ o x0(final f0 f0, final o g0) {
        return f0.g0 = g0;
    }
    
    public static /* synthetic */ q y0(final f0 f0, final q v) {
        return f0.V = v;
    }
    
    public static /* synthetic */ boolean z0(final f0 f0) {
        return f0.k0;
    }
    
    @Override
    public void A(final d0.b i0, final boolean b) {
        this.u2();
        if (this.q0) {
            return;
        }
        if (!g0.M.c(this.i0, i0)) {
            this.f2(1, 3, this.i0 = i0);
            final g1 c = this.C;
            if (c != null) {
                c.h(g0.M.k0(i0.c));
            }
            this.l.i(20, (n.a)new S(i0));
        }
        final m b2 = this.B;
        d0.b b3;
        if (b) {
            b3 = i0;
        }
        else {
            b3 = null;
        }
        b2.m(b3);
        this.h.l(i0);
        final boolean u = this.u();
        final int p2 = this.B.p(u, this.f());
        this.p2(u, p2, q1(p2));
        this.l.f();
    }
    
    @Override
    public int C() {
        this.u2();
        if (this.u0.a.q()) {
            return this.w0;
        }
        final U0 u0 = this.u0;
        return u0.a.b(u0.b.a);
    }
    
    @Override
    public int D() {
        this.u2();
        if (this.o()) {
            return this.u0.b.b;
        }
        return -1;
    }
    
    @Override
    public int E() {
        this.u2();
        int p1;
        if ((p1 = this.p1(this.u0)) == -1) {
            p1 = 0;
        }
        return p1;
    }
    
    @Override
    public void F(final K k) {
        this.u2();
        if (this.h.h()) {
            if (k.equals(this.h.c())) {
                return;
            }
            this.h.m(k);
            this.l.k(19, (n.a)new k0.T(k));
        }
    }
    
    @Override
    public int H() {
        this.u2();
        if (this.o()) {
            return this.u0.b.c;
        }
        return -1;
    }
    
    @Override
    public int J() {
        this.u2();
        return this.u0.n;
    }
    
    @Override
    public long K() {
        this.u2();
        if (this.o()) {
            final U0 u0 = this.u0;
            final x.b b = u0.b;
            u0.a.h(b.a, this.n);
            return g0.M.i1(this.n.b(b.b, b.c));
        }
        return this.a();
    }
    
    @Override
    public I L() {
        this.u2();
        return this.u0.a;
    }
    
    @Override
    public boolean N() {
        this.u2();
        return this.J;
    }
    
    @Override
    public K O() {
        this.u2();
        return this.h.c();
    }
    
    @Override
    public long P() {
        this.u2();
        return g0.M.i1(this.o1(this.u0));
    }
    
    @Override
    public void U(final int n, final long n2, int n3, final boolean b) {
        this.u2();
        if (n == -1) {
            return;
        }
        g0.a.a(n >= 0);
        final I a = this.u0.a;
        if (!a.q() && n >= a.p()) {
            return;
        }
        this.r.f0();
        ++this.K;
        if (this.o()) {
            g0.o.h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            final t0.e e = new t0.e(this.u0);
            e.b(1);
            this.j.a(e);
            return;
        }
        final U0 u0 = this.u0;
        n3 = u0.e;
        U0 h = null;
        Label_0171: {
            if (n3 != 3) {
                h = u0;
                if (n3 != 4) {
                    break Label_0171;
                }
                h = u0;
                if (a.q()) {
                    break Label_0171;
                }
            }
            h = this.u0.h(2);
        }
        n3 = this.E();
        final U0 z1 = this.Z1(h, a, this.a2(a, n, n2));
        this.k.K0(a, n, g0.M.J0(n2));
        this.q2(z1, 0, true, 1, this.o1(z1), n3, b);
    }
    
    public final U0 Z1(U0 u0, final I i, final Pair pair) {
        g0.a.a(i.q() || pair != null);
        final I a = u0.a;
        final long n1 = this.n1(u0);
        final U0 j = u0.j(i);
        if (i.q()) {
            final x.b l = U0.l();
            final long j2 = g0.M.J0(this.x0);
            u0 = j.d(l, j2, j2, j2, 0L, x0.Z.d, this.b, X2.v.Y()).c(l);
            u0.q = u0.s;
            return u0;
        }
        final Object a2 = j.b.a;
        final boolean b = a2.equals(((Pair)g0.M.i(pair)).first) ^ true;
        x.b b2;
        if (b) {
            b2 = new x.b(pair.first);
        }
        else {
            b2 = j.b;
        }
        final long longValue = (long)pair.second;
        long j3;
        final long n2 = j3 = g0.M.J0(n1);
        if (!a.q()) {
            j3 = n2 - a.h(a2, this.n).n();
        }
        if (!b) {
            final long n3 = lcmp(longValue, j3);
            if (n3 >= 0) {
                long q = 0L;
                Label_0482: {
                    if (n3 == 0) {
                        final int b3 = i.b(j.k.a);
                        if (b3 != -1) {
                            final U0 u2 = j;
                            if (i.f(b3, this.n).c == i.h(b2.a, this.n).c) {
                                return u2;
                            }
                        }
                        i.h(b2.a, this.n);
                        if (b2.b()) {
                            q = this.n.b(b2.b, b2.c);
                        }
                        else {
                            q = this.n.d;
                        }
                        u0 = j.d(b2, j.s, j.s, j.d, q - j.s, j.h, j.i, j.j).c(b2);
                        break Label_0482;
                    }
                    g0.a.f(b2.b() ^ true);
                    final long max = Math.max(0L, j.r - (longValue - j3));
                    q = j.q;
                    if (j.k.equals(j.b)) {
                        q = longValue + max;
                    }
                    u0 = j.d(b2, longValue, longValue, longValue, max, j.h, j.i, j.j);
                    break Label_0482;
                }
                u0.q = q;
                return u0;
            }
        }
        g0.a.f(b2.b() ^ true);
        Z z;
        if (b) {
            z = x0.Z.d;
        }
        else {
            z = j.h;
        }
        E e;
        if (b) {
            e = this.b;
        }
        else {
            e = j.i;
        }
        List list;
        if (b) {
            list = X2.v.Y();
        }
        else {
            list = j.j;
        }
        u0 = j.d(b2, longValue, longValue, longValue, 0L, z, e, list).c(b2);
        u0.q = longValue;
        return u0;
    }
    
    public final Pair a2(final I i, final int v0, long b) {
        if (i.q()) {
            this.v0 = v0;
            long x0 = b;
            if (b == -9223372036854775807L) {
                x0 = 0L;
            }
            this.x0 = x0;
            this.w0 = 0;
            return null;
        }
        int a;
        if (v0 == -1 || (a = v0) >= i.p()) {
            a = i.a(this.J);
            b = i.n(a, super.a).b();
        }
        return i.j(super.a, this.n, a, g0.M.J0(b));
    }
    
    public final void b2(final int n, final int n2) {
        if (n != this.e0.b() || n2 != this.e0.a()) {
            this.e0 = new A(n, n2);
            this.l.k(24, (n.a)new U(n, n2));
            this.f2(2, 14, new A(n, n2));
        }
    }
    
    public void c1(final l0.c c) {
        this.r.N((l0.c)g0.a.e(c));
    }
    
    public final long c2(final I i, final x.b b, final long n) {
        i.h(b.a, this.n);
        return n + this.n.n();
    }
    
    @Override
    public void d(final boolean b) {
        this.u2();
        if (this.k0 == b) {
            return;
        }
        this.k0 = b;
        this.f2(1, 9, b);
        this.l.k(23, (n.a)new J(b));
    }
    
    public void d1(final w.a e) {
        this.m.add(e);
    }
    
    public final void d2(final int n, final int n2) {
        for (int i = n2 - 1; i >= n; --i) {
            this.o.remove(i);
        }
        this.O = this.O.b(n, n2);
    }
    
    @Override
    public void e(final x o) {
        this.u2();
        this.i2(Collections.singletonList(o));
    }
    
    public final List e1(final int n, final List list) {
        final ArrayList<T0.c> list2 = new ArrayList<T0.c>();
        for (int i = 0; i < list.size(); ++i) {
            final T0.c c = new T0.c(list.get(i), this.p);
            list2.add(c);
            this.o.add(i + n, new f(c.b, c.a));
        }
        this.O = this.O.d(n, list2.size());
        return list2;
    }
    
    public final void e2() {
        final TextureView b0 = this.b0;
        if (b0 != null) {
            if (b0.getSurfaceTextureListener() != this.y) {
                g0.o.h("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            }
            else {
                this.b0.setSurfaceTextureListener((TextureView$SurfaceTextureListener)null);
            }
            this.b0 = null;
        }
        final SurfaceHolder z = this.Z;
        if (z != null) {
            z.removeCallback((SurfaceHolder$Callback)this.y);
            this.Z = null;
        }
    }
    
    @Override
    public int f() {
        this.u2();
        return this.u0.e;
    }
    
    public final d0.w f1() {
        final I l = this.L();
        if (l.q()) {
            return this.t0;
        }
        return this.t0.a().K(l.n(this.E(), super.a).c.e).I();
    }
    
    public final void f2(final int n, final int n2, final Object o) {
        final Y0[] g = this.g;
        for (int length = g.length, i = 0; i < length; ++i) {
            final Y0 y0 = g[i];
            if (n == -1 || y0.l() == n) {
                this.j1(y0).n(n2).m(o).l();
            }
        }
    }
    
    @Override
    public void g() {
        this.u2();
        final boolean u = this.u();
        final m b = this.B;
        int n = 2;
        final int p = b.p(u, 2);
        this.p2(u, p, q1(p));
        final U0 u2 = this.u0;
        if (u2.e != 1) {
            return;
        }
        final U0 f = u2.f(null);
        if (f.a.q()) {
            n = 4;
        }
        final U0 h = f.h(n);
        ++this.K;
        this.k.r0();
        this.q2(h, 1, false, 5, -9223372036854775807L, -1, false);
    }
    
    public final int g1(final boolean b, final int n) {
        if (n == 0) {
            return 1;
        }
        if (this.H) {
            if (b && !this.w1()) {
                return 3;
            }
            if (!b && this.u0.n == 3) {
                return 3;
            }
        }
        return 0;
    }
    
    public final void g2(final int n, final Object o) {
        this.f2(-1, n, o);
    }
    
    @Override
    public C h() {
        this.u2();
        return this.u0.o;
    }
    
    public final void h2() {
        this.f2(1, 2, this.j0 * this.B.g());
    }
    
    @Override
    public void i(final int i) {
        this.u2();
        if (this.I != i) {
            this.I = i;
            this.k.f1(i);
            this.l.i(8, (n.a)new k0.M(i));
            this.o2();
            this.l.f();
        }
    }
    
    public final I i1() {
        return new W0(this.o, this.O);
    }
    
    public void i2(final List list) {
        this.u2();
        this.j2(list, true);
    }
    
    @Override
    public int j() {
        this.u2();
        return this.h0;
    }
    
    public final V0 j1(final V0.b b) {
        final int p = this.p1(this.u0);
        final t0 k = this.k;
        final I a = this.u0.a;
        int n = p;
        if (p == -1) {
            n = 0;
        }
        return new V0((V0.a)k, b, a, n, this.x, k.I());
    }
    
    public void j2(final List list, final boolean b) {
        this.u2();
        this.k2(list, -1, -9223372036854775807L, b);
    }
    
    @Override
    public void k(final C c) {
        this.u2();
        C d = c;
        if (c == null) {
            d = d0.C.d;
        }
        if (this.u0.o.equals(d)) {
            return;
        }
        final U0 g = this.u0.g(d);
        ++this.K;
        this.k.c1(d);
        this.q2(g, 0, false, 5, -9223372036854775807L, -1, false);
    }
    
    public final Pair k1(final U0 u0, final U0 u2, final boolean b, int i, final boolean b2, final boolean b3) {
        final I a = u2.a;
        final I a2 = u0.a;
        final boolean q = a2.q();
        final Integer value = -1;
        if (q && a.q()) {
            return new Pair((Object)Boolean.FALSE, (Object)value);
        }
        final boolean q2 = a2.q();
        final boolean q3 = a.q();
        final int n = 3;
        if (q2 != q3) {
            return new Pair((Object)Boolean.TRUE, (Object)3);
        }
        if (!a.n(a.h(u2.b.a, this.n).c, super.a).a.equals(a2.n(a2.h(u0.b.a, this.n).c, super.a).a)) {
            if (b && i == 0) {
                i = 1;
            }
            else if (b && i == 1) {
                i = 2;
            }
            else {
                if (!b2) {
                    throw new IllegalStateException();
                }
                i = n;
            }
            return new Pair((Object)Boolean.TRUE, (Object)i);
        }
        if (b && i == 0 && u2.b.d < u0.b.d) {
            return new Pair((Object)Boolean.TRUE, (Object)0);
        }
        if (b && i == 1 && b3) {
            return new Pair((Object)Boolean.TRUE, (Object)2);
        }
        return new Pair((Object)Boolean.FALSE, (Object)value);
    }
    
    public final void k2(List e1, int a, long n, final boolean b) {
        final int p4 = this.p1(this.u0);
        final long p5 = this.P();
        final int k = this.K;
        final boolean b2 = true;
        this.K = k + 1;
        if (!this.o.isEmpty()) {
            this.d2(0, this.o.size());
        }
        e1 = this.e1(0, e1);
        final I i1 = this.i1();
        if (i1.q() || a < i1.p()) {
            if (b) {
                a = i1.a(this.J);
                n = -9223372036854775807L;
            }
            else if (a == -1) {
                a = p4;
                n = p5;
            }
            final U0 z1 = this.Z1(this.u0, i1, this.a2(i1, a, n));
            int e2 = z1.e;
            if (a != -1 && (e2 = e2) != 1) {
                if (!i1.q() && a < i1.p()) {
                    e2 = 2;
                }
                else {
                    e2 = 4;
                }
            }
            final U0 h = z1.h(e2);
            this.k.X0(e1, a, g0.M.J0(n), this.O);
            this.q2(h, 0, !this.u0.b.a.equals(h.b.a) && !this.u0.a.q() && b2, 4, this.o1(h), -1, false);
            return;
        }
        throw new s(i1, a, n);
    }
    
    @Override
    public void l(float o) {
        this.u2();
        o = g0.M.o(o, 0.0f, 1.0f);
        if (this.j0 == o) {
            return;
        }
        this.j0 = o;
        this.h2();
        this.l.k(22, (n.a)new k0.K(o));
    }
    
    public Looper l1() {
        return this.s;
    }
    
    public final void l2(final SurfaceTexture surfaceTexture) {
        final Surface y = new Surface(surfaceTexture);
        this.m2(y);
        this.Y = y;
    }
    
    public long m1() {
        this.u2();
        if (this.u0.a.q()) {
            return this.x0;
        }
        final U0 u0 = this.u0;
        if (u0.k.d != u0.b.d) {
            return u0.a.n(this.E(), super.a).d();
        }
        long n = u0.q;
        if (this.u0.k.b()) {
            final U0 u2 = this.u0;
            final I.b h = u2.a.h(u2.k.a, this.n);
            n = h.f(this.u0.k.b);
            if (n == Long.MIN_VALUE) {
                n = h.d;
            }
        }
        final U0 u3 = this.u0;
        return g0.M.i1(this.c2(u3.a, u3.k, n));
    }
    
    public final void m2(final Object x) {
        final ArrayList<V0> list = new ArrayList<V0>();
        final Y0[] g = this.g;
        final int length = g.length;
        final boolean b = false;
        final boolean b2 = false;
        for (int i = 0; i < length; ++i) {
            final Y0 y0 = g[i];
            if (y0.l() == 2) {
                list.add(this.j1(y0).n(1).m(x).l());
            }
        }
        final Object x2 = this.X;
        boolean b3 = b;
        Label_0194: {
            if (x2 == null) {
                break Label_0194;
            }
            b3 = b;
            if (x2 == x) {
                break Label_0194;
            }
        Label_0147_Outer:
            while (true) {
                while (true) {
                    try {
                        final Iterator<Object> iterator = list.iterator();
                        boolean b4;
                        while (true) {
                            b4 = b2;
                            if (!iterator.hasNext()) {
                                break;
                            }
                            iterator.next().a(this.F);
                        }
                        while (true) {
                            final Object x3 = this.X;
                            final Surface y2 = this.Y;
                            b3 = b4;
                            if (x3 == y2) {
                                y2.release();
                                this.Y = null;
                                b3 = b4;
                            }
                            this.X = x;
                            if (b3) {
                                this.n2(k0.u.d(new u0(3), 1003));
                            }
                            return;
                            b4 = true;
                            continue Label_0147_Outer;
                        }
                    }
                    catch (InterruptedException ex) {}
                    catch (TimeoutException ex2) {}
                    continue;
                }
            }
        }
    }
    
    @Override
    public void n(final boolean b) {
        this.u2();
        final int p = this.B.p(b, this.f());
        this.p2(b, p, q1(p));
    }
    
    public final long n1(final U0 u0) {
        if (!u0.b.b()) {
            return g0.M.i1(this.o1(u0));
        }
        u0.a.h(u0.b.a, this.n);
        if (u0.c == -9223372036854775807L) {
            return u0.a.n(this.p1(u0), super.a).b();
        }
        return this.n.m() + g0.M.i1(u0.c);
    }
    
    public final void n2(final u u) {
        final U0 u2 = this.u0;
        final U0 c = u2.c(u2.b);
        c.q = c.s;
        c.r = 0L;
        U0 u3 = c.h(1);
        if (u != null) {
            u3 = u3.f(u);
        }
        ++this.K;
        this.k.s1();
        this.q2(u3, 0, false, 5, -9223372036854775807L, -1, false);
    }
    
    @Override
    public boolean o() {
        this.u2();
        return this.u0.b.b();
    }
    
    public final long o1(final U0 u0) {
        if (u0.a.q()) {
            return g0.M.J0(this.x0);
        }
        long n;
        if (u0.p) {
            n = u0.m();
        }
        else {
            n = u0.s;
        }
        if (u0.b.b()) {
            return n;
        }
        return this.c2(u0.a, u0.b, n);
    }
    
    public final void o2() {
        final D.b r = this.R;
        final D.b n = g0.M.N(this.f, this.c);
        this.R = n;
        if (!n.equals(r)) {
            this.l.i(13, (n.a)new W(this));
        }
    }
    
    @Override
    public long p() {
        this.u2();
        return this.n1(this.u0);
    }
    
    public final int p1(final U0 u0) {
        if (u0.a.q()) {
            return this.v0;
        }
        return u0.a.h(u0.b.a, this.n).c;
    }
    
    public final void p2(final boolean b, int g1, final int n) {
        final boolean b2 = b && g1 != -1;
        g1 = this.g1(b2, g1);
        final U0 u0 = this.u0;
        if (u0.l == b2 && u0.n == g1 && u0.m == n) {
            return;
        }
        this.r2(b2, n, g1);
    }
    
    @Override
    public int q() {
        this.u2();
        return this.I;
    }
    
    public final void q2(final U0 u0, final int n, final boolean b, final int n2, final long n3, final int n4, final boolean b2) {
        final U0 u2 = this.u0;
        this.u0 = u0;
        final boolean b3 = u2.a.equals(u0.a) ^ true;
        final Pair k1 = this.k1(u0, u2, b, n2, b3, b2);
        final boolean booleanValue = (boolean)k1.first;
        final int intValue = (int)k1.second;
        d0.u c = null;
        final d0.u u3 = null;
        if (booleanValue) {
            c = u3;
            if (!u0.a.q()) {
                c = u0.a.n(u0.a.h(u0.b.a, this.n).c, super.a).c;
            }
            this.t0 = d0.w.H;
        }
        if (booleanValue || !u2.j.equals(u0.j)) {
            this.t0 = this.t0.a().M(u0.j).I();
        }
        final d0.w f1 = this.f1();
        final boolean equals = f1.equals(this.S);
        this.S = f1;
        final boolean b4 = u2.l != u0.l;
        final boolean b5 = u2.e != u0.e;
        if (b5 || b4) {
            this.t2();
        }
        final boolean g = u2.g;
        final boolean g2 = u0.g;
        final boolean b6 = g != g2;
        if (b6) {
            this.s2(g2);
        }
        if (b3) {
            this.l.i(0, (n.a)new k0.E(u0, n));
        }
        if (b) {
            this.l.i(11, (n.a)new a0(n2, this.t1(n2, u2, n4), this.s1(n3)));
        }
        if (booleanValue) {
            this.l.i(1, (n.a)new b0(c, intValue));
        }
        if (u2.f != u0.f) {
            this.l.i(10, (n.a)new c0(u0));
            if (u0.f != null) {
                this.l.i(10, (n.a)new d0(u0));
            }
        }
        final E i = u2.i;
        final E j = u0.i;
        if (i != j) {
            this.h.i(j.e);
            this.l.i(2, (n.a)new e0(u0));
        }
        if (equals ^ true) {
            this.l.i(14, (n.a)new F(this.S));
        }
        if (b6) {
            this.l.i(3, (n.a)new G(u0));
        }
        if (b5 || b4) {
            this.l.i(-1, (n.a)new H(u0));
        }
        if (b5) {
            this.l.i(4, (n.a)new k0.I(u0));
        }
        if (b4 || u2.m != u0.m) {
            this.l.i(5, (n.a)new k0.P(u0));
        }
        if (u2.n != u0.n) {
            this.l.i(6, (n.a)new X(u0));
        }
        if (u2.n() != u0.n()) {
            this.l.i(7, (n.a)new Y(u0));
        }
        if (!u2.o.equals(u0.o)) {
            this.l.i(12, (n.a)new k0.Z(u0));
        }
        this.o2();
        this.l.f();
        if (u2.p != u0.p) {
            final Iterator<w.a> iterator = (Iterator<w.a>)this.m.iterator();
            while (iterator.hasNext()) {
                iterator.next().C(u0.p);
            }
        }
    }
    
    @Override
    public long r() {
        this.u2();
        return g0.M.i1(this.u0.r);
    }
    
    public u r1() {
        this.u2();
        return this.u0.f;
    }
    
    public final void r2(final boolean b, final int n, final int n2) {
        ++this.K;
        U0 u2;
        final U0 u0 = u2 = this.u0;
        if (u0.p) {
            u2 = u0.a();
        }
        final U0 e = u2.e(b, n, n2);
        this.k.a1(b, n, n2);
        this.q2(e, 0, false, 5, -9223372036854775807L, -1, false);
    }
    
    @Override
    public void release() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [");
        sb.append("AndroidXMedia3/1.4.1");
        sb.append("] [");
        sb.append(g0.M.e);
        sb.append("] [");
        sb.append(d0.v.b());
        sb.append("]");
        g0.o.f("ExoPlayerImpl", sb.toString());
        this.u2();
        if (g0.M.a < 21) {
            final AudioTrack w = this.W;
            if (w != null) {
                w.release();
                this.W = null;
            }
        }
        this.A.b(false);
        final g1 c = this.C;
        if (c != null) {
            c.g();
        }
        this.D.b(false);
        this.E.b(false);
        this.B.i();
        if (!this.k.t0()) {
            this.l.k(10, (n.a)new k0.L());
        }
        this.l.j();
        this.i.h(null);
        this.t.c((B0.e.a)this.r);
        final U0 u0 = this.u0;
        if (u0.p) {
            this.u0 = u0.a();
        }
        final U0 h = this.u0.h(1);
        this.u0 = h;
        final U0 c2 = h.c(h.b);
        this.u0 = c2;
        c2.q = c2.s;
        this.u0.r = 0L;
        this.r.release();
        this.h.j();
        this.e2();
        final Surface y = this.Y;
        if (y != null) {
            y.release();
            this.Y = null;
        }
        if (!this.p0) {
            this.l0 = f0.b.c;
            this.q0 = true;
            return;
        }
        android.support.v4.media.a.a(g0.a.e(null));
        throw null;
    }
    
    public final D.e s1(long i1) {
        final int e = this.E();
        Object a;
        int b;
        Object a2;
        Object c;
        if (!this.u0.a.q()) {
            final U0 u0 = this.u0;
            a = u0.b.a;
            u0.a.h(a, this.n);
            b = this.u0.a.b(a);
            a2 = this.u0.a.n(e, super.a).a;
            c = super.a.c;
        }
        else {
            c = (a = null);
            b = -1;
            a2 = a;
        }
        final long i2 = g0.M.i1(i1);
        if (this.u0.b.b()) {
            i1 = g0.M.i1(u1(this.u0));
        }
        else {
            i1 = i2;
        }
        final x.b b2 = this.u0.b;
        return new D.e(a2, e, (d0.u)c, a, b, i2, i1, b2.b, b2.c);
    }
    
    public final void s2(final boolean b) {
    }
    
    @Override
    public void stop() {
        this.u2();
        this.B.p(this.u(), 1);
        this.n2(null);
        this.l0 = new f0.b(X2.v.Y(), this.u0.s);
    }
    
    @Override
    public long t() {
        this.u2();
        if (!this.o()) {
            return this.m1();
        }
        final U0 u0 = this.u0;
        if (u0.k.equals(u0.b)) {
            return g0.M.i1(this.u0.q);
        }
        return this.K();
    }
    
    public final D.e t1(final int n, final U0 u0, int b) {
        final I.b b2 = new I.b();
        Object a;
        int c;
        Object a2;
        d0.u c2;
        int n2;
        if (!u0.a.q()) {
            a = u0.b.a;
            u0.a.h(a, b2);
            c = b2.c;
            b = u0.a.b(a);
            a2 = u0.a.n(c, super.a).a;
            c2 = super.a.c;
            n2 = b;
        }
        else {
            final Object o = null;
            final Object o2 = a = o;
            n2 = -1;
            c2 = (d0.u)o2;
            c = b;
            a2 = o;
        }
        final boolean b3 = u0.b.b();
        long n3 = 0L;
        long u2 = 0L;
        Label_0237: {
            Label_0185: {
                if (n == 0) {
                    if (b3) {
                        final x.b b4 = u0.b;
                        n3 = b2.b(b4.b, b4.c);
                    }
                    else {
                        if (u0.b.e != -1) {
                            n3 = u1(this.u0);
                            break Label_0185;
                        }
                        n3 = b2.e + b2.d;
                        break Label_0185;
                    }
                }
                else {
                    if (!b3) {
                        n3 = b2.e + u0.s;
                        break Label_0185;
                    }
                    n3 = u0.s;
                }
                u2 = u1(u0);
                break Label_0237;
            }
            u2 = n3;
        }
        final long i1 = g0.M.i1(n3);
        final long i2 = g0.M.i1(u2);
        final x.b b5 = u0.b;
        return new D.e(a2, c, c2, a, n2, i1, i2, b5.b, b5.c);
    }
    
    public final void t2() {
        final int f = this.f();
        boolean b = true;
        if (f != 1) {
            if (f == 2 || f == 3) {
                final boolean y1 = this.y1();
                final i1 d = this.D;
                if (!this.u() || y1) {
                    b = false;
                }
                d.b(b);
                this.E.b(this.u());
                return;
            }
            if (f != 4) {
                throw new IllegalStateException();
            }
        }
        this.D.b(false);
        this.E.b(false);
    }
    
    @Override
    public boolean u() {
        this.u2();
        return this.u0.l;
    }
    
    public final void u2() {
        this.d.b();
        if (Thread.currentThread() == this.l1().getThread()) {
            return;
        }
        final String g = g0.M.G("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.l1().getThread().getName());
        if (!this.m0) {
            Throwable t;
            if (this.n0) {
                t = null;
            }
            else {
                t = new IllegalStateException();
            }
            g0.o.i("ExoPlayerImpl", g, t);
            this.n0 = true;
            return;
        }
        throw new IllegalStateException(g);
    }
    
    @Override
    public void v(final D.d d) {
        this.l.c(g0.a.e(d));
    }
    
    public final void v1(final t0.e e) {
        final int k = this.K - e.c;
        this.K = k;
        final boolean d = e.d;
        final boolean b = true;
        if (d) {
            this.L = e.e;
            this.M = true;
        }
        if (k == 0) {
            final I a = e.b.a;
            if (!this.u0.a.q() && a.q()) {
                this.v0 = -1;
                this.x0 = 0L;
                this.w0 = 0;
            }
            if (!a.q()) {
                final List f = ((W0)a).F();
                g0.a.f(f.size() == this.o.size());
                for (int i = 0; i < f.size(); ++i) {
                    ((f)this.o.get(i)).c(f.get(i));
                }
            }
            final boolean m = this.M;
            long n = -9223372036854775807L;
            boolean b3;
            if (m) {
                boolean b2 = b;
                if (e.b.b.equals(this.u0.b)) {
                    b2 = (e.b.d != this.u0.s && b);
                }
                b3 = b2;
                if (b2) {
                    if (!a.q() && !e.b.b.b()) {
                        final U0 b4 = e.b;
                        n = this.c2(a, b4.b, b4.d);
                    }
                    else {
                        n = e.b.d;
                    }
                    b3 = b2;
                }
            }
            else {
                b3 = false;
            }
            this.M = false;
            this.q2(e.b, 1, b3, this.L, n, -1, false);
        }
    }
    
    public final boolean w1() {
        final AudioManager g = this.G;
        return g == null || g0.M.a < 23 || k0.f0.b.a(this.e, g.getDevices(2));
    }
    
    @Override
    public void x(final boolean j) {
        this.u2();
        if (this.J != j) {
            this.J = j;
            this.k.i1(j);
            this.l.i(9, (n.a)new N(j));
            this.o2();
            this.l.f();
        }
    }
    
    public final int x1(final int n) {
        final AudioTrack w = this.W;
        if (w != null && w.getAudioSessionId() != n) {
            this.W.release();
            this.W = null;
        }
        if (this.W == null) {
            this.W = new AudioTrack(3, 4000, 4, 2, 2, 0, n);
        }
        return this.W.getAudioSessionId();
    }
    
    public boolean y1() {
        this.u2();
        return this.u0.p;
    }
    
    @Override
    public L z() {
        this.u2();
        return this.u0.i.d;
    }
    
    public abstract static final class b
    {
        public static boolean a(final Context context, final AudioDeviceInfo[] array) {
            if (!M.F0(context)) {
                return true;
            }
            for (int length = array.length, i = 0; i < length; ++i) {
                final AudioDeviceInfo audioDeviceInfo = array[i];
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4) {
                    return true;
                }
                if (audioDeviceInfo.getType() == 3) {
                    return true;
                }
                final int a = M.a;
                if (a >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (a >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (a >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (a >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }
        
        public static void b(final AudioManager audioManager, final AudioDeviceCallback audioDeviceCallback, final Handler handler) {
            audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
        }
    }
    
    public abstract static final class c
    {
        public static y1 a(final Context context, final f0 f0, final boolean b, final String s) {
            final w1 x0 = w1.x0(context);
            if (x0 == null) {
                g0.o.h("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new y1(g0.a(), s);
            }
            if (b) {
                f0.c1(x0);
            }
            return new y1(x0.E0(), s);
        }
    }
    
    public final class d implements E, x, h, u0.b, SurfaceHolder$Callback, TextureView$SurfaceTextureListener, m.b, b.b, g1.b, w.a
    {
        @Override
        public void A(final o o) {
            k0.f0.x0(k0.f0.this, o);
            k0.f0.X0(k0.f0.this).A(o);
        }
        
        public void B(final int n, final boolean b) {
            k0.f0.a1(k0.f0.this).k(30, (n.a)new m0(n, b));
        }
        
        public void C(final boolean b) {
            k0.f0.this.t2();
        }
        
        public void D(final int n) {
            final l p = h1(k0.f0.O0(k0.f0.this));
            if (!p.equals(k0.f0.Q0(k0.f0.this))) {
                k0.f0.R0(k0.f0.this, p);
                k0.f0.a1(k0.f0.this).k(29, (n.a)new l0(p));
            }
        }
        
        public void E() {
            k0.f0.this.p2(false, -1, 3);
        }
        
        public void F(final float n) {
            k0.f0.this.h2();
        }
        
        @Override
        public void a(final z.a a) {
            k0.f0.X0(k0.f0.this).a(a);
        }
        
        @Override
        public void b(final P p) {
            k0.f0.Z0(k0.f0.this, p);
            k0.f0.a1(k0.f0.this).k(25, (n.a)new n0(p));
        }
        
        @Override
        public void c(final boolean b) {
            if (k0.f0.z0(k0.f0.this) == b) {
                return;
            }
            k0.f0.A0(k0.f0.this, b);
            k0.f0.a1(k0.f0.this).k(23, (n.a)new p0(b));
        }
        
        @Override
        public void d(final Exception ex) {
            k0.f0.X0(k0.f0.this).d(ex);
        }
        
        @Override
        public void e(final z.a a) {
            k0.f0.X0(k0.f0.this).e(a);
        }
        
        @Override
        public void f(final o o) {
            k0.f0.X0(k0.f0.this).f(o);
            k0.f0.y0(k0.f0.this, null);
            k0.f0.x0(k0.f0.this, null);
        }
        
        @Override
        public void g(final String s) {
            k0.f0.X0(k0.f0.this).g(s);
        }
        
        @Override
        public void h(final Object o, final long n) {
            k0.f0.X0(k0.f0.this).h(o, n);
            if (k0.f0.b1(k0.f0.this) == o) {
                k0.f0.a1(k0.f0.this).k(26, (n.a)new o0());
            }
        }
        
        @Override
        public void i(final String s, final long n, final long n2) {
            k0.f0.X0(k0.f0.this).i(s, n, n2);
        }
        
        public void j(final int n) {
            k0.f0.this.p2(k0.f0.this.u(), n, q1(n));
        }
        
        @Override
        public void k(final List list) {
            k0.f0.a1(k0.f0.this).k(27, (n.a)new k0(list));
        }
        
        @Override
        public void l(final long n) {
            k0.f0.X0(k0.f0.this).l(n);
        }
        
        @Override
        public void n(final o o) {
            k0.f0.W0(k0.f0.this, o);
            k0.f0.X0(k0.f0.this).n(o);
        }
        
        @Override
        public void o(final o o) {
            k0.f0.X0(k0.f0.this).o(o);
            k0.f0.Y0(k0.f0.this, null);
            k0.f0.W0(k0.f0.this, null);
        }
        
        public void onSurfaceTextureAvailable(final SurfaceTexture surfaceTexture, final int n, final int n2) {
            k0.f0.this.l2(surfaceTexture);
            k0.f0.this.b2(n, n2);
        }
        
        public boolean onSurfaceTextureDestroyed(final SurfaceTexture surfaceTexture) {
            k0.f0.this.m2(null);
            k0.f0.this.b2(0, 0);
            return true;
        }
        
        public void onSurfaceTextureSizeChanged(final SurfaceTexture surfaceTexture, final int n, final int n2) {
            k0.f0.this.b2(n, n2);
        }
        
        public void onSurfaceTextureUpdated(final SurfaceTexture surfaceTexture) {
        }
        
        @Override
        public void p(final Exception ex) {
            k0.f0.X0(k0.f0.this).p(ex);
        }
        
        @Override
        public void q(final Exception ex) {
            k0.f0.X0(k0.f0.this).q(ex);
        }
        
        @Override
        public void r(final f0.b b) {
            k0.f0.B0(k0.f0.this, b);
            k0.f0.a1(k0.f0.this).k(27, (n.a)new h0(b));
        }
        
        @Override
        public void s(final String s) {
            k0.f0.X0(k0.f0.this).s(s);
        }
        
        public void surfaceChanged(final SurfaceHolder surfaceHolder, final int n, final int n2, final int n3) {
            k0.f0.this.b2(n2, n3);
        }
        
        public void surfaceCreated(final SurfaceHolder surfaceHolder) {
            if (k0.f0.H0(k0.f0.this)) {
                k0.f0.this.m2(surfaceHolder.getSurface());
            }
        }
        
        public void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
            if (k0.f0.H0(k0.f0.this)) {
                k0.f0.this.m2(null);
            }
            k0.f0.this.b2(0, 0);
        }
        
        @Override
        public void t(final String s, final long n, final long n2) {
            k0.f0.X0(k0.f0.this).t(s, n, n2);
        }
        
        @Override
        public void u(final q q, final k0.p p2) {
            k0.f0.Y0(k0.f0.this, q);
            k0.f0.X0(k0.f0.this).u(q, p2);
        }
        
        @Override
        public void v(final int n, final long n2, final long n3) {
            k0.f0.X0(k0.f0.this).v(n, n2, n3);
        }
        
        @Override
        public void w(final int n, final long n2) {
            k0.f0.X0(k0.f0.this).w(n, n2);
        }
        
        @Override
        public void x(final d0.x x) {
            final f0 a = k0.f0.this;
            k0.f0.D0(a, k0.f0.C0(a).a().L(x).I());
            final d0.w e0 = k0.f0.this.f1();
            if (!e0.equals(k0.f0.F0(k0.f0.this))) {
                k0.f0.G0(k0.f0.this, e0);
                k0.f0.a1(k0.f0.this).i(14, (n.a)new i0(this));
            }
            k0.f0.a1(k0.f0.this).i(28, (n.a)new j0(x));
            k0.f0.a1(k0.f0.this).f();
        }
        
        @Override
        public void y(final long n, final int n2) {
            k0.f0.X0(k0.f0.this).y(n, n2);
        }
        
        @Override
        public void z(final q q, final k0.p p2) {
            k0.f0.y0(k0.f0.this, q);
            k0.f0.X0(k0.f0.this).z(q, p2);
        }
    }
    
    public static final class e implements p, E0.a, V0.b
    {
        public p o;
        public E0.a p;
        public p q;
        public E0.a r;
        
        @Override
        public void a(final long n, final float[] array) {
            final E0.a r = this.r;
            if (r != null) {
                r.a(n, array);
            }
            final E0.a p2 = this.p;
            if (p2 != null) {
                p2.a(n, array);
            }
        }
        
        @Override
        public void h() {
            final E0.a r = this.r;
            if (r != null) {
                r.h();
            }
            final E0.a p = this.p;
            if (p != null) {
                p.h();
            }
        }
        
        @Override
        public void k(final long n, final long n2, final q q, final MediaFormat mediaFormat) {
            final p q2 = this.q;
            if (q2 != null) {
                q2.k(n, n2, q, mediaFormat);
            }
            final p o = this.o;
            if (o != null) {
                o.k(n, n2, q, mediaFormat);
            }
        }
        
        @Override
        public void t(final int n, final Object o) {
            if (n == 7) {
                this.o = (p)o;
                return;
            }
            if (n == 8) {
                this.p = (E0.a)o;
                return;
            }
            if (n != 10000) {
                return;
            }
            android.support.v4.media.a.a(o);
            this.q = null;
            this.r = null;
        }
    }
    
    public static final class f implements F0
    {
        public final Object a;
        public final x b;
        public I c;
        
        public f(final Object a, final t b) {
            this.a = a;
            this.b = b;
            this.c = b.Z();
        }
        
        @Override
        public Object a() {
            return this.a;
        }
        
        @Override
        public I b() {
            return this.c;
        }
        
        public void c(final I c) {
            this.c = c;
        }
    }
    
    public final class g extends AudioDeviceCallback
    {
        public void onAudioDevicesAdded(final AudioDeviceInfo[] array) {
            if (k0.f0.this.w1() && k0.f0.U0(k0.f0.this).n == 3) {
                final f0 a = k0.f0.this;
                a.r2(k0.f0.U0(a).l, 1, 0);
            }
        }
        
        public void onAudioDevicesRemoved(final AudioDeviceInfo[] array) {
            if (!k0.f0.this.w1()) {
                final f0 a = k0.f0.this;
                a.r2(k0.f0.U0(a).l, 1, 3);
            }
        }
    }
}
