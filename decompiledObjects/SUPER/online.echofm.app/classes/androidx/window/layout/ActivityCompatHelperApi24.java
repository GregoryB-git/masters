package androidx.window.layout;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class ActivityCompatHelperApi24
{
  @NotNull
  public static final ActivityCompatHelperApi24 INSTANCE = new ActivityCompatHelperApi24();
  
  public final boolean isInMultiWindowMode(@NotNull Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    return a.a(paramActivity);
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.ActivityCompatHelperApi24
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */