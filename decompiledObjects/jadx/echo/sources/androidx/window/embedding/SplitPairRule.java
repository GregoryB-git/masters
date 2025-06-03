package androidx.window.embedding;

import W5.w;
import androidx.window.core.ExperimentalWindowApi;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ExperimentalWindowApi
@Metadata
/* loaded from: classes.dex */
public final class SplitPairRule extends SplitRule {
    private final boolean clearTop;

    @NotNull
    private final Set<SplitPairFilter> filters;
    private final boolean finishPrimaryWithSecondary;
    private final boolean finishSecondaryWithPrimary;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPairRule(@NotNull Set<SplitPairFilter> filters, boolean z7, boolean z8, boolean z9, int i7, int i8, float f7, int i9) {
        super(i7, i8, f7, i9);
        Set<SplitPairFilter> J6;
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.finishPrimaryWithSecondary = z7;
        this.finishSecondaryWithPrimary = z8;
        this.clearTop = z9;
        J6 = w.J(filters);
        this.filters = J6;
    }

    @Override // androidx.window.embedding.SplitRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPairRule) || !super.equals(obj)) {
            return false;
        }
        SplitPairRule splitPairRule = (SplitPairRule) obj;
        return Intrinsics.a(this.filters, splitPairRule.filters) && this.finishPrimaryWithSecondary == splitPairRule.finishPrimaryWithSecondary && this.finishSecondaryWithPrimary == splitPairRule.finishSecondaryWithPrimary && this.clearTop == splitPairRule.clearTop;
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

    @Override // androidx.window.embedding.SplitRule
    public int hashCode() {
        return (((((((super.hashCode() * 31) + this.filters.hashCode()) * 31) + a.a(this.finishPrimaryWithSecondary)) * 31) + a.a(this.finishSecondaryWithPrimary)) * 31) + a.a(this.clearTop);
    }

    @NotNull
    public final SplitPairRule plus$window_release(@NotNull SplitPairFilter filter) {
        Set J6;
        Intrinsics.checkNotNullParameter(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        J6 = w.J(linkedHashSet);
        return new SplitPairRule(J6, this.finishPrimaryWithSecondary, this.finishSecondaryWithPrimary, this.clearTop, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    public /* synthetic */ SplitPairRule(Set set, boolean z7, boolean z8, boolean z9, int i7, int i8, float f7, int i9, int i10, kotlin.jvm.internal.g gVar) {
        this(set, (i10 & 2) != 0 ? false : z7, (i10 & 4) != 0 ? true : z8, (i10 & 8) != 0 ? false : z9, (i10 & 16) != 0 ? 0 : i7, (i10 & 32) == 0 ? i8 : 0, (i10 & 64) != 0 ? 0.5f : f7, (i10 & 128) != 0 ? 3 : i9);
    }
}
