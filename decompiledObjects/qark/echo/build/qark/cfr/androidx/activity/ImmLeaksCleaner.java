/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 *  android.view.inputmethod.InputMethodManager
 *  java.lang.ClassCastException
 *  java.lang.IllegalAccessException
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Field
 */
package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import java.lang.reflect.Field;

final class ImmLeaksCleaner
implements f {
    public static int p;
    public static Field q;
    public static Field r;
    public static Field s;
    public Activity o;

    public ImmLeaksCleaner(Activity activity) {
        this.o = activity;
    }

    public static void b() {
        try {
            Field field;
            p = 2;
            r = field = InputMethodManager.class.getDeclaredField("mServedView");
            field.setAccessible(true);
            s = field = InputMethodManager.class.getDeclaredField("mNextServedView");
            field.setAccessible(true);
            q = field = InputMethodManager.class.getDeclaredField("mH");
            field.setAccessible(true);
            p = 1;
            return;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void a(h object, d.b b8) {
        View view;
        block15 : {
            block14 : {
                if (b8 != d.b.ON_DESTROY) {
                    return;
                }
                if (p == 0) {
                    ImmLeaksCleaner.b();
                }
                if (p != 1) return;
                b8 = (InputMethodManager)this.o.getSystemService("input_method");
                object = q.get((Object)b8);
                if (object != null) break block14;
                return;
                {
                    catch (IllegalAccessException illegalAccessException) {
                        return;
                    }
                }
            }
            // MONITORENTER : object
            view = (View)r.get((Object)b8);
            if (view != null) break block15;
            // MONITOREXIT : object
            return;
        }
        if (view.isAttachedToWindow()) {
            // MONITOREXIT : object
            return;
        }
        try {
            s.set((Object)b8, (Object)null);
            // MONITOREXIT : object
        }
        catch (IllegalAccessException illegalAccessException) {}
        b8.isActive();
        return;
        catch (IllegalAccessException illegalAccessException) {
            return;
        }
        catch (ClassCastException classCastException) {
            return;
        }
        // MONITOREXIT : object
        return;
    }
}

