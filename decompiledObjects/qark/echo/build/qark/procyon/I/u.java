// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I;

import android.content.res.Resources;
import android.content.Context;
import android.util.Log;
import android.view.ViewConfiguration;
import android.os.Build$VERSION;
import java.lang.reflect.Method;

public abstract class u
{
    public static Method a;
    
    static {
        if (Build$VERSION.SDK_INT != 25) {
            return;
        }
        while (true) {
            while (true) {
                try {
                    u.a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", (Class<?>[])new Class[0]);
                    return;
                    Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
                    return;
                }
                catch (Exception ex) {}
                continue;
            }
        }
    }
    
    public static int a(final ViewConfiguration viewConfiguration) {
        if (Build$VERSION.SDK_INT >= 28) {
            return u.a.a(viewConfiguration);
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }
    
    public static boolean b(final ViewConfiguration viewConfiguration, final Context context) {
        if (Build$VERSION.SDK_INT >= 28) {
            return u.a.b(viewConfiguration);
        }
        final Resources resources = context.getResources();
        final int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }
    
    public abstract static class a
    {
        public static int a(final ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }
        
        public static boolean b(final ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }
}
