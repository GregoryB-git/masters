/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Locale
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 */
package G4;

import F4.a;
import G4.j;
import H4.e;
import L4.k;
import M4.l;
import N4.h;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class i {
    public static final a f = a.e();
    public final j a;
    public final l b;
    public final Map c = new ConcurrentHashMap();
    public boolean d = false;
    public boolean e = false;

    public i(String string2, String object, k k8, l l8) {
        this.b = l8;
        this.a = object = j.h(k8).C(string2).q((String)object);
        object.t();
        if (!C4.a.g().L()) {
            f.g("HttpMetric feature is disabled. URL %s", string2);
            this.e = true;
        }
    }

    public final void a(String string2, String string3) {
        if (!this.d) {
            if (!this.c.containsKey((Object)string2) && this.c.size() >= 5) {
                throw new IllegalArgumentException(String.format((Locale)Locale.ENGLISH, (String)"Exceeds max limit of number of attributes - %d", (Object[])new Object[]{5}));
            }
            e.d(string2, string3);
            return;
        }
        throw new IllegalArgumentException("HttpMetric has been logged already so unable to modify attributes");
    }

    public void b(String string2, String string3) {
        boolean bl = true;
        String string4 = string2;
        String string5 = string3;
        string4 = string2 = string2.trim();
        string5 = string3;
        string3 = string3.trim();
        string4 = string2;
        string5 = string3;
        this.a(string2, string3);
        string4 = string2;
        string5 = string3;
        try {
            f.b("Setting attribute '%s' to %s on network request '%s'", string2, string3, this.a.k());
        }
        catch (Exception exception) {
            f.d("Cannot set attribute '%s' with value '%s' (%s)", string4, string5, exception.getMessage());
            bl = false;
            string3 = string5;
            string2 = string4;
        }
        if (bl) {
            this.c.put((Object)string2, (Object)string3);
        }
    }

    public void c(int n8) {
        this.a.r(n8);
    }

    public void d(long l8) {
        this.a.v(l8);
    }

    public void e(String string2) {
        this.a.x(string2);
    }

    public void f(long l8) {
        this.a.y(l8);
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

