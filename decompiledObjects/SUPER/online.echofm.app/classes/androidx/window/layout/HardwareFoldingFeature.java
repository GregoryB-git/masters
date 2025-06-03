package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class HardwareFoldingFeature
  implements FoldingFeature
{
  @NotNull
  public static final Companion Companion = new Companion(null);
  @NotNull
  private final Bounds featureBounds;
  @NotNull
  private final FoldingFeature.State state;
  @NotNull
  private final Type type;
  
  public HardwareFoldingFeature(@NotNull Bounds paramBounds, @NotNull Type paramType, @NotNull FoldingFeature.State paramState)
  {
    featureBounds = paramBounds;
    type = paramType;
    state = paramState;
    Companion.validateFeatureBounds$window_release(paramBounds);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    Class localClass;
    if (paramObject == null) {
      localClass = null;
    } else {
      localClass = paramObject.getClass();
    }
    if (!Intrinsics.a(HardwareFoldingFeature.class, localClass)) {
      return false;
    }
    if (paramObject != null)
    {
      paramObject = (HardwareFoldingFeature)paramObject;
      if (!Intrinsics.a(featureBounds, featureBounds)) {
        return false;
      }
      if (!Intrinsics.a(type, type)) {
        return false;
      }
      return Intrinsics.a(getState(), ((HardwareFoldingFeature)paramObject).getState());
    }
    throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
  }
  
  @NotNull
  public Rect getBounds()
  {
    return featureBounds.toRect();
  }
  
  @NotNull
  public FoldingFeature.OcclusionType getOcclusionType()
  {
    FoldingFeature.OcclusionType localOcclusionType;
    if ((featureBounds.getWidth() != 0) && (featureBounds.getHeight() != 0)) {
      localOcclusionType = FoldingFeature.OcclusionType.FULL;
    } else {
      localOcclusionType = FoldingFeature.OcclusionType.NONE;
    }
    return localOcclusionType;
  }
  
  @NotNull
  public FoldingFeature.Orientation getOrientation()
  {
    FoldingFeature.Orientation localOrientation;
    if (featureBounds.getWidth() > featureBounds.getHeight()) {
      localOrientation = FoldingFeature.Orientation.HORIZONTAL;
    } else {
      localOrientation = FoldingFeature.Orientation.VERTICAL;
    }
    return localOrientation;
  }
  
  @NotNull
  public FoldingFeature.State getState()
  {
    return state;
  }
  
  @NotNull
  public final Type getType$window_release()
  {
    return type;
  }
  
  public int hashCode()
  {
    return (featureBounds.hashCode() * 31 + type.hashCode()) * 31 + getState().hashCode();
  }
  
  public boolean isSeparating()
  {
    Type localType = type;
    HardwareFoldingFeature.Type.Companion localCompanion = Type.Companion;
    boolean bool1 = Intrinsics.a(localType, localCompanion.getHINGE());
    boolean bool2 = true;
    if ((!bool1) && ((!Intrinsics.a(type, localCompanion.getFOLD())) || (!Intrinsics.a(getState(), FoldingFeature.State.HALF_OPENED)))) {
      bool2 = false;
    }
    return bool2;
  }
  
  @NotNull
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(HardwareFoldingFeature.class.getSimpleName());
    localStringBuilder.append(" { ");
    localStringBuilder.append(featureBounds);
    localStringBuilder.append(", type=");
    localStringBuilder.append(type);
    localStringBuilder.append(", state=");
    localStringBuilder.append(getState());
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
  
  @Metadata
  public static final class Companion
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
  
  @Metadata
  public static final class Type
  {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Type FOLD = new Type("FOLD");
    @NotNull
    private static final Type HINGE = new Type("HINGE");
    @NotNull
    private final String description;
    
    private Type(String paramString)
    {
      description = paramString;
    }
    
    @NotNull
    public String toString()
    {
      return description;
    }
    
    @Metadata
    public static final class Companion
    {
      @NotNull
      public final HardwareFoldingFeature.Type getFOLD()
      {
        return HardwareFoldingFeature.Type.access$getFOLD$cp();
      }
      
      @NotNull
      public final HardwareFoldingFeature.Type getHINGE()
      {
        return HardwareFoldingFeature.Type.access$getHINGE$cp();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.HardwareFoldingFeature
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */