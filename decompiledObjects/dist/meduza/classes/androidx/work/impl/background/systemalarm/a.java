package androidx.work.impl.background.systemalarm;

import a3.c.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import androidx.work.impl.WorkDatabase;
import b.a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o2.o.b;
import p2.h0;
import p2.k0;
import p2.m0;
import p2.x;
import t2.e;
import x2.i;
import x2.s;
import x2.t;

public final class a
  implements p2.d
{
  public static final String f = o2.j.f("CommandHandler");
  public final Context a;
  public final HashMap b;
  public final Object c;
  public final o2.a d;
  public final l.l e;
  
  public a(Context paramContext, m0 paramm0, l.l paraml)
  {
    a = paramContext;
    d = paramm0;
    e = paraml;
    b = new HashMap();
    c = new Object();
  }
  
  public static x2.l c(Intent paramIntent)
  {
    return new x2.l(paramIntent.getStringExtra("KEY_WORKSPEC_ID"), paramIntent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
  }
  
  public static void d(Intent paramIntent, x2.l paraml)
  {
    paramIntent.putExtra("KEY_WORKSPEC_ID", a);
    paramIntent.putExtra("KEY_WORKSPEC_GENERATION", b);
  }
  
  public final void a(x2.l paraml, boolean paramBoolean)
  {
    synchronized (c)
    {
      c localc = (c)b.remove(paraml);
      e.f(paraml);
      if (localc != null) {
        localc.g(paramBoolean);
      }
      return;
    }
  }
  
  public final void b(int paramInt, Intent paramIntent, d paramd)
  {
    ??? = paramIntent.getAction();
    Object localObject2;
    Object localObject3;
    long l;
    Object localObject4;
    Object localObject5;
    if ("ACTION_CONSTRAINTS_CHANGED".equals(???))
    {
      localObject2 = o2.j.d();
      localObject3 = f;
      ??? = new StringBuilder();
      ((StringBuilder)???).append("Handling constraints changed ");
      ((StringBuilder)???).append(paramIntent);
      ((o2.j)localObject2).a((String)localObject3, ((StringBuilder)???).toString());
      ??? = a;
      paramIntent = new b((Context)???, d, paramInt, paramd);
      paramd = e.c.u().k();
      localObject2 = ConstraintProxy.a;
      localObject2 = paramd.iterator();
      int i = 0;
      int j = i;
      int k = j;
      int m = k;
      int n;
      int i1;
      int i2;
      int i3;
      do
      {
        do
        {
          do
          {
            do
            {
              n = i;
              i1 = j;
              i2 = k;
              i3 = m;
              if (!((Iterator)localObject2).hasNext()) {
                break;
              }
              localObject3 = nextj;
              n = i | d;
              i1 = j | b;
              i2 = k | e;
              if (a != 1) {
                paramInt = 1;
              } else {
                paramInt = 0;
              }
              i3 = m | paramInt;
              i = n;
              j = i1;
              k = i2;
              m = i3;
            } while (n == 0);
            i = n;
            j = i1;
            k = i2;
            m = i3;
          } while (i1 == 0);
          i = n;
          j = i1;
          k = i2;
          m = i3;
        } while (i2 == 0);
        i = n;
        j = i1;
        k = i2;
        m = i3;
      } while (i3 == 0);
      localObject2 = ConstraintProxyUpdateReceiver.a;
      localObject2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
      ((Intent)localObject2).setComponent(new ComponentName((Context)???, ConstraintProxyUpdateReceiver.class));
      ((Intent)localObject2).putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", n).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", i1).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", i2).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", i3);
      ((Context)???).sendBroadcast((Intent)localObject2);
      ??? = new ArrayList(paramd.size());
      l = b.a();
      paramd = paramd.iterator();
      while (paramd.hasNext())
      {
        localObject2 = (s)paramd.next();
        if ((l >= ((s)localObject2).a()) && ((!((s)localObject2).b()) || (e.a((s)localObject2)))) {
          ((ArrayList)???).add(localObject2);
        }
      }
      paramd = ((ArrayList)???).iterator();
      while (paramd.hasNext())
      {
        localObject3 = (s)paramd.next();
        localObject2 = a;
        ??? = a;
        localObject3 = a0.s((s)localObject3);
        ??? = new Intent((Context)???, SystemAlarmService.class);
        ((Intent)???).setAction("ACTION_DELAY_MET");
        d((Intent)???, (x2.l)localObject3);
        localObject3 = o2.j.d();
        localObject4 = b.f;
        localObject5 = new StringBuilder();
        ((StringBuilder)localObject5).append("Creating a delay_met command for workSpec with id (");
        ((StringBuilder)localObject5).append((String)localObject2);
        ((StringBuilder)localObject5).append(")");
        ((o2.j)localObject3).a((String)localObject4, ((StringBuilder)localObject5).toString());
        localObject2 = d.b.b();
        localObject3 = d;
        ((c.a)localObject2).execute(new d.b(c, (Intent)???, (d)localObject3));
      }
    }
    if ("ACTION_RESCHEDULE".equals(???))
    {
      ??? = o2.j.d();
      localObject3 = f;
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Handling reschedule ");
      ((StringBuilder)localObject2).append(paramIntent);
      ((StringBuilder)localObject2).append(", ");
      ((StringBuilder)localObject2).append(paramInt);
      ((o2.j)???).a((String)localObject3, ((StringBuilder)localObject2).toString());
      e.h();
    }
    else
    {
      localObject2 = paramIntent.getExtras();
      int i4;
      if ((localObject2 != null) && (!((BaseBundle)localObject2).isEmpty()))
      {
        for (i4 = 0; i4 < 1; i4++) {
          if (((BaseBundle)localObject2).get(new String[] { "KEY_WORKSPEC_ID" }[i4]) == null) {
            break label797;
          }
        }
        i4 = 1;
      }
      else
      {
        label797:
        i4 = 0;
      }
      if (i4 == 0)
      {
        localObject2 = o2.j.d();
        paramIntent = f;
        paramd = new StringBuilder();
        paramd.append("Invalid request for ");
        paramd.append((String)???);
        paramd.append(" , requires ");
        paramd.append("KEY_WORKSPEC_ID");
        paramd.append(" .");
        ((o2.j)localObject2).b(paramIntent, paramd.toString());
      }
      else
      {
        label1071:
        boolean bool;
        if ("ACTION_SCHEDULE_WORK".equals(???))
        {
          localObject3 = c(paramIntent);
          paramIntent = o2.j.d();
          localObject2 = f;
          ??? = new StringBuilder();
          ((StringBuilder)???).append("Handling schedule work for ");
          ((StringBuilder)???).append(localObject3);
          paramIntent.a((String)localObject2, ((StringBuilder)???).toString());
          ??? = e.c;
          ((p1.j)???).c();
          try
          {
            paramIntent = ((WorkDatabase)???).u().t(a);
            if (paramIntent == null)
            {
              paramIntent = o2.j.d();
              paramd = new java/lang/StringBuilder;
              paramd.<init>();
              paramd.append("Skipping scheduling ");
              paramd.append(localObject3);
              paramd.append(" because it's no longer in the DB");
            }
            for (;;)
            {
              paramd = paramd.toString();
              break;
              if (!b.f()) {
                break label1071;
              }
              paramIntent = o2.j.d();
              paramd = new java/lang/StringBuilder;
              paramd.<init>();
              paramd.append("Skipping scheduling ");
              paramd.append(localObject3);
              paramd.append("because it is finished.");
            }
            paramIntent.g((String)localObject2, paramd);
            break label1290;
            l = paramIntent.a();
            bool = paramIntent.b();
            if (!bool)
            {
              paramd = o2.j.d();
              paramIntent = new java/lang/StringBuilder;
              paramIntent.<init>();
              paramIntent.append("Setting up Alarms for ");
              paramIntent.append(localObject3);
              paramIntent.append("at ");
              paramIntent.append(l);
              paramd.a((String)localObject2, paramIntent.toString());
              r2.a.b(a, (WorkDatabase)???, (x2.l)localObject3, l);
            }
            else
            {
              paramIntent = o2.j.d();
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>();
              ((StringBuilder)localObject4).append("Opportunistically setting an alarm for ");
              ((StringBuilder)localObject4).append(localObject3);
              ((StringBuilder)localObject4).append("at ");
              ((StringBuilder)localObject4).append(l);
              paramIntent.a((String)localObject2, ((StringBuilder)localObject4).toString());
              r2.a.b(a, (WorkDatabase)???, (x2.l)localObject3, l);
              localObject2 = a;
              paramIntent = new android/content/Intent;
              paramIntent.<init>((Context)localObject2, SystemAlarmService.class);
              paramIntent.setAction("ACTION_CONSTRAINTS_CHANGED");
              localObject3 = b.b();
              localObject2 = new androidx/work/impl/background/systemalarm/d$b;
              ((d.b)localObject2).<init>(paramInt, paramIntent, paramd);
              ((c.a)localObject3).execute((Runnable)localObject2);
            }
            ((p1.j)???).n();
          }
          finally
          {
            label1290:
            ((p1.j)???).j();
          }
        }
        if ("ACTION_DELAY_MET".equals(???)) {
          synchronized (c)
          {
            paramIntent = c(paramIntent);
            localObject4 = o2.j.d();
            localObject2 = f;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            ((StringBuilder)localObject3).append("Handing delay met for ");
            ((StringBuilder)localObject3).append(paramIntent);
            ((o2.j)localObject4).a((String)localObject2, ((StringBuilder)localObject3).toString());
            if (!b.containsKey(paramIntent))
            {
              localObject2 = new androidx/work/impl/background/systemalarm/c;
              ((c)localObject2).<init>(a, paramInt, paramd, e.h(paramIntent));
              b.put(paramIntent, localObject2);
              ((c)localObject2).f();
            }
            else
            {
              paramd = o2.j.d();
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              ((StringBuilder)localObject3).append("WorkSpec ");
              ((StringBuilder)localObject3).append(paramIntent);
              ((StringBuilder)localObject3).append(" is is already being handled for ACTION_DELAY_MET");
              paramd.a((String)localObject2, ((StringBuilder)localObject3).toString());
            }
          }
        }
        if ("ACTION_STOP_WORK".equals(???))
        {
          paramIntent = paramIntent.getExtras();
          localObject2 = paramIntent.getString("KEY_WORKSPEC_ID");
          if (paramIntent.containsKey("KEY_WORKSPEC_GENERATION"))
          {
            paramInt = paramIntent.getInt("KEY_WORKSPEC_GENERATION");
            ??? = new ArrayList(1);
            localObject3 = e.f(new x2.l((String)localObject2, paramInt));
            paramIntent = (Intent)???;
            if (localObject3 != null)
            {
              ((ArrayList)???).add(localObject3);
              paramIntent = (Intent)???;
            }
          }
          else
          {
            paramIntent = e.e((String)localObject2);
          }
          paramIntent = paramIntent.iterator();
          while (paramIntent.hasNext())
          {
            ??? = (x)paramIntent.next();
            localObject3 = o2.j.d();
            localObject5 = f;
            localObject4 = new StringBuilder();
            ((StringBuilder)localObject4).append("Handing stopWork work for ");
            ((StringBuilder)localObject4).append((String)localObject2);
            ((o2.j)localObject3).a((String)localObject5, ((StringBuilder)localObject4).toString());
            s.a((x)???);
            localObject5 = a;
            Object localObject6 = e.c;
            localObject3 = a;
            localObject4 = r2.a.a;
            localObject4 = ((WorkDatabase)localObject6).r();
            localObject6 = ((x2.j)localObject4).c((x2.l)localObject3);
            if (localObject6 != null)
            {
              r2.a.a((Context)localObject5, (x2.l)localObject3, c);
              localObject5 = o2.j.d();
              String str = r2.a.a;
              localObject6 = new StringBuilder();
              ((StringBuilder)localObject6).append("Removing SystemIdInfo for workSpecId (");
              ((StringBuilder)localObject6).append(localObject3);
              ((StringBuilder)localObject6).append(")");
              ((o2.j)localObject5).a(str, ((StringBuilder)localObject6).toString());
              ((x2.j)localObject4).b((x2.l)localObject3);
            }
            paramd.a(a, false);
          }
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(???))
        {
          localObject2 = c(paramIntent);
          bool = paramIntent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
          ??? = o2.j.d();
          localObject3 = f;
          paramd = new StringBuilder();
          paramd.append("Handling onExecutionCompleted ");
          paramd.append(paramIntent);
          paramd.append(", ");
          paramd.append(paramInt);
          ((o2.j)???).a((String)localObject3, paramd.toString());
          a((x2.l)localObject2, bool);
        }
        else
        {
          ??? = o2.j.d();
          paramd = f;
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("Ignoring intent ");
          ((StringBuilder)localObject2).append(paramIntent);
          ((o2.j)???).g(paramd, ((StringBuilder)localObject2).toString());
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemalarm.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */