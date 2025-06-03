// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O3;

import android.content.SharedPreferences$Editor;
import V2.m;
import java.util.concurrent.Executor;
import java.util.Locale;
import H3.D;
import H3.z;
import H3.W;
import H3.C;
import org.json.JSONObject;
import java.util.concurrent.atomic.AtomicReference;
import H3.y;
import H3.x;
import android.content.Context;

public class f implements i
{
    public final Context a;
    public final j b;
    public final g c;
    public final x d;
    public final a e;
    public final k f;
    public final y g;
    public final AtomicReference h;
    public final AtomicReference i;
    
    public f(final Context a, final j b, final x d, final g c, final a e, final k f, final y g) {
        final AtomicReference<d> h = new AtomicReference<d>();
        this.h = h;
        this.i = new AtomicReference((V)new V2.k());
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
        this.e = e;
        this.f = f;
        this.g = g;
        h.set(O3.b.b(d));
    }
    
    public static /* synthetic */ j c(final f f) {
        return f.b;
    }
    
    public static /* synthetic */ k d(final f f) {
        return f.f;
    }
    
    public static /* synthetic */ g e(final f f) {
        return f.c;
    }
    
    public static /* synthetic */ a f(final f f) {
        return f.e;
    }
    
    public static /* synthetic */ AtomicReference i(final f f) {
        return f.h;
    }
    
    public static /* synthetic */ AtomicReference j(final f f) {
        return f.i;
    }
    
    public static f l(final Context context, final String s, final C c, final L3.b b, final String s2, final String s3, final M3.g g, final y y) {
        final String g2 = c.g();
        final W w = new W();
        return new f(context, new j(s, c.h(), c.i(), c.j(), c, H3.i.h(H3.i.n(context), s, s3, s2), s3, s2, z.c(g2).e()), w, new g(w), new a(g), new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", s), b), y);
    }
    
    @Override
    public V2.j a() {
        return this.i.get().a();
    }
    
    @Override
    public d b() {
        return this.h.get();
    }
    
    public boolean k() {
        return this.n().equals(this.b.f) ^ true;
    }
    
    public final d m(final e e) {
        d d = null;
        final d d2 = null;
        d d3 = null;
        Exception ex = null;
        Label_0148: {
            Label_0138: {
                Label_0127: {
                    d b2;
                    try {
                        if (e.p.equals(e)) {
                            return d;
                        }
                        final JSONObject b = this.e.b();
                        if (b == null) {
                            break Label_0138;
                        }
                        b2 = this.c.b(b);
                        if (b2 == null) {
                            break Label_0127;
                        }
                        this.q(b, "Loaded cached settings: ");
                        final long a = this.d.a();
                        if (!e.q.equals(e)) {
                            if (b2.a(a)) {
                                E3.f.f().i("Cached settings have expired.");
                                return null;
                            }
                        }
                    }
                    catch (Exception ex) {
                        d3 = d2;
                        break Label_0148;
                    }
                    try {
                        E3.f.f().i("Returning cached settings.");
                        return b2;
                    }
                    catch (Exception ex2) {
                        d3 = b2;
                        ex = ex2;
                        break Label_0148;
                    }
                }
                E3.f.f().e("Failed to parse cached settings data.", null);
                return null;
            }
            E3.f.f().b("No cached settings data found.");
            return null;
        }
        E3.f.f().e("Failed to get cached settings", ex);
        d = d3;
        return d;
    }
    
    public final String n() {
        return H3.i.r(this.a).getString("existing_instance_identifier", "");
    }
    
    public V2.j o(final e e, final Executor executor) {
        if (!this.k()) {
            final d m = this.m(e);
            if (m != null) {
                this.h.set(m);
                this.i.get().e(m);
                return V2.m.e(null);
            }
        }
        final d i = this.m(e.q);
        if (i != null) {
            this.h.set(i);
            this.i.get().e(i);
        }
        return this.g.k(executor).p(executor, new V2.i() {
            public V2.j b(final Void void1) {
                final JSONObject a = O3.f.d(O3.f.this).a(O3.f.c(O3.f.this), true);
                if (a != null) {
                    final d b = O3.f.e(O3.f.this).b(a);
                    O3.f.f(O3.f.this).c(b.c, a);
                    O3.f.this.q(a, "Loaded settings: ");
                    final f a2 = O3.f.this;
                    a2.r(O3.f.c(a2).f);
                    O3.f.i(O3.f.this).set(b);
                    O3.f.j(O3.f.this).get().e(b);
                }
                return m.e(null);
            }
        });
    }
    
    public V2.j p(final Executor executor) {
        return this.o(O3.e.o, executor);
    }
    
    public final void q(final JSONObject jsonObject, final String str) {
        final E3.f f = E3.f.f();
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(jsonObject.toString());
        f.b(sb.toString());
    }
    
    public final boolean r(final String s) {
        final SharedPreferences$Editor edit = H3.i.r(this.a).edit();
        edit.putString("existing_instance_identifier", s);
        edit.apply();
        return true;
    }
}
