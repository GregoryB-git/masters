// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.text.TextUtils;
import android.os.Bundle;

public final class c4 implements U5
{
    public final /* synthetic */ C3 a;
    
    public c4(final C3 a) {
        this.a = a;
    }
    
    @Override
    public final void r(final String s, final String s2, final Bundle bundle) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            this.a.Y("auto", s2, bundle, s);
            return;
        }
        this.a.y0("auto", s2, bundle);
    }
}
