package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class ActivityCompat$Api21Impl
{
  @DoNotInline
  public static void finishAfterTransition(Activity paramActivity)
  {
    paramActivity.finishAfterTransition();
  }
  
  @DoNotInline
  public static void postponeEnterTransition(Activity paramActivity)
  {
    paramActivity.postponeEnterTransition();
  }
  
  @DoNotInline
  public static void setEnterSharedElementCallback(Activity paramActivity, SharedElementCallback paramSharedElementCallback)
  {
    paramActivity.setEnterSharedElementCallback(paramSharedElementCallback);
  }
  
  @DoNotInline
  public static void setExitSharedElementCallback(Activity paramActivity, SharedElementCallback paramSharedElementCallback)
  {
    paramActivity.setExitSharedElementCallback(paramSharedElementCallback);
  }
  
  @DoNotInline
  public static void startPostponedEnterTransition(Activity paramActivity)
  {
    paramActivity.startPostponedEnterTransition();
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.ActivityCompat.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */