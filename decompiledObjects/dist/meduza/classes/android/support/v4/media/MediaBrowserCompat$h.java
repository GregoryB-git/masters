package android.support.v4.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;

public final class MediaBrowserCompat$h
{
  public Messenger a;
  public Bundle b;
  
  public MediaBrowserCompat$h(IBinder paramIBinder, Bundle paramBundle)
  {
    a = new Messenger(paramIBinder);
    b = paramBundle;
  }
  
  public final void a(int paramInt, Bundle paramBundle, Messenger paramMessenger)
  {
    Message localMessage = Message.obtain();
    what = paramInt;
    arg1 = 1;
    localMessage.setData(paramBundle);
    replyTo = paramMessenger;
    a.send(localMessage);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */