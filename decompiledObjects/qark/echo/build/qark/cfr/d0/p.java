/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.SparseBooleanArray
 *  java.lang.Object
 */
package d0;

import android.util.SparseBooleanArray;
import g0.M;
import g0.a;

public final class p {
    public final SparseBooleanArray a;

    public p(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public /* synthetic */ p(SparseBooleanArray sparseBooleanArray,  a8) {
        this(sparseBooleanArray);
    }

    public boolean a(int n8) {
        return this.a.get(n8);
    }

    public int b(int n8) {
        a.c(n8, 0, this.c());
        return this.a.keyAt(n8);
    }

    public int c() {
        return this.a.size();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof p)) {
            return false;
        }
        object = (p)object;
        if (M.a < 24) {
            if (this.c() != object.c()) {
                return false;
            }
            for (int i8 = 0; i8 < this.c(); ++i8) {
                if (this.b(i8) == object.b(i8)) continue;
                return false;
            }
            return true;
        }
        return this.a.equals((Object)object.a);
    }

    public int hashCode() {
        if (M.a < 24) {
            int n8 = this.c();
            for (int i8 = 0; i8 < this.c(); ++i8) {
                n8 = n8 * 31 + this.b(i8);
            }
            return n8;
        }
        return this.a.hashCode();
    }

    public static final class b {
        public final SparseBooleanArray a = new SparseBooleanArray();
        public boolean b;

        public b a(int n8) {
            a.f(this.b ^ true);
            this.a.append(n8, true);
            return this;
        }

        public b b(p p8) {
            for (int i8 = 0; i8 < p8.c(); ++i8) {
                this.a(p8.b(i8));
            }
            return this;
        }

        public /* varargs */ b c(int ... arrn) {
            int n8 = arrn.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                this.a(arrn[i8]);
            }
            return this;
        }

        public b d(int n8, boolean bl) {
            if (bl) {
                return this.a(n8);
            }
            return this;
        }

        public p e() {
            a.f(this.b ^ true);
            this.b = true;
            return new p(this.a, null);
        }
    }

}

