// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package P4;

import t0.f;
import android.app.Application;
import java.util.concurrent.atomic.AtomicReference;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import Q4.p;
import Q4.l;
import java.util.Iterator;
import Q4.r;
import com.google.firebase.remoteconfig.internal.d;
import w3.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import V2.m;
import java.util.HashMap;
import E2.h;
import r4.b;
import t3.c;
import s4.i;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;
import java.util.Map;
import java.util.Random;
import E2.e;

public class x
{
    public static final e j;
    public static final Random k;
    public static final Map l;
    public final Map a;
    public final Context b;
    public final ScheduledExecutorService c;
    public final s3.e d;
    public final i e;
    public final c f;
    public final b g;
    public final String h;
    public Map i;
    
    static {
        j = h.d();
        k = new Random();
        l = new HashMap();
    }
    
    public x(final Context context, final ScheduledExecutorService scheduledExecutorService, final s3.e e, final i i, final c c, final b b) {
        this(context, scheduledExecutorService, e, i, c, b, true);
    }
    
    public x(final Context b, final ScheduledExecutorService c, final s3.e d, final i e, final c f, final b g, final boolean b2) {
        this.a = new HashMap();
        this.i = new HashMap();
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = d.r().c();
        c(b);
        if (b2) {
            m.c(c, new v(this));
        }
    }
    
    public static d j(final Context context, final String s, final String s2) {
        return new d(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", s, s2, "settings"), 0));
    }
    
    public static r k(final s3.e e, final String s, final b b) {
        if (n(e) && s.equals("firebase")) {
            return new r(b);
        }
        return null;
    }
    
    public static boolean m(final s3.e e, final String s) {
        return s.equals("firebase") && n(e);
    }
    
    public static boolean n(final s3.e e) {
        return e.q().equals("[DEFAULT]");
    }
    
    public static void p(final boolean b) {
        // monitorenter(x.class)
        // monitorexit(x.class)
        Label_0050: {
            try {
                final Iterator<P4.m> iterator = x.l.values().iterator();
                while (iterator.hasNext()) {
                    iterator.next().y(b);
                }
            }
            finally {
                break Label_0050;
            }
            return;
        }
    }
    // monitorexit(x.class)
    
    public P4.m c(final String s) {
        // monitorenter(this)
        while (true) {
            try {
                final Q4.e e = this.e(s, "fetch");
                final Q4.e e2 = this.e(s, "activate");
                final Q4.e e3 = this.e(s, "defaults");
                final d j = j(this.b, this.h, s);
                final l i = this.i(e2, e3);
                final r k = k(this.d, s, this.g);
                if (k != null) {
                    i.b(new u(k));
                }
                // monitorexit(this)
                return this.d(this.d, s, this.e, this.f, this.c, e, e2, e3, this.g(s, e, j), i, j);
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public P4.m d(final s3.e e, final String s, final i i, c c, final Executor executor, final Q4.e e2, final Q4.e e3, final Q4.e e4, final com.google.firebase.remoteconfig.internal.c c2, final l l, final d d) {
        // monitorenter(this)
        while (true) {
            try {
                if (!this.a.containsKey(s)) {
                    final Context b = this.b;
                    if (!m(e, s)) {
                        c = null;
                    }
                    final P4.m m = new P4.m(b, e, i, c, executor, e2, e3, e4, c2, l, d, this.l(e, i, c2, e3, this.b, s, d));
                    m.B();
                    this.a.put(s, m);
                    x.l.put(s, m);
                }
                // monitorexit(this)
                return this.a.get(s);
            }
            // monitorexit(this)
            finally {}
            continue;
        }
    }
    
    public final Q4.e e(String format, final String s) {
        format = String.format("%s_%s_%s_%s.json", "frc", this.h, format, s);
        return Q4.e.h(this.c, p.c(this.b, format));
    }
    
    public P4.m f() {
        return this.c("firebase");
    }
    
    public com.google.firebase.remoteconfig.internal.c g(final String s, final Q4.e e, final d d) {
        // monitorenter(this)
        while (true) {
            try {
                final i e2 = this.e;
                b g;
                if (n(this.d)) {
                    g = this.g;
                }
                else {
                    g = new w();
                }
                // monitorexit(this)
                return new com.google.firebase.remoteconfig.internal.c(e2, g, this.c, x.j, x.k, e, this.h(this.d.r().b(), s, d), d, this.i);
            }
            // monitorexit(this)
            finally {}
            continue;
        }
    }
    
    public ConfigFetchHttpClient h(final String s, final String s2, final d d) {
        return new ConfigFetchHttpClient(this.b, this.d.r().c(), s, s2, d.b(), d.b());
    }
    
    public final l i(final Q4.e e, final Q4.e e2) {
        return new l(this.c, e, e2);
    }
    
    public Q4.m l(final s3.e e, final i i, final com.google.firebase.remoteconfig.internal.c c, final Q4.e e2, final Context context, final String s, final d d) {
        synchronized (this) {
            return new Q4.m(e, i, c, e2, context, s, d, this.c);
        }
    }
    
    public static class a implements c.a
    {
        public static final AtomicReference a;
        
        static {
            a = new AtomicReference();
        }
        
        public static void c(final Context context) {
            final Application application = (Application)context.getApplicationContext();
            final AtomicReference a = x.a.a;
            if (a.get() == null) {
                final a a2 = new a();
                if (f.a(a, null, a2)) {
                    c.c(application);
                    c.b().a((c.a)a2);
                }
            }
        }
        
        @Override
        public void a(final boolean b) {
            p(b);
        }
    }
}
