package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.versionedparcelable.VersionedParcelable;

@RequiresApi(22)
class MediaSessionCompat$MediaSessionImplApi22
  extends MediaSessionCompat.MediaSessionImplApi21
{
  public MediaSessionCompat$MediaSessionImplApi22(Context paramContext, String paramString, VersionedParcelable paramVersionedParcelable, Bundle paramBundle)
  {
    super(paramContext, paramString, paramVersionedParcelable, paramBundle);
  }
  
  public MediaSessionCompat$MediaSessionImplApi22(Object paramObject)
  {
    super(paramObject);
  }
  
  public void setRatingType(int paramInt)
  {
    mSessionFwk.setRatingType(paramInt);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi22
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */