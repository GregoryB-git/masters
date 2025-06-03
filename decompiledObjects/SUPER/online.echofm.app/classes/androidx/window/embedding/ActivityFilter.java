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
public final class ActivityFilter
{
  @NotNull
  private final ComponentName componentName;
  private final String intentAction;
  
  public ActivityFilter(@NotNull ComponentName paramComponentName, String paramString)
  {
    componentName = paramComponentName;
    intentAction = paramString;
    paramString = paramComponentName.getPackageName();
    Intrinsics.checkNotNullExpressionValue(paramString, "componentName.packageName");
    paramComponentName = paramComponentName.getClassName();
    Intrinsics.checkNotNullExpressionValue(paramComponentName, "componentName.className");
    int i = paramString.length();
    int j = 1;
    if (i > 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      if (paramComponentName.length() > 0) {
        i = 1;
      } else {
        i = 0;
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
          i = j;
          if (i.v(paramComponentName, "*", false, 2, null)) {
            if (i.D(paramComponentName, "*", 0, false, 6, null) == paramComponentName.length() - 1) {
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
      throw new IllegalArgumentException("Activity class name must not be empty.".toString());
    }
    throw new IllegalArgumentException("Package name must not be empty".toString());
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof ActivityFilter)) {
      return false;
    }
    ComponentName localComponentName = componentName;
    paramObject = (ActivityFilter)paramObject;
    if (!Intrinsics.a(localComponentName, componentName)) {
      return false;
    }
    return Intrinsics.a(intentAction, intentAction);
  }
  
  @NotNull
  public final ComponentName getComponentName()
  {
    return componentName;
  }
  
  public final String getIntentAction()
  {
    return intentAction;
  }
  
  public int hashCode()
  {
    int i = componentName.hashCode();
    String str = intentAction;
    int j;
    if (str == null) {
      j = 0;
    } else {
      j = str.hashCode();
    }
    return i * 31 + j;
  }
  
  public final boolean matchesActivity(@NotNull Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    if (MatcherUtils.INSTANCE.areActivityOrIntentComponentsMatching$window_release(paramActivity, componentName))
    {
      String str = intentAction;
      if (str != null)
      {
        paramActivity = paramActivity.getIntent();
        if (paramActivity == null) {
          paramActivity = null;
        } else {
          paramActivity = paramActivity.getAction();
        }
        if (!Intrinsics.a(str, paramActivity)) {}
      }
      else
      {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public final boolean matchesIntent(@NotNull Intent paramIntent)
  {
    Intrinsics.checkNotNullParameter(paramIntent, "intent");
    boolean bool1 = MatcherUtils.INSTANCE.areComponentsMatching$window_release(paramIntent.getComponent(), componentName);
    boolean bool2 = false;
    if (bool1)
    {
      String str = intentAction;
      if ((str == null) || (Intrinsics.a(str, paramIntent.getAction()))) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  @NotNull
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ActivityFilter(componentName=");
    localStringBuilder.append(componentName);
    localStringBuilder.append(", intentAction=");
    localStringBuilder.append(intentAction);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.window.embedding.ActivityFilter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */