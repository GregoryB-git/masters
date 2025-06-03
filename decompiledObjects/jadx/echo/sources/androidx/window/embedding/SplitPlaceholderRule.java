package androidx.window.embedding;

import W5.w;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ExperimentalWindowApi
@Metadata
/* loaded from: classes.dex */
public final class SplitPlaceholderRule extends SplitRule {

    @NotNull
    private final Set<ActivityFilter> filters;

    @NotNull
    private final Intent placeholderIntent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPlaceholderRule(@NotNull Set<ActivityFilter> filters, @NotNull Intent placeholderIntent, int i7, int i8, float f7, int i9) {
        super(i7, i8, f7, i9);
        Set<ActivityFilter> J6;
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(placeholderIntent, "placeholderIntent");
        this.placeholderIntent = placeholderIntent;
        J6 = w.J(filters);
        this.filters = J6;
    }

    @Override // androidx.window.embedding.SplitRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPlaceholderRule) || !super.equals(obj) || !super.equals(obj)) {
            return false;
        }
        SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule) obj;
        return Intrinsics.a(this.filters, splitPlaceholderRule.filters) && Intrinsics.a(this.placeholderIntent, splitPlaceholderRule.placeholderIntent);
    }

    @NotNull
    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    @NotNull
    public final Intent getPlaceholderIntent() {
        return this.placeholderIntent;
    }

    @Override // androidx.window.embedding.SplitRule
    public int hashCode() {
        return (((super.hashCode() * 31) + this.filters.hashCode()) * 31) + this.placeholderIntent.hashCode();
    }

    @NotNull
    public final SplitPlaceholderRule plus$window_release(@NotNull ActivityFilter filter) {
        Set J6;
        Intrinsics.checkNotNullParameter(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        J6 = w.J(linkedHashSet);
        return new SplitPlaceholderRule(J6, this.placeholderIntent, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    public /* synthetic */ SplitPlaceholderRule(Set set, Intent intent, int i7, int i8, float f7, int i9, int i10, kotlin.jvm.internal.g gVar) {
        this(set, intent, (i10 & 4) != 0 ? 0 : i7, (i10 & 8) != 0 ? 0 : i8, (i10 & 16) != 0 ? 0.5f : f7, (i10 & 32) != 0 ? 3 : i9);
    }
}
