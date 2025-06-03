// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d4;

import java.util.Collections;
import java.util.Iterator;
import V3.k;

public class g extends c implements n
{
    public static final g s;
    
    static {
        s = new g();
    }
    
    public static g W() {
        return g.s;
    }
    
    @Override
    public n A(final k k) {
        return this;
    }
    
    @Override
    public boolean B() {
        return false;
    }
    
    @Override
    public int D(final n n) {
        if (n.isEmpty()) {
            return 0;
        }
        return -1;
    }
    
    @Override
    public int E() {
        return 0;
    }
    
    @Override
    public d4.b I(final d4.b b) {
        return null;
    }
    
    @Override
    public Object L(final boolean b) {
        return null;
    }
    
    @Override
    public n N(final d4.b b, final n n) {
        if (n.isEmpty()) {
            return this;
        }
        if (b.s()) {
            return this;
        }
        return new c().N(b, n);
    }
    
    @Override
    public String O(final b b) {
        return "";
    }
    
    @Override
    public Iterator P() {
        return Collections.emptyList().iterator();
    }
    
    @Override
    public boolean Q(final d4.b b) {
        return false;
    }
    
    @Override
    public String R() {
        return "";
    }
    
    public g X(final n n) {
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof g) {
            return true;
        }
        if (o instanceof n) {
            final n n = (n)o;
            if (n.isEmpty() && this.t().equals(n.t())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public Object getValue() {
        return null;
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    @Override
    public boolean isEmpty() {
        return true;
    }
    
    @Override
    public Iterator iterator() {
        return Collections.emptyList().iterator();
    }
    
    @Override
    public n t() {
        return this;
    }
    
    @Override
    public String toString() {
        return "<Empty Node>";
    }
    
    @Override
    public n v(final d4.b b) {
        return this;
    }
    
    @Override
    public n y(final k k, final n n) {
        if (k.isEmpty()) {
            return n;
        }
        final d4.b z = k.Z();
        return this.N(z, this.v(z).y(k.c0(), n));
    }
}
