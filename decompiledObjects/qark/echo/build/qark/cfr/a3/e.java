/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package a3;

import W2.m;
import a3.f;
import java.io.Serializable;
import java.util.Arrays;

public final class e
implements Serializable {
    public static final e r = new e(new int[0]);
    public final int[] o;
    public final transient int p;
    public final int q;

    public e(int[] arrn) {
        this(arrn, 0, arrn.length);
    }

    public e(int[] arrn, int n8, int n9) {
        this.o = arrn;
        this.p = n8;
        this.q = n9;
    }

    public static e a(int[] arrn) {
        if (arrn.length == 0) {
            return r;
        }
        return new e(Arrays.copyOf((int[])arrn, (int)arrn.length));
    }

    public static e f() {
        return r;
    }

    public int b(int n8) {
        m.h(n8, this.e());
        return this.o[this.p + n8];
    }

    public boolean c() {
        if (this.q == this.p) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.p <= 0 && this.q >= this.o.length) {
            return false;
        }
        return true;
    }

    public int e() {
        return this.q - this.p;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof e)) {
            return false;
        }
        object = (e)object;
        if (this.e() != object.e()) {
            return false;
        }
        for (int i8 = 0; i8 < this.e(); ++i8) {
            if (this.b(i8) == object.b(i8)) continue;
            return false;
        }
        return true;
    }

    public int[] g() {
        return Arrays.copyOfRange((int[])this.o, (int)this.p, (int)this.q);
    }

    public e h() {
        if (this.d()) {
            return new e(this.g());
        }
        return this;
    }

    public int hashCode() {
        int n8 = 1;
        for (int i8 = this.p; i8 < this.q; ++i8) {
            n8 = n8 * 31 + f.i(this.o[i8]);
        }
        return n8;
    }

    public Object readResolve() {
        if (this.c()) {
            return r;
        }
        return this;
    }

    public String toString() {
        if (this.c()) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder(this.e() * 5);
        stringBuilder.append('[');
        stringBuilder.append(this.o[this.p]);
        int n8 = this.p;
        while (++n8 < this.q) {
            stringBuilder.append(", ");
            stringBuilder.append(this.o[n8]);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public Object writeReplace() {
        return this.h();
    }
}

