// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import android.view.View;
import android.os.Bundle;
import android.content.Context;

public abstract class g
{
    public Fragment b(final Context context, final String s, final Bundle bundle) {
        return Fragment.V(context, s, bundle);
    }
    
    public abstract View e(final int p0);
    
    public abstract boolean f();
}
