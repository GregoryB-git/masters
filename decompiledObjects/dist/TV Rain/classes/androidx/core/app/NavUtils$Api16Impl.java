package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(16)
class NavUtils$Api16Impl
{
  @DoNotInline
  public static Intent getParentActivityIntent(Activity paramActivity)
  {
    return paramActivity.getParentActivityIntent();
  }
  
  @DoNotInline
  public static boolean navigateUpTo(Activity paramActivity, Intent paramIntent)
  {
    return paramActivity.navigateUpTo(paramIntent);
  }
  
  @DoNotInline
  public static boolean shouldUpRecreateTask(Activity paramActivity, Intent paramIntent)
  {
    return paramActivity.shouldUpRecreateTask(paramIntent);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NavUtils.Api16Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */