package O1;

import T1.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import kotlin.jvm.internal.Intrinsics;

public abstract class F
  implements ServiceConnection
{
  public final Context a;
  public final Handler b;
  public b c;
  public boolean d;
  public Messenger e;
  public final int f;
  public final int g;
  public final String h;
  public final int i;
  public final String j;
  
  public F(Context paramContext, int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2)
  {
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null) {
      paramContext = localContext;
    }
    a = paramContext;
    f = paramInt1;
    g = paramInt2;
    h = paramString1;
    i = paramInt3;
    j = paramString2;
    b = new a(this);
  }
  
  public final void a(Bundle paramBundle)
  {
    if (!d) {
      return;
    }
    d = false;
    b localb = c;
    if (localb != null) {
      localb.a(paramBundle);
    }
  }
  
  public final void b()
  {
    d = false;
  }
  
  public final Context c()
  {
    return a;
  }
  
  public final void d(Message paramMessage)
  {
    Intrinsics.checkNotNullParameter(paramMessage, "message");
    if (what == g)
    {
      Bundle localBundle = paramMessage.getData();
      paramMessage = localBundle;
      if (localBundle.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
        paramMessage = null;
      }
      a(paramMessage);
    }
    try
    {
      a.unbindService(this);
      return;
    }
    catch (IllegalArgumentException paramMessage)
    {
      for (;;) {}
    }
  }
  
  public abstract void e(Bundle paramBundle);
  
  public final void f()
  {
    Object localObject1 = new Bundle();
    ((BaseBundle)localObject1).putString("com.facebook.platform.extra.APPLICATION_ID", h);
    Object localObject2 = j;
    if (localObject2 != null) {
      ((BaseBundle)localObject1).putString("com.facebook.platform.extra.NONCE", (String)localObject2);
    }
    e((Bundle)localObject1);
    localObject2 = Message.obtain(null, f);
    arg1 = i;
    ((Message)localObject2).setData((Bundle)localObject1);
    replyTo = new Messenger(b);
    try
    {
      localObject1 = e;
      if (localObject1 != null) {
        ((Messenger)localObject1).send((Message)localObject2);
      }
    }
    catch (RemoteException localRemoteException)
    {
      a(null);
    }
  }
  
  public final void g(b paramb)
  {
    c = paramb;
  }
  
  public final boolean h()
  {
    try
    {
      boolean bool1 = d;
      boolean bool2 = false;
      if (bool1) {
        return false;
      }
      Object localObject1 = E.a;
      int k = E.s(i);
      if (k == -1) {
        return false;
      }
      localObject1 = E.l(c());
      if (localObject1 != null)
      {
        bool2 = true;
        d = true;
        c().bindService((Intent)localObject1, this, 1);
      }
      return bool2;
    }
    finally {}
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    Intrinsics.checkNotNullParameter(paramComponentName, "name");
    Intrinsics.checkNotNullParameter(paramIBinder, "service");
    e = new Messenger(paramIBinder);
    f();
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    Intrinsics.checkNotNullParameter(paramComponentName, "name");
    e = null;
    try
    {
      a.unbindService(this);
      a(null);
      return;
    }
    catch (IllegalArgumentException paramComponentName)
    {
      for (;;) {}
    }
  }
  
  public static final class a
    extends Handler
  {
    public a(F paramF) {}
    
    public void handleMessage(Message paramMessage)
    {
      if (a.d(this)) {
        return;
      }
      try
      {
        Intrinsics.checkNotNullParameter(paramMessage, "message");
        a.d(paramMessage);
        return;
      }
      finally
      {
        a.b(paramMessage, this);
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(Bundle paramBundle);
  }
}

/* Location:
 * Qualified Name:     O1.F
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */