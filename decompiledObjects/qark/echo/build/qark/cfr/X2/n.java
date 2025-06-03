/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Comparator
 */
package X2;

import a3.a;
import a3.f;
import a3.h;
import java.util.Comparator;

public abstract class n {
    public static final n a = new n(){

        @Override
        public n d(int n8, int n9) {
            return this.k(f.e(n8, n9));
        }

        @Override
        public n e(long l8, long l9) {
            return this.k(h.a(l8, l9));
        }

        @Override
        public n f(Object object, Object object2, Comparator comparator) {
            return this.k(comparator.compare(object, object2));
        }

        @Override
        public n g(boolean bl, boolean bl2) {
            return this.k(a.a(bl, bl2));
        }

        @Override
        public n h(boolean bl, boolean bl2) {
            return this.k(a.a(bl2, bl));
        }

        @Override
        public int i() {
            return 0;
        }

        public n k(int n8) {
            if (n8 < 0) {
                return b;
            }
            if (n8 > 0) {
                return c;
            }
            return a;
        }
    };
    public static final n b = new b(-1);
    public static final n c = new b(1);

    public n() {
    }

    public /* synthetic */ n( a8) {
        this();
    }

    public static n j() {
        return a;
    }

    public abstract n d(int var1, int var2);

    public abstract n e(long var1, long var3);

    public abstract n f(Object var1, Object var2, Comparator var3);

    public abstract n g(boolean var1, boolean var2);

    public abstract n h(boolean var1, boolean var2);

    public abstract int i();

    public static final class b
    extends n {
        public final int d;

        public b(int n8) {
            super(null);
            this.d = n8;
        }

        @Override
        public n d(int n8, int n9) {
            return this;
        }

        @Override
        public n e(long l8, long l9) {
            return this;
        }

        @Override
        public n f(Object object, Object object2, Comparator comparator) {
            return this;
        }

        @Override
        public n g(boolean bl, boolean bl2) {
            return this;
        }

        @Override
        public n h(boolean bl, boolean bl2) {
            return this;
        }

        @Override
        public int i() {
            return this.d;
        }
    }

}

