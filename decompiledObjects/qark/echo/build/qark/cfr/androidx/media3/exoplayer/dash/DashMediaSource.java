/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  android.util.SparseArray
 *  java.io.BufferedReader
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.math.RoundingMode
 *  java.nio.charset.Charset
 *  java.text.ParseException
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.TimeZone
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package androidx.media3.exoplayer.dash;

import B0.m;
import B0.n;
import B0.o;
import B0.p;
import C0.a;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.c;
import androidx.media3.exoplayer.dash.d;
import d0.A;
import d0.I;
import d0.u;
import d0.v;
import g0.M;
import g0.o;
import i0.g;
import i0.k;
import i0.y;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l0.y1;
import o0.j;
import o0.l;
import p0.v;
import x0.E;
import x0.r;
import x0.x;

public final class DashMediaSource
extends x0.a {
    public n A;
    public y B;
    public IOException C;
    public Handler D;
    public u.g E;
    public Uri F;
    public Uri G;
    public o0.c H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public u P;
    public final boolean h;
    public final g.a i;
    public final a.a j;
    public final x0.j k;
    public final p0.x l;
    public final m m;
    public final n0.b n;
    public final long o;
    public final long p;
    public final E.a q;
    public final p.a r;
    public final e s;
    public final Object t;
    public final SparseArray u;
    public final Runnable v;
    public final Runnable w;
    public final d.b x;
    public final B0.o y;
    public i0.g z;

    static {
        v.a("media3.exoplayer.dash");
    }

    public DashMediaSource(u u8, o0.c c8, g.a a8, p.a a9, a.a a10, x0.j j8, B0.f f8, p0.x x8, m m8, long l8, long l9) {
        this.P = u8;
        this.E = u8.d;
        this.F = ((u.h)g0.a.e((Object)u8.b)).a;
        this.G = u8.b.a;
        this.H = c8;
        this.i = a8;
        this.r = a9;
        this.j = a10;
        this.l = x8;
        this.m = m8;
        this.o = l8;
        this.p = l9;
        this.k = j8;
        this.n = new n0.b();
        boolean bl = c8 != null;
        this.h = bl;
        this.q = this.u(null);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new c(null);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        if (bl) {
            g0.a.f(true ^ c8.d);
            this.s = null;
            this.v = null;
            this.w = null;
            this.y = new o.a();
            return;
        }
        this.s = new e(null);
        this.y = new f();
        this.v = new n0.e(this);
        this.w = new n0.f(this);
    }

    public /* synthetic */ DashMediaSource(u u8, o0.c c8, g.a a8, p.a a9, a.a a10, x0.j j8, B0.f f8, p0.x x8, m m8, long l8, long l9,  a11) {
        this(u8, c8, a8, a9, a10, j8, f8, x8, m8, l8, l9);
    }

    public static /* synthetic */ void C(DashMediaSource dashMediaSource) {
        dashMediaSource.O();
    }

    public static /* synthetic */ void D(DashMediaSource dashMediaSource) {
        dashMediaSource.f0();
    }

    public static long I(o0.g g8, long l8, long l9) {
        long l10 = M.J0(g8.b);
        boolean bl = DashMediaSource.M(g8);
        long l11 = Long.MAX_VALUE;
        for (int i8 = 0; i8 < g8.c.size(); ++i8) {
            long l12;
            block10 : {
                List list;
                Object object;
                block9 : {
                    object = (o0.a)g8.c.get(i8);
                    list = object.c;
                    int n8 = object.b;
                    boolean bl2 = true;
                    if (n8 == 1 || n8 == 2) {
                        bl2 = false;
                    }
                    if (!bl) break block9;
                    l12 = l11;
                    if (bl2) break block10;
                }
                if (list.isEmpty()) {
                    l12 = l11;
                } else {
                    object = ((j)list.get(0)).l();
                    if (object == null) {
                        return l10 + l8;
                    }
                    l12 = object.j(l8, l9);
                    if (l12 == 0L) {
                        return l10;
                    }
                    l12 = object.d(l8, l9) + l12 - 1L;
                    long l13 = object.c(l12);
                    l12 = Math.min((long)l11, (long)(object.b(l12, l8) + (l13 + l10)));
                }
            }
            l11 = l12;
        }
        return l11;
    }

    public static long J(o0.g g8, long l8, long l9) {
        long l10 = M.J0(g8.b);
        boolean bl = DashMediaSource.M(g8);
        long l11 = l10;
        for (int i8 = 0; i8 < g8.c.size(); ++i8) {
            long l12;
            block10 : {
                Object object;
                List list;
                block9 : {
                    object = (o0.a)g8.c.get(i8);
                    list = object.c;
                    int n8 = object.b;
                    boolean bl2 = true;
                    if (n8 == 1 || n8 == 2) {
                        bl2 = false;
                    }
                    if (!bl) break block9;
                    l12 = l11;
                    if (bl2) break block10;
                }
                if (list.isEmpty()) {
                    l12 = l11;
                } else {
                    object = ((j)list.get(0)).l();
                    if (object == null) {
                        return l10;
                    }
                    if (object.j(l8, l9) == 0L) {
                        return l10;
                    }
                    l12 = Math.max((long)l11, (long)(object.c(object.d(l8, l9)) + l10));
                }
            }
            l11 = l12;
        }
        return l11;
    }

    public static long K(o0.c object, long l8) {
        int n8 = object.e() - 1;
        o0.g g8 = object.d(n8);
        long l9 = M.J0(g8.b);
        long l10 = object.g(n8);
        long l11 = M.J0(l8);
        long l12 = M.J0(object.a);
        l8 = M.J0(5000L);
        for (n8 = 0; n8 < g8.c.size(); ++n8) {
            long l13;
            block4 : {
                long l14;
                block5 : {
                    block3 : {
                        object = ((o0.a)g8.c.get((int)n8)).c;
                        if (!object.isEmpty()) break block3;
                        l13 = l8;
                        break block4;
                    }
                    object = ((j)object.get(0)).l();
                    l13 = l8;
                    if (object == null) break block4;
                    l14 = l12 + l9 + object.e(l10, l11) - l11;
                    if (l14 < l8 - 100000L) break block5;
                    l13 = l8;
                    if (l14 <= l8) break block4;
                    l13 = l8;
                    if (l14 >= l8 + 100000L) break block4;
                }
                l13 = l14;
            }
            l8 = l13;
        }
        return Z2.e.b(l8, 1000L, RoundingMode.CEILING);
    }

    public static boolean M(o0.g g8) {
        for (int i8 = 0; i8 < g8.c.size(); ++i8) {
            int n8 = ((o0.a)g8.c.get((int)i8)).b;
            if (n8 != 1) {
                if (n8 != 2) continue;
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean N(o0.g g8) {
        for (int i8 = 0; i8 < g8.c.size(); ++i8) {
            n0.g g9 = ((j)((o0.a)g8.c.get((int)i8)).c.get(0)).l();
            if (g9 != null && !g9.g()) {
                continue;
            }
            return true;
        }
        return false;
    }

    @Override
    public void B() {
        this.I = false;
        this.z = null;
        n n8 = this.A;
        if (n8 != null) {
            n8.l();
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.F = this.G;
        this.C = null;
        n8 = this.D;
        if (n8 != null) {
            n8.removeCallbacksAndMessages((Object)null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.u.clear();
        this.n.i();
        this.l.release();
    }

    public final long L() {
        return Math.min((int)((this.M - 1) * 1000), (int)5000);
    }

    public final /* synthetic */ void O() {
        this.Z(false);
    }

    public final void P() {
        C0.a.j(this.A, new a.b(){

            @Override
            public void a() {
                DashMediaSource.this.Y(C0.a.h());
            }

            @Override
            public void b(IOException iOException) {
                DashMediaSource.this.X(iOException);
            }
        });
    }

    public void Q(long l8) {
        long l9 = this.N;
        if (l9 == -9223372036854775807L || l9 < l8) {
            this.N = l8;
        }
    }

    public void R() {
        this.D.removeCallbacks(this.w);
        this.f0();
    }

    public void S(p p8, long l8, long l9) {
        r r8 = new r(p8.a, p8.b, p8.f(), p8.d(), l8, l9, p8.a());
        this.m.a(p8.a);
        this.q.p(r8, p8.c);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void T(p object, long l8, long l9) {
        block10 : {
            block11 : {
                Object object2;
                Object object3;
                int n8;
                block12 : {
                    block15 : {
                        int n9;
                        block14 : {
                            long l10;
                            block13 : {
                                object2 = new r(object.a, object.b, object.f(), object.d(), l8, l9, object.a());
                                this.m.a(object.a);
                                this.q.s((r)object2, object.c);
                                object2 = (o0.c)object.e();
                                object3 = this.H;
                                n9 = object3 == null ? 0 : object3.e();
                                l10 = object2.d((int)0).b;
                                for (n8 = 0; n8 < n9 && this.H.d((int)n8).b < l10; ++n8) {
                                }
                                if (!object2.d) break block12;
                                if (n9 - n8 <= object2.e()) break block13;
                                o.h("DashMediaSource", "Loaded out of sync manifest");
                                break block14;
                            }
                            l10 = this.N;
                            if (l10 == -9223372036854775807L || object2.h * 1000L > l10) break block15;
                            object3 = new StringBuilder();
                            object3.append("Loaded stale dynamic manifest: ");
                            object3.append(object2.h);
                            object3.append(", ");
                            object3.append(this.N);
                            o.h("DashMediaSource", object3.toString());
                        }
                        n9 = this.M;
                        this.M = n9 + 1;
                        if (n9 < this.m.d(object.c)) {
                            this.d0(this.L());
                            return;
                        }
                        this.C = new n0.c();
                        return;
                    }
                    this.M = 0;
                }
                this.H = object2;
                boolean bl = this.I;
                this.I = object2.d & bl;
                this.J = l8 - l9;
                this.K = l8;
                this.O += n8;
                object3 = this.t;
                // MONITORENTER : object3
                if (object.b.a == this.F) {
                    object2 = this.H.k;
                    object = object2 != null ? object2 : object.f();
                    this.F = object;
                }
                // MONITOREXIT : object3
                object = this.H;
                if (!object.d || this.L != -9223372036854775807L) break block10;
                object = object.i;
                if (object == null) break block11;
                this.a0((o0.o)object);
                return;
            }
            this.P();
            return;
        }
        this.Z(true);
    }

    public n.c U(p p8, long l8, long l9, IOException iOException, int n8) {
        r r8 = new r(p8.a, p8.b, p8.f(), p8.d(), l8, l9, p8.a());
        Object object = new m.c(r8, new x0.u(p8.c), iOException, n8);
        l8 = this.m.c((m.c)object);
        object = l8 == -9223372036854775807L ? n.g : n.h(false, l8);
        boolean bl = object.c() ^ true;
        this.q.w(r8, p8.c, iOException, bl);
        if (bl) {
            this.m.a(p8.a);
        }
        return object;
    }

    public void V(p p8, long l8, long l9) {
        r r8 = new r(p8.a, p8.b, p8.f(), p8.d(), l8, l9, p8.a());
        this.m.a(p8.a);
        this.q.s(r8, p8.c);
        this.Y((Long)p8.e() - l8);
    }

    public n.c W(p p8, long l8, long l9, IOException iOException) {
        this.q.w(new r(p8.a, p8.b, p8.f(), p8.d(), l8, l9, p8.a()), p8.c, iOException, true);
        this.m.a(p8.a);
        this.X(iOException);
        return n.f;
    }

    public final void X(IOException iOException) {
        o.d("DashMediaSource", "Failed to resolve time offset.", (Throwable)iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        this.Z(true);
    }

    public final void Y(long l8) {
        this.L = l8;
        this.Z(true);
    }

    public final void Z(boolean bl) {
        long l8;
        int n8;
        long l9;
        int n9;
        for (n8 = 0; n8 < this.u.size(); ++n8) {
            n9 = this.u.keyAt(n8);
            if (n9 < this.O) continue;
            ((androidx.media3.exoplayer.dash.b)this.u.valueAt(n8)).P(this.H, n9 - this.O);
        }
        Object object = this.H.d(0);
        n8 = this.H.e() - 1;
        Object object2 = this.H.d(n8);
        long l10 = this.H.g(n8);
        long l11 = M.J0(M.d0(this.L));
        long l12 = DashMediaSource.J((o0.g)object, this.H.g(0), l11);
        long l13 = DashMediaSource.I((o0.g)object2, l10, l11);
        n8 = this.H.d && !DashMediaSource.N((o0.g)object2) ? 1 : 0;
        l10 = l12;
        if (n8 != 0) {
            l8 = this.H.f;
            l10 = l12;
            if (l8 != -9223372036854775807L) {
                l10 = Math.max((long)l12, (long)(l13 - M.J0(l8)));
            }
        }
        l8 = l13 - l10;
        object2 = this.H;
        if (object2.d) {
            boolean bl2 = object2.a != -9223372036854775807L;
            g0.a.f(bl2);
            l12 = l11 - M.J0(this.H.a) - l10;
            this.g0(l12, l8);
            l11 = this.H.a;
            l9 = M.i1(l10);
            l13 = Math.min((long)this.p, (long)(l8 / 2L));
            l11 += l9;
            if ((l12 -= M.J0(this.E.a)) < l13) {
                l12 = l13;
            }
        } else {
            l11 = -9223372036854775807L;
            l12 = 0L;
        }
        l13 = M.J0(object.b);
        object2 = this.H;
        l9 = object2.a;
        long l14 = this.L;
        n9 = this.O;
        u u8 = this.a();
        object = this.H.d ? this.E : null;
        this.A(new b(l9, l11, l14, n9, l10 - l13, l8, l12, (o0.c)object2, u8, (u.g)object));
        if (!this.h) {
            this.D.removeCallbacks(this.w);
            if (n8 != 0) {
                this.D.postDelayed(this.w, DashMediaSource.K(this.H, M.d0(this.L)));
            }
            if (this.I) {
                this.f0();
                return;
            }
            if (bl) {
                object = this.H;
                if (object.d && (l10 = object.e) != -9223372036854775807L) {
                    l12 = l10;
                    if (l10 == 0L) {
                        l12 = 5000L;
                    }
                    this.d0(Math.max((long)0L, (long)(this.J + l12 - SystemClock.elapsedRealtime())));
                }
            }
        }
    }

    @Override
    public u a() {
        synchronized (this) {
            u u8 = this.P;
            return u8;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a0(o0.o o8) {
        Object object = o8.a;
        if (!M.c(object, "urn:mpeg:dash:utc:direct:2014") && !M.c(object, "urn:mpeg:dash:utc:direct:2012")) {
            if (!M.c(object, "urn:mpeg:dash:utc:http-iso:2014") && !M.c(object, "urn:mpeg:dash:utc:http-iso:2012")) {
                if (!M.c(object, "urn:mpeg:dash:utc:http-xsdate:2014") && !M.c(object, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                    if (!M.c(object, "urn:mpeg:dash:utc:ntp:2014") && !M.c(object, "urn:mpeg:dash:utc:ntp:2012")) {
                        this.X(new IOException("Unsupported UTC timing scheme"));
                        return;
                    }
                    this.P();
                    return;
                }
                object = new h(null);
            } else {
                object = new d();
            }
            this.c0(o8, (p.a)object);
            return;
        }
        this.b0(o8);
    }

    public final void b0(o0.o o8) {
        try {
            this.Y(M.Q0(o8.b) - this.K);
            return;
        }
        catch (A a8) {
            this.X(a8);
            return;
        }
    }

    public final void c0(o0.o o8, p.a a8) {
        this.e0(new p(this.z, Uri.parse((String)o8.b), 5, a8), new g(null), 1);
    }

    public final void d0(long l8) {
        this.D.postDelayed(this.v, l8);
    }

    @Override
    public void e(x0.v v8) {
        v8 = (androidx.media3.exoplayer.dash.b)v8;
        v8.L();
        this.u.remove(v8.o);
    }

    public final void e0(p p8, n.b b8, int n8) {
        long l8 = this.A.n(p8, b8, n8);
        this.q.y(new r(p8.a, p8.b, l8), p8.c);
    }

    @Override
    public x0.v f(x.b object, B0.b b8, long l8) {
        int n8 = (Integer)object.a - this.O;
        E.a a8 = this.u((x.b)object);
        object = this.s((x.b)object);
        object = new androidx.media3.exoplayer.dash.b(n8 + this.O, this.H, this.n, n8, this.j, this.B, null, this.l, (v.a)object, this.m, a8, this.L, this.y, b8, this.k, this.x, this.x());
        this.u.put(object.o, object);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f0() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (this.A.i()) {
            return;
        }
        if (this.A.j()) {
            this.I = true;
            return;
        }
        Object object = this.t;
        synchronized (object) {
            uri = this.F;
        }
        this.I = false;
        this.e0(new p(this.z, uri, 4, this.r), this.s, this.m.d(4));
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void g0(long l8, long l9) {
        long l10;
        long l11;
        float f8;
        long l12;
        float f9;
        block18 : {
            block19 : {
                float f10;
                Object object;
                long l13;
                float f11;
                Object object2;
                block17 : {
                    block16 : {
                        object = this.a().d;
                        l12 = M.i1(l8);
                        l10 = object.c;
                        l10 = l10 != -9223372036854775807L || (object2 = this.H.j) != null && (l10 = object2.c) != -9223372036854775807L ? Math.min((long)l12, (long)l10) : l12;
                        l11 = l13 = M.i1(l8 - l9);
                        if (l13 < 0L) {
                            l11 = l13;
                            if (l10 > 0L) {
                                l11 = 0L;
                            }
                        }
                        long l14 = this.H.c;
                        l13 = l11;
                        if (l14 != -9223372036854775807L) {
                            l13 = Math.min((long)(l11 + l14), (long)l12);
                        }
                        if ((l11 = object.b) != -9223372036854775807L) break block16;
                        object2 = this.H.j;
                        l11 = l13;
                        if (object2 == null) break block17;
                        l14 = object2.b;
                        l11 = l13;
                        if (l14 == -9223372036854775807L) break block17;
                        l11 = l14;
                    }
                    l11 = M.q(l11, l13, l12);
                }
                l12 = l10;
                if (l11 > l10) {
                    l12 = l11;
                }
                if ((l10 = this.E.a) == -9223372036854775807L) {
                    object2 = this.H;
                    l l15 = object2.j;
                    if ((l15 == null || (l10 = l15.a) == -9223372036854775807L) && (l10 = object2.g) == -9223372036854775807L) {
                        l10 = this.o;
                    }
                }
                l13 = l10;
                if (l10 < l11) {
                    l13 = l11;
                }
                l10 = l13;
                if (l13 > l12) {
                    l10 = M.q(M.i1(l8 - Math.min((long)this.p, (long)(l9 / 2L))), l11, l12);
                }
                if ((f11 = object.d) == -3.4028235E38f) {
                    object2 = this.H.j;
                    f11 = object2 != null ? object2.d : -3.4028235E38f;
                }
                if ((f10 = object.e) == -3.4028235E38f) {
                    object = this.H.j;
                    f10 = object != null ? object.e : -3.4028235E38f;
                }
                f8 = f10;
                f9 = f11;
                if (f11 != -3.4028235E38f) break block18;
                f8 = f10;
                f9 = f11;
                if (f10 != -3.4028235E38f) break block18;
                object = this.H.j;
                if (object == null) break block19;
                f8 = f10;
                f9 = f11;
                if (object.a != -9223372036854775807L) break block18;
            }
            f9 = 1.0f;
            f8 = 1.0f;
        }
        this.E = new u.g.a().k(l10).i(l11).g(l12).j(f9).h(f8).f();
    }

    @Override
    public void h() {
        this.y.a();
    }

    @Override
    public void l(u u8) {
        synchronized (this) {
            this.P = u8;
            return;
        }
    }

    @Override
    public void z(y y8) {
        this.B = y8;
        this.l.a(Looper.myLooper(), this.x());
        this.l.g();
        if (this.h) {
            this.Z(false);
            return;
        }
        this.z = this.i.a();
        this.A = new n("DashMediaSource");
        this.D = M.A();
        this.f0();
    }

    public static final class Factory
    implements x.a {
        public final a.a a;
        public final g.a b;
        public p0.A c;
        public x0.j d;
        public m e;
        public long f;
        public long g;
        public p.a h;

        public Factory(a.a a8, g.a a9) {
            this.a = (a.a)g0.a.e(a8);
            this.b = a9;
            this.c = new p0.l();
            this.e = new B0.k();
            this.f = 30000L;
            this.g = 5000000L;
            this.d = new x0.m();
            this.b(true);
        }

        public Factory(g.a a8) {
            this(new c.a(a8), a8);
        }

        public DashMediaSource a(u u8) {
            p.a a8;
            g0.a.e(u8.b);
            p.a a9 = a8 = this.h;
            if (a8 == null) {
                a9 = new o0.d();
            }
            if (!(a8 = u8.b.d).isEmpty()) {
                a9 = new v0.b(a9, (List)a8);
            }
            return new DashMediaSource(u8, null, this.b, a9, this.a, this.d, null, this.c.a(u8), this.e, this.f, this.g, null);
        }

        public Factory b(boolean bl) {
            this.a.a(bl);
            return this;
        }
    }

    public static final class b
    extends I {
        public final long e;
        public final long f;
        public final long g;
        public final int h;
        public final long i;
        public final long j;
        public final long k;
        public final o0.c l;
        public final u m;
        public final u.g n;

        public b(long l8, long l9, long l10, int n8, long l11, long l12, long l13, o0.c c8, u u8, u.g g8) {
            boolean bl = c8.d;
            boolean bl2 = true;
            boolean bl3 = g8 != null;
            bl3 = bl == bl3 ? bl2 : false;
            g0.a.f(bl3);
            this.e = l8;
            this.f = l9;
            this.g = l10;
            this.h = n8;
            this.i = l11;
            this.j = l12;
            this.k = l13;
            this.l = c8;
            this.m = u8;
            this.n = g8;
        }

        public static boolean t(o0.c c8) {
            if (c8.d && c8.e != -9223372036854775807L && c8.b == -9223372036854775807L) {
                return true;
            }
            return false;
        }

        @Override
        public int b(Object object) {
            boolean bl = object instanceof Integer;
            int n8 = -1;
            if (!bl) {
                return -1;
            }
            int n9 = (Integer)object - this.h;
            if (n9 >= 0) {
                if (n9 >= this.i()) {
                    return -1;
                }
                n8 = n9;
            }
            return n8;
        }

        @Override
        public I.b g(int n8, I.b b8, boolean bl) {
            g0.a.c(n8, 0, this.i());
            Integer n9 = null;
            String string2 = bl ? this.l.d((int)n8).a : null;
            if (bl) {
                n9 = this.h + n8;
            }
            return b8.s(string2, (Object)n9, 0, this.l.g(n8), M.J0(this.l.d((int)n8).b - this.l.d((int)0).b) - this.i);
        }

        @Override
        public int i() {
            return this.l.e();
        }

        @Override
        public Object m(int n8) {
            g0.a.c(n8, 0, this.i());
            return this.h + n8;
        }

        @Override
        public I.c o(int n8, I.c c8, long l8) {
            g0.a.c(n8, 0, 1);
            l8 = this.s(l8);
            Object object = I.c.q;
            u u8 = this.m;
            o0.c c9 = this.l;
            return c8.g(object, u8, c9, this.e, this.f, this.g, true, b.t(c9), this.n, l8, this.j, 0, this.i() - 1, this.i);
        }

        @Override
        public int p() {
            return 1;
        }

        public final long s(long l8) {
            long l9 = this.k;
            if (!b.t(this.l)) {
                return l9;
            }
            long l10 = l9;
            if (l8 > 0L) {
                l10 = l8 = l9 + l8;
                if (l8 > this.j) {
                    return -9223372036854775807L;
                }
            }
            l8 = this.l.g(0);
            int n8 = 0;
            for (l9 = this.i + l10; n8 < this.l.e() - 1 && l9 >= l8; l9 -= l8) {
                l8 = this.l.g(++n8);
            }
            Object object = this.l.d(n8);
            n8 = object.a(2);
            if (n8 == -1) {
                return l10;
            }
            object = ((j)((o0.a)object.c.get((int)n8)).c.get(0)).l();
            long l11 = l10;
            if (object != null) {
                if (object.i(l8) == 0L) {
                    return l10;
                }
                l11 = l10 + object.c(object.a(l9, l8)) - l9;
            }
            return l11;
        }
    }

    public final class c
    implements d.b {
        public c() {
        }

        public /* synthetic */ c( a8) {
            this();
        }

        @Override
        public void a() {
            DashMediaSource.this.R();
        }

        @Override
        public void b(long l8) {
            DashMediaSource.this.Q(l8);
        }
    }

    public static final class d
    implements p.a {
        public static final Pattern a = Pattern.compile((String)"(.+?)(Z|((\\+|-|\u2212)(\\d\\d)(:?(\\d\\d))?))");

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public Long b(Uri object, InputStream object2) {
            long l8;
            long l9;
            long l10;
            long l11;
            object2 = new BufferedReader((Reader)new InputStreamReader((InputStream)object2, W2.e.c)).readLine();
            try {
                object = a.matcher((CharSequence)object2);
                if (!object.matches()) {
                    object = new StringBuilder();
                    object.append("Couldn't parse timestamp: ");
                    object.append((String)object2);
                    throw A.c(object.toString(), null);
                }
                object2 = object.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone((String)"UTC"));
                l10 = simpleDateFormat.parse((String)object2).getTime();
                if ("Z".equals((Object)object.group(2))) {
                    l8 = l10;
                    return l8;
                }
                l8 = "+".equals((Object)object.group(4)) ? 1L : -1L;
                l11 = Long.parseLong((String)object.group(5));
                if (!TextUtils.isEmpty((CharSequence)(object = object.group(7)))) {
                    l9 = Long.parseLong((String)object);
                }
                l9 = 0L;
            }
            catch (ParseException parseException) {
                throw A.c(null, (Throwable)parseException);
            }
            l8 = l10 - l8 * ((l11 * 60L + l9) * 60000L);
            return l8;
        }
    }

    public final class e
    implements n.b {
        public e() {
        }

        public /* synthetic */ e( a8) {
            this();
        }

        public void a(p p8, long l8, long l9, boolean bl) {
            DashMediaSource.this.S(p8, l8, l9);
        }

        public void b(p p8, long l8, long l9) {
            DashMediaSource.this.T(p8, l8, l9);
        }

        public n.c c(p p8, long l8, long l9, IOException iOException, int n8) {
            return DashMediaSource.this.U(p8, l8, l9, iOException, n8);
        }
    }

    public final class f
    implements B0.o {
        @Override
        public void a() {
            DashMediaSource.this.A.a();
            this.b();
        }

        public final void b() {
            if (DashMediaSource.this.C == null) {
                return;
            }
            throw DashMediaSource.this.C;
        }
    }

    public final class g
    implements n.b {
        public g() {
        }

        public /* synthetic */ g( a8) {
            this();
        }

        public void a(p p8, long l8, long l9, boolean bl) {
            DashMediaSource.this.S(p8, l8, l9);
        }

        public void b(p p8, long l8, long l9) {
            DashMediaSource.this.V(p8, l8, l9);
        }

        public n.c c(p p8, long l8, long l9, IOException iOException, int n8) {
            return DashMediaSource.this.W(p8, l8, l9, iOException);
        }
    }

    public static final class h
    implements p.a {
        public h() {
        }

        public /* synthetic */ h( a8) {
            this();
        }

        public Long b(Uri uri, InputStream inputStream) {
            return M.Q0(new BufferedReader((Reader)new InputStreamReader(inputStream)).readLine());
        }
    }

}

