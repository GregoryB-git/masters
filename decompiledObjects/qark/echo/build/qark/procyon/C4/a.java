// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C4;

import android.content.Context;
import M4.g;
import M4.f;
import com.google.firebase.perf.config.RemoteConfigManager;

public class a
{
    public static final F4.a d;
    public static volatile a e;
    public final RemoteConfigManager a;
    public f b;
    public x c;
    
    static {
        d = F4.a.e();
    }
    
    public a(final RemoteConfigManager remoteConfigManager, final f f, final x x) {
        RemoteConfigManager instance = remoteConfigManager;
        if (remoteConfigManager == null) {
            instance = RemoteConfigManager.getInstance();
        }
        this.a = instance;
        f b;
        if ((b = f) == null) {
            b = new f();
        }
        this.b = b;
        x f2;
        if ((f2 = x) == null) {
            f2 = x.f();
        }
        this.c = f2;
    }
    
    public static a g() {
        // monitorenter(a.class)
        while (true) {
            try {
                if (a.e == null) {
                    a.e = new a(null, null, null);
                }
                // monitorexit(a.class)
                return a.e;
                // monitorexit(a.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public long A() {
        final o e = o.e();
        g g = this.p(e);
        if (!g.d() || !this.N((long)g.c())) {
            g = this.w(e);
            if (g.d() && this.N((long)g.c())) {
                this.c.l(e.a(), (long)g.c());
            }
            else {
                g = this.d(e);
                if (!g.d() || !this.N((long)g.c())) {
                    return e.d();
                }
            }
        }
        return (Long)g.c();
    }
    
    public long B() {
        final p e = p.e();
        g g = this.p(e);
        if (!g.d() || !this.K((long)g.c())) {
            g = this.w(e);
            if (g.d() && this.K((long)g.c())) {
                this.c.l(e.a(), (long)g.c());
            }
            else {
                g = this.d(e);
                if (!g.d() || !this.K((long)g.c())) {
                    return e.d();
                }
            }
        }
        return (Long)g.c();
    }
    
    public long C() {
        final q f = q.f();
        g g = this.p(f);
        if (!g.d() || !this.K((long)g.c())) {
            g = this.w(f);
            if (g.d() && this.K((long)g.c())) {
                this.c.l(f.a(), (long)g.c());
            }
            else {
                g = this.d(f);
                if (!g.d() || !this.K((long)g.c())) {
                    if (this.a.isLastFetchFailed()) {
                        return f.e();
                    }
                    return f.d();
                }
            }
        }
        return (Long)g.c();
    }
    
    public double D() {
        final r f = r.f();
        final g o = this.o(f);
        if (o.d()) {
            final double n = (double)o.c() / 100.0;
            if (this.M(n)) {
                return n;
            }
        }
        g g = this.v(f);
        if (g.d() && this.M((double)g.c())) {
            this.c.k(f.a(), (double)g.c());
        }
        else {
            g = this.c(f);
            if (!g.d() || !this.M((double)g.c())) {
                if (this.a.isLastFetchFailed()) {
                    return f.e();
                }
                return f.d();
            }
        }
        return (Double)g.c();
    }
    
    public long E() {
        final s e = s.e();
        g g = this.w(e);
        if (g.d() && this.I((long)g.c())) {
            this.c.l(e.a(), (long)g.c());
        }
        else {
            g = this.d(e);
            if (!g.d() || !this.I((long)g.c())) {
                return e.d();
            }
        }
        return (Long)g.c();
    }
    
    public long F() {
        final t e = t.e();
        g g = this.w(e);
        if (g.d() && this.I((long)g.c())) {
            this.c.l(e.a(), (long)g.c());
        }
        else {
            g = this.d(e);
            if (!g.d() || !this.I((long)g.c())) {
                return e.d();
            }
        }
        return (Long)g.c();
    }
    
    public double G() {
        final u f = u.f();
        g g = this.v(f);
        if (g.d() && this.M((double)g.c())) {
            this.c.k(f.a(), (double)g.c());
        }
        else {
            g = this.c(f);
            if (!g.d() || !this.M((double)g.c())) {
                if (this.a.isLastFetchFailed()) {
                    return f.e();
                }
                return f.d();
            }
        }
        return (Double)g.c();
    }
    
    public boolean H() {
        final g u = this.u(l.e());
        return this.b(C4.c.d()).d() || u.d();
    }
    
    public final boolean I(final long n) {
        return n >= 0L;
    }
    
    public final boolean J(final String s) {
        if (s.trim().isEmpty()) {
            return false;
        }
        final String[] split = s.split(";");
        for (int length = split.length, i = 0; i < length; ++i) {
            if (split[i].trim().equals(A4.a.b)) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean K(final long n) {
        return n >= 0L;
    }
    
    public boolean L() {
        final Boolean j = this.j();
        return (j == null || j) && this.m();
    }
    
    public final boolean M(final double n) {
        return 0.0 <= n && n <= 1.0;
    }
    
    public final boolean N(final long n) {
        return n > 0L;
    }
    
    public final boolean O(final long n) {
        return n > 0L;
    }
    
    public void P(final Context context) {
        C4.a.d.i(M4.o.b(context));
        this.c.j(context);
    }
    
    public void Q(final Boolean obj) {
        if (this.i()) {
            return;
        }
        final String a = C4.c.d().a();
        if (a != null) {
            if (obj != null) {
                this.c.n(a, Boolean.TRUE.equals(obj));
                return;
            }
            this.c.b(a);
        }
    }
    
    public void R(final f b) {
        this.b = b;
    }
    
    public String a() {
        final C4.f e = C4.f.e();
        if (A4.a.a) {
            return e.d();
        }
        final String c = e.c();
        long longValue = -1L;
        if (c != null) {
            longValue = this.a.getRemoteConfigValueOrDefault(c, -1L);
        }
        final String a = e.a();
        if (C4.f.g(longValue)) {
            final String f = C4.f.f(longValue);
            if (f != null) {
                this.c.m(a, f);
                return f;
            }
        }
        final g e2 = this.e(e);
        if (e2.d()) {
            return (String)e2.c();
        }
        return e.d();
    }
    
    public final g b(final v v) {
        return this.c.c(v.a());
    }
    
    public final g c(final v v) {
        return this.c.d(v.a());
    }
    
    public final g d(final v v) {
        return this.c.g(v.a());
    }
    
    public final g e(final v v) {
        return this.c.h(v.a());
    }
    
    public double f() {
        final e e = C4.e.e();
        final g o = this.o(e);
        if (o.d()) {
            final double n = (double)o.c() / 100.0;
            if (this.M(n)) {
                return n;
            }
        }
        g g = this.v(e);
        if (g.d() && this.M((double)g.c())) {
            this.c.k(e.a(), (double)g.c());
        }
        else {
            g = this.c(e);
            if (!g.d() || !this.M((double)g.c())) {
                return e.d();
            }
        }
        return (Double)g.c();
    }
    
    public boolean h() {
        final d e = C4.d.e();
        g g = this.n(e);
        if (!g.d()) {
            g = this.u(e);
            if (g.d()) {
                this.c.n(e.a(), (boolean)g.c());
            }
            else {
                g = this.b(e);
                if (!g.d()) {
                    return e.d();
                }
            }
        }
        return (Boolean)g.c();
    }
    
    public Boolean i() {
        final b e = C4.b.e();
        final g n = this.n(e);
        if (n.d()) {
            return (Boolean)n.c();
        }
        return e.d();
    }
    
    public Boolean j() {
        if (this.i()) {
            return Boolean.FALSE;
        }
        final c d = C4.c.d();
        final g b = this.b(d);
        Object o;
        if (b.d()) {
            o = b.c();
        }
        else {
            final g n = this.n(d);
            if (!n.d()) {
                return null;
            }
            o = n.c();
        }
        return (Boolean)o;
    }
    
    public final boolean k() {
        final l e = l.e();
        g g = this.u(e);
        if (g.d()) {
            if (this.a.isLastFetchFailed()) {
                return false;
            }
            this.c.n(e.a(), (boolean)g.c());
        }
        else {
            g = this.b(e);
            if (!g.d()) {
                return e.d();
            }
        }
        return (Boolean)g.c();
    }
    
    public final boolean l() {
        final k e = k.e();
        g g = this.x(e);
        if (g.d()) {
            this.c.m(e.a(), (String)g.c());
        }
        else {
            g = this.e(e);
            if (!g.d()) {
                final String d = e.d();
                return this.J(d);
            }
        }
        final String d = (String)g.c();
        return this.J(d);
    }
    
    public boolean m() {
        return this.k() && !this.l();
    }
    
    public final g n(final v v) {
        return this.b.b(v.b());
    }
    
    public final g o(final v v) {
        return this.b.c(v.b());
    }
    
    public final g p(final v v) {
        return this.b.e(v.b());
    }
    
    public long q() {
        final C4.g e = C4.g.e();
        g g = this.w(e);
        if (g.d() && this.I((long)g.c())) {
            this.c.l(e.a(), (long)g.c());
        }
        else {
            g = this.d(e);
            if (!g.d() || !this.I((long)g.c())) {
                return e.d();
            }
        }
        return (Long)g.c();
    }
    
    public long r() {
        final h e = h.e();
        g g = this.w(e);
        if (g.d() && this.I((long)g.c())) {
            this.c.l(e.a(), (long)g.c());
        }
        else {
            g = this.d(e);
            if (!g.d() || !this.I((long)g.c())) {
                return e.d();
            }
        }
        return (Long)g.c();
    }
    
    public double s() {
        final i f = i.f();
        g g = this.v(f);
        if (g.d() && this.M((double)g.c())) {
            this.c.k(f.a(), (double)g.c());
        }
        else {
            g = this.c(f);
            if (!g.d() || !this.M((double)g.c())) {
                if (this.a.isLastFetchFailed()) {
                    return f.e();
                }
                return f.d();
            }
        }
        return (Double)g.c();
    }
    
    public long t() {
        final j e = j.e();
        g g = this.w(e);
        if (g.d() && this.O((long)g.c())) {
            this.c.l(e.a(), (long)g.c());
        }
        else {
            g = this.d(e);
            if (!g.d() || !this.O((long)g.c())) {
                return e.d();
            }
        }
        return (Long)g.c();
    }
    
    public final g u(final v v) {
        return this.a.getBoolean(v.c());
    }
    
    public final g v(final v v) {
        return this.a.getDouble(v.c());
    }
    
    public final g w(final v v) {
        return this.a.getLong(v.c());
    }
    
    public final g x(final v v) {
        return this.a.getString(v.c());
    }
    
    public long y() {
        final m e = m.e();
        g g = this.p(e);
        if (!g.d() || !this.K((long)g.c())) {
            g = this.w(e);
            if (g.d() && this.K((long)g.c())) {
                this.c.l(e.a(), (long)g.c());
            }
            else {
                g = this.d(e);
                if (!g.d() || !this.K((long)g.c())) {
                    return e.d();
                }
            }
        }
        return (Long)g.c();
    }
    
    public long z() {
        final n f = n.f();
        g g = this.p(f);
        if (!g.d() || !this.K((long)g.c())) {
            g = this.w(f);
            if (g.d() && this.K((long)g.c())) {
                this.c.l(f.a(), (long)g.c());
            }
            else {
                g = this.d(f);
                if (!g.d() || !this.K((long)g.c())) {
                    if (this.a.isLastFetchFailed()) {
                        return f.e();
                    }
                    return f.d();
                }
            }
        }
        return (Long)g.c();
    }
}
