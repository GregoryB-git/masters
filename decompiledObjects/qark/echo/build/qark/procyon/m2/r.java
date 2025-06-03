// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m2;

import java.util.HashMap;
import g2.f;
import java.util.ArrayList;
import g2.g;
import java.util.Iterator;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import java.util.Objects;
import f2.i;
import g2.m;
import java.util.Map;
import f2.p;
import n2.c;
import p2.a;
import o2.b;
import java.util.concurrent.Executor;
import n2.d;
import g2.e;
import android.content.Context;

public class r
{
    public final Context a;
    public final e b;
    public final d c;
    public final x d;
    public final Executor e;
    public final b f;
    public final a g;
    public final a h;
    public final c i;
    
    public r(final Context a, final e b, final d c, final x d, final Executor e, final b f, final a g, final a h, final c i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public i j(final m m) {
        final b f = this.f;
        final c i = this.i;
        Objects.requireNonNull(i);
        return m.a(f2.i.a().i(this.g.a()).k(this.h.a()).j("GDT_CLIENT_METRICS").h(new f2.h(c2.b.b("proto"), ((i2.a)f.a((b.a)new h(i))).f())).d());
    }
    
    public boolean k() {
        final NetworkInfo activeNetworkInfo = ((ConnectivityManager)this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
    
    public g u(final p p2, final int n) {
        final m a = this.b.a(p2.b());
        long max = 0L;
        g e = g2.g.e(0L);
        while (this.f.a((b.a)new k(this, p2))) {
            final Iterable iterable = (Iterable)this.f.a((b.a)new l(this, p2));
            if (!iterable.iterator().hasNext()) {
                return e;
            }
            g g;
            if (a == null) {
                j2.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", p2);
                g = g2.g.a();
            }
            else {
                final ArrayList<i> list = new ArrayList<i>();
                final Iterator<n2.k> iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    list.add(iterator.next().b());
                }
                if (p2.e()) {
                    list.add(this.j(a));
                }
                g = a.b(g2.f.a().b(list).c(p2.c()).a());
            }
            if (g.c() == g2.g.a.p) {
                this.f.a((b.a)new m2.m(this, iterable, p2, max));
                this.d.b(p2, n + 1, true);
                return g;
            }
            this.f.a((b.a)new n(this, iterable));
            if (g.c() == g2.g.a.o) {
                final long n2 = max = Math.max(max, g.b());
                e = g;
                if (!p2.e()) {
                    continue;
                }
                this.f.a((b.a)new o(this));
                max = n2;
                e = g;
            }
            else {
                e = g;
                if (g.c() != g2.g.a.r) {
                    continue;
                }
                final HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
                final Iterator<n2.k> iterator2 = iterable.iterator();
                while (iterator2.hasNext()) {
                    final String j = iterator2.next().b().j();
                    Integer n3;
                    if (!hashMap.containsKey(j)) {
                        n3 = 1;
                    }
                    else {
                        n3 = hashMap.get(j) + 1;
                    }
                    hashMap.put(j, n3);
                }
                this.f.a((b.a)new m2.p(this, hashMap));
                e = g;
            }
        }
        this.f.a((b.a)new q(this, p2, max));
        return e;
    }
    
    public void v(final p p3, final int n, final Runnable runnable) {
        this.e.execute(new m2.g(this, p3, n, runnable));
    }
}
