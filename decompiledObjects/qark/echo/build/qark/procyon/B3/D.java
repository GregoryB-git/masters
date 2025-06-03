// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B3;

import r4.a;
import r4.b;

public class D implements b, a
{
    public static final a c;
    public static final b d;
    public a a;
    public volatile b b;
    
    static {
        c = new A();
        d = new B();
    }
    
    public D(final a a, final b b) {
        this.a = a;
        this.b = b;
    }
    
    public static D e() {
        return new D(D.c, D.d);
    }
    
    public static D i(final b b) {
        return new D(null, b);
    }
    
    @Override
    public void a(final a a) {
        final b b = this.b;
        final b d = D.d;
        if (b != d) {
            a.a(b);
            return;
        }
        synchronized (this) {
            final b b2 = this.b;
            b b3;
            if (b2 != d) {
                b3 = b2;
            }
            else {
                this.a = new C(this.a, a);
                b3 = null;
            }
            // monitorexit(this)
            if (b3 != null) {
                a.a(b2);
            }
        }
    }
    
    @Override
    public Object get() {
        return this.b.get();
    }
    
    public void j(final b b) {
        if (this.b == D.d) {
            synchronized (this) {
                final a a = this.a;
                this.a = null;
                this.b = b;
                // monitorexit(this)
                a.a(b);
                return;
            }
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
