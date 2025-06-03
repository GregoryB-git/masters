/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ClassCastException
 *  java.lang.Iterable
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.util.AbstractCollection
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.NoSuchElementException
 *  java.util.Set
 */
package X2;

import W2.m;
import X2.A;
import X2.L;
import X2.P;
import X2.d0;
import X2.g0;
import X2.v;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public final class V
extends A {
    public static final V t = new V(v.Y(), P.d());
    public final transient v s;

    public V(v v8, Comparator comparator) {
        super(comparator);
        this.s = v8;
    }

    public Comparator A0() {
        return this.q;
    }

    @Override
    public v a() {
        return this.s;
    }

    public Object ceiling(Object object) {
        int n8 = this.y0(object, true);
        if (n8 == this.size()) {
            return null;
        }
        return this.s.get(n8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean contains(Object object) {
        boolean bl2;
        boolean bl = bl2 = false;
        if (object == null) return bl;
        try {
            int n8 = this.z0(object);
            bl = bl2;
            if (n8 < 0) return bl;
            return true;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean containsAll(Collection object) {
        Object object2 = object;
        if (object instanceof L) {
            object2 = ((L)object).u();
        }
        if (!d0.b(this.comparator(), (Iterable)object2)) return AbstractCollection.super.containsAll((Collection)object2);
        if (object2.size() <= 1) {
            return AbstractCollection.super.containsAll((Collection)object2);
        }
        g0 g02 = this.q();
        Iterator iterator = object2.iterator();
        if (!g02.hasNext()) {
            return false;
        }
        object2 = iterator.next();
        object = g02.next();
        try {
            do {
                int n8;
                if ((n8 = this.t0(object, object2)) < 0) {
                    if (!g02.hasNext()) {
                        return false;
                    }
                    object = g02.next();
                    continue;
                }
                if (n8 == 0) {
                    if (!iterator.hasNext()) {
                        return true;
                    }
                    object2 = iterator.next();
                    continue;
                }
                if (n8 > 0) break;
            } while (true);
            return false;
        }
        catch (ClassCastException | NullPointerException nullPointerException) {
            return false;
        }
    }

    @Override
    public int d(Object[] arrobject, int n8) {
        return this.s.d(arrobject, n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        object = (Set)object;
        if (this.size() != object.size()) {
            return false;
        }
        if (this.isEmpty()) {
            return true;
        }
        if (!d0.b(this.q, (Iterable)object)) {
            return this.containsAll((Collection)object);
        }
        object = object.iterator();
        try {
            int n8;
            Object object2;
            Object object3;
            g0 g02 = this.q();
            do {
                if (!g02.hasNext()) {
                    return true;
                }
                object2 = g02.next();
            } while ((object3 = object.next()) != null && (n8 = this.t0(object2, object3)) == 0);
            return false;
        }
        catch (ClassCastException | NoSuchElementException classCastException) {
            return false;
        }
    }

    @Override
    public Object[] f() {
        return this.s.f();
    }

    public Object first() {
        if (!this.isEmpty()) {
            return this.s.get(0);
        }
        throw new NoSuchElementException();
    }

    public Object floor(Object object) {
        int n8 = this.x0(object, true) - 1;
        if (n8 == -1) {
            return null;
        }
        return this.s.get(n8);
    }

    @Override
    public int g() {
        return this.s.g();
    }

    @Override
    public A h0() {
        Comparator comparator = Collections.reverseOrder((Comparator)this.q);
        if (this.isEmpty()) {
            return A.j0(comparator);
        }
        return new V(this.s.f0(), comparator);
    }

    public Object higher(Object object) {
        int n8 = this.y0(object, false);
        if (n8 == this.size()) {
            return null;
        }
        return this.s.get(n8);
    }

    @Override
    public int i() {
        return this.s.i();
    }

    @Override
    public boolean k() {
        return this.s.k();
    }

    public Object last() {
        if (!this.isEmpty()) {
            return this.s.get(this.size() - 1);
        }
        throw new NoSuchElementException();
    }

    public Object lower(Object object) {
        int n8 = this.x0(object, false) - 1;
        if (n8 == -1) {
            return null;
        }
        return this.s.get(n8);
    }

    @Override
    public A m0(Object object, boolean bl) {
        return this.w0(0, this.x0(object, bl));
    }

    @Override
    public A p0(Object object, boolean bl, Object object2, boolean bl2) {
        return this.s0(object, bl).m0(object2, bl2);
    }

    @Override
    public g0 q() {
        return this.s.q();
    }

    @Override
    public A s0(Object object, boolean bl) {
        return this.w0(this.y0(object, bl), this.size());
    }

    public int size() {
        return this.s.size();
    }

    public g0 v0() {
        return this.s.f0().q();
    }

    public V w0(int n8, int n9) {
        if (n8 == 0 && n9 == this.size()) {
            return this;
        }
        if (n8 < n9) {
            return new V(this.s.h0(n8, n9), this.q);
        }
        return A.j0(this.q);
    }

    @Override
    public Object writeReplace() {
        return super.writeReplace();
    }

    public int x0(Object object, boolean bl) {
        int n8 = Collections.binarySearch((List)this.s, (Object)m.j(object), (Comparator)this.comparator());
        if (n8 >= 0) {
            int n9 = n8;
            if (bl) {
                n9 = n8 + 1;
            }
            return n9;
        }
        return n8;
    }

    public int y0(Object object, boolean bl) {
        int n8 = Collections.binarySearch((List)this.s, (Object)m.j(object), (Comparator)this.comparator());
        if (n8 >= 0) {
            if (bl) {
                return n8;
            }
            return n8 + 1;
        }
        return n8;
    }

    public final int z0(Object object) {
        return Collections.binarySearch((List)this.s, (Object)object, (Comparator)this.A0());
    }
}

