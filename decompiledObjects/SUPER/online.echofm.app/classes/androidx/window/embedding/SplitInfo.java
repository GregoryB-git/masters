package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public final class SplitInfo
{
  @NotNull
  private final ActivityStack primaryActivityStack;
  @NotNull
  private final ActivityStack secondaryActivityStack;
  private final float splitRatio;
  
  public SplitInfo(@NotNull ActivityStack paramActivityStack1, @NotNull ActivityStack paramActivityStack2, float paramFloat)
  {
    primaryActivityStack = paramActivityStack1;
    secondaryActivityStack = paramActivityStack2;
    splitRatio = paramFloat;
  }
  
  public final boolean contains(@NotNull Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    boolean bool;
    if ((!primaryActivityStack.contains(paramActivity)) && (!secondaryActivityStack.contains(paramActivity))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof SplitInfo)) {
      return false;
    }
    ActivityStack localActivityStack = primaryActivityStack;
    paramObject = (SplitInfo)paramObject;
    if (!Intrinsics.a(localActivityStack, primaryActivityStack)) {
      return false;
    }
    if (!Intrinsics.a(secondaryActivityStack, secondaryActivityStack)) {
      return false;
    }
    return splitRatio == splitRatio;
  }
  
  @NotNull
  public final ActivityStack getPrimaryActivityStack()
  {
    return primaryActivityStack;
  }
  
  @NotNull
  public final ActivityStack getSecondaryActivityStack()
  {
    return secondaryActivityStack;
  }
  
  public final float getSplitRatio()
  {
    return splitRatio;
  }
  
  public int hashCode()
  {
    return (primaryActivityStack.hashCode() * 31 + secondaryActivityStack.hashCode()) * 31 + Float.floatToIntBits(splitRatio);
  }
  
  @NotNull
  public String toString()
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("SplitInfo:{");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("primaryActivityStack=");
    localStringBuilder.append(getPrimaryActivityStack());
    localStringBuilder.append(',');
    ((StringBuilder)localObject).append(localStringBuilder.toString());
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("secondaryActivityStack=");
    localStringBuilder.append(getSecondaryActivityStack());
    localStringBuilder.append(',');
    ((StringBuilder)localObject).append(localStringBuilder.toString());
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("splitRatio=");
    localStringBuilder.append(getSplitRatio());
    localStringBuilder.append('}');
    ((StringBuilder)localObject).append(localStringBuilder.toString());
    localObject = ((StringBuilder)localObject).toString();
    Intrinsics.checkNotNullExpressionValue(localObject, "StringBuilder().apply(builderAction).toString()");
    return (String)localObject;
  }
}

/* Location:
 * Qualified Name:     androidx.window.embedding.SplitInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */