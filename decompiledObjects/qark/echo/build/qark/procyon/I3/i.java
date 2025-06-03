// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I3;

import t0.f;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Callable;
import java.util.Map;
import M3.g;
import java.util.concurrent.atomic.AtomicMarkableReference;
import H3.n;

public class i
{
    public final d a;
    public final n b;
    public String c;
    public final a d;
    public final a e;
    public final AtomicMarkableReference f;
    
    public i(final String c, final g g, final n b) {
        this.d = new a(false);
        this.e = new a(true);
        this.f = new AtomicMarkableReference(null, false);
        this.c = c;
        this.a = new d(g);
        this.b = b;
    }
    
    public static /* synthetic */ n b(final i i) {
        return i.b;
    }
    
    public static /* synthetic */ String c(final i i) {
        return i.c;
    }
    
    public static /* synthetic */ d d(final i i) {
        return i.a;
    }
    
    public static i i(final String s, final g g, final n n) {
        final d d = new d(g);
        final i i = new i(s, g, n);
        ((b)i.d.a.getReference()).e(d.g(s, false));
        ((b)i.e.a.getReference()).e(d.g(s, true));
        i.f.set(d.h(s), false);
        return i;
    }
    
    public static String j(final String s, final g g) {
        return new d(g).h(s);
    }
    
    public Map e() {
        return this.d.b();
    }
    
    public Map f() {
        return this.e.b();
    }
    
    public String g() {
        return this.f.getReference();
    }
    
    public final void k() {
        while (true) {
            final AtomicMarkableReference f = this.f;
            // monitorenter(f)
            while (true) {
                Label_0071: {
                    while (true) {
                        try {
                            final boolean marked = this.f.isMarked();
                            boolean b = false;
                            if (marked) {
                                final String g = this.g();
                                this.f.set(g, false);
                                b = true;
                                // monitorexit(f)
                                if (b) {
                                    this.a.n(this.c, g);
                                }
                                return;
                            }
                            break Label_0071;
                            // monitorexit(f)
                            throw;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                final String g = null;
                continue;
            }
        }
    }
    
    public boolean l(final String s, final String s2) {
        return this.d.f(s, s2);
    }
    
    public boolean m(final String s, final String s2) {
        return this.e.f(s, s2);
    }
    
    public void n(final String c) {
        final String c2 = this.c;
        // monitorenter(c2)
        while (true) {
            try {
                this.c = c;
                final Map b = this.d.b();
                if (this.g() != null) {
                    this.a.n(c, this.g());
                }
                if (!b.isEmpty()) {
                    this.a.l(c, b);
                }
                // monitorexit(c2)
                return;
                // monitorexit(c2)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void o(String f) {
        final String c = I3.b.c(f, 1024);
        f = (String)this.f;
        // monitorenter(f)
        while (true) {
            try {
                if (H3.i.z(c, this.f.getReference())) {
                    // monitorexit(f)
                    return;
                }
                this.f.set(c, true);
                // monitorexit(f)
                this.b.h(new I3.g(this));
                return;
                // monitorexit(f)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public class a
    {
        public final AtomicMarkableReference a;
        public final AtomicReference b;
        public final boolean c;
        
        public a(final boolean c) {
            this.b = new AtomicReference(null);
            this.c = c;
            int n;
            if (c) {
                n = 8192;
            }
            else {
                n = 1024;
            }
            this.a = new AtomicMarkableReference(new b(64, n), false);
        }
        
        public Map b() {
            return this.a.getReference().a();
        }
        
        public final void d() {
            final h h = new h(this);
            if (t0.f.a(this.b, null, h)) {
                i.b(i.this).h(h);
            }
        }
        
        public final void e() {
            while (true) {
                // monitorenter(this)
                while (true) {
                    Label_0083: {
                        while (true) {
                            try {
                                if (this.a.isMarked()) {
                                    final Map a = this.a.getReference().a();
                                    final AtomicMarkableReference a2 = this.a;
                                    a2.set(a2.getReference(), false);
                                    // monitorexit(this)
                                    if (a != null) {
                                        i.d(i.this).m(i.c(i.this), a, this.c);
                                    }
                                    return;
                                }
                                break Label_0083;
                                // monitorexit(this)
                                throw;
                            }
                            finally {
                                continue;
                            }
                            break;
                        }
                    }
                    final Map a = null;
                    continue;
                }
            }
        }
        
        public boolean f(final String s, final String s2) {
            // monitorenter(this)
            while (true) {
                try {
                    if (!this.a.getReference().d(s, s2)) {
                        // monitorexit(this)
                        return false;
                    }
                    final AtomicMarkableReference a = this.a;
                    a.set(a.getReference(), true);
                    // monitorexit(this)
                    this.d();
                    return true;
                    // monitorexit(this)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
}
