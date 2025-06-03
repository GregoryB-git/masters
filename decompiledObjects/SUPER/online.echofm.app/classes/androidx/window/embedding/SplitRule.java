package androidx.window.embedding;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.WindowMetrics;
import androidx.window.core.ExperimentalWindowApi;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public class SplitRule
  extends EmbeddingRule
{
  private final int layoutDirection;
  private final int minSmallestWidth;
  private final int minWidth;
  private final float splitRatio;
  
  public SplitRule()
  {
    this(0, 0, 0.0F, 0, 15, null);
  }
  
  public SplitRule(int paramInt1, int paramInt2, float paramFloat, int paramInt3)
  {
    minWidth = paramInt1;
    minSmallestWidth = paramInt2;
    splitRatio = paramFloat;
    layoutDirection = paramInt3;
  }
  
  public final boolean checkParentMetrics(@NotNull WindowMetrics paramWindowMetrics)
  {
    Intrinsics.checkNotNullParameter(paramWindowMetrics, "parentMetrics");
    int i = Build.VERSION.SDK_INT;
    boolean bool1 = false;
    if (i <= 30) {
      return false;
    }
    paramWindowMetrics = Api30Impl.INSTANCE.getBounds(paramWindowMetrics);
    if ((minWidth != 0) && (paramWindowMetrics.width() < minWidth)) {
      i = 0;
    } else {
      i = 1;
    }
    int j;
    if ((minSmallestWidth != 0) && (Math.min(paramWindowMetrics.width(), paramWindowMetrics.height()) < minSmallestWidth)) {
      j = 0;
    } else {
      j = 1;
    }
    boolean bool2 = bool1;
    if (i != 0)
    {
      bool2 = bool1;
      if (j != 0) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof SplitRule)) {
      return false;
    }
    int i = minWidth;
    paramObject = (SplitRule)paramObject;
    if (i != minWidth) {
      return false;
    }
    if (minSmallestWidth != minSmallestWidth) {
      return false;
    }
    if (splitRatio == splitRatio) {
      return layoutDirection == layoutDirection;
    }
    return false;
  }
  
  public final int getLayoutDirection()
  {
    return layoutDirection;
  }
  
  public final int getMinSmallestWidth()
  {
    return minSmallestWidth;
  }
  
  public final int getMinWidth()
  {
    return minWidth;
  }
  
  public final float getSplitRatio()
  {
    return splitRatio;
  }
  
  public int hashCode()
  {
    return ((minWidth * 31 + minSmallestWidth) * 31 + Float.floatToIntBits(splitRatio)) * 31 + layoutDirection;
  }
  
  @Metadata
  public static final class Api30Impl
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
  
  @Retention(RetentionPolicy.SOURCE)
  @Metadata
  public static @interface LayoutDir {}
}

/* Location:
 * Qualified Name:     androidx.window.embedding.SplitRule
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */