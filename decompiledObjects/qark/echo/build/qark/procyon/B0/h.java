// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B0;

import java.util.Arrays;
import g0.M;

public final class h implements b
{
    public final boolean a;
    public final int b;
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public B0.a[] g;
    
    public h(final boolean b, final int n) {
        this(b, n, 0);
    }
    
    public h(final boolean a, final int b, final int f) {
        final boolean b2 = true;
        int i = 0;
        g0.a.a(b > 0);
        g0.a.a(f >= 0 && b2);
        this.a = a;
        this.b = b;
        this.f = f;
        this.g = new B0.a[f + 100];
        if (f > 0) {
            this.c = new byte[f * b];
            while (i < f) {
                this.g[i] = new B0.a(this.c, i * b);
                ++i;
            }
        }
        else {
            this.c = null;
        }
    }
    
    @Override
    public void a() {
        // monitorenter(this)
        while (true) {
            try {
                final int k = M.k(this.d, this.b);
                final int e = this.e;
                final int n = 0;
                final int max = Math.max(0, k - e);
                final int f = this.f;
                if (max >= f) {
                    // monitorexit(this)
                    return;
                }
                int max2 = max;
                if (this.c != null) {
                    int n2 = f - 1;
                    int i = n;
                    while (i <= n2) {
                        final B0.a a = (B0.a)g0.a.e(this.g[i]);
                        if (a.a == this.c) {
                            ++i;
                        }
                        else {
                            final B0.a a2 = (B0.a)g0.a.e(this.g[n2]);
                            if (a2.a != this.c) {
                                --n2;
                            }
                            else {
                                final B0.a[] g = this.g;
                                g[i] = a2;
                                g[n2] = a;
                                --n2;
                                ++i;
                            }
                        }
                    }
                    if ((max2 = Math.max(max, i)) >= this.f) {
                        // monitorexit(this)
                        return;
                    }
                }
                Arrays.fill(this.g, max2, this.f, null);
                this.f = max2;
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public void b(a next) {
        // monitorenter(this)
    Label_0059_Outer:
        while (true) {
            Label_0052: {
                if (next == null) {
                    break Label_0052;
                }
                while (true) {
                    try {
                        this.g[this.f++] = ((a)next).a();
                        --this.e;
                        next = ((a)next).next();
                        continue Label_0059_Outer;
                        // monitorexit(this)
                        throw next;
                        this.notifyAll();
                    }
                    // monitorexit(this)
                    finally {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    @Override
    public void c(final B0.a a) {
        synchronized (this) {
            this.g[this.f++] = a;
            --this.e;
            this.notifyAll();
        }
    }
    
    @Override
    public B0.a d() {
        // monitorenter(this)
        while (true) {
            try {
                ++this.e;
                final int f = this.f;
                B0.a a;
                if (f > 0) {
                    final B0.a[] g = this.g;
                    final int f2 = f - 1;
                    this.f = f2;
                    a = (B0.a)g0.a.e(g[f2]);
                    this.g[this.f] = null;
                }
                else {
                    final B0.a a2 = new B0.a(new byte[this.b], 0);
                    final int e = this.e;
                    final B0.a[] g2 = this.g;
                    a = a2;
                    if (e > g2.length) {
                        this.g = Arrays.copyOf(g2, g2.length * 2);
                        a = a2;
                    }
                }
                // monitorexit(this)
                return a;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public int e() {
        return this.b;
    }
    
    public int f() {
        synchronized (this) {
            return this.e * this.b;
        }
    }
    
    public void g() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0024: {
            try {
                if (this.a) {
                    this.h(0);
                }
            }
            finally {
                break Label_0024;
            }
            return;
        }
    }
    // monitorexit(this)
    
    public void h(final int d) {
        while (true) {
            // monitorenter(this)
            // monitorexit(this)
            Label_0038: {
            Label_0035:
                while (true) {
                    Label_0042: {
                        try {
                            if (d >= this.d) {
                                break Label_0042;
                            }
                            final int n = 1;
                            this.d = d;
                            if (n != 0) {
                                this.a();
                            }
                        }
                        finally {
                            break Label_0038;
                        }
                        break Label_0035;
                    }
                    final int n = 0;
                    continue;
                }
                return;
            }
            // monitorexit(this)
            throw;
        }
    }
}
