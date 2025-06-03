// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x3;

import android.os.BaseBundle;
import android.os.Bundle;
import Q2.a;

public final class c implements a
{
    public final /* synthetic */ d a;
    
    public c(final d a) {
        this.a = a;
    }
    
    @Override
    public final void a(final String s, final String s2, final Bundle bundle, final long n) {
        if (!this.a.a.contains(s2)) {
            return;
        }
        final Bundle bundle2 = new Bundle();
        ((BaseBundle)bundle2).putString("events", x3.a.b(s2));
        d.a(this.a).a(2, bundle2);
    }
}
