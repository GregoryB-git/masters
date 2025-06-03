// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.text.TextUtils;
import android.os.Bundle;

public final class K5 implements U5
{
    public final /* synthetic */ D5 a;
    
    public K5(final D5 a) {
        this.a = a;
    }
    
    @Override
    public final void r(final String s, final String s2, final Bundle bundle) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            if (D5.h(this.a) != null) {
                D5.h(this.a).j().G().b("AppId not known when logging event", s2);
            }
        }
        else {
            this.a.e().D(new J5(this, s, s2, bundle));
        }
    }
}
