package androidx.window.embedding;

import W5.m;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.extensions.embedding.ActivityRule.Builder;
import androidx.window.extensions.embedding.SplitPairRule.Builder;
import androidx.window.extensions.embedding.SplitPlaceholderRule.Builder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public final class EmbeddingAdapter
{
  private final <F, S> F component1(Pair<F, S> paramPair)
  {
    Intrinsics.checkNotNullParameter(paramPair, "<this>");
    return (F)first;
  }
  
  private final <F, S> S component2(Pair<F, S> paramPair)
  {
    Intrinsics.checkNotNullParameter(paramPair, "<this>");
    return (S)second;
  }
  
  private final SplitInfo translate(androidx.window.extensions.embedding.SplitInfo paramSplitInfo)
  {
    Object localObject1 = paramSplitInfo.getPrimaryActivityStack();
    Intrinsics.checkNotNullExpressionValue(localObject1, "splitInfo.primaryActivityStack");
    boolean bool1 = false;
    boolean bool2;
    try
    {
      bool2 = ((androidx.window.extensions.embedding.ActivityStack)localObject1).isEmpty();
    }
    catch (NoSuchMethodError localNoSuchMethodError1)
    {
      bool2 = false;
    }
    localObject1 = ((androidx.window.extensions.embedding.ActivityStack)localObject1).getActivities();
    Intrinsics.checkNotNullExpressionValue(localObject1, "primaryActivityStack.activities");
    localObject1 = new ActivityStack((List)localObject1, bool2);
    Object localObject2 = paramSplitInfo.getSecondaryActivityStack();
    Intrinsics.checkNotNullExpressionValue(localObject2, "splitInfo.secondaryActivityStack");
    try
    {
      bool2 = ((androidx.window.extensions.embedding.ActivityStack)localObject2).isEmpty();
      localObject2 = ((androidx.window.extensions.embedding.ActivityStack)localObject2).getActivities();
      Intrinsics.checkNotNullExpressionValue(localObject2, "secondaryActivityStack.activities");
      return new SplitInfo((ActivityStack)localObject1, new ActivityStack((List)localObject2, bool2), paramSplitInfo.getSplitRatio());
    }
    catch (NoSuchMethodError localNoSuchMethodError2)
    {
      for (;;)
      {
        bool2 = bool1;
      }
    }
  }
  
  private static final boolean translateActivityIntentPredicates$lambda-3(EmbeddingAdapter paramEmbeddingAdapter, Set paramSet, Pair paramPair)
  {
    Intrinsics.checkNotNullParameter(paramEmbeddingAdapter, "this$0");
    Intrinsics.checkNotNullParameter(paramSet, "$splitPairFilters");
    Intrinsics.checkNotNullExpressionValue(paramPair, "(first, second)");
    Activity localActivity = (Activity)paramEmbeddingAdapter.component1(paramPair);
    paramEmbeddingAdapter = (Intent)paramEmbeddingAdapter.component2(paramPair);
    boolean bool1 = paramSet instanceof Collection;
    boolean bool2 = false;
    if ((bool1) && (paramSet.isEmpty()))
    {
      bool1 = bool2;
    }
    else
    {
      paramSet = paramSet.iterator();
      do
      {
        bool1 = bool2;
        if (!paramSet.hasNext()) {
          break;
        }
      } while (!((SplitPairFilter)paramSet.next()).matchesActivityIntentPair(localActivity, paramEmbeddingAdapter));
      bool1 = true;
    }
    return bool1;
  }
  
  private static final boolean translateActivityPairPredicates$lambda-1(EmbeddingAdapter paramEmbeddingAdapter, Set paramSet, Pair paramPair)
  {
    Intrinsics.checkNotNullParameter(paramEmbeddingAdapter, "this$0");
    Intrinsics.checkNotNullParameter(paramSet, "$splitPairFilters");
    Intrinsics.checkNotNullExpressionValue(paramPair, "(first, second)");
    Activity localActivity = (Activity)paramEmbeddingAdapter.component1(paramPair);
    paramEmbeddingAdapter = (Activity)paramEmbeddingAdapter.component2(paramPair);
    boolean bool1 = paramSet instanceof Collection;
    boolean bool2 = false;
    if ((bool1) && (paramSet.isEmpty()))
    {
      bool1 = bool2;
    }
    else
    {
      paramSet = paramSet.iterator();
      do
      {
        bool1 = bool2;
        if (!paramSet.hasNext()) {
          break;
        }
      } while (!((SplitPairFilter)paramSet.next()).matchesActivityPair(localActivity, paramEmbeddingAdapter));
      bool1 = true;
    }
    return bool1;
  }
  
  private static final boolean translateActivityPredicates$lambda-6(Set paramSet, Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramSet, "$activityFilters");
    boolean bool1 = paramSet instanceof Collection;
    boolean bool2 = false;
    if ((bool1) && (paramSet.isEmpty()))
    {
      bool1 = bool2;
    }
    else
    {
      paramSet = paramSet.iterator();
      ActivityFilter localActivityFilter;
      do
      {
        bool1 = bool2;
        if (!paramSet.hasNext()) {
          break;
        }
        localActivityFilter = (ActivityFilter)paramSet.next();
        Intrinsics.checkNotNullExpressionValue(paramActivity, "activity");
      } while (!localActivityFilter.matchesActivity(paramActivity));
      bool1 = true;
    }
    return bool1;
  }
  
  private static final boolean translateIntentPredicates$lambda-8(Set paramSet, Intent paramIntent)
  {
    Intrinsics.checkNotNullParameter(paramSet, "$activityFilters");
    boolean bool1 = paramSet instanceof Collection;
    boolean bool2 = false;
    if ((bool1) && (paramSet.isEmpty()))
    {
      bool1 = bool2;
    }
    else
    {
      paramSet = paramSet.iterator();
      ActivityFilter localActivityFilter;
      do
      {
        bool1 = bool2;
        if (!paramSet.hasNext()) {
          break;
        }
        localActivityFilter = (ActivityFilter)paramSet.next();
        Intrinsics.checkNotNullExpressionValue(paramIntent, "intent");
      } while (!localActivityFilter.matchesIntent(paramIntent));
      bool1 = true;
    }
    return bool1;
  }
  
  private static final boolean translateParentMetricsPredicate$lambda-4(SplitRule paramSplitRule, WindowMetrics paramWindowMetrics)
  {
    Intrinsics.checkNotNullParameter(paramSplitRule, "$splitRule");
    Intrinsics.checkNotNullExpressionValue(paramWindowMetrics, "windowMetrics");
    return paramSplitRule.checkParentMetrics(paramWindowMetrics);
  }
  
  @NotNull
  public final List<SplitInfo> translate(@NotNull List<? extends androidx.window.extensions.embedding.SplitInfo> paramList)
  {
    Intrinsics.checkNotNullParameter(paramList, "splitInfoList");
    Object localObject = (Iterable)paramList;
    paramList = new ArrayList(m.l((Iterable)localObject, 10));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramList.add(translate((androidx.window.extensions.embedding.SplitInfo)((Iterator)localObject).next()));
    }
    return paramList;
  }
  
  @NotNull
  public final Set<androidx.window.extensions.embedding.EmbeddingRule> translate(@NotNull Set<? extends EmbeddingRule> paramSet)
  {
    Intrinsics.checkNotNullParameter(paramSet, "rules");
    ArrayList localArrayList = new ArrayList(m.l(paramSet, 10));
    Iterator localIterator = paramSet.iterator();
    while (localIterator.hasNext())
    {
      paramSet = (EmbeddingRule)localIterator.next();
      Object localObject;
      if ((paramSet instanceof SplitPairRule))
      {
        localObject = (SplitPairRule)paramSet;
        paramSet = new SplitPairRule.Builder(translateActivityPairPredicates(((SplitPairRule)localObject).getFilters()), translateActivityIntentPredicates(((SplitPairRule)localObject).getFilters()), translateParentMetricsPredicate((SplitRule)paramSet)).setSplitRatio(((SplitRule)localObject).getSplitRatio()).setLayoutDirection(((SplitRule)localObject).getLayoutDirection()).setShouldFinishPrimaryWithSecondary(((SplitPairRule)localObject).getFinishPrimaryWithSecondary()).setShouldFinishSecondaryWithPrimary(((SplitPairRule)localObject).getFinishSecondaryWithPrimary()).setShouldClearTop(((SplitPairRule)localObject).getClearTop()).build();
        localObject = "SplitPairRuleBuilder(\n  …                 .build()";
      }
      for (;;)
      {
        Intrinsics.checkNotNullExpressionValue(paramSet, (String)localObject);
        paramSet = (androidx.window.extensions.embedding.EmbeddingRule)paramSet;
        break;
        if ((paramSet instanceof SplitPlaceholderRule))
        {
          localObject = (SplitPlaceholderRule)paramSet;
          paramSet = new SplitPlaceholderRule.Builder(((SplitPlaceholderRule)localObject).getPlaceholderIntent(), translateActivityPredicates(((SplitPlaceholderRule)localObject).getFilters()), translateIntentPredicates(((SplitPlaceholderRule)localObject).getFilters()), translateParentMetricsPredicate((SplitRule)paramSet)).setSplitRatio(((SplitRule)localObject).getSplitRatio()).setLayoutDirection(((SplitRule)localObject).getLayoutDirection()).build();
          localObject = "SplitPlaceholderRuleBuil…                 .build()";
        }
        else
        {
          if (!(paramSet instanceof ActivityRule)) {
            break label299;
          }
          paramSet = (ActivityRule)paramSet;
          paramSet = new ActivityRule.Builder(translateActivityPredicates(paramSet.getFilters()), translateIntentPredicates(paramSet.getFilters())).setShouldAlwaysExpand(paramSet.getAlwaysExpand()).build();
          localObject = "ActivityRuleBuilder(\n   …                 .build()";
        }
      }
      localArrayList.add(paramSet);
      continue;
      label299:
      throw new IllegalArgumentException("Unsupported rule type");
    }
    return m.J(localArrayList);
  }
  
  @SuppressLint({"ClassVerificationFailure", "NewApi"})
  @NotNull
  public final Predicate<Pair<Activity, Intent>> translateActivityIntentPredicates(@NotNull Set<SplitPairFilter> paramSet)
  {
    Intrinsics.checkNotNullParameter(paramSet, "splitPairFilters");
    return new e(this, paramSet);
  }
  
  @SuppressLint({"ClassVerificationFailure", "NewApi"})
  @NotNull
  public final Predicate<Pair<Activity, Activity>> translateActivityPairPredicates(@NotNull Set<SplitPairFilter> paramSet)
  {
    Intrinsics.checkNotNullParameter(paramSet, "splitPairFilters");
    return new d(this, paramSet);
  }
  
  @SuppressLint({"ClassVerificationFailure", "NewApi"})
  @NotNull
  public final Predicate<Activity> translateActivityPredicates(@NotNull Set<ActivityFilter> paramSet)
  {
    Intrinsics.checkNotNullParameter(paramSet, "activityFilters");
    return new f(paramSet);
  }
  
  @SuppressLint({"ClassVerificationFailure", "NewApi"})
  @NotNull
  public final Predicate<Intent> translateIntentPredicates(@NotNull Set<ActivityFilter> paramSet)
  {
    Intrinsics.checkNotNullParameter(paramSet, "activityFilters");
    return new b(paramSet);
  }
  
  @SuppressLint({"ClassVerificationFailure", "NewApi"})
  @NotNull
  public final Predicate<WindowMetrics> translateParentMetricsPredicate(@NotNull SplitRule paramSplitRule)
  {
    Intrinsics.checkNotNullParameter(paramSplitRule, "splitRule");
    return new c(paramSplitRule);
  }
}

/* Location:
 * Qualified Name:     androidx.window.embedding.EmbeddingAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */