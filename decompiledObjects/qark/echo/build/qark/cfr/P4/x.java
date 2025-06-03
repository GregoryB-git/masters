/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.content.SharedPreferences
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Random
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.atomic.AtomicReference
 */
package P4;

import E2.d;
import E2.e;
import E2.h;
import P4.m;
import P4.u;
import P4.v;
import P4.w;
import Q4.l;
import Q4.p;
import Q4.r;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.c;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import r4.b;
import s4.i;
import t0.f;
import z2.c;

public class x {
    public static final e j = h.d();
    public static final Random k = new Random();
    public static final Map l = new HashMap();
    public final Map a = new HashMap();
    public final Context b;
    public final ScheduledExecutorService c;
    public final s3.e d;
    public final i e;
    public final t3.c f;
    public final b g;
    public final String h;
    public Map i = new HashMap();

    public x(Context context, ScheduledExecutorService scheduledExecutorService, s3.e e8, i i8, t3.c c8, b b8) {
        this(context, scheduledExecutorService, e8, i8, c8, b8, true);
    }

    public x(Context context, ScheduledExecutorService scheduledExecutorService, s3.e e8, i i8, t3.c c8, b b8, boolean bl) {
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = e8;
        this.e = i8;
        this.f = c8;
        this.g = b8;
        this.h = e8.r().c();
        a.c(context);
        if (bl) {
            V2.m.c((Executor)scheduledExecutorService, new v(this));
        }
    }

    public static /* synthetic */ w3.a a() {
        return x.o();
    }

    public static com.google.firebase.remoteconfig.internal.d j(Context context, String string2, String string3) {
        return new com.google.firebase.remoteconfig.internal.d(context.getSharedPreferences(String.format((String)"%s_%s_%s_%s", (Object[])new Object[]{"frc", string2, string3, "settings"}), 0));
    }

    public static r k(s3.e e8, String string2, b b8) {
        if (x.n(e8) && string2.equals((Object)"firebase")) {
            return new r(b8);
        }
        return null;
    }

    public static boolean m(s3.e e8, String string2) {
        if (string2.equals((Object)"firebase") && x.n(e8)) {
            return true;
        }
        return false;
    }

    public static boolean n(s3.e e8) {
        return e8.q().equals((Object)"[DEFAULT]");
    }

    public static /* synthetic */ w3.a o() {
        return null;
    }

    public static void p(boolean bl) {
        synchronized (x.class) {
            Throwable throwable2;
            block4 : {
                try {
                    Iterator iterator = l.values().iterator();
                    while (iterator.hasNext()) {
                        ((m)iterator.next()).y(bl);
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public m c(String object) {
        synchronized (this) {
            try {
                Q4.e e8 = this.e((String)object, "fetch");
                Q4.e e9 = this.e((String)object, "activate");
                Q4.e e10 = this.e((String)object, "defaults");
                com.google.firebase.remoteconfig.internal.d d8 = x.j(this.b, this.h, (String)object);
                l l8 = this.i(e9, e10);
                r r8 = x.k(this.d, (String)object, this.g);
                if (r8 == null) return this.d(this.d, (String)object, this.e, this.f, (Executor)this.c, e8, e9, e10, this.g((String)object, e8, d8), l8, d8);
                l8.b(new u(r8));
                return this.d(this.d, (String)object, this.e, this.f, (Executor)this.c, e8, e9, e10, this.g((String)object, e8, d8), l8, d8);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public m d(s3.e object, String string2, i i8, t3.c c8, Executor executor, Q4.e e8, Q4.e e9, Q4.e e10, c c9, l l8, com.google.firebase.remoteconfig.internal.d d8) {
        synchronized (this) {
            try {
                if (this.a.containsKey((Object)string2)) return (m)this.a.get((Object)string2);
                Context context = this.b;
                if (!x.m((s3.e)object, string2)) {
                    c8 = null;
                }
                object = new m(context, (s3.e)object, i8, c8, executor, e8, e9, e10, c9, l8, d8, this.l((s3.e)object, i8, c9, e9, this.b, string2, d8));
                object.B();
                this.a.put((Object)string2, object);
                l.put((Object)string2, object);
                return (m)this.a.get((Object)string2);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Q4.e e(String string2, String string3) {
        string2 = String.format((String)"%s_%s_%s_%s.json", (Object[])new Object[]{"frc", this.h, string2, string3});
        return Q4.e.h((Executor)this.c, p.c(this.b, string2));
    }

    public m f() {
        return this.c("firebase");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public c g(String object, Q4.e e8, com.google.firebase.remoteconfig.internal.d d8) {
        synchronized (this) {
            try {
                i i8 = this.e;
                b b8 = x.n(this.d) ? this.g : new w();
                return new c(i8, b8, (Executor)this.c, j, k, e8, this.h(this.d.r().b(), (String)object, d8), d8, this.i);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public ConfigFetchHttpClient h(String string2, String string3, com.google.firebase.remoteconfig.internal.d d8) {
        String string4 = this.d.r().c();
        return new ConfigFetchHttpClient(this.b, string4, string2, string3, d8.b(), d8.b());
    }

    public final l i(Q4.e e8, Q4.e e9) {
        return new l((Executor)this.c, e8, e9);
    }

    public Q4.m l(s3.e object, i i8, c c8, Q4.e e8, Context context, String string2, com.google.firebase.remoteconfig.internal.d d8) {
        synchronized (this) {
            object = new Q4.m((s3.e)object, i8, c8, e8, context, string2, d8, this.c);
            return object;
        }
    }

    public static class a
    implements c.a {
        public static final AtomicReference a = new AtomicReference();

        public static void c(Context context) {
            a a8;
            context = (Application)context.getApplicationContext();
            AtomicReference atomicReference = a;
            if (atomicReference.get() == null && f.a(atomicReference, null, a8 = new a())) {
                z2.c.c((Application)context);
                z2.c.b().a(a8);
            }
        }

        @Override
        public void a(boolean bl) {
            x.p(bl);
        }
    }

}

