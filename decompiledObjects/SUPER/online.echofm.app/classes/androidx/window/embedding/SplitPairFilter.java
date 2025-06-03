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
public final class SplitPairFilter
{
  @NotNull
  private final ComponentName primaryActivityName;
  private final String secondaryActivityIntentAction;
  @NotNull
  private final ComponentName secondaryActivityName;
  
  public SplitPairFilter(@NotNull ComponentName paramComponentName1, @NotNull ComponentName paramComponentName2, String paramString)
  {
    primaryActivityName = paramComponentName1;
    secondaryActivityName = paramComponentName2;
    secondaryActivityIntentAction = paramString;
    paramString = paramComponentName1.getPackageName();
    Intrinsics.checkNotNullExpressionValue(paramString, "primaryActivityName.packageName");
    String str1 = paramComponentName1.getClassName();
    Intrinsics.checkNotNullExpressionValue(str1, "primaryActivityName.className");
    String str2 = paramComponentName2.getPackageName();
    Intrinsics.checkNotNullExpressionValue(str2, "secondaryActivityName.packageName");
    paramComponentName1 = paramComponentName2.getClassName();
    Intrinsics.checkNotNullExpressionValue(paramComponentName1, "secondaryActivityName.className");
    int i = paramString.length();
    int j = 1;
    if ((i == 0) || (str2.length() == 0)) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0)
    {
      if ((str1.length() == 0) || (paramComponentName1.length() == 0)) {
        i = 0;
      } else {
        i = 1;
      }
      if (i != 0)
      {
        if ((i.v(paramString, "*", false, 2, null)) && (i.D(paramString, "*", 0, false, 6, null) != paramString.length() - 1)) {
          i = 0;
        } else {
          i = 1;
        }
        if (i != 0)
        {
          if ((i.v(str1, "*", false, 2, null)) && (i.D(str1, "*", 0, false, 6, null) != str1.length() - 1)) {
            i = 0;
          } else {
            i = 1;
          }
          if (i != 0)
          {
            if ((i.v(str2, "*", false, 2, null)) && (i.D(str2, "*", 0, false, 6, null) != str2.length() - 1)) {
              i = 0;
            } else {
              i = 1;
            }
            if (i != 0)
            {
              i = j;
              if (i.v(paramComponentName1, "*", false, 2, null)) {
                if (i.D(paramComponentName1, "*", 0, false, 6, null) == paramComponentName1.length() - 1) {
                  i = j;
                } else {
                  i = 0;
                }
              }
              if (i != 0) {
                return;
              }
              throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
            }
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
          }
          throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
        }
        throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
      }
      throw new IllegalArgumentException("Activity class name must not be empty.".toString());
    }
    throw new IllegalArgumentException("Package name must not be empty".toString());
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof SplitPairFilter)) {
      return false;
    }
    ComponentName localComponentName = primaryActivityName;
    paramObject = (SplitPairFilter)paramObject;
    if (!Intrinsics.a(localComponentName, primaryActivityName)) {
      return false;
    }
    if (!Intrinsics.a(secondaryActivityName, secondaryActivityName)) {
      return false;
    }
    return Intrinsics.a(secondaryActivityIntentAction, secondaryActivityIntentAction);
  }
  
  @NotNull
  public final ComponentName getPrimaryActivityName()
  {
    return primaryActivityName;
  }
  
  public final String getSecondaryActivityIntentAction()
  {
    return secondaryActivityIntentAction;
  }
  
  @NotNull
  public final ComponentName getSecondaryActivityName()
  {
    return secondaryActivityName;
  }
  
  public int hashCode()
  {
    int i = primaryActivityName.hashCode();
    int j = secondaryActivityName.hashCode();
    String str = secondaryActivityIntentAction;
    int k;
    if (str == null) {
      k = 0;
    } else {
      k = str.hashCode();
    }
    return (i * 31 + j) * 31 + k;
  }
  
  public final boolean matchesActivityIntentPair(@NotNull Activity paramActivity, @NotNull Intent paramIntent)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "primaryActivity");
    Intrinsics.checkNotNullParameter(paramIntent, "secondaryActivityIntent");
    ComponentName localComponentName = paramActivity.getComponentName();
    paramActivity = MatcherUtils.INSTANCE;
    boolean bool1 = paramActivity.areComponentsMatching$window_release(localComponentName, primaryActivityName);
    boolean bool2 = false;
    if ((bool1) && (paramActivity.areComponentsMatching$window_release(paramIntent.getComponent(), secondaryActivityName)))
    {
      paramActivity = secondaryActivityIntentAction;
      if ((paramActivity == null) || (Intrinsics.a(paramActivity, paramIntent.getAction()))) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public final boolean matchesActivityPair(@NotNull Activity paramActivity1, @NotNull Activity paramActivity2)
  {
    Intrinsics.checkNotNullParameter(paramActivity1, "primaryActivity");
    Intrinsics.checkNotNullParameter(paramActivity2, "secondaryActivity");
    MatcherUtils localMatcherUtils = MatcherUtils.INSTANCE;
    boolean bool1 = localMatcherUtils.areComponentsMatching$window_release(paramActivity1.getComponentName(), primaryActivityName);
    boolean bool2 = false;
    if ((bool1) && (localMatcherUtils.areComponentsMatching$window_release(paramActivity2.getComponentName(), secondaryActivityName))) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    boolean bool3 = bool1;
    if (paramActivity2.getIntent() != null)
    {
      bool3 = bool2;
      if (bool1)
      {
        paramActivity2 = paramActivity2.getIntent();
        Intrinsics.checkNotNullExpressionValue(paramActivity2, "secondaryActivity.intent");
        bool3 = bool2;
        if (matchesActivityIntentPair(paramActivity1, paramActivity2)) {
          bool3 = true;
        }
      }
    }
    return bool3;
  }
  
  @NotNull
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SplitPairFilter{primaryActivityName=");
    localStringBuilder.append(primaryActivityName);
    localStringBuilder.append(", secondaryActivityName=");
    localStringBuilder.append(secondaryActivityName);
    localStringBuilder.append(", secondaryActivityAction=");
    localStringBuilder.append(secondaryActivityIntentAction);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.window.embedding.SplitPairFilter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */