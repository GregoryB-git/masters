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

public class i
implements Cloneable {
    public static final Object s = new Object();
    public boolean o = false;
    public int[] p;
    public Object[] q;
    public int r;

    public i() {
        this(10);
    }

    public i(int n8) {
        if (n8 == 0) {
            this.p = d.a;
            this.q = d.c;
            return;
        }
        n8 = d.e(n8);
        this.p = new int[n8];
        this.q = new Object[n8];
    }

    public void a(int n8, Object object) {
        int n9 = this.r;
        if (n9 != 0 && n8 <= this.p[n9 - 1]) {
            this.n(n8, object);
            return;
        }
        if (this.o && n9 >= this.p.length) {
            this.f();
        }
        if ((n9 = this.r) >= this.p.length) {
            int n10 = d.e(n9 + 1);
            int[] arrn = new int[n10];
            Object[] arrobject = new Object[n10];
            int[] arrn2 = this.p;
            System.arraycopy((Object)arrn2, (int)0, (Object)arrn, (int)0, (int)arrn2.length);
            arrn2 = this.q;
            System.arraycopy((Object)arrn2, (int)0, (Object)arrobject, (int)0, (int)arrn2.length);
            this.p = arrn;
            this.q = arrobject;
        }
        this.p[n9] = n8;
        this.q[n9] = object;
        this.r = n9 + 1;
    }

    public void b() {
        int n8 = this.r;
        Object[] arrobject = this.q;
        for (int i8 = 0; i8 < n8; ++i8) {
            arrobject[i8] = null;
        }
        this.r = 0;
        this.o = false;
    }

    public i d() {
        try {
            i i8 = (i)super.clone();
            i8.p = (int[])this.p.clone();
            i8.q = (Object[])this.q.clone();
            return i8;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new AssertionError((Object)cloneNotSupportedException);
        }
    }

    public final void f() {
        int n8;
        int n9 = this.r;
        int[] arrn = this.p;
        Object[] arrobject = this.q;
        int n10 = n8 = 0;
        while (n8 < n9) {
            Object object = arrobject[n8];
            int n11 = n10;
            if (object != s) {
                if (n8 != n10) {
                    arrn[n10] = arrn[n8];
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

    public Object g(int n8) {
        return this.j(n8, null);
    }

    public Object j(int n8, Object object) {
        if ((n8 = d.a(this.p, this.r, n8)) >= 0) {
            Object object2 = this.q[n8];
            if (object2 == s) {
                return object;
            }
            return object2;
        }
        return object;
    }

    public int l(int n8) {
        if (this.o) {
            this.f();
        }
        return this.p[n8];
    }

    public void n(int n8, Object object) {
        Object[] arrobject;
        int n9 = d.a(this.p, this.r, n8);
        if (n9 >= 0) {
            this.q[n9] = object;
            return;
        }
        int n10 = n9;
        int n11 = this.r;
        if (n10 < n11 && (arrobject = this.q)[n10] == s) {
            this.p[n10] = n8;
            arrobject[n10] = object;
            return;
        }
        n9 = n10;
        if (this.o) {
            n9 = n10;
            if (n11 >= this.p.length) {
                this.f();
                n9 = d.a(this.p, this.r, n8);
            }
        }
        if ((n10 = this.r) >= this.p.length) {
            n10 = d.e(n10 + 1);
            arrobject = new int[n10];
            Object[] arrobject2 = new Object[n10];
            int[] arrn = this.p;
            System.arraycopy((Object)arrn, (int)0, (Object)arrobject, (int)0, (int)arrn.length);
            arrn = this.q;
            System.arraycopy((Object)arrn, (int)0, (Object)arrobject2, (int)0, (int)arrn.length);
            this.p = arrobject;
            this.q = arrobject2;
        }
        if ((n10 = this.r) - n9 != 0) {
            arrobject = this.p;
            n11 = n9 + 1;
            System.arraycopy((Object)arrobject, (int)n9, (Object)arrobject, (int)n11, (int)(n10 - n9));
            arrobject = this.q;
            System.arraycopy((Object)arrobject, (int)n9, (Object)arrobject, (int)n11, (int)(this.r - n9));
        }
        this.p[n9] = n8;
        this.q[n9] = object;
        ++this.r;
    }

    public int o() {
        if (this.o) {
            this.f();
        }
        return this.r;
    }

    public Object p(int n8) {
        if (this.o) {
            this.f();
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
            stringBuilder.append(this.l(i8));
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

