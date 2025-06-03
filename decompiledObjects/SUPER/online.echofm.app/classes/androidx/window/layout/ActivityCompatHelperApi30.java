package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class ActivityCompatHelperApi30
{
  @NotNull
  public static final ActivityCompatHelperApi30 INSTANCE = new ActivityCompatHelperApi30();
  
  @NotNull
  public final Rect currentWindowBounds(@NotNull Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    paramActivity = c.a(d.a(paramActivity.getWindowManager()));
    Intrinsics.checkNotNullExpressionValue(paramActivity, "activity.windowManager.currentWindowMetrics.bounds");
    return paramActivity;
  }
  
  @NotNull
  public final Rect maximumWindowBounds(@NotNull Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    paramActivity = c.a(b.a(paramActivity.getWindowManager()));
    Intrinsics.checkNotNullExpressionValue(paramActivity, "activity.windowManager.maximumWindowMetrics.bounds");
    return paramActivity;
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.ActivityCompatHelperApi30
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */