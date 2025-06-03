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
public final class ActivityRule
  extends EmbeddingRule
{
  private final boolean alwaysExpand;
  @NotNull
  private final Set<ActivityFilter> filters;
  
  public ActivityRule(@NotNull Set<ActivityFilter> paramSet, boolean paramBoolean)
  {
    alwaysExpand = paramBoolean;
    filters = m.J(paramSet);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof ActivityRule)) {
      return false;
    }
    Set localSet = filters;
    paramObject = (ActivityRule)paramObject;
    if (!Intrinsics.a(localSet, filters)) {
      return false;
    }
    return alwaysExpand == alwaysExpand;
  }
  
  public final boolean getAlwaysExpand()
  {
    return alwaysExpand;
  }
  
  @NotNull
  public final Set<ActivityFilter> getFilters()
  {
    return filters;
  }
  
  public int hashCode()
  {
    return filters.hashCode() * 31 + a.a(alwaysExpand);
  }
  
  @NotNull
  public final ActivityRule plus$window_release(@NotNull ActivityFilter paramActivityFilter)
  {
    Intrinsics.checkNotNullParameter(paramActivityFilter, "filter");
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    localLinkedHashSet.addAll(filters);
    localLinkedHashSet.add(paramActivityFilter);
    return new ActivityRule(m.J(localLinkedHashSet), alwaysExpand);
  }
}

/* Location:
 * Qualified Name:     androidx.window.embedding.ActivityRule
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */