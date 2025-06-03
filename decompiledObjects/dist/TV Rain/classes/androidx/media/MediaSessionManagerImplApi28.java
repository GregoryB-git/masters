package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.media.session.MediaSessionManager.RemoteUserInfo;
import androidx.annotation.RequiresApi;

@RequiresApi(28)
class MediaSessionManagerImplApi28
  extends MediaSessionManagerImplApi21
{
  public MediaSessionManager mObject;
  
  public MediaSessionManagerImplApi28(Context paramContext)
  {
    super(paramContext);
    mObject = ((MediaSessionManager)paramContext.getSystemService("media_session"));
  }
  
  public boolean isTrustedForMediaControl(MediaSessionManager.RemoteUserInfoImpl paramRemoteUserInfoImpl)
  {
    return super.isTrustedForMediaControl(paramRemoteUserInfoImpl);
  }
  
  @RequiresApi(28)
  public static final class RemoteUserInfoImplApi28
    extends MediaSessionManagerImplBase.RemoteUserInfoImplBase
  {
    public final MediaSessionManager.RemoteUserInfo mObject;
    
    public RemoteUserInfoImplApi28(MediaSessionManager.RemoteUserInfo paramRemoteUserInfo)
    {
      super(paramRemoteUserInfo.getPid(), paramRemoteUserInfo.getUid());
      mObject = paramRemoteUserInfo;
    }
    
    public RemoteUserInfoImplApi28(String paramString, int paramInt1, int paramInt2)
    {
      super(paramInt1, paramInt2);
      mObject = new MediaSessionManager.RemoteUserInfo(paramString, paramInt1, paramInt2);
    }
    
    public static String getPackageName(MediaSessionManager.RemoteUserInfo paramRemoteUserInfo)
    {
      return paramRemoteUserInfo.getPackageName();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaSessionManagerImplApi28
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */