package androidx.mediarouter.media;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.media.MediaRouter;
import android.media.MediaRouter.RouteInfo;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(17)
final class MediaRouterJellybeanMr1
{
  private static final String TAG = "MediaRouterJellybeanMr1";
  
  public static Object createCallback(Callback paramCallback)
  {
    return new CallbackProxy(paramCallback);
  }
  
  public static final class ActiveScanWorkaround
    implements Runnable
  {
    private static final int WIFI_DISPLAY_SCAN_INTERVAL = 15000;
    private boolean mActivelyScanningWifiDisplays;
    private final DisplayManager mDisplayManager;
    private final Handler mHandler;
    private Method mScanWifiDisplaysMethod;
    
    public ActiveScanWorkaround(@NonNull Context paramContext, @NonNull Handler paramHandler)
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
  
  public static abstract interface Callback
    extends MediaRouterJellybean.Callback
  {
    public abstract void onRoutePresentationDisplayChanged(@NonNull Object paramObject);
  }
  
  public static class CallbackProxy<T extends MediaRouterJellybeanMr1.Callback>
    extends MediaRouterJellybean.CallbackProxy<T>
  {
    public CallbackProxy(T paramT)
    {
      super();
    }
    
    public void onRoutePresentationDisplayChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      ((MediaRouterJellybeanMr1.Callback)mCallback).onRoutePresentationDisplayChanged(paramRouteInfo);
    }
  }
  
  public static final class IsConnectingWorkaround
  {
    private Method mGetStatusCodeMethod;
    private int mStatusConnecting;
    
    public IsConnectingWorkaround()
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean isConnecting(@NonNull Object paramObject)
    {
      paramObject = (MediaRouter.RouteInfo)paramObject;
      Method localMethod = mGetStatusCodeMethod;
      bool1 = false;
      bool2 = bool1;
      if (localMethod != null) {}
      try
      {
        int i = ((Integer)localMethod.invoke(paramObject, new Object[0])).intValue();
        int j = mStatusConnecting;
        bool2 = bool1;
        if (i == j) {
          bool2 = true;
        }
      }
      catch (IllegalAccessException|InvocationTargetException paramObject)
      {
        for (;;)
        {
          bool2 = bool1;
        }
      }
      return bool2;
    }
  }
  
  public static final class RouteInfo
  {
    @Nullable
    public static Display getPresentationDisplay(@NonNull Object paramObject)
    {
      try
      {
        paramObject = ((MediaRouter.RouteInfo)paramObject).getPresentationDisplay();
        return (Display)paramObject;
      }
      catch (NoSuchMethodError paramObject)
      {
        Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", (Throwable)paramObject);
      }
      return null;
    }
    
    public static boolean isEnabled(@NonNull Object paramObject)
    {
      return ((MediaRouter.RouteInfo)paramObject).isEnabled();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouterJellybeanMr1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */