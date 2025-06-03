/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.graphics.Rect
 *  android.view.WindowManager
 *  java.lang.Object
 */
package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;
import androidx.window.layout.b;
import androidx.window.layout.c;
import androidx.window.layout.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class ActivityCompatHelperApi30 {
    @NotNull
    public static final ActivityCompatHelperApi30 INSTANCE = new ActivityCompatHelperApi30();

    private ActivityCompatHelperApi30() {
    }

    @NotNull
    public final Rect currentWindowBounds(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter((Object)activity, "activity");
        activity = c.a(d.a(activity.getWindowManager()));
        Intrinsics.checkNotNullExpressionValue((Object)activity, "activity.windowManager.currentWindowMetrics.bounds");
        return activity;
    }

    @NotNull
    public final Rect maximumWindowBounds(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter((Object)activity, "activity");
        activity = c.a(b.a(activity.getWindowManager()));
        Intrinsics.checkNotNullExpressionValue((Object)activity, "activity.windowManager.maximumWindowMetrics.bounds");
        return activity;
    }
}

