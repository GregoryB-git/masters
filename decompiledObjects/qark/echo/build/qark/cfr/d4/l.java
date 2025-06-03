/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d4;

import Y3.m;
import d4.k;
import d4.n;

public class l
extends k {
    public final long q;

    public l(Long l8, n n8) {
        super(n8);
        this.q = l8;
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

    public int V(l l8) {
        return m.b(this.q, l8.q);
    }

    public l W(n n8) {
        return new l(this.q, n8);
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof l;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (l)object;
        bl = bl2;
        if (this.q == object.q) {
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
        long l8 = this.q;
        return (int)(l8 ^ l8 >>> 32) + this.o.hashCode();
    }
}

