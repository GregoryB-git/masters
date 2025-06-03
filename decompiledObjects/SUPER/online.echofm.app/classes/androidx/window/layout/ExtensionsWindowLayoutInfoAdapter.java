package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.extensions.layout.DisplayFeature;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class ExtensionsWindowLayoutInfoAdapter
{
  @NotNull
  public static final ExtensionsWindowLayoutInfoAdapter INSTANCE = new ExtensionsWindowLayoutInfoAdapter();
  
  private final boolean validBounds(Activity paramActivity, Bounds paramBounds)
  {
    paramActivity = WindowMetricsCalculatorCompat.INSTANCE.computeCurrentWindowMetrics(paramActivity).getBounds();
    if (paramBounds.isZero()) {
      return false;
    }
    if ((paramBounds.getWidth() != paramActivity.width()) && (paramBounds.getHeight() != paramActivity.height())) {
      return false;
    }
    if ((paramBounds.getWidth() < paramActivity.width()) && (paramBounds.getHeight() < paramActivity.height())) {
      return false;
    }
    return (paramBounds.getWidth() != paramActivity.width()) || (paramBounds.getHeight() != paramActivity.height());
  }
  
  public final FoldingFeature translate$window_release(@NotNull Activity paramActivity, @NotNull androidx.window.extensions.layout.FoldingFeature paramFoldingFeature)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    Intrinsics.checkNotNullParameter(paramFoldingFeature, "oemFeature");
    int i = paramFoldingFeature.getType();
    HardwareFoldingFeature localHardwareFoldingFeature = null;
    HardwareFoldingFeature.Type localType;
    if (i != 1)
    {
      if (i != 2) {
        return null;
      }
      localType = HardwareFoldingFeature.Type.Companion.getHINGE();
    }
    else
    {
      localType = HardwareFoldingFeature.Type.Companion.getFOLD();
    }
    i = paramFoldingFeature.getState();
    FoldingFeature.State localState;
    if (i != 1)
    {
      if (i != 2) {
        return null;
      }
      localState = FoldingFeature.State.HALF_OPENED;
    }
    else
    {
      localState = FoldingFeature.State.FLAT;
    }
    Rect localRect = paramFoldingFeature.getBounds();
    Intrinsics.checkNotNullExpressionValue(localRect, "oemFeature.bounds");
    if (validBounds(paramActivity, new Bounds(localRect)))
    {
      paramActivity = paramFoldingFeature.getBounds();
      Intrinsics.checkNotNullExpressionValue(paramActivity, "oemFeature.bounds");
      localHardwareFoldingFeature = new HardwareFoldingFeature(new Bounds(paramActivity), localType, localState);
    }
    return localHardwareFoldingFeature;
  }
  
  @NotNull
  public final WindowLayoutInfo translate$window_release(@NotNull Activity paramActivity, @NotNull androidx.window.extensions.layout.WindowLayoutInfo paramWindowLayoutInfo)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    Intrinsics.checkNotNullParameter(paramWindowLayoutInfo, "info");
    paramWindowLayoutInfo = paramWindowLayoutInfo.getDisplayFeatures();
    Intrinsics.checkNotNullExpressionValue(paramWindowLayoutInfo, "info.displayFeatures");
    paramWindowLayoutInfo = (Iterable)paramWindowLayoutInfo;
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramWindowLayoutInfo.iterator();
    while (localIterator.hasNext())
    {
      DisplayFeature localDisplayFeature = (DisplayFeature)localIterator.next();
      if ((localDisplayFeature instanceof androidx.window.extensions.layout.FoldingFeature))
      {
        paramWindowLayoutInfo = INSTANCE;
        Intrinsics.checkNotNullExpressionValue(localDisplayFeature, "feature");
        paramWindowLayoutInfo = paramWindowLayoutInfo.translate$window_release(paramActivity, (androidx.window.extensions.layout.FoldingFeature)localDisplayFeature);
      }
      else
      {
        paramWindowLayoutInfo = null;
      }
      if (paramWindowLayoutInfo != null) {
        localArrayList.add(paramWindowLayoutInfo);
      }
    }
    return new WindowLayoutInfo(localArrayList);
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.ExtensionsWindowLayoutInfoAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */