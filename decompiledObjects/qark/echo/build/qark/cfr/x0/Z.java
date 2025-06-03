/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collection
 */
package x0;

import X2.E;
import X2.v;
import d0.J;
import g0.M;
import g0.o;
import java.util.Collection;
import x0.Y;

public final class Z {
    public static final Z d = new Z(new J[0]);
    public static final String e = M.w0(0);
    public final int a;
    public final v b;
    public int c;

    public /* varargs */ Z(J ... arrj) {
        this.b = v.V(arrj);
        this.a = arrj.length;
        this.f();
    }

    public static /* synthetic */ Integer a(J j8) {
        return j8.c;
    }

    public J b(int n8) {
        return (J)this.b.get(n8);
    }

    public v c() {
        return v.U((Collection)E.k(this.b, new Y()));
    }

    public int d(J j8) {
        int n8 = this.b.indexOf(j8);
        if (n8 >= 0) {
            return n8;
        }
        return -1;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (Z.class != object.getClass()) {
                return false;
            }
            object = (Z)object;
            if (this.a == object.a && this.b.equals((Object)object.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f() {
        int n8 = 0;
        while (n8 < this.b.size()) {
            int n9;
            for (int i8 = n9 = n8 + 1; i8 < this.b.size(); ++i8) {
                if (!((J)this.b.get(n8)).equals(this.b.get(i8))) continue;
                o.d("TrackGroupArray", "", (Throwable)new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
            }
            n8 = n9;
        }
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }
}

