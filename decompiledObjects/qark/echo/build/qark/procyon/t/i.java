// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t;

public class i implements Cloneable
{
    public static final Object s;
    public boolean o;
    public int[] p;
    public Object[] q;
    public int r;
    
    static {
        s = new Object();
    }
    
    public i() {
        this(10);
    }
    
    public i(int e) {
        this.o = false;
        if (e == 0) {
            this.p = d.a;
            this.q = d.c;
            return;
        }
        e = d.e(e);
        this.p = new int[e];
        this.q = new Object[e];
    }
    
    public void a(final int n, final Object o) {
        final int r = this.r;
        if (r != 0 && n <= this.p[r - 1]) {
            this.n(n, o);
            return;
        }
        if (this.o && r >= this.p.length) {
            this.f();
        }
        final int r2 = this.r;
        if (r2 >= this.p.length) {
            final int e = d.e(r2 + 1);
            final int[] p2 = new int[e];
            final Object[] q = new Object[e];
            final int[] p3 = this.p;
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
    
    public void b() {
        final int r = this.r;
        final Object[] q = this.q;
        for (int i = 0; i < r; ++i) {
            q[i] = null;
        }
        this.r = 0;
        this.o = false;
    }
    
    public i d() {
        try {
            final i i = (i)super.clone();
            i.p = this.p.clone();
            i.q = this.q.clone();
            return i;
        }
        catch (CloneNotSupportedException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    public final void f() {
        final int r = this.r;
        final int[] p = this.p;
        final Object[] q = this.q;
        int r2;
        int n;
        for (int i = r2 = 0; i < r; ++i, r2 = n) {
            final Object o = q[i];
            n = r2;
            if (o != i.s) {
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
    
    public Object g(final int n) {
        return this.j(n, null);
    }
    
    public Object j(int a, final Object o) {
        a = d.a(this.p, this.r, a);
        if (a < 0) {
            return o;
        }
        final Object o2 = this.q[a];
        if (o2 == i.s) {
            return o;
        }
        return o2;
    }
    
    public int l(final int n) {
        if (this.o) {
            this.f();
        }
        return this.p[n];
    }
    
    public void n(final int n, final Object o) {
        final int a = d.a(this.p, this.r, n);
        if (a >= 0) {
            this.q[a] = o;
            return;
        }
        final int n2 = a;
        final int r = this.r;
        if (n2 < r) {
            final Object[] q = this.q;
            if (q[n2] == i.s) {
                this.p[n2] = n;
                q[n2] = o;
                return;
            }
        }
        int a2 = n2;
        if (this.o) {
            a2 = n2;
            if (r >= this.p.length) {
                this.f();
                a2 = d.a(this.p, this.r, n);
            }
        }
        final int r2 = this.r;
        if (r2 >= this.p.length) {
            final int e = d.e(r2 + 1);
            final int[] p2 = new int[e];
            final Object[] q2 = new Object[e];
            final int[] p3 = this.p;
            System.arraycopy(p3, 0, p2, 0, p3.length);
            final Object[] q3 = this.q;
            System.arraycopy(q3, 0, q2, 0, q3.length);
            this.p = p2;
            this.q = q2;
        }
        final int r3 = this.r;
        if (r3 - a2 != 0) {
            final int[] p4 = this.p;
            final int n3 = a2 + 1;
            System.arraycopy(p4, a2, p4, n3, r3 - a2);
            final Object[] q4 = this.q;
            System.arraycopy(q4, a2, q4, n3, this.r - a2);
        }
        this.p[a2] = n;
        this.q[a2] = o;
        ++this.r;
    }
    
    public int o() {
        if (this.o) {
            this.f();
        }
        return this.r;
    }
    
    public Object p(final int n) {
        if (this.o) {
            this.f();
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
            sb.append(this.l(i));
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
