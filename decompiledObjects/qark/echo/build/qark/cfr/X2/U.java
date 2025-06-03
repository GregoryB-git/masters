/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 *  java.util.Iterator
 */
package X2;

import X2.g0;
import X2.s;
import X2.v;
import X2.y;
import java.util.Iterator;

public final class U
extends y {
    public static final Object[] v;
    public static final U w;
    public final transient Object[] q;
    public final transient int r;
    public final transient Object[] s;
    public final transient int t;
    public final transient int u;

    static {
        Object[] arrobject = new Object[]{};
        v = arrobject;
        w = new U(arrobject, 0, arrobject, 0, 0);
    }

    public U(Object[] arrobject, int n8, Object[] arrobject2, int n9, int n10) {
        this.q = arrobject;
        this.r = n8;
        this.s = arrobject2;
        this.t = n9;
        this.u = n10;
    }

    @Override
    public v V() {
        return v.D(this.q, this.u);
    }

    @Override
    public boolean W() {
        return true;
    }

    @Override
    public boolean contains(Object object) {
        Object[] arrobject = this.s;
        if (object != null) {
            if (arrobject.length == 0) {
                return false;
            }
            int n8 = s.c(object);
            do {
                Object object2;
                if ((object2 = arrobject[n8 &= this.t]) == null) {
                    return false;
                }
                if (object2.equals(object)) {
                    return true;
                }
                ++n8;
            } while (true);
        }
        return false;
    }

    @Override
    public int d(Object[] arrobject, int n8) {
        System.arraycopy((Object)this.q, (int)0, (Object)arrobject, (int)n8, (int)this.u);
        return n8 + this.u;
    }

    @Override
    public Object[] f() {
        return this.q;
    }

    @Override
    public int g() {
        return this.u;
    }

    @Override
    public int hashCode() {
        return this.r;
    }

    @Override
    public int i() {
        return 0;
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public g0 q() {
        return this.a().q();
    }

    public int size() {
        return this.u;
    }

    @Override
    public Object writeReplace() {
        return super.writeReplace();
    }
}

