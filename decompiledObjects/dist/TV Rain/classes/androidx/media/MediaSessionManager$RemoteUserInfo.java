package androidx.media;

import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

public final class MediaSessionManager$RemoteUserInfo
{
  public static final String LEGACY_CONTROLLER = "android.media.session.MediaController";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static final int UNKNOWN_PID = -1;
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static final int UNKNOWN_UID = -1;
  public MediaSessionManager.RemoteUserInfoImpl mImpl;
  
  @RequiresApi(28)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public MediaSessionManager$RemoteUserInfo(android.media.session.MediaSessionManager.RemoteUserInfo paramRemoteUserInfo)
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
  
  public MediaSessionManager$RemoteUserInfo(@NonNull String paramString, int paramInt1, int paramInt2)
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

/* Location:
 * Qualified Name:     androidx.media.MediaSessionManager.RemoteUserInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */