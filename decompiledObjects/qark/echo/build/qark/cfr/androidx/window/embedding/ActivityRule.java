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
import androidx.window.embedding.ActivityFilter;
import androidx.window.embedding.EmbeddingRule;
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
public final class ActivityRule
extends EmbeddingRule {
    private final boolean alwaysExpand;
    @NotNull
    private final Set<ActivityFilter> filters;

    public ActivityRule(@NotNull Set<ActivityFilter> set, boolean bl) {
        Intrinsics.checkNotNullParameter(set, "filters");
        this.alwaysExpand = bl;
        this.filters = m.J(set);
    }

    public /* synthetic */ ActivityRule(Set set, boolean bl, int n8, g g8) {
        if ((n8 & 2) != 0) {
            bl = false;
        }
        this(set, bl);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ActivityRule)) {
            return false;
        }
        Set<ActivityFilter> set = this.filters;
        object = (ActivityRule)object;
        if (!Intrinsics.a(set, object.filters)) {
            return false;
        }
        if (this.alwaysExpand != object.alwaysExpand) {
            return false;
        }
        return true;
    }

    public final boolean getAlwaysExpand() {
        return this.alwaysExpand;
    }

    @NotNull
    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    public int hashCode() {
        return this.filters.hashCode() * 31 + a.a(this.alwaysExpand);
    }

    @NotNull
    public final ActivityRule plus$window_release(@NotNull ActivityFilter activityFilter) {
        Intrinsics.checkNotNullParameter(activityFilter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add((Object)activityFilter);
        return new ActivityRule(m.J((Iterable)linkedHashSet), this.alwaysExpand);
    }
}

