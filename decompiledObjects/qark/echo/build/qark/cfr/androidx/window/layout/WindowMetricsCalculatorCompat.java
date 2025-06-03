/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.Point
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.view.Display
 *  android.view.DisplayCutout
 *  android.view.WindowManager
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.InstantiationException
 *  java.lang.NoSuchFieldException
 *  java.lang.NoSuchMethodException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.Field
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 */
package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import androidx.window.layout.ActivityCompatHelperApi24;
import androidx.window.layout.ActivityCompatHelperApi30;
import androidx.window.layout.DisplayCompatHelperApi17;
import androidx.window.layout.DisplayCompatHelperApi28;
import androidx.window.layout.WindowMetrics;
import androidx.window.layout.WindowMetricsCalculator;
import androidx.window.layout.m;
import androidx.window.layout.n;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class WindowMetricsCalculatorCompat
implements WindowMetricsCalculator {
    @NotNull
    public static final WindowMetricsCalculatorCompat INSTANCE = new WindowMetricsCalculatorCompat();
    @NotNull
    private static final String TAG;

    static {
        String string2 = WindowMetricsCalculatorCompat.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(string2, "WindowMetricsCalculatorC\u2026at::class.java.simpleName");
        TAG = string2;
    }

    private WindowMetricsCalculatorCompat() {
    }

    @SuppressLint(value={"BanUncheckedReflection"})
    private final DisplayCutout getCutoutForDisplay(Display object) {
        block8 : {
            void var1_8;
            try {
                Object object2 = Class.forName((String)"android.view.DisplayInfo").getConstructor(new Class[0]);
                object2.setAccessible(true);
                object2 = object2.newInstance(new Object[0]);
                Method method = object.getClass().getDeclaredMethod("getDisplayInfo", new Class[]{object2.getClass()});
                method.setAccessible(true);
                method.invoke(object, new Object[]{object2});
                object = object2.getClass().getDeclaredField("displayCutout");
                object.setAccessible(true);
                object = object.get(object2);
                if (m.a(object)) {
                    object = n.a(object);
                    return object;
                }
                break block8;
            }
            catch (InstantiationException instantiationException) {
            }
            catch (InvocationTargetException invocationTargetException) {
            }
            catch (IllegalAccessException illegalAccessException) {
            }
            catch (NoSuchFieldException noSuchFieldException) {
            }
            catch (NoSuchMethodException noSuchMethodException) {
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
            Log.w((String)TAG, (Throwable)var1_8);
        }
        return null;
    }

    private final int getNavigationBarHeight(Context context) {
        int n8 = (context = context.getResources()).getIdentifier("navigation_bar_height", "dimen", "android");
        if (n8 > 0) {
            return context.getDimensionPixelSize(n8);
        }
        return 0;
    }

    private final void getRectSizeFromDisplay(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    @NotNull
    @Override
    public WindowMetrics computeCurrentWindowMetrics(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter((Object)activity, "activity");
        int n8 = Build.VERSION.SDK_INT;
        activity = n8 >= 30 ? ActivityCompatHelperApi30.INSTANCE.currentWindowBounds(activity) : (n8 >= 29 ? this.computeWindowBoundsQ$window_release(activity) : (n8 >= 28 ? this.computeWindowBoundsP$window_release(activity) : (n8 >= 24 ? this.computeWindowBoundsN$window_release(activity) : this.computeWindowBoundsIceCreamSandwich$window_release(activity))));
        return new WindowMetrics((Rect)activity);
    }

    @NotNull
    @Override
    public WindowMetrics computeMaximumWindowMetrics(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter((Object)activity, "activity");
        if (Build.VERSION.SDK_INT >= 30) {
            activity = ActivityCompatHelperApi30.INSTANCE.maximumWindowBounds(activity);
        } else {
            activity = activity.getWindowManager().getDefaultDisplay();
            Intrinsics.checkNotNullExpressionValue((Object)activity, "display");
            activity = this.getRealSizeForDisplay$window_release((Display)activity);
            activity = new Rect(0, 0, activity.x, activity.y);
        }
        return new WindowMetrics((Rect)activity);
    }

    @NotNull
    public final Rect computeWindowBoundsIceCreamSandwich$window_release(@NotNull Activity activity) {
        int n8;
        Intrinsics.checkNotNullParameter((Object)activity, "activity");
        activity = activity.getWindowManager().getDefaultDisplay();
        Intrinsics.checkNotNullExpressionValue((Object)activity, "defaultDisplay");
        Point point = this.getRealSizeForDisplay$window_release((Display)activity);
        Rect rect = new Rect();
        int n9 = point.x;
        if (n9 != 0 && (n8 = point.y) != 0) {
            rect.right = n9;
            rect.bottom = n8;
            return rect;
        }
        activity.getRectSize(rect);
        return rect;
    }

    @NotNull
    public final Rect computeWindowBoundsN$window_release(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter((Object)activity, "activity");
        Rect rect = new Rect();
        Display display = activity.getWindowManager().getDefaultDisplay();
        display.getRectSize(rect);
        if (!ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
            Intrinsics.checkNotNullExpressionValue((Object)display, "defaultDisplay");
            display = this.getRealSizeForDisplay$window_release(display);
            int n8 = this.getNavigationBarHeight((Context)activity);
            int n9 = rect.bottom;
            if (n9 + n8 == display.y) {
                rect.bottom = n9 + n8;
                return rect;
            }
            n9 = rect.right;
            if (n9 + n8 == display.x) {
                rect.right = n9 + n8;
            }
        }
        return rect;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SuppressLint(value={"BanUncheckedReflection", "BlockedPrivateApi"})
    @NotNull
    public final Rect computeWindowBoundsP$window_release(@NotNull Activity activity) {
        Rect rect;
        Object object;
        int n8;
        Object object2;
        block20 : {
            Intrinsics.checkNotNullParameter((Object)activity, "activity");
            rect = new Rect();
            object = activity.getResources().getConfiguration();
            try {
                object2 = Configuration.class.getDeclaredField("windowConfiguration");
                object2.setAccessible(true);
                object = object2.get(object);
                boolean bl = ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity);
                if (bl) {
                    if ((object = object.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(object, new Object[0])) == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                    }
                    object = (Rect)object;
                } else {
                    if ((object = object.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(object, new Object[0])) == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                    }
                    object = (Rect)object;
                }
                rect.set((Rect)object);
                break block20;
            }
            catch (InvocationTargetException invocationTargetException) {
            }
            catch (IllegalAccessException illegalAccessException) {
            }
            catch (NoSuchMethodException noSuchMethodException) {
            }
            catch (NoSuchFieldException noSuchFieldException) {}
            Log.w((String)TAG, (Throwable)object);
            this.getRectSizeFromDisplay(activity, rect);
        }
        object2 = activity.getWindowManager().getDefaultDisplay();
        object = new Point();
        Object object3 = DisplayCompatHelperApi17.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(object2, "currentDisplay");
        object3.getRealSize((Display)object2, (Point)object);
        object3 = ActivityCompatHelperApi24.INSTANCE;
        if (!object3.isInMultiWindowMode(activity)) {
            int n9 = rect.bottom;
            n8 = this.getNavigationBarHeight((Context)activity);
            if (n9 + n8 == object.y) {
                rect.bottom = n9 + n8;
            } else {
                n9 = rect.right;
                if (n9 + n8 == object.x) {
                    rect.right = n9 + n8;
                } else if (rect.left == n8) {
                    rect.left = 0;
                }
            }
        }
        if (!(rect.width() >= object.x && rect.height() >= object.y || object3.isInMultiWindowMode(activity) || (activity = this.getCutoutForDisplay((Display)object2)) == null)) {
            n8 = rect.left;
            object2 = DisplayCompatHelperApi28.INSTANCE;
            if (n8 == object2.safeInsetLeft((DisplayCutout)activity)) {
                rect.left = 0;
            }
            if (object.x - rect.right == object2.safeInsetRight((DisplayCutout)activity)) {
                rect.right += object2.safeInsetRight((DisplayCutout)activity);
            }
            if (rect.top == object2.safeInsetTop((DisplayCutout)activity)) {
                rect.top = 0;
            }
            if (object.y - rect.bottom == object2.safeInsetBottom((DisplayCutout)activity)) {
                rect.bottom += object2.safeInsetBottom((DisplayCutout)activity);
            }
        }
        return rect;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SuppressLint(value={"BanUncheckedReflection", "BlockedPrivateApi"})
    @NotNull
    public final Rect computeWindowBoundsQ$window_release(@NotNull Activity activity) {
        void var2_3;
        Intrinsics.checkNotNullParameter((Object)activity, "activity");
        Object object = activity.getResources().getConfiguration();
        try {
            Field field = Configuration.class.getDeclaredField("windowConfiguration");
            field.setAccessible(true);
            object = field.get(object);
            object = object.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(object, new Object[0]);
            if (object != null) {
                return new Rect((Rect)object);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
        }
        catch (NoSuchMethodException noSuchMethodException) {
        }
        catch (NoSuchFieldException noSuchFieldException) {}
        Log.w((String)TAG, (Throwable)var2_3);
        return this.computeWindowBoundsP$window_release(activity);
    }

    @NotNull
    public final Point getRealSizeForDisplay$window_release(@NotNull Display display) {
        Intrinsics.checkNotNullParameter((Object)display, "display");
        Point point = new Point();
        DisplayCompatHelperApi17.INSTANCE.getRealSize(display, point);
        return point;
    }
}

