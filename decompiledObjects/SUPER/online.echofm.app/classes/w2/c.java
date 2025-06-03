package w2;

import L2.a;
import V2.j;
import V2.k;
import V2.m;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class c
{
  public static int h;
  public static PendingIntent i;
  public static final Executor j = D.o;
  public static final Pattern k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
  public final t.h a = new t.h();
  public final Context b;
  public final x c;
  public final ScheduledExecutorService d;
  public Messenger e;
  public Messenger f;
  public h g;
  
  public c(Context paramContext)
  {
    b = paramContext;
    c = new x(paramContext);
    e = new Messenger(new e(this, Looper.getMainLooper()));
    paramContext = new ScheduledThreadPoolExecutor(1);
    paramContext.setKeepAliveTime(60L, TimeUnit.SECONDS);
    paramContext.allowCoreThreadTimeOut(true);
    d = paramContext;
  }
  
  public static String g()
  {
    try
    {
      int m = h;
      h = m + 1;
      String str = Integer.toString(m);
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static void h(Context paramContext, Intent paramIntent)
  {
    try
    {
      if (i == null)
      {
        Intent localIntent = new android/content/Intent;
        localIntent.<init>();
        localIntent.setPackage("com.google.example.invalidpackage");
        i = a.a(paramContext, 0, localIntent, a.a);
      }
    }
    finally
    {
      break label59;
    }
    paramIntent.putExtra("app", i);
    return;
    label59:
    throw paramContext;
  }
  
  public static boolean j(Bundle paramBundle)
  {
    return (paramBundle != null) && (paramBundle.containsKey("google.messenger"));
  }
  
  public j a(Bundle paramBundle)
  {
    if (c.a() < 12000000)
    {
      if (c.b() != 0) {
        paramBundle = f(paramBundle).h(j, new y(this, paramBundle));
      } else {
        paramBundle = m.d(new IOException("MISSING_INSTANCEID_SERVICE"));
      }
      return paramBundle;
    }
    return w.b(b).d(1, paramBundle).g(j, z.a);
  }
  
  public final j f(Bundle paramBundle)
  {
    String str = g();
    k localk = new k();
    synchronized (a)
    {
      a.put(str, localk);
      Intent localIntent = new Intent();
      localIntent.setPackage("com.google.android.gms");
      if (c.b() == 2) {}
      for (??? = "com.google.iid.TOKEN_REQUEST";; ??? = "com.google.android.c2dm.intent.REGISTER")
      {
        localIntent.setAction((String)???);
        break;
      }
      localIntent.putExtras(paramBundle);
      h(b, localIntent);
      paramBundle = new StringBuilder(String.valueOf(str).length() + 5);
      paramBundle.append("|ID|");
      paramBundle.append(str);
      paramBundle.append("|");
      localIntent.putExtra("kid", paramBundle.toString());
      if (Log.isLoggable("Rpc", 3))
      {
        ??? = String.valueOf(localIntent.getExtras());
        paramBundle = new StringBuilder(((String)???).length() + 8);
        paramBundle.append("Sending ");
        paramBundle.append((String)???);
        Log.d("Rpc", paramBundle.toString());
      }
      localIntent.putExtra("google.messenger", e);
      if ((f != null) || (g != null))
      {
        paramBundle = Message.obtain();
        obj = localIntent;
        try
        {
          ??? = f;
          if (??? != null) {
            ((Messenger)???).send(paramBundle);
          } else {
            g.b(paramBundle);
          }
        }
        catch (RemoteException paramBundle)
        {
          if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Messenger failed, fallback to startService");
          }
        }
      }
      if (c.b() == 2) {
        b.sendBroadcast(localIntent);
      } else {
        b.startService(localIntent);
      }
      paramBundle = d.schedule(new C(localk), 30L, TimeUnit.SECONDS);
      localk.a().c(j, new A(this, str, paramBundle));
      return localk.a();
    }
  }
  
  public final void i(String paramString, Bundle paramBundle)
  {
    k localk;
    synchronized (a)
    {
      localk = (k)a.remove(paramString);
      if (localk != null) {
        break label73;
      }
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "Missing callback for ".concat(paramString);
      }
    }
    paramString = new String("Missing callback for ");
    Log.w("Rpc", paramString);
    return;
    label73:
    localk.c(paramBundle);
  }
}

/* Location:
 * Qualified Name:     w2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */