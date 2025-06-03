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
public final class ActivityRule extends EmbeddingRule {
    private final boolean alwaysExpand;

    @NotNull
    private final Set<ActivityFilter> filters;

    public ActivityRule(@NotNull Set<ActivityFilter> filters, boolean z7) {
        Set<ActivityFilter> J6;
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.alwaysExpand = z7;
        J6 = w.J(filters);
        this.filters = J6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityRule)) {
            return false;
        }
        ActivityRule activityRule = (ActivityRule) obj;
        return Intrinsics.a(this.filters, activityRule.filters) && this.alwaysExpand == activityRule.alwaysExpand;
    }

    public final boolean getAlwaysExpand() {
        return this.alwaysExpand;
    }

    @NotNull
    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    public int hashCode() {
        return (this.filters.hashCode() * 31) + a.a(this.alwaysExpand);
    }

    @NotNull
    public final ActivityRule plus$window_release(@NotNull ActivityFilter filter) {
        Set J6;
        Intrinsics.checkNotNullParameter(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        J6 = w.J(linkedHashSet);
        return new ActivityRule(J6, this.alwaysExpand);
    }

    public /* synthetic */ ActivityRule(Set set, boolean z7, int i7, kotlin.jvm.internal.g gVar) {
        this(set, (i7 & 2) != 0 ? false : z7);
    }
}
