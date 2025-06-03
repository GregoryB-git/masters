package android.support.v4.media;

import android.os.Bundle;
import android.os.Messenger;
import android.support.v4.media.session.MediaSessionCompat.Token;
import java.util.List;

public abstract interface MediaBrowserCompat$g
{
  public abstract void d(Messenger paramMessenger);
  
  public abstract void e(Messenger paramMessenger, String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle);
  
  public abstract void h(Messenger paramMessenger, String paramString, List paramList, Bundle paramBundle1, Bundle paramBundle2);
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */