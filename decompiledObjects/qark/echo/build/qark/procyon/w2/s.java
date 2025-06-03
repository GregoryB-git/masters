// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w2;

import android.os.BaseBundle;
import android.os.Bundle;

public final class s extends t
{
    public s(final int n, final int n2, final Bundle bundle) {
        super(n, 2, bundle);
    }
    
    @Override
    public final void a(final Bundle bundle) {
        if (((BaseBundle)bundle).getBoolean("ack", false)) {
            this.d(null);
            return;
        }
        this.c(new u(4, "Invalid response to one way request", null));
    }
    
    @Override
    public final boolean b() {
        return true;
    }
}
