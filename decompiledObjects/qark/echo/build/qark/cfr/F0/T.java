/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.Arrays
 */
package F0;

import d0.i;
import d0.q;
import g0.z;
import java.util.Arrays;

public interface T {
    public void a(z var1, int var2, int var3);

    public void b(long var1, int var3, int var4, int var5, a var6);

    public int c(i var1, int var2, boolean var3, int var4);

    public void d(q var1);

    public void e(z var1, int var2);

    public int f(i var1, int var2, boolean var3);

    public static final class a {
        public final int a;
        public final byte[] b;
        public final int c;
        public final int d;

        public a(int n8, byte[] arrby, int n9, int n10) {
            this.a = n8;
            this.b = arrby;
            this.c = n9;
            this.d = n10;
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
                if (this.a == object.a && this.c == object.c && this.d == object.d && Arrays.equals((byte[])this.b, (byte[])object.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return ((this.a * 31 + Arrays.hashCode((byte[])this.b)) * 31 + this.c) * 31 + this.d;
        }
    }

}

