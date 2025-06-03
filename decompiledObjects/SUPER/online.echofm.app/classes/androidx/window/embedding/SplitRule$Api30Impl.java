package androidx.window.embedding;

import android.graphics.Rect;
import android.view.WindowMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class SplitRule$Api30Impl
{
  @NotNull
  public static final Api30Impl INSTANCE = new Api30Impl();
  
  @NotNull
  public final Rect getBounds(@NotNull WindowMetrics paramWindowMetrics)
  {
    Intrinsics.checkNotNullParameter(paramWindowMetrics, "windowMetrics");
    paramWindowMetrics = paramWindowMetrics.getBounds();
    Intrinsics.checkNotNullExpressionValue(paramWindowMetrics, "windowMetrics.bounds");
    return paramWindowMetrics;
  }
}

/* Location:
 * Qualified Name:     androidx.window.embedding.SplitRule.Api30Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */