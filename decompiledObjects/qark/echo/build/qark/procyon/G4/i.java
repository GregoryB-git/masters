// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package G4;

import H4.e;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import L4.k;
import java.util.Map;
import M4.l;
import F4.a;

public class i
{
    public static final a f;
    public final j a;
    public final l b;
    public final Map c;
    public boolean d;
    public boolean e;
    
    static {
        f = a.e();
    }
    
    public i(final String s, final String s2, final k k, final l b) {
        this.d = false;
        this.e = false;
        this.c = new ConcurrentHashMap();
        this.b = b;
        (this.a = j.h(k).C(s).q(s2)).t();
        if (!C4.a.g().L()) {
            i.f.g("HttpMetric feature is disabled. URL %s", s);
            this.e = true;
        }
    }
    
    public final void a(final String s, final String s2) {
        if (this.d) {
            throw new IllegalArgumentException("HttpMetric has been logged already so unable to modify attributes");
        }
        if (!this.c.containsKey(s) && this.c.size() >= 5) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
        }
        H4.e.d(s, s2);
    }
    
    public void b(String s, String trim) {
        boolean b = true;
        String trim2 = s;
        String s2 = trim;
        try {
            s = (trim2 = s.trim());
            s2 = trim;
            trim = trim.trim();
            trim2 = s;
            s2 = trim;
            this.a(s, trim);
            trim2 = s;
            s2 = trim;
            i.f.b("Setting attribute '%s' to %s on network request '%s'", s, trim, this.a.k());
        }
        catch (Exception ex) {
            i.f.d("Cannot set attribute '%s' with value '%s' (%s)", trim2, s2, ex.getMessage());
            b = false;
            trim = s2;
            s = trim2;
        }
        if (b) {
            this.c.put(s, trim);
        }
    }
    
    public void c(final int n) {
        this.a.r(n);
    }
    
    public void d(final long n) {
        this.a.v(n);
    }
    
    public void e(final String s) {
        this.a.x(s);
    }
    
    public void f(final long n) {
        this.a.y(n);
    }
    
    public void g() {
        this.b.g();
        this.a.w(this.b.e());
    }
    
    public void h() {
        if (this.e) {
            return;
        }
        this.a.A(this.b.c()).p(this.c).g();
        this.d = true;
    }
}
