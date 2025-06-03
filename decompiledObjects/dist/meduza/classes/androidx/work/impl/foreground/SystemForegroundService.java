package androidx.work.impl.foreground;

import aa.u;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import b1.r;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import o2.d;
import o2.j;
import o2.j.a;
import p2.k0;
import w2.c;
import x2.l;

public class SystemForegroundService
  extends r
  implements a.a
{
  public static final String f = j.f("SystemFgService");
  public Handler b;
  public boolean c;
  public a d;
  public NotificationManager e;
  
  public final void a()
  {
    b = new Handler(Looper.getMainLooper());
    e = ((NotificationManager)getApplicationContext().getSystemService("notification"));
    a locala = new a(getApplicationContext());
    d = locala;
    if (q != null) {
      j.d().b(a.r, "A callback already exists.");
    } else {
      q = this;
    }
  }
  
  public final void onCreate()
  {
    super.onCreate();
    a();
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    d.e();
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    super.onStartCommand(paramIntent, paramInt1, paramInt2);
    boolean bool = c;
    paramInt1 = 0;
    if (bool)
    {
      j.d().e(f, "Re-initializing SystemForegroundService after a request to shut-down.");
      d.e();
      a();
      c = false;
    }
    if (paramIntent != null)
    {
      Object localObject1 = d;
      localObject1.getClass();
      Object localObject2 = paramIntent.getAction();
      if ("ACTION_START_FOREGROUND".equals(localObject2))
      {
        localObject2 = j.d();
        localObject3 = a.r;
        localObject4 = new StringBuilder();
        ((StringBuilder)localObject4).append("Started foreground service ");
        ((StringBuilder)localObject4).append(paramIntent);
        ((j)localObject2).e((String)localObject3, ((StringBuilder)localObject4).toString());
        localObject2 = paramIntent.getStringExtra("KEY_WORKSPEC_ID");
        b.d(new w2.b((a)localObject1, (String)localObject2));
      }
      else
      {
        if (!"ACTION_NOTIFY".equals(localObject2)) {
          break label558;
        }
      }
      int i = paramIntent.getIntExtra("KEY_NOTIFICATION_ID", 0);
      paramInt2 = paramIntent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
      Object localObject3 = paramIntent.getStringExtra("KEY_WORKSPEC_ID");
      localObject2 = new l((String)localObject3, paramIntent.getIntExtra("KEY_GENERATION", 0));
      paramIntent = (Notification)paramIntent.getParcelableExtra("KEY_NOTIFICATION");
      Object localObject4 = j.d();
      String str = a.r;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Notifying with (id:");
      localStringBuilder.append(i);
      localStringBuilder.append(", workSpecId: ");
      localStringBuilder.append((String)localObject3);
      localStringBuilder.append(", notificationType :");
      localStringBuilder.append(paramInt2);
      localStringBuilder.append(")");
      ((j)localObject4).a(str, localStringBuilder.toString());
      if ((paramIntent != null) && (q != null))
      {
        localObject3 = new d(i, paramInt2, paramIntent);
        e.put(localObject2, localObject3);
        if (d == null)
        {
          d = ((l)localObject2);
          localObject1 = (SystemForegroundService)q;
          b.post(new b((SystemForegroundService)localObject1, i, paramIntent, paramInt2));
        }
        else
        {
          localObject2 = (SystemForegroundService)q;
          b.post(new c((SystemForegroundService)localObject2, i, paramIntent));
          if ((paramInt2 != 0) && (Build.VERSION.SDK_INT >= 29))
          {
            paramIntent = e.entrySet().iterator();
            while (paramIntent.hasNext()) {
              paramInt1 |= nextgetValueb;
            }
            paramIntent = (d)e.get(d);
            if (paramIntent != null)
            {
              localObject1 = q;
              paramInt2 = a;
              paramIntent = c;
              localObject1 = (SystemForegroundService)localObject1;
              b.post(new b((SystemForegroundService)localObject1, paramInt2, paramIntent, paramInt1));
              break label722;
              label558:
              if ("ACTION_CANCEL_WORK".equals(localObject2))
              {
                localObject3 = j.d();
                localObject4 = a.r;
                localObject2 = new StringBuilder();
                ((StringBuilder)localObject2).append("Stopping foreground work for ");
                ((StringBuilder)localObject2).append(paramIntent);
                ((j)localObject3).e((String)localObject4, ((StringBuilder)localObject2).toString());
                paramIntent = paramIntent.getStringExtra("KEY_WORKSPEC_ID");
                if ((paramIntent != null) && (!TextUtils.isEmpty(paramIntent))) {
                  a.c(UUID.fromString(paramIntent));
                }
              }
              else if ("ACTION_STOP_FOREGROUND".equals(localObject2))
              {
                j.d().e(a.r, "Stopping foreground service");
                paramIntent = q;
                if (paramIntent != null)
                {
                  paramIntent = (SystemForegroundService)paramIntent;
                  c = true;
                  j.d().a(f, "All commands completed.");
                  if (Build.VERSION.SDK_INT >= 26) {
                    paramIntent.stopForeground(true);
                  }
                  paramIntent.stopSelf();
                }
              }
            }
          }
        }
      }
    }
    label722:
    return 3;
  }
  
  public static final class a
  {
    public static void a(Service paramService, int paramInt1, Notification paramNotification, int paramInt2)
    {
      u.h(paramService, paramInt1, paramNotification, paramInt2);
    }
  }
  
  public static final class b
  {
    public static void a(Service paramService, int paramInt1, Notification paramNotification, int paramInt2)
    {
      try
      {
        paramService.startForeground(paramInt1, paramNotification, paramInt2);
      }
      catch (ForegroundServiceStartNotAllowedException localForegroundServiceStartNotAllowedException)
      {
        paramNotification = j.d();
        paramService = SystemForegroundService.f;
        if (c <= 5) {
          Log.w(paramService, "Unable to start foreground service", localForegroundServiceStartNotAllowedException);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.foreground.SystemForegroundService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */