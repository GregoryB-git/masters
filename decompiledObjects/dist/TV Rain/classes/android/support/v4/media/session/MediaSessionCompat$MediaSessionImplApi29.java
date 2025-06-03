package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.versionedparcelable.VersionedParcelable;
import e;

@RequiresApi(29)
class MediaSessionCompat$MediaSessionImplApi29
  extends MediaSessionCompat.MediaSessionImplApi28
{
  public MediaSessionCompat$MediaSessionImplApi29(Context paramContext, String paramString, VersionedParcelable paramVersionedParcelable, Bundle paramBundle)
  {
    super(paramContext, paramString, paramVersionedParcelable, paramBundle);
  }
  
  public MediaSessionCompat$MediaSessionImplApi29(Object paramObject)
  {
    super(paramObject);
    mSessionInfo = e.f(((MediaSession)paramObject).getController());
  }
  
  public MediaSession createFwkMediaSession(Context paramContext, String paramString, Bundle paramBundle)
  {
    return new MediaSession(paramContext, paramString, paramBundle);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi29
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */