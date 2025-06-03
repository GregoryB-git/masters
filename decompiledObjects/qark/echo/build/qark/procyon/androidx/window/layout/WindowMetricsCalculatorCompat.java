// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.layout;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Build$VERSION;
import android.graphics.Rect;
import android.app.Activity;
import android.content.res.Resources;
import android.content.Context;
import android.annotation.SuppressLint;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import android.view.DisplayCutout;
import android.view.Display;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public final class WindowMetricsCalculatorCompat implements WindowMetricsCalculator
{
    @NotNull
    public static final WindowMetricsCalculatorCompat INSTANCE;
    @NotNull
    private static final String TAG;
    
    static {
        INSTANCE = new WindowMetricsCalculatorCompat();
        final String simpleName = WindowMetricsCalculatorCompat.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "WindowMetricsCalculatorC\u2026at::class.java.simpleName");
        TAG = simpleName;
    }
    
    private WindowMetricsCalculatorCompat() {
    }
    
    @SuppressLint({ "BanUncheckedReflection" })
    private final DisplayCutout getCutoutForDisplay(Display obj) {
        try {
            final Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor((Class<?>[])new Class[0]);
            constructor.setAccessible(true);
            final Object instance = constructor.newInstance(new Object[0]);
            final Method declaredMethod = obj.getClass().getDeclaredMethod("getDisplayInfo", instance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(obj, instance);
            obj = (InstantiationException)instance.getClass().getDeclaredField("displayCutout");
            ((AccessibleObject)obj).setAccessible(true);
            obj = (InstantiationException)((Field)obj).get(instance);
            if (m.a((Object)obj)) {
                obj = (InstantiationException)n.a((Object)obj);
                return (DisplayCutout)obj;
            }
            return null;
        }
        catch (InstantiationException obj) {}
        catch (InvocationTargetException obj) {}
        catch (IllegalAccessException obj) {}
        catch (NoSuchFieldException obj) {}
        catch (NoSuchMethodException obj) {}
        catch (ClassNotFoundException ex) {}
        Log.w(WindowMetricsCalculatorCompat.TAG, (Throwable)obj);
        return null;
    }
    
    private final int getNavigationBarHeight(final Context context) {
        final Resources resources = context.getResources();
        final int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }
    
    private final void getRectSizeFromDisplay(final Activity activity, final Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
    
    @NotNull
    @Override
    public WindowMetrics computeCurrentWindowMetrics(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        final int sdk_INT = Build$VERSION.SDK_INT;
        Rect rect;
        if (sdk_INT >= 30) {
            rect = ActivityCompatHelperApi30.INSTANCE.currentWindowBounds(activity);
        }
        else if (sdk_INT >= 29) {
            rect = this.computeWindowBoundsQ$window_release(activity);
        }
        else if (sdk_INT >= 28) {
            rect = this.computeWindowBoundsP$window_release(activity);
        }
        else if (sdk_INT >= 24) {
            rect = this.computeWindowBoundsN$window_release(activity);
        }
        else {
            rect = this.computeWindowBoundsIceCreamSandwich$window_release(activity);
        }
        return new WindowMetrics(rect);
    }
    
    @NotNull
    @Override
    public WindowMetrics computeMaximumWindowMetrics(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Rect maximumWindowBounds;
        if (Build$VERSION.SDK_INT >= 30) {
            maximumWindowBounds = ActivityCompatHelperApi30.INSTANCE.maximumWindowBounds(activity);
        }
        else {
            final Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            Intrinsics.checkNotNullExpressionValue(defaultDisplay, "display");
            final Point realSizeForDisplay$window_release = this.getRealSizeForDisplay$window_release(defaultDisplay);
            maximumWindowBounds = new Rect(0, 0, realSizeForDisplay$window_release.x, realSizeForDisplay$window_release.y);
        }
        return new WindowMetrics(maximumWindowBounds);
    }
    
    @NotNull
    public final Rect computeWindowBoundsIceCreamSandwich$window_release(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        final Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Intrinsics.checkNotNullExpressionValue(defaultDisplay, "defaultDisplay");
        final Point realSizeForDisplay$window_release = this.getRealSizeForDisplay$window_release(defaultDisplay);
        final Rect rect = new Rect();
        final int x = realSizeForDisplay$window_release.x;
        if (x != 0) {
            final int y = realSizeForDisplay$window_release.y;
            if (y != 0) {
                rect.right = x;
                rect.bottom = y;
                return rect;
            }
        }
        defaultDisplay.getRectSize(rect);
        return rect;
    }
    
    @NotNull
    public final Rect computeWindowBoundsN$window_release(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        final Rect rect = new Rect();
        final Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
            Intrinsics.checkNotNullExpressionValue(defaultDisplay, "defaultDisplay");
            final Point realSizeForDisplay$window_release = this.getRealSizeForDisplay$window_release(defaultDisplay);
            final int navigationBarHeight = this.getNavigationBarHeight((Context)activity);
            final int bottom = rect.bottom;
            if (bottom + navigationBarHeight == realSizeForDisplay$window_release.y) {
                rect.bottom = bottom + navigationBarHeight;
                return rect;
            }
            final int right = rect.right;
            if (right + navigationBarHeight == realSizeForDisplay$window_release.x) {
                rect.right = right + navigationBarHeight;
            }
        }
        return rect;
    }
    
    @SuppressLint({ "BanUncheckedReflection", "BlockedPrivateApi" })
    @NotNull
    public final Rect computeWindowBoundsP$window_release(@NotNull Activity cutoutForDisplay) {
        Intrinsics.checkNotNullParameter(cutoutForDisplay, "activity");
        final Rect rect = new Rect();
        final Configuration configuration = ((Context)cutoutForDisplay).getResources().getConfiguration();
        while (true) {
            try {
                final Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                final Object value = declaredField.get(configuration);
                Rect rect2;
                if (ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(cutoutForDisplay)) {
                    final Object invoke = value.getClass().getDeclaredMethod("getBounds", (Class<?>[])new Class[0]).invoke(value, new Object[0]);
                    if (invoke == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                    }
                    rect2 = (Rect)invoke;
                }
                else {
                    final Object invoke2 = value.getClass().getDeclaredMethod("getAppBounds", (Class<?>[])new Class[0]).invoke(value, new Object[0]);
                    if (invoke2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                    }
                    rect2 = (Rect)invoke2;
                }
                rect.set(rect2);
                while (true) {
                    final Display defaultDisplay = cutoutForDisplay.getWindowManager().getDefaultDisplay();
                    final Point point = new Point();
                    final DisplayCompatHelperApi17 instance = DisplayCompatHelperApi17.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(defaultDisplay, "currentDisplay");
                    instance.getRealSize(defaultDisplay, point);
                    final ActivityCompatHelperApi24 instance2 = ActivityCompatHelperApi24.INSTANCE;
                    if (!instance2.isInMultiWindowMode(cutoutForDisplay)) {
                        final int navigationBarHeight = this.getNavigationBarHeight((Context)cutoutForDisplay);
                        final int bottom = rect.bottom;
                        if (bottom + navigationBarHeight == point.y) {
                            rect.bottom = bottom + navigationBarHeight;
                        }
                        else {
                            final int right = rect.right;
                            if (right + navigationBarHeight == point.x) {
                                rect.right = right + navigationBarHeight;
                            }
                            else if (rect.left == navigationBarHeight) {
                                rect.left = 0;
                            }
                        }
                    }
                    if ((rect.width() < point.x || rect.height() < point.y) && !instance2.isInMultiWindowMode(cutoutForDisplay)) {
                        cutoutForDisplay = (Activity)this.getCutoutForDisplay(defaultDisplay);
                        if (cutoutForDisplay != null) {
                            final int left = rect.left;
                            final DisplayCompatHelperApi28 instance3 = DisplayCompatHelperApi28.INSTANCE;
                            if (left == instance3.safeInsetLeft((DisplayCutout)cutoutForDisplay)) {
                                rect.left = 0;
                            }
                            if (point.x - rect.right == instance3.safeInsetRight((DisplayCutout)cutoutForDisplay)) {
                                rect.right += instance3.safeInsetRight((DisplayCutout)cutoutForDisplay);
                            }
                            if (rect.top == instance3.safeInsetTop((DisplayCutout)cutoutForDisplay)) {
                                rect.top = 0;
                            }
                            if (point.y - rect.bottom == instance3.safeInsetBottom((DisplayCutout)cutoutForDisplay)) {
                                rect.bottom += instance3.safeInsetBottom((DisplayCutout)cutoutForDisplay);
                            }
                        }
                    }
                    return rect;
                    final InvocationTargetException ex;
                    Log.w(WindowMetricsCalculatorCompat.TAG, (Throwable)ex);
                    this.getRectSizeFromDisplay(cutoutForDisplay, rect);
                    continue;
                }
            }
            catch (InvocationTargetException ex) {
                continue;
            }
            catch (IllegalAccessException ex) {
                continue;
            }
            catch (NoSuchMethodException ex) {
                continue;
            }
            catch (NoSuchFieldException ex) {
                continue;
            }
            break;
        }
    }
    
    @SuppressLint({ "BanUncheckedReflection", "BlockedPrivateApi" })
    @NotNull
    public final Rect computeWindowBoundsQ$window_release(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        final Configuration configuration = ((Context)activity).getResources().getConfiguration();
        while (true) {
            try {
                final Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                final Object value = declaredField.get(configuration);
                final Object invoke = value.getClass().getDeclaredMethod("getBounds", (Class<?>[])new Class[0]).invoke(value, new Object[0]);
                if (invoke != null) {
                    return new Rect((Rect)invoke);
                }
                throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                final InvocationTargetException ex;
                Log.w(WindowMetricsCalculatorCompat.TAG, (Throwable)ex);
                return this.computeWindowBoundsP$window_release(activity);
            }
            catch (InvocationTargetException ex) {
                continue;
            }
            catch (IllegalAccessException ex) {
                continue;
            }
            catch (NoSuchMethodException ex) {
                continue;
            }
            catch (NoSuchFieldException ex) {
                continue;
            }
            break;
        }
    }
    
    @NotNull
    public final Point getRealSizeForDisplay$window_release(@NotNull final Display display) {
        Intrinsics.checkNotNullParameter(display, "display");
        final Point point = new Point();
        DisplayCompatHelperApi17.INSTANCE.getRealSize(display, point);
        return point;
    }
}
