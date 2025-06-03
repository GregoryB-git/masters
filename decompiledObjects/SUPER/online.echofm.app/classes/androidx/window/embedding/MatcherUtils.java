package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public final class MatcherUtils
{
  @NotNull
  public static final MatcherUtils INSTANCE = new MatcherUtils();
  public static final boolean sDebugMatchers = false;
  @NotNull
  public static final String sMatchersTag = "SplitRuleResolution";
  
  private final boolean wildcardMatch(String paramString1, String paramString2)
  {
    if (!i.v(paramString2, "*", false, 2, null)) {
      return false;
    }
    if (Intrinsics.a(paramString2, "*")) {
      return true;
    }
    int i;
    if ((i.D(paramString2, "*", 0, false, 6, null) == i.J(paramString2, "*", 0, false, 6, null)) && (i.k(paramString2, "*", false, 2, null))) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      paramString2 = paramString2.substring(0, paramString2.length() - 1);
      Intrinsics.checkNotNullExpressionValue(paramString2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
      return i.s(paramString1, paramString2, false, 2, null);
    }
    throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end".toString());
  }
  
  public final boolean areActivityOrIntentComponentsMatching$window_release(@NotNull Activity paramActivity, @NotNull ComponentName paramComponentName)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    Intrinsics.checkNotNullParameter(paramComponentName, "ruleComponent");
    if (areComponentsMatching$window_release(paramActivity.getComponentName(), paramComponentName)) {
      return true;
    }
    paramActivity = paramActivity.getIntent();
    boolean bool = false;
    if (paramActivity != null)
    {
      paramActivity = paramActivity.getComponent();
      if (paramActivity != null) {
        bool = INSTANCE.areComponentsMatching$window_release(paramActivity, paramComponentName);
      }
    }
    return bool;
  }
  
  public final boolean areComponentsMatching$window_release(ComponentName paramComponentName1, @NotNull ComponentName paramComponentName2)
  {
    Intrinsics.checkNotNullParameter(paramComponentName2, "ruleComponent");
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3;
    if (paramComponentName1 == null)
    {
      bool3 = bool2;
      if (Intrinsics.a(paramComponentName2.getPackageName(), "*"))
      {
        bool3 = bool2;
        if (Intrinsics.a(paramComponentName2.getClassName(), "*")) {
          bool3 = true;
        }
      }
      return bool3;
    }
    String str1 = paramComponentName1.toString();
    Intrinsics.checkNotNullExpressionValue(str1, "activityComponent.toString()");
    if ((i.v(str1, "*", false, 2, null) ^ true))
    {
      if (!Intrinsics.a(paramComponentName1.getPackageName(), paramComponentName2.getPackageName()))
      {
        str1 = paramComponentName1.getPackageName();
        Intrinsics.checkNotNullExpressionValue(str1, "activityComponent.packageName");
        String str2 = paramComponentName2.getPackageName();
        Intrinsics.checkNotNullExpressionValue(str2, "ruleComponent.packageName");
        if (!wildcardMatch(str1, str2))
        {
          i = 0;
          break label144;
        }
      }
      int i = 1;
      label144:
      if (!Intrinsics.a(paramComponentName1.getClassName(), paramComponentName2.getClassName()))
      {
        paramComponentName1 = paramComponentName1.getClassName();
        Intrinsics.checkNotNullExpressionValue(paramComponentName1, "activityComponent.className");
        paramComponentName2 = paramComponentName2.getClassName();
        Intrinsics.checkNotNullExpressionValue(paramComponentName2, "ruleComponent.className");
        if (!wildcardMatch(paramComponentName1, paramComponentName2))
        {
          j = 0;
          break label201;
        }
      }
      int j = 1;
      label201:
      bool3 = bool1;
      if (i != 0)
      {
        bool3 = bool1;
        if (j != 0) {
          bool3 = true;
        }
      }
      return bool3;
    }
    throw new IllegalArgumentException("Wildcard can only be part of the rule.".toString());
  }
}

/* Location:
 * Qualified Name:     androidx.window.embedding.MatcherUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */