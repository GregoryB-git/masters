/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.Iterator
 */
package d4;

import V3.k;
import d4.b;
import d4.c;
import d4.n;
import java.util.Collections;
import java.util.Iterator;

public class g
extends c
implements n {
    public static final g s = new g();

    public static g W() {
        return s;
    }

    @Override
    public n A(k k8) {
        return this;
    }

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public int D(n n8) {
        if (n8.isEmpty()) {
            return 0;
        }
        return -1;
    }

    @Override
    public int E() {
        return 0;
    }

    @Override
    public b I(b b8) {
        return null;
    }

    @Override
    public Object L(boolean bl) {
        return null;
    }

    @Override
    public n N(b b8, n n8) {
        if (n8.isEmpty()) {
            return this;
        }
        if (b8.s()) {
            return this;
        }
        return new c().N(b8, n8);
    }

    @Override
    public String O(n.b b8) {
        return "";
    }

    @Override
    public Iterator P() {
        return Collections.emptyList().iterator();
    }

    @Override
    public boolean Q(b b8) {
        return false;
    }

    @Override
    public String R() {
        return "";
    }

    public g X(n n8) {
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof g) {
            return true;
        }
        if (object instanceof n && (object = (n)object).isEmpty() && this.t().equals((Object)object.t())) {
            return true;
        }
        return false;
    }

    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public Iterator iterator() {
        return Collections.emptyList().iterator();
    }

    @Override
    public n t() {
        return this;
    }

    @Override
    public String toString() {
        return "<Empty Node>";
    }

    @Override
    public n v(b b8) {
        return this;
    }

    @Override
    public n y(k k8, n n8) {
        if (k8.isEmpty()) {
            return n8;
        }
        b b8 = k8.Z();
        return this.N(b8, this.v(b8).y(k8.c0(), n8));
    }
}

