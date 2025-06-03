package android.support.v4.media.session;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import e;

@RequiresApi(29)
class MediaControllerCompat$MediaControllerImplApi29
  extends MediaControllerCompat.MediaControllerImplApi21
{
  public MediaControllerCompat$MediaControllerImplApi29(Context paramContext, MediaSessionCompat.Token paramToken)
  {
    super(paramContext, paramToken);
  }
  
  public Bundle getSessionInfo()
  {
    if (mSessionInfo != null) {
      return new Bundle(mSessionInfo);
    }
    Bundle localBundle = e.f(mControllerFwk);
    mSessionInfo = localBundle;
    localBundle = MediaSessionCompat.unparcelWithClassLoader(localBundle);
    mSessionInfo = localBundle;
    if (localBundle == null) {
      localBundle = Bundle.EMPTY;
    } else {
      localBundle = new Bundle(mSessionInfo);
    }
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi29
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */