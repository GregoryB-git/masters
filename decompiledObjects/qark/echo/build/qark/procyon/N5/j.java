// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N5;

import java.util.HashMap;
import t4.a;
import s4.h;
import E5.d;

public class j implements d
{
    public final h a;
    public t4.a b;
    
    public j(final h a) {
        this.a = a;
    }
    
    @Override
    public void a(final Object o) {
        if (this.b != null) {
            this.b = null;
        }
    }
    
    @Override
    public void b(final Object o, final b b) {
        final t4.a d = this.d(b);
        this.b = d;
        this.a.F(d);
    }
    
    public t4.a d(final b b) {
        return new i(b);
    }
}
