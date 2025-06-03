package androidx.window.layout;

import android.app.Activity;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.window.core.Version;
import androidx.window.core.Version.Companion;
import androidx.window.sidecar.SidecarProvider;
import kotlin.Metadata;

@Metadata
public final class SidecarCompat$Companion
{
  public final IBinder getActivityWindowToken$window_release(Activity paramActivity)
  {
    Object localObject = null;
    if (paramActivity == null)
    {
      paramActivity = (Activity)localObject;
    }
    else
    {
      paramActivity = paramActivity.getWindow();
      if (paramActivity == null)
      {
        paramActivity = (Activity)localObject;
      }
      else
      {
        paramActivity = paramActivity.getAttributes();
        if (paramActivity == null) {
          paramActivity = (Activity)localObject;
        } else {
          paramActivity = token;
        }
      }
    }
    return paramActivity;
  }
  
  public final Version getSidecarVersion()
  {
    localObject1 = null;
    try
    {
      String str = SidecarProvider.getApiVersion();
      localObject2 = localObject1;
      if (!TextUtils.isEmpty(str)) {
        localObject2 = Version.Companion.parse(str);
      }
    }
    catch (NoClassDefFoundError|UnsupportedOperationException localNoClassDefFoundError)
    {
      for (;;)
      {
        Object localObject2;
        Object localObject3 = localObject1;
      }
    }
    return (Version)localObject2;
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.SidecarCompat.Companion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */