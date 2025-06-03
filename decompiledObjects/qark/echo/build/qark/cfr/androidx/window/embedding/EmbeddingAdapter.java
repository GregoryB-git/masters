/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Intent
 *  android.util.Pair
 *  android.view.WindowMetrics
 *  androidx.window.extensions.embedding.ActivityRule
 *  androidx.window.extensions.embedding.ActivityRule$Builder
 *  androidx.window.extensions.embedding.ActivityStack
 *  androidx.window.extensions.embedding.EmbeddingRule
 *  androidx.window.extensions.embedding.SplitInfo
 *  androidx.window.extensions.embedding.SplitPairRule
 *  androidx.window.extensions.embedding.SplitPairRule$Builder
 *  androidx.window.extensions.embedding.SplitPlaceholderRule
 *  androidx.window.extensions.embedding.SplitPlaceholderRule$Builder
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.NoSuchMethodError
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 *  java.util.function.Predicate
 */
package androidx.window.embedding;

import W5.m;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.ActivityFilter;
import androidx.window.embedding.ActivityRule;
import androidx.window.embedding.ActivityStack;
import androidx.window.embedding.EmbeddingRule;
import androidx.window.embedding.SplitInfo;
import androidx.window.embedding.SplitPairFilter;
import androidx.window.embedding.SplitPairRule;
import androidx.window.embedding.SplitPlaceholderRule;
import androidx.window.embedding.SplitRule;
import androidx.window.embedding.b;
import androidx.window.embedding.c;
import androidx.window.embedding.d;
import androidx.window.embedding.e;
import androidx.window.embedding.f;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata
@ExperimentalWindowApi
public final class EmbeddingAdapter {
    public static /* synthetic */ boolean a(EmbeddingAdapter embeddingAdapter, Set set, Pair pair) {
        return EmbeddingAdapter.translateActivityPairPredicates$lambda-1(embeddingAdapter, set, pair);
    }

    public static /* synthetic */ boolean b(Set set, Activity activity) {
        return EmbeddingAdapter.translateActivityPredicates$lambda-6(set, activity);
    }

    public static /* synthetic */ boolean c(Set set, Intent intent) {
        return EmbeddingAdapter.translateIntentPredicates$lambda-8(set, intent);
    }

    private final <F, S> F component1(Pair<F, S> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return (F)pair.first;
    }

    private final <F, S> S component2(Pair<F, S> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return (S)pair.second;
    }

    public static /* synthetic */ boolean d(EmbeddingAdapter embeddingAdapter, Set set, Pair pair) {
        return EmbeddingAdapter.translateActivityIntentPredicates$lambda-3(embeddingAdapter, set, pair);
    }

    public static /* synthetic */ boolean e(SplitRule splitRule, WindowMetrics windowMetrics) {
        return EmbeddingAdapter.translateParentMetricsPredicate$lambda-4(splitRule, windowMetrics);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final SplitInfo translate(androidx.window.extensions.embedding.SplitInfo splitInfo) {
        boolean bl;
        boolean bl2;
        Object object;
        block4 : {
            object = splitInfo.getPrimaryActivityStack();
            Intrinsics.checkNotNullExpressionValue(object, "splitInfo.primaryActivityStack");
            bl2 = false;
            try {
                bl = object.isEmpty();
                break block4;
            }
            catch (NoSuchMethodError noSuchMethodError) {}
            bl = false;
        }
        object = object.getActivities();
        Intrinsics.checkNotNullExpressionValue(object, "primaryActivityStack.activities");
        object = new ActivityStack((List<? extends Activity>)object, bl);
        androidx.window.extensions.embedding.ActivityStack activityStack = splitInfo.getSecondaryActivityStack();
        Intrinsics.checkNotNullExpressionValue((Object)activityStack, "splitInfo.secondaryActivityStack");
        try {
            bl = activityStack.isEmpty();
        }
        catch (NoSuchMethodError noSuchMethodError) {
            bl = bl2;
        }
        activityStack = activityStack.getActivities();
        Intrinsics.checkNotNullExpressionValue((Object)activityStack, "secondaryActivityStack.activities");
        return new SplitInfo((ActivityStack)object, new ActivityStack((List<? extends Activity>)activityStack, bl), splitInfo.getSplitRatio());
    }

    private static final boolean translateActivityIntentPredicates$lambda-3(EmbeddingAdapter embeddingAdapter, Set set, Pair pair) {
        boolean bl;
        block2 : {
            Intrinsics.checkNotNullParameter(embeddingAdapter, "this$0");
            Intrinsics.checkNotNullParameter((Object)set, "$splitPairFilters");
            Intrinsics.checkNotNullExpressionValue((Object)pair, "(first, second)");
            Activity activity = (Activity)embeddingAdapter.component1(pair);
            embeddingAdapter = (Intent)embeddingAdapter.component2(pair);
            bl = set instanceof Collection;
            boolean bl2 = false;
            if (bl && set.isEmpty()) {
                return false;
            }
            set = set.iterator();
            do {
                bl = bl2;
                if (!set.hasNext()) break block2;
            } while (!((SplitPairFilter)set.next()).matchesActivityIntentPair(activity, (Intent)embeddingAdapter));
            bl = true;
        }
        return bl;
    }

    private static final boolean translateActivityPairPredicates$lambda-1(EmbeddingAdapter embeddingAdapter, Set set, Pair pair) {
        boolean bl;
        block2 : {
            Intrinsics.checkNotNullParameter(embeddingAdapter, "this$0");
            Intrinsics.checkNotNullParameter((Object)set, "$splitPairFilters");
            Intrinsics.checkNotNullExpressionValue((Object)pair, "(first, second)");
            Activity activity = (Activity)embeddingAdapter.component1(pair);
            embeddingAdapter = (Activity)embeddingAdapter.component2(pair);
            bl = set instanceof Collection;
            boolean bl2 = false;
            if (bl && set.isEmpty()) {
                return false;
            }
            set = set.iterator();
            do {
                bl = bl2;
                if (!set.hasNext()) break block2;
            } while (!((SplitPairFilter)set.next()).matchesActivityPair(activity, (Activity)embeddingAdapter));
            bl = true;
        }
        return bl;
    }

    private static final boolean translateActivityPredicates$lambda-6(Set set, Activity activity) {
        boolean bl;
        block2 : {
            ActivityFilter activityFilter;
            Intrinsics.checkNotNullParameter((Object)set, "$activityFilters");
            bl = set instanceof Collection;
            boolean bl2 = false;
            if (bl && set.isEmpty()) {
                return false;
            }
            set = set.iterator();
            do {
                bl = bl2;
                if (!set.hasNext()) break block2;
                activityFilter = (ActivityFilter)set.next();
                Intrinsics.checkNotNullExpressionValue((Object)activity, "activity");
            } while (!activityFilter.matchesActivity(activity));
            bl = true;
        }
        return bl;
    }

    private static final boolean translateIntentPredicates$lambda-8(Set set, Intent intent) {
        boolean bl;
        block2 : {
            ActivityFilter activityFilter;
            Intrinsics.checkNotNullParameter((Object)set, "$activityFilters");
            bl = set instanceof Collection;
            boolean bl2 = false;
            if (bl && set.isEmpty()) {
                return false;
            }
            set = set.iterator();
            do {
                bl = bl2;
                if (!set.hasNext()) break block2;
                activityFilter = (ActivityFilter)set.next();
                Intrinsics.checkNotNullExpressionValue((Object)intent, "intent");
            } while (!activityFilter.matchesIntent(intent));
            bl = true;
        }
        return bl;
    }

    private static final boolean translateParentMetricsPredicate$lambda-4(SplitRule splitRule, WindowMetrics windowMetrics) {
        Intrinsics.checkNotNullParameter(splitRule, "$splitRule");
        Intrinsics.checkNotNullExpressionValue((Object)windowMetrics, "windowMetrics");
        return splitRule.checkParentMetrics(windowMetrics);
    }

    @NotNull
    public final List<SplitInfo> translate(@NotNull List<? extends androidx.window.extensions.embedding.SplitInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "splitInfoList");
        Iterable iterable = (Iterable)arrayList;
        arrayList = new ArrayList(m.l(iterable, 10));
        iterable = iterable.iterator();
        while (iterable.hasNext()) {
            arrayList.add((Object)this.translate((androidx.window.extensions.embedding.SplitInfo)iterable.next()));
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     */
    @NotNull
    public final Set<androidx.window.extensions.embedding.EmbeddingRule> translate(@NotNull Set<? extends EmbeddingRule> object) {
        Intrinsics.checkNotNullParameter(object, "rules");
        ArrayList arrayList = new ArrayList(m.l((Iterable)object, 10));
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            Object object2;
            object = (EmbeddingRule)iterator.next();
            if (object instanceof SplitPairRule) {
                object2 = (SplitPairRule)object;
                object = new SplitPairRule.Builder(this.translateActivityPairPredicates(object2.getFilters()), this.translateActivityIntentPredicates(object2.getFilters()), this.translateParentMetricsPredicate((SplitRule)object)).setSplitRatio(object2.getSplitRatio()).setLayoutDirection(object2.getLayoutDirection()).setShouldFinishPrimaryWithSecondary(object2.getFinishPrimaryWithSecondary()).setShouldFinishSecondaryWithPrimary(object2.getFinishSecondaryWithPrimary()).setShouldClearTop(object2.getClearTop()).build();
                object2 = "SplitPairRuleBuilder(\n  \u2026                 .build()";
            } else if (object instanceof SplitPlaceholderRule) {
                object2 = (SplitPlaceholderRule)object;
                object = new SplitPlaceholderRule.Builder(object2.getPlaceholderIntent(), this.translateActivityPredicates(object2.getFilters()), this.translateIntentPredicates(object2.getFilters()), this.translateParentMetricsPredicate((SplitRule)object)).setSplitRatio(object2.getSplitRatio()).setLayoutDirection(object2.getLayoutDirection()).build();
                object2 = "SplitPlaceholderRuleBuil\u2026                 .build()";
            } else {
                if (!(object instanceof ActivityRule)) {
                    throw new IllegalArgumentException("Unsupported rule type");
                }
                object = (ActivityRule)object;
                object = new ActivityRule.Builder(this.translateActivityPredicates(object.getFilters()), this.translateIntentPredicates(object.getFilters())).setShouldAlwaysExpand(object.getAlwaysExpand()).build();
                object2 = "ActivityRuleBuilder(\n   \u2026                 .build()";
            }
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object = (androidx.window.extensions.embedding.EmbeddingRule)object;
            arrayList.add(object);
        }
        return m.J((Iterable)arrayList);
    }

    @SuppressLint(value={"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Pair<Activity, Intent>> translateActivityIntentPredicates(@NotNull Set<SplitPairFilter> set) {
        Intrinsics.checkNotNullParameter(set, "splitPairFilters");
        return new e(this, set);
    }

    @SuppressLint(value={"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Pair<Activity, Activity>> translateActivityPairPredicates(@NotNull Set<SplitPairFilter> set) {
        Intrinsics.checkNotNullParameter(set, "splitPairFilters");
        return new d(this, set);
    }

    @SuppressLint(value={"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Activity> translateActivityPredicates(@NotNull Set<ActivityFilter> set) {
        Intrinsics.checkNotNullParameter(set, "activityFilters");
        return new f(set);
    }

    @SuppressLint(value={"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Intent> translateIntentPredicates(@NotNull Set<ActivityFilter> set) {
        Intrinsics.checkNotNullParameter(set, "activityFilters");
        return new b(set);
    }

    @SuppressLint(value={"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<WindowMetrics> translateParentMetricsPredicate(@NotNull SplitRule splitRule) {
        Intrinsics.checkNotNullParameter(splitRule, "splitRule");
        return new c(splitRule);
    }
}

