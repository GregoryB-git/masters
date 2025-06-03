// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package U2;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import android.text.TextUtils;
import android.util.Log;
import N2.i;
import java.util.concurrent.Executors;
import E2.p;
import android.os.PowerManager;
import A2.n;
import java.util.HashMap;
import E2.h;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;
import android.content.Context;
import android.os.WorkSource;
import N2.b;
import java.util.Set;
import java.util.concurrent.Future;
import android.os.PowerManager$WakeLock;
import java.util.concurrent.ScheduledExecutorService;

public class a
{
    public static final long r;
    public static volatile ScheduledExecutorService s;
    public static final Object t;
    public static volatile e u;
    public final Object a;
    public final PowerManager$WakeLock b;
    public int c;
    public Future d;
    public long e;
    public final Set f;
    public boolean g;
    public int h;
    public b i;
    public E2.e j;
    public WorkSource k;
    public final String l;
    public final String m;
    public final Context n;
    public final Map o;
    public AtomicInteger p;
    public final ScheduledExecutorService q;
    
    static {
        r = TimeUnit.DAYS.toMillis(366L);
        a.s = null;
        t = new Object();
        a.u = new c();
    }
    
    public a(final Context context, final int n, String packageName) {
        final String packageName2 = context.getPackageName();
        this.a = new Object();
        this.c = 0;
        this.f = new HashSet();
        this.g = true;
        this.j = E2.h.d();
        this.o = new HashMap();
        this.p = new AtomicInteger(0);
        A2.n.j(context, "WakeLock: context must not be null");
        A2.n.f(packageName, "WakeLock: wakeLockName must not be empty");
        this.n = context.getApplicationContext();
        this.m = packageName;
        this.i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            final String value = String.valueOf(packageName);
            String concat;
            if (value.length() != 0) {
                concat = "*gcore*:".concat(value);
            }
            else {
                concat = new String("*gcore*:");
            }
            this.l = concat;
        }
        else {
            this.l = packageName;
        }
        Object b = context.getSystemService("power");
        // monitorenter(b)
        while (true) {
            Label_0306: {
                if (b == null) {
                    break Label_0306;
                }
                b = ((PowerManager)b).newWakeLock(n, packageName);
                this.b = (PowerManager$WakeLock)b;
                if (E2.p.c(context)) {
                    packageName = packageName2;
                    if (E2.n.a(packageName2)) {
                        packageName = context.getPackageName();
                    }
                    final WorkSource b2 = E2.p.b(context, packageName);
                    if ((this.k = b2) != null) {
                        i((PowerManager$WakeLock)b, b2);
                    }
                }
                Label_0300: {
                    ScheduledExecutorService q;
                    if ((q = U2.a.s) != null) {
                        break Label_0300;
                    }
                    b = U2.a.t;
                    try {
                        if ((q = U2.a.s) == null) {
                            N2.h.a();
                            q = (U2.a.s = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1)));
                        }
                        // monitorexit(b)
                        this.q = q;
                        return;
                        final StringBuilder sb = new StringBuilder(29);
                        sb.append("expected a non-null reference", 0, 29);
                        throw new i(sb.toString());
                    }
                    // monitorexit(b)
                    finally {}
                }
            }
            continue;
        }
    }
    
    public static void i(final PowerManager$WakeLock ex, final WorkSource workSource) {
        try {
            ((PowerManager$WakeLock)ex).setWorkSource(workSource);
            return;
        }
        catch (ArrayIndexOutOfBoundsException ex) {}
        catch (IllegalArgumentException ex2) {}
        Log.wtf("WakeLock", ex.toString());
    }
    
    public void a(long n) {
        this.p.incrementAndGet();
        final long r = U2.a.r;
        final long n2 = Long.MAX_VALUE;
        long n3;
        final long b = n3 = Math.max(Math.min(Long.MAX_VALUE, r), 1L);
        if (n > 0L) {
            n3 = Math.min(n, b);
        }
        final Object a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                if (!this.b()) {
                    this.i = N2.b.a(false, null);
                    this.b.acquire();
                    this.j.b();
                }
                ++this.c;
                ++this.h;
                this.f(null);
                d d;
                if ((d = this.o.get(null)) == null) {
                    d = new d(null);
                    this.o.put(null, d);
                }
                ++d.a;
                final long b2 = this.j.b();
                n = n2;
                if (Long.MAX_VALUE - b2 > n3) {
                    n = b2 + n3;
                }
                if (n > this.e) {
                    this.e = n;
                    final Future d2 = this.d;
                    if (d2 != null) {
                        d2.cancel(false);
                    }
                    this.d = this.q.schedule(new U2.b(this), n3, TimeUnit.MILLISECONDS);
                }
                // monitorexit(a)
                return;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public boolean b() {
        while (true) {
            synchronized (this.a) {
                if (this.c > 0) {
                    return true;
                }
            }
            return false;
        }
    }
    
    public void c() {
        if (this.p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.l).concat(" release without a matched acquire!"));
        }
        final Object a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                this.f(null);
                if (this.o.containsKey(null)) {
                    final d d = this.o.get(null);
                    if (d != null && --d.a == 0) {
                        this.o.remove(null);
                    }
                }
                else {
                    Log.w("WakeLock", String.valueOf(this.l).concat(" counter does not exist"));
                }
                this.h(0);
                // monitorexit(a)
                return;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void d(final boolean g) {
        synchronized (this.a) {
            this.g = g;
        }
    }
    
    public final String f(final String s) {
        if (this.g) {
            TextUtils.isEmpty((CharSequence)null);
        }
        return null;
    }
    
    public final void g() {
        if (this.f.isEmpty()) {
            return;
        }
        final ArrayList<Object> list = new ArrayList<Object>(this.f);
        this.f.clear();
        if (list.size() <= 0) {
            return;
        }
        android.support.v4.media.a.a(list.get(0));
        throw null;
    }
    
    public final void h(int c) {
        final Object a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                if (!this.b()) {
                    // monitorexit(a)
                    return;
                }
                if (this.g) {
                    c = this.c - 1;
                    if ((this.c = c) > 0) {
                        // monitorexit(a)
                        return;
                    }
                }
                else {
                    this.c = 0;
                }
                this.g();
                final Iterator<d> iterator = this.o.values().iterator();
                while (iterator.hasNext()) {
                    iterator.next().a = 0;
                }
                this.o.clear();
                final Future d = this.d;
                if (d != null) {
                    d.cancel(false);
                    this.d = null;
                    this.e = 0L;
                }
                this.h = 0;
                Label_0269: {
                    if (this.b.isHeld()) {
                        try {
                            try {
                                this.b.release();
                                if (this.i != null) {
                                    this.i = null;
                                }
                                break Label_0269;
                            }
                            finally {
                                if (this.i != null) {
                                    this.i = null;
                                }
                                final RuntimeException ex;
                                Log.e("WakeLock", String.valueOf(this.l).concat(" failed to release!"), (Throwable)ex);
                            }
                            // iftrue(Label_0269:, this.i == null)
                        }
                        catch (RuntimeException ex2) {}
                    }
                    Log.e("WakeLock", String.valueOf(this.l).concat(" should be held!"));
                }
                // monitorexit(a)
                return;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
