// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w2;

import android.os.Bundle;

public final class v extends t
{
    public v(final int n, final int n2, final Bundle bundle) {
        super(n, 1, bundle);
    }
    
    @Override
    public final void a(Bundle bundle) {
        if ((bundle = bundle.getBundle("data")) == null) {
            bundle = Bundle.EMPTY;
        }
        this.d(bundle);
    }
    
    @Override
    public final boolean b() {
        return false;
    }
}
