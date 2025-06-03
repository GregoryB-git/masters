// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l0;

import d0.C;
import java.util.List;
import d0.K;
import d0.P;
import android.media.metrics.TrackChangeEvent$Builder;
import d0.l;
import d0.D;
import x0.x;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.util.Pair;
import android.media.MediaCodec$CryptoException;
import t0.o;
import t0.w;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import android.system.OsConstants;
import android.system.ErrnoException;
import java.io.FileNotFoundException;
import i0.p;
import p0.h;
import p0.T;
import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import android.media.MediaDrmResetException;
import android.media.MediaDrm$MediaDrmStateException;
import g0.M;
import p0.n;
import i0.z;
import i0.r;
import d0.A;
import i0.s;
import i0.t;
import java.io.IOException;
import g0.a;
import k0.u;
import java.util.UUID;
import d0.g;
import X2.g0;
import d0.L;
import d0.m;
import X2.v;
import android.os.SystemClock;
import d0.q;
import d0.B;
import android.media.metrics.PlaybackMetrics$Builder;
import java.util.HashMap;
import d0.I;
import android.media.metrics.PlaybackSession;
import android.content.Context;

public final class w1 implements c, x1.a
{
    public boolean A;
    public final Context a;
    public final x1 b;
    public final PlaybackSession c;
    public final long d;
    public final I.c e;
    public final I.b f;
    public final HashMap g;
    public final HashMap h;
    public String i;
    public PlaybackMetrics$Builder j;
    public int k;
    public int l;
    public int m;
    public B n;
    public b o;
    public b p;
    public b q;
    public q r;
    public q s;
    public q t;
    public boolean u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public int z;
    
    public w1(final Context context, final PlaybackSession c) {
        this.a = context.getApplicationContext();
        this.c = c;
        this.e = new I.c();
        this.f = new I.b();
        this.h = new HashMap();
        this.g = new HashMap();
        this.d = SystemClock.elapsedRealtime();
        this.l = 0;
        this.m = 0;
        (this.b = new u0()).a((x1.a)this);
    }
    
    public static m A0(final v v) {
        final g0 q = v.q();
        while (q.hasNext()) {
            final L.a a = q.next();
            for (int i = 0; i < a.a; ++i) {
                if (a.e(i)) {
                    final m r = a.b(i).r;
                    if (r != null) {
                        return r;
                    }
                }
            }
        }
        return null;
    }
    
    public static int B0(final m m) {
        for (int i = 0; i < m.r; ++i) {
            final UUID p = m.e(i).p;
            if (p.equals(g.d)) {
                return 3;
            }
            if (p.equals(g.e)) {
                return 2;
            }
            if (p.equals(g.c)) {
                return 6;
            }
        }
        return 1;
    }
    
    public static a C0(final B b, final Context context, final boolean b2) {
        if (b.o == 1001) {
            return new a(20, 0);
        }
        int b4;
        int n;
        if (b instanceof u) {
            final u u = (u)b;
            final boolean b3 = u.x == 1;
            b4 = u.B;
            n = (b3 ? 1 : 0);
        }
        else {
            n = (b4 = 0);
        }
        final Throwable t = (Throwable)g0.a.e(b.getCause());
        if (t instanceof IOException) {
            if (t instanceof t) {
                return new a(5, ((t)t).r);
            }
            if (t instanceof s || t instanceof A) {
                int n2;
                if (b2) {
                    n2 = 10;
                }
                else {
                    n2 = 11;
                }
                return new a(n2, 0);
            }
            if (!(t instanceof r) && !(t instanceof z.a)) {
                if (b.o == 1002) {
                    return new a(21, 0);
                }
                if (t instanceof n.a) {
                    final Throwable t2 = (Throwable)g0.a.e(t.getCause());
                    final int a = M.a;
                    if (a >= 21 && t2 instanceof MediaDrm$MediaDrmStateException) {
                        final int x = M.X(((MediaDrm$MediaDrmStateException)t2).getDiagnosticInfo());
                        return new a(z0(x), x);
                    }
                    if (a >= 23 && t2 instanceof MediaDrmResetException) {
                        return new a(27, 0);
                    }
                    if (t2 instanceof NotProvisionedException) {
                        return new a(24, 0);
                    }
                    if (t2 instanceof DeniedByServerException) {
                        return new a(29, 0);
                    }
                    if (t2 instanceof T) {
                        return new a(23, 0);
                    }
                    if (t2 instanceof h.e) {
                        return new a(28, 0);
                    }
                    return new a(30, 0);
                }
                else {
                    if (!(t instanceof p.b) || !(t.getCause() instanceof FileNotFoundException)) {
                        return new a(9, 0);
                    }
                    final Throwable cause = ((Throwable)g0.a.e(t.getCause())).getCause();
                    if (M.a >= 21 && cause instanceof ErrnoException && ((ErrnoException)cause).errno == OsConstants.EACCES) {
                        return new a(32, 0);
                    }
                    return new a(31, 0);
                }
            }
            else {
                if (g0.t.d(context).f() == 1) {
                    return new a(3, 0);
                }
                final Throwable cause2 = t.getCause();
                if (cause2 instanceof UnknownHostException) {
                    return new a(6, 0);
                }
                if (cause2 instanceof SocketTimeoutException) {
                    return new a(7, 0);
                }
                if (t instanceof r && ((t)t).q == 1) {
                    return new a(4, 0);
                }
                return new a(8, 0);
            }
        }
        else {
            if (n && (b4 == 0 || b4 == 1)) {
                return new a(35, 0);
            }
            if (n && b4 == 3) {
                return new a(15, 0);
            }
            if (n && b4 == 2) {
                return new a(23, 0);
            }
            if (t instanceof w.d) {
                return new a(13, M.X(((w.d)t).r));
            }
            if (t instanceof o) {
                return new a(14, ((o)t).q);
            }
            if (t instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (t instanceof m0.z.c) {
                return new a(17, ((m0.z.c)t).o);
            }
            if (t instanceof m0.z.f) {
                return new a(18, ((m0.z.f)t).o);
            }
            if (t instanceof MediaCodec$CryptoException) {
                final int errorCode = ((MediaCodec$CryptoException)t).getErrorCode();
                return new a(z0(errorCode), errorCode);
            }
            return new a(22, 0);
        }
    }
    
    public static Pair D0(String s) {
        final String[] b1 = M.b1(s, "-");
        final String s2 = b1[0];
        if (b1.length >= 2) {
            s = b1[1];
        }
        else {
            s = null;
        }
        return Pair.create((Object)s2, (Object)s);
    }
    
    public static int F0(final Context context) {
        switch (g0.t.d(context).f()) {
            default: {
                return 1;
            }
            case 10: {
                return 7;
            }
            case 9: {
                return 8;
            }
            case 7: {
                return 3;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 2;
            }
            case 1: {
                return 9;
            }
            case 0: {
                return 0;
            }
        }
    }
    
    public static int G0(final d0.u u) {
        final d0.u.h b = u.b;
        if (b == null) {
            return 0;
        }
        final int u2 = M.u0(b.a, b.b);
        if (u2 == 0) {
            return 3;
        }
        if (u2 == 1) {
            return 5;
        }
        if (u2 != 2) {
            return 1;
        }
        return 4;
    }
    
    public static int H0(final int n) {
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 1;
        }
        return 4;
    }
    
    public static w1 x0(final Context context) {
        final MediaMetricsManager a = r1.a(context.getSystemService("media_metrics"));
        if (a == null) {
            return null;
        }
        return new w1(context, s1.a(a));
    }
    
    public static int z0(final int n) {
        switch (M.W(n)) {
            default: {
                return 27;
            }
            case 6005: {
                return 26;
            }
            case 6004: {
                return 25;
            }
            case 6003: {
                return 28;
            }
            case 6002: {
                return 24;
            }
        }
    }
    
    public LogSessionId E0() {
        return m1.a(this.c);
    }
    
    public final void I0(final c.b b) {
        for (int i = 0; i < b.d(); ++i) {
            final int b2 = b.b(i);
            final c.a c = b.c(b2);
            if (b2 == 0) {
                this.b.c(c);
            }
            else if (b2 == 11) {
                this.b.e(c, this.k);
            }
            else {
                this.b.f(c);
            }
        }
    }
    
    public final void J0(final long n) {
        final int f0 = F0(this.a);
        if (f0 != this.m) {
            this.m = f0;
            N0.a(this.c, M0.a(L0.a(K0.a(G0.a(), f0), n - this.d)));
        }
    }
    
    @Override
    public void K(final c.a a, final x0.u u) {
        if (a.d == null) {
            return;
        }
        final b o = new b((q)a.e(u.c), u.d, this.b.b(a.b, (x.b)a.e(a.d)));
        final int b = u.b;
        if (b != 0) {
            if (b == 1) {
                this.p = o;
                return;
            }
            if (b != 2) {
                if (b != 3) {
                    return;
                }
                this.q = o;
                return;
            }
        }
        this.o = o;
    }
    
    public final void K0(final long n) {
        final B n2 = this.n;
        if (n2 == null) {
            return;
        }
        final a c0 = C0(n2, this.a, this.v == 4);
        Y0.a(this.c, X0.a(W0.a(V0.a(U0.a(T0.a(c1.a(), n - this.d), c0.a), c0.b), (Exception)n2)));
        this.A = true;
        this.n = null;
    }
    
    @Override
    public void L(final c.a a, final B n) {
        this.n = n;
    }
    
    public final void L0(final D d, final c.b b, final long n) {
        if (d.f() != 2) {
            this.u = false;
        }
        if (d.m() == null) {
            this.w = false;
        }
        else if (b.a(10)) {
            this.w = true;
        }
        final int t0 = this.T0(d);
        if (this.l != t0) {
            this.l = t0;
            this.A = true;
            l1.a(this.c, k1.a(j1.a(i1.a(n1.a(), this.l), n - this.d)));
        }
    }
    
    public final void M0(final D d, final c.b b, final long n) {
        if (b.a(2)) {
            final L z = d.z();
            final boolean b2 = z.b(2);
            final boolean b3 = z.b(1);
            final boolean b4 = z.b(3);
            if (b2 || b3 || b4) {
                if (!b2) {
                    this.R0(n, null, 0);
                }
                if (!b3) {
                    this.N0(n, null, 0);
                }
                if (!b4) {
                    this.P0(n, null, 0);
                }
            }
        }
        if (this.w0(this.o)) {
            final b o = this.o;
            final q a = o.a;
            if (a.u != -1) {
                this.R0(n, a, o.b);
                this.o = null;
            }
        }
        if (this.w0(this.p)) {
            final b p3 = this.p;
            this.N0(n, p3.a, p3.b);
            this.p = null;
        }
        if (this.w0(this.q)) {
            final b q = this.q;
            this.P0(n, q.a, q.b);
            this.q = null;
        }
    }
    
    public final void N0(final long n, final q s, final int n2) {
        if (M.c(this.s, s)) {
            return;
        }
        int n3 = n2;
        if (this.s == null && (n3 = n2) == 0) {
            n3 = 1;
        }
        this.S0(0, n, this.s = s, n3);
    }
    
    @Override
    public void O(final D d, final c.b b) {
        if (b.d() == 0) {
            return;
        }
        this.I0(b);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.O0(d, b);
        this.K0(elapsedRealtime);
        this.M0(d, b, elapsedRealtime);
        this.J0(elapsedRealtime);
        this.L0(d, b, elapsedRealtime);
        if (b.a(1028)) {
            this.b.g(b.c(1028));
        }
    }
    
    public final void O0(final D d, final c.b b) {
        if (b.a(0)) {
            final c.a c = b.c(0);
            if (this.j != null) {
                this.Q0(c.b, c.d);
            }
        }
        if (b.a(2) && this.j != null) {
            final m a0 = A0(d.z().a());
            if (a0 != null) {
                P0.a(O0.a(M.i(this.j)), B0(a0));
            }
        }
        if (b.a(1011)) {
            ++this.z;
        }
    }
    
    public final void P0(final long n, final q t, final int n2) {
        if (M.c(this.t, t)) {
            return;
        }
        int n3 = n2;
        if (this.t == null && (n3 = n2) == 0) {
            n3 = 1;
        }
        this.S0(2, n, this.t = t, n3);
    }
    
    public final void Q0(final I i, final x.b b) {
        final PlaybackMetrics$Builder j = this.j;
        if (b == null) {
            return;
        }
        final int b2 = i.b(b.a);
        if (b2 == -1) {
            return;
        }
        i.f(b2, this.f);
        i.n(this.f.c, this.e);
        o1.a(j, G0(this.e.c));
        final I.c e = this.e;
        if (e.m != -9223372036854775807L && !e.k && !e.i && !e.f()) {
            p1.a(j, this.e.d());
        }
        int n;
        if (this.e.f()) {
            n = 2;
        }
        else {
            n = 1;
        }
        q1.a(j, n);
        this.A = true;
    }
    
    public final void R0(final long n, final q r, final int n2) {
        if (M.c(this.r, r)) {
            return;
        }
        int n3 = n2;
        if (this.r == null && (n3 = n2) == 0) {
            n3 = 1;
        }
        this.S0(1, n, this.r = r, n3);
    }
    
    public final void S0(int n, final long n2, final q q, final int n3) {
        final TrackChangeEvent$Builder a = t1.a(v0.a(n), n2 - this.d);
        if (q != null) {
            y0.a(a, 1);
            B0.a(a, H0(n3));
            final String m = q.m;
            if (m != null) {
                C0.a(a, m);
            }
            final String n4 = q.n;
            if (n4 != null) {
                D0.a(a, n4);
            }
            final String j = q.j;
            if (j != null) {
                E0.a(a, j);
            }
            n = q.i;
            if (n != -1) {
                F0.a(a, n);
            }
            n = q.t;
            if (n != -1) {
                H0.a(a, n);
            }
            n = q.u;
            if (n != -1) {
                I0.a(a, n);
            }
            n = q.B;
            if (n != -1) {
                J0.a(a, n);
            }
            n = q.C;
            if (n != -1) {
                u1.a(a, n);
            }
            final String d = q.d;
            if (d != null) {
                final Pair d2 = D0(d);
                v1.a(a, (String)d2.first);
                final Object second = d2.second;
                if (second != null) {
                    w0.a(a, (String)second);
                }
            }
            final float v = q.v;
            if (v != -1.0f) {
                x0.a(a, v);
            }
        }
        else {
            y0.a(a, 0);
        }
        this.A = true;
        A0.a(this.c, z0.a(a));
    }
    
    @Override
    public void T(final c.a a, final P p2) {
        final b o = this.o;
        if (o != null) {
            final q a2 = o.a;
            if (a2.u == -1) {
                this.o = new b(a2.a().v0(p2.a).Y(p2.b).K(), o.b, o.c);
            }
        }
    }
    
