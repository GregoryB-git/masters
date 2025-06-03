package androidx.media;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

public final class MediaSessionManager
{
  public static final boolean DEBUG = Log.isLoggable("MediaSessionManager", 3);
  public static final String TAG = "MediaSessionManager";
  private static final Object sLock = new Object();
  private static volatile MediaSessionManager sSessionManager;
  public MediaSessionManagerImpl mImpl;
  
  private MediaSessionManager(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      mImpl = new MediaSessionManagerImplApi28(paramContext);
    } else {
      mImpl = new MediaSessionManagerImplApi21(paramContext);
    }
  }
  
  @NonNull
  public static MediaSessionManager getSessionManager(@NonNull Context paramContext)
  {
    if (paramContext != null) {
      synchronized (sLock)
      {
        if (sSessionManager == null)
        {
          MediaSessionManager localMediaSessionManager = new androidx/media/MediaSessionManager;
          localMediaSessionManager.<init>(paramContext.getApplicationContext());
          sSessionManager = localMediaSessionManager;
        }
        paramContext = sSessionManager;
        return paramContext;
      }
    }
    throw new IllegalArgumentException("context cannot be null");
  }
  
  public Context getContext()
  {
    return mImpl.getContext();
  }
  
  public boolean isTrustedForMediaControl(@NonNull RemoteUserInfo paramRemoteUserInfo)
  {
    if (paramRemoteUserInfo != null) {
      return mImpl.isTrustedForMediaControl(mImpl);
    }
    throw new IllegalArgumentException("userInfo should not be null");
  }
  
  public static abstract interface MediaSessionManagerImpl
  {
    public abstract Context getContext();
    
    public abstract boolean isTrustedForMediaControl(MediaSessionManager.RemoteUserInfoImpl paramRemoteUserInfoImpl);
  }
  
  public static final class RemoteUserInfo
  {
    public static final String LEGACY_CONTROLLER = "android.media.session.MediaController";
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int UNKNOWN_PID = -1;
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int UNKNOWN_UID = -1;
    public MediaSessionManager.RemoteUserInfoImpl mImpl;
    
    @RequiresApi(28)
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public RemoteUserInfo(android.media.session.MediaSessionManager.RemoteUserInfo paramRemoteUserInfo)
    {
      String str = MediaSessionManagerImplApi28.RemoteUserInfoImplApi28.getPackageName(paramRemoteUserInfo);
      if (str != null)
      {
        if (!TextUtils.isEmpty(str))
        {
          mImpl = new MediaSessionManagerImplApi28.RemoteUserInfoImplApi28(paramRemoteUserInfo);
          return;
        }
        throw new IllegalArgumentException("packageName should be nonempty");
      }
      throw new NullPointerException("package shouldn't be null");
    }
    
    public RemoteUserInfo(@NonNull String paramString, int paramInt1, int paramInt2)
    {
      if (paramString != null)
      {
        if (!TextUtils.isEmpty(paramString))
        {
          if (Build.VERSION.SDK_INT >= 28) {
            mImpl = new MediaSessionManagerImplApi28.RemoteUserInfoImplApi28(paramString, paramInt1, paramInt2);
          } else {
            mImpl = new MediaSessionManagerImplBase.RemoteUserInfoImplBase(paramString, paramInt1, paramInt2);
          }
          return;
        }
        throw new IllegalArgumentException("packageName should be nonempty");
      }
      throw new NullPointerException("package shouldn't be null");
    }
    
    public boolean equals(@Nullable Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof RemoteUserInfo)) {
        return false;
      }
      return mImpl.equals(mImpl);
    }
    
    @NonNull
    public String getPackageName()
    {
      return mImpl.getPackageName();
    }
    
    public int getPid()
    {
      return mImpl.getPid();
    }
    
    public int getUid()
    {
      return mImpl.getUid();
    }
    
    public int hashCode()
    {
      return mImpl.hashCode();
    }
  }
  
  public static abstract interface RemoteUserInfoImpl
  {
    public abstract String getPackageName();
    
    public abstract int getPid();
    
    public abstract int getUid();
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaSessionManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */