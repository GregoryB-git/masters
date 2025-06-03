/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.animation.AnimationUtils
 *  android.view.animation.Interpolator
 *  java.lang.Object
 */
package u1;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class c {
    public static Interpolator a(Context context, int n8) {
        return AnimationUtils.loadInterpolator((Context)context, (int)n8);
    }
}

