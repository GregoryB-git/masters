// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p5;

import E5.k;
import E5.j;

public class d extends p5.a
{
    public final a a;
    public final j b;
    
    public d(final j b, final k.d d) {
        this.b = b;
        this.a = new a(d);
    }
    
    @Override
    public Object c(final String s) {
        return this.b.a(s);
    }
    
    @Override
    public String i() {
        return this.b.a;
    }
    
    @Override
    public boolean j(final String s) {
        return this.b.c(s);
    }
    
    @Override
    public f o() {
        return this.a;
    }
    
    public class a implements f
    {
        public final k.d a;
        
        public a(final k.d a) {
            this.a = a;
        }
        
        @Override
        public void a(final Object o) {
            this.a.a(o);
        }
        
        @Override
        public void b(final String s, final String s2, final Object o) {
            this.a.b(s, s2, o);
        }
    }
}
