/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 *  java.lang.Object
 *  java.lang.ThreadLocal
 *  java.util.WeakHashMap
 */
package g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import java.util.WeakHashMap;
import l.M;

public abstract class a {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static ColorStateList a(Context context, int n8) {
        return context.getColorStateList(n8);
    }

    public static Drawable b(Context context, int n8) {
        return M.h().j(context, n8);
    }
}

