package androidx.window.layout;

import W5.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class WindowLayoutInfo
{
  @NotNull
  private final List<DisplayFeature> displayFeatures;
  
  public WindowLayoutInfo(@NotNull List<? extends DisplayFeature> paramList)
  {
    displayFeatures = paramList;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (Intrinsics.a(WindowLayoutInfo.class, paramObject.getClass())))
    {
      paramObject = (WindowLayoutInfo)paramObject;
      return Intrinsics.a(displayFeatures, displayFeatures);
    }
    return false;
  }
  
  @NotNull
  public final List<DisplayFeature> getDisplayFeatures()
  {
    return displayFeatures;
  }
  
  public int hashCode()
  {
    return displayFeatures.hashCode();
  }
  
  @NotNull
  public String toString()
  {
    return m.x((Iterable)displayFeatures, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.WindowLayoutInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */