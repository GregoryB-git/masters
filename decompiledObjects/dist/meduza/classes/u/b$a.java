package u;

import android.app.Activity;
import android.app.SharedElementCallback;

public final class b$a
{
  public static void a(Activity paramActivity)
  {
    paramActivity.finishAfterTransition();
  }
  
  public static void b(Activity paramActivity)
  {
    paramActivity.postponeEnterTransition();
  }
  
  public static void c(Activity paramActivity, SharedElementCallback paramSharedElementCallback)
  {
    paramActivity.setEnterSharedElementCallback(paramSharedElementCallback);
  }
  
  public static void d(Activity paramActivity, SharedElementCallback paramSharedElementCallback)
  {
    paramActivity.setExitSharedElementCallback(paramSharedElementCallback);
  }
  
  public static void e(Activity paramActivity)
  {
    paramActivity.startPostponedEnterTransition();
  }
}

/* Location:
 * Qualified Name:     u.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */