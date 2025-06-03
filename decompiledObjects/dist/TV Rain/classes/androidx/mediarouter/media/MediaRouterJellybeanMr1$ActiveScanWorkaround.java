package androidx.mediarouter.media;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class MediaRouterJellybeanMr1$ActiveScanWorkaround
  implements Runnable
{
  private static final int WIFI_DISPLAY_SCAN_INTERVAL = 15000;
  private boolean mActivelyScanningWifiDisplays;
  private final DisplayManager mDisplayManager;
  private final Handler mHandler;
  private Method mScanWifiDisplaysMethod;
  
  public MediaRouterJellybeanMr1$ActiveScanWorkaround(@NonNull Context paramContext, @NonNull Handler paramHandler)
  {
    throw new UnsupportedOperationException();
  }
  
  public void run()
  {
    if (mActivelyScanningWifiDisplays)
    {
      try
      {
        mScanWifiDisplaysMethod.invoke(mDisplayManager, new Object[0]);
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays.", localInvocationTargetException);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays.", localIllegalAccessException);
      }
      mHandler.postDelayed(this, 15000L);
    }
  }
  
  public void setActiveScanRouteTypes(int paramInt)
  {
    if ((paramInt & 0x2) != 0)
    {
      if (!mActivelyScanningWifiDisplays) {
        if (mScanWifiDisplaysMethod != null)
        {
          mActivelyScanningWifiDisplays = true;
          mHandler.post(this);
        }
        else
        {
          Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays because the DisplayManager.scanWifiDisplays() method is not available on this device.");
        }
      }
    }
    else if (mActivelyScanningWifiDisplays)
    {
      mActivelyScanningWifiDisplays = false;
      mHandler.removeCallbacks(this);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouterJellybeanMr1.ActiveScanWorkaround
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */