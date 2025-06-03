/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 *  java.util.Objects
 */
package X2;

import W2.m;
import X2.v;
import java.util.Objects;

public class S
extends v {
    public static final v s = new S(new Object[0], 0);
    public final transient Object[] q;
    public final transient int r;

    public S(Object[] arrobject, int n8) {
        this.q = arrobject;
        this.r = n8;
    }

    @Override
    public int d(Object[] arrobject, int n8) {
        System.arraycopy((Object)this.q, (int)0, (Object)arrobject, (int)n8, (int)this.r);
        return n8 + this.r;
    }

    @Override
    public Object[] f() {
        return this.q;
    }

    @Override
    public int g() {
        return this.r;
    }

    public Object get(int n8) {
        m.h(n8, this.r);
        Object object = this.q[n8];
        Objects.requireNonNull((Object)object);
        return object;
    }

    @Override
    public int i() {
        return 0;
    }

    @Override
    public boolean k() {
        return false;
    }

    public int size() {
        return this.r;
    }

    @Override
    public Object writeReplace() {
        return super.writeReplace();
    }
}

