// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V3;

import d4.h;
import d4.m;
import java.util.List;
import java.util.Collections;
import d4.n;
import a4.a;
import d4.b;

public class G
{
    public final k a;
    public final F b;
    
    public G(final k a, final F b) {
        this.a = a;
        this.b = b;
    }
    
    public n a(final b b, final a a) {
        return this.b.c(this.a, b, a);
    }
    
    public n b(final n n) {
        return this.c(n, Collections.emptyList());
    }
    
    public n c(final n n, final List list) {
        return this.d(n, list, false);
    }
    
    public n d(final n n, final List list, final boolean b) {
        return this.b.d(this.a, n, list, b);
    }
    
    public n e(final n n) {
        return this.b.e(this.a, n);
    }
    
    public n f(final k k, final n n, final n n2) {
        return this.b.f(this.a, k, n, n2);
    }
    
    public m g(final n n, final m m, final boolean b, final h h) {
        return this.b.g(this.a, n, m, b, h);
    }
    
    public G h(final b b) {
        return new G(this.a.U(b), this.b);
    }
    
    public n i(final k k) {
        return this.b.o(this.a.T(k));
    }
}
