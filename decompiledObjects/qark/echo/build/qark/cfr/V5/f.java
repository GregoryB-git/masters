/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package V5;

import V5.g;
import kotlin.jvm.internal.Intrinsics;

public final class f
implements Comparable {
    public static final a s = new a(null);
    public static final f t = g.a();
    public final int o;
    public final int p;
    public final int q;
    public final int r;

    public f(int n8, int n9, int n10) {
        this.o = n8;
        this.p = n9;
        this.q = n10;
        this.r = this.e(n8, n9, n10);
    }

    public int c(f f8) {
        Intrinsics.checkNotNullParameter(f8, "other");
        return this.r - f8.r;
    }

    public final int e(int n8, int n9, int n10) {
        if (n8 >= 0 && n8 < 256 && n9 >= 0 && n9 < 256 && n10 >= 0 && n10 < 256) {
            return (n8 << 16) + (n9 << 8) + n10;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Version components are out of range: ");
        stringBuilder.append(n8);
        stringBuilder.append('.');
        stringBuilder.append(n9);
        stringBuilder.append('.');
        stringBuilder.append(n10);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        object = object instanceof f ? (f)object : null;
        if (object == null) {
            return false;
        }
        if (this.r == object.r) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.r;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.o);
        stringBuilder.append('.');
        stringBuilder.append(this.p);
        stringBuilder.append('.');
        stringBuilder.append(this.q);
        return stringBuilder.toString();
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g g8) {
            this();
        }
    }

}

