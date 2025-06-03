package m2;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowInsets;
import android.view.WindowManager;
import e0.s0;
import ec.i;
import i2.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9873a = new a();

    public static Rect a(Context context) {
        i.e(context, "context");
        Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        i.d(bounds, "wm.currentWindowMetrics.bounds");
        return bounds;
    }

    public static l c(Context context) {
        i.e(context, "context");
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        s0 c10 = s0.c(windowManager.getCurrentWindowMetrics().getWindowInsets(), null);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        i.d(bounds, "wm.currentWindowMetrics.bounds");
        return new l(bounds, c10);
    }

    public static Rect d(Context context) {
        Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getMaximumWindowMetrics().getBounds();
        i.d(bounds, "wm.maximumWindowMetrics.bounds");
        return bounds;
    }

    public final s0 b(Context context) {
        i.e(context, "context");
        WindowInsets windowInsets = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
        i.d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        return s0.c(windowInsets, null);
    }
}
