package android.support.v4.media.session;

import a3;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.media.MediaSessionManager.RemoteUserInfo;
import androidx.versionedparcelable.VersionedParcelable;

@RequiresApi(28)
class MediaSessionCompat$MediaSessionImplApi28
  extends MediaSessionCompat.MediaSessionImplApi22
{
  public MediaSessionCompat$MediaSessionImplApi28(Context paramContext, String paramString, VersionedParcelable paramVersionedParcelable, Bundle paramBundle)
  {
    super(paramContext, paramString, paramVersionedParcelable, paramBundle);
  }
  
  public MediaSessionCompat$MediaSessionImplApi28(Object paramObject)
  {
    super(paramObject);
  }
  
  @NonNull
  public final MediaSessionManager.RemoteUserInfo getCurrentControllerInfo()
  {
    return new MediaSessionManager.RemoteUserInfo(a3.h(mSessionFwk));
  }
  
  public void setCurrentControllerInfo(MediaSessionManager.RemoteUserInfo paramRemoteUserInfo) {}
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi28
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */