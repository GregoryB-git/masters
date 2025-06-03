/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.ActionBar
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnKeyListener
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.KeyEvent
 *  android.view.KeyEvent$Callback
 *  android.view.KeyEvent$DispatcherState
 *  android.view.View
 *  android.view.Window
 *  android.view.Window$Callback
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.NoSuchFieldException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Field
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 */
package I;

import I.s;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class f {
    public static boolean a = false;
    public static Method b;
    public static boolean c = false;
    public static Field d;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a(ActionBar object, KeyEvent keyEvent) {
        Method method;
        if (!a) {
            try {
                b = object.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            }
            catch (NoSuchMethodException noSuchMethodException) {}
            a = true;
        }
        if ((method = b) == null) {
            return false;
        }
        try {
            object = method.invoke(object, new Object[]{keyEvent});
            if (object != null) return (Boolean)object;
            return false;
        }
        catch (IllegalAccessException | InvocationTargetException invocationTargetException) {
            return false;
        }
    }

    public static boolean b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && f.a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        if (s.d((View)(window = window.getDecorView()), keyEvent)) {
            return true;
        }
        window = window != null ? window.getKeyDispatcherState() : null;
        return keyEvent.dispatch((KeyEvent.Callback)activity, (KeyEvent.DispatcherState)window, (Object)activity);
    }

    public static boolean c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener = f.f(dialog);
        if (onKeyListener != null && onKeyListener.onKey((DialogInterface)dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        onKeyListener = dialog.getWindow();
        if (onKeyListener.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        if (s.d((View)(onKeyListener = onKeyListener.getDecorView()), keyEvent)) {
            return true;
        }
        onKeyListener = onKeyListener != null ? onKeyListener.getKeyDispatcherState() : null;
        return keyEvent.dispatch((KeyEvent.Callback)dialog, (KeyEvent.DispatcherState)onKeyListener, (Object)dialog);
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        return s.e(view, keyEvent);
    }

    public static boolean e(a a8, View view, Window.Callback callback, KeyEvent keyEvent) {
        boolean bl = false;
        if (a8 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return a8.b(keyEvent);
        }
        if (callback instanceof Activity) {
            return f.b((Activity)callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return f.c((Dialog)callback, keyEvent);
        }
        if (view != null && s.d(view, keyEvent) || a8.b(keyEvent)) {
            bl = true;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static DialogInterface.OnKeyListener f(Dialog dialog) {
        Field field;
        if (!c) {
            try {
                d = field = Dialog.class.getDeclaredField("mOnKeyListener");
                field.setAccessible(true);
            }
            catch (NoSuchFieldException noSuchFieldException) {}
            c = true;
        }
        if ((field = d) == null) return null;
        try {
            return (DialogInterface.OnKeyListener)field.get((Object)dialog);
        }
        catch (IllegalAccessException illegalAccessException) {
            return null;
        }
    }

    public static interface a {
        public boolean b(KeyEvent var1);
    }

}

