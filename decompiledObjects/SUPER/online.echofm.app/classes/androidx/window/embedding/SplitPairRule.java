package androidx.window.embedding;

import W5.m;
import androidx.window.core.ExperimentalWindowApi;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public final class SplitPairRule
  extends SplitRule
{
  private final boolean clearTop;
  @NotNull
  private final Set<SplitPairFilter> filters;
  private final boolean finishPrimaryWithSecondary;
  private final boolean finishSecondaryWithPrimary;
  
  public SplitPairRule(@NotNull Set<SplitPairFilter> paramSet, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt1, int paramInt2, float paramFloat, int paramInt3)
  {
    super(paramInt1, paramInt2, paramFloat, paramInt3);
    finishPrimaryWithSecondary = paramBoolean1;
    finishSecondaryWithPrimary = paramBoolean2;
    clearTop = paramBoolean3;
    filters = m.J(paramSet);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof SplitPairRule)) {
      return false;
    }
    if (!super.equals(paramObject)) {
      return false;
    }
    Set localSet = filters;
    paramObject = (SplitPairRule)paramObject;
    if (!Intrinsics.a(localSet, filters)) {
      return false;
    }
    if (finishPrimaryWithSecondary != finishPrimaryWithSecondary) {
      return false;
    }
    if (finishSecondaryWithPrimary != finishSecondaryWithPrimary) {
      return false;
    }
    return clearTop == clearTop;
  }
  
  public final boolean getClearTop()
  {
    return clearTop;
  }
  
  @NotNull
  public final Set<SplitPairFilter> getFilters()
  {
    return filters;
  }
  
  public final boolean getFinishPrimaryWithSecondary()
  {
    return finishPrimaryWithSecondary;
  }
  
  public final boolean getFinishSecondaryWithPrimary()
  {
    return finishSecondaryWithPrimary;
  }
  
  public int hashCode()
  {
    return (((super.hashCode() * 31 + filters.hashCode()) * 31 + a.a(finishPrimaryWithSecondary)) * 31 + a.a(finishSecondaryWithPrimary)) * 31 + a.a(clearTop);
  }
  
  @NotNull
  public final SplitPairRule plus$window_release(@NotNull SplitPairFilter paramSplitPairFilter)
  {
    Intrinsics.checkNotNullParameter(paramSplitPairFilter, "filter");
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    localLinkedHashSet.addAll(filters);
    localLinkedHashSet.add(paramSplitPairFilter);
    return new SplitPairRule(m.J(localLinkedHashSet), finishPrimaryWithSecondary, finishSecondaryWithPrimary, clearTop, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
  }
}

/* Location:
 * Qualified Name:     androidx.window.embedding.SplitPairRule
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */