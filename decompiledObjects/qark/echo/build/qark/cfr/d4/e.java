/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 */
package d4;

import Y3.m;
import d4.k;
import d4.n;
import d4.r;
import java.util.Map;

public class e
extends k {
    public Map q;

    public e(Map map, n n8) {
        super(n8);
        this.q = map;
    }

    @Override
    public String O(n.b b8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.T(b8));
        stringBuilder.append("deferredValue:");
        stringBuilder.append((Object)this.q);
        return stringBuilder.toString();
    }

    @Override
    public k.b S() {
        return k.b.o;
    }

    public int V(e e8) {
        return 0;
    }

    public e W(n n8) {
        m.f(r.b(n8));
        return new e(this.q, n8);
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof e;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (e)object;
        bl = bl2;
        if (this.q.equals((Object)object.q)) {
            bl = bl2;
            if (this.o.equals((Object)object.o)) {
                bl = true;
            }
        }
        return bl;
    }

    @Override
    public Object getValue() {
        return this.q;
    }

    public int hashCode() {
        return this.q.hashCode() + this.o.hashCode();
    }
}

