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
public final class SplitPairRule extends SplitRule
{
    private final boolean clearTop;
    @NotNull
    private final Set<SplitPairFilter> filters;
    private final boolean finishPrimaryWithSecondary;
    private final boolean finishSecondaryWithPrimary;
    
    public SplitPairRule(@NotNull final Set<SplitPairFilter> set, final boolean finishPrimaryWithSecondary, final boolean finishSecondaryWithPrimary, final boolean clearTop, final int n, final int n2, final float n3, final int n4) {
        Intrinsics.checkNotNullParameter(set, "filters");
        super(n, n2, n3, n4);
        this.finishPrimaryWithSecondary = finishPrimaryWithSecondary;
        this.finishSecondaryWithPrimary = finishSecondaryWithPrimary;
        this.clearTop = clearTop;
        this.filters = (Set<SplitPairFilter>)m.J(set);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SplitPairRule)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        final Set<SplitPairFilter> filters = this.filters;
        final SplitPairRule splitPairRule = (SplitPairRule)o;
        return Intrinsics.a(filters, splitPairRule.filters) && this.finishPrimaryWithSecondary == splitPairRule.finishPrimaryWithSecondary && this.finishSecondaryWithPrimary == splitPairRule.finishSecondaryWithPrimary && this.clearTop == splitPairRule.clearTop;
    }
    
    public final boolean getClearTop() {
        return this.clearTop;
    }
    
    @NotNull
    public final Set<SplitPairFilter> getFilters() {
        return this.filters;
    }
    
    public final boolean getFinishPrimaryWithSecondary() {
        return this.finishPrimaryWithSecondary;
    }
    
    public final boolean getFinishSecondaryWithPrimary() {
        return this.finishSecondaryWithPrimary;
    }
    
    @Override
    public int hashCode() {
        return (((super.hashCode() * 31 + this.filters.hashCode()) * 31 + a.a(this.finishPrimaryWithSecondary)) * 31 + a.a(this.finishSecondaryWithPrimary)) * 31 + a.a(this.clearTop);
    }
    
    @NotNull
    public final SplitPairRule plus$window_release(@NotNull final SplitPairFilter splitPairFilter) {
        Intrinsics.checkNotNullParameter(splitPairFilter, "filter");
        final LinkedHashSet<SplitPairFilter> set = new LinkedHashSet<SplitPairFilter>();
        set.addAll((Collection<?>)this.filters);
        set.add(splitPairFilter);
        return new SplitPairRule(m.J(set), this.finishPrimaryWithSecondary, this.finishSecondaryWithPrimary, this.clearTop, this.getMinWidth(), this.getMinSmallestWidth(), this.getSplitRatio(), this.getLayoutDirection());
    }
}
