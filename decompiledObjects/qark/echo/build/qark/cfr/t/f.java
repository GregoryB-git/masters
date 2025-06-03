/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package t;

import t.d;

public class f
implements Cloneable {
    public static final Object s = new Object();
    public boolean o = false;
    public long[] p;
    public Object[] q;
    public int r;

    public f() {
        this(10);
    }

    public f(int n8) {
        if (n8 == 0) {
            this.p = d.b;
            this.q = d.c;
            return;
        }
        n8 = d.f(n8);
        this.p = new long[n8];
        this.q = new Object[n8];
    }

    public void a(long l8, Object object) {
        int n8 = this.r;
        if (n8 != 0 && l8 <= this.p[n8 - 1]) {
            this.l(l8, object);
            return;
        }
        if (this.o && n8 >= this.p.length) {
            this.d();
        }
        if ((n8 = this.r) >= this.p.length) {
            int n9 = d.f(n8 + 1);
            long[] arrl = new long[n9];
            Object[] arrobject = new Object[n9];
            long[] arrl2 = this.p;
            System.arraycopy((Object)arrl2, (int)0, (Object)arrl, (int)0, (int)arrl2.length);
            arrl2 = this.q;
            System.arraycopy((Object)arrl2, (int)0, (Object)arrobject, (int)0, (int)arrl2.length);
            this.p = arrl;
            this.q = arrobject;
        }
        this.p[n8] = l8;
        this.q[n8] = object;
        this.r = n8 + 1;
    }

    public f b() {
        try {
            f f8 = (f)super.clone();
            f8.p = (long[])this.p.clone();
            f8.q = (Object[])this.q.clone();
            return f8;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new AssertionError((Object)cloneNotSupportedException);
        }
    }

    public final void d() {
        int n8;
        int n9 = this.r;
        long[] arrl = this.p;
        Object[] arrobject = this.q;
        int n10 = n8 = 0;
        while (n8 < n9) {
            Object object = arrobject[n8];
            int n11 = n10;
            if (object != s) {
                if (n8 != n10) {
                    arrl[n10] = arrl[n8];
                    arrobject[n10] = object;
                    arrobject[n8] = null;
                }
                n11 = n10 + 1;
            }
            ++n8;
            n10 = n11;
        }
        this.o = false;
        this.r = n10;
    }

    public Object f(long l8) {
        return this.g(l8, null);
    }

    public Object g(long l8, Object object) {
        int n8 = d.b(this.p, this.r, l8);
        if (n8 >= 0) {
            Object object2 = this.q[n8];
            if (object2 == s) {
                return object;
            }
            return object2;
        }
        return object;
    }

    public long j(int n8) {
        if (this.o) {
            this.d();
        }
        return this.p[n8];
    }

    public void l(long l8, Object object) {
        Object[] arrobject;
        int n8 = d.b(this.p, this.r, l8);
        if (n8 >= 0) {
            this.q[n8] = object;
            return;
        }
        int n9 = n8;
        int n10 = this.r;
        if (n9 < n10 && (arrobject = this.q)[n9] == s) {
            this.p[n9] = l8;
            arrobject[n9] = object;
            return;
        }
        n8 = n9;
        if (this.o) {
            n8 = n9;
            if (n10 >= this.p.length) {
                this.d();
                n8 = d.b(this.p, this.r, l8);
            }
        }
        if ((n9 = this.r) >= this.p.length) {
            n9 = d.f(n9 + 1);
            arrobject = new long[n9];
            Object[] arrobject2 = new Object[n9];
            long[] arrl = this.p;
            System.arraycopy((Object)arrl, (int)0, (Object)arrobject, (int)0, (int)arrl.length);
            arrl = this.q;
            System.arraycopy((Object)arrl, (int)0, (Object)arrobject2, (int)0, (int)arrl.length);
            this.p = arrobject;
            this.q = arrobject2;
        }
        if ((n9 = this.r) - n8 != 0) {
            arrobject = this.p;
            n10 = n8 + 1;
            System.arraycopy((Object)arrobject, (int)n8, (Object)arrobject, (int)n10, (int)(n9 - n8));
            arrobject = this.q;
            System.arraycopy((Object)arrobject, (int)n8, (Object)arrobject, (int)n10, (int)(this.r - n8));
        }
        this.p[n8] = l8;
        this.q[n8] = object;
        ++this.r;
    }

    public void n(long l8) {
        Object[] arrobject;
        Object object;
        Object object2;
        int n8 = d.b(this.p, this.r, l8);
        if (n8 >= 0 && (object = (arrobject = this.q)[n8]) != (object2 = s)) {
            arrobject[n8] = object2;
            this.o = true;
        }
    }

    public int o() {
        if (this.o) {
            this.d();
        }
        return this.r;
    }

    public Object p(int n8) {
        if (this.o) {
            this.d();
        }
        return this.q[n8];
    }

    public String toString() {
        if (this.o() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.r * 28);
        stringBuilder.append('{');
        for (int i8 = 0; i8 < this.r; ++i8) {
            if (i8 > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.j(i8));
            stringBuilder.append('=');
            Object object = this.p(i8);
            if (object != this) {
                stringBuilder.append(object);
                continue;
            }
            stringBuilder.append("(this Map)");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

