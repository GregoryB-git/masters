// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d4;

import java.util.Collections;
import java.util.Iterator;
import Y3.m;
import java.util.HashMap;

public abstract class k implements n
{
    public final n o;
    public String p;
    
    public k(final n o) {
        this.o = o;
    }
    
    public static int D(final l l, final f f) {
        return Double.valueOf((double)(long)l.getValue()).compareTo((Double)f.getValue());
    }
    
    @Override
    public n A(final V3.k k) {
        if (k.isEmpty()) {
            return this;
        }
        if (k.Z().s()) {
            return this.o;
        }
        return g.W();
    }
    
    @Override
    public boolean B() {
        return true;
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
        if (b && !this.o.isEmpty()) {
            final HashMap<String, Object> hashMap = new HashMap<String, Object>();
            hashMap.put(".value", this.getValue());
            hashMap.put(".priority", this.o.getValue());
            return hashMap;
        }
        return this.getValue();
    }
    
    public int M(final n n) {
        if (n.isEmpty()) {
            return 1;
        }
        if (n instanceof c) {
            return -1;
        }
        m.g(n.B(), "Node is not leaf node!");
        if (this instanceof l && n instanceof f) {
            return D((l)this, (f)n);
        }
        if (this instanceof f && n instanceof l) {
            return D((l)n, (f)this) * -1;
        }
        return this.U((k)n);
    }
    
    @Override
    public n N(final d4.b b, final n n) {
        if (b.s()) {
            return this.J(n);
        }
        if (n.isEmpty()) {
            return this;
        }
        return g.W().N(b, n).J(this.o);
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
        if (this.p == null) {
            this.p = m.i(this.O(n.b.o));
        }
        return this.p;
    }
    
    public abstract b S();
    
    public String T(final n.b obj) {
        final int n = k$a.a[obj.ordinal()];
        if (n != 1 && n != 2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unknown hash version: ");
            sb.append(obj);
            throw new IllegalArgumentException(sb.toString());
        }
        if (this.o.isEmpty()) {
            return "";
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("priority:");
        sb2.append(this.o.O(obj));
        sb2.append(":");
        return sb2.toString();
    }
    
    public int U(final k k) {
        final b s = this.S();
        final b s2 = k.S();
        if (s.equals(s2)) {
            return this.s(k);
        }
        return s.compareTo(s2);
    }
    
    @Override
    public boolean isEmpty() {
        return false;
    }
    
    @Override
    public Iterator iterator() {
        return Collections.emptyList().iterator();
    }
    
    public abstract int s(final k p0);
    
    @Override
    public n t() {
        return this.o;
    }
    
    @Override
    public String toString() {
        final String string = this.L(true).toString();
        if (string.length() <= 100) {
            return string;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(string.substring(0, 100));
        sb.append("...");
        return sb.toString();
    }
    
    @Override
    public n v(final d4.b b) {
        if (b.s()) {
            return this.o;
        }
        return g.W();
    }
    
    @Override
    public n y(final V3.k k, final n n) {
        final d4.b z = k.Z();
        if (z == null) {
            return n;
        }
        if (n.isEmpty() && !z.s()) {
            return this;
        }
        final boolean s = k.Z().s();
        boolean b = true;
        if (s) {
            b = (k.size() == 1 && b);
        }
        m.f(b);
        return this.N(z, g.W().y(k.c0(), n));
    }
    
    public enum b
    {
        o("DeferredValue", 0), 
        p("Boolean", 1), 
        q("Number", 2), 
        r("String", 3);
        
        public b(final String name, final int ordinal) {
        }
    }
}
