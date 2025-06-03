package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.util.Pair;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class ActivityOptionsCompat$Api21Impl
{
  @DoNotInline
  public static ActivityOptions makeSceneTransitionAnimation(Activity paramActivity, View paramView, String paramString)
  {
    return ActivityOptions.makeSceneTransitionAnimation(paramActivity, paramView, paramString);
  }
  
  @SafeVarargs
  @DoNotInline
  public static ActivityOptions makeSceneTransitionAnimation(Activity paramActivity, Pair<View, String>... paramVarArgs)
  {
    return ActivityOptions.makeSceneTransitionAnimation(paramActivity, paramVarArgs);
  }
  
  @DoNotInline
  public static ActivityOptions makeTaskLaunchBehind()
  {
    return ActivityOptions.makeTaskLaunchBehind();
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.ActivityOptionsCompat.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */