/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package e2;

import e2.a;
import e2.k;

public final class e
extends k {
    public final k.b a;
    public final a b;

    public e(k.b b8, a a8) {
        this.a = b8;
        this.b = a8;
    }

    public /* synthetic */ e(k.b b8, a a8,  a9) {
        this(b8, a8);
    }

    @Override
    public a b() {
        return this.b;
    }

    @Override
    public k.b c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof k) {
            object = (k)object;
            Object object2 = this.a;
            if (object2 == null ? object.c() == null : object2.equals((Object)object.c())) {
                object2 = this.b;
                object = object.b();
                if (object2 == null ? object == null : object2.equals(object)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Object object = this.a;
        int n8 = 0;
        int n9 = object == null ? 0 : object.hashCode();
        object = this.b;
        if (object != null) {
            n8 = object.hashCode();
        }
        return (n9 ^ 1000003) * 1000003 ^ n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ClientInfo{clientType=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", androidClientInfo=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends k.a {
        public k.b a;
        public a b;

        @Override
        public k a() {
            return new e(this.a, this.b, null);
        }

        @Override
        public k.a b(a a8) {
            this.b = a8;
            return this;
        }

        @Override
        public k.a c(k.b b8) {
            this.a = b8;
            return this;
        }
    }

}

