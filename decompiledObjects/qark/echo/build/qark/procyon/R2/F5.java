// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import java.util.Map;

public final class F5 implements e2
{
    public final /* synthetic */ String a;
    public final /* synthetic */ D5 b;
    
    public F5(final D5 b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final String s, final int n, final Throwable t, final byte[] array, final Map map) {
        this.b.I(true, n, t, array, this.a);
    }
}
