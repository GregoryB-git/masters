// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D4;

import E4.g;
import E4.f;
import E4.h;
import E4.d;
import E4.c;
import A4.e;

public final class a implements D4.b
{
    public U5.a a;
    public U5.a b;
    public U5.a c;
    public U5.a d;
    public U5.a e;
    public U5.a f;
    public U5.a g;
    public U5.a h;
    
    public a(final E4.a a) {
        this.c(a);
    }
    
    public static b b() {
        return new b(null);
    }
    
    @Override
    public e a() {
        return (e)this.h.get();
    }
    
    public final void c(final E4.a a) {
        this.a = E4.c.a(a);
        this.b = E4.e.a(a);
        this.c = E4.d.a(a);
        this.d = E4.h.a(a);
        this.e = E4.f.a(a);
        this.f = E4.b.a(a);
        final g a2 = E4.g.a(a);
        this.g = a2;
        this.h = q5.a.a(A4.g.a(this.a, this.b, this.c, this.d, this.e, this.f, a2));
    }
    
    public static final class b
    {
        public E4.a a;
        
        public D4.b a() {
            q5.b.a(this.a, E4.a.class);
            return new a(this.a, null);
        }
        
        public b b(final E4.a a) {
            this.a = (E4.a)q5.b.b(a);
            return this;
        }
    }
}
