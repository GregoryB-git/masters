package androidx.mediarouter.media;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

abstract class RemoteControlClientCompat
{
  public final Context mContext;
  public final Object mRcc;
  public VolumeCallback mVolumeCallback;
  
  public RemoteControlClientCompat(Context paramContext, Object paramObject)
  {
    mContext = paramContext;
    mRcc = paramObject;
  }
  
  public static RemoteControlClientCompat obtain(Context paramContext, Object paramObject)
  {
    return new JellybeanImpl(paramContext, paramObject);
  }
  
  public Object getRemoteControlClient()
  {
    return mRcc;
  }
  
  public void setPlaybackInfo(PlaybackInfo paramPlaybackInfo) {}
  
  public void setVolumeCallback(VolumeCallback paramVolumeCallback)
  {
    mVolumeCallback = paramVolumeCallback;
  }
  
  @RequiresApi(16)
  public static class JellybeanImpl
    extends RemoteControlClientCompat
  {
    private boolean mRegistered;
    private final Object mRouterObj;
    private final Object mUserRouteCategoryObj;
    private final Object mUserRouteObj;
    
    public JellybeanImpl(Context paramContext, Object paramObject)
    {
      super(paramObject);
      paramObject = MediaRouterJellybean.getMediaRouter(paramContext);
      mRouterObj = paramObject;
      paramContext = MediaRouterJellybean.createRouteCategory(paramObject, "", false);
      mUserRouteCategoryObj = paramContext;
      mUserRouteObj = MediaRouterJellybean.createUserRoute(paramObject, paramContext);
    }
    
    public void setPlaybackInfo(RemoteControlClientCompat.PlaybackInfo paramPlaybackInfo)
    {
      MediaRouterJellybean.UserRouteInfo.setVolume(mUserRouteObj, volume);
      MediaRouterJellybean.UserRouteInfo.setVolumeMax(mUserRouteObj, volumeMax);
      MediaRouterJellybean.UserRouteInfo.setVolumeHandling(mUserRouteObj, volumeHandling);
      MediaRouterJellybean.UserRouteInfo.setPlaybackStream(mUserRouteObj, playbackStream);
      MediaRouterJellybean.UserRouteInfo.setPlaybackType(mUserRouteObj, playbackType);
      if (!mRegistered)
      {
        mRegistered = true;
        MediaRouterJellybean.UserRouteInfo.setVolumeCallback(mUserRouteObj, MediaRouterJellybean.createVolumeCallback(new VolumeCallbackWrapper(this)));
        MediaRouterJellybean.UserRouteInfo.setRemoteControlClient(mUserRouteObj, mRcc);
      }
    }
    
    public static final class VolumeCallbackWrapper
      implements MediaRouterJellybean.VolumeCallback
    {
      private final WeakReference<RemoteControlClientCompat.JellybeanImpl> mImplWeak;
      
      public VolumeCallbackWrapper(RemoteControlClientCompat.JellybeanImpl paramJellybeanImpl)
      {
        mImplWeak = new WeakReference(paramJellybeanImpl);
      }
      
      public void onVolumeSetRequest(Object paramObject, int paramInt)
      {
        paramObject = (RemoteControlClientCompat.JellybeanImpl)mImplWeak.get();
        if (paramObject != null)
        {
          paramObject = mVolumeCallback;
          if (paramObject != null) {
            ((RemoteControlClientCompat.VolumeCallback)paramObject).onVolumeSetRequest(paramInt);
          }
        }
      }
      
      public void onVolumeUpdateRequest(Object paramObject, int paramInt)
      {
        paramObject = (RemoteControlClientCompat.JellybeanImpl)mImplWeak.get();
        if (paramObject != null)
        {
          paramObject = mVolumeCallback;
          if (paramObject != null) {
            ((RemoteControlClientCompat.VolumeCallback)paramObject).onVolumeUpdateRequest(paramInt);
          }
        }
      }
    }
  }
  
  public static class LegacyImpl
    extends RemoteControlClientCompat
  {
    public LegacyImpl(Context paramContext, Object paramObject)
    {
      super(paramObject);
    }
  }
  
  public static final class PlaybackInfo
  {
    public int playbackStream = 3;
    public int playbackType = 1;
    public int volume;
    @Nullable
    public String volumeControlId;
    public int volumeHandling = 0;
    public int volumeMax;
  }
  
  public static abstract interface VolumeCallback
  {
    public abstract void onVolumeSetRequest(int paramInt);
    
    public abstract void onVolumeUpdateRequest(int paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.RemoteControlClientCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */