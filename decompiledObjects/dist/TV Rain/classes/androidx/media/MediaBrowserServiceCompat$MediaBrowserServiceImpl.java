package androidx.media;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat.Token;

abstract interface MediaBrowserServiceCompat$MediaBrowserServiceImpl
{
  public abstract Bundle getBrowserRootHints();
  
  public abstract MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo();
  
  public abstract void notifyChildrenChanged(MediaSessionManager.RemoteUserInfo paramRemoteUserInfo, String paramString, Bundle paramBundle);
  
  public abstract void notifyChildrenChanged(String paramString, Bundle paramBundle);
  
  public abstract IBinder onBind(Intent paramIntent);
  
  public abstract void onCreate();
  
  public abstract void setSessionToken(MediaSessionCompat.Token paramToken);
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */