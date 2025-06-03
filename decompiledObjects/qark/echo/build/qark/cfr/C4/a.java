/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package C4;

import C4.b;
import C4.c;
import C4.d;
import C4.e;
import C4.f;
import C4.g;
import C4.h;
import C4.i;
import C4.j;
import C4.k;
import C4.l;
import C4.m;
import C4.n;
import C4.o;
import C4.p;
import C4.q;
import C4.r;
import C4.s;
import C4.t;
import C4.u;
import C4.v;
import C4.x;
import android.content.Context;
import com.google.firebase.perf.config.RemoteConfigManager;

public class a {
    public static final F4.a d = F4.a.e();
    public static volatile a e;
    public final RemoteConfigManager a;
    public M4.f b;
    public x c;

    public a(RemoteConfigManager object, M4.f f8, x x8) {
        RemoteConfigManager remoteConfigManager = object;
        if (object == null) {
            remoteConfigManager = RemoteConfigManager.getInstance();
        }
        this.a = remoteConfigManager;
        object = f8;
        if (f8 == null) {
            object = new M4.f();
        }
        this.b = object;
        object = x8;
        if (x8 == null) {
            object = x.f();
        }
        this.c = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a g() {
        synchronized (a.class) {
            try {
                if (e != null) return e;
                e = new a(null, null, null);
                return e;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public long A() {
        M4.g g8;
        o o8;
        block4 : {
            block2 : {
                block3 : {
                    o8 = o.e();
                    g8 = this.p(o8);
                    if (g8.d() && this.N((Long)g8.c())) break block2;
                    g8 = this.w(o8);
                    if (!g8.d() || !this.N((Long)g8.c())) break block3;
                    this.c.l(o8.a(), (Long)g8.c());
                    break block2;
                }
                g8 = this.d(o8);
                if (!g8.d() || !this.N((Long)g8.c())) break block4;
            }
            g8 = (Long)g8.c();
            return g8.longValue();
        }
        g8 = o8.d();
        return g8.longValue();
    }

    /*
     * Enabled aggressive block sorting
     */
    public long B() {
        p p8;
        M4.g g8;
        block4 : {
            block2 : {
                block3 : {
                    p8 = p.e();
                    g8 = this.p(p8);
                    if (g8.d() && this.K((Long)g8.c())) break block2;
                    g8 = this.w(p8);
                    if (!g8.d() || !this.K((Long)g8.c())) break block3;
                    this.c.l(p8.a(), (Long)g8.c());
                    break block2;
                }
                g8 = this.d(p8);
                if (!g8.d() || !this.K((Long)g8.c())) break block4;
            }
            g8 = (Long)g8.c();
            return g8.longValue();
        }
        g8 = p8.d();
        return g8.longValue();
    }

    /*
     * Enabled aggressive block sorting
     */
    public long C() {
        q q8;
        M4.g g8;
        block6 : {
            block4 : {
                block5 : {
                    q8 = q.f();
                    g8 = this.p(q8);
                    if (g8.d() && this.K((Long)g8.c())) break block4;
                    g8 = this.w(q8);
                    if (!g8.d() || !this.K((Long)g8.c())) break block5;
                    this.c.l(q8.a(), (Long)g8.c());
                    break block4;
                }
                g8 = this.d(q8);
                if (!g8.d() || !this.K((Long)g8.c())) break block6;
            }
            g8 = (Long)g8.c();
            return g8.longValue();
        }
        if (this.a.isLastFetchFailed()) {
            g8 = q8.e();
            return g8.longValue();
        }
        g8 = q8.d();
        return g8.longValue();
    }

    /*
     * Enabled aggressive block sorting
     */
    public double D() {
        M4.g g8;
        r r8;
        block7 : {
            block6 : {
                block5 : {
                    double d8;
                    r8 = r.f();
                    g8 = this.o(r8);
                    if (g8.d() && this.M(d8 = (Double)g8.c() / 100.0)) {
                        return d8;
                    }
                    g8 = this.v(r8);
                    if (!g8.d() || !this.M((Double)g8.c())) break block5;
                    this.c.k(r8.a(), (Double)g8.c());
                    break block6;
                }
                g8 = this.c(r8);
                if (!g8.d() || !this.M((Double)g8.c())) break block7;
            }
            g8 = (Double)g8.c();
            return g8.doubleValue();
        }
        if (this.a.isLastFetchFailed()) {
            g8 = r8.e();
            return g8.doubleValue();
        }
        g8 = r8.d();
        return g8.doubleValue();
    }

    /*
     * Enabled aggressive block sorting
     */
    public long E() {
        s s8;
        M4.g g8;
        block4 : {
            block3 : {
                block2 : {
                    s8 = s.e();
                    g8 = this.w(s8);
                    if (!g8.d() || !this.I((Long)g8.c())) break block2;
                    this.c.l(s8.a(), (Long)g8.c());
                    break block3;
                }
                g8 = this.d(s8);
                if (!g8.d() || !this.I((Long)g8.c())) break block4;
            }
            g8 = (Long)g8.c();
            return g8.longValue();
        }
        g8 = s8.d();
        return g8.longValue();
    }

    /*
     * Enabled aggressive block sorting
     */
    public long F() {
        t t8;
        M4.g g8;
        block4 : {
            block3 : {
                block2 : {
                    t8 = t.e();
                    g8 = this.w(t8);
                    if (!g8.d() || !this.I((Long)g8.c())) break block2;
                    this.c.l(t8.a(), (Long)g8.c());
                    break block3;
                }
                g8 = this.d(t8);
                if (!g8.d() || !this.I((Long)g8.c())) break block4;
            }
            g8 = (Long)g8.c();
            return g8.longValue();
        }
        g8 = t8.d();
        return g8.longValue();
    }

    /*
     * Enabled aggressive block sorting
     */
    public double G() {
        u u8;
        M4.g g8;
        block6 : {
            block5 : {
                block4 : {
                    u8 = u.f();
                    g8 = this.v(u8);
                    if (!g8.d() || !this.M((Double)g8.c())) break block4;
                    this.c.k(u8.a(), (Double)g8.c());
                    break block5;
                }
                g8 = this.c(u8);
                if (!g8.d() || !this.M((Double)g8.c())) break block6;
            }
            g8 = (Double)g8.c();
            return g8.doubleValue();
        }
        if (this.a.isLastFetchFailed()) {
            g8 = u8.e();
            return g8.doubleValue();
        }
        g8 = u8.d();
        return g8.doubleValue();
    }

    public boolean H() {
        M4.g g8 = this.u(l.e());
        if (!this.b(c.d()).d() && !g8.d()) {
            return false;
        }
        return true;
    }

    public final boolean I(long l8) {
        if (l8 >= 0L) {
            return true;
        }
        return false;
    }

    public final boolean J(String arrstring) {
        if (arrstring.trim().isEmpty()) {
            return false;
        }
        arrstring = arrstring.split(";");
        int n8 = arrstring.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!arrstring[i8].trim().equals((Object)A4.a.b)) continue;
            return true;
        }
        return false;
    }

    public final boolean K(long l8) {
        if (l8 >= 0L) {
            return true;
        }
        return false;
    }

    public boolean L() {
        Boolean bl = this.j();
        if ((bl == null || bl.booleanValue()) && this.m()) {
            return true;
        }
        return false;
    }

    public final boolean M(double d8) {
        if (0.0 <= d8 && d8 <= 1.0) {
            return true;
        }
        return false;
    }

    public final boolean N(long l8) {
        if (l8 > 0L) {
            return true;
        }
        return false;
    }

    public final boolean O(long l8) {
        if (l8 > 0L) {
            return true;
        }
        return false;
    }

    public void P(Context context) {
        d.i(M4.o.b(context));
        this.c.j(context);
    }

    public void Q(Boolean bl) {
        if (this.i().booleanValue()) {
            return;
        }
        String string2 = c.d().a();
        if (string2 != null) {
            if (bl != null) {
                this.c.n(string2, Boolean.TRUE.equals((Object)bl));
                return;
            }
            this.c.b(string2);
        }
    }

    public void R(M4.f f8) {
        this.b = f8;
    }

    public String a() {
        String string2;
        f f8 = f.e();
        if (A4.a.a.booleanValue()) {
            return f8.d();
        }
        Object object = f8.c();
        long l8 = -1L;
        if (object != null) {
            l8 = this.a.getRemoteConfigValueOrDefault((String)object, -1L);
        }
        object = f8.a();
        if (f.g(l8) && (string2 = f.f(l8)) != null) {
            this.c.m((String)object, string2);
            return string2;
        }
        object = this.e(f8);
        if (object.d()) {
            return (String)object.c();
        }
        return f8.d();
    }

    public final M4.g b(v v8) {
        return this.c.c(v8.a());
    }

    public final M4.g c(v v8) {
        return this.c.d(v8.a());
    }

    public final M4.g d(v v8) {
        return this.c.g(v8.a());
    }

    public final M4.g e(v v8) {
        return this.c.h(v8.a());
    }

    /*
     * Enabled aggressive block sorting
     */
    public double f() {
        M4.g g8;
        e e8;
        block6 : {
            block5 : {
                block4 : {
                    double d8;
                    e8 = e.e();
                    g8 = this.o(e8);
                    if (g8.d() && this.M(d8 = (Double)g8.c() / 100.0)) {
                        return d8;
                    }
                    g8 = this.v(e8);
                    if (!g8.d() || !this.M((Double)g8.c())) break block4;
                    this.c.k(e8.a(), (Double)g8.c());
                    break block5;
                }
                g8 = this.c(e8);
                if (!g8.d() || !this.M((Double)g8.c())) break block6;
            }
            g8 = (Double)g8.c();
            return g8.doubleValue();
        }
        g8 = e8.d();
        return g8.doubleValue();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean h() {
        d d8 = d.e();
        M4.g g8 = this.n(d8);
        if (!g8.d()) {
            g8 = this.u(d8);
            if (g8.d()) {
                this.c.n(d8.a(), (Boolean)g8.c());
            } else {
                g8 = this.b(d8);
                if (!g8.d()) {
                    g8 = d8.d();
                    return g8.booleanValue();
                }
            }
        }
        g8 = (Boolean)g8.c();
        return g8.booleanValue();
    }

    public Boolean i() {
        b b8 = b.e();
        M4.g g8 = this.n(b8);
        if (g8.d()) {
            return (Boolean)g8.c();
        }
        return b8.d();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Boolean j() {
        if (this.i().booleanValue()) {
            return Boolean.FALSE;
        }
        Object object = c.d();
        M4.g g8 = this.b((v)object);
        if (g8.d()) {
            object = g8.c();
            do {
                return (Boolean)object;
                break;
            } while (true);
        }
        if (!(object = this.n((v)object)).d()) return null;
        object = object.c();
        return (Boolean)object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean k() {
        l l8 = l.e();
        M4.g g8 = this.u(l8);
        if (g8.d()) {
            if (this.a.isLastFetchFailed()) {
                return false;
            }
            this.c.n(l8.a(), (Boolean)g8.c());
        } else {
            g8 = this.b(l8);
            if (!g8.d()) {
                g8 = l8.d();
                return g8.booleanValue();
            }
        }
        g8 = (Boolean)g8.c();
        return g8.booleanValue();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean l() {
        k k8 = k.e();
        Object object = this.x(k8);
        if (object.d()) {
            this.c.m(k8.a(), (String)object.c());
        } else {
            object = this.e(k8);
            if (!object.d()) {
                object = k8.d();
                return this.J((String)object);
            }
        }
        object = (String)object.c();
        return this.J((String)object);
    }

    public boolean m() {
        if (this.k() && !this.l()) {
            return true;
        }
        return false;
    }

    public final M4.g n(v v8) {
        return this.b.b(v8.b());
    }

    public final M4.g o(v v8) {
        return this.b.c(v8.b());
    }

    public final M4.g p(v v8) {
        return this.b.e(v8.b());
    }

    /*
     * Enabled aggressive block sorting
     */
    public long q() {
        g g8;
        M4.g g9;
        block4 : {
            block3 : {
                block2 : {
                    g8 = g.e();
                    g9 = this.w(g8);
                    if (!g9.d() || !this.I((Long)g9.c())) break block2;
                    this.c.l(g8.a(), (Long)g9.c());
                    break block3;
                }
                g9 = this.d(g8);
                if (!g9.d() || !this.I((Long)g9.c())) break block4;
            }
            g9 = (Long)g9.c();
            return g9.longValue();
        }
        g9 = g8.d();
        return g9.longValue();
    }

    /*
     * Enabled aggressive block sorting
     */
    public long r() {
        h h8;
        M4.g g8;
        block4 : {
            block3 : {
                block2 : {
                    h8 = h.e();
                    g8 = this.w(h8);
                    if (!g8.d() || !this.I((Long)g8.c())) break block2;
                    this.c.l(h8.a(), (Long)g8.c());
                    break block3;
                }
                g8 = this.d(h8);
                if (!g8.d() || !this.I((Long)g8.c())) break block4;
            }
            g8 = (Long)g8.c();
            return g8.longValue();
        }
        g8 = h8.d();
        return g8.longValue();
    }

    /*
     * Enabled aggressive block sorting
     */
    public double s() {
        i i8;
        M4.g g8;
        block6 : {
            block5 : {
                block4 : {
                    i8 = i.f();
                    g8 = this.v(i8);
                    if (!g8.d() || !this.M((Double)g8.c())) break block4;
                    this.c.k(i8.a(), (Double)g8.c());
                    break block5;
                }
                g8 = this.c(i8);
                if (!g8.d() || !this.M((Double)g8.c())) break block6;
            }
            g8 = (Double)g8.c();
            return g8.doubleValue();
        }
        if (this.a.isLastFetchFailed()) {
            g8 = i8.e();
            return g8.doubleValue();
        }
        g8 = i8.d();
        return g8.doubleValue();
    }

    /*
     * Enabled aggressive block sorting
     */
    public long t() {
        M4.g g8;
        j j8;
        block4 : {
            block3 : {
                block2 : {
                    j8 = j.e();
                    g8 = this.w(j8);
                    if (!g8.d() || !this.O((Long)g8.c())) break block2;
                    this.c.l(j8.a(), (Long)g8.c());
                    break block3;
                }
                g8 = this.d(j8);
                if (!g8.d() || !this.O((Long)g8.c())) break block4;
            }
            g8 = (Long)g8.c();
            return g8.longValue();
        }
        g8 = j8.d();
        return g8.longValue();
    }

    public final M4.g u(v v8) {
        return this.a.getBoolean(v8.c());
    }

    public final M4.g v(v v8) {
        return this.a.getDouble(v8.c());
    }

    public final M4.g w(v v8) {
        return this.a.getLong(v8.c());
    }

    public final M4.g x(v v8) {
        return this.a.getString(v8.c());
    }

    /*
     * Enabled aggressive block sorting
     */
    public long y() {
        M4.g g8;
        m m8;
        block4 : {
            block2 : {
                block3 : {
                    m8 = m.e();
                    g8 = this.p(m8);
                    if (g8.d() && this.K((Long)g8.c())) break block2;
                    g8 = this.w(m8);
                    if (!g8.d() || !this.K((Long)g8.c())) break block3;
                    this.c.l(m8.a(), (Long)g8.c());
                    break block2;
                }
                g8 = this.d(m8);
                if (!g8.d() || !this.K((Long)g8.c())) break block4;
            }
            g8 = (Long)g8.c();
            return g8.longValue();
        }
        g8 = m8.d();
        return g8.longValue();
    }

    /*
     * Enabled aggressive block sorting
     */
    public long z() {
        M4.g g8;
        n n8;
        block6 : {
            block4 : {
                block5 : {
                    n8 = n.f();
                    g8 = this.p(n8);
                    if (g8.d() && this.K((Long)g8.c())) break block4;
                    g8 = this.w(n8);
                    if (!g8.d() || !this.K((Long)g8.c())) break block5;
                    this.c.l(n8.a(), (Long)g8.c());
                    break block4;
                }
                g8 = this.d(n8);
                if (!g8.d() || !this.K((Long)g8.c())) break block6;
            }
            g8 = (Long)g8.c();
            return g8.longValue();
        }
        if (this.a.isLastFetchFailed()) {
            g8 = n8.e();
            return g8.longValue();
        }
        g8 = n8.d();
        return g8.longValue();
    }
}

