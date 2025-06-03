package androidx.media;

import android.media.session.MediaSessionManager.RemoteUserInfo;
import androidx.annotation.RequiresApi;

@RequiresApi(28)
final class MediaSessionManagerImplApi28$RemoteUserInfoImplApi28
  extends MediaSessionManagerImplBase.RemoteUserInfoImplBase
{
  public final MediaSessionManager.RemoteUserInfo mObject;
  
  public MediaSessionManagerImplApi28$RemoteUserInfoImplApi28(MediaSessionManager.RemoteUserInfo paramRemoteUserInfo)
  {
    super(paramRemoteUserInfo.getPackageName(), paramRemoteUserInfo.getPid(), paramRemoteUserInfo.getUid());
    mObject = paramRemoteUserInfo;
  }
  
  public MediaSessionManagerImplApi28$RemoteUserInfoImplApi28(String paramString, int paramInt1, int paramInt2)
  {
    super(paramString, paramInt1, paramInt2);
    mObject = new MediaSessionManager.RemoteUserInfo(paramString, paramInt1, paramInt2);
  }
  
  public static String getPackageName(MediaSessionManager.RemoteUserInfo paramRemoteUserInfo)
  {
    return paramRemoteUserInfo.getPackageName();
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaSessionManagerImplApi28.RemoteUserInfoImplApi28
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */