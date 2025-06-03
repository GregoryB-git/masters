package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class WindowMetrics
{
  @NotNull
  private final Bounds _bounds;
  
  public WindowMetrics(@NotNull Rect paramRect)
  {
    this(new Bounds(paramRect));
  }
  
  public WindowMetrics(@NotNull Bounds paramBounds)
  {
    _bounds = paramBounds;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (Intrinsics.a(WindowMetrics.class, paramObject.getClass())))
    {
      paramObject = (WindowMetrics)paramObject;
      return Intrinsics.a(_bounds, _bounds);
    }
    return false;
  }
  
  @NotNull
  public final Rect getBounds()
  {
    return _bounds.toRect();
  }
  
  public int hashCode()
  {
    return _bounds.hashCode();
  }
  
  @NotNull
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("WindowMetrics { bounds: ");
    localStringBuilder.append(getBounds());
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.WindowMetrics
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */