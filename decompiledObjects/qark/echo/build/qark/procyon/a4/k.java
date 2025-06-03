// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a4;

import d4.i;
import d4.n;

public class k
{
    public final a a;
    public final a b;
    
    public k(final a a, final a b) {
        this.a = a;
        this.b = b;
    }
    
    public n a() {
        if (this.a.f()) {
            return this.a.b();
        }
        return null;
    }
    
    public n b() {
        if (this.b.f()) {
            return this.b.b();
        }
        return null;
    }
    
    public a c() {
        return this.a;
    }
    
    public a d() {
        return this.b;
    }
    
    public k e(final i i, final boolean b, final boolean b2) {
        return new k(new a(i, b, b2), this.b);
    }
    
    public k f(final i i, final boolean b, final boolean b2) {
        return new k(this.a, new a(i, b, b2));
    }
}
