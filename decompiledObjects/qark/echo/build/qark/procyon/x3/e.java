// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x3;

import android.os.BaseBundle;
import android.os.Bundle;
import Q2.a;

public final class e implements a
{
    public final /* synthetic */ f a;
    
    public e(final f a) {
        this.a = a;
    }
    
    @Override
    public final void a(final String s, final String s2, final Bundle bundle, final long n) {
        if (s != null && x3.a.i(s2)) {
            final Bundle bundle2 = new Bundle();
            ((BaseBundle)bundle2).putString("name", s2);
            ((BaseBundle)bundle2).putLong("timestampInMillis", n);
            bundle2.putBundle("params", bundle);
            f.a(this.a).a(3, bundle2);
        }
    }
}
