// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.lifecycle;

import java.util.Map;
import m.a;
import n.b;

public abstract class LiveData
{
    public static final Object k;
    public final Object a;
    public n.b b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final Runnable j;
    
    static {
        k = new Object();
    }
    
    public LiveData() {
        this.a = new Object();
        this.b = new n.b();
        this.c = 0;
        final Object k = LiveData.k;
        this.f = k;
        this.j = new Runnable() {
            @Override
            public void run() {
                synchronized (LiveData.this.a) {
                    final Object f = LiveData.this.f;
                    LiveData.this.f = LiveData.k;
                    // monitorexit(this.o.a)
                    LiveData.this.j(f);
                }
            }
        };
        this.e = k;
        this.g = -1;
    }
    
    public static void a(final String str) {
        if (a.d().b()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot invoke ");
        sb.append(str);
        sb.append(" on a background thread");
        throw new IllegalStateException(sb.toString());
    }
    
    public void b(int n) {
        int c = this.c;
        this.c = n + c;
        if (this.d) {
            return;
        }
        this.d = true;
        while (true) {
            while (true) {
                try {
                    while (true) {
                        final int c2 = this.c;
                        if (c == c2) {
                            break;
                        }
                        if (c == 0 && c2 > 0) {
                            n = 1;
                        }
                        else {
                            n = 0;
                        }
                        int n2;
                        if (c > 0 && c2 == 0) {
                            n2 = 1;
                        }
                        else {
                            n2 = 0;
                        }
                        if (n != 0) {
                            this.f();
                        }
                        else if (n2 != 0) {
                            this.g();
                        }
                        c = c2;
                    }
                    this.d = false;
                    return;
                    this.d = false;
                }
                finally {}
                continue;
            }
        }
    }
    
    public final void c(final c c) {
        if (!c.p) {
            return;
        }
        if (!c.d()) {
            c.b(false);
            return;
        }
        final int q = c.q;
        final int g = this.g;
        if (q >= g) {
            return;
        }
        c.q = g;
        c.o.a(this.e);
    }
    
    public void d(c c) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            c c2 = null;
            Label_0086: {
                if (c != null) {
                    this.c(c);
                    c2 = null;
                }
                else {
                    final n.b.d f = this.b.f();
                    do {
                        c2 = c;
                        if (!f.hasNext()) {
                            break Label_0086;
                        }
                        this.c(f.next().getValue());
                    } while (!this.i);
                    c2 = c;
                }
            }
            c = c2;
        } while (this.i);
        this.h = false;
    }
    
    public void e(final m m) {
        a("observeForever");
        final b b = new b(m);
        final c c = (c)this.b.k(m, b);
        if (c instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (c != null) {
            return;
        }
        ((c)b).b(true);
    }
    
    public void f() {
    }
    
    public void g() {
    }
    
    public void h(final Object f) {
        while (true) {
            while (true) {
                synchronized (this.a) {
                    if (this.f == LiveData.k) {
                        final int n = 1;
                        this.f = f;
                        // monitorexit(this.a)
                        if (n == 0) {
                            return;
                        }
                        m.a.d().c(this.j);
                        return;
                    }
                }
                final int n = 0;
                continue;
            }
        }
    }
    
    public void i(final m m) {
        a("removeObserver");
        final c c = (c)this.b.q(m);
        if (c == null) {
            return;
        }
        c.c();
        c.b(false);
    }
    
    public void j(final Object e) {
        a("setValue");
        ++this.g;
        this.e = e;
        this.d(null);
    }
    
    public class LifecycleBoundObserver extends c implements f
    {
        public final h s;
        public final /* synthetic */ LiveData t;
        
        @Override
        public void a(final h h, final d.b b) {
            Enum b2 = this.s.g().b();
            if (b2 == androidx.lifecycle.d.c.o) {
                this.t.i(super.o);
                return;
            }
            d.c b3;
            for (Enum enum1 = null; enum1 != b2; enum1 = b2, b2 = b3) {
                ((c)this).b(this.d());
                b3 = this.s.g().b();
            }
        }
        
        @Override
        public void c() {
            this.s.g().c(this);
        }
        
        @Override
        public boolean d() {
            return this.s.g().b().c(androidx.lifecycle.d.c.r);
        }
    }
    
    public class b extends c
    {
        public b(final m m) {
            super(m);
        }
        
        @Override
        public boolean d() {
            return true;
        }
    }
    
    public abstract class c
    {
        public final m o;
        public boolean p;
        public int q;
        
        public c(final m o) {
            this.q = -1;
            this.o = o;
        }
        
        public void b(final boolean p) {
            if (p == this.p) {
                return;
            }
            this.p = p;
            final LiveData r = LiveData.this;
            int n;
            if (p) {
                n = 1;
            }
            else {
                n = -1;
            }
            r.b(n);
            if (this.p) {
                LiveData.this.d(this);
            }
        }
        
        public void c() {
        }
        
        public abstract boolean d();
    }
}
