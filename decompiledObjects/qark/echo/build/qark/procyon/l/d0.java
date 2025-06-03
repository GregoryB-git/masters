// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import I.s;
import android.util.Log;
import android.graphics.Rect;
import android.view.View;
import java.lang.reflect.Method;

public abstract class d0
{
    public static Method a;
    
    static {
        while (true) {
            while (true) {
                try {
                    if (!(d0.a = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class)).isAccessible()) {
                        d0.a.setAccessible(true);
                        return;
                    }
                    return;
                    Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                    return;
                }
                catch (NoSuchMethodException ex) {}
                continue;
            }
        }
    }
    
    public static boolean a(final View view) {
        return s.m(view) == 1;
    }
}
