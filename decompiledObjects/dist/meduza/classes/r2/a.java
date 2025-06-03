package r2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import g.s;
import x2.l;
import y2.h;

public final class a
{
  public static final String a = o2.j.f("Alarms");
  
  public static void a(Context paramContext, l paraml, int paramInt)
  {
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    Object localObject = androidx.work.impl.background.systemalarm.a.f;
    localObject = new Intent(paramContext, SystemAlarmService.class);
    ((Intent)localObject).setAction("ACTION_DELAY_MET");
    androidx.work.impl.background.systemalarm.a.d((Intent)localObject, paraml);
    paramContext = PendingIntent.getService(paramContext, paramInt, (Intent)localObject, 603979776);
    if ((paramContext != null) && (localAlarmManager != null))
    {
      o2.j localj = o2.j.d();
      String str = a;
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Cancelling existing alarm with (workSpecId, systemId) (");
      ((StringBuilder)localObject).append(paraml);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(paramInt);
      ((StringBuilder)localObject).append(")");
      localj.a(str, ((StringBuilder)localObject).toString());
      localAlarmManager.cancel(paramContext);
    }
  }
  
  public static void b(Context paramContext, WorkDatabase paramWorkDatabase, l paraml, long paramLong)
  {
    x2.j localj = paramWorkDatabase.r();
    x2.i locali = localj.c(paraml);
    int i;
    if (locali != null)
    {
      a(paramContext, paraml, c);
      i = c;
    }
    else
    {
      paramWorkDatabase = new s(paramWorkDatabase);
      paramWorkDatabase = ((WorkDatabase)b).m(new h(paramWorkDatabase, 0));
      ec.i.d(paramWorkDatabase, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
      i = ((Number)paramWorkDatabase).intValue();
      localj.d(new x2.i(a, b, i));
    }
    c(paramContext, paraml, i, paramLong);
  }
  
  public static void c(Context paramContext, l paraml, int paramInt, long paramLong)
  {
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    Object localObject = androidx.work.impl.background.systemalarm.a.f;
    localObject = new Intent(paramContext, SystemAlarmService.class);
    ((Intent)localObject).setAction("ACTION_DELAY_MET");
    androidx.work.impl.background.systemalarm.a.d((Intent)localObject, paraml);
    paramContext = PendingIntent.getService(paramContext, paramInt, (Intent)localObject, 201326592);
    if (localAlarmManager != null) {
      a.a(localAlarmManager, 0, paramLong, paramContext);
    }
  }
  
  public static final class a
  {
    public static void a(AlarmManager paramAlarmManager, int paramInt, long paramLong, PendingIntent paramPendingIntent)
    {
      paramAlarmManager.setExact(paramInt, paramLong, paramPendingIntent);
    }
  }
}

/* Location:
 * Qualified Name:     r2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */