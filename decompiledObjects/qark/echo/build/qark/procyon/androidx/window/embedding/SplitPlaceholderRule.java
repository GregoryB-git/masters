// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.embedding;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.g;
import W5.m;
import kotlin.jvm.internal.Intrinsics;
import android.content.Intent;
import org.jetbrains.annotations.NotNull;
import java.util.Set;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;

@Metadata
@ExperimentalWindowApi
public final class SplitPlaceholderRule extends SplitRule
{
    @NotNull
    private final Set<ActivityFilter> filters;
    @NotNull
    private final Intent placeholderIntent;
    
    public SplitPlaceholderRule(@NotNull final Set<ActivityFilter> set, @NotNull final Intent placeholderIntent, final int n, final int n2, final float n3, final int n4) {
        Intrinsics.checkNotNullParameter(set, "filters");
        Intrinsics.checkNotNullParameter(placeholderIntent, "placeholderIntent");
        super(n, n2, n3, n4);
        this.placeholderIntent = placeholderIntent;
        this.filters = (Set<ActivityFilter>)m.J(set);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SplitPlaceholderRule)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        final Set<ActivityFilter> filters = this.filters;
        final SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule)o;
        return Intrinsics.a(filters, splitPlaceholderRule.filters) && Intrinsics.a(this.placeholderIntent, splitPlaceholderRule.placeholderIntent);
    }
    
    @NotNull
    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }
    
    @NotNull
    public final Intent getPlaceholderIntent() {
        return this.placeholderIntent;
    }
    
    @Override
    public int hashCode() {
        return (super.hashCode() * 31 + this.filters.hashCode()) * 31 + this.placeholderIntent.hashCode();
    }
    
    @NotNull
    public final SplitPlaceholderRule plus$window_release(@NotNull final ActivityFilter activityFilter) {
        Intrinsics.checkNotNullParameter(activityFilter, "filter");
        final LinkedHashSet<ActivityFilter> set = new LinkedHashSet<ActivityFilter>();
        set.addAll((Collection<?>)this.filters);
        set.add(activityFilter);
        return new SplitPlaceholderRule(m.J(set), this.placeholderIntent, this.getMinWidth(), this.getMinSmallestWidth(), this.getSplitRatio(), this.getLayoutDirection());
    }
}