    public final int T0(final D d) {
        final int f = d.f();
        if (this.u) {
            return 5;
        }
        if (this.w) {
            return 13;
        }
        if (f == 4) {
            return 11;
        }
        if (f == 2) {
            final int l = this.l;
            if (l == 0 || l == 2) {
                return 2;
            }
            if (l == 12) {
                return 2;
            }
            if (!d.u()) {
                return 7;
            }
            if (d.J() != 0) {
                return 10;
            }
            return 6;
        }
        else {
            int n = 3;
            if (f == 3) {
                if (!d.u()) {
                    return 4;
                }
                if (d.J() != 0) {
                    n = 9;
                }
                return n;
            }
            else {
                if (f == 1 && this.l != 0) {
                    return 12;
                }
                return this.l;
            }
        }
    }
    
    @Override
    public void U(final c.a a, final String s, final String s2) {
    }
    
    @Override
    public void X(final c.a a, final int n, long longValue, long longValue2) {
        final x.b d = a.d;
        if (d != null) {
            final String b = this.b.b(a.b, (x.b)a.e(d));
            final Long n2 = this.h.get(b);
            final Long n3 = this.g.get(b);
            final HashMap h = this.h;
            final long n4 = 0L;
            if (n2 == null) {
                longValue2 = 0L;
            }
            else {
                longValue2 = n2;
            }
            h.put(b, longValue2 + longValue);
            final HashMap g = this.g;
            if (n3 == null) {
                longValue = n4;
            }
            else {
                longValue = n3;
            }
            g.put(b, longValue + n);
        }
    }
    
    @Override
    public void b0(final c.a a, final String i) {
        final x.b d = a.d;
        if (d != null && d.b()) {
            return;
        }
        this.y0();
        this.i = i;
        this.j = S0.a(Q0.a(R0.a(), "AndroidXMedia3"), "1.4.1");
        this.Q0(a.b, a.d);
    }
    
    @Override
    public void f(final c.a a, final String s, final boolean b) {
        final x.b d = a.d;
        if (d == null || !d.b()) {
            if (s.equals(this.i)) {
                this.y0();
            }
        }
        this.g.remove(s);
        this.h.remove(s);
    }
    
    @Override
    public void g(final c.a a, final k0.o o) {
        this.x += o.g;
        this.y += o.e;
    }
    
    @Override
    public void k0(final c.a a, final D.e e, final D.e e2, final int k) {
        if (k == 1) {
            this.u = true;
        }
        this.k = k;
    }
    
    @Override
    public void m(final c.a a, final x0.r r, final x0.u u, final IOException ex, final boolean b) {
        this.v = u.a;
    }
    
    @Override
    public void p0(final c.a a, final String s) {
    }
    
    public final boolean w0(final b b) {
        return b != null && b.c.equals(this.b.d());
    }
    
    public final void y0() {
        final PlaybackMetrics$Builder j = this.j;
        if (j != null && this.A) {
            Z0.a(j, this.z);
            a1.a(this.j, this.x);
            b1.a(this.j, this.y);
            final Long n = this.g.get(this.i);
            final PlaybackMetrics$Builder i = this.j;
            long longValue;
            if (n == null) {
                longValue = 0L;
            }
            else {
                longValue = n;
            }
            d1.a(i, longValue);
            final Long n2 = this.h.get(this.i);
            final PlaybackMetrics$Builder k = this.j;
            long longValue2;
            if (n2 == null) {
                longValue2 = 0L;
            }
            else {
                longValue2 = n2;
            }
            e1.a(k, longValue2);
            final PlaybackMetrics$Builder l = this.j;
            int n3;
            if (n2 != null && n2 > 0L) {
                n3 = 1;
            }
            else {
                n3 = 0;
            }
            f1.a(l, n3);
            h1.a(this.c, g1.a(this.j));
        }
        this.j = null;
        this.i = null;
        this.z = 0;
        this.x = 0;
        this.y = 0;
        this.r = null;
        this.s = null;
        this.t = null;
        this.A = false;
    }
    
    public static final class a
    {
        public final int a;
        public final int b;
        
        public a(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class b
    {
        public final q a;
        public final int b;
        public final String c;
        
        public b(final q a, final int b, final String c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
