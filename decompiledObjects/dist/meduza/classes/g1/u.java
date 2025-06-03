package g1;

import android.media.session.MediaSessionManager.RemoteUserInfo;

public final class u
  extends v
{
  public u(MediaSessionManager.RemoteUserInfo paramRemoteUserInfo)
  {
    super(paramRemoteUserInfo.getPackageName(), paramRemoteUserInfo.getPid(), paramRemoteUserInfo.getUid());
  }
  
  public u(String paramString, int paramInt1, int paramInt2)
  {
    super(paramString, paramInt1, paramInt2);
    new MediaSessionManager.RemoteUserInfo(paramString, paramInt1, paramInt2);
  }
  
  public static String a(MediaSessionManager.RemoteUserInfo paramRemoteUserInfo)
  {
    return paramRemoteUserInfo.getPackageName();
  }
}

/* Location:
 * Qualified Name:     g1.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */