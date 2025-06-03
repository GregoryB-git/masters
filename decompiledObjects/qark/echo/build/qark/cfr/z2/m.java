/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package z2;

import A2.n;
import x2.d;
import y2.a;
import z2.N;
import z2.O;
import z2.k;

public abstract class m {
    public final d[] a;
    public final boolean b;
    public final int c;

    public m(d[] arrd, boolean bl, int n8) {
        boolean bl2;
        this.a = arrd;
        boolean bl3 = bl2 = false;
        if (arrd != null) {
            bl3 = bl2;
            if (bl) {
                bl3 = true;
            }
        }
        this.b = bl3;
        this.c = n8;
    }

    public static a a() {
        return new a(null);
    }

    public abstract void b(a.b var1, V2.k var2);

    public boolean c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final d[] e() {
        return this.a;
    }

    public static class a {
        public k a;
        public boolean b = true;
        public d[] c;
        public int d = 0;

        public /* synthetic */ a(O o8) {
        }

        public m a() {
            boolean bl = this.a != null;
            n.b(bl, "execute parameter required");
            return new N(this, this.c, this.b, this.d);
        }

        public a b(k k8) {
            this.a = k8;
            return this;
        }

        public a c(boolean bl) {
            this.b = bl;
            return this;
        }

        public /* varargs */ a d(d ... arrd) {
            this.c = arrd;
            return this;
        }
    }

}

