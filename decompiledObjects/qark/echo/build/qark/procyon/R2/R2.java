// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import java.util.Map;
import com.google.android.gms.internal.measurement.d0;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.C;
import E2.o;
import android.os.Binder;
import android.text.TextUtils;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import com.google.android.gms.internal.measurement.n6;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Callable;
import java.util.List;
import android.os.Bundle;
import A2.n;

public final class R2 extends Q1
{
    public final D5 b;
    public Boolean c;
    public String d;
    
    public R2(final D5 d5) {
        this(d5, null);
    }
    
    public R2(final D5 b, final String s) {
        n.i(b);
        this.b = b;
        this.d = null;
    }
    
    @Override
    public final void D0(final W5 w5) {
        n.e(w5.o);
        this.a1(w5.o, false);
        this.v(new a3(this, w5));
    }
    
    @Override
    public final List F(final W5 w5, Bundle w6) {
        this.c1(w5, false);
        n.i(w5.o);
        w6 = (ExecutionException)this.b.e().w(new k3(this, w5, (Bundle)w6));
        try {
            w6 = (ExecutionException)((Future<List<?>>)w6).get();
            return (List)w6;
        }
        catch (ExecutionException w6) {}
        catch (InterruptedException ex) {}
        this.b.j().G().c("Failed to get trigger URIs. appId", Y1.v(w5.o), w6);
        return Collections.emptyList();
    }
    
    @Override
    public final String G(final W5 w5) {
        this.c1(w5, false);
        return this.b.R(w5);
    }
    
    @Override
    public final void I0(final long n, final String s, final String s2, final String s3) {
        this.v(new V2(this, s2, s3, s, n));
    }
    
    @Override
    public final List K0(String w, final String s, final String s2) {
        this.a1((String)w, true);
        w = (ExecutionException)this.b.e().w(new b3(this, (String)w, s, s2));
        try {
            w = (ExecutionException)((Future<List<?>>)w).get();
            return (List)w;
        }
        catch (ExecutionException w) {}
        catch (InterruptedException ex) {}
        this.b.j().G().b("Failed to get conditional user properties as", w);
        return Collections.emptyList();
    }
    
    @Override
    public final List L0(final W5 w5, final boolean b) {
        this.c1(w5, false);
        final String o = w5.o;
        n.i(o);
        final Future w6 = this.b.e().w(new j3(this, o));
        while (true) {
            try {
                final List<T5> list = w6.get();
                final ArrayList list2 = new ArrayList<R5>(list.size());
                for (final T5 t5 : list) {
                    if (b || !S5.H0(t5.c)) {
                        list2.add(new R5(t5));
                    }
                }
                return list2;
                final ExecutionException ex;
                this.b.j().G().c("Failed to get user properties. appId", Y1.v(w5.o), ex);
                return null;
            }
            catch (ExecutionException ex) {
                continue;
            }
            catch (InterruptedException ex) {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final byte[] M0(final I i, final String s) {
        n.e(s);
        n.i(i);
        this.a1(s, true);
        this.b.j().F().b("Log and bundle. event", this.b.f0().c(i.o));
        final long n = this.b.b().c() / 1000000L;
        final Future b = this.b.e().B(new h3(this, i, s));
        while (true) {
            try {
                byte[] array;
                if ((array = b.get()) == null) {
                    this.b.j().G().b("Log and bundle returned null. appId", Y1.v(s));
                    array = new byte[0];
                }
                this.b.j().F().d("Log and bundle processed. event, size, time_ms", this.b.f0().c(i.o), array.length, this.b.b().c() / 1000000L - n);
                return array;
                final ExecutionException ex;
                this.b.j().G().d("Failed to log and bundle. appId, event, error", Y1.v(s), this.b.f0().c(i.o), ex);
                return null;
            }
            catch (ExecutionException ex) {
                continue;
            }
            catch (InterruptedException ex) {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final void N(final W5 w5) {
        this.c1(w5, false);
        this.v(new T2(this, w5));
    }
    
    @Override
    public final void O0(final Bundle bundle, final W5 w5) {
        this.c1(w5, false);
        final String o = w5.o;
        n.i(o);
        this.v(new Q2(this, o, bundle));
    }
    
    @Override
    public final R2.n P0(final W5 w5) {
        this.c1(w5, false);
        n.e(w5.o);
        if (n6.a()) {
            Object b = this.b.e().B(new c3(this, w5));
            try {
                b = ((Future<R2.n>)b).get(10000L, TimeUnit.MILLISECONDS);
                return (R2.n)b;
            }
            catch (ExecutionException b) {}
            catch (InterruptedException b) {}
            catch (TimeoutException ex) {}
            this.b.j().G().c("Failed to get consent. appId", Y1.v(w5.o), b);
            return new R2.n(null);
        }
        return new R2.n(null);
    }
    
    @Override
    public final void R0(final I i, final W5 w5) {
        n.i(i);
        this.c1(w5, false);
        this.v(new f3(this, i, w5));
    }
    
    @Override
    public final void S0(final I i, final String s, final String s2) {
        n.i(i);
        n.e(s);
        this.a1(s, true);
        this.v(new e3(this, i, s));
    }
    
    @Override
    public final void U0(final W5 w5) {
        n.e(w5.o);
        n.i(w5.J);
        final d3 d3 = new d3(this, w5);
        n.i(d3);
        if (this.b.e().J()) {
            d3.run();
            return;
        }
        this.b.e().G(d3);
    }
    
    @Override
    public final List V0(String w, final String s, final W5 w2) {
        this.c1(w2, false);
        final String o = w2.o;
        n.i(o);
        w = (ExecutionException)this.b.e().w(new Y2(this, o, (String)w, s));
        try {
            w = (ExecutionException)((Future<List<?>>)w).get();
            return (List)w;
        }
        catch (ExecutionException w) {}
        catch (InterruptedException ex) {}
        this.b.j().G().b("Failed to get conditional user properties", w);
        return Collections.emptyList();
    }
    
    @Override
    public final List W(final String s, final String s2, final String s3, final boolean b) {
        this.a1(s, true);
        final Future w = this.b.e().w(new Z2(this, s, s2, s3));
        while (true) {
            try {
                final List<T5> list = w.get();
                final ArrayList list2 = new ArrayList<R5>(list.size());
                for (final T5 t5 : list) {
                    if (b || !S5.H0(t5.c)) {
                        list2.add(new R5(t5));
                    }
                }
                return list2;
                final ExecutionException ex;
                this.b.j().G().c("Failed to get user properties as. appId", Y1.v(s), ex);
                return Collections.emptyList();
            }
            catch (ExecutionException ex) {
                continue;
            }
            catch (InterruptedException ex) {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final void Z(final R5 r5, final W5 w5) {
        n.i(r5);
        this.c1(w5, false);
        this.v(new g3(this, r5, w5));
    }
    
    public final void a1(final String d, final boolean b) {
        Label_0172: {
            if (TextUtils.isEmpty((CharSequence)d)) {
                break Label_0172;
            }
            Label_0087: {
                if (!b) {
                    break Label_0087;
                }
                while (true) {
                    while (true) {
                        Label_0208: {
                            while (true) {
                                try {
                                    if (this.c == null) {
                                        if ("com.google.android.gms".equals(this.d) || o.a(this.b.a(), Binder.getCallingUid()) || x2.o.a(this.b.a()).c(Binder.getCallingUid())) {
                                            break Label_0208;
                                        }
                                        final boolean b2 = false;
                                        this.c = b2;
                                    }
                                    if (this.c) {
                                        break;
                                    }
                                    if (this.d == null && x2.n.i(this.b.a(), Binder.getCallingUid(), d)) {
                                        this.d = d;
                                    }
                                    if (d.equals(this.d)) {
                                        return;
                                    }
                                    throw new SecurityException(String.format("Unknown calling package name '%s'.", d));
                                    this.b.j().G().a("Measurement Service called without app package");
                                    throw new SecurityException("Measurement Service called without app package");
                                    this.b.j().G().b("Measurement Service called with invalid calling package. appId", Y1.v(d));
                                    throw;
                                }
                                catch (SecurityException ex2) {}
                                final SecurityException ex2;
                                final SecurityException ex = ex2;
                                continue;
                            }
                        }
                        final boolean b2 = true;
                        continue;
                    }
                }
            }
        }
    }
    
    public final I b1(final I i, final W5 w5) {
        if ("_cmp".equals(i.o)) {
            final D p2 = i.p;
            if (p2 != null) {
                if (p2.a() == 0) {
                    return i;
                }
                final String q = i.p.q("_cis");
                if ("referrer broadcast".equals(q) || "referrer API".equals(q)) {
                    this.b.j().J().b("Event has been filtered ", i.toString());
                    return new I("_cmpx", i.p, i.q, i.r);
                }
            }
        }
        return i;
    }
    
    @Override
    public final void c0(final W5 w5) {
        this.c1(w5, false);
        this.v(new S2(this, w5));
    }
    
    public final void c1(final W5 w5, final boolean b) {
        n.i(w5);
        n.e(w5.o);
        this.a1(w5.o, false);
        this.b.n0().j0(w5.p, w5.E);
    }
    
    public final void d1(I iterator, final W5 w5) {
        if (!this.b.h0().W(w5.o)) {
            this.e1(iterator, w5);
            return;
        }
        this.b.j().K().b("EES config found for", w5.o);
        final x2 h0 = this.b.h0();
        final String o = w5.o;
        C c;
        if (TextUtils.isEmpty((CharSequence)o)) {
            c = null;
        }
        else {
            c = (C)h0.j.c(o);
        }
        if (c == null) {
            this.b.j().K().b("EES not loaded for", w5.o);
        }
        else {
        Label_0334_Outer:
            while (true) {
                while (true) {
                    try {
                        final Map o2 = this.b.m0().O(iterator.p.g(), true);
                        String s;
                        if ((s = r3.a(iterator.o)) == null) {
                            s = iterator.o;
                        }
                        while (true) {
                            if (!c.d(new e(s, iterator.r, o2))) {
                                this.b.j().K().b("EES was not applied to event", iterator.o);
                                break;
                            }
                            I b = iterator;
                            if (c.g()) {
                                this.b.j().K().b("EES edited event", iterator.o);
                                b = this.b.m0().B(c.a().d());
                            }
                            this.e1(b, w5);
                            if (c.f()) {
                                iterator = (I)c.a().f().iterator();
                                while (((Iterator)iterator).hasNext()) {
                                    final e e = ((Iterator<e>)iterator).next();
                                    this.b.j().K().b("EES logging created event", e.e());
                                    this.e1(this.b.m0().B(e), w5);
                                }
                            }
                            return;
                            this.b.j().G().c("EES error. appId, eventName", w5.p, iterator.o);
                            continue Label_0334_Outer;
                        }
                    }
                    catch (d0 d0) {}
                    continue;
                }
            }
        }
        this.e1(iterator, w5);
    }
    
    public final void e1(final I i, final W5 w5) {
        this.b.o0();
        this.b.q(i, w5);
    }
    
    @Override
    public final void m0(R2.e e, final W5 w5) {
        n.i(e);
        n.i(e.q);
        this.c1(w5, false);
        e = new R2.e(e);
        e.o = w5.o;
        this.v(new U2(this, e, w5));
    }
    
    @Override
    public final void n0(final R2.e e) {
        n.i(e);
        n.i(e.q);
        n.e(e.o);
        this.a1(e.o, true);
        this.v(new X2(this, new R2.e(e)));
    }
    
    public final void v(final Runnable runnable) {
        n.i(runnable);
        if (this.b.e().J()) {
            runnable.run();
            return;
        }
        this.b.e().D(runnable);
    }
    
    @Override
    public final List x0(final String s, final String s2, final boolean b, final W5 w5) {
        this.c1(w5, false);
        final String o = w5.o;
        n.i(o);
        final Future w6 = this.b.e().w(new W2(this, o, s, s2));
        while (true) {
            try {
                final List<T5> list = w6.get();
                final ArrayList list2 = new ArrayList<R5>(list.size());
                for (final T5 t5 : list) {
                    if (b || !S5.H0(t5.c)) {
                        list2.add(new R5(t5));
                    }
                }
                return list2;
                final ExecutionException ex;
                this.b.j().G().c("Failed to query user properties. appId", Y1.v(w5.o), ex);
                return Collections.emptyList();
            }
            catch (ExecutionException ex) {
                continue;
            }
            catch (InterruptedException ex) {
                continue;
            }
            break;
        }
    }
}
