/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package m4;

import m4.d;

public final class a {
    public int a;
    public d.a b = d.a.o;

    public static a b() {
        return new a();
    }

    public d a() {
        return new a(this.a, this.b);
    }

    public a c(int n8) {
        this.a = n8;
        return this;
    }

    public static final class a
    implements d {
        public final int a;
        public final d.a b;

        public a(int n8, d.a a8) {
            this.a = n8;
            this.b = a8;
        }

        public Class annotationType() {
            return d.class;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof d)) {
                return false;
            }
            if (this.a == (object = (d)object).tag() && this.b.equals((Object)object.intEncoding())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (14552422 ^ this.a) + (this.b.hashCode() ^ 2041407134);
        }

        @Override
        public d.a intEncoding() {
            return this.b;
        }

        @Override
        public int tag() {
            return this.a;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("@com.google.firebase.encoders.proto.Protobuf");
            stringBuilder.append('(');
            stringBuilder.append("tag=");
            stringBuilder.append(this.a);
            stringBuilder.append("intEncoding=");
            stringBuilder.append((Object)this.b);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

}

