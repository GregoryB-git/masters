/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 */
package B0;

import java.io.IOException;
import x0.r;
import x0.u;

public interface m {
    public void a(long var1);

    public b b(a var1, c var2);

    public long c(c var1);

    public int d(int var1);

    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public a(int n8, int n9, int n10, int n11) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = n11;
        }

        /*
         * Enabled aggressive block sorting
         */
        public boolean a(int n8) {
            if (n8 == 1) {
                if (this.a - this.b <= 1) return false;
                return true;
            }
            if (this.c - this.d <= 1) return false;
            return true;
        }
    }

    public static final class b {
        public final int a;
        public final long b;

        public b(int n8, long l8) {
            boolean bl = l8 >= 0L;
            g0.a.a(bl);
            this.a = n8;
            this.b = l8;
        }
    }

    public static final class c {
        public final r a;
        public final u b;
        public final IOException c;
        public final int d;

        public c(r r8, u u8, IOException iOException, int n8) {
            this.a = r8;
            this.b = u8;
            this.c = iOException;
            this.d = n8;
        }
    }

}

