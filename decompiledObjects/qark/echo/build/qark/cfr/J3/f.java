/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package J3;

import J3.B;
import J3.C;

public final class f
extends B.d {
    public final C a;
    public final String b;

    public f(C c8, String string2) {
        this.a = c8;
        this.b = string2;
    }

    public /* synthetic */ f(C c8, String string2,  a8) {
        this(c8, string2);
    }

    @Override
    public C b() {
        return this.a;
    }

    @Override
    public String c() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof B.d) {
            Object object2 = (B.d)object;
            if (this.a.equals(object2.b())) {
                object = this.b;
                object2 = object2.c();
                if (object == null ? object2 == null : object.equals(object2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        String string2 = this.b;
        int n9 = string2 == null ? 0 : string2.hashCode();
        return (n8 ^ 1000003) * 1000003 ^ n9;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FilesPayload{files=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", orgId=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends B.d.a {
        public C a;
        public String b;

        @Override
        public B.d a() {
            C c8 = this.a;
            String string2 = "";
            if (c8 == null) {
                string2 = new StringBuilder();
                string2.append("");
                string2.append(" files");
                string2 = string2.toString();
            }
            if (string2.isEmpty()) {
                return new f(this.a, this.b, null);
            }
            c8 = new StringBuilder();
            c8.append("Missing required properties:");
            c8.append(string2);
            throw new IllegalStateException(c8.toString());
        }

        @Override
        public B.d.a b(C c8) {
            if (c8 != null) {
                this.a = c8;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        @Override
        public B.d.a c(String string2) {
            this.b = string2;
            return this;
        }
    }

}

