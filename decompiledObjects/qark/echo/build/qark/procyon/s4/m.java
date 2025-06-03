// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s4;

import u4.d;
import V2.k;

public class m implements p
{
    public final k a;
    
    public m(final k a) {
        this.a = a;
    }
    
    @Override
    public boolean a(final Exception ex) {
        return false;
    }
    
    @Override
    public boolean b(final d d) {
        if (!d.l() && !d.k() && !d.i()) {
            return false;
        }
        this.a.e(d.d());
        return true;
    }
}
