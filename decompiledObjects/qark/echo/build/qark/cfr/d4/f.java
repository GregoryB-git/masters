/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d4;

import Y3.m;
import d4.k;
import d4.n;
import d4.r;

public class f
extends k {
    public final Double q;

    public f(Double d8, n n8) {
        super(n8);
        this.q = d8;
    }

    @Override
    public String O(n.b object) {
        object = this.T((n.b)((Object)object));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append("number:");
        object = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append(m.c(this.q));
        return stringBuilder.toString();
    }

    @Override
    public k.b S() {
        return k.b.q;
    }

    public int V(f f8) {
        return this.q.compareTo(f8.q);
    }

    public f W(n n8) {
        m.f(r.b(n8));
        return new f(this.q, n8);
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof f;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (f)object;
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

