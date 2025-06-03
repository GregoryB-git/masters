package androidx.work.impl.background.systemalarm;

import android.app.Service;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import o2.j;
import rb.h;
import y2.v;
import y2.w;

public class SystemAlarmService
  extends b1.r
  implements d.c
{
  public static final String d = j.f("SystemAlarmService");
  public d b;
  public boolean c;
  
  public final void a()
  {
    c = true;
    j.d().a(d, "All commands completed in dispatcher");
    ??? = v.a;
    Object localObject2 = new LinkedHashMap();
    synchronized (w.a)
    {
      ((Map)localObject2).putAll(w.b);
      Object localObject3 = h.a;
      ??? = ((LinkedHashMap)localObject2).entrySet().iterator();
      while (((Iterator)???).hasNext())
      {
        localObject3 = (Map.Entry)((Iterator)???).next();
        localObject2 = (PowerManager.WakeLock)((Map.Entry)localObject3).getKey();
        localObject3 = (String)((Map.Entry)localObject3).getValue();
        int i = 0;
        int j = i;
        if (localObject2 != null)
        {
          j = i;
          if (((PowerManager.WakeLock)localObject2).isHeld() == true) {
            j = 1;
          }
        }
        if (j != 0)
        {
          localObject2 = j.d();
          String str = v.a;
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("WakeLock held for ");
          localStringBuilder.append((String)localObject3);
          ((j)localObject2).g(str, localStringBuilder.toString());
        }
      }
      stopSelf();
      return;
    }
  }
  
  public final void onCreate()
  {
    super.onCreate();
    d locald = new d(this);
    b = locald;
    if (q != null) {
      j.d().b(d.t, "A completion listener for SystemAlarmDispatcher already exists.");
    } else {
      q = this;
    }
    c = false;
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    c = true;
    d locald = b;
    locald.getClass();
    j.d().a(d.t, "Destroying SystemAlarmDispatcher");
    p2.r localr = d;
    synchronized (k)
    {
      j.remove(locald);
      q = null;
      return;
    }
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    super.onStartCommand(paramIntent, paramInt1, paramInt2);
    if (c)
    {
      j.d().e(d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
      d locald = b;
      locald.getClass();
      ??? = j.d();
      String str = d.t;
      ((j)???).a(str, "Destroying SystemAlarmDispatcher");
      p2.r localr = d;
      synchronized (k)
      {
        j.remove(locald);
        q = null;
        ??? = new d(this);
        b = ((d)???);
        if (q != null) {
          j.d().b(str, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
          q = this;
        }
        c = false;
      }
    }
    if (paramIntent != null) {
      b.b(paramInt2, paramIntent);
    }
    return 3;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemalarm.SystemAlarmService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */