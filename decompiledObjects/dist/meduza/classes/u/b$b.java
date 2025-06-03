package u;

import android.app.Activity;
import android.app.SharedElementCallback.OnSharedElementsReadyListener;

public final class b$b
{
  public static void a(Object paramObject)
  {
    ((SharedElementCallback.OnSharedElementsReadyListener)paramObject).onSharedElementsReady();
  }
  
  public static void b(Activity paramActivity, String[] paramArrayOfString, int paramInt)
  {
    paramActivity.requestPermissions(paramArrayOfString, paramInt);
  }
  
  public static boolean c(Activity paramActivity, String paramString)
  {
    return paramActivity.shouldShowRequestPermissionRationale(paramString);
  }
}

/* Location:
 * Qualified Name:     u.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */