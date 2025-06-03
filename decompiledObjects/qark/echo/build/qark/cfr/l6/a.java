/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 */
package l6;

import W5.B;
import b6.c;
import java.util.Iterator;
import kotlin.jvm.internal.g;
import l6.b;

public class a
implements Iterable,
h6.a {
    public static final a r = new a(null);
    public final int o;
    public final int p;
    public final int q;

    public a(int n8, int n9, int n10) {
        if (n10 != 0) {
            if (n10 != Integer.MIN_VALUE) {
                this.o = n8;
                this.p = c.b(n8, n9, n10);
                this.q = n10;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final int a() {
        return this.o;
    }

    public final int d() {
        return this.p;
    }

    public boolean equals(Object object) {
        block2 : {
            block3 : {
                if (!(object instanceof a)) break block2;
                if (this.isEmpty() && ((a)object).isEmpty()) break block3;
                int n8 = this.o;
                object = (a)object;
                if (n8 != object.o || this.p != object.p || this.q != object.q) break block2;
            }
            return true;
        }
        return false;
    }

    public final int f() {
        return this.q;
    }

    public B g() {
        return new b(this.o, this.p, this.q);
    }

    public int hashCode() {
        if (this.isEmpty()) {
            return -1;
        }
        return (this.o * 31 + this.p) * 31 + this.q;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean isEmpty() {
        if (this.q > 0) {
            if (this.o <= this.p) return false;
            return true;
        }
        if (this.o >= this.p) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public String toString() {
        int n8;
        StringBuilder stringBuilder;
        if (this.q > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.o);
            stringBuilder.append("..");
            stringBuilder.append(this.p);
            stringBuilder.append(" step ");
            n8 = this.q;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.o);
            stringBuilder.append(" downTo ");
            stringBuilder.append(this.p);
            stringBuilder.append(" step ");
            n8 = - this.q;
        }
        stringBuilder.append(n8);
        return stringBuilder.toString();
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final a a(int n8, int n9, int n10) {
            return new a(n8, n9, n10);
        }
    }

}

