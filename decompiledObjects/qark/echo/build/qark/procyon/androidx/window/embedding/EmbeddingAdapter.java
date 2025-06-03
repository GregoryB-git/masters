// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.embedding;

import android.annotation.SuppressLint;
import androidx.window.extensions.embedding.ActivityRule$Builder;
import androidx.window.extensions.embedding.SplitPlaceholderRule$Builder;
import java.util.function.Predicate;
import androidx.window.extensions.embedding.SplitPairRule$Builder;
import java.util.ArrayList;
import W5.m;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import androidx.window.extensions.embedding.SplitInfo;
import android.view.WindowMetrics;
import kotlin.jvm.internal.Intrinsics;
import android.content.Intent;
import android.app.Activity;
import android.util.Pair;
import java.util.Set;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;

@Metadata
@ExperimentalWindowApi
public final class EmbeddingAdapter
{
    private final <F, S> F component1(final Pair<F, S> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return (F)pair.first;
    }
    
    private final <F, S> S component2(final Pair<F, S> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return (S)pair.second;
    }
    
    private final androidx.window.embedding.SplitInfo translate(final SplitInfo p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   androidx/window/extensions/embedding/SplitInfo.getPrimaryActivityStack:()Landroidx/window/extensions/embedding/ActivityStack;
        //     4: astore          4
        //     6: aload           4
        //     8: ldc             "splitInfo.primaryActivityStack"
        //    10: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    13: iconst_0       
        //    14: istore_3       
        //    15: aload           4
        //    17: invokevirtual   androidx/window/extensions/embedding/ActivityStack.isEmpty:()Z
        //    20: istore_2       
        //    21: goto            26
        //    24: iconst_0       
        //    25: istore_2       
        //    26: aload           4
        //    28: invokevirtual   androidx/window/extensions/embedding/ActivityStack.getActivities:()Ljava/util/List;
        //    31: astore          4
        //    33: aload           4
        //    35: ldc             "primaryActivityStack.activities"
        //    37: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    40: new             Landroidx/window/embedding/ActivityStack;
        //    43: dup            
        //    44: aload           4
        //    46: iload_2        
        //    47: invokespecial   androidx/window/embedding/ActivityStack.<init>:(Ljava/util/List;Z)V
        //    50: astore          4
        //    52: aload_1        
        //    53: invokevirtual   androidx/window/extensions/embedding/SplitInfo.getSecondaryActivityStack:()Landroidx/window/extensions/embedding/ActivityStack;
        //    56: astore          5
        //    58: aload           5
        //    60: ldc             "splitInfo.secondaryActivityStack"
        //    62: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    65: aload           5
        //    67: invokevirtual   androidx/window/extensions/embedding/ActivityStack.isEmpty:()Z
        //    70: istore_2       
        //    71: aload           5
        //    73: invokevirtual   androidx/window/extensions/embedding/ActivityStack.getActivities:()Ljava/util/List;
        //    76: astore          5
        //    78: aload           5
        //    80: ldc             "secondaryActivityStack.activities"
        //    82: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    85: new             Landroidx/window/embedding/SplitInfo;
        //    88: dup            
        //    89: aload           4
        //    91: new             Landroidx/window/embedding/ActivityStack;
        //    94: dup            
        //    95: aload           5
        //    97: iload_2        
        //    98: invokespecial   androidx/window/embedding/ActivityStack.<init>:(Ljava/util/List;Z)V
        //   101: aload_1        
        //   102: invokevirtual   androidx/window/extensions/embedding/SplitInfo.getSplitRatio:()F
        //   105: invokespecial   androidx/window/embedding/SplitInfo.<init>:(Landroidx/window/embedding/ActivityStack;Landroidx/window/embedding/ActivityStack;F)V
        //   108: areturn        
        //   109: astore          5
        //   111: goto            24
        //   114: astore          6
        //   116: iload_3        
        //   117: istore_2       
        //   118: goto            71
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  15     21     109    26     Ljava/lang/NoSuchMethodError;
        //  65     71     114    121    Ljava/lang/NoSuchMethodError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0071:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final boolean translateActivityIntentPredicates$lambda-3(final EmbeddingAdapter embeddingAdapter, final Set set, final Pair pair) {
        Intrinsics.checkNotNullParameter(embeddingAdapter, "this$0");
        Intrinsics.checkNotNullParameter(set, "$splitPairFilters");
        Intrinsics.checkNotNullExpressionValue(pair, "(first, second)");
        final Activity activity = embeddingAdapter.component1((android.util.Pair<Activity, Object>)pair);
        final Intent intent = embeddingAdapter.component2((android.util.Pair<Object, Intent>)pair);
        final boolean b = set instanceof Collection;
        final boolean b2 = false;
        if (b && set.isEmpty()) {
            return false;
        }
        final Iterator<Object> iterator = set.iterator();
        do {
            final boolean b3 = b2;
            if (iterator.hasNext()) {
                continue;
            }
            return b3;
        } while (!iterator.next().matchesActivityIntentPair(activity, intent));
        return true;
    }
    
    private static final boolean translateActivityPairPredicates$lambda-1(final EmbeddingAdapter embeddingAdapter, final Set set, final Pair pair) {
        Intrinsics.checkNotNullParameter(embeddingAdapter, "this$0");
        Intrinsics.checkNotNullParameter(set, "$splitPairFilters");
        Intrinsics.checkNotNullExpressionValue(pair, "(first, second)");
        final Activity activity = embeddingAdapter.component1((android.util.Pair<Activity, Object>)pair);
        final Activity activity2 = embeddingAdapter.component2((android.util.Pair<Object, Activity>)pair);
        final boolean b = set instanceof Collection;
        final boolean b2 = false;
        if (b && set.isEmpty()) {
            return false;
        }
        final Iterator<Object> iterator = set.iterator();
        do {
            final boolean b3 = b2;
            if (iterator.hasNext()) {
                continue;
            }
            return b3;
        } while (!iterator.next().matchesActivityPair(activity, activity2));
        return true;
    }
    
    private static final boolean translateActivityPredicates$lambda-6(final Set set, final Activity activity) {
        Intrinsics.checkNotNullParameter(set, "$activityFilters");
        final boolean b = set instanceof Collection;
        final boolean b2 = false;
        if (b && set.isEmpty()) {
            return false;
        }
        final Iterator<Object> iterator = set.iterator();
        ActivityFilter activityFilter;
        do {
            final boolean b3 = b2;
            if (!iterator.hasNext()) {
                return b3;
            }
            activityFilter = iterator.next();
            Intrinsics.checkNotNullExpressionValue(activity, "activity");
        } while (!activityFilter.matchesActivity(activity));
        return true;
    }
    
    private static final boolean translateIntentPredicates$lambda-8(final Set set, final Intent intent) {
        Intrinsics.checkNotNullParameter(set, "$activityFilters");
        final boolean b = set instanceof Collection;
        final boolean b2 = false;
        if (b && set.isEmpty()) {
            return false;
        }
        final Iterator<Object> iterator = set.iterator();
        ActivityFilter activityFilter;
        do {
            final boolean b3 = b2;
            if (!iterator.hasNext()) {
                return b3;
            }
            activityFilter = iterator.next();
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
        } while (!activityFilter.matchesIntent(intent));
        return true;
    }
    
    private static final boolean translateParentMetricsPredicate$lambda-4(final SplitRule splitRule, final WindowMetrics windowMetrics) {
        Intrinsics.checkNotNullParameter(splitRule, "$splitRule");
        Intrinsics.checkNotNullExpressionValue(windowMetrics, "windowMetrics");
        return splitRule.checkParentMetrics(windowMetrics);
    }
    
    @NotNull
    public final List<androidx.window.embedding.SplitInfo> translate(@NotNull final List<? extends SplitInfo> list) {
        Intrinsics.checkNotNullParameter(list, "splitInfoList");
        final List<? extends SplitInfo> list2 = list;
        final ArrayList list3 = new ArrayList<androidx.window.embedding.SplitInfo>(m.l(list2, 10));
        final Iterator<SplitInfo> iterator = list2.iterator();
        while (iterator.hasNext()) {
            list3.add(this.translate(iterator.next()));
        }
        return (List<androidx.window.embedding.SplitInfo>)list3;
    }
    
    @NotNull
    public final Set<androidx.window.extensions.embedding.EmbeddingRule> translate(@NotNull final Set<? extends EmbeddingRule> set) {
        Intrinsics.checkNotNullParameter(set, "rules");
        final ArrayList<androidx.window.extensions.embedding.EmbeddingRule> list = new ArrayList<androidx.window.extensions.embedding.EmbeddingRule>(m.l(set, 10));
        for (final EmbeddingRule embeddingRule : set) {
            Object o;
            String s;
            if (embeddingRule instanceof SplitPairRule) {
                final SplitPairRule splitPairRule = (SplitPairRule)embeddingRule;
                o = new SplitPairRule$Builder((Predicate)this.translateActivityPairPredicates(splitPairRule.getFilters()), (Predicate)this.translateActivityIntentPredicates(splitPairRule.getFilters()), (Predicate)this.translateParentMetricsPredicate((SplitRule)embeddingRule)).setSplitRatio(splitPairRule.getSplitRatio()).setLayoutDirection(splitPairRule.getLayoutDirection()).setShouldFinishPrimaryWithSecondary(splitPairRule.getFinishPrimaryWithSecondary()).setShouldFinishSecondaryWithPrimary(splitPairRule.getFinishSecondaryWithPrimary()).setShouldClearTop(splitPairRule.getClearTop()).build();
                s = "SplitPairRuleBuilder(\n  \u2026                 .build()";
            }
            else if (embeddingRule instanceof SplitPlaceholderRule) {
                final SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule)embeddingRule;
                o = new SplitPlaceholderRule$Builder(splitPlaceholderRule.getPlaceholderIntent(), (Predicate)this.translateActivityPredicates(splitPlaceholderRule.getFilters()), (Predicate)this.translateIntentPredicates(splitPlaceholderRule.getFilters()), (Predicate)this.translateParentMetricsPredicate((SplitRule)embeddingRule)).setSplitRatio(splitPlaceholderRule.getSplitRatio()).setLayoutDirection(splitPlaceholderRule.getLayoutDirection()).build();
                s = "SplitPlaceholderRuleBuil\u2026                 .build()";
            }
            else {
                if (!(embeddingRule instanceof ActivityRule)) {
                    throw new IllegalArgumentException("Unsupported rule type");
                }
                final ActivityRule activityRule = (ActivityRule)embeddingRule;
                o = new ActivityRule$Builder((Predicate)this.translateActivityPredicates(activityRule.getFilters()), (Predicate)this.translateIntentPredicates(activityRule.getFilters())).setShouldAlwaysExpand(activityRule.getAlwaysExpand()).build();
                s = "ActivityRuleBuilder(\n   \u2026                 .build()";
            }
            Intrinsics.checkNotNullExpressionValue(o, s);
            list.add((androidx.window.extensions.embedding.EmbeddingRule)o);
        }
        return (Set<androidx.window.extensions.embedding.EmbeddingRule>)m.J(list);
    }
    
    @SuppressLint({ "ClassVerificationFailure", "NewApi" })
    @NotNull
    public final Predicate<Pair<Activity, Intent>> translateActivityIntentPredicates(@NotNull final Set<SplitPairFilter> set) {
        Intrinsics.checkNotNullParameter(set, "splitPairFilters");
        return (Predicate<Pair<Activity, Intent>>)new e(this, set);
    }
    
    @SuppressLint({ "ClassVerificationFailure", "NewApi" })
    @NotNull
    public final Predicate<Pair<Activity, Activity>> translateActivityPairPredicates(@NotNull final Set<SplitPairFilter> set) {
        Intrinsics.checkNotNullParameter(set, "splitPairFilters");
        return (Predicate<Pair<Activity, Activity>>)new d(this, set);
    }
    
    @SuppressLint({ "ClassVerificationFailure", "NewApi" })
    @NotNull
    public final Predicate<Activity> translateActivityPredicates(@NotNull final Set<ActivityFilter> set) {
        Intrinsics.checkNotNullParameter(set, "activityFilters");
        return (Predicate<Activity>)new f(set);
    }
    
    @SuppressLint({ "ClassVerificationFailure", "NewApi" })
    @NotNull
    public final Predicate<Intent> translateIntentPredicates(@NotNull final Set<ActivityFilter> set) {
        Intrinsics.checkNotNullParameter(set, "activityFilters");
        return (Predicate<Intent>)new b(set);
    }
    
    @SuppressLint({ "ClassVerificationFailure", "NewApi" })
    @NotNull
    public final Predicate<WindowMetrics> translateParentMetricsPredicate(@NotNull final SplitRule splitRule) {
        Intrinsics.checkNotNullParameter(splitRule, "splitRule");
        return (Predicate<WindowMetrics>)new c(splitRule);
    }
}
