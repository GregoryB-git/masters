package C4;

import android.content.Context;
import com.google.firebase.perf.config.RemoteConfigManager;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public static final F4.a f991d = F4.a.e();

    /* renamed from: e, reason: collision with root package name */
    public static volatile a f992e;

    /* renamed from: a, reason: collision with root package name */
    public final RemoteConfigManager f993a;

    /* renamed from: b, reason: collision with root package name */
    public M4.f f994b;

    /* renamed from: c, reason: collision with root package name */
    public x f995c;

    public a(RemoteConfigManager remoteConfigManager, M4.f fVar, x xVar) {
        this.f993a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f994b = fVar == null ? new M4.f() : fVar;
        this.f995c = xVar == null ? x.f() : xVar;
    }

    public static synchronized a g() {
        a aVar;
        synchronized (a.class) {
            try {
                if (f992e == null) {
                    f992e = new a(null, null, null);
                }
                aVar = f992e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public long A() {
        Long d7;
        o e7 = o.e();
        M4.g p7 = p(e7);
        if (!p7.d() || !N(((Long) p7.c()).longValue())) {
            p7 = w(e7);
            if (p7.d() && N(((Long) p7.c()).longValue())) {
                this.f995c.l(e7.a(), ((Long) p7.c()).longValue());
            } else {
                p7 = d(e7);
                if (!p7.d() || !N(((Long) p7.c()).longValue())) {
                    d7 = e7.d();
                    return d7.longValue();
                }
            }
        }
        d7 = (Long) p7.c();
        return d7.longValue();
    }

    public long B() {
        Long d7;
        p e7 = p.e();
        M4.g p7 = p(e7);
        if (!p7.d() || !K(((Long) p7.c()).longValue())) {
            p7 = w(e7);
            if (p7.d() && K(((Long) p7.c()).longValue())) {
                this.f995c.l(e7.a(), ((Long) p7.c()).longValue());
            } else {
                p7 = d(e7);
                if (!p7.d() || !K(((Long) p7.c()).longValue())) {
                    d7 = e7.d();
                    return d7.longValue();
                }
            }
        }
        d7 = (Long) p7.c();
        return d7.longValue();
    }

    public long C() {
        Long e7;
        q f7 = q.f();
        M4.g p7 = p(f7);
        if (!p7.d() || !K(((Long) p7.c()).longValue())) {
            p7 = w(f7);
            if (p7.d() && K(((Long) p7.c()).longValue())) {
                this.f995c.l(f7.a(), ((Long) p7.c()).longValue());
            } else {
                p7 = d(f7);
                if (!p7.d() || !K(((Long) p7.c()).longValue())) {
                    e7 = this.f993a.isLastFetchFailed() ? f7.e() : f7.d();
                    return e7.longValue();
                }
            }
        }
        e7 = (Long) p7.c();
        return e7.longValue();
    }

    public double D() {
        Double e7;
        r f7 = r.f();
        M4.g o7 = o(f7);
        if (o7.d()) {
            double doubleValue = ((Double) o7.c()).doubleValue() / 100.0d;
            if (M(doubleValue)) {
                return doubleValue;
            }
        }
        M4.g v7 = v(f7);
        if (v7.d() && M(((Double) v7.c()).doubleValue())) {
            this.f995c.k(f7.a(), ((Double) v7.c()).doubleValue());
        } else {
            v7 = c(f7);
            if (!v7.d() || !M(((Double) v7.c()).doubleValue())) {
                e7 = this.f993a.isLastFetchFailed() ? f7.e() : f7.d();
                return e7.doubleValue();
            }
        }
        e7 = (Double) v7.c();
        return e7.doubleValue();
    }

    public long E() {
        Long d7;
        s e7 = s.e();
        M4.g w7 = w(e7);
        if (w7.d() && I(((Long) w7.c()).longValue())) {
            this.f995c.l(e7.a(), ((Long) w7.c()).longValue());
        } else {
            w7 = d(e7);
            if (!w7.d() || !I(((Long) w7.c()).longValue())) {
                d7 = e7.d();
                return d7.longValue();
            }
        }
        d7 = (Long) w7.c();
        return d7.longValue();
    }

    public long F() {
        Long d7;
        t e7 = t.e();
        M4.g w7 = w(e7);
        if (w7.d() && I(((Long) w7.c()).longValue())) {
            this.f995c.l(e7.a(), ((Long) w7.c()).longValue());
        } else {
            w7 = d(e7);
            if (!w7.d() || !I(((Long) w7.c()).longValue())) {
                d7 = e7.d();
                return d7.longValue();
            }
        }
        d7 = (Long) w7.c();
        return d7.longValue();
    }

    public double G() {
        Double e7;
        u f7 = u.f();
        M4.g v7 = v(f7);
        if (v7.d() && M(((Double) v7.c()).doubleValue())) {
            this.f995c.k(f7.a(), ((Double) v7.c()).doubleValue());
        } else {
            v7 = c(f7);
            if (!v7.d() || !M(((Double) v7.c()).doubleValue())) {
                e7 = this.f993a.isLastFetchFailed() ? f7.e() : f7.d();
                return e7.doubleValue();
            }
        }
        e7 = (Double) v7.c();
        return e7.doubleValue();
    }

    public boolean H() {
        return b(c.d()).d() || u(l.e()).d();
    }

    public final boolean I(long j7) {
        return j7 >= 0;
    }

    public final boolean J(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(A4.a.f544b)) {
                return true;
            }
        }
        return false;
    }

    public final boolean K(long j7) {
        return j7 >= 0;
    }

    public boolean L() {
        Boolean j7 = j();
        return (j7 == null || j7.booleanValue()) && m();
    }

    public final boolean M(double d7) {
        return 0.0d <= d7 && d7 <= 1.0d;
    }

    public final boolean N(long j7) {
        return j7 > 0;
    }

    public final boolean O(long j7) {
        return j7 > 0;
    }

    public void P(Context context) {
        f991d.i(M4.o.b(context));
        this.f995c.j(context);
    }

    public void Q(Boolean bool) {
        String a7;
        if (i().booleanValue() || (a7 = c.d().a()) == null) {
            return;
        }
        if (bool != null) {
            this.f995c.n(a7, Boolean.TRUE.equals(bool));
        } else {
            this.f995c.b(a7);
        }
    }

    public void R(M4.f fVar) {
        this.f994b = fVar;
    }

    public String a() {
        String f7;
        f e7 = f.e();
        if (A4.a.f543a.booleanValue()) {
            return e7.d();
        }
        String c7 = e7.c();
        long longValue = c7 != null ? ((Long) this.f993a.getRemoteConfigValueOrDefault(c7, -1L)).longValue() : -1L;
        String a7 = e7.a();
        if (!f.g(longValue) || (f7 = f.f(longValue)) == null) {
            M4.g e8 = e(e7);
            return e8.d() ? (String) e8.c() : e7.d();
        }
        this.f995c.m(a7, f7);
        return f7;
    }

    public final M4.g b(v vVar) {
        return this.f995c.c(vVar.a());
    }

    public final M4.g c(v vVar) {
        return this.f995c.d(vVar.a());
    }

    public final M4.g d(v vVar) {
        return this.f995c.g(vVar.a());
    }

    public final M4.g e(v vVar) {
        return this.f995c.h(vVar.a());
    }

    public double f() {
        Double d7;
        e e7 = e.e();
        M4.g o7 = o(e7);
        if (o7.d()) {
            double doubleValue = ((Double) o7.c()).doubleValue() / 100.0d;
            if (M(doubleValue)) {
                return doubleValue;
            }
        }
        M4.g v7 = v(e7);
        if (v7.d() && M(((Double) v7.c()).doubleValue())) {
            this.f995c.k(e7.a(), ((Double) v7.c()).doubleValue());
        } else {
            v7 = c(e7);
            if (!v7.d() || !M(((Double) v7.c()).doubleValue())) {
                d7 = e7.d();
                return d7.doubleValue();
            }
        }
        d7 = (Double) v7.c();
        return d7.doubleValue();
    }

    public boolean h() {
        Boolean d7;
        d e7 = d.e();
        M4.g n7 = n(e7);
        if (!n7.d()) {
            n7 = u(e7);
            if (n7.d()) {
                this.f995c.n(e7.a(), ((Boolean) n7.c()).booleanValue());
            } else {
                n7 = b(e7);
                if (!n7.d()) {
                    d7 = e7.d();
                    return d7.booleanValue();
                }
            }
        }
        d7 = (Boolean) n7.c();
        return d7.booleanValue();
    }

    public Boolean i() {
        b e7 = b.e();
        M4.g n7 = n(e7);
        return n7.d() ? (Boolean) n7.c() : e7.d();
    }

    public Boolean j() {
        Object c7;
        if (i().booleanValue()) {
            return Boolean.FALSE;
        }
        c d7 = c.d();
        M4.g b7 = b(d7);
        if (b7.d()) {
            c7 = b7.c();
        } else {
            M4.g n7 = n(d7);
            if (!n7.d()) {
                return null;
            }
            c7 = n7.c();
        }
        return (Boolean) c7;
    }

    public final boolean k() {
        Boolean d7;
        l e7 = l.e();
        M4.g u7 = u(e7);
        if (!u7.d()) {
            u7 = b(e7);
            if (!u7.d()) {
                d7 = e7.d();
                return d7.booleanValue();
            }
        } else {
            if (this.f993a.isLastFetchFailed()) {
                return false;
            }
            this.f995c.n(e7.a(), ((Boolean) u7.c()).booleanValue());
        }
        d7 = (Boolean) u7.c();
        return d7.booleanValue();
    }

    public final boolean l() {
        String d7;
        k e7 = k.e();
        M4.g x7 = x(e7);
        if (x7.d()) {
            this.f995c.m(e7.a(), (String) x7.c());
        } else {
            x7 = e(e7);
            if (!x7.d()) {
                d7 = e7.d();
                return J(d7);
            }
        }
        d7 = (String) x7.c();
        return J(d7);
    }

    public boolean m() {
        return k() && !l();
    }

    public final M4.g n(v vVar) {
        return this.f994b.b(vVar.b());
    }

    public final M4.g o(v vVar) {
        return this.f994b.c(vVar.b());
    }

    public final M4.g p(v vVar) {
        return this.f994b.e(vVar.b());
    }

    public long q() {
        Long d7;
        g e7 = g.e();
        M4.g w7 = w(e7);
        if (w7.d() && I(((Long) w7.c()).longValue())) {
            this.f995c.l(e7.a(), ((Long) w7.c()).longValue());
        } else {
            w7 = d(e7);
            if (!w7.d() || !I(((Long) w7.c()).longValue())) {
                d7 = e7.d();
                return d7.longValue();
            }
        }
        d7 = (Long) w7.c();
        return d7.longValue();
    }

    public long r() {
        Long d7;
        h e7 = h.e();
        M4.g w7 = w(e7);
        if (w7.d() && I(((Long) w7.c()).longValue())) {
            this.f995c.l(e7.a(), ((Long) w7.c()).longValue());
        } else {
            w7 = d(e7);
            if (!w7.d() || !I(((Long) w7.c()).longValue())) {
                d7 = e7.d();
                return d7.longValue();
            }
        }
        d7 = (Long) w7.c();
        return d7.longValue();
    }

    public double s() {
        Double e7;
        i f7 = i.f();
        M4.g v7 = v(f7);
        if (v7.d() && M(((Double) v7.c()).doubleValue())) {
            this.f995c.k(f7.a(), ((Double) v7.c()).doubleValue());
        } else {
            v7 = c(f7);
            if (!v7.d() || !M(((Double) v7.c()).doubleValue())) {
                e7 = this.f993a.isLastFetchFailed() ? f7.e() : f7.d();
                return e7.doubleValue();
            }
        }
        e7 = (Double) v7.c();
        return e7.doubleValue();
    }

    public long t() {
        Long d7;
        j e7 = j.e();
        M4.g w7 = w(e7);
        if (w7.d() && O(((Long) w7.c()).longValue())) {
            this.f995c.l(e7.a(), ((Long) w7.c()).longValue());
        } else {
            w7 = d(e7);
            if (!w7.d() || !O(((Long) w7.c()).longValue())) {
                d7 = e7.d();
                return d7.longValue();
            }
        }
        d7 = (Long) w7.c();
        return d7.longValue();
    }

    public final M4.g u(v vVar) {
        return this.f993a.getBoolean(vVar.c());
    }

    public final M4.g v(v vVar) {
        return this.f993a.getDouble(vVar.c());
    }

    public final M4.g w(v vVar) {
        return this.f993a.getLong(vVar.c());
    }

    public final M4.g x(v vVar) {
        return this.f993a.getString(vVar.c());
    }

    public long y() {
        Long d7;
        m e7 = m.e();
        M4.g p7 = p(e7);
        if (!p7.d() || !K(((Long) p7.c()).longValue())) {
            p7 = w(e7);
            if (p7.d() && K(((Long) p7.c()).longValue())) {
                this.f995c.l(e7.a(), ((Long) p7.c()).longValue());
            } else {
                p7 = d(e7);
                if (!p7.d() || !K(((Long) p7.c()).longValue())) {
                    d7 = e7.d();
                    return d7.longValue();
                }
            }
        }
        d7 = (Long) p7.c();
        return d7.longValue();
    }

    public long z() {
        Long e7;
        n f7 = n.f();
        M4.g p7 = p(f7);
        if (!p7.d() || !K(((Long) p7.c()).longValue())) {
            p7 = w(f7);
            if (p7.d() && K(((Long) p7.c()).longValue())) {
                this.f995c.l(f7.a(), ((Long) p7.c()).longValue());
            } else {
                p7 = d(f7);
                if (!p7.d() || !K(((Long) p7.c()).longValue())) {
                    e7 = this.f993a.isLastFetchFailed() ? f7.e() : f7.d();
                    return e7.longValue();
                }
            }
        }
        e7 = (Long) p7.c();
        return e7.longValue();
    }
}
