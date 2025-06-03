// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t;

public class f implements Cloneable
{
    public static final Object s;
    public boolean o;
    public long[] p;
    public Object[] q;
    public int r;
    
    static {
        s = new Object();
    }
    
    public f() {
        this(10);
    }
    
    public f(int f) {
        this.o = false;
        if (f == 0) {
            this.p = d.b;
            this.q = d.c;
            return;
        }
        f = d.f(f);
        this.p = new long[f];
        this.q = new Object[f];
    }
    
    public void a(final long n, final Object o) {
        final int r = this.r;
        if (r != 0 && n <= this.p[r - 1]) {
            this.l(n, o);
            return;
        }
        if (this.o && r >= this.p.length) {
            this.d();
        }
        final int r2 = this.r;
        if (r2 >= this.p.length) {
            final int f = d.f(r2 + 1);
            final long[] p2 = new long[f];
            final Object[] q = new Object[f];
            final long[] p3 = this.p;
            System.arraycopy(p3, 0, p2, 0, p3.length);
            final Object[] q2 = this.q;
            System.arraycopy(q2, 0, q, 0, q2.length);
            this.p = p2;
            this.q = q;
        }
        this.p[r2] = n;
        this.q[r2] = o;
        this.r = r2 + 1;
    }
    
    public f b() {
        try {
            final f f = (f)super.clone();
            f.p = this.p.clone();
            f.q = this.q.clone();
            return f;
        }
        catch (CloneNotSupportedException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    public final void d() {
        final int r = this.r;
        final long[] p = this.p;
        final Object[] q = this.q;
        int r2;
        int n;
        for (int i = r2 = 0; i < r; ++i, r2 = n) {
            final Object o = q[i];
            n = r2;
            if (o != f.s) {
                if (i != r2) {
                    p[r2] = p[i];
                    q[r2] = o;
                    q[i] = null;
                }
                n = r2 + 1;
            }
        }
        this.o = false;
        this.r = r2;
    }
    
    public Object f(final long n) {
        return this.g(n, null);
    }
    
    public Object g(final long n, final Object o) {
        final int b = d.b(this.p, this.r, n);
        if (b < 0) {
            return o;
        }
        final Object o2 = this.q[b];
        if (o2 == f.s) {
            return o;
        }
        return o2;
    }
    
    public long j(final int n) {
        if (this.o) {
            this.d();
        }
        return this.p[n];
    }
    
    public void l(final long n, final Object o) {
        final int b = d.b(this.p, this.r, n);
        if (b >= 0) {
            this.q[b] = o;
            return;
        }
        final int n2 = b;
        final int r = this.r;
        if (n2 < r) {
            final Object[] q = this.q;
            if (q[n2] == f.s) {
                this.p[n2] = n;
                q[n2] = o;
                return;
            }
        }
        int b2 = n2;
        if (this.o) {
            b2 = n2;
            if (r >= this.p.length) {
                this.d();
                b2 = d.b(this.p, this.r, n);
            }
        }
        final int r2 = this.r;
        if (r2 >= this.p.length) {
            final int f = d.f(r2 + 1);
            final long[] p2 = new long[f];
            final Object[] q2 = new Object[f];
            final long[] p3 = this.p;
            System.arraycopy(p3, 0, p2, 0, p3.length);
            final Object[] q3 = this.q;
            System.arraycopy(q3, 0, q2, 0, q3.length);
            this.p = p2;
            this.q = q2;
        }
        final int r3 = this.r;
        if (r3 - b2 != 0) {
            final long[] p4 = this.p;
            final int n3 = b2 + 1;
            System.arraycopy(p4, b2, p4, n3, r3 - b2);
            final Object[] q4 = this.q;
            System.arraycopy(q4, b2, q4, n3, this.r - b2);
        }
        this.p[b2] = n;
        this.q[b2] = o;
        ++this.r;
    }
    
    public void n(final long n) {
        final int b = d.b(this.p, this.r, n);
        if (b >= 0) {
            final Object[] q = this.q;
            final Object o = q[b];
            final Object s = f.s;
            if (o != s) {
                q[b] = s;
                this.o = true;
            }
        }
    }
    
    public int o() {
        if (this.o) {
            this.d();
        }
        return this.r;
    }
    
    public Object p(final int n) {
        if (this.o) {
            this.d();
        }
        return this.q[n];
    }
    
    @Override
    public String toString() {
        if (this.o() <= 0) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.r * 28);
        sb.append('{');
        for (int i = 0; i < this.r; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.j(i));
            sb.append('=');
            final Object p = this.p(i);
            if (p != this) {
                sb.append(p);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
