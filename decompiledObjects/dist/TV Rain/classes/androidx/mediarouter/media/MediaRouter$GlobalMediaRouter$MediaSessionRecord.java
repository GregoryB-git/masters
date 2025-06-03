package androidx.mediarouter.media;

import android.os.Handler;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import androidx.annotation.Nullable;
import androidx.media.VolumeProviderCompat;

final class MediaRouter$GlobalMediaRouter$MediaSessionRecord
{
  private int mControlType;
  private int mMaxVolume;
  private final MediaSessionCompat mMsCompat;
  private VolumeProviderCompat mVpCompat;
  
  public MediaRouter$GlobalMediaRouter$MediaSessionRecord(MediaRouter.GlobalMediaRouter paramGlobalMediaRouter, MediaSessionCompat paramMediaSessionCompat)
  {
    mMsCompat = paramMediaSessionCompat;
  }
  
  public MediaRouter$GlobalMediaRouter$MediaSessionRecord(MediaRouter.GlobalMediaRouter paramGlobalMediaRouter, Object paramObject)
  {
    this(paramGlobalMediaRouter, MediaSessionCompat.fromMediaSession(mApplicationContext, paramObject));
  }
  
  public void clearVolumeHandling()
  {
    MediaSessionCompat localMediaSessionCompat = mMsCompat;
    if (localMediaSessionCompat != null)
    {
      localMediaSessionCompat.setPlaybackToLocal(this$0.mPlaybackInfo.playbackStream);
      mVpCompat = null;
    }
  }
  
  public void configureVolume(int paramInt1, int paramInt2, int paramInt3, @Nullable String paramString)
  {
    if (mMsCompat != null)
    {
      VolumeProviderCompat localVolumeProviderCompat = mVpCompat;
      if ((localVolumeProviderCompat != null) && (paramInt1 == mControlType) && (paramInt2 == mMaxVolume))
      {
        localVolumeProviderCompat.setCurrentVolume(paramInt3);
      }
      else
      {
        paramString = new VolumeProviderCompat(paramInt1, paramInt2, paramInt3, paramString)
        {
          public void onAdjustVolume(final int paramAnonymousInt)
          {
            this$0.mCallbackHandler.post(new Runnable()
            {
              public void run()
              {
                MediaRouter.RouteInfo localRouteInfo = this$0.mSelectedRoute;
                if (localRouteInfo != null) {
                  localRouteInfo.requestUpdateVolume(paramAnonymousInt);
                }
              }
            });
          }
          
          public void onSetVolumeTo(final int paramAnonymousInt)
          {
            this$0.mCallbackHandler.post(new Runnable()
            {
              public void run()
              {
                MediaRouter.RouteInfo localRouteInfo = this$0.mSelectedRoute;
                if (localRouteInfo != null) {
                  localRouteInfo.requestSetVolume(paramAnonymousInt);
                }
              }
            });
          }
        };
        mVpCompat = paramString;
        mMsCompat.setPlaybackToRemote(paramString);
      }
    }
  }
  
  public MediaSessionCompat.Token getToken()
  {
    MediaSessionCompat localMediaSessionCompat = mMsCompat;
    if (localMediaSessionCompat != null) {
      return localMediaSessionCompat.getSessionToken();
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouter.GlobalMediaRouter.MediaSessionRecord
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */