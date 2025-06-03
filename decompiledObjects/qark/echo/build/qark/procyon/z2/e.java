// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import java.util.concurrent.Executor;
import java.util.Iterator;
import android.app.Application;
import android.support.v4.media.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import android.util.Log;
import android.os.Message;
import A2.o;
import java.util.Collection;
import y2.d;
import A2.h;
import x2.k;
import K2.i;
import t.b;
import java.util.concurrent.ConcurrentHashMap;
import android.os.Looper;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import A2.E;
import x2.j;
import android.content.Context;
import A2.t;
import A2.r;
import android.os.Handler;
import java.util.Set;
import com.google.android.gms.common.api.Status;
import android.os.Handler$Callback;

public class e implements Handler$Callback
{
    public static final Status F;
    public static final Status G;
    public static final Object H;
    public static e I;
    public p A;
    public final Set B;
    public final Set C;
    public final Handler D;
    public volatile boolean E;
    public long o;
    public long p;
    public long q;
    public boolean r;
    public r s;
    public t t;
    public final Context u;
    public final j v;
    public final E w;
    public final AtomicInteger x;
    public final AtomicInteger y;
    public final Map z;
    
    static {
        F = new Status(4, "Sign-out occurred while this API call was in progress.");
        G = new Status(4, "The user must be signed in to make this API call.");
        H = new Object();
    }
    
    public e(final Context u, final Looper looper, final j v) {
        this.o = 5000L;
        this.p = 120000L;
        this.q = 10000L;
        this.r = false;
        this.x = new AtomicInteger(1);
        this.y = new AtomicInteger(0);
        this.z = new ConcurrentHashMap(5, 0.75f, 1);
        this.A = null;
        this.B = new b();
        this.C = new b();
        this.E = true;
        this.u = u;
        final i d = new i(looper, (Handler$Callback)this);
        this.D = d;
        this.v = v;
        this.w = new E(v);
        if (E2.i.a(u)) {
            this.E = false;
        }
        d.sendMessage(d.obtainMessage(6));
    }
    
    public static Status h(final z2.b b, final x2.b obj) {
        final String b2 = b.b();
        final String value = String.valueOf(obj);
        final StringBuilder sb = new StringBuilder();
        sb.append("API: ");
        sb.append(b2);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(value);
        return new Status(obj, sb.toString());
    }
    
    public static e x(final Context context) {
        final Object h = e.H;
        // monitorenter(h)
        while (true) {
            try {
                if (e.I == null) {
                    e.I = new e(context.getApplicationContext(), A2.h.c().getLooper(), j.m());
                }
                // monitorexit(h)
                return e.I;
                // monitorexit(h)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void D(final d d, final int n, final m m, final V2.k k, final l l) {
        this.l(k, m.d(), d);
        final Q q = new Q(n, m, k, l);
        final Handler d2 = this.D;
        d2.sendMessage(d2.obtainMessage(4, (Object)new I(q, this.y.get(), d)));
    }
    
    public final void E(final A2.l l, final int n, final long n2, final int n3) {
        final Handler d = this.D;
        d.sendMessage(d.obtainMessage(18, (Object)new H(l, n, n2, n3)));
    }
    
    public final void F(final x2.b b, final int n) {
        if (!this.g(b, n)) {
            final Handler d = this.D;
            d.sendMessage(d.obtainMessage(5, n, 0, (Object)b));
        }
    }
    
    public final void a() {
        final Handler d = this.D;
        d.sendMessage(d.obtainMessage(3));
    }
    
    public final void b(final d d) {
        final Handler d2 = this.D;
        d2.sendMessage(d2.obtainMessage(7, (Object)d));
    }
    
    public final void c(final p a) {
        final Object h = e.H;
        // monitorenter(h)
        while (true) {
            try {
                if (this.A != a) {
                    this.A = a;
                    this.B.clear();
                }
                this.B.addAll(a.t());
                // monitorexit(h)
                return;
                // monitorexit(h)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void d(final p p) {
        final Object h = e.H;
        // monitorenter(h)
        while (true) {
            try {
                if (this.A == p) {
                    this.A = null;
                    this.B.clear();
                }
                // monitorexit(h)
                return;
                // monitorexit(h)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final boolean f() {
        if (this.r) {
            return false;
        }
        final A2.p a = A2.o.b().a();
        if (a != null && !a.f()) {
            return false;
        }
        final int a2 = this.w.a(this.u, 203400000);
        return a2 == -1 || a2 == 0;
    }
    
    public final boolean g(final x2.b b, final int n) {
        return this.v.w(this.u, b, n);
    }
    
    public final boolean handleMessage(final Message message) {
        final int what = message.what;
        long q = 300000L;
        final x x = null;
        switch (what) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown message id: ");
                sb.append(what);
                Log.w("GoogleApiManager", sb.toString());
                return false;
            }
            case 19: {
                this.r = false;
                return true;
            }
            case 18: {
                final H h = (H)message.obj;
                if (h.c == 0L) {
                    this.j().a(new r(h.b, Arrays.asList(h.a)));
                    return true;
                }
                final r s = this.s;
                if (s != null) {
                    final List d = s.d();
                    if (s.a() == h.b && (d == null || d.size() < h.d)) {
                        this.s.f(h.a);
                    }
                    else {
                        this.D.removeMessages(17);
                        this.k();
                    }
                }
                if (this.s == null) {
                    final ArrayList<A2.l> list = new ArrayList<A2.l>();
                    list.add(h.a);
                    this.s = new r(h.b, list);
                    final Handler d2 = this.D;
                    d2.sendMessageDelayed(d2.obtainMessage(17), h.c);
                    return true;
                }
                break;
            }
            case 17: {
                this.k();
                return true;
            }
            case 16: {
                final z z = (z)message.obj;
                if (this.z.containsKey(z2.z.b(z))) {
                    z2.x.B((x)this.z.get(z2.z.b(z)), z);
                    return true;
                }
                break;
            }
            case 15: {
                final z z2 = (z)message.obj;
                if (this.z.containsKey(z2.z.b(z2))) {
                    z2.x.A((x)this.z.get(z2.z.b(z2)), z2);
                    return true;
                }
                break;
            }
            case 14: {
                a.a(message.obj);
                throw null;
            }
            case 12: {
                if (this.z.containsKey(message.obj)) {
                    this.z.get(message.obj).a();
                    return true;
                }
                break;
            }
            case 11: {
                if (this.z.containsKey(message.obj)) {
                    this.z.get(message.obj).K();
                    return true;
                }
                break;
            }
            case 10: {
                final Iterator<z2.b> iterator = (Iterator<z2.b>)this.C.iterator();
                while (iterator.hasNext()) {
                    final x x2 = this.z.remove(iterator.next());
                    if (x2 != null) {
                        x2.J();
                    }
                }
                this.C.clear();
                return true;
            }
            case 9: {
                if (this.z.containsKey(message.obj)) {
                    this.z.get(message.obj).I();
                    return true;
                }
                break;
            }
            case 7: {
                this.i((d)message.obj);
                return true;
            }
            case 6: {
                if (!(this.u.getApplicationContext() instanceof Application)) {
                    break;
                }
                c.c((Application)this.u.getApplicationContext());
                c.b().a((c.a)new s(this));
                if (!c.b().e(true)) {
                    this.q = 300000L;
                    return true;
                }
                break;
            }
            case 5: {
                final int arg1 = message.arg1;
                final x2.b b = (x2.b)message.obj;
                final Iterator<x> iterator2 = this.z.values().iterator();
                x x3;
                do {
                    x3 = x;
                    if (!iterator2.hasNext()) {
                        break;
                    }
                    x3 = iterator2.next();
                } while (x3.q() != arg1);
                if (x3 == null) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Could not find API instance ");
                    sb2.append(arg1);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), (Throwable)new Exception());
                    return true;
                }
                if (b.a() == 13) {
                    final String e = this.v.e(b.a());
                    final String d3 = b.d();
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Error resolution was canceled by the user, original error message: ");
                    sb3.append(e);
                    sb3.append(": ");
                    sb3.append(d3);
                    z2.x.x(x3, new Status(17, sb3.toString()));
                    return true;
                }
                z2.x.x(x3, h(z2.x.u(x3), b));
                return true;
            }
            case 4:
            case 8:
            case 13: {
                final I i = (I)message.obj;
                x j;
                if ((j = this.z.get(i.c.d())) == null) {
                    j = this.i(i.c);
                }
                if (j.L() && this.y.get() != i.b) {
                    i.a.a(e.F);
                    j.J();
                    return true;
                }
                j.E(i.a);
                return true;
            }
            case 3: {
                for (final x x4 : this.z.values()) {
                    x4.C();
                    x4.D();
                }
                break;
            }
            case 2: {
                a.a(message.obj);
                throw null;
            }
            case 1: {
                if (message.obj) {
                    q = 10000L;
                }
                this.q = q;
                this.D.removeMessages(12);
                for (final z2.b b2 : this.z.keySet()) {
                    final Handler d4 = this.D;
                    d4.sendMessageDelayed(d4.obtainMessage(12, (Object)b2), this.q);
                }
                break;
            }
        }
        return true;
    }
    
    public final x i(final d d) {
        final z2.b d2 = d.d();
        x x;
        if ((x = this.z.get(d2)) == null) {
            x = new x(this, d);
            this.z.put(d2, x);
        }
        if (x.L()) {
            this.C.add(d2);
        }
        x.D();
        return x;
    }
    
    public final t j() {
        if (this.t == null) {
            this.t = A2.s.a(this.u);
        }
        return this.t;
    }
    
    public final void k() {
        final r s = this.s;
        if (s != null) {
            if (s.a() > 0 || this.f()) {
                this.j().a(s);
            }
            this.s = null;
        }
    }
    
    public final void l(final V2.k k, final int n, final d d) {
        if (n != 0) {
            final G b = z2.G.b(this, n, d.d());
            if (b != null) {
                final V2.j a = k.a();
                final Handler d2 = this.D;
                d2.getClass();
                a.c(new z2.r(d2), b);
            }
        }
    }
    
    public final int m() {
        return this.x.getAndIncrement();
    }
    
    public final x w(final z2.b b) {
        return this.z.get(b);
    }
}
