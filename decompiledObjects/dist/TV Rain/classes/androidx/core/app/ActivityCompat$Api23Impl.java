package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback.OnSharedElementsReadyListener;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
class ActivityCompat$Api23Impl
{
  @DoNotInline
  public static void onSharedElementsReady(Object paramObject)
  {
    ((SharedElementCallback.OnSharedElementsReadyListener)paramObject).onSharedElementsReady();
  }
  
  @DoNotInline
  public static void requestPermissions(Activity paramActivity, String[] paramArrayOfString, int paramInt)
  {
    paramActivity.requestPermissions(paramArrayOfString, paramInt);
  }
  
  @DoNotInline
  public static boolean shouldShowRequestPermissionRationale(Activity paramActivity, String paramString)
  {
    return paramActivity.shouldShowRequestPermissionRationale(paramString);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.ActivityCompat.Api23Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */