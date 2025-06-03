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

public final class d
extends B.a.a {
    public final String a;
    public final String b;
    public final String c;

    public d(String string2, String string3, String string4) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
    }

    public /* synthetic */ d(String string2, String string3, String string4,  a8) {
        this(string2, string3, string4);
    }

    @Override
    public String b() {
        return this.a;
    }

    @Override
    public String c() {
        return this.c;
    }

    @Override
    public String d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof B.a.a) {
            if (this.a.equals((Object)(object = (B.a.a)object).b()) && this.b.equals((Object)object.d()) && this.c.equals((Object)object.c())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BuildIdMappingForArch{arch=");
        stringBuilder.append(this.a);
        stringBuilder.append(", libraryName=");
        stringBuilder.append(this.b);
        stringBuilder.append(", buildId=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends B.a.a.a {
        public String a;
        public String b;
        public String c;

        @Override
        public B.a.a a() {
            String string2 = this.a;
            String string3 = "";
            if (string2 == null) {
                string3 = new StringBuilder();
                string3.append("");
                string3.append(" arch");
                string3 = string3.toString();
            }
            string2 = string3;
            if (this.b == null) {
                string2 = new StringBuilder();
                string2.append(string3);
                string2.append(" libraryName");
                string2 = string2.toString();
            }
            string3 = string2;
            if (this.c == null) {
                string3 = new StringBuilder();
                string3.append(string2);
                string3.append(" buildId");
                string3 = string3.toString();
            }
            if (string3.isEmpty()) {
                return new d(this.a, this.b, this.c, null);
            }
            string2 = new StringBuilder();
            string2.append("Missing required properties:");
            string2.append(string3);
            throw new IllegalStateException(string2.toString());
        }

        @Override
        public B.a.a.a b(String string2) {
            if (string2 != null) {
                this.a = string2;
                return this;
            }
            throw new NullPointerException("Null arch");
        }

        @Override
        public B.a.a.a c(String string2) {
            if (string2 != null) {
                this.c = string2;
                return this;
            }
            throw new NullPointerException("Null buildId");
        }

        @Override
        public B.a.a.a d(String string2) {
            if (string2 != null) {
                this.b = string2;
                return this;
            }
            throw new NullPointerException("Null libraryName");
        }
    }

}

