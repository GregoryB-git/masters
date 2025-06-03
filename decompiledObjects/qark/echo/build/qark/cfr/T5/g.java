/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.util.DisplayMetrics
 *  java.lang.Object
 */
package T5;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import androidx.window.layout.WindowMetrics;
import androidx.window.layout.l;

public abstract class g {
    public static void a(Context context, a a8) {
        Object object = g.b(context);
        if (object != null) {
            object = l.a().computeMaximumWindowMetrics((Activity)object);
            a8.a(object.getBounds().width(), object.getBounds().height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static Activity b(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity)context;
        }
        if (context instanceof ContextWrapper) {
            return g.b(((ContextWrapper)context).getBaseContext());
        }
        return null;
    }

    public static interface a {
        public void a(float var1, float var2, float var3);
    }

}

