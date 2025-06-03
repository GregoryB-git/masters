/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Set
 */
package m2;

import java.util.Set;
import m2.f;

public final class c
extends f.b {
    public final long a;
    public final long b;
    public final Set c;

    public c(long l8, long l9, Set set) {
        this.a = l8;
        this.b = l9;
        this.c = set;
    }

    public /* synthetic */ c(long l8, long l9, Set set,  a8) {
        this(l8, l9, set);
    }

    @Override
    public long b() {
        return this.a;
    }

    @Override
    public Set c() {
        return this.c;
    }

    @Override
    public long d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof f.b) {
            if (this.a == (object = (f.b)object).b() && this.b == object.d() && this.c.equals((Object)object.c())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long l8 = this.a;
        int n8 = (int)(l8 ^ l8 >>> 32);
        l8 = this.b;
        return ((n8 ^ 1000003) * 1000003 ^ (int)(l8 >>> 32 ^ l8)) * 1000003 ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ConfigValue{delta=");
        stringBuilder.append(this.a);
        stringBuilder.append(", maxAllowedDelay=");
        stringBuilder.append(this.b);
        stringBuilder.append(", flags=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends f.b.a {
        public Long a;
        public Long b;
        public Set c;

        @Override
        public f.b a() {
            Object object = this.a;
            Object object2 = "";
            if (object == null) {
                object2 = new StringBuilder();
                object2.append("");
                object2.append(" delta");
                object2 = object2.toString();
            }
            object = object2;
            if (this.b == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" maxAllowedDelay");
                object = object.toString();
            }
            object2 = object;
            if (this.c == null) {
                object2 = new StringBuilder();
                object2.append((String)object);
                object2.append(" flags");
                object2 = object2.toString();
            }
            if (object2.isEmpty()) {
                return new c(this.a, this.b, this.c, null);
            }
            object = new StringBuilder();
            object.append("Missing required properties:");
            object.append((String)object2);
            throw new IllegalStateException(object.toString());
        }

        @Override
        public f.b.a b(long l8) {
            this.a = l8;
            return this;
        }

        @Override
        public f.b.a c(Set set) {
            if (set != null) {
                this.c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        @Override
        public f.b.a d(long l8) {
            this.b = l8;
            return this;
        }
    }

}

