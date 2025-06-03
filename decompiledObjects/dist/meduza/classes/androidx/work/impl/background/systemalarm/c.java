package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import androidx.work.impl.WorkDatabase;
import b.k;
import b.m;
import f;
import g;
import java.util.HashMap;
import java.util.concurrent.Executor;
import nc.a0;
import nc.m1;
import nc.o1;
import o2.j;
import o2.n;
import p2.k0;
import p2.x;
import t2.b.a;
import t2.e;
import t2.h;
import x2.l;
import x2.s;
import x2.t;
import y2.b0;
import y2.b0.a;
import y2.b0.b;
import y2.v;

public final class c
  implements t2.d, b0.a
{
  public static final String w = j.f("DelayMetCommandHandler");
  public final Context a;
  public final int b;
  public final l c;
  public final d d;
  public final e e;
  public final Object f;
  public int o;
  public final a3.a p;
  public final Executor q;
  public PowerManager.WakeLock r;
  public boolean s;
  public final x t;
  public final a0 u;
  public volatile m1 v;
  
  public c(Context paramContext, int paramInt, d paramd, x paramx)
  {
    a = paramContext;
    b = paramInt;
    d = paramd;
    c = a;
    t = paramx;
    paramContext = e.j;
    p = b.c();
    q = b.b();
    u = b.a();
    e = new e(paramContext);
    s = false;
    o = 0;
    f = new Object();
  }
  
  public static void b(c paramc)
  {
    Object localObject1;
    Object localObject2;
    if (o == 0)
    {
      o = 1;
      localObject1 = j.d();
      localObject2 = w;
      ??? = f.l("onAllConstraintsMet for ");
      ((StringBuilder)???).append(c);
      ((j)localObject1).a((String)localObject2, ((StringBuilder)???).toString());
      if (d.d.f(t, null))
      {
        localObject2 = d.c;
        localObject1 = c;
        synchronized (d)
        {
          Object localObject4 = j.d();
          String str = b0.e;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append("Starting timer for ");
          localStringBuilder.append(localObject1);
          ((j)localObject4).a(str, localStringBuilder.toString());
          ((b0)localObject2).a((l)localObject1);
          localObject4 = new y2/b0$b;
          ((b0.b)localObject4).<init>((b0)localObject2, (l)localObject1);
          b.put(localObject1, localObject4);
          c.put(localObject1, paramc);
          a.a((Runnable)localObject4, 600000L);
        }
      }
      paramc.e();
    }
    else
    {
      localObject1 = j.d();
      ??? = w;
      localObject2 = f.l("Already started work for ");
      ((StringBuilder)localObject2).append(c);
      ((j)localObject1).a((String)???, ((StringBuilder)localObject2).toString());
    }
  }
  
  public static void c(c paramc)
  {
    Object localObject1 = c.a;
    if (o < 2)
    {
      o = 2;
      Object localObject2 = j.d();
      localObject3 = w;
      ??? = new StringBuilder();
      ((StringBuilder)???).append("Stopping work for WorkSpec ");
      ((StringBuilder)???).append((String)localObject1);
      ((j)localObject2).a((String)localObject3, ((StringBuilder)???).toString());
      Object localObject5 = a;
      localObject2 = c;
      ??? = a.f;
      ??? = new Intent((Context)localObject5, SystemAlarmService.class);
      ((Intent)???).setAction("ACTION_STOP_WORK");
      a.d((Intent)???, (l)localObject2);
      localObject5 = q;
      localObject2 = d;
      ((Executor)localObject5).execute(new d.b(b, (Intent)???, (d)localObject2));
      localObject5 = d.d;
      localObject2 = c.a;
      synchronized (k)
      {
        int i;
        if (((p2.r)localObject5).c((String)localObject2) != null) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          localObject2 = j.d();
          ??? = new StringBuilder();
          ((StringBuilder)???).append("WorkSpec ");
          ((StringBuilder)???).append((String)localObject1);
          ((StringBuilder)???).append(" needs to be rescheduled");
          ((j)localObject2).a((String)localObject3, ((StringBuilder)???).toString());
          ??? = a;
          localObject3 = c;
          ??? = new Intent((Context)???, SystemAlarmService.class);
          ((Intent)???).setAction("ACTION_SCHEDULE_WORK");
          a.d((Intent)???, (l)localObject3);
          localObject3 = q;
          localObject1 = d;
          ((Executor)localObject3).execute(new d.b(b, (Intent)???, (d)localObject1));
          return;
        }
        paramc = j.d();
        ??? = g.g("Processor does not have WorkSpec ", (String)localObject1);
        localObject1 = ". No need to reschedule";
      }
    }
    paramc = j.d();
    Object localObject3 = w;
    ??? = f.l("Already stopped work for ");
    ((StringBuilder)???).append((String)localObject1);
    paramc.a((String)localObject3, ((StringBuilder)???).toString());
  }
  
  public final void a(l paraml)
  {
    j localj = j.d();
    String str = w;
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Exceeded time limits on execution for ");
    ((StringBuilder)localObject).append(paraml);
    localj.a(str, ((StringBuilder)localObject).toString());
    localObject = p;
    paraml = new r2.b(this, 0);
    ((y2.r)localObject).execute(paraml);
  }
  
  public final void d(s params, t2.b paramb)
  {
    if ((paramb instanceof b.a))
    {
      paramb = p;
      params = new m(this, 8);
    }
    else
    {
      paramb = p;
      params = new r2.b(this, 1);
    }
    ((y2.r)paramb).execute(params);
  }
  
  public final void e()
  {
    synchronized (f)
    {
      if (v != null) {
        v.cancel(null);
      }
      d.c.a(c);
      Object localObject2 = r;
      if ((localObject2 != null) && (((PowerManager.WakeLock)localObject2).isHeld()))
      {
        j localj = j.d();
        localObject2 = w;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Releasing wakelock ");
        localStringBuilder.append(r);
        localStringBuilder.append("for WorkSpec ");
        localStringBuilder.append(c);
        localj.a((String)localObject2, localStringBuilder.toString());
        r.release();
      }
      return;
    }
  }
  
  public final void f()
  {
    Object localObject1 = c.a;
    Object localObject2 = a;
    Object localObject3 = g.g((String)localObject1, " (");
    ((StringBuilder)localObject3).append(b);
    ((StringBuilder)localObject3).append(")");
    r = v.a((Context)localObject2, ((StringBuilder)localObject3).toString());
    j localj = j.d();
    localObject3 = w;
    localObject2 = f.l("Acquiring wakelock ");
    ((StringBuilder)localObject2).append(r);
    ((StringBuilder)localObject2).append("for WorkSpec ");
    ((StringBuilder)localObject2).append((String)localObject1);
    localj.a((String)localObject3, ((StringBuilder)localObject2).toString());
    r.acquire();
    localObject2 = d.e.c.u().t((String)localObject1);
    if (localObject2 == null)
    {
      localObject3 = p;
      localObject1 = new b.d(this, 6);
      ((y2.r)localObject3).execute((Runnable)localObject1);
      return;
    }
    boolean bool = ((s)localObject2).b();
    s = bool;
    if (!bool)
    {
      localj = j.d();
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("No constraints for ");
      ((StringBuilder)localObject2).append((String)localObject1);
      localj.a((String)localObject3, ((StringBuilder)localObject2).toString());
      localObject1 = p;
      localObject3 = new k(this, 7);
      ((y2.r)localObject1).execute((Runnable)localObject3);
    }
    else
    {
      v = h.a(e, (s)localObject2, u, this);
    }
  }
  
  public final void g(boolean paramBoolean)
  {
    Object localObject1 = j.d();
    Object localObject2 = w;
    Object localObject3 = f.l("onExecuted ");
    ((StringBuilder)localObject3).append(c);
    ((StringBuilder)localObject3).append(", ");
    ((StringBuilder)localObject3).append(paramBoolean);
    ((j)localObject1).a((String)localObject2, ((StringBuilder)localObject3).toString());
    e();
    if (paramBoolean)
    {
      localObject1 = a;
      localObject3 = c;
      localObject2 = a.f;
      localObject1 = new Intent((Context)localObject1, SystemAlarmService.class);
      ((Intent)localObject1).setAction("ACTION_SCHEDULE_WORK");
      a.d((Intent)localObject1, (l)localObject3);
      localObject3 = q;
      localObject2 = d;
      ((Executor)localObject3).execute(new d.b(b, (Intent)localObject1, (d)localObject2));
    }
    if (s)
    {
      localObject1 = a;
      localObject3 = a.f;
      localObject2 = new Intent((Context)localObject1, SystemAlarmService.class);
      ((Intent)localObject2).setAction("ACTION_CONSTRAINTS_CHANGED");
      localObject1 = q;
      localObject3 = d;
      ((Executor)localObject1).execute(new d.b(b, (Intent)localObject2, (d)localObject3));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemalarm.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */