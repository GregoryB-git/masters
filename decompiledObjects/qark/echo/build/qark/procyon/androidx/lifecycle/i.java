// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.lifecycle;

import n.b;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import n.a;

public class i extends d
{
    public n.a b;
    public c c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public ArrayList h;
    public final boolean i;
    
    public i(final h h) {
        this(h, true);
    }
    
    public i(final h referent, final boolean i) {
        this.b = new n.a();
        this.e = 0;
        this.f = false;
        this.g = false;
        this.h = new ArrayList();
        this.d = new WeakReference((T)referent);
        this.c = androidx.lifecycle.d.c.p;
        this.i = i;
    }
    
    public static c k(final c o, final c c) {
        c c2 = o;
        if (c != null) {
            c2 = o;
            if (c.compareTo(o) < 0) {
                c2 = c;
            }
        }
        return c2;
    }
    
    @Override
    public void a(final g g) {
        this.f("addObserver");
        final c c = this.c;
        c c2 = androidx.lifecycle.d.c.o;
        if (c != c2) {
            c2 = androidx.lifecycle.d.c.p;
        }
        final a a = new a(g, c2);
        if (this.b.k(g, a) != null) {
            return;
        }
        final h h = (h)this.d.get();
        if (h == null) {
            return;
        }
        final boolean b = this.e != 0 || this.f;
        c o = this.e(g);
        ++this.e;
        while (a.a.compareTo(o) < 0 && this.b.contains(g)) {
            this.n(a.a);
            final b h2 = androidx.lifecycle.d.b.h(a.a);
            if (h2 == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("no event up from ");
                sb.append(a.a);
                throw new IllegalStateException(sb.toString());
            }
            a.a(h, h2);
            this.m();
            o = this.e(g);
        }
        if (!b) {
            this.p();
        }
        --this.e;
    }
    
    @Override
    public c b() {
        return this.c;
    }
    
    @Override
    public void c(final g g) {
        this.f("removeObserver");
        this.b.q(g);
    }
    
    public final void d(final h h) {
        final Iterator descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext() && !this.g) {
            final Map.Entry<K, a> entry = descendingIterator.next();
            final a a = entry.getValue();
            while (a.a.compareTo(this.c) > 0 && !this.g && this.b.contains(entry.getKey())) {
                final b c = androidx.lifecycle.d.b.c(a.a);
                if (c == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("no event down from ");
                    sb.append(a.a);
                    throw new IllegalStateException(sb.toString());
                }
                this.n(c.e());
                a.a(h, c);
                this.m();
            }
        }
    }
    
    public final c e(final g g) {
        final Map.Entry s = this.b.s(g);
        c c = null;
        c a;
        if (s != null) {
            a = s.getValue().a;
        }
        else {
            a = null;
        }
        if (!this.h.isEmpty()) {
            final ArrayList h = this.h;
            c = h.get(h.size() - 1);
        }
        return k(k(this.c, a), c);
    }
    
    public final void f(final String str) {
        if (!this.i) {
            return;
        }
        if (m.a.d().b()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Method ");
        sb.append(str);
        sb.append(" must be called on the main thread");
        throw new IllegalStateException(sb.toString());
    }
    
    public final void g(final h h) {
        final n.b.d f = this.b.f();
        while (f.hasNext() && !this.g) {
            final Map.Entry<K, a> entry = f.next();
            final a a = entry.getValue();
            while (a.a.compareTo(this.c) < 0 && !this.g && this.b.contains(entry.getKey())) {
                this.n(a.a);
                final b h2 = androidx.lifecycle.d.b.h(a.a);
                if (h2 == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("no event up from ");
                    sb.append(a.a);
                    throw new IllegalStateException(sb.toString());
                }
                a.a(h, h2);
                this.m();
            }
        }
    }
    
    public void h(final b b) {
        this.f("handleLifecycleEvent");
        this.l(b.e());
    }
    
    public final boolean i() {
        if (this.b.size() == 0) {
            return true;
        }
        final c a = this.b.a().getValue().a;
        final c a2 = this.b.g().getValue().a;
        return a == a2 && this.c == a2;
    }
    
    public void j(final c c) {
        this.f("markState");
        this.o(c);
    }
    
    public final void l(final c c) {
        if (this.c == c) {
            return;
        }
        this.c = c;
        if (!this.f && this.e == 0) {
            this.f = true;
            this.p();
            this.f = false;
            return;
        }
        this.g = true;
    }
    
    public final void m() {
        final ArrayList h = this.h;
        h.remove(h.size() - 1);
    }
    
    public final void n(final c e) {
        this.h.add(e);
    }
    
    public void o(final c c) {
        this.f("setCurrentState");
        this.l(c);
    }
    
    public final void p() {
        final h h = (h)this.d.get();
        if (h != null) {
            while (true) {
                final boolean i = this.i();
                this.g = false;
                if (i) {
                    break;
                }
                if (this.c.compareTo(this.b.a().getValue().a) < 0) {
                    this.d(h);
                }
                final Map.Entry g = this.b.g();
                if (this.g || g == null || this.c.compareTo(g.getValue().a) <= 0) {
                    continue;
                }
                this.g(h);
            }
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }
    
    public static class a
    {
        public c a;
        public f b;
        
        public a(final g g, final c a) {
            this.b = j.f(g);
            this.a = a;
        }
        
        public void a(final h h, final b b) {
            final c e = b.e();
            this.a = androidx.lifecycle.i.k(this.a, e);
            this.b.a(h, b);
            this.a = e;
        }
    }
}
