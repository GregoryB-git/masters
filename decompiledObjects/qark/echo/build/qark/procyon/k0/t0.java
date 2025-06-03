// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import g0.F;
import p0.n;
import d0.A;
import i0.h;
import x0.b;
import android.os.Message;
import x0.S;
import x0.T;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;
import x0.Q;
import z0.i;
import java.io.IOException;
import java.util.Collections;
import d0.C;
import java.util.List;
import x0.Z;
import g0.o;
import x0.x;
import android.util.Pair;
import d0.q;
import A0.y;
import X2.a0;
import l0.a;
import g0.M;
import android.os.Looper;
import android.os.HandlerThread;
import g0.k;
import B0.e;
import A0.E;
import java.util.Set;
import d0.I;
import l0.y1;
import g0.c;
import java.util.ArrayList;
import A0.D;
import x0.v;
import android.os.Handler$Callback;

public final class t0 implements Handler$Callback, v.a, D.a, T0.d, s.a, V0.a
{
    public static final long l0;
    public final long A;
    public final boolean B;
    public final s C;
    public final ArrayList D;
    public final g0.c E;
    public final f F;
    public final E0 G;
    public final T0 H;
    public final w0 I;
    public final long J;
    public final y1 K;
    public final boolean L;
    public d1 M;
    public U0 N;
    public e O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public long T;
    public boolean U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public int a0;
    public h b0;
    public long c0;
    public long d0;
    public int e0;
    public boolean f0;
    public u g0;
    public long h0;
    public long i0;
    public w.c j0;
    public I k0;
    public final Y0[] o;
    public final Set p;
    public final a1[] q;
    public final D r;
    public final E s;
    public final x0 t;
    public final B0.e u;
    public final k v;
    public final HandlerThread w;
    public final Looper x;
    public final I.c y;
    public final I.b z;
    
    static {
        l0 = M.i1(10000L);
    }
    
    public t0(final Y0[] o, final D r, final E s, final x0 t, final B0.e u, int i, final boolean w, final a a, final d1 m, final w0 j, final long n, final boolean q, final boolean l, final Looper looper, final g0.c e, final f f, final y1 k, final Looper x, final w.c j2) {
        this.F = f;
        this.o = o;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.V = i;
        this.W = w;
        this.M = m;
        this.I = j;
        this.J = n;
        this.h0 = n;
        this.Q = q;
        this.L = l;
        this.E = e;
        this.K = k;
        this.j0 = j2;
        this.i0 = -9223372036854775807L;
        this.T = -9223372036854775807L;
        this.A = t.h(k);
        this.B = t.f(k);
        this.k0 = d0.I.a;
        final U0 k2 = U0.k(s);
        this.N = k2;
        this.O = new e(k2);
        this.q = new a1[o.length];
        final a1.a d = r.d();
        for (i = 0; i < o.length; ++i) {
            o[i].D(i, k, e);
            this.q[i] = o[i].G();
            if (d != null) {
                this.q[i].x(d);
            }
        }
        this.C = new s((s.a)this, e);
        this.D = new ArrayList();
        this.p = X2.a0.h();
        this.y = new I.c();
        this.z = new I.b();
        r.e((D.a)this, u);
        this.f0 = true;
        final k e2 = e.e(looper, null);
        this.G = new E0(a, e2, new s0(this), j2);
        this.H = new T0((T0.d)this, a, e2, k);
        if (x != null) {
            this.w = null;
            this.x = x;
        }
        else {
            final HandlerThread w2 = new HandlerThread("ExoPlayer:Playback", -16);
            ((Thread)(this.w = w2)).start();
            this.x = w2.getLooper();
        }
        this.v = e.e(this.x, (Handler$Callback)this);
    }
    
    public static void D0(final I i, final d d, final I.c c, final I.b b) {
        final int o = i.n(i.h(d.r, b).c, c).o;
        final Object b2 = i.g(o, b, true).b;
        final long d2 = b.d;
        long n;
        if (d2 != -9223372036854775807L) {
            n = d2 - 1L;
        }
        else {
            n = Long.MAX_VALUE;
        }
        d.e(o, n, b2);
    }
    
    public static q[] E(final y y) {
        int i = 0;
        int length;
        if (y != null) {
            length = y.length();
        }
        else {
            length = 0;
        }
        final q[] array = new q[length];
        while (i < length) {
            array[i] = y.b(i);
            ++i;
        }
        return array;
    }
    
    public static boolean E0(final d d, final I i, final I j, int b, final boolean b2, final I.c c, final I.b b3) {
        final Object r = d.r;
        if (r == null) {
            long j2;
            if (d.o.f() == Long.MIN_VALUE) {
                j2 = -9223372036854775807L;
            }
            else {
                j2 = M.J0(d.o.f());
            }
            final Pair h0 = H0(i, new h(d.o.h(), d.o.d(), j2), false, b, b2, c, b3);
            if (h0 == null) {
                return false;
            }
            d.e(i.b(h0.first), (long)h0.second, h0.first);
            if (d.o.f() == Long.MIN_VALUE) {
                D0(i, d, c, b3);
            }
            return true;
        }
        else {
            b = i.b(r);
            if (b == -1) {
                return false;
            }
            if (d.o.f() == Long.MIN_VALUE) {
                D0(i, d, c, b3);
                return true;
            }
            d.p = b;
            j.h(d.r, b3);
            if (b3.f && j.n(b3.c, c).n == j.b(d.r)) {
                final Pair k = i.j(c, b3, i.h(d.r, b3).c, d.q + b3.n());
                d.e(i.b(k.first), (long)k.second, k.first);
            }
            return true;
        }
    }
    
    public static g G0(final I i, final U0 u0, final h h, final E0 e0, int n, final boolean b, final I.c c, final I.b b2) {
        if (i.q()) {
            return new g(U0.l(), 0L, -9223372036854775807L, false, true, false);
        }
        final x.b b3 = u0.b;
        Object obj = b3.a;
        final boolean z = Z(u0, b2);
        long n2;
        if (!u0.b.b() && !z) {
            n2 = u0.s;
        }
        else {
            n2 = u0.c;
        }
        final int n3 = 1;
        long n4 = 0L;
        boolean b6 = false;
        boolean b8 = false;
        boolean b9 = false;
        x.b b10 = null;
        Label_0526: {
            Label_0230: {
                if (h != null) {
                    final Pair h2 = H0(i, h, true, n, b, c, b2);
                    boolean b5;
                    boolean b4;
                    if (h2 == null) {
                        n = i.a(b);
                        n4 = n2;
                        b4 = (b5 = false);
                        b6 = true;
                    }
                    else {
                        if (h.c == -9223372036854775807L) {
                            n = i.h(h2.first, b2).c;
                            n4 = n2;
                            b4 = false;
                        }
                        else {
                            obj = h2.first;
                            n4 = (long)h2.second;
                            n = -1;
                            b4 = true;
                        }
                        b5 = (u0.e == 4);
                        b6 = false;
                    }
                    final boolean b7 = b4;
                    b8 = b5;
                    b9 = b7;
                }
                else {
                    b10 = b3;
                    final int n5 = -1;
                    if (u0.a.q()) {
                        n = i.a(b);
                    }
                    else {
                        if (i.b(obj) == n5) {
                            n = I0(c, b2, n, b, obj, u0.a, i);
                            boolean b11;
                            if (n == n5) {
                                n = i.a(b);
                                b11 = true;
                            }
                            else {
                                b11 = false;
                            }
                            b6 = b11;
                            n4 = n2;
                            b8 = (b9 = false);
                            break Label_0230;
                        }
                        if (n2 == -9223372036854775807L) {
                            n = i.h(obj, b2).c;
                        }
                        else {
                            if (z) {
                                u0.a.h(b10.a, b2);
                                if (u0.a.n(b2.c, c).n == u0.a.b(b10.a)) {
                                    final Pair j = i.j(c, b2, i.h(obj, b2).c, n2 + b2.n());
                                    obj = j.first;
                                    n4 = (long)j.second;
                                }
                                else {
                                    n4 = n2;
                                }
                                n = n5;
                                b8 = (b6 = false);
                                b9 = true;
                                break Label_0526;
                            }
                            n = n5;
                            n4 = n2;
                            b8 = false;
                            b6 = (b9 = b8);
                            break Label_0526;
                        }
                    }
                    n4 = n2;
                    b8 = false;
                    b6 = (b9 = b8);
                }
            }
            b10 = b3;
        }
        long n6;
        if (n != -1) {
            final Pair k = i.j(c, b2, n, -9223372036854775807L);
            obj = k.first;
            n4 = (long)k.second;
            n6 = -9223372036854775807L;
        }
        else {
            n6 = n4;
        }
        x.b l = e0.L(i, obj, n4);
        n = l.e;
        Label_0632: {
            if (n != -1) {
                final int e2 = b10.e;
                if (e2 == -1 || n < e2) {
                    n = 0;
                    break Label_0632;
                }
            }
            n = 1;
        }
        if (b10.a.equals(obj) && !b10.b() && !l.b() && n != 0) {
            n = n3;
        }
        else {
            n = 0;
        }
        final boolean v = V(z, b10, n2, l, i.h(obj, b2), n6);
        if (n != 0 || v) {
            l = b10;
        }
        long n7 = n4;
        if (l.b()) {
            if (l.equals(b10)) {
                n7 = u0.s;
            }
            else {
                i.h(l.a, b2);
                if (l.c == b2.k(l.b)) {
                    n7 = b2.g();
                }
                else {
                    n7 = 0L;
                }
            }
        }
        return new g(l, n7, n6, b8, b6, b9);
    }
    
    public static Pair H0(final I i, final h h, final boolean b, int i2, final boolean b2, final I.c c, final I.b b3) {
        I a = h.a;
        if (i.q()) {
            return null;
        }
        if (a.q()) {
            a = i;
        }
        try {
            final Pair j = a.j(c, b3, h.b, h.c);
            if (i.equals(a)) {
                return j;
            }
            if (i.b(j.first) != -1) {
                Pair k = j;
                if (a.h(j.first, b3).f) {
                    k = j;
                    if (a.n(b3.c, c).n == a.b(j.first)) {
                        k = i.j(c, b3, i.h(j.first, b3).c, h.c);
                    }
                }
                return k;
            }
            if (b) {
                i2 = I0(c, b3, i2, b2, j.first, a, i);
                if (i2 != -1) {
                    return i.j(c, b3, i2, -9223372036854775807L);
                }
            }
            return null;
        }
        catch (IndexOutOfBoundsException ex) {
            return null;
        }
    }
    
    public static int I0(final I.c c, final I.b b, final int n, final boolean b2, final Object o, final I i, final I j) {
        final Object a = i.n(i.h(o, b).c, c).a;
        int n2 = 0;
        for (int k = 0; k < j.p(); ++k) {
            if (j.n(k, c).a.equals(a)) {
                return k;
            }
        }
        int n3;
        int l;
        int b3;
        for (n3 = i.b(o), l = i.i(), b3 = -1; n2 < l && b3 == -1; b3 = j.b(i.m(n3)), ++n2) {
            n3 = i.d(n3, b, c, n, b2);
            if (n3 == -1) {
                break;
            }
        }
        if (b3 == -1) {
            return -1;
        }
        return j.f(b3, b).c;
    }
    
    public static boolean V(final boolean b, final x.b b2, final long n, final x.b b3, final I.b b4, final long n2) {
        final boolean b5 = false;
        final boolean b6 = false;
        boolean b7 = b5;
        if (!b) {
            b7 = b5;
            if (n == n2) {
                if (!b2.a.equals(b3.a)) {
                    return false;
                }
                if (b2.b() && b4.r(b2.b)) {
                    boolean b8 = b6;
                    if (b4.h(b2.b, b2.c) != 4) {
                        b8 = b6;
                        if (b4.h(b2.b, b2.c) != 2) {
                            b8 = true;
                        }
                    }
                    return b8;
                }
                b7 = b5;
                if (b3.b()) {
                    b7 = b5;
                    if (b4.r(b3.b)) {
                        b7 = true;
                    }
                }
            }
        }
        return b7;
    }
    
    public static boolean X(final Y0 y0) {
        return y0.getState() != 0;
    }
    
    public static boolean Z(final U0 u0, final I.b b) {
        final x.b b2 = u0.b;
        final I a = u0.a;
        return a.q() || a.h(b2.a, b).f;
    }
    
    public static /* synthetic */ boolean i(final t0 t0, final boolean y) {
        return t0.Y = y;
    }
    
    public static /* synthetic */ boolean l(final t0 t0) {
        return t0.L;
    }
    
    public static /* synthetic */ boolean n(final t0 t0) {
        return t0.Z;
    }
    
    public static /* synthetic */ k p(final t0 t0) {
        return t0.v;
    }
    
    public final void A(final Y0 y0) {
        if (y0.getState() == 2) {
            y0.stop();
        }
    }
    
    public final void A0(final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        this.v.f(2);
        final u u = null;
        this.g0 = null;
        final boolean b5 = true;
        this.B1(false, true);
        this.C.f();
        this.c0 = 1000000000000L;
        final Y0[] o = this.o;
        for (int length = o.length, i = 0; i < length; ++i) {
            final Y0 y0 = o[i];
            try {
                this.v(y0);
                continue;
            }
            catch (RuntimeException y0) {}
            catch (u u2) {}
            g0.o.d("ExoPlayerImplInternal", "Disable failed.", (Throwable)y0);
        }
        if (b) {
            final Y0[] o2 = this.o;
            for (int length2 = o2.length, j = 0; j < length2; ++j) {
                final Y0 y2 = o2[j];
                if (this.p.remove(y2)) {
                    try {
                        y2.b();
                    }
                    catch (RuntimeException ex) {
                        g0.o.d("ExoPlayerImplInternal", "Reset failed.", ex);
                    }
                }
            }
        }
        this.a0 = 0;
        final U0 n = this.N;
        x.b b6 = n.b;
        long s = n.s;
        if (!this.N.b.b() && !Z(this.N, this.z)) {
            final long n2 = this.N.s;
        }
        else {
            final long n2 = this.N.c;
        }
        while (true) {
            Label_0357: {
                if (!b2) {
                    break Label_0357;
                }
                this.b0 = null;
                final Pair h = this.H(this.N.a);
                final x.b b7 = (x.b)h.first;
                final long longValue = (long)h.second;
                final boolean equals = b7.equals(this.N.b);
                final long n3 = -9223372036854775807L;
                b6 = b7;
                s = longValue;
                long n2 = n3;
                if (equals) {
                    break Label_0357;
                }
                n2 = n3;
                s = longValue;
                b6 = b7;
                final boolean b8 = b5;
                this.G.f();
                this.U = false;
                I l;
                final I k = l = this.N.a;
                Object o3 = null;
                W0 w2 = null;
                Label_0513: {
                    if (b3) {
                        l = k;
                        if (k instanceof W0) {
                            final W0 w0 = (W0)(l = ((W0)k).E(this.H.q()));
                            if (b6.b != -1) {
                                w0.h(b6.a, this.z);
                                l = w0;
                                if (w0.n(this.z.c, this.y).f()) {
                                    o3 = new x.b(b6.a, b6.d);
                                    w2 = w0;
                                    break Label_0513;
                                }
                            }
                        }
                    }
                    final W0 w3 = (W0)l;
                    o3 = b6;
                    w2 = w3;
                }
                final U0 n4 = this.N;
                final int e = n4.e;
                u f;
                if (b4) {
                    f = u;
                }
                else {
                    f = n4.f;
                }
                Z z;
                if (b8) {
                    z = x0.Z.d;
                }
                else {
                    z = n4.h;
                }
                E e2;
                if (b8) {
                    e2 = this.s;
                }
                else {
                    e2 = n4.i;
                }
                List list;
                if (b8) {
                    list = X2.v.Y();
                }
                else {
                    list = n4.j;
                }
                final U0 n5 = this.N;
                this.N = new U0(w2, (x.b)o3, n2, s, e, f, false, z, e2, list, (x.b)o3, n5.l, n5.m, n5.n, n5.o, s, 0L, s, 0L, false);
                if (b3) {
                    this.G.H();
                    this.H.y();
                }
                return;
            }
            final boolean b8 = false;
            continue;
        }
    }
    
    public final void A1(final I i, final x.b b, final I j, final x.b b2, final long n, final boolean b3) {
        if (!this.q1(i, b)) {
            C c;
            if (b.b()) {
                c = d0.C.d;
            }
            else {
                c = this.N.o;
            }
            if (!this.C.h().equals(c)) {
                this.V0(c);
                this.Q(this.N.o, c.a, false, false);
            }
            return;
        }
        i.n(i.h(b.a, this.z).c, this.y);
        this.I.b((d0.u.g)g0.M.i(this.y.j));
        if (n != -9223372036854775807L) {
            this.I.d(this.F(i, b.a, n));
            return;
        }
        final Object a = this.y.a;
        Object a2;
        if (!j.q()) {
            a2 = j.n(j.h(b2.a, this.z).c, this.y).a;
        }
        else {
            a2 = null;
        }
        if (!g0.M.c(a2, a) || b3) {
            this.I.d(-9223372036854775807L);
        }
    }
    
    public void B(final long h0) {
        this.h0 = h0;
    }
    
    public final void B0() {
        final B0 t = this.G.t();
        this.R = (t != null && t.f.h && this.Q);
    }
    
    public final void B1(final boolean s, final boolean b) {
        this.S = s;
        long b2;
        if (s && !b) {
            b2 = this.E.b();
        }
        else {
            b2 = -9223372036854775807L;
        }
        this.T = b2;
    }
    
    public final X2.v C(final y[] array) {
        final X2.v.a a = new X2.v.a();
        int n;
        int n2;
        for (int length = array.length, i = n = 0; i < length; ++i, n = n2) {
            final y y = array[i];
            n2 = n;
            if (y != null) {
                final d0.x k = y.b(0).k;
                if (k == null) {
                    a.h(new d0.x(new d0.x.b[0]));
                    n2 = n;
                }
                else {
                    a.h(k);
                    n2 = 1;
                }
            }
        }
        if (n != 0) {
            return a.k();
        }
        return X2.v.Y();
    }
    
    public final void C0(long b) {
        final B0 t = this.G.t();
        if (t == null) {
            b += 1000000000000L;
        }
        else {
            b = t.B(b);
        }
        this.c0 = b;
        this.C.c(b);
        final Y0[] o = this.o;
        for (int length = o.length, i = 0; i < length; ++i) {
            final Y0 y0 = o[i];
            if (X(y0)) {
                y0.z(this.c0);
            }
        }
        this.n0();
    }
    
    public final void C1(final float n) {
        for (B0 b0 = this.G.t(); b0 != null; b0 = b0.k()) {
            final y[] c = b0.p().c;
            for (int length = c.length, i = 0; i < length; ++i) {
                final y y = c[i];
                if (y != null) {
                    y.r(n);
                }
            }
        }
    }
    
    public final long D() {
        final U0 n = this.N;
        return this.F(n.a, n.b.a, n.s);
    }
    
    public final void D1(W2.s s, final long n) {
        // monitorenter(this)
        while (true) {
        Label_0070_Outer:
            while (true) {
            Label_0100_Outer:
                while (true) {
                    Label_0103: {
                        long b;
                        long n2;
                        try {
                            b = this.E.b();
                            final boolean b2 = false;
                            n2 = n;
                            if (!(boolean)s.get() && n2 > 0L) {
                                final t0 t0 = this;
                                final g0.c c = t0.E;
                                c.f();
                                final t0 t2 = this;
                                final long n3 = n2;
                                t2.wait(n3);
                                break Label_0070;
                            }
                            break Label_0103;
                        }
                        finally {
                            final W2.s s2;
                            s = s2;
                            break Label_0103;
                        }
                        try {
                            final t0 t0 = this;
                            final g0.c c = t0.E;
                            c.f();
                            final t0 t2 = this;
                            final long n3 = n2;
                            t2.wait(n3);
                            n2 = b + n - this.E.b();
                            continue Label_0070_Outer;
                            // iftrue(Label_0100:, !b2)
                            // monitorexit(this)
                            // monitorexit(this)
                            while (true) {
                                Block_9: {
                                    break Block_9;
                                    return;
                                    final boolean b2 = true;
                                    continue Label_0100_Outer;
                                }
                                Thread.currentThread().interrupt();
                                continue;
                            }
                        }
                        catch (InterruptedException ex) {}
                    }
                    break;
                }
                break;
            }
            continue;
        }
    }
    
    public final long F(final I i, final Object o, final long n) {
        i.n(i.h(o, this.z).c, this.y);
        final I.c y = this.y;
        if (y.f == -9223372036854775807L || !y.f()) {
            return -9223372036854775807L;
        }
        final I.c y2 = this.y;
        if (!y2.i) {
            return -9223372036854775807L;
        }
        return g0.M.J0(y2.a() - this.y.f) - (n + this.z.n());
    }
    
    public final void F0(final I i, final I j) {
        if (i.q() && j.q()) {
            return;
        }
        for (int k = this.D.size() - 1; k >= 0; --k) {
            if (!E0((d)this.D.get(k), i, j, this.V, this.W, this.y, this.z)) {
                ((d)this.D.get(k)).o.k(false);
                this.D.remove(k);
            }
        }
        Collections.sort((List<Comparable>)this.D);
    }
    
