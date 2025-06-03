// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.layout;

import kotlin.jvm.internal.Intrinsics;
import android.graphics.Rect;
import android.app.Activity;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public final class ActivityCompatHelperApi30
{
    @NotNull
    public static final ActivityCompatHelperApi30 INSTANCE;
    
    static {
        INSTANCE = new ActivityCompatHelperApi30();
    }
    
    private ActivityCompatHelperApi30() {
    }
    
    @NotNull
    public final Rect currentWindowBounds(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        final Rect a = c.a(d.a(activity.getWindowManager()));
        Intrinsics.checkNotNullExpressionValue(a, "activity.windowManager.currentWindowMetrics.bounds");
        return a;
    }
    
    @NotNull
    public final Rect maximumWindowBounds(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        final Rect a = c.a(b.a(activity.getWindowManager()));
        Intrinsics.checkNotNullExpressionValue(a, "activity.windowManager.maximumWindowMetrics.bounds");
        return a;
    }
}
