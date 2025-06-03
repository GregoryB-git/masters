// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V5;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public final class f implements Comparable
{
    public static final a s;
    public static final f t;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    
    static {
        s = new a(null);
        t = V5.g.a();
    }
    
    public f(final int o, final int p3, final int q) {
        this.o = o;
        this.p = p3;
        this.q = q;
        this.r = this.e(o, p3, q);
    }
    
    public int c(final f f) {
        Intrinsics.checkNotNullParameter(f, "other");
        return this.r - f.r;
    }
    
    public final int e(final int i, final int j, final int k) {
        if (i >= 0 && i < 256 && j >= 0 && j < 256 && k >= 0 && k < 256) {
            return (i << 16) + (j << 8) + k;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Version components are out of range: ");
        sb.append(i);
        sb.append('.');
        sb.append(j);
        sb.append('.');
        sb.append(k);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        f f;
        if (o instanceof f) {
            f = (f)o;
        }
        else {
            f = null;
        }
        return f != null && this.r == f.r;
    }
    
    @Override
    public int hashCode() {
        return this.r;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.o);
        sb.append('.');
        sb.append(this.p);
        sb.append('.');
        sb.append(this.q);
        return sb.toString();
    }
    
    public static final class a
    {
    }
}
