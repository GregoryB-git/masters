/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.content.res.Resources
 *  android.graphics.Point
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.os.IBinder
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.Window
 *  androidx.annotation.NonNull
 *  com.onesignal.ActivityLifecycleHandler
 *  com.onesignal.OSViewUtils$1$1
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.WeakReference
 */
package com.onesignal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import com.onesignal.ActivityLifecycleHandler;
import com.onesignal.ActivityLifecycleListener;
import com.onesignal.OSViewUtils;
import java.lang.ref.WeakReference;

class OSViewUtils {
    private static final int MARGIN_ERROR_PX_SIZE = OSViewUtils.dpToPx(24);

    public static void decorViewReady(@NonNull Activity activity, @NonNull Runnable runnable) {
        Object object = new StringBuilder();
        object.append("decorViewReady:");
        object.append((Object)runnable);
        object = object.toString();
        activity.getWindow().getDecorView().post(new Runnable((String)object, runnable){
            public final String val$listenerKey;
            public final Runnable val$runnable;
            {
                this.val$listenerKey = string2;
                this.val$runnable = runnable;
            }

            public void run() {
                ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler();
                if (activityLifecycleHandler != null) {
                    activityLifecycleHandler.addActivityAvailableListener(this.val$listenerKey, (ActivityLifecycleHandler.ActivityAvailableListener)new 1(this, activityLifecycleHandler));
                }
            }
        });
    }

    public static int dpToPx(int n) {
        return (int)((float)n * Resources.getSystem().getDisplayMetrics().density);
    }

    public static int[] getCutoutAndStatusBarInsets(@NonNull Activity activity) {
        float f;
        Rect rect = OSViewUtils.getWindowVisibleDisplayFrame(activity);
        View view = activity.getWindow().findViewById(0x1020002);
        float f2 = (float)(rect.top - view.getTop()) / Resources.getSystem().getDisplayMetrics().density;
        float f3 = (float)(view.getBottom() - rect.bottom) / Resources.getSystem().getDisplayMetrics().density;
        int n = Build.VERSION.SDK_INT;
        float f4 = 0.0f;
        if (n == 29 && (activity = o3.g(activity.getWindowManager().getDefaultDisplay())) != null) {
            f4 = (float)activity.getSafeInsetRight() / Resources.getSystem().getDisplayMetrics().density;
            f = (float)activity.getSafeInsetLeft() / Resources.getSystem().getDisplayMetrics().density;
        } else {
            f = 0.0f;
        }
        return new int[]{Math.round((float)f2), Math.round((float)f3), Math.round((float)f4), Math.round((float)f)};
    }

    private static int getDisplaySizeY(@NonNull Activity activity) {
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        return point.y;
    }

    public static int getFullbleedWindowWidth(@NonNull Activity activity) {
        return activity.getWindow().getDecorView().getWidth();
    }

    public static int getWindowHeight(@NonNull Activity activity) {
        return OSViewUtils.getWindowHeightAPI23Plus(activity);
    }

    @TargetApi(value=23)
    private static int getWindowHeightAPI23Plus(@NonNull Activity activity) {
        View view = activity.getWindow().getDecorView();
        if ((activity = view.getRootWindowInsets()) == null) {
            return view.getHeight();
        }
        return view.getHeight() - activity.getStableInsetBottom() - activity.getStableInsetTop();
    }

    private static int getWindowHeightLollipop(@NonNull Activity activity) {
        if (activity.getResources().getConfiguration().orientation == 2) {
            return OSViewUtils.getWindowVisibleDisplayFrame(activity).height();
        }
        return OSViewUtils.getDisplaySizeY(activity);
    }

    @NonNull
    private static Rect getWindowVisibleDisplayFrame(@NonNull Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    public static int getWindowWidth(@NonNull Activity activity) {
        return OSViewUtils.getWindowVisibleDisplayFrame(activity).width();
    }

    public static boolean isActivityFullyReady(@NonNull Activity activity) {
        IBinder iBinder = activity.getWindow().getDecorView().getApplicationWindowToken();
        boolean bl = true;
        boolean bl2 = iBinder != null;
        boolean bl3 = activity.getWindow().getDecorView().getRootWindowInsets() != null;
        if (!bl2 || !bl3) {
            bl = false;
        }
        return bl;
    }

    public static boolean isKeyboardUp(WeakReference<Activity> view) {
        boolean bl;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Rect rect = new Rect();
        if (view.get() != null) {
            Window window = ((Activity)view.get()).getWindow();
            view = window.getDecorView();
            view.getWindowVisibleDisplayFrame(rect);
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            view = null;
        }
        boolean bl2 = bl = false;
        if (view != null) {
            bl2 = bl;
            if (displayMetrics.heightPixels - rect.bottom > MARGIN_ERROR_PX_SIZE) {
                bl2 = true;
            }
        }
        return bl2;
    }
}

