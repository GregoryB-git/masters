/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package Q3;

import Q3.m;
import d4.n;

public abstract class r {
    public static c a() {
        return new c(false, null, null);
    }

    public static c b(m m8) {
        return new c(true, m8.b(), null);
    }

    public static interface b {
        public c a(m var1);

        public void b(Q3.c var1, boolean var2, Q3.b var3);
    }

    public static class c {
        public boolean a;
        public n b;

        public c(boolean bl, n n8) {
            this.a = bl;
            this.b = n8;
        }

        public /* synthetic */ c(boolean bl, n n8,  a8) {
            this(bl, n8);
        }

        public n a() {
            return this.b;
        }

        public boolean b() {
            return this.a;
        }
    }

}