    public final long G() {
        final B0 u = this.G.u();
        if (u == null) {
            return 0L;
        }
        long m = u.m();
        if (!u.d) {
            return m;
        }
        int n = 0;
        while (true) {
            final Y0[] o = this.o;
            if (n >= o.length) {
                return m;
            }
            long max = m;
            if (X(o[n])) {
                if (this.o[n].i() != u.c[n]) {
                    max = m;
                }
                else {
                    final long w = this.o[n].w();
                    if (w == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    max = Math.max(w, m);
                }
            }
            ++n;
            m = max;
        }
    }
    
    public final Pair H(final I i) {
        final boolean q = i.q();
        final long n = 0L;
        if (q) {
            return Pair.create((Object)U0.l(), (Object)0L);
        }
        final Pair j = i.j(this.y, this.z, i.a(this.W), -9223372036854775807L);
        final x.b l = this.G.L(i, j.first, 0L);
        long k = (long)j.second;
        if (l.b()) {
            i.h(l.a, this.z);
            k = n;
            if (l.c == this.z.k(l.b)) {
                k = this.z.g();
            }
        }
        return Pair.create((Object)l, (Object)k);
    }
    
    public Looper I() {
        return this.x;
    }
    
    public final long J() {
        return this.K(this.N.q);
    }
    
    public final void J0(final long n) {
        long l0;
        if (this.N.e == 3 && (this.L || !this.o1())) {
            l0 = 1000L;
        }
        else {
            l0 = t0.l0;
        }
        long n2 = l0;
        if (this.L) {
            n2 = l0;
            if (this.o1()) {
                final Y0[] o = this.o;
                final int length = o.length;
                int n3 = 0;
                while (true) {
                    n2 = l0;
                    if (n3 >= length) {
                        break;
                    }
                    final Y0 y0 = o[n3];
                    long min = l0;
                    if (X(y0)) {
                        min = Math.min(l0, g0.M.i1(y0.q(this.c0, this.d0)));
                    }
                    ++n3;
                    l0 = min;
                }
            }
        }
        this.v.e(2, n + n2);
    }
    
    public final long K(final long n) {
        final B0 m = this.G.m();
        if (m == null) {
            return 0L;
        }
        return Math.max(0L, n - m.A(this.c0));
    }
    
    public void K0(final I i, final int n, final long n2) {
        this.v.g(3, new h(i, n, n2)).a();
    }
    
    public final void L(final v v) {
        if (!this.G.B(v)) {
            return;
        }
        this.G.F(this.c0);
        this.c0();
    }
    
    public final void L0(final boolean b) {
        final x.b a = this.G.t().f.a;
        final long o0 = this.O0(a, this.N.s, true, false);
        if (o0 != this.N.s) {
            final U0 n = this.N;
            this.N = this.S(a, o0, n.c, n.d, b, 5);
        }
    }
    
    public final void M(final IOException ex, final int n) {
        final u c = k0.u.c(ex, n);
        final B0 t = this.G.t();
        u a = c;
        if (t != null) {
            a = c.a(t.f.a);
        }
        g0.o.d("ExoPlayerImplInternal", "Playback error", a);
        this.t1(false, false);
        this.N = this.N.f(a);
    }
    
    public final void M0(final h b0) {
        final e o = this.O;
        boolean b2 = true;
        o.b(1);
        final Pair h0 = H0(this.N.a, b0, true, this.V, this.W, this.y, this.z);
        while (true) {
            long n = 0L;
            long n2 = 0L;
            Label_0104: {
                if (h0 == null) {
                    final Pair h2 = this.H(this.N.a);
                    final x.b l = (x.b)h2.first;
                    n = (long)h2.second;
                    final boolean b3 = this.N.a.q() ^ true;
                    n2 = -9223372036854775807L;
                    break Label_0104;
                }
                final Object first = h0.first;
                n = (long)h0.second;
                if (b0.c == -9223372036854775807L) {
                    n2 = -9223372036854775807L;
                }
                else {
                    n2 = n;
                }
                final x.b l = this.G.L(this.N.a, first, n);
                if (!l.b()) {
                    final boolean b3 = b0.c == -9223372036854775807L;
                    break Label_0104;
                }
                this.N.a.h(l.a, this.z);
                long g;
                if (this.z.k(l.b) == l.c) {
                    g = this.z.g();
                }
                else {
                    g = 0L;
                }
                final long n3 = n2;
                boolean b3 = true;
                final long n4 = g;
            Label_0486_Outer:
                while (true) {
                    while (true) {
                    Label_0609:
                        while (true) {
                            Label_0602: {
                                while (true) {
                                    while (true) {
                                        try {
                                            if (this.N.a.q()) {
                                                this.b0 = b0;
                                            }
                                            else if (h0 == null) {
                                                if (this.N.e != 1) {
                                                    this.l1(4);
                                                }
                                                this.A0(false, true, false, true);
                                            }
                                            else {
                                                long n5 = 0L;
                                                Label_0469: {
                                                    if (l.equals(this.N.b)) {
                                                        final B0 t = this.G.t();
                                                        if (t == null || !t.d || n4 == 0L) {
                                                            break Label_0602;
                                                        }
                                                        final long d = t.a.d(n4, this.M);
                                                        n5 = d;
                                                        if (g0.M.i1(d) == g0.M.i1(this.N.s)) {
                                                            final U0 n6 = this.N;
                                                            final int e = n6.e;
                                                            if (e != 2) {
                                                                n5 = d;
                                                                if (e != 3) {
                                                                    break Label_0469;
                                                                }
                                                            }
                                                            final long s = n6.s;
                                                            this.N = this.S(l, s, n3, s, b3, 2);
                                                            return;
                                                        }
                                                    }
                                                    else {
                                                        n5 = n4;
                                                    }
                                                }
                                                if (this.N.e == 4) {
                                                    final boolean b4 = true;
                                                    final long n7 = this.N0(l, n5, b4);
                                                    if (n4 == n7) {
                                                        b2 = false;
                                                    }
                                                    b3 |= b2;
                                                    try {
                                                        final U0 n8 = this.N;
                                                        final I a = n8.a;
                                                        this.A1(a, l, a, n8.b, n3, true);
                                                        this.N = this.S(l, n7, n3, n7, b3, 2);
                                                        return;
                                                    }
                                                    finally {}
                                                    this.N = this.S(l, n7, n3, n7, b3, 2);
                                                    throw;
                                                }
                                                break Label_0609;
                                            }
                                        }
                                        finally {
                                            final long n7 = n4;
                                            continue;
                                        }
                                        break;
                                    }
                                    final long n7 = n4;
                                    continue;
                                }
                            }
                            final long d = n4;
                            continue Label_0486_Outer;
                        }
                        final boolean b4 = false;
                        continue;
                    }
                }
            }
            final long n3 = n2;
            final long n4 = n;
            continue;
        }
    }
    
    public final void N(final boolean b) {
        final B0 m = this.G.m();
        x.b b2;
        if (m == null) {
            b2 = this.N.b;
        }
        else {
            b2 = m.f.a;
        }
        final boolean b3 = this.N.k.equals(b2) ^ true;
        if (b3) {
            this.N = this.N.c(b2);
        }
        final U0 n = this.N;
        long q;
        if (m == null) {
            q = n.s;
        }
        else {
            q = m.j();
        }
        n.q = q;
        this.N.r = this.J();
        if ((b3 || b) && m != null && m.d) {
            this.w1(m.f.a, m.o(), m.p());
        }
    }
    
    public final long N0(final x.b b, final long n, final boolean b2) {
        return this.O0(b, n, this.G.t() != this.G.u(), b2);
    }
    
    public final void O(final I p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_0        
        //     2: getfield        k0/t0.N:Lk0/U0;
        //     5: aload_0        
        //     6: getfield        k0/t0.b0:Lk0/t0$h;
        //     9: aload_0        
        //    10: getfield        k0/t0.G:Lk0/E0;
        //    13: aload_0        
        //    14: getfield        k0/t0.V:I
        //    17: aload_0        
        //    18: getfield        k0/t0.W:Z
        //    21: aload_0        
        //    22: getfield        k0/t0.y:Ld0/I$c;
        //    25: aload_0        
        //    26: getfield        k0/t0.z:Ld0/I$b;
        //    29: invokestatic    k0/t0.G0:(Ld0/I;Lk0/U0;Lk0/t0$h;Lk0/E0;IZLd0/I$c;Ld0/I$b;)Lk0/t0$g;
        //    32: astore          20
        //    34: aload           20
        //    36: getfield        k0/t0$g.a:Lx0/x$b;
        //    39: astore          19
        //    41: aload           20
        //    43: getfield        k0/t0$g.c:J
        //    46: lstore          14
        //    48: aload           20
        //    50: getfield        k0/t0$g.d:Z
        //    53: istore          6
        //    55: aload           20
        //    57: getfield        k0/t0$g.b:J
        //    60: lstore          8
        //    62: aload_0        
        //    63: getfield        k0/t0.N:Lk0/U0;
        //    66: getfield        k0/U0.b:Lx0/x$b;
        //    69: aload           19
        //    71: invokevirtual   x0/x$b.equals:(Ljava/lang/Object;)Z
        //    74: ifeq            98
        //    77: lload           8
        //    79: aload_0        
        //    80: getfield        k0/t0.N:Lk0/U0;
        //    83: getfield        k0/U0.s:J
        //    86: lcmp           
        //    87: ifeq            93
        //    90: goto            98
        //    93: iconst_0       
        //    94: istore_3       
        //    95: goto            100
        //    98: iconst_1       
        //    99: istore_3       
        //   100: ldc2_w          -9223372036854775807
        //   103: lstore          12
        //   105: aload           20
        //   107: getfield        k0/t0$g.e:Z
        //   110: ifeq            140
        //   113: aload_0        
        //   114: getfield        k0/t0.N:Lk0/U0;
        //   117: getfield        k0/U0.e:I
        //   120: iconst_1       
        //   121: if_icmpeq       132
        //   124: aload_0        
        //   125: iconst_4       
        //   126: invokevirtual   k0/t0.l1:(I)V
        //   129: goto            132
        //   132: aload_0        
        //   133: iconst_0       
        //   134: iconst_0       
        //   135: iconst_0       
        //   136: iconst_1       
        //   137: invokevirtual   k0/t0.A0:(ZZZZ)V
        //   140: aload_0        
        //   141: getfield        k0/t0.o:[Lk0/Y0;
        //   144: astore          18
        //   146: aload           18
        //   148: arraylength    
        //   149: istore          5
        //   151: iconst_0       
        //   152: istore          4
        //   154: iload           4
        //   156: iload           5
        //   158: if_icmpge       186
        //   161: aload           18
        //   163: iload           4
        //   165: aaload         
        //   166: aload_1        
        //   167: invokeinterface k0/Y0.E:(Ld0/I;)V
        //   172: iload           4
        //   174: iconst_1       
        //   175: iadd           
        //   176: istore          4
        //   178: goto            154
        //   181: astore          18
        //   183: goto            579
        //   186: iload_3        
        //   187: ifne            229
        //   190: aload_0        
        //   191: getfield        k0/t0.G:Lk0/E0;
        //   194: astore          18
        //   196: aload_0        
        //   197: getfield        k0/t0.c0:J
        //   200: lstore          10
        //   202: aload_0        
        //   203: invokevirtual   k0/t0.G:()J
        //   206: lstore          16
        //   208: aload           18
        //   210: aload_1        
        //   211: lload           10
        //   213: lload           16
        //   215: invokevirtual   k0/E0.R:(Ld0/I;JJ)Z
        //   218: ifne            817
        //   221: aload_0        
        //   222: iconst_0       
        //   223: invokevirtual   k0/t0.L0:(Z)V
        //   226: goto            817
        //   229: lload           8
        //   231: lstore          10
        //   233: aload_1        
        //   234: invokevirtual   d0/I.q:()Z
        //   237: istore          7
        //   239: iload           7
        //   241: ifne            817
        //   244: aload_0        
        //   245: getfield        k0/t0.G:Lk0/E0;
        //   248: invokevirtual   k0/E0.t:()Lk0/B0;
        //   251: astore          18
        //   253: aload           18
        //   255: ifnull          307
        //   258: aload           18
        //   260: getfield        k0/B0.f:Lk0/C0;
        //   263: getfield        k0/C0.a:Lx0/x$b;
        //   266: aload           19
        //   268: invokevirtual   x0/x$b.equals:(Ljava/lang/Object;)Z
        //   271: ifeq            297
        //   274: aload           18
        //   276: aload_0        
        //   277: getfield        k0/t0.G:Lk0/E0;
        //   280: aload_1        
        //   281: aload           18
        //   283: getfield        k0/B0.f:Lk0/C0;
        //   286: invokevirtual   k0/E0.v:(Ld0/I;Lk0/C0;)Lk0/C0;
        //   289: putfield        k0/B0.f:Lk0/C0;
        //   292: aload           18
        //   294: invokevirtual   k0/B0.C:()V
        //   297: aload           18
        //   299: invokevirtual   k0/B0.k:()Lk0/B0;
        //   302: astore          18
        //   304: goto            253
        //   307: lload           10
        //   309: lstore          8
        //   311: aload_0        
        //   312: aload           19
        //   314: lload           8
        //   316: iload           6
        //   318: invokevirtual   k0/t0.N0:(Lx0/x$b;JZ)J
        //   321: lstore          10
        //   323: lload           10
        //   325: lstore          8
        //   327: goto            344
        //   330: astore          18
        //   332: goto            827
        //   335: astore          18
        //   337: lload           10
        //   339: lstore          8
        //   341: goto            827
        //   344: aload_0        
        //   345: getfield        k0/t0.N:Lk0/U0;
        //   348: astore          21
        //   350: aload           21
        //   352: getfield        k0/U0.a:Ld0/I;
        //   355: astore          18
        //   357: aload           21
        //   359: getfield        k0/U0.b:Lx0/x$b;
        //   362: astore          21
        //   364: aload           20
        //   366: getfield        k0/t0$g.f:Z
        //   369: ifeq            379
        //   372: lload           8
        //   374: lstore          10
        //   376: goto            384
        //   379: ldc2_w          -9223372036854775807
        //   382: lstore          10
        //   384: aload_0        
        //   385: aload_1        
        //   386: aload           19
        //   388: aload           18
        //   390: aload           21
        //   392: lload           10
        //   394: iconst_0       
        //   395: invokevirtual   k0/t0.A1:(Ld0/I;Lx0/x$b;Ld0/I;Lx0/x$b;JZ)V
        //   398: iload_3        
        //   399: ifne            415
        //   402: lload           14
        //   404: aload_0        
        //   405: getfield        k0/t0.N:Lk0/U0;
        //   408: getfield        k0/U0.c:J
        //   411: lcmp           
        //   412: ifeq            522
        //   415: aload_0        
        //   416: getfield        k0/t0.N:Lk0/U0;
        //   419: astore          20
        //   421: aload           20
        //   423: getfield        k0/U0.b:Lx0/x$b;
        //   426: getfield        x0/x$b.a:Ljava/lang/Object;
        //   429: astore          18
        //   431: aload           20
        //   433: getfield        k0/U0.a:Ld0/I;
        //   436: astore          20
        //   438: iload_3        
        //   439: ifeq            476
        //   442: iload_2        
        //   443: ifeq            476
        //   446: aload           20
        //   448: invokevirtual   d0/I.q:()Z
        //   451: ifne            476
        //   454: aload           20
        //   456: aload           18
        //   458: aload_0        
        //   459: getfield        k0/t0.z:Ld0/I$b;
        //   462: invokevirtual   d0/I.h:(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;
        //   465: getfield        d0/I$b.f:Z
        //   468: ifne            476
        //   471: iconst_1       
        //   472: istore_2       
        //   473: goto            478
        //   476: iconst_0       
        //   477: istore_2       
        //   478: aload_0        
        //   479: getfield        k0/t0.N:Lk0/U0;
        //   482: getfield        k0/U0.d:J
        //   485: lstore          10
        //   487: aload_1        
        //   488: aload           18
        //   490: invokevirtual   d0/I.b:(Ljava/lang/Object;)I
        //   493: iconst_m1      
        //   494: if_icmpne       502
        //   497: iconst_4       
        //   498: istore_3       
        //   499: goto            504
        //   502: iconst_3       
        //   503: istore_3       
        //   504: aload_0        
        //   505: aload_0        
        //   506: aload           19
        //   508: lload           8
        //   510: lload           14
        //   512: lload           10
        //   514: iload_2        
        //   515: iload_3        
        //   516: invokevirtual   k0/t0.S:(Lx0/x$b;JJJZI)Lk0/U0;
        //   519: putfield        k0/t0.N:Lk0/U0;
        //   522: aload_0        
        //   523: invokevirtual   k0/t0.B0:()V
        //   526: aload_0        
        //   527: aload_1        
        //   528: aload_0        
        //   529: getfield        k0/t0.N:Lk0/U0;
        //   532: getfield        k0/U0.a:Ld0/I;
        //   535: invokevirtual   k0/t0.F0:(Ld0/I;Ld0/I;)V
        //   538: aload_0        
        //   539: aload_0        
        //   540: getfield        k0/t0.N:Lk0/U0;
        //   543: aload_1        
        //   544: invokevirtual   k0/U0.j:(Ld0/I;)Lk0/U0;
        //   547: putfield        k0/t0.N:Lk0/U0;
        //   550: aload_1        
        //   551: invokevirtual   d0/I.q:()Z
        //   554: ifne            562
        //   557: aload_0        
        //   558: aconst_null    
        //   559: putfield        k0/t0.b0:Lk0/t0$h;
        //   562: aload_0        
        //   563: iconst_0       
        //   564: invokevirtual   k0/t0.N:(Z)V
        //   567: aload_0        
        //   568: getfield        k0/t0.v:Lg0/k;
        //   571: iconst_2       
        //   572: invokeinterface g0/k.c:(I)Z
        //   577: pop            
        //   578: return         
        //   579: aload_0        
        //   580: getfield        k0/t0.N:Lk0/U0;
        //   583: astore          22
        //   585: aload           22
        //   587: getfield        k0/U0.a:Ld0/I;
        //   590: astore          21
        //   592: aload           22
        //   594: getfield        k0/U0.b:Lx0/x$b;
        //   597: astore          22
        //   599: lload           12
        //   601: lstore          10
        //   603: aload           20
        //   605: getfield        k0/t0$g.f:Z
        //   608: ifeq            615
        //   611: lload           8
        //   613: lstore          10
        //   615: aload_0        
        //   616: aload_1        
        //   617: aload           19
        //   619: aload           21
        //   621: aload           22
        //   623: lload           10
        //   625: iconst_0       
        //   626: invokevirtual   k0/t0.A1:(Ld0/I;Lx0/x$b;Ld0/I;Lx0/x$b;JZ)V
        //   629: iload_3        
        //   630: ifne            646
        //   633: lload           14
        //   635: aload_0        
        //   636: getfield        k0/t0.N:Lk0/U0;
        //   639: getfield        k0/U0.c:J
        //   642: lcmp           
        //   643: ifeq            753
        //   646: aload_0        
        //   647: getfield        k0/t0.N:Lk0/U0;
        //   650: astore          21
        //   652: aload           21
        //   654: getfield        k0/U0.b:Lx0/x$b;
        //   657: getfield        x0/x$b.a:Ljava/lang/Object;
        //   660: astore          20
        //   662: aload           21
        //   664: getfield        k0/U0.a:Ld0/I;
        //   667: astore          21
        //   669: iload_3        
        //   670: ifeq            707
        //   673: iload_2        
        //   674: ifeq            707
        //   677: aload           21
        //   679: invokevirtual   d0/I.q:()Z
        //   682: ifne            707
        //   685: aload           21
        //   687: aload           20
        //   689: aload_0        
        //   690: getfield        k0/t0.z:Ld0/I$b;
        //   693: invokevirtual   d0/I.h:(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;
        //   696: getfield        d0/I$b.f:Z
        //   699: ifne            707
        //   702: iconst_1       
        //   703: istore_2       
        //   704: goto            709
        //   707: iconst_0       
        //   708: istore_2       
        //   709: aload_0        
        //   710: getfield        k0/t0.N:Lk0/U0;
        //   713: getfield        k0/U0.d:J
        //   716: lstore          10
        //   718: aload_1        
        //   719: aload           20
        //   721: invokevirtual   d0/I.b:(Ljava/lang/Object;)I
        //   724: iconst_m1      
        //   725: if_icmpne       733
        //   728: iconst_4       
        //   729: istore_3       
        //   730: goto            735
        //   733: iconst_3       
        //   734: istore_3       
        //   735: aload_0        
        //   736: aload_0        
        //   737: aload           19
        //   739: lload           8
        //   741: lload           14
        //   743: lload           10
        //   745: iload_2        
        //   746: iload_3        
        //   747: invokevirtual   k0/t0.S:(Lx0/x$b;JJJZI)Lk0/U0;
        //   750: putfield        k0/t0.N:Lk0/U0;
        //   753: aload_0        
        //   754: invokevirtual   k0/t0.B0:()V
        //   757: aload_0        
        //   758: aload_1        
        //   759: aload_0        
        //   760: getfield        k0/t0.N:Lk0/U0;
        //   763: getfield        k0/U0.a:Ld0/I;
        //   766: invokevirtual   k0/t0.F0:(Ld0/I;Ld0/I;)V
        //   769: aload_0        
        //   770: aload_0        
        //   771: getfield        k0/t0.N:Lk0/U0;
        //   774: aload_1        
        //   775: invokevirtual   k0/U0.j:(Ld0/I;)Lk0/U0;
        //   778: putfield        k0/t0.N:Lk0/U0;
        //   781: aload_1        
        //   782: invokevirtual   d0/I.q:()Z
        //   785: ifne            793
        //   788: aload_0        
        //   789: aconst_null    
        //   790: putfield        k0/t0.b0:Lk0/t0$h;
        //   793: aload_0        
        //   794: iconst_0       
        //   795: invokevirtual   k0/t0.N:(Z)V
        //   798: aload_0        
        //   799: getfield        k0/t0.v:Lg0/k;
        //   802: iconst_2       
        //   803: invokeinterface g0/k.c:(I)Z
        //   808: pop            
        //   809: aload           18
        //   811: athrow         
        //   812: astore          18
        //   814: goto            579
        //   817: goto            344
        //   820: astore          18
        //   822: goto            579
        //   825: astore          18
        //   827: goto            822
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  105    129    812    817    Any
        //  132    140    812    817    Any
        //  140    146    812    817    Any
        //  146    151    181    186    Any
        //  161    172    181    186    Any
        //  190    208    825    827    Any
        //  208    226    820    822    Any
        //  233    239    820    822    Any
        //  244    253    335    344    Any
        //  258    297    820    822    Any
        //  297    304    820    822    Any
        //  311    323    330    335    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0229:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final long O0(final x.b b, long n, final boolean b2, final boolean b3) {
        this.u1();
        this.B1(false, true);
        if (b3 || this.N.e == 3) {
            this.l1(2);
        }
        B0 b5;
        B0 b4;
        for (b4 = (b5 = this.G.t()); b5 != null && !b.equals(b5.f.a); b5 = b5.k()) {}
        if (b2 || b4 != b5 || (b5 != null && b5.B(n) < 0L)) {
            final Y0[] o = this.o;
            for (int length = o.length, i = 0; i < length; ++i) {
                this.v(o[i]);
            }
            if (b5 != null) {
                while (this.G.t() != b5) {
                    this.G.b();
                }
                this.G.I(b5);
                b5.z(1000000000000L);
                this.y();
            }
        }
        final E0 g = this.G;
        if (b5 != null) {
            g.I(b5);
            long s;
            if (!b5.d) {
                b5.f = b5.f.b(n);
                s = n;
            }
            else {
                s = n;
                if (b5.e) {
                    s = b5.a.s(n);
                    b5.a.q(s - this.A, this.B);
                }
            }
            this.C0(s);
            this.c0();
            n = s;
        }
        else {
            g.f();
            this.C0(n);
        }
        this.N(false);
        this.v.c(2);
        return n;
    }
    
    public final void P(final v v) {
        if (!this.G.B(v)) {
            return;
        }
        final B0 m = this.G.m();
        m.q(this.C.h().a, this.N.a);
        this.w1(m.f.a, m.o(), m.p());
        if (m == this.G.t()) {
            this.C0(m.f.b);
            this.y();
            final U0 n = this.N;
            final x.b b = n.b;
            final long b2 = m.f.b;
            this.N = this.S(b, b2, n.c, b2, false, 5);
        }
        this.c0();
    }
    
    public final void P0(final V0 v0) {
        if (v0.f() == -9223372036854775807L) {
            this.Q0(v0);
            return;
        }
        if (this.N.a.q()) {
            this.D.add(new d(v0));
            return;
        }
        final d e = new d(v0);
        final I a = this.N.a;
        if (E0(e, a, a, this.V, this.W, this.y, this.z)) {
            this.D.add(e);
            Collections.sort((List<Comparable>)this.D);
            return;
        }
        v0.k(false);
    }
    
    public final void Q(final C c, final float n, final boolean b, final boolean b2) {
        if (b) {
            if (b2) {
                this.O.b(1);
            }
            this.N = this.N.g(c);
        }
        this.C1(c.a);
        final Y0[] o = this.o;
        for (int length = o.length, i = 0; i < length; ++i) {
            final Y0 y0 = o[i];
            if (y0 != null) {
                y0.I(n, c.a);
            }
        }
    }
    
    public final void Q0(final V0 v0) {
        if (v0.c() == this.x) {
            this.u(v0);
            final int e = this.N.e;
            if (e == 3 || e == 2) {
                this.v.c(2);
            }
        }
        else {
            this.v.g(15, v0).a();
        }
    }
    
    public final void R(final C c, final boolean b) {
        this.Q(c, c.a, true, b);
    }
    
    public final void R0(final V0 v0) {
        final Looper c = v0.c();
        if (!c.getThread().isAlive()) {
            g0.o.h("TAG", "Trying to send message on a dead thread.");
            v0.k(false);
            return;
        }
        this.E.e(c, null).j(new r0(this, v0));
    }
    
    public final U0 S(final x.b b, final long n, final long n2, final long n3, final boolean b2, final int n4) {
        this.f0 = (this.f0 || n != this.N.s || !b.equals(this.N.b));
        this.B0();
        final U0 n5 = this.N;
        Z z = n5.h;
        E e = n5.i;
        List list = n5.j;
        if (this.H.t()) {
            final B0 t = this.G.t();
            if (t == null) {
                z = x0.Z.d;
            }
            else {
                z = t.o();
            }
            if (t == null) {
                e = this.s;
            }
            else {
                e = t.p();
            }
            list = this.C(e.c);
            if (t != null) {
                final C0 f = t.f;
                if (f.c != n2) {
                    t.f = f.a(n2);
                }
            }
            this.g0();
        }
        else if (!b.equals(this.N.b)) {
            z = x0.Z.d;
            e = this.s;
            list = X2.v.Y();
        }
        if (b2) {
            this.O.d(n4);
        }
        return this.N.d(b, n, n2, n3, this.J(), z, e, list);
    }
    
    public final void S0(final long n) {
        final Y0[] o = this.o;
        for (int length = o.length, i = 0; i < length; ++i) {
            final Y0 y0 = o[i];
            if (y0.i() != null) {
                this.T0(y0, n);
            }
        }
    }
    
    public final boolean T(final Y0 y0, final B0 b0) {
        final B0 k = b0.k();
        return b0.f.f && k.d && (y0 instanceof i || y0 instanceof u0.c || y0.w() >= k.n());
    }
    
    public final void T0(final Y0 y0, final long n) {
        y0.u();
        if (y0 instanceof i) {
            ((i)y0).w0(n);
        }
    }
    
    public final boolean U() {
        final B0 u = this.G.u();
        if (!u.d) {
            return false;
        }
        int n = 0;
        while (true) {
            final Y0[] o = this.o;
            if (n >= o.length) {
                return true;
            }
            final Y0 y0 = o[n];
            final Q q = u.c[n];
            if (y0.i() != q) {
                return false;
            }
            if (q != null && !y0.p() && !this.T(y0, u)) {
                return false;
            }
            ++n;
        }
    }
    
    public final void U0(final boolean x, final AtomicBoolean atomicBoolean) {
        if (this.X != x && !(this.X = x)) {
            final Y0[] o = this.o;
            for (int length = o.length, i = 0; i < length; ++i) {
                final Y0 y0 = o[i];
                if (!X(y0) && this.p.remove(y0)) {
                    y0.b();
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                this.notifyAll();
            }
        }
    }
    
    public final void V0(final C c) {
        this.v.f(16);
        this.C.k(c);
    }
    
    public final boolean W() {
        final B0 m = this.G.m();
        return m != null && !m.r() && m.l() != Long.MIN_VALUE;
    }
    
    public final void W0(final b b) {
        this.O.b(1);
        if (t0.b.a(b) != -1) {
            this.b0 = new h(new W0(t0.b.b(b), t0.b.c(b)), t0.b.a(b), t0.b.d(b));
        }
        this.O(this.H.C(t0.b.b(b), t0.b.c(b)), false);
    }
    
    public void X0(final List list, final int n, final long n2, final T t) {
        this.v.g(17, new b(list, t, n, n2, null)).a();
    }
    
    public final boolean Y() {
        final B0 t = this.G.t();
        final long e = t.f.e;
        return t.d && (e == -9223372036854775807L || this.N.s < e || !this.o1());
    }
    
    public final void Y0(final boolean z) {
        if (z == this.Z) {
            return;
        }
        this.Z = z;
        if (!z && this.N.p) {
            this.v.c(2);
        }
    }
    
    public final void Z0(final boolean q) {
        this.Q = q;
        this.B0();
        if (this.R && this.G.u() != this.G.t()) {
            this.L0(true);
            this.N(false);
        }
    }
    
    public void a(final Y0 y0) {
        this.v.c(26);
    }
    
    public void a1(final boolean b, final int n, final int n2) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public void b() {
        this.v.f(2);
        this.v.c(22);
    }
    
    public final void b1(final boolean b, final int n, final boolean b2, final int n2) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public void c(final V0 v0) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0066: {
            try {
                if (!this.P) {
                    if (this.x.getThread().isAlive()) {
                        this.v.g(14, v0).a();
                        // monitorexit(this)
                        return;
                    }
                }
            }
            finally {
                break Label_0066;
            }
            g0.o.h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            final V0 v2;
            v2.k(false);
            return;
        }
    }
    // monitorexit(this)
    
    public final void c0() {
        final boolean n1 = this.n1();
        this.U = n1;
        if (n1) {
            this.G.m().e(this.c0, this.C.h().a, this.T);
        }
        this.v1();
    }
    
    public void c1(final C c) {
        this.v.g(4, c).a();
    }
    
    public void d() {
        this.v.c(10);
    }
    
    public final void d0() {
        this.O.c(this.N);
        if (e.a(this.O)) {
            this.F.a(this.O);
            this.O = new e(this.N);
        }
    }
    
    public final void d1(final C c) {
        this.V0(c);
        this.R(this.C.h(), true);
    }
    
    public final void e0(long q, final long n) {
        if (!this.D.isEmpty()) {
            if (this.N.b.b()) {
                return;
            }
            long n2 = q;
            if (this.f0) {
                n2 = q - 1L;
                this.f0 = false;
            }
            final U0 n3 = this.N;
            final int b = n3.a.b(n3.b.a);
            int min = Math.min(this.e0, this.D.size());
            d d;
            if (min > 0) {
                d = this.D.get(min - 1);
            }
            else {
                d = null;
            }
            while (d != null) {
                final int p2 = d.p;
                if (p2 <= b && (p2 != b || d.q <= n2)) {
                    break;
                }
                final int n4 = min - 1;
                if (n4 > 0) {
                    d = this.D.get(min - 2);
                }
                else {
                    d = null;
                }
                min = n4;
            }
            int n5 = min;
            q = n2;
            int n6 = 0;
            d d3 = null;
        Label_0207_Outer:
            while (true) {
                if (min >= this.D.size()) {
                    break Label_0228;
                }
                while (true) {
                    d d2 = this.D.get(min);
                    n5 = min;
                    Label_0234: {
                        break Label_0234;
                        d2 = null;
                        n2 = q;
                    }
                    n6 = n5;
                    d3 = d2;
                    if (d2 != null) {
                        n6 = n5;
                        d3 = d2;
                        if (d2.r != null) {
                            final int p3 = d2.p;
                            if (p3 >= b) {
                                n6 = n5;
                                d3 = d2;
                                if (p3 != b) {
                                    break Label_0207_Outer;
                                }
                                n6 = n5;
                                d3 = d2;
                                if (d2.q > n2) {
                                    break Label_0207_Outer;
                                }
                            }
                            min = ++n5;
                            q = n2;
                            if (min < this.D.size()) {
                                continue;
                            }
                            continue Label_0207_Outer;
                        }
                    }
                    break;
                }
                break;
            }
            while (d3 != null && d3.r != null && d3.p == b) {
                q = d3.q;
                if (q > n2 && q <= n) {
                    try {
                        this.Q0(d3.o);
                        if (!d3.o.b() && !d3.o.j()) {
                            ++n6;
                        }
                        else {
                            this.D.remove(n6);
                        }
                        if (n6 < this.D.size()) {
                            d3 = this.D.get(n6);
                            continue;
                        }
                        d3 = null;
                        continue;
                    }
                    finally {
                        if (d3.o.b() || d3.o.j()) {
                            this.D.remove(n6);
                        }
                    }
                    break;
                }
                break;
            }
            this.e0 = n6;
        }
    }
    
    public final void e1(final w.c j0) {
        this.j0 = j0;
        this.G.Q(this.N.a, j0);
    }
    
    public final boolean f0() {
        this.G.F(this.c0);
        final boolean o = this.G.O();
        boolean b2;
        final boolean b = b2 = false;
        if (o) {
            final C0 s = this.G.s(this.c0, this.N);
            b2 = b;
            if (s != null) {
                final B0 g = this.G.g(s);
                g.a.u((v.a)this, s.b);
                if (this.G.t() == g) {
                    this.C0(s.b);
                }
                this.N(false);
                b2 = true;
            }
        }
        if (this.U) {
            this.U = this.W();
            this.v1();
            return b2;
        }
        this.c0();
        return b2;
    }
    
    public void f1(final int n) {
        this.v.b(11, n, 0).a();
    }
    
    public final void g0() {
        final B0 t = this.G.t();
        if (t != null) {
            final E p = t.p();
            final boolean b = false;
            while (true) {
                int n;
                int n2;
                for (int i = n = 0; i < this.o.length; ++i, n = n2) {
                    n2 = n;
                    if (p.c(i)) {
                        if (this.o[i].l() != 1) {
                            final boolean b2 = false;
                            boolean b3 = b;
                            if (n != 0) {
                                b3 = b;
                                if (b2) {
                                    b3 = true;
                                }
                            }
                            this.Y0(b3);
                            return;
                        }
                        n2 = n;
                        if (p.b[i].a != 0) {
                            n2 = 1;
                        }
                    }
                }
                final boolean b2 = true;
                continue;
            }
        }
    }
    
    public final void g1(final int v) {
        this.V = v;
        if (!this.G.S(this.N.a, v)) {
            this.L0(true);
        }
        this.N(false);
    }
    
    public final void h0() {
        int n = 0;
        while (this.m1()) {
            if (n != 0) {
                this.d0();
            }
            final B0 b0 = (B0)g0.a.e(this.G.b());
            boolean b3 = false;
            Label_0116: {
                if (this.N.b.a.equals(b0.f.a.a)) {
                    final x.b b2 = this.N.b;
                    if (b2.b == -1) {
                        final x.b a = b0.f.a;
                        if (a.b == -1 && b2.e != a.e) {
                            b3 = true;
                            break Label_0116;
                        }
                    }
                }
                b3 = false;
            }
            final C0 f = b0.f;
            final x.b a2 = f.a;
            final long b4 = f.b;
            this.N = this.S(a2, b4, f.c, b4, b3 ^ true, 0);
            this.B0();
            this.z1();
            if (this.N.e == 3) {
                this.r1();
            }
            this.r();
            n = 1;
        }
    }
    
    public final void h1(final d1 m) {
        this.M = m;
    }
    
    public boolean handleMessage(final Message message) {
        int o;
        boolean b;
        boolean b2;
        boolean b3;
        boolean b4;
        int arg2;
        u u;
        u g0 = null;
        B0 b5;
        C0 f;
        x.b a;
        long b6;
        final A a2;
        U0 n;
        final RuntimeException ex;
        u d;
        u g2;
        u g3;
        B0 u2;
        k v;
        u g4;
        final IOException ex2;
        final u u3;
        Label_0365_Outer:Label_0394_Outer:Label_0526_Outer:
        while (true) {
            o = 1000;
            while (true) {
            Label_1070:
                while (true) {
                Label_1064:
                    while (true) {
                        Label_1058:Label_0707_Outer:
                        while (true) {
                        Label_0913_Outer:
                            while (true) {
                                try {
                                    switch (message.what) {
                                        case 29: {
                                            this.s0();
                                            break;
                                        }
                                        case 28: {
                                            this.e1((w.c)message.obj);
                                            break;
                                        }
                                        case 27: {
                                            this.x1(message.arg1, message.arg2, (List)message.obj);
                                            break;
                                        }
                                        case 26: {
                                            this.z0();
                                            break;
                                        }
                                        case 25: {
                                            this.s();
                                            break;
                                        }
                                        case 23: {
                                            if (message.arg1 != 0) {
                                                b = true;
                                                this.Z0(b);
                                                break;
                                            }
                                            break Label_0913_Outer;
                                        }
                                        case 22: {
                                            this.l0();
                                            break;
                                        }
                                        case 21: {
                                            this.k1((T)message.obj);
                                            break;
                                        }
                                        case 20: {
                                            this.w0(message.arg1, message.arg2, (T)message.obj);
                                            break;
                                        }
                                        case 19: {
                                            android.support.v4.media.a.a(message.obj);
                                            this.m0(null);
                                            break;
                                        }
                                        case 18: {
                                            this.q((b)message.obj, message.arg1);
                                            break;
                                        }
                                        case 17: {
                                            this.W0((b)message.obj);
                                            break;
                                        }
                                        case 16: {
                                            this.R((C)message.obj, false);
                                            break;
                                        }
                                        case 15: {
                                            this.R0((V0)message.obj);
                                            break;
                                        }
                                        case 14: {
                                            this.P0((V0)message.obj);
                                            break;
                                        }
                                        case 13: {
                                            if (message.arg1 != 0) {
                                                b2 = true;
                                                this.U0(b2, (AtomicBoolean)message.obj);
                                                break;
                                            }
                                            break Label_1058;
                                        }
                                        case 12: {
                                            if (message.arg1 != 0) {
                                                b3 = true;
                                                this.j1(b3);
                                                break;
                                            }
                                            break Label_1064;
                                        }
                                        case 11: {
                                            this.g1(message.arg1);
                                            break;
                                        }
                                        case 10: {
                                            this.y0();
                                            break;
                                        }
                                        case 9: {
                                            this.L((v)message.obj);
                                            break;
                                        }
                                        case 8: {
                                            this.P((v)message.obj);
                                            break;
                                        }
                                        case 7: {
                                            this.u0();
                                            return true;
                                        }
                                        case 6: {
                                            this.t1(false, true);
                                            break;
                                        }
                                        case 5: {
                                            this.h1((d1)message.obj);
                                            break;
                                        }
                                        case 4: {
                                            this.d1((C)message.obj);
                                            break;
                                        }
                                        case 3: {
                                            this.M0((h)message.obj);
                                            break;
                                        }
                                        case 2: {
                                            this.w();
                                            break;
                                        }
                                        case 1: {
                                            if (message.arg1 != 0) {
                                                b4 = true;
                                                arg2 = message.arg2;
                                                this.b1(b4, arg2 >> 4, true, arg2 & 0xF);
                                                break;
                                            }
                                            break Label_1070;
                                        }
                                        default: {
                                            return false;
                                        }
                                    }
                                    // iftrue(Label_0750:, u.x != 1)
                                    // iftrue(Label_0657:, !a2.o)
                                    // iftrue(Label_0818:, g2 == null)
                                    // iftrue(Label_0750:, u2 == null)
                                    // iftrue(Label_0566:, !ex instanceof IllegalArgumentException)
                                    // iftrue(Label_0683:, !a2.o)
                                    // iftrue(Label_0690:, n2 != 4)
                                    // iftrue(Label_0850:, o != 5004 && o != 5003)
                                    // iftrue(Label_0996:, g3.x != 1 || this.G.t() == this.G.u())
                                    // iftrue(Label_0850:, !g0.D)
                                    // iftrue(Label_0783:, this.g0 == null)
                                    // iftrue(Label_0941:, this.G.t() == this.G.u())
                                Label_0913:
                                    while (true) {
                                        Block_26:Block_24_Outer:
                                        while (true) {
                                            while (true) {
                                                Label_0783_Outer:Block_21_Outer:Label_0876_Outer:
                                                while (true) {
                                                    this.d0();
                                                    return true;
                                                    g0 = u;
                                                    while (true) {
                                                        while (true) {
                                                            Block_20: {
                                                                Block_23: {
                                                                    Block_19: {
                                                                        Label_0690: {
                                                                        Block_15_Outer:
                                                                            while (true) {
                                                                                while (true) {
                                                                                Label_0566_Outer:
                                                                                    while (true) {
                                                                                        while (true) {
                                                                                            Block_14: {
                                                                                                Block_18: {
                                                                                                    break Block_18;
                                                                                                    Label_0941: {
                                                                                                        b5 = (B0)g0.a.e(this.G.t());
                                                                                                    }
                                                                                                    this.d0();
                                                                                                    f = b5.f;
                                                                                                    a = f.a;
                                                                                                    b6 = f.b;
                                                                                                    this.N = this.S(a, b6, f.c, b6, true, 0);
                                                                                                    while (true) {
                                                                                                        while (true) {
                                                                                                            Label_0996: {
                                                                                                                break Label_0996;
                                                                                                                Label_0683:
                                                                                                                o = 3004;
                                                                                                                break Label_0654;
                                                                                                                break Block_14;
                                                                                                                this.N = n;
                                                                                                                continue Label_0707_Outer;
                                                                                                                break Label_0690;
                                                                                                                d = k0.u.d(ex, o);
                                                                                                                g0.o.d("ExoPlayerImplInternal", "Playback error", d);
                                                                                                                this.t1(true, false);
                                                                                                                n = this.N.f(d);
                                                                                                                continue Label_0566_Outer;
                                                                                                                g0.o.i("ExoPlayerImplInternal", "Recoverable renderer error", g0);
                                                                                                                g2 = this.g0;
                                                                                                                break Block_23;
                                                                                                            }
                                                                                                            this.t1(true, false);
                                                                                                            n = this.N.f(g3);
                                                                                                            continue Label_0566_Outer;
                                                                                                        }
                                                                                                        o = 1004;
                                                                                                        continue Label_0783_Outer;
                                                                                                    }
                                                                                                }
                                                                                                u2 = this.G.u();
                                                                                                g0 = u;
                                                                                                break Block_19;
                                                                                            }
                                                                                            o = 3001;
                                                                                            continue Label_0783_Outer;
                                                                                            continue Block_15_Outer;
                                                                                        }
                                                                                        o = 3002;
                                                                                        continue Label_0783_Outer;
                                                                                        Label_0657: {
                                                                                            o = 3003;
                                                                                        }
                                                                                        continue Label_0783_Outer;
                                                                                    }
                                                                                    continue Block_21_Outer;
                                                                                }
                                                                                o = g0.o;
                                                                                continue Block_15_Outer;
                                                                            }
                                                                            g0.o.d("ExoPlayerImplInternal", "Playback error", g3);
                                                                            break Label_0913;
                                                                        }
                                                                        this.M(a2, o);
                                                                        continue Label_0707_Outer;
                                                                    }
                                                                    g0 = u.a(u2.f.a);
                                                                    Label_0750: {
                                                                        break Block_20;
                                                                    }
                                                                }
                                                                g2.addSuppressed(g0);
                                                                g0 = this.g0;
                                                                v = this.v;
                                                                v.d(v.g(25, g0));
                                                                continue Label_0707_Outer;
                                                            }
                                                            continue Label_0876_Outer;
                                                        }
                                                        break Block_26;
                                                        g4.addSuppressed(g0);
                                                        g3 = this.g0;
                                                        continue Label_0913_Outer;
                                                    }
                                                    this.M(ex2, o);
                                                    continue Label_0707_Outer;
                                                }
                                                Label_0850: {
                                                    g4 = this.g0;
                                                }
                                                g3 = g0;
                                                continue;
                                            }
                                            Label_0818: {
                                                this.g0 = g0;
                                            }
                                            continue Block_24_Outer;
                                        }
                                        this.G.b();
                                        continue Label_0913;
                                    }
                                }
                                // iftrue(Label_0876:, g4 == null)
                                catch (RuntimeException ex3) {}
                                catch (IOException ex4) {}
                                catch (x0.b b7) {}
                                catch (i0.h h) {}
                                catch (A a3) {}
                                catch (n.a a4) {}
                                catch (u u3) {}
                                u = u3;
                                continue;
                            }
                            b = false;
                            continue Label_0365_Outer;
                        }
                        b2 = false;
                        continue Label_0394_Outer;
                    }
                    b3 = false;
                    continue Label_0526_Outer;
                }
                b4 = false;
                continue;
            }
        }
    }
    
    public final void i0(final boolean b) {
        if (this.j0.a != -9223372036854775807L) {
            if (!b && this.N.a.equals(this.k0)) {
                return;
            }
            final I a = this.N.a;
            this.k0 = a;
            this.G.x(a);
        }
    }
    
    public void i1(final boolean b) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public void j(final C c) {
        this.v.g(16, c).a();
    }
    
    public final void j0() {
        final B0 u = this.G.u();
        if (u == null) {
            return;
        }
        final B0 k = u.k();
        final int n = 0;
        if (k == null || this.R) {
            int n2 = n;
            if (!u.f.i) {
                if (!this.R) {
                    return;
                }
                n2 = n;
            }
            while (true) {
                final Y0[] o = this.o;
                if (n2 >= o.length) {
                    break;
                }
                final Y0 y0 = o[n2];
                final Q q = u.c[n2];
                if (q != null && y0.i() == q && y0.p()) {
                    final long e = u.f.e;
                    long n3;
                    if (e != -9223372036854775807L && e != Long.MIN_VALUE) {
                        n3 = u.m() + u.f.e;
                    }
                    else {
                        n3 = -9223372036854775807L;
                    }
                    this.T0(y0, n3);
                }
                ++n2;
            }
            return;
        }
        if (!this.U()) {
            return;
        }
        if (!u.k().d && this.c0 < u.k().n()) {
            return;
        }
        final E p = u.p();
        final B0 c = this.G.c();
        final E p2 = c.p();
        final I a = this.N.a;
        this.A1(a, c.f.a, a, u.f.a, -9223372036854775807L, false);
        if (c.d && c.a.l() != -9223372036854775807L) {
            this.S0(c.n());
            if (!c.s()) {
                this.G.I(c);
                this.N(false);
                this.c0();
            }
            return;
        }
        for (int i = 0; i < this.o.length; ++i) {
            final boolean c2 = p.c(i);
            final boolean c3 = p2.c(i);
            if (c2 && !this.o[i].A()) {
                final boolean b = this.q[i].l() == -2;
                final b1 b2 = p.b[i];
                final b1 b3 = p2.b[i];
                if (!c3 || !b3.equals(b2) || b) {
                    this.T0(this.o[i], c.n());
                }
            }
        }
    }
    
    public final void j1(final boolean w) {
        this.W = w;
        if (!this.G.T(this.N.a, w)) {
            this.L0(true);
        }
        this.N(false);
    }
    
    public void k(final v v) {
        this.v.g(8, v).a();
    }
    
    public final void k0() {
        final B0 u = this.G.u();
        if (u != null && this.G.t() != u) {
            if (u.g) {
                return;
            }
            if (this.x0()) {
                this.y();
            }
        }
    }
    
    public final void k1(final T t) {
        this.O.b(1);
        this.O(this.H.D(t), false);
    }
    
    public final void l0() {
        this.O(this.H.i(), true);
    }
    
    public final void l1(final int n) {
        final U0 n2 = this.N;
        if (n2.e != n) {
            if (n != 2) {
                this.i0 = -9223372036854775807L;
            }
            this.N = n2.h(n);
        }
    }
    
    public final void m0(final c c) {
        this.O.b(1);
        throw null;
    }
    
    public final boolean m1() {
        final boolean o1 = this.o1();
        final boolean b = false;
        if (!o1) {
            return false;
        }
        if (this.R) {
            return false;
        }
        final B0 t = this.G.t();
        if (t == null) {
            return false;
        }
        final B0 k = t.k();
        boolean b2 = b;
        if (k != null) {
            b2 = b;
            if (this.c0 >= k.n()) {
                b2 = b;
                if (k.g) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public final void n0() {
        for (B0 b0 = this.G.t(); b0 != null; b0 = b0.k()) {
            final y[] c = b0.p().c;
            for (int length = c.length, i = 0; i < length; ++i) {
                final y y = c[i];
                if (y != null) {
                    y.t();
                }
            }
        }
    }
    
    public final boolean n1() {
        if (!this.W()) {
            return false;
        }
        final B0 m = this.G.m();
        final long k = this.K(m.l());
        long a;
        if (m == this.G.t()) {
            a = m.A(this.c0);
        }
        else {
            a = m.A(this.c0) - m.f.b;
        }
        long e;
        if (this.q1(this.N.a, m.f.a)) {
            e = this.I.e();
        }
        else {
            e = -9223372036854775807L;
        }
        final x0.a a2 = new x0.a(this.K, this.N.a, m.f.a, a, k, this.C.h().a, this.N.l, this.S, e);
        final boolean c = this.t.c(a2);
        final B0 t = this.G.t();
        boolean c2 = c;
        if (!c) {
            c2 = c;
            if (t.d) {
                c2 = c;
                if (k < 500000L) {
                    if (this.A <= 0L) {
                        c2 = c;
                        if (!this.B) {
                            return c2;
                        }
                    }
                    t.a.q(this.N.s, false);
                    c2 = this.t.c(a2);
                }
            }
        }
        return c2;
    }
    
    public final void o0(final boolean b) {
        for (B0 b2 = this.G.t(); b2 != null; b2 = b2.k()) {
            final y[] c = b2.p().c;
            for (int length = c.length, i = 0; i < length; ++i) {
                final y y = c[i];
                if (y != null) {
                    y.h(b);
                }
            }
        }
    }
    
    public final boolean o1() {
        final U0 n = this.N;
        return n.l && n.n == 0;
    }
    
    public final void p0() {
        for (B0 b0 = this.G.t(); b0 != null; b0 = b0.k()) {
            final y[] c = b0.p().c;
            for (int length = c.length, i = 0; i < length; ++i) {
                final y y = c[i];
                if (y != null) {
                    y.u();
                }
            }
        }
    }
    
    public final boolean p1(final boolean b) {
        if (this.a0 == 0) {
            return this.Y();
        }
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        if (!this.N.g) {
            return true;
        }
        final B0 t = this.G.t();
        long e;
        if (this.q1(this.N.a, t.f.a)) {
            e = this.I.e();
        }
        else {
            e = -9223372036854775807L;
        }
        final B0 m = this.G.m();
        final boolean b3 = m.s() && m.f.i;
        final boolean b4 = m.f.a.b() && !m.d;
        if (!b3 && !b4) {
            final boolean b5 = b2;
            if (!this.t.e(new x0.a(this.K, this.N.a, t.f.a, t.A(this.c0), this.J(), this.C.h().a, this.N.l, this.S, e))) {
                return b5;
            }
        }
        return true;
    }
    
    public final void q(final b b, final int n) {
        this.O.b(1);
        final T0 h = this.H;
        int r = n;
        if (n == -1) {
            r = h.r();
        }
        this.O(h.f(r, t0.b.b(b), t0.b.c(b)), false);
    }
    
    public void q0(final v v) {
        this.v.g(9, v).a();
    }
    
    public final boolean q1(final I i, final x.b b) {
        final boolean b2 = b.b();
        boolean b4;
        final boolean b3 = b4 = false;
        if (!b2) {
            if (i.q()) {
                return false;
            }
            i.n(i.h(b.a, this.z).c, this.y);
            b4 = b3;
            if (this.y.f()) {
                final I.c y = this.y;
                b4 = b3;
                if (y.i) {
                    b4 = b3;
                    if (y.f != -9223372036854775807L) {
                        b4 = true;
                    }
                }
            }
        }
        return b4;
    }
    
    public final void r() {
        final E p = this.G.t().p();
        for (int i = 0; i < this.o.length; ++i) {
            if (p.c(i)) {
                this.o[i].j();
            }
        }
    }
    
    public void r0() {
        this.v.k(29).a();
    }
    
    public final void r1() {
        final B0 t = this.G.t();
        if (t == null) {
            return;
        }
        final E p = t.p();
        for (int i = 0; i < this.o.length; ++i) {
            if (p.c(i) && this.o[i].getState() == 1) {
                this.o[i].start();
            }
        }
    }
    
    public final void s() {
        this.z0();
    }
    
    public final void s0() {
        this.O.b(1);
        this.A0(false, false, false, true);
        this.t.a(this.K);
        int n;
        if (this.N.a.q()) {
            n = 4;
        }
        else {
            n = 2;
        }
        this.l1(n);
        this.H.w(this.u.a());
        this.v.c(2);
    }
    
    public void s1() {
        this.v.k(6).a();
    }
    
    public final B0 t(final C0 c0, final long n) {
        return new B0(this.q, n, this.r, this.t.i(), this.H, c0, this.s);
    }
    
    public boolean t0() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0070: {
            try {
                if (!this.P) {
                    if (this.x.getThread().isAlive()) {
                        this.v.c(7);
                        this.D1(new q0(this), this.J);
                        // monitorexit(this)
                        return this.P;
                    }
                }
            }
            finally {
                break Label_0070;
            }
            return true;
        }
    }
    // monitorexit(this)
    
    public final void t1(final boolean b, final boolean b2) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public final void u(final V0 v0) {
        if (v0.j()) {
            return;
        }
        try {
            v0.g().t(v0.i(), v0.e());
        }
        finally {
            v0.k(true);
        }
    }
    
    public final void u0() {
        try {
            this.A0(true, false, true, false);
            this.v0();
            this.t.d(this.K);
            this.l1(1);
            final HandlerThread w = this.w;
            if (w != null) {
                w.quit();
            }
            synchronized (this) {
                this.P = true;
                this.notifyAll();
            }
        }
        finally {
            final HandlerThread w2 = this.w;
            if (w2 != null) {
                w2.quit();
            }
            synchronized (this) {
                this.P = true;
                this.notifyAll();
            }
        }
    }
    
    public final void u1() {
        this.C.f();
        final Y0[] o = this.o;
        for (int length = o.length, i = 0; i < length; ++i) {
            final Y0 y0 = o[i];
            if (X(y0)) {
                this.A(y0);
            }
        }
    }
    
    public final void v(final Y0 y0) {
        if (!X(y0)) {
            return;
        }
        this.C.a(y0);
        this.A(y0);
        y0.g();
        --this.a0;
    }
    
    public final void v0() {
        for (int i = 0; i < this.o.length; ++i) {
            this.q[i].o();
            this.o[i].release();
        }
    }
    
    public final void v1() {
        final B0 m = this.G.m();
        final boolean b = this.U || (m != null && m.a.b());
        final U0 n = this.N;
        if (b != n.g) {
            this.N = n.b(b);
        }
    }
    
    public final void w() {
        final long d = this.E.d();
        this.v.f(2);
        this.y1();
        final int e = this.N.e;
        final boolean b = true;
        if (e != 1) {
            if (e == 4) {
                return;
            }
            final B0 t = this.G.t();
            if (t == null) {
                this.J0(d);
                return;
            }
            g0.F.a("doSomeWork");
            this.z1();
            boolean b4;
            boolean b5;
            if (t.d) {
                this.d0 = g0.M.J0(this.E.b());
                t.a.q(this.N.s - this.A, this.B);
                boolean b3;
                boolean b2 = b3 = true;
                int n = 0;
                while (true) {
                    final Y0[] o = this.o;
                    b4 = b2;
                    b5 = b3;
                    if (n >= o.length) {
                        break;
                    }
                    final Y0 y0 = o[n];
                    boolean b6;
                    boolean b7;
                    if (!X(y0)) {
                        b6 = b2;
                        b7 = b3;
                    }
                    else {
                        y0.f(this.c0, this.d0);
                        final boolean b8 = b2 && y0.c();
                        final boolean b9 = t.c[n] != y0.i();
                        final boolean b10 = !b9 && y0.p();
                        final boolean b11 = b9 || b10 || y0.e() || y0.c();
                        final boolean b12 = b3 && b11;
                        b6 = b8;
                        b7 = b12;
                        if (!b11) {
                            y0.v();
                            b7 = b12;
                            b6 = b8;
                        }
                    }
                    ++n;
                    b2 = b6;
                    b3 = b7;
                }
            }
            else {
                t.a.p();
                b4 = (b5 = true);
            }
            final long e2 = t.f.e;
            final boolean b13 = b4 && t.d && (e2 == -9223372036854775807L || e2 <= this.N.s);
            if (b13 && this.R) {
                this.b1(this.R = false, this.N.n, false, 5);
            }
            Label_0618: {
                if (b13 && t.f.i) {
                    this.l1(4);
                }
                else if (this.N.e == 2 && this.p1(b5)) {
                    this.l1(3);
                    this.g0 = null;
                    if (this.o1()) {
                        this.B1(false, false);
                        this.C.e();
                        this.r1();
                    }
                    break Label_0618;
                }
                else {
                    if (this.N.e != 3) {
                        break Label_0618;
                    }
                    if (this.a0 == 0) {
                        if (this.Y()) {
                            break Label_0618;
                        }
                    }
                    else if (b5) {
                        break Label_0618;
                    }
                    this.B1(this.o1(), false);
                    this.l1(2);
                    if (this.S) {
                        this.p0();
                        this.I.a();
                    }
                }
                this.u1();
            }
            Label_0800: {
                while (true) {
                    Label_0792: {
                        if (this.N.e != 2) {
                            break Label_0792;
                        }
                        int n2 = 0;
                        while (true) {
                            final Y0[] o2 = this.o;
                            if (n2 >= o2.length) {
                                break;
                            }
                            if (X(o2[n2]) && this.o[n2].i() == t.c[n2]) {
                                this.o[n2].v();
                            }
                            ++n2;
                        }
                        final U0 n3 = this.N;
                        if (n3.g || n3.r >= 500000L || !this.W()) {
                            break Label_0792;
                        }
                        long b14;
                        if (this.i0 == -9223372036854775807L) {
                            b14 = this.E.b();
                        }
                        else {
                            if (this.E.b() - this.i0 < 4000L) {
                                break Label_0800;
                            }
                            throw new IllegalStateException("Playback stuck buffering and not loading");
                        }
                        this.i0 = b14;
                        break Label_0800;
                    }
                    long b14 = -9223372036854775807L;
                    continue;
                }
            }
            final boolean b15 = this.o1() && this.N.e == 3;
            final boolean b16 = this.Z && this.Y && b15 && b;
            final U0 n4 = this.N;
            if (n4.p != b16) {
                this.N = n4.i(b16);
            }
            this.Y = false;
            if (!b16) {
                final int e3 = this.N.e;
                if (e3 != 4) {
                    if (b15 || e3 == 2 || (e3 == 3 && this.a0 != 0)) {
                        this.J0(d);
                    }
                }
            }
            g0.F.b();
        }
    }
    
    public final void w0(final int n, final int n2, final T t) {
        this.O.b(1);
        this.O(this.H.A(n, n2, t), false);
    }
    
    public final void w1(final x.b b, final Z z, final E e) {
        this.t.b(this.K, this.N.a, b, this.o, z, e.c);
    }
    
    public final void x(final int n, final boolean b, final long n2) {
        final Y0 y0 = this.o[n];
        if (X(y0)) {
            return;
        }
        final B0 u = this.G.u();
        final boolean b2 = u == this.G.t();
        final E p3 = u.p();
        final b1 b3 = p3.b[n];
        final q[] e = E(p3.c[n]);
        final boolean b4 = this.o1() && this.N.e == 3;
        final boolean b5 = !b && b4;
        ++this.a0;
        this.p.add(y0);
        y0.C(b3, e, u.c[n], this.c0, b5, b2, n2, u.m(), u.f.a);
        ((V0.b)y0).t(11, new Y0.a() {
            @Override
            public void a() {
                t0.i(t0.this, true);
            }
            
            @Override
            public void b() {
                if (t0.l(t0.this) || t0.n(t0.this)) {
                    t0.p(t0.this).c(2);
                }
            }
        });
        this.C.b(y0);
        if (b4 && b2) {
            y0.start();
        }
    }
    
    public final boolean x0() {
        final B0 u = this.G.u();
        final E p = u.p();
        int n2;
        int n = n2 = 0;
        while (true) {
            final Y0[] o = this.o;
            if (n >= o.length) {
                break;
            }
            final Y0 y0 = o[n];
            int n3;
            if (!X(y0)) {
                n3 = n2;
            }
            else {
                final boolean b = y0.i() != u.c[n];
                if (p.c(n) && !b) {
                    n3 = n2;
                }
                else if (!y0.A()) {
                    y0.F(E(p.c[n]), u.c[n], u.n(), u.m(), u.f.a);
                    n3 = n2;
                    if (this.Z) {
                        this.Y0(false);
                        n3 = n2;
                    }
                }
                else if (y0.c()) {
                    this.v(y0);
                    n3 = n2;
                }
                else {
                    n3 = 1;
                }
            }
            ++n;
            n2 = n3;
        }
        return (n2 ^ 0x1) != 0x0;
    }
    
    public final void x1(final int n, final int n2, final List list) {
        this.O.b(1);
        this.O(this.H.E(n, n2, list), false);
    }
    
    public final void y() {
        this.z(new boolean[this.o.length], this.G.u().n());
    }
    
    public final void y0() {
        final float a = this.C.h().a;
        B0 b0 = this.G.t();
        final B0 u = this.G.u();
        Object o = null;
        int n = 1;
        while (b0 != null) {
            if (!b0.d) {
                return;
            }
            final E x = b0.x(a, this.N.a);
            if (b0 == this.G.t()) {
                o = x;
            }
            if (!x.a(b0.p())) {
                final E0 g = this.G;
                if (n != 0) {
                    final B0 t = g.t();
                    final boolean i = this.G.I(t);
                    final boolean[] array = new boolean[this.o.length];
                    final long b2 = t.b((E)g0.a.e(o), this.N.s, i, array);
                    final U0 n2 = this.N;
                    final boolean b3 = n2.e != 4 && b2 != n2.s;
                    final U0 n3 = this.N;
                    this.N = this.S(n3.b, b2, n3.c, n3.d, b3, 5);
                    if (b3) {
                        this.C0(b2);
                    }
                    final boolean[] array2 = new boolean[this.o.length];
                    int n4 = 0;
                    while (true) {
                        final Y0[] o2 = this.o;
                        if (n4 >= o2.length) {
                            break;
                        }
                        final Y0 y0 = o2[n4];
                        final boolean x2 = X(y0);
                        array2[n4] = x2;
                        final Q q = t.c[n4];
                        if (x2) {
                            if (q != y0.i()) {
                                this.v(y0);
                            }
                            else if (array[n4]) {
                                y0.z(this.c0);
                            }
                        }
                        ++n4;
                    }
                    this.z(array2, this.c0);
                }
                else {
                    g.I(b0);
                    if (b0.d) {
                        b0.a(x, Math.max(b0.f.b, b0.A(this.c0)), false);
                    }
                }
                this.N(true);
                if (this.N.e != 4) {
                    this.c0();
                    this.z1();
                    this.v.c(2);
                }
                return;
            }
            if (b0 == u) {
                n = 0;
            }
            b0 = b0.k();
        }
    }
    
    public final void y1() {
        if (!this.N.a.q()) {
            if (!this.H.t()) {
                return;
            }
            final boolean f0 = this.f0();
            this.j0();
            this.k0();
            this.h0();
            this.i0(f0);
        }
    }
    
    public final void z(final boolean[] array, final long n) {
        final B0 u = this.G.u();
        final E p2 = u.p();
        final int n2 = 0;
        int n3 = 0;
        int i;
        while (true) {
            i = n2;
            if (n3 >= this.o.length) {
                break;
            }
            if (!p2.c(n3) && this.p.remove(this.o[n3])) {
                this.o[n3].b();
            }
            ++n3;
        }
        while (i < this.o.length) {
            if (p2.c(i)) {
                this.x(i, array[i], n);
            }
            ++i;
        }
        u.g = true;
    }
    
    public final void z0() {
        this.y0();
        this.L0(true);
    }
    
    public final void z1() {
        final B0 t = this.G.t();
        if (t == null) {
            return;
        }
        long l;
        if (t.d) {
            l = t.a.l();
        }
        else {
            l = -9223372036854775807L;
        }
        Label_0261: {
            x.b b;
            boolean b2;
            int n2;
            long a;
            long c2;
            if (l != -9223372036854775807L) {
                if (!t.s()) {
                    this.G.I(t);
                    this.N(false);
                    this.c0();
                }
                this.C0(l);
                if (l == this.N.s) {
                    break Label_0261;
                }
                final U0 n = this.N;
                b = n.b;
                final long c = n.c;
                b2 = true;
                n2 = 5;
                a = l;
                c2 = c;
            }
            else {
                final long g = this.C.g(t != this.G.u());
                this.c0 = g;
                a = t.A(g);
                this.e0(this.N.s, a);
                if (!this.C.r()) {
                    this.N.o(a);
                    break Label_0261;
                }
                b2 = (this.O.d ^ true);
                final U0 n3 = this.N;
                b = n3.b;
                c2 = n3.c;
                n2 = 6;
            }
            this.N = this.S(b, a, c2, a, b2, n2);
        }
        this.N.q = this.G.m().j();
        this.N.r = this.J();
        final U0 n4 = this.N;
        if (n4.l && n4.e == 3 && this.q1(n4.a, n4.b) && this.N.o.a == 1.0f) {
            final float c3 = this.I.c(this.D(), this.J());
            if (this.C.h().a != c3) {
                this.V0(this.N.o.b(c3));
                this.Q(this.N.o, this.C.h().a, false, false);
            }
        }
    }
    
    public static final class b
    {
        public final List a;
        public final T b;
        public final int c;
        public final long d;
        
        public b(final List a, final T b, final int c, final long d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public static /* synthetic */ int a(final b b) {
            return b.c;
        }
        
        public static /* synthetic */ List b(final b b) {
            return b.a;
        }
        
        public static /* synthetic */ T c(final b b) {
            return b.b;
        }
        
        public static /* synthetic */ long d(final b b) {
            return b.d;
        }
    }
    
    public abstract static class c
    {
    }
    
    public static final class d implements Comparable
    {
        public final V0 o;
        public int p;
        public long q;
        public Object r;
        
        public d(final V0 o) {
            this.o = o;
        }
        
        public int c(final d d) {
            final Object r = this.r;
            final boolean b = true;
            if (r == null != (d.r == null)) {
                int n = b ? 1 : 0;
                if (r != null) {
                    n = -1;
                }
                return n;
            }
            if (r == null) {
                return 0;
            }
            final int n2 = this.p - d.p;
            if (n2 != 0) {
                return n2;
            }
            return g0.M.n(this.q, d.q);
        }
        
        public void e(final int p3, final long q, final Object r) {
            this.p = p3;
            this.q = q;
            this.r = r;
        }
    }
    
    public static final class e
    {
        public boolean a;
        public U0 b;
        public int c;
        public boolean d;
        public int e;
        
        public e(final U0 b) {
            this.b = b;
        }
        
        public static /* synthetic */ boolean a(final e e) {
            return e.a;
        }
        
        public void b(final int n) {
            this.a |= (n > 0);
            this.c += n;
        }
        
        public void c(final U0 b) {
            this.a |= (this.b != b);
            this.b = b;
        }
        
        public void d(final int e) {
            final boolean d = this.d;
            boolean b = true;
            if (d && this.e != 5) {
                if (e != 5) {
                    b = false;
                }
                g0.a.a(b);
                return;
            }
            this.a = true;
            this.d = true;
            this.e = e;
        }
    }
    
    public interface f
    {
        void a(final e p0);
    }
    
    public static final class g
    {
        public final x.b a;
        public final long b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        
        public g(final x.b a, final long b, final long c, final boolean d, final boolean e, final boolean f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
    }
    
    public static final class h
    {
        public final I a;
        public final int b;
        public final long c;
        
        public h(final I a, final int b, final long c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
