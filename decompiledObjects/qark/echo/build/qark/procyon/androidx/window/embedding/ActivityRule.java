// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.embedding;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.g;
import W5.m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import java.util.Set;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;

@Metadata
@ExperimentalWindowApi
public final class ActivityRule extends EmbeddingRule
{
    private final boolean alwaysExpand;
    @NotNull
    private final Set<ActivityFilter> filters;
    
    public ActivityRule(@NotNull final Set<ActivityFilter> set, final boolean alwaysExpand) {
        Intrinsics.checkNotNullParameter(set, "filters");
        this.alwaysExpand = alwaysExpand;
        this.filters = (Set<ActivityFilter>)m.J(set);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActivityRule)) {
            return false;
        }
        final Set<ActivityFilter> filters = this.filters;
        final ActivityRule activityRule = (ActivityRule)o;
        return Intrinsics.a(filters, activityRule.filters) && this.alwaysExpand == activityRule.alwaysExpand;
    }
    
    public final boolean getAlwaysExpand() {
        return this.alwaysExpand;
    }
    
    @NotNull
    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }
    
    @Override
    public int hashCode() {
        return this.filters.hashCode() * 31 + a.a(this.alwaysExpand);
    }
    
    @NotNull
    public final ActivityRule plus$window_release(@NotNull final ActivityFilter activityFilter) {
        Intrinsics.checkNotNullParameter(activityFilter, "filter");
        final LinkedHashSet<ActivityFilter> set = new LinkedHashSet<ActivityFilter>();
        set.addAll((Collection<?>)this.filters);
        set.add(activityFilter);
        return new ActivityRule(m.J(set), this.alwaysExpand);
    }
}
