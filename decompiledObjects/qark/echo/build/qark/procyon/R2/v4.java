// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import E2.e;
import android.content.Context;
import A2.n;
import java.util.List;
import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;
import android.app.Activity;
import java.util.Map;

public final class v4 extends f1
{
    public volatile w4 c;
    public volatile w4 d;
    public w4 e;
    public final Map f;
    public Activity g;
    public volatile boolean h;
    public volatile w4 i;
    public w4 j;
    public boolean k;
    public final Object l;
    
    public v4(final N2 n2) {
        super(n2);
        this.l = new Object();
        this.f = new ConcurrentHashMap();
    }
    
    @Override
    public final boolean A() {
        return false;
    }
    
    public final w4 C(final boolean b) {
        this.v();
        this.n();
        if (!b) {
            return this.e;
        }
        final w4 e = this.e;
        if (e != null) {
            return e;
        }
        return this.j;
    }
    
    public final String D(final Class clazz, String substring) {
        final String canonicalName = clazz.getCanonicalName();
        if (canonicalName == null) {
            return substring;
        }
        final String[] split = canonicalName.split("\\.");
        String s;
        if (split.length > 0) {
            s = split[split.length - 1];
        }
        else {
            s = "";
        }
        substring = s;
        if (s.length() > this.f().t(null)) {
            substring = s.substring(0, this.f().t(null));
        }
        return substring;
    }
    
    public final void I(final w4 w4, final w4 w5, final long n, final boolean b, final Bundle bundle) {
        this.n();
        final boolean b2 = false;
        final boolean b3 = w5 == null || w5.c != w4.c || !y4.a(w5.b, w4.b) || !y4.a(w5.a, w4.a);
        boolean b4 = b2;
        if (b) {
            b4 = b2;
            if (this.e != null) {
                b4 = true;
            }
        }
        if (b3) {
            Bundle bundle2;
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            }
            else {
                bundle2 = new Bundle();
            }
            S5.L(w4, bundle2, true);
            if (w5 != null) {
                final String a = w5.a;
                if (a != null) {
                    ((BaseBundle)bundle2).putString("_pn", a);
                }
                final String b5 = w5.b;
                if (b5 != null) {
                    ((BaseBundle)bundle2).putString("_pc", b5);
                }
                ((BaseBundle)bundle2).putLong("_pi", w5.c);
            }
            if (b4) {
                final long a2 = this.u().f.a(n);
                if (a2 > 0L) {
                    this.k().P(bundle2, a2);
                }
            }
            if (!this.f().Q()) {
                ((BaseBundle)bundle2).putLong("_mst", 1L);
            }
            String s;
            if (w4.e) {
                s = "app";
            }
            else {
                s = "auto";
            }
            long a3 = this.b().a();
            if (w4.e) {
                final long f = w4.f;
                if (f != 0L) {
                    a3 = f;
                }
            }
            this.r().U(s, "_vs", a3, bundle2);
        }
        if (b4) {
            this.J(this.e, true, n);
        }
        this.e = w4;
        if (w4.e) {
            this.j = w4;
        }
        this.t().G(w4);
    }
    
    public final void J(final w4 w4, final boolean b, final long n) {
        this.o().v(this.b().b());
        if (this.u().E(w4 != null && w4.d, b, n) && w4 != null) {
            w4.d = false;
        }
    }
    
    public final void K(final Activity activity) {
        final Object l = this.l;
        // monitorenter(l)
        while (true) {
            try {
                if (activity == this.g) {
                    this.g = null;
                }
                // monitorexit(l)
                if (!this.f().Q()) {
                    return;
                }
                this.f.remove(activity);
                return;
                // monitorexit(l)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void L(final Activity activity, w4 c, final boolean b) {
        w4 w4;
        if (this.c == null) {
            w4 = this.d;
        }
        else {
            w4 = this.c;
        }
        if (c.b == null) {
            String d;
            if (activity != null) {
                d = this.D(activity.getClass(), "Activity");
            }
            else {
                d = null;
            }
            c = new w4(c.a, d, c.c, c.e, c.f);
        }
        this.d = this.c;
        this.c = c;
        this.e().D(new A4(this, c, w4, this.b().b(), b));
    }
    
    public final void M(final Activity activity, Bundle bundle) {
        if (!this.f().Q()) {
            return;
        }
        if (bundle == null) {
            return;
        }
        bundle = bundle.getBundle("com.google.app_measurement.screen_service");
        if (bundle == null) {
            return;
        }
        this.f.put(activity, new w4(((BaseBundle)bundle).getString("name"), ((BaseBundle)bundle).getString("referrer_name"), ((BaseBundle)bundle).getLong("id")));
    }
    
    public final void N(final Activity activity, final String s, String s2) {
        if (!this.f().Q()) {
            this.j().M().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        final w4 c = this.c;
        if (c == null) {
            this.j().M().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f.get(activity) == null) {
            this.j().M().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        String d;
        if ((d = s2) == null) {
            d = this.D(activity.getClass(), "Activity");
        }
        final boolean a = y4.a(c.b, d);
        final boolean a2 = y4.a(c.a, s);
        if (a && a2) {
            this.j().M().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (s != null && (s.length() <= 0 || s.length() > this.f().t(null))) {
            this.j().M().b("Invalid screen name length in setCurrentScreen. Length", s.length());
            return;
        }
        if (d != null && (d.length() <= 0 || d.length() > this.f().t(null))) {
            this.j().M().b("Invalid class name length in setCurrentScreen. Length", d.length());
            return;
        }
        final a2 k = this.j().K();
        if (s == null) {
            s2 = "null";
        }
        else {
            s2 = s;
        }
        k.c("Setting current screen to name, class", s2, d);
        final w4 w4 = new w4(s, d, this.k().P0());
        this.f.put(activity, w4);
        this.L(activity, w4, true);
    }
    
    public final void O(final Bundle bundle, long b) {
        Object l;
        Object d;
        String string;
        Object d2;
        boolean a;
        boolean a2;
        a2 k;
        Activity g;
        final Bundle bundle2;
        w4 w4;
        Label_0321_Outer:Label_0201_Outer:
        while (true) {
            l = this.l;
            // monitorenter(l)
            while (true) {
                while (true) {
                    Label_0439: {
                        Label_0436: {
                            while (true) {
                                try {
                                    if (!this.k) {
                                        this.j().M().a("Cannot log screen view event when the app is in the background.");
                                        // monitorexit(l)
                                        return;
                                    }
                                    d = null;
                                    if (bundle == null) {
                                        break Label_0439;
                                    }
                                    string = ((BaseBundle)bundle).getString("screen_name");
                                    if (string != null && (string.length() <= 0 || string.length() > this.f().t(null))) {
                                        this.j().M().b("Invalid screen name length for screen view. Length", string.length());
                                        // monitorexit(l)
                                        return;
                                    }
                                    d = ((BaseBundle)bundle).getString("screen_class");
                                    if (d != null && (((String)d).length() <= 0 || ((String)d).length() > this.f().t(null))) {
                                        this.j().M().b("Invalid screen class length for screen view. Length", ((String)d).length());
                                        // monitorexit(l)
                                        return;
                                    }
                                    break Label_0436;
                                    // iftrue(Label_0275:, !a || !a2)
                                    // monitorexit(l)
                                    // iftrue(Label_0300:, string != null)
                                    // iftrue(Label_0201:, d != null)
                                    // iftrue(Label_0445:, g == null)
                                    // iftrue(Label_0275:, !this.h || d == null)
                                    // iftrue(Label_0349:, this.c != null)
                                    // monitorexit(l)
                                    // iftrue(Label_0317:, d2 != null)
                                Label_0321:
                                    while (true) {
                                        Block_16: {
                                        Label_0304:
                                            while (true) {
                                            Block_12_Outer:
                                                while (true) {
                                                    d = this.d;
                                                    break Label_0304;
                                                    while (true) {
                                                        this.h = false;
                                                        a = y4.a(((w4)d).b, d2);
                                                        a2 = y4.a(((w4)d).a, string);
                                                        break Label_0321;
                                                        Label_0317: {
                                                            l = d2;
                                                        }
                                                        break Label_0321;
                                                        Label_0275:
                                                        k = this.j().K();
                                                        d = "null";
                                                        break Label_0304;
                                                        d2 = d;
                                                        g = this.g;
                                                        d2 = this.D(g.getClass(), "Activity");
                                                        d = this.c;
                                                        continue Label_0321_Outer;
                                                    }
                                                    k.c("Logging screen view with name, class", d, l);
                                                    continue Block_12_Outer;
                                                }
                                                Label_0349: {
                                                    d = this.c;
                                                }
                                                break Label_0304;
                                                throw bundle2;
                                                break Block_16;
                                                Label_0300:
                                                d = string;
                                                continue Label_0304;
                                            }
                                            w4 = new w4(string, (String)d2, this.k().P0(), true, b);
                                            this.c = w4;
                                            this.d = (w4)d;
                                            this.i = w4;
                                            b = this.b().b();
                                            this.e().D(new x4(this, bundle2, w4, (w4)d, b));
                                            return;
                                        }
                                        l = "null";
                                        continue Label_0321;
                                    }
                                    this.j().M().a("Ignoring call to log screen view event with duplicate parameters.");
                                    // monitorexit(l)
                                    return;
                                }
                                finally {
                                    continue;
                                }
                                break;
                            }
                        }
                        continue Label_0201_Outer;
                    }
                    string = null;
                    continue Label_0201_Outer;
                }
                Label_0445: {
                    d2 = "Activity";
                }
                continue;
            }
        }
    }
    
    public final w4 P() {
        return this.c;
    }
    
    public final void Q(final Activity activity) {
        synchronized (this.l) {
            this.k = false;
            this.h = true;
            // monitorexit(this.l)
            final long b = this.b().b();
            if (!this.f().Q()) {
                this.c = null;
                this.e().D(new C4(this, b));
                return;
            }
            final w4 t = this.T(activity);
            this.d = this.c;
            this.c = null;
            this.e().D(new B4(this, t, b));
        }
    }
    
    public final void R(final Activity activity, final Bundle bundle) {
        if (!this.f().Q()) {
            return;
        }
        if (bundle == null) {
            return;
        }
        final w4 w4 = this.f.get(activity);
        if (w4 == null) {
            return;
        }
        final Bundle bundle2 = new Bundle();
        ((BaseBundle)bundle2).putLong("id", w4.c);
        ((BaseBundle)bundle2).putString("name", w4.a);
        ((BaseBundle)bundle2).putString("referrer_name", w4.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }
    
    public final void S(final Activity activity) {
        final Object l = this.l;
        // monitorenter(l)
        while (true) {
            Object i;
            try {
                this.k = true;
                if (activity == this.g) {
                    break Label_0087;
                }
                i = this.l;
                // monitorenter(i)
                final v4 v4 = this;
                final Activity activity2 = activity;
                v4.g = activity2;
                final v4 v5 = this;
                final boolean b = false;
                v5.h = b;
                final Object o = i;
                // monitorexit(o)
                final v4 v6 = this;
                final g g = v6.f();
                final boolean b2 = g.Q();
                if (b2) {
                    final v4 v7 = this;
                    final w4 w4 = null;
                    v7.i = w4;
                    final v4 v8 = this;
                    final G2 g2 = v8.e();
                    final v4 v9 = this;
                    final E4 e4 = new E4(v9);
                    g2.D(e4);
                }
                break Label_0087;
            }
            finally {
                // monitorexit(l)
                Label_0124: {
                    this.L(activity, this.T(activity), false);
                }
                final B o2 = this.o();
                o2.e().D(new d0(o2, o2.b().b()));
                return;
                // monitorexit(l)
                // iftrue(Label_0124:, this.f().Q())
                this.c = this.i;
                this.e().D(new z4(this));
                return;
            }
            try {
                final v4 v4 = this;
                final Activity activity2 = activity;
                v4.g = activity2;
                final v4 v5 = this;
                final boolean b = false;
                v5.h = b;
                final Object o = i;
                // monitorexit(o)
                final v4 v6 = this;
                final g g = v6.f();
                final boolean b2 = g.Q();
                if (b2) {
                    final v4 v7 = this;
                    final w4 w4 = null;
                    v7.i = w4;
                    final v4 v8 = this;
                    final G2 g2 = v8.e();
                    final v4 v9 = this;
                    final E4 e4 = new E4(v9);
                    g2.D(e4);
                    continue;
                }
                continue;
            }
            finally {}
            break;
        }
    }
    
    public final w4 T(final Activity activity) {
        n.i(activity);
        w4 w4;
        if ((w4 = this.f.get(activity)) == null) {
            w4 = new w4(null, this.D(activity.getClass(), "Activity"), this.k().P0());
            this.f.put(activity, w4);
        }
        if (this.i != null) {
            return this.i;
        }
        return w4;
    }
}
