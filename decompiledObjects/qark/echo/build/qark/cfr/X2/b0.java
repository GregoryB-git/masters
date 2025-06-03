/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 */
package X2;

import W2.m;
import X2.C;
import X2.g0;
import X2.v;
import X2.y;
import java.util.Iterator;

public final class b0
extends y {
    public final transient Object q;

    public b0(Object object) {
        this.q = m.j(object);
    }

    @Override
    public v a() {
        return v.Z(this.q);
    }

    @Override
    public boolean contains(Object object) {
        return this.q.equals(object);
    }

    @Override
    public int d(Object[] arrobject, int n8) {
        arrobject[n8] = this.q;
        return n8 + 1;
    }

    @Override
    public final int hashCode() {
        return this.q.hashCode();
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public g0 q() {
        return C.s(this.q);
    }

    public int size() {
        return 1;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        stringBuilder.append(this.q.toString());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    @Override
    public Object writeReplace() {
        return super.writeReplace();
    }
}

