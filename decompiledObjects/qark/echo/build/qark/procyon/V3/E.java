// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V3;

import java.util.List;
import java.util.ArrayList;
import d4.n;
import d4.b;

public abstract class E
{
    public abstract E a(final d4.b p0);
    
    public abstract n b();
    
    public static class a extends E
    {
        public final x a;
        public final k b;
        
        public a(final x a, final k b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public E a(final d4.b b) {
            return new a(this.a, this.b.U(b));
        }
        
        @Override
        public n b() {
            return this.a.J(this.b, new ArrayList());
        }
    }
    
    public static class b extends E
    {
        public final n a;
        
        public b(final n a) {
            this.a = a;
        }
        
        @Override
        public E a(final d4.b b) {
            return new b(this.a.v(b));
        }
        
        @Override
        public n b() {
            return this.a;
        }
    }
}
