package a0;

import android.media.session.MediaSessionManager.RemoteUserInfo;

public final class l
  extends m
{
  public final MediaSessionManager.RemoteUserInfo d;
  
  public l(MediaSessionManager.RemoteUserInfo paramRemoteUserInfo)
  {
    super(i.a(paramRemoteUserInfo), j.a(paramRemoteUserInfo), k.a(paramRemoteUserInfo));
    d = paramRemoteUserInfo;
  }
  
  public l(String paramString, int paramInt1, int paramInt2)
  {
    super(paramString, paramInt1, paramInt2);
    d = h.a(paramString, paramInt1, paramInt2);
  }
  
  public static String a(MediaSessionManager.RemoteUserInfo paramRemoteUserInfo)
  {
    return i.a(paramRemoteUserInfo);
  }
}

/* Location:
 * Qualified Name:     a0.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */