// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m5;

import E5.c;
import E5.d;

public class e implements b
{
    public b a;
    
    public e(final E5.c c, final String s) {
        new d(c, s).d((d.d)new d.d() {
            @Override
            public void a(final Object o) {
                e.d(e.this, null);
            }
            
            @Override
            public void b(final Object o, final b b) {
                e.d(e.this, b);
            }
        });
    }
    
    public static /* synthetic */ b d(final e e, final b a) {
        return e.a = a;
    }
    
    @Override
    public void a(final Object o) {
        final b a = this.a;
        if (a != null) {
            a.a(o);
        }
    }
    
    @Override
    public void b(final String s, final String s2, final Object o) {
        final b a = this.a;
        if (a != null) {
            a.b(s, s2, o);
        }
    }
    
    @Override
    public void c() {
        final b a = this.a;
        if (a != null) {
            a.c();
        }
    }
}
