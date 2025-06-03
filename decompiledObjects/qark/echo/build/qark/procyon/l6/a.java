// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l6;

import java.util.Iterator;
import W5.B;
import b6.c;
import kotlin.jvm.internal.g;

public class a implements Iterable, a
{
    public static final a r;
    public final int o;
    public final int p;
    public final int q;
    
    static {
        r = new a(null);
    }
    
    public a(final int o, final int n, final int q) {
        if (q == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (q != Integer.MIN_VALUE) {
            this.o = o;
            this.p = c.b(o, n, q);
            this.q = q;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }
    
    public final int a() {
        return this.o;
    }
    
    public final int d() {
        return this.p;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof a) {
            if (!this.isEmpty() || !((a)o).isEmpty()) {
                final int o2 = this.o;
                final a a = (a)o;
                if (o2 != a.o || this.p != a.p || this.q != a.q) {
                    return false;
                }
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
    
    @Override
    public int hashCode() {
        if (this.isEmpty()) {
            return -1;
        }
        return (this.o * 31 + this.p) * 31 + this.q;
    }
    
    public boolean isEmpty() {
        if (this.q > 0) {
            if (this.o <= this.p) {
                return false;
            }
        }
        else if (this.o >= this.p) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        StringBuilder sb;
        int q;
        if (this.q > 0) {
            sb = new StringBuilder();
            sb.append(this.o);
            sb.append("..");
            sb.append(this.p);
            sb.append(" step ");
            q = this.q;
        }
        else {
            sb = new StringBuilder();
            sb.append(this.o);
            sb.append(" downTo ");
            sb.append(this.p);
            sb.append(" step ");
            q = -this.q;
        }
        sb.append(q);
        return sb.toString();
    }
    
    public static final class a
    {
        public final l6.a a(final int n, final int n2, final int n3) {
            return new l6.a(n, n2, n3);
        }
    }
}
