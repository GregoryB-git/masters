package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import b.a0;
import ec.i;
import f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import nc.j1;
import o2.j;
import p2.k0;
import p2.r;
import p2.x;
import t2.b.b;
import t2.e;
import x2.l;
import x2.s;
import y2.t;

public final class a
  implements t2.d, p2.d
{
  public static final String r = j.f("SystemFgDispatcher");
  public k0 a;
  public final a3.b b;
  public final Object c = new Object();
  public l d;
  public final LinkedHashMap e;
  public final HashMap f;
  public final HashMap o;
  public final e p;
  public a q;
  
  public a(Context paramContext)
  {
    paramContext = k0.d(paramContext);
    a = paramContext;
    b = d;
    d = null;
    e = new LinkedHashMap();
    o = new HashMap();
    f = new HashMap();
    p = new e(a.j);
    a.f.a(this);
  }
  
  public static Intent b(Context paramContext, l paraml, o2.d paramd)
  {
    paramContext = new Intent(paramContext, SystemForegroundService.class);
    paramContext.setAction("ACTION_NOTIFY");
    paramContext.putExtra("KEY_NOTIFICATION_ID", a);
    paramContext.putExtra("KEY_FOREGROUND_SERVICE_TYPE", b);
    paramContext.putExtra("KEY_NOTIFICATION", c);
    paramContext.putExtra("KEY_WORKSPEC_ID", a);
    paramContext.putExtra("KEY_GENERATION", b);
    return paramContext;
  }
  
  public static Intent c(Context paramContext, l paraml, o2.d paramd)
  {
    paramContext = new Intent(paramContext, SystemForegroundService.class);
    paramContext.setAction("ACTION_START_FOREGROUND");
    paramContext.putExtra("KEY_WORKSPEC_ID", a);
    paramContext.putExtra("KEY_GENERATION", b);
    paramContext.putExtra("KEY_NOTIFICATION_ID", a);
    paramContext.putExtra("KEY_FOREGROUND_SERVICE_TYPE", b);
    paramContext.putExtra("KEY_NOTIFICATION", c);
    return paramContext;
  }
  
  public final void a(l paraml, boolean paramBoolean)
  {
    synchronized (c)
    {
      if ((s)f.remove(paraml) != null) {
        localObject2 = (j1)o.remove(paraml);
      } else {
        localObject2 = null;
      }
      if (localObject2 != null) {
        ((j1)localObject2).cancel(null);
      }
      Object localObject2 = (o2.d)e.remove(paraml);
      Object localObject3;
      int j;
      if (paraml.equals(d)) {
        if (e.size() > 0)
        {
          localObject3 = e.entrySet().iterator();
          do
          {
            ??? = (Map.Entry)((Iterator)localObject3).next();
          } while (((Iterator)localObject3).hasNext());
          d = ((l)((Map.Entry)???).getKey());
          if (q != null)
          {
            ??? = (o2.d)((Map.Entry)???).getValue();
            localObject4 = q;
            int i = a;
            j = b;
            localObject3 = c;
            localObject4 = (SystemForegroundService)localObject4;
            b.post(new b((SystemForegroundService)localObject4, i, (Notification)localObject3, j));
            localObject3 = q;
            j = a;
            ??? = (SystemForegroundService)localObject3;
            b.post(new w2.d((SystemForegroundService)???, j));
          }
        }
        else
        {
          d = null;
        }
      }
      Object localObject4 = q;
      if ((localObject2 != null) && (localObject4 != null))
      {
        ??? = j.d();
        String str = r;
        localObject3 = f.l("Removing Notification (id: ");
        ((StringBuilder)localObject3).append(a);
        ((StringBuilder)localObject3).append(", workSpecId: ");
        ((StringBuilder)localObject3).append(paraml);
        ((StringBuilder)localObject3).append(", notificationType: ");
        ((StringBuilder)localObject3).append(b);
        ((j)???).a(str, ((StringBuilder)localObject3).toString());
        j = a;
        paraml = (SystemForegroundService)localObject4;
        b.post(new w2.d(paraml, j));
      }
      return;
    }
  }
  
  public final void d(s params, t2.b paramb)
  {
    if ((paramb instanceof b.b))
    {
      String str = a;
      j localj = j.d();
      Object localObject = r;
      paramb = new StringBuilder();
      paramb.append("Constraints unmet for WorkSpec ");
      paramb.append(str);
      localj.a((String)localObject, paramb.toString());
      localObject = a;
      paramb = a0.s(params);
      params = d;
      localObject = f;
      paramb = new x(paramb);
      i.e(localObject, "processor");
      params.d(new t((r)localObject, paramb, true, 65024));
    }
  }
  
  public final void e()
  {
    q = null;
    synchronized (c)
    {
      Object localObject2 = o.values().iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((j1)((Iterator)localObject2).next()).cancel(null);
      }
      localObject2 = a.f;
      synchronized (k)
      {
        j.remove(this);
        return;
      }
    }
  }
  
  public static abstract interface a {}
}

/* Location:
 * Qualified Name:     androidx.work.impl.foreground.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */