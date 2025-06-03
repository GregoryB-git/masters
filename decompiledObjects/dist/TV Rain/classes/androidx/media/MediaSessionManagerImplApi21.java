package androidx.media;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class MediaSessionManagerImplApi21
  extends MediaSessionManagerImplBase
{
  public MediaSessionManagerImplApi21(Context paramContext)
  {
    super(paramContext);
    mContext = paramContext;
  }
  
  private boolean hasMediaControlPermission(@NonNull MediaSessionManager.RemoteUserInfoImpl paramRemoteUserInfoImpl)
  {
    boolean bool;
    if (getContext().checkPermission("android.permission.MEDIA_CONTENT_CONTROL", paramRemoteUserInfoImpl.getPid(), paramRemoteUserInfoImpl.getUid()) == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isTrustedForMediaControl(@NonNull MediaSessionManager.RemoteUserInfoImpl paramRemoteUserInfoImpl)
  {
    boolean bool;
    if ((!hasMediaControlPermission(paramRemoteUserInfoImpl)) && (!super.isTrustedForMediaControl(paramRemoteUserInfoImpl))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaSessionManagerImplApi21
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */