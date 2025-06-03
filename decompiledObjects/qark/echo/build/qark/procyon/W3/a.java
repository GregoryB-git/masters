// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W3;

import Y3.m;
import d4.b;
import V3.k;

public class a extends d
{
    public final boolean d;
    public final Y3.d e;
    
    public a(final k k, final Y3.d e, final boolean d) {
        super(W3.d.a.q, W3.e.d, k);
        this.e = e;
        this.d = d;
    }
    
    @Override
    public d d(final b b) {
        if (!super.c.isEmpty()) {
            m.g(super.c.Z().equals(b), "operationForChild called for unrelated child.");
            return new a(super.c.c0(), this.e, this.d);
        }
        if (this.e.getValue() != null) {
            m.g(this.e.M().isEmpty(), "affectedTree should not have overlapping affected paths.");
            return this;
        }
        return new a(k.Y(), this.e.Y(new k(new b[] { b })), this.d);
    }
    
    public Y3.d e() {
        return this.e;
    }
    
    public boolean f() {
        return this.d;
    }
    
    @Override
    public String toString() {
        return String.format("AckUserWrite { path=%s, revert=%s, affectedTree=%s }", this.a(), this.d, this.e);
    }
}
