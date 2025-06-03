// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s4;

import java.io.IOException;
import java.util.concurrent.Callable;
import V2.k;
import V2.m;
import java.util.Iterator;
import t4.a;
import android.text.TextUtils;
import u4.d;
import A2.n;
import r4.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import B3.x;
import v4.c;
import s3.e;
import java.util.concurrent.ThreadFactory;

public class h implements i
{
    public static final Object m;
    public static final ThreadFactory n;
    public final e a;
    public final c b;
    public final u4.c c;
    public final q d;
    public final x e;
    public final o f;
    public final Object g;
    public final ExecutorService h;
    public final Executor i;
    public String j;
    public Set k;
    public final List l;
    
    static {
        m = new Object();
        n = new ThreadFactory() {
            public final AtomicInteger a = new AtomicInteger(1);
            
            @Override
            public Thread newThread(final Runnable target) {
                return new Thread(target, String.format("firebase-installations-executor-%d", this.a.getAndIncrement()));
            }
        };
    }
    
    public h(final ExecutorService h, final Executor i, final e a, final c b, final u4.c c, final q d, final x e, final o f) {
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = h;
        this.i = i;
    }
    
    public h(final e e, final b b, final ExecutorService executorService, final Executor executor) {
        this(executorService, executor, e, new c(e.m(), b), new u4.c(e), q.c(), new x(new s4.c(e)), new o());
    }
    
    public static h t() {
        return u(e.o());
    }
    
    public static h u(final e e) {
        A2.n.b(e != null, "Null is not a valid value of FirebaseApp.");
        return (h)e.k(i.class);
    }
    
    public final void D() {
        A2.n.f(this.q(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        A2.n.f(this.x(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        A2.n.f(this.p(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        A2.n.b(q.h(this.q()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        A2.n.b(q.g(this.p()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }
    
    public final String E(final d d) {
        if ((!this.a.q().equals("CHIME_ANDROID_SDK") && !this.a.y()) || !d.m()) {
            return this.f.a();
        }
        String s;
        if (TextUtils.isEmpty((CharSequence)(s = this.s().f()))) {
            s = this.f.a();
        }
        return s;
    }
    
    public t4.b F(final a a) {
        synchronized (this) {
            this.k.add(a);
            return new t4.b() {};
        }
    }
    
    public final d G(final d d) {
        String i;
        if (d.d() != null && d.d().length() == 11) {
            i = this.s().i();
        }
        else {
            i = null;
        }
        final v4.d d2 = this.b.d(this.p(), d.d(), this.x(), this.q(), i);
        final int n = h$c.a[d2.e().ordinal()];
        if (n == 1) {
            return d.s(d2.c(), d2.d(), this.d.b(), d2.b().c(), d2.b().d());
        }
        if (n == 2) {
            return d.q("BAD CONFIG");
        }
        throw new j("Firebase Installations Service is unavailable. Please try again later.", s4.j.a.p);
    }
    
    public final void H(final Exception ex) {
        final Object g = this.g;
        // monitorenter(g)
        while (true) {
            try {
                final Iterator<p> iterator = (Iterator<p>)this.l.iterator();
                while (iterator.hasNext()) {
                    if (iterator.next().a(ex)) {
                        iterator.remove();
                    }
                }
                // monitorexit(g)
                return;
                // monitorexit(g)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void I(final d d) {
        final Object g = this.g;
        // monitorenter(g)
        while (true) {
            try {
                final Iterator<p> iterator = (Iterator<p>)this.l.iterator();
                while (iterator.hasNext()) {
                    if (iterator.next().b(d)) {
                        iterator.remove();
                    }
                }
                // monitorexit(g)
                return;
                // monitorexit(g)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void J(final String j) {
        synchronized (this) {
            this.j = j;
        }
    }
    
    public final void K(final d d, final d d2) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0075: {
            try {
                if (this.k.size() != 0 && !TextUtils.equals((CharSequence)d.d(), (CharSequence)d2.d())) {
                    final Iterator<a> iterator = this.k.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().a(d2.d());
                    }
                }
            }
            finally {
                break Label_0075;
            }
            return;
        }
    }
    // monitorexit(this)
    
    @Override
    public V2.j a() {
        this.D();
        final String r = this.r();
        if (r != null) {
            return V2.m.e(r);
        }
        final V2.j i = this.i();
        this.h.execute(new s4.d(this));
        return i;
    }
    
    @Override
    public V2.j b(final boolean b) {
        this.D();
        final V2.j h = this.h();
        this.h.execute(new f(this, b));
        return h;
    }
    
    public final V2.j h() {
        final k k = new k();
        this.j(new l(this.d, k));
        return k.a();
    }
    
    public final V2.j i() {
        final k k = new k();
        this.j(new s4.m(k));
        return k.a();
    }
    
    public final void j(final p p) {
        synchronized (this.g) {
            this.l.add(p);
        }
    }
    
    public V2.j k() {
        return V2.m.c(this.h, new g(this));
    }
    
    public final Void l() {
        this.J(null);
        final d v = this.v();
        if (v.k()) {
            this.b.e(this.p(), v.d(), this.x(), v.f());
        }
        this.y(v.r());
        return null;
    }
    
    public final void m(final boolean b) {
        final d v = this.v();
        while (true) {
            try {
                d d;
                if (!v.i() && !v.l()) {
                    if (!b && !this.d.f(v)) {
                        return;
                    }
                    d = this.o(v);
                }
                else {
                    d = this.G(v);
                }
                this.y(d);
                this.K(v, d);
                if (d.k()) {
                    this.J(d.d());
                }
                Exception ex;
                if (d.i()) {
                    ex = new j(s4.j.a.o);
                }
                else {
                    if (!d.j()) {
                        this.I(d);
                        return;
                    }
                    ex = new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.");
                }
                this.H(ex);
                return;
                final j j;
                this.H(j);
                return;
            }
            catch (j i) {}
            final j i;
            final j j = i;
            continue;
        }
    }
    
    public final void n(final boolean b) {
        d d = this.w();
        if (b) {
            d = d.p();
        }
        this.I(d);
        this.i.execute(new s4.e(this, b));
    }
    
    public final d o(final d d) {
        final v4.f f = this.b.f(this.p(), d.d(), this.x(), d.f());
        final int n = h$c.b[f.b().ordinal()];
        if (n == 1) {
            return d.o(f.c(), f.d(), this.d.b());
        }
        if (n == 2) {
            return d.q("BAD CONFIG");
        }
        if (n == 3) {
            this.J(null);
            return d.r();
        }
        throw new j("Firebase Installations Service is unavailable. Please try again later.", s4.j.a.p);
    }
    
    public String p() {
        return this.a.r().b();
    }
    
    public String q() {
        return this.a.r().c();
    }
    
    public final String r() {
        synchronized (this) {
            return this.j;
        }
    }
    
    public final u4.b s() {
        return (u4.b)this.e.get();
    }
    
    public final d v() {
        final Object m = s4.h.m;
        // monitorenter(m)
        while (true) {
            try {
                final s4.b a = s4.b.a(this.a.m(), "generatefid.lock");
                try {
                    final d d = this.c.d();
                    if (a != null) {
                        a.b();
                    }
                    // monitorexit(m)
                    return d;
                }
                finally {
                    if (a != null) {
                        a.b();
                    }
                }
                // monitorexit(m)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final d w() {
        final Object m = s4.h.m;
        // monitorenter(m)
        while (true) {
            try {
                final s4.b a = s4.b.a(this.a.m(), "generatefid.lock");
                Label_0064: {
                    try {
                        d d2;
                        final d d = d2 = this.c.d();
                        if (d.j()) {
                            d2 = this.c.b(d.t(this.E(d)));
                        }
                        break Label_0064;
                    }
                    finally {
                        if (a != null) {
                            a.b();
                        }
                        // monitorexit(m)
                        while (true) {
                            while (true) {
                                return;
                                a.b();
                                continue;
                            }
                            continue;
                        }
                    }
                    // iftrue(Label_0077:, a == null)
                }
                // monitorexit(m)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public String x() {
        return this.a.r().g();
    }
    
    public final void y(final d d) {
        final Object m = s4.h.m;
        // monitorenter(m)
        while (true) {
            try {
                final s4.b a = s4.b.a(this.a.m(), "generatefid.lock");
                try {
                    this.c.b(d);
                    if (a != null) {
                        a.b();
                    }
                    // monitorexit(m)
                    return;
                }
                finally {
                    if (a != null) {
                        a.b();
                    }
                }
                // monitorexit(m)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
