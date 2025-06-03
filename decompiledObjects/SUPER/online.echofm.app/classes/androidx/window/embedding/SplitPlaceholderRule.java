package androidx.window.embedding;

import W5.m;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public final class SplitPlaceholderRule
  extends SplitRule
{
  @NotNull
  private final Set<ActivityFilter> filters;
  @NotNull
  private final Intent placeholderIntent;
  
  public SplitPlaceholderRule(@NotNull Set<ActivityFilter> paramSet, @NotNull Intent paramIntent, int paramInt1, int paramInt2, float paramFloat, int paramInt3)
  {
    super(paramInt1, paramInt2, paramFloat, paramInt3);
    placeholderIntent = paramIntent;
    filters = m.J(paramSet);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof SplitPlaceholderRule)) {
      return false;
    }
    if (!super.equals(paramObject)) {
      return false;
    }
    if (!super.equals(paramObject)) {
      return false;
    }
    Set localSet = filters;
    paramObject = (SplitPlaceholderRule)paramObject;
    if (!Intrinsics.a(localSet, filters)) {
      return false;
    }
    return Intrinsics.a(placeholderIntent, placeholderIntent);
  }
  
  @NotNull
  public final Set<ActivityFilter> getFilters()
  {
    return filters;
  }
  
  @NotNull
  public final Intent getPlaceholderIntent()
  {
    return placeholderIntent;
  }
  
  public int hashCode()
  {
    return (super.hashCode() * 31 + filters.hashCode()) * 31 + placeholderIntent.hashCode();
  }
  
  @NotNull
  public final SplitPlaceholderRule plus$window_release(@NotNull ActivityFilter paramActivityFilter)
  {
    Intrinsics.checkNotNullParameter(paramActivityFilter, "filter");
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    localLinkedHashSet.addAll(filters);
    localLinkedHashSet.add(paramActivityFilter);
    return new SplitPlaceholderRule(m.J(localLinkedHashSet), placeholderIntent, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
  }
}

/* Location:
 * Qualified Name:     androidx.window.embedding.SplitPlaceholderRule
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */