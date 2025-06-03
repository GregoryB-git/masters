/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  java.lang.Object
 *  java.lang.ref.WeakReference
 */
package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
import l.M;
import l.N;

public class W
extends N {
    public final WeakReference b;

    public W(Context context, Resources resources) {
        super(resources);
        this.b = new WeakReference((Object)context);
    }

    @Override
    public Drawable getDrawable(int n8) {
        Drawable drawable2 = super.getDrawable(n8);
        Context context = (Context)this.b.get();
        if (drawable2 != null && context != null) {
            M.h().w(context, n8, drawable2);
        }
        return drawable2;
    }
}

