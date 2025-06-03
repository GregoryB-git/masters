package android.support.v4.media;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;

public class MediaBrowserCompat$h
{
  public Messenger a;
  public Bundle b;
  
  public MediaBrowserCompat$h(IBinder paramIBinder, Bundle paramBundle)
  {
    a = new Messenger(paramIBinder);
    b = paramBundle;
  }
  
  public void a(Context paramContext, Messenger paramMessenger)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("data_package_name", paramContext.getPackageName());
    localBundle.putInt("data_calling_pid", Process.myPid());
    localBundle.putBundle("data_root_hints", b);
    b(6, localBundle, paramMessenger);
  }
  
  public final void b(int paramInt, Bundle paramBundle, Messenger paramMessenger)
  {
    Message localMessage = Message.obtain();
    what = paramInt;
    arg1 = 1;
    localMessage.setData(paramBundle);
    replyTo = paramMessenger;
    a.send(localMessage);
  }
  
  public void c(Messenger paramMessenger)
  {
    b(7, null, paramMessenger);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */