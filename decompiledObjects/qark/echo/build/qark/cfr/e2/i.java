/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package e2;

import e2.o;

public final class i
extends o {
    public final o.c a;
    public final o.b b;

    public i(o.c c8, o.b b8) {
        this.a = c8;
        this.b = b8;
    }

    public /* synthetic */ i(o.c c8, o.b b8,  a8) {
        this(c8, b8);
    }

    @Override
    public o.b b() {
        return this.b;
    }

    @Override
    public o.c c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof o) {
            object = (o)object;
            Enum enum_ = this.a;
            if (enum_ == null ? object.c() == null : enum_.equals((Object)object.c())) {
                enum_ = this.b;
                object = object.b();
                if (enum_ == null ? object == null : enum_.equals(object)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Enum enum_ = this.a;
        int n8 = 0;
        int n9 = enum_ == null ? 0 : enum_.hashCode();
        enum_ = this.b;
        if (enum_ != null) {
            n8 = enum_.hashCode();
        }
        return (n9 ^ 1000003) * 1000003 ^ n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NetworkConnectionInfo{networkType=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", mobileSubtype=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends o.a {
        public o.c a;
        public o.b b;

        @Override
        public o a() {
            return new i(this.a, this.b, null);
        }

        @Override
        public o.a b(o.b b8) {
            this.b = b8;
            return this;
        }

        @Override
        public o.a c(o.c c8) {
            this.a = c8;
            return this;
        }
    }

}

