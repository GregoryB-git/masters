/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.util.Log
 *  android.view.View
 *  java.lang.Class
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Method
 */
package l;

import I.s;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

public abstract class d0 {
    public static Method a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        try {
            Method method;
            a = method = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
            if (method.isAccessible()) return;
            a.setAccessible(true);
            return;
        }
        catch (NoSuchMethodException noSuchMethodException) {}
        Log.d((String)"ViewUtils", (String)"Could not find method computeFitSystemWindows. Oh well.");
    }

    public static boolean a(View view) {
        if (s.m(view) == 1) {
            return true;
        }
        return false;
    }
}

