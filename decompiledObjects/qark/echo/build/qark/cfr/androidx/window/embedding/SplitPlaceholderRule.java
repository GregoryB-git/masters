/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.LinkedHashSet
 *  java.util.Set
 */
package androidx.window.embedding;

import W5.m;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.ActivityFilter;
import androidx.window.embedding.SplitRule;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public final class SplitPlaceholderRule
extends SplitRule {
    @NotNull
    private final Set<ActivityFilter> filters;
    @NotNull
    private final Intent placeholderIntent;

    public SplitPlaceholderRule(@NotNull Set<ActivityFilter> set, @NotNull Intent intent, int n8, int n9, float f8, int n10) {
        Intrinsics.checkNotNullParameter(set, "filters");
        Intrinsics.checkNotNullParameter((Object)intent, "placeholderIntent");
        super(n8, n9, f8, n10);
        this.placeholderIntent = intent;
        this.filters = m.J(set);
    }

    public /* synthetic */ SplitPlaceholderRule(Set set, Intent intent, int n8, int n9, float f8, int n10, int n11, g g8) {
        if ((n11 & 4) != 0) {
            n8 = 0;
        }
        if ((n11 & 8) != 0) {
            n9 = 0;
        }
        if ((n11 & 16) != 0) {
            f8 = 0.5f;
        }
        if ((n11 & 32) != 0) {
            n10 = 3;
        }
        this(set, intent, n8, n9, f8, n10);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof SplitPlaceholderRule)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        Set<ActivityFilter> set = this.filters;
        object = (SplitPlaceholderRule)object;
        if (!Intrinsics.a(set, object.filters)) {
            return false;
        }
        if (!Intrinsics.a((Object)this.placeholderIntent, (Object)object.placeholderIntent)) {
            return false;
        }
        return true;
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
    public final SplitPlaceholderRule plus$window_release(@NotNull ActivityFilter activityFilter) {
        Intrinsics.checkNotNullParameter(activityFilter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add((Object)activityFilter);
        return new SplitPlaceholderRule(m.J((Iterable)linkedHashSet), this.placeholderIntent, this.getMinWidth(), this.getMinSmallestWidth(), this.getSplitRatio(), this.getLayoutDirection());
    }
}

