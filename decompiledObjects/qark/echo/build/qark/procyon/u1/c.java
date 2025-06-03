// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u1;

import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.content.Context;

public abstract class c
{
    public static Interpolator a(final Context context, final int n) {
        return AnimationUtils.loadInterpolator(context, n);
    }
}
