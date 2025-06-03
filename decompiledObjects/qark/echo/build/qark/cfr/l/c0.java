/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.util.DisplayMetrics
 *  java.lang.Object
 *  java.lang.ref.WeakReference
 */
package l;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import java.lang.ref.WeakReference;
import l.M;

public class c0
extends Resources {
    public static boolean b = false;
    public final WeakReference a;

    public c0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.a = new WeakReference((Object)context);
    }

    public static boolean a() {
        return b;
    }

    public static boolean b() {
        c0.a();
        return false;
    }

    public final Drawable c(int n8) {
        return super.getDrawable(n8);
    }

    public Drawable getDrawable(int n8) {
        Context context = (Context)this.a.get();
        if (context != null) {
            return M.h().s(context, this, n8);
        }
        return super.getDrawable(n8);
    }
}

