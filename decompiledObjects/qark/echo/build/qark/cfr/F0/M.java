/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package F0;

import F0.N;

public interface M {
    public boolean h();

    public a j(long var1);

    public long l();

    public static final class a {
        public final N a;
        public final N b;

        public a(N n8) {
            this(n8, n8);
        }

        public a(N n8, N n9) {
            this.a = (N)g0.a.e(n8);
            this.b = (N)g0.a.e(n9);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null) {
                if (a.class != object.getClass()) {
                    return false;
                }
                object = (a)object;
                if (this.a.equals(object.a) && this.b.equals(object.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() * 31 + this.b.hashCode();
        }

        public String toString() {
            String string2;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append((Object)this.a);
            if (this.a.equals(this.b)) {
                string2 = "";
            } else {
                string2 = new StringBuilder();
                string2.append(", ");
                string2.append((Object)this.b);
                string2 = string2.toString();
            }
            stringBuilder.append(string2);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    public static class b
    implements M {
        public final long a;
        public final a b;

        public b(long l8) {
            this(l8, 0L);
        }

        public b(long l8, long l9) {
            this.a = l8;
            N n8 = l9 == 0L ? N.c : new N(0L, l9);
            this.b = new a(n8);
        }

        @Override
        public boolean h() {
            return false;
        }

        @Override
        public a j(long l8) {
            return this.b;
        }

        @Override
        public long l() {
            return this.a;
        }
    }

}

