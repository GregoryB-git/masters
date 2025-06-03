package G4;

import M4.l;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class i {

    /* renamed from: f, reason: collision with root package name */
    public static final F4.a f2093f = F4.a.e();

    /* renamed from: a, reason: collision with root package name */
    public final j f2094a;

    /* renamed from: b, reason: collision with root package name */
    public final l f2095b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2098e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2097d = false;

    /* renamed from: c, reason: collision with root package name */
    public final Map f2096c = new ConcurrentHashMap();

    public i(String str, String str2, L4.k kVar, l lVar) {
        this.f2098e = false;
        this.f2095b = lVar;
        j q7 = j.h(kVar).C(str).q(str2);
        this.f2094a = q7;
        q7.t();
        if (C4.a.g().L()) {
            return;
        }
        f2093f.g("HttpMetric feature is disabled. URL %s", str);
        this.f2098e = true;
    }

    public final void a(String str, String str2) {
        if (this.f2097d) {
            throw new IllegalArgumentException("HttpMetric has been logged already so unable to modify attributes");
        }
        if (!this.f2096c.containsKey(str) && this.f2096c.size() >= 5) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
        }
        H4.e.d(str, str2);
    }

    public void b(String str, String str2) {
        boolean z7 = true;
        try {
            str = str.trim();
            str2 = str2.trim();
            a(str, str2);
            f2093f.b("Setting attribute '%s' to %s on network request '%s'", str, str2, this.f2094a.k());
        } catch (Exception e7) {
            f2093f.d("Cannot set attribute '%s' with value '%s' (%s)", str, str2, e7.getMessage());
            z7 = false;
        }
        if (z7) {
            this.f2096c.put(str, str2);
        }
    }

    public void c(int i7) {
        this.f2094a.r(i7);
    }

    public void d(long j7) {
        this.f2094a.v(j7);
    }

    public void e(String str) {
        this.f2094a.x(str);
    }

    public void f(long j7) {
        this.f2094a.y(j7);
    }

    public void g() {
        this.f2095b.g();
        this.f2094a.w(this.f2095b.e());
    }

    public void h() {
        if (this.f2098e) {
            return;
        }
        this.f2094a.A(this.f2095b.c()).p(this.f2096c).g();
        this.f2097d = true;
    }
}
