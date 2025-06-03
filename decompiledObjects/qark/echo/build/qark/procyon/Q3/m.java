// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q3;

import d4.b;
import d4.o;
import Z3.a;
import d4.n;
import V3.C;
import V3.k;
import V3.t;

public class m
{
    public final t a;
    public final k b;
    
    public m(final t a, final k b) {
        this.a = a;
        C.g(this.b = b, this.c());
    }
    
    public m(final n n) {
        this(new t(n), new k(""));
    }
    
    public String a() {
        if (this.b.X() != null) {
            return this.b.X().e();
        }
        return null;
    }
    
    public n b() {
        return this.a.a(this.b);
    }
    
    public Object c() {
        return this.b().getValue();
    }
    
    public void d(Object b) {
        C.g(this.b, b);
        b = Z3.a.b(b);
        Y3.n.k(b);
        this.a.c(this.b, o.a(b));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof m) {
            final t a = this.a;
            final m m = (m)o;
            if (a.equals(m.a) && this.b.equals(m.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        final b z = this.b.Z();
        final StringBuilder sb = new StringBuilder();
        sb.append("MutableData { key = ");
        String e;
        if (z != null) {
            e = z.e();
        }
        else {
            e = "<none>";
        }
        sb.append(e);
        sb.append(", value = ");
        sb.append(this.a.b().L(true));
        sb.append(" }");
        return sb.toString();
    }
}
