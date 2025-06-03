/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.LinkedHashSet
 *  java.util.Set
 */
package androidx.window.embedding;

import W5.m;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.SplitPairFilter;
import androidx.window.embedding.SplitRule;
import androidx.window.embedding.a;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public final class SplitPairRule
extends SplitRule {
    private final boolean clearTop;
    @NotNull
    private final Set<SplitPairFilter> filters;
    private final boolean finishPrimaryWithSecondary;
    private final boolean finishSecondaryWithPrimary;

    public SplitPairRule(@NotNull Set<SplitPairFilter> set, boolean bl, boolean bl2, boolean bl3, int n8, int n9, float f8, int n10) {
        Intrinsics.checkNotNullParameter(set, "filters");
        super(n8, n9, f8, n10);
        this.finishPrimaryWithSecondary = bl;
        this.finishSecondaryWithPrimary = bl2;
        this.clearTop = bl3;
        this.filters = m.J(set);
    }

    public /* synthetic */ SplitPairRule(Set set, boolean bl, boolean bl2, boolean bl3, int n8, int n9, float f8, int n10, int n11, g g8) {
        int n12 = 0;
        if ((n11 & 2) != 0) {
            bl = false;
        }
        if ((n11 & 4) != 0) {
            bl2 = true;
        }
        if ((n11 & 8) != 0) {
            bl3 = false;
        }
        if ((n11 & 16) != 0) {
            n8 = 0;
        }
        if ((n11 & 32) != 0) {
            n9 = n12;
        }
        if ((n11 & 64) != 0) {
            f8 = 0.5f;
        }
        if ((n11 & 128) != 0) {
            n10 = 3;
        }
        this(set, bl, bl2, bl3, n8, n9, f8, n10);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof SplitPairRule)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        Set<SplitPairFilter> set = this.filters;
        object = (SplitPairRule)object;
        if (!Intrinsics.a(set, object.filters)) {
            return false;
        }
        if (this.finishPrimaryWithSecondary != object.finishPrimaryWithSecondary) {
            return false;
        }
        if (this.finishSecondaryWithPrimary != object.finishSecondaryWithPrimary) {
            return false;
        }
        if (this.clearTop != object.clearTop) {
            return false;
        }
        return true;
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
    public final SplitPairRule plus$window_release(@NotNull SplitPairFilter splitPairFilter) {
        Intrinsics.checkNotNullParameter(splitPairFilter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add((Object)splitPairFilter);
        return new SplitPairRule(m.J((Iterable)linkedHashSet), this.finishPrimaryWithSecondary, this.finishSecondaryWithPrimary, this.clearTop, this.getMinWidth(), this.getMinSmallestWidth(), this.getSplitRatio(), this.getLayoutDirection());
    }
}

