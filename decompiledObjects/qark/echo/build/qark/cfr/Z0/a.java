/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 */
package Z0;

import g0.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class a {
    public final int a;

    public a(int n8) {
        this.a = n8;
    }

    public static String a(int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append((char)(n8 >> 24 & 255));
        stringBuilder.append((char)(n8 >> 16 & 255));
        stringBuilder.append((char)(n8 >> 8 & 255));
        stringBuilder.append((char)(n8 & 255));
        return stringBuilder.toString();
    }

    public static int b(int n8) {
        return n8 & 16777215;
    }

    public static int c(int n8) {
        return n8 >> 24 & 255;
    }

    public String toString() {
        return a.a(this.a);
    }

    public static final class a
    extends a {
        public final long b;
        public final List c;
        public final List d;

        public a(int n8, long l8) {
            super(n8);
            this.b = l8;
            this.c = new ArrayList();
            this.d = new ArrayList();
        }

        public void d(a a8) {
            this.d.add((Object)a8);
        }

        public void e(b b8) {
            this.c.add((Object)b8);
        }

        public a f(int n8) {
            int n9 = this.d.size();
            for (int i8 = 0; i8 < n9; ++i8) {
                a a8 = (a)this.d.get(i8);
                if (a8.a != n8) continue;
                return a8;
            }
            return null;
        }

        public b g(int n8) {
            int n9 = this.c.size();
            for (int i8 = 0; i8 < n9; ++i8) {
                b b8 = (b)this.c.get(i8);
                if (b8.a != n8) continue;
                return b8;
            }
            return null;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a.a(this.a));
            stringBuilder.append(" leaves: ");
            stringBuilder.append(Arrays.toString((Object[])this.c.toArray()));
            stringBuilder.append(" containers: ");
            stringBuilder.append(Arrays.toString((Object[])this.d.toArray()));
            return stringBuilder.toString();
        }
    }

    public static final class b
    extends a {
        public final z b;

        public b(int n8, z z8) {
            super(n8);
            this.b = z8;
        }
    }

}

