package androidx.window.layout;

import androidx.window.core.Bounds;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class HardwareFoldingFeature$Companion
{
  public final void validateFeatureBounds$window_release(@NotNull Bounds paramBounds)
  {
    Intrinsics.checkNotNullParameter(paramBounds, "bounds");
    int i = paramBounds.getWidth();
    int j = 1;
    if ((i == 0) && (paramBounds.getHeight() == 0)) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0)
    {
      i = j;
      if (paramBounds.getLeft() != 0) {
        if (paramBounds.getTop() == 0) {
          i = j;
        } else {
          i = 0;
        }
      }
      if (i != 0) {
        return;
      }
      throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
    }
    throw new IllegalArgumentException("Bounds must be non zero".toString());
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.HardwareFoldingFeature.Companion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */