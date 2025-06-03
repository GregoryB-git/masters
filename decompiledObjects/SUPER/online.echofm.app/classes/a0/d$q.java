package a0;

import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaBrowserCompat;

public final class d$q
  extends Handler
{
  public d a;
  
  public d$q(d paramd)
  {
    a = paramd;
  }
  
  public void a(Runnable paramRunnable)
  {
    if (Thread.currentThread() == getLooper().getThread()) {
      paramRunnable.run();
    } else {
      post(paramRunnable);
    }
  }
  
  public void b()
  {
    a = null;
  }
  
  public void handleMessage(Message paramMessage)
  {
    d locald = a;
    if (locald != null) {
      locald.c(paramMessage);
    } else {
      removeCallbacksAndMessages(null);
    }
  }
  
  public boolean sendMessageAtTime(Message paramMessage, long paramLong)
  {
    Bundle localBundle = paramMessage.getData();
    localBundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
    localBundle.putInt("data_calling_uid", Binder.getCallingUid());
    int i = Binder.getCallingPid();
    if (i > 0) {}
    for (;;)
    {
      localBundle.putInt("data_calling_pid", i);
      break;
      if (localBundle.containsKey("data_calling_pid")) {
        break;
      }
      i = -1;
    }
    return super.sendMessageAtTime(paramMessage, paramLong);
  }
}

/* Location:
 * Qualified Name:     a0.d.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */