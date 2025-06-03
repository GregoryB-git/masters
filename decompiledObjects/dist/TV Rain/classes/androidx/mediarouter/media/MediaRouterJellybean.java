package androidx.mediarouter.media;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaRouter;
import android.media.MediaRouter.Callback;
import android.media.MediaRouter.RouteCategory;
import android.media.MediaRouter.RouteGroup;
import android.media.MediaRouter.RouteInfo;
import android.media.MediaRouter.UserRouteInfo;
import android.media.MediaRouter.VolumeCallback;
import android.media.RemoteControlClient;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(16)
final class MediaRouterJellybean
{
  public static final int ALL_ROUTE_TYPES = 8388611;
  public static final int DEVICE_OUT_BLUETOOTH = 896;
  public static final int ROUTE_TYPE_LIVE_AUDIO = 1;
  public static final int ROUTE_TYPE_LIVE_VIDEO = 2;
  public static final int ROUTE_TYPE_USER = 8388608;
  private static final String TAG = "MediaRouterJellybean";
  
  public static void addCallback(Object paramObject1, int paramInt, Object paramObject2)
  {
    ((MediaRouter)paramObject1).addCallback(paramInt, (MediaRouter.Callback)paramObject2);
  }
  
  public static void addUserRoute(Object paramObject1, Object paramObject2)
  {
    ((MediaRouter)paramObject1).addUserRoute((MediaRouter.UserRouteInfo)paramObject2);
  }
  
  public static Object createCallback(Callback paramCallback)
  {
    return new CallbackProxy(paramCallback);
  }
  
  public static Object createRouteCategory(Object paramObject, String paramString, boolean paramBoolean)
  {
    return ((MediaRouter)paramObject).createRouteCategory(paramString, paramBoolean);
  }
  
  public static Object createUserRoute(Object paramObject1, Object paramObject2)
  {
    return ((MediaRouter)paramObject1).createUserRoute((MediaRouter.RouteCategory)paramObject2);
  }
  
  public static Object createVolumeCallback(VolumeCallback paramVolumeCallback)
  {
    return new VolumeCallbackProxy(paramVolumeCallback);
  }
  
  public static List getCategories(Object paramObject)
  {
    paramObject = (MediaRouter)paramObject;
    int i = ((MediaRouter)paramObject).getCategoryCount();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      localArrayList.add(((MediaRouter)paramObject).getCategoryAt(j));
    }
    return localArrayList;
  }
  
  public static Object getMediaRouter(Context paramContext)
  {
    return paramContext.getSystemService("media_router");
  }
  
  public static List getRoutes(Object paramObject)
  {
    MediaRouter localMediaRouter = (MediaRouter)paramObject;
    int i = localMediaRouter.getRouteCount();
    paramObject = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      ((ArrayList)paramObject).add(localMediaRouter.getRouteAt(j));
    }
    return (List)paramObject;
  }
  
  public static Object getSelectedRoute(Object paramObject, int paramInt)
  {
    return ((MediaRouter)paramObject).getSelectedRoute(paramInt);
  }
  
  public static void removeCallback(Object paramObject1, Object paramObject2)
  {
    ((MediaRouter)paramObject1).removeCallback((MediaRouter.Callback)paramObject2);
  }
  
  public static void removeUserRoute(Object paramObject1, Object paramObject2)
  {
    ((MediaRouter)paramObject1).removeUserRoute((MediaRouter.UserRouteInfo)paramObject2);
  }
  
  public static void selectRoute(Object paramObject1, int paramInt, Object paramObject2)
  {
    ((MediaRouter)paramObject1).selectRoute(paramInt, (MediaRouter.RouteInfo)paramObject2);
  }
  
  public static abstract interface Callback
  {
    public abstract void onRouteAdded(@NonNull Object paramObject);
    
    public abstract void onRouteChanged(@NonNull Object paramObject);
    
    public abstract void onRouteGrouped(@NonNull Object paramObject1, @NonNull Object paramObject2, int paramInt);
    
    public abstract void onRouteRemoved(@NonNull Object paramObject);
    
    public abstract void onRouteSelected(int paramInt, @NonNull Object paramObject);
    
    public abstract void onRouteUngrouped(@NonNull Object paramObject1, @NonNull Object paramObject2);
    
    public abstract void onRouteUnselected(int paramInt, @NonNull Object paramObject);
    
    public abstract void onRouteVolumeChanged(@NonNull Object paramObject);
  }
  
  public static class CallbackProxy<T extends MediaRouterJellybean.Callback>
    extends MediaRouter.Callback
  {
    public final T mCallback;
    
    public CallbackProxy(T paramT)
    {
      mCallback = paramT;
    }
    
    public void onRouteAdded(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      mCallback.onRouteAdded(paramRouteInfo);
    }
    
    public void onRouteChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      mCallback.onRouteChanged(paramRouteInfo);
    }
    
    public void onRouteGrouped(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo, MediaRouter.RouteGroup paramRouteGroup, int paramInt)
    {
      mCallback.onRouteGrouped(paramRouteInfo, paramRouteGroup, paramInt);
    }
    
    public void onRouteRemoved(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      mCallback.onRouteRemoved(paramRouteInfo);
    }
    
    public void onRouteSelected(MediaRouter paramMediaRouter, int paramInt, MediaRouter.RouteInfo paramRouteInfo)
    {
      mCallback.onRouteSelected(paramInt, paramRouteInfo);
    }
    
    public void onRouteUngrouped(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo, MediaRouter.RouteGroup paramRouteGroup)
    {
      mCallback.onRouteUngrouped(paramRouteInfo, paramRouteGroup);
    }
    
    public void onRouteUnselected(MediaRouter paramMediaRouter, int paramInt, MediaRouter.RouteInfo paramRouteInfo)
    {
      mCallback.onRouteUnselected(paramInt, paramRouteInfo);
    }
    
    public void onRouteVolumeChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      mCallback.onRouteVolumeChanged(paramRouteInfo);
    }
  }
  
  public static final class GetDefaultRouteWorkaround
  {
    private Method mGetSystemAudioRouteMethod;
    
    public GetDefaultRouteWorkaround()
    {
      throw new UnsupportedOperationException();
    }
    
    @NonNull
    public Object getDefaultRoute(@NonNull Object paramObject)
    {
      paramObject = (MediaRouter)paramObject;
      Object localObject = mGetSystemAudioRouteMethod;
      if (localObject != null) {}
      try
      {
        localObject = ((Method)localObject).invoke(paramObject, new Object[0]);
        return localObject;
      }
      catch (IllegalAccessException|InvocationTargetException localIllegalAccessException)
      {
        for (;;) {}
      }
      return ((MediaRouter)paramObject).getRouteAt(0);
    }
  }
  
  public static final class RouteCategory
  {
    @Nullable
    public static CharSequence getName(@NonNull Object paramObject, @NonNull Context paramContext)
    {
      return ((MediaRouter.RouteCategory)paramObject).getName(paramContext);
    }
    
    @NonNull
    public static List getRoutes(@NonNull Object paramObject)
    {
      ArrayList localArrayList = new ArrayList();
      ((MediaRouter.RouteCategory)paramObject).getRoutes(localArrayList);
      return localArrayList;
    }
    
    public static int getSupportedTypes(@NonNull Object paramObject)
    {
      return ((MediaRouter.RouteCategory)paramObject).getSupportedTypes();
    }
    
    public static boolean isGroupable(@NonNull Object paramObject)
    {
      return ((MediaRouter.RouteCategory)paramObject).isGroupable();
    }
  }
  
  public static final class RouteGroup
  {
    @NonNull
    public static List getGroupedRoutes(@NonNull Object paramObject)
    {
      MediaRouter.RouteGroup localRouteGroup = (MediaRouter.RouteGroup)paramObject;
      int i = localRouteGroup.getRouteCount();
      paramObject = new ArrayList(i);
      for (int j = 0; j < i; j++) {
        ((ArrayList)paramObject).add(localRouteGroup.getRouteAt(j));
      }
      return (List)paramObject;
    }
  }
  
  public static final class RouteInfo
  {
    @Nullable
    public static Object getCategory(@NonNull Object paramObject)
    {
      return ((MediaRouter.RouteInfo)paramObject).getCategory();
    }
    
    @Nullable
    public static Object getGroup(@NonNull Object paramObject)
    {
      return ((MediaRouter.RouteInfo)paramObject).getGroup();
    }
    
    @Nullable
    public static Drawable getIconDrawable(@NonNull Object paramObject)
    {
      return ((MediaRouter.RouteInfo)paramObject).getIconDrawable();
    }
    
    @NonNull
    public static CharSequence getName(@NonNull Object paramObject, @NonNull Context paramContext)
    {
      return ((MediaRouter.RouteInfo)paramObject).getName(paramContext);
    }
    
    public static int getPlaybackStream(@NonNull Object paramObject)
    {
      return ((MediaRouter.RouteInfo)paramObject).getPlaybackStream();
    }
    
    public static int getPlaybackType(@NonNull Object paramObject)
    {
      return ((MediaRouter.RouteInfo)paramObject).getPlaybackType();
    }
    
    @NonNull
    public static CharSequence getStatus(@NonNull Object paramObject)
    {
      return ((MediaRouter.RouteInfo)paramObject).getStatus();
    }
    
    public static int getSupportedTypes(@NonNull Object paramObject)
    {
      return ((MediaRouter.RouteInfo)paramObject).getSupportedTypes();
    }
    
    @Nullable
    public static Object getTag(@NonNull Object paramObject)
    {
      return ((MediaRouter.RouteInfo)paramObject).getTag();
    }
    
    public static int getVolume(@NonNull Object paramObject)
    {
      return ((MediaRouter.RouteInfo)paramObject).getVolume();
    }
    
    public static int getVolumeHandling(@NonNull Object paramObject)
    {
      return ((MediaRouter.RouteInfo)paramObject).getVolumeHandling();
    }
    
    public static int getVolumeMax(@NonNull Object paramObject)
    {
      return ((MediaRouter.RouteInfo)paramObject).getVolumeMax();
    }
    
    public static boolean isGroup(@NonNull Object paramObject)
    {
      return paramObject instanceof MediaRouter.RouteGroup;
    }
    
    public static void requestSetVolume(@NonNull Object paramObject, int paramInt)
    {
      ((MediaRouter.RouteInfo)paramObject).requestSetVolume(paramInt);
    }
    
    public static void requestUpdateVolume(@NonNull Object paramObject, int paramInt)
    {
      ((MediaRouter.RouteInfo)paramObject).requestUpdateVolume(paramInt);
    }
    
    public static void setTag(@NonNull Object paramObject1, @Nullable Object paramObject2)
    {
      ((MediaRouter.RouteInfo)paramObject1).setTag(paramObject2);
    }
  }
  
  public static final class SelectRouteWorkaround
  {
    private Method mSelectRouteIntMethod;
    
    public SelectRouteWorkaround()
    {
      throw new UnsupportedOperationException();
    }
    
    public void selectRoute(@NonNull Object paramObject1, int paramInt, @NonNull Object paramObject2)
    {
      paramObject1 = (MediaRouter)paramObject1;
      paramObject2 = (MediaRouter.RouteInfo)paramObject2;
      if ((((MediaRouter.RouteInfo)paramObject2).getSupportedTypes() & 0x800000) == 0)
      {
        Method localMethod = mSelectRouteIntMethod;
        if (localMethod != null) {
          try
          {
            localMethod.invoke(paramObject1, new Object[] { Integer.valueOf(paramInt), paramObject2 });
            return;
          }
          catch (InvocationTargetException localInvocationTargetException)
          {
            Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", localInvocationTargetException);
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", localIllegalAccessException);
          }
        } else {
          Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.");
        }
      }
      ((MediaRouter)paramObject1).selectRoute(paramInt, (MediaRouter.RouteInfo)paramObject2);
    }
  }
  
  public static final class UserRouteInfo
  {
    public static void setIconDrawable(@NonNull Object paramObject, @Nullable Drawable paramDrawable)
    {
      ((MediaRouter.UserRouteInfo)paramObject).setIconDrawable(paramDrawable);
    }
    
    public static void setName(@NonNull Object paramObject, @NonNull CharSequence paramCharSequence)
    {
      ((MediaRouter.UserRouteInfo)paramObject).setName(paramCharSequence);
    }
    
    public static void setPlaybackStream(@NonNull Object paramObject, int paramInt)
    {
      ((MediaRouter.UserRouteInfo)paramObject).setPlaybackStream(paramInt);
    }
    
    public static void setPlaybackType(@NonNull Object paramObject, int paramInt)
    {
      ((MediaRouter.UserRouteInfo)paramObject).setPlaybackType(paramInt);
    }
    
    public static void setRemoteControlClient(@NonNull Object paramObject1, @Nullable Object paramObject2)
    {
      ((MediaRouter.UserRouteInfo)paramObject1).setRemoteControlClient((RemoteControlClient)paramObject2);
    }
    
    public static void setStatus(@NonNull Object paramObject, @NonNull CharSequence paramCharSequence)
    {
      ((MediaRouter.UserRouteInfo)paramObject).setStatus(paramCharSequence);
    }
    
    public static void setVolume(@NonNull Object paramObject, int paramInt)
    {
      ((MediaRouter.UserRouteInfo)paramObject).setVolume(paramInt);
    }
    
    public static void setVolumeCallback(@NonNull Object paramObject1, @NonNull Object paramObject2)
    {
      ((MediaRouter.UserRouteInfo)paramObject1).setVolumeCallback((MediaRouter.VolumeCallback)paramObject2);
    }
    
    public static void setVolumeHandling(@NonNull Object paramObject, int paramInt)
    {
      ((MediaRouter.UserRouteInfo)paramObject).setVolumeHandling(paramInt);
    }
    
    public static void setVolumeMax(@NonNull Object paramObject, int paramInt)
    {
      ((MediaRouter.UserRouteInfo)paramObject).setVolumeMax(paramInt);
    }
  }
  
  public static abstract interface VolumeCallback
  {
    public abstract void onVolumeSetRequest(@NonNull Object paramObject, int paramInt);
    
    public abstract void onVolumeUpdateRequest(@NonNull Object paramObject, int paramInt);
  }
  
  public static class VolumeCallbackProxy<T extends MediaRouterJellybean.VolumeCallback>
    extends MediaRouter.VolumeCallback
  {
    public final T mCallback;
    
    public VolumeCallbackProxy(T paramT)
    {
      mCallback = paramT;
    }
    
    public void onVolumeSetRequest(MediaRouter.RouteInfo paramRouteInfo, int paramInt)
    {
      mCallback.onVolumeSetRequest(paramRouteInfo, paramInt);
    }
    
    public void onVolumeUpdateRequest(MediaRouter.RouteInfo paramRouteInfo, int paramInt)
    {
      mCallback.onVolumeUpdateRequest(paramRouteInfo, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouterJellybean
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */