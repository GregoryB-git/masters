/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d4;

import Y3.m;
import d4.k;
import d4.n;

public class t
extends k {
    public final String q;

    public t(String string2, n n8) {
        super(n8);
        this.q = string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public String O(n.b b8) {
        Object object;
        int n8 = .a[b8.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid hash version for string node: ");
                stringBuilder.append((Object)b8);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.T(b8));
            stringBuilder.append("string:");
            object = m.j(this.q);
            b8 = stringBuilder;
        } else {
            object = new StringBuilder();
            object.append(this.T(b8));
            object.append("string:");
            String string2 = this.q;
            b8 = object;
            object = string2;
        }
        b8.append((String)object);
        return b8.toString();
    }

    @Override
    public k.b S() {
        return k.b.r;
    }

    public int V(t t8) {
        return this.q.compareTo(t8.q);
    }

    public t W(n n8) {
        return new t(this.q, n8);
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof t;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (t)object;
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

