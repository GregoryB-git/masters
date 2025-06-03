// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import A2.n;
import V2.k;
import y2.a;
import x2.d;

public abstract class m
{
    public final d[] a;
    public final boolean b;
    public final int c;
    
    public m(final d[] a, final boolean b, final int c) {
        this.a = a;
        boolean b2 = false;
        if (a != null) {
            b2 = b2;
            if (b) {
                b2 = true;
            }
        }
        this.b = b2;
        this.c = c;
    }
    
    public static a a() {
        return new a(null);
    }
    
    public abstract void b(final y2.a.b p0, final k p1);
    
    public boolean c() {
        return this.b;
    }
    
    public final int d() {
        return this.c;
    }
    
    public final d[] e() {
        return this.a;
    }
    
    public static class a
    {
        public z2.k a;
        public boolean b = true;
        public d[] c;
        public int d = 0;
        
        public m a() {
            n.b(this.a != null, "execute parameter required");
            return new N(this, this.c, this.b, this.d);
        }
        
        public a b(final z2.k a) {
            this.a = a;
            return this;
        }
        
        public a c(final boolean b) {
            this.b = b;
            return this;
        }
        
        public a d(final d... c) {
            this.c = c;
            return this;
        }
    }
}
