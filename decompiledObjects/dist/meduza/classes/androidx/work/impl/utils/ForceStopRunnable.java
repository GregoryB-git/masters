package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o2.j.a;
import o2.o.b;
import p2.k0;
import p2.w;
import s2.b;
import x2.d;
import x2.e;
import x2.l;
import x2.s;
import x2.t;
import y2.p;

public final class ForceStopRunnable
  implements Runnable
{
  public static final String e = o2.j.f("ForceStopRunnable");
  public static final long f = TimeUnit.DAYS.toMillis(3650L);
  public final Context a;
  public final k0 b;
  public final p c;
  public int d;
  
  public ForceStopRunnable(Context paramContext, k0 paramk0)
  {
    a = paramContext.getApplicationContext();
    b = paramk0;
    c = g;
    d = 0;
  }
  
  public static void c(Context paramContext)
  {
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    int i;
    if (Build.VERSION.SDK_INT >= 31) {
      i = 167772160;
    } else {
      i = 134217728;
    }
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName(paramContext, BroadcastReceiver.class));
    localIntent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
    paramContext = PendingIntent.getBroadcast(paramContext, -1, localIntent, i);
    long l1 = System.currentTimeMillis();
    long l2 = f;
    if (localAlarmManager != null) {
      localAlarmManager.setExact(0, l1 + l2, paramContext);
    }
  }
  
  public final void a()
  {
    Object localObject1 = a;
    Object localObject5 = b.c;
    Object localObject7 = b.f;
    Object localObject8 = (JobScheduler)((Context)localObject1).getSystemService("jobscheduler");
    Object localObject9 = b.f((Context)localObject1, (JobScheduler)localObject8);
    localObject1 = ((WorkDatabase)localObject5).r().a();
    int i = 0;
    if (localObject9 != null) {
      j = ((ArrayList)localObject9).size();
    } else {
      j = 0;
    }
    localObject7 = new HashSet(j);
    if ((localObject9 != null) && (!((ArrayList)localObject9).isEmpty()))
    {
      localObject9 = ((ArrayList)localObject9).iterator();
      while (((Iterator)localObject9).hasNext())
      {
        JobInfo localJobInfo = (JobInfo)((Iterator)localObject9).next();
        l locall = b.g(localJobInfo);
        if (locall != null) {
          ((HashSet)localObject7).add(a);
        } else {
          b.a((JobScheduler)localObject8, localJobInfo.getId());
        }
      }
    }
    localObject8 = ((List)localObject1).iterator();
    while (((Iterator)localObject8).hasNext()) {
      if (!((HashSet)localObject7).contains((String)((Iterator)localObject8).next()))
      {
        o2.j.d().a(b.f, "Reconciling jobs");
        j = 1;
        break label212;
      }
    }
    int j = 0;
    label212:
    if (j != 0)
    {
      ((p1.j)localObject5).c();
      try
      {
        localObject7 = ((WorkDatabase)localObject5).u();
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext()) {
          ((t)localObject7).f((String)((Iterator)localObject1).next(), -1L);
        }
        ((p1.j)localObject5).n();
      }
      finally
      {
        ((p1.j)localObject5).j();
      }
    }
    localObject5 = b.c;
    Object localObject3 = ((WorkDatabase)localObject5).u();
    localObject7 = ((WorkDatabase)localObject5).t();
    ((p1.j)localObject5).c();
    try
    {
      localObject8 = ((t)localObject3).n();
      int k;
      if ((localObject8 != null) && (!((List)localObject8).isEmpty())) {
        k = 1;
      } else {
        k = 0;
      }
      if (k != 0)
      {
        localObject8 = ((List)localObject8).iterator();
        while (((Iterator)localObject8).hasNext())
        {
          localObject9 = (s)((Iterator)localObject8).next();
          ((t)localObject3).e(o.b.a, a);
          ((t)localObject3).o(65024, a);
          ((t)localObject3).f(a, -1L);
        }
      }
      ((x2.q)localObject7).b();
      ((p1.j)localObject5).n();
      ((p1.j)localObject5).j();
      if ((k == 0) && (j == 0)) {
        j = 0;
      } else {
        j = 1;
      }
      localObject5 = b.g.a.q().a("reschedule_needed");
      if ((localObject5 != null) && (((Long)localObject5).longValue() == 1L)) {
        k = 1;
      } else {
        k = 0;
      }
      long l = 0L;
      if (k != 0)
      {
        o2.j.d().a(e, "Rescheduling Workers.");
        b.h();
        localObject3 = b.g;
        localObject3.getClass();
        localObject5 = new d("reschedule_needed", Long.valueOf(0L));
        a.q().b((d)localObject5);
      }
      else
      {
        k = 536870912;
        try
        {
          int m = Build.VERSION.SDK_INT;
          if (m >= 31) {
            k = 570425344;
          }
          localObject3 = a;
          localObject7 = new android/content/Intent;
          ((Intent)localObject7).<init>();
          localObject5 = new android/content/ComponentName;
          ((ComponentName)localObject5).<init>((Context)localObject3, BroadcastReceiver.class);
          ((Intent)localObject7).setComponent((ComponentName)localObject5);
          ((Intent)localObject7).setAction("ACTION_FORCE_STOP_RESCHEDULE");
          localObject5 = PendingIntent.getBroadcast((Context)localObject3, -1, (Intent)localObject7, k);
          if (m >= 30)
          {
            if (localObject5 != null) {
              ((PendingIntent)localObject5).cancel();
            }
            localObject5 = ((ActivityManager)a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            k = i;
            if (localObject5 == null) {
              break label835;
            }
            k = i;
            if (((List)localObject5).isEmpty()) {
              break label835;
            }
            localObject3 = c.a.q().a("last_force_stop_ms");
            if (localObject3 != null) {
              l = ((Long)localObject3).longValue();
            }
            for (m = 0;; m++)
            {
              k = i;
              if (m >= ((List)localObject5).size()) {
                break label835;
              }
              localObject3 = (ApplicationExitInfo)((List)localObject5).get(m);
              if ((((ApplicationExitInfo)localObject3).getReason() == 10) && (((ApplicationExitInfo)localObject3).getTimestamp() >= l)) {
                break;
              }
            }
          }
          k = i;
          if (localObject5 != null) {
            break label835;
          }
          c(a);
        }
        catch (IllegalArgumentException localIllegalArgumentException) {}catch (SecurityException localSecurityException) {}
        localObject7 = o2.j.d();
        localObject3 = e;
        if (c <= 5) {
          Log.w((String)localObject3, "Ignoring exception", localSecurityException);
        }
        k = 1;
        label835:
        if (k != 0)
        {
          o2.j.d().a(e, "Application was force-stopped, rescheduling.");
          b.h();
          localObject6 = c;
          b.b.c.getClass();
          l = System.currentTimeMillis();
          localObject6.getClass();
          localObject3 = new d("last_force_stop_ms", Long.valueOf(l));
          a.q().b((d)localObject3);
        }
        else if (j != 0)
        {
          o2.j.d().a(e, "Found unfinished work, scheduling it.");
          localObject6 = b;
          w.b(b, c, e);
        }
      }
      return;
    }
    finally
    {
      Object localObject6;
      ((p1.j)localObject6).j();
    }
  }
  
  public final boolean b()
  {
    Object localObject = b.b;
    localObject.getClass();
    if (TextUtils.isEmpty(null))
    {
      o2.j.d().a(e, "The default process name was not specified.");
      return true;
    }
    boolean bool = y2.q.a(a, (a)localObject);
    o2.j localj = o2.j.d();
    localObject = e;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Is default app process = ");
    localStringBuilder.append(bool);
    localj.a((String)localObject, localStringBuilder.toString());
    return bool;
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 411	androidx/work/impl/utils/ForceStopRunnable:b	()Z
    //   4: istore_1
    //   5: iload_1
    //   6: ifne +11 -> 17
    //   9: aload_0
    //   10: getfield 61	androidx/work/impl/utils/ForceStopRunnable:b	Lp2/k0;
    //   13: invokevirtual 413	p2/k0:g	()V
    //   16: return
    //   17: aload_0
    //   18: getfield 59	androidx/work/impl/utils/ForceStopRunnable:a	Landroid/content/Context;
    //   21: invokestatic 417	p2/b0:a	(Landroid/content/Context;)V
    //   24: invokestatic 207	o2/j:d	()Lo2/j;
    //   27: getstatic 32	androidx/work/impl/utils/ForceStopRunnable:e	Ljava/lang/String;
    //   30: ldc_w 419
    //   33: invokevirtual 212	o2/j:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   36: aload_0
    //   37: invokevirtual 421	androidx/work/impl/utils/ForceStopRunnable:a	()V
    //   40: goto -31 -> 9
    //   43: astore_2
    //   44: goto +24 -> 68
    //   47: astore_2
    //   48: goto +20 -> 68
    //   51: astore_2
    //   52: goto +16 -> 68
    //   55: astore_2
    //   56: goto +12 -> 68
    //   59: astore_2
    //   60: goto +8 -> 68
    //   63: astore_2
    //   64: goto +4 -> 68
    //   67: astore_2
    //   68: aload_0
    //   69: getfield 70	androidx/work/impl/utils/ForceStopRunnable:d	I
    //   72: iconst_1
    //   73: iadd
    //   74: istore_3
    //   75: aload_0
    //   76: iload_3
    //   77: putfield 70	androidx/work/impl/utils/ForceStopRunnable:d	I
    //   80: iload_3
    //   81: iconst_3
    //   82: if_icmplt +65 -> 147
    //   85: aload_0
    //   86: getfield 59	androidx/work/impl/utils/ForceStopRunnable:a	Landroid/content/Context;
    //   89: invokestatic 426	a0/o:a	(Landroid/content/Context;)Z
    //   92: ifeq +11 -> 103
    //   95: ldc_w 428
    //   98: astore 4
    //   100: goto +8 -> 108
    //   103: ldc_w 430
    //   106: astore 4
    //   108: invokestatic 207	o2/j:d	()Lo2/j;
    //   111: getstatic 32	androidx/work/impl/utils/ForceStopRunnable:e	Ljava/lang/String;
    //   114: aload 4
    //   116: aload_2
    //   117: invokevirtual 433	o2/j:c	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   120: new 435	java/lang/IllegalStateException
    //   123: astore 5
    //   125: aload 5
    //   127: aload 4
    //   129: aload_2
    //   130: invokespecial 438	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   133: aload_0
    //   134: getfield 61	androidx/work/impl/utils/ForceStopRunnable:b	Lp2/k0;
    //   137: getfield 347	p2/k0:b	Landroidx/work/a;
    //   140: invokevirtual 288	java/lang/Object:getClass	()Ljava/lang/Class;
    //   143: pop
    //   144: aload 5
    //   146: athrow
    //   147: iload_3
    //   148: i2l
    //   149: lstore 6
    //   151: invokestatic 207	o2/j:d	()Lo2/j;
    //   154: astore 5
    //   156: getstatic 32	androidx/work/impl/utils/ForceStopRunnable:e	Ljava/lang/String;
    //   159: astore 4
    //   161: new 376	java/lang/StringBuilder
    //   164: astore 8
    //   166: aload 8
    //   168: invokespecial 377	java/lang/StringBuilder:<init>	()V
    //   171: aload 8
    //   173: ldc_w 440
    //   176: invokevirtual 383	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: pop
    //   180: aload 8
    //   182: lload 6
    //   184: ldc2_w 441
    //   187: lmul
    //   188: invokevirtual 445	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   191: pop
    //   192: aload 8
    //   194: invokevirtual 390	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   197: astore 8
    //   199: aload 5
    //   201: checkcast 332	o2/j$a
    //   204: getfield 334	o2/j$a:c	I
    //   207: iconst_3
    //   208: if_icmpgt +12 -> 220
    //   211: aload 4
    //   213: aload 8
    //   215: aload_2
    //   216: invokestatic 447	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   219: pop
    //   220: aload_0
    //   221: getfield 70	androidx/work/impl/utils/ForceStopRunnable:d	I
    //   224: istore_3
    //   225: iload_3
    //   226: i2l
    //   227: lstore 6
    //   229: lload 6
    //   231: ldc2_w 441
    //   234: lmul
    //   235: invokestatic 453	java/lang/Thread:sleep	(J)V
    //   238: goto -221 -> 17
    //   241: astore_2
    //   242: invokestatic 207	o2/j:d	()Lo2/j;
    //   245: getstatic 32	androidx/work/impl/utils/ForceStopRunnable:e	Ljava/lang/String;
    //   248: ldc_w 455
    //   251: invokevirtual 457	o2/j:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   254: new 435	java/lang/IllegalStateException
    //   257: astore 4
    //   259: aload 4
    //   261: ldc_w 455
    //   264: aload_2
    //   265: invokespecial 438	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   268: aload_0
    //   269: getfield 61	androidx/work/impl/utils/ForceStopRunnable:b	Lp2/k0;
    //   272: getfield 347	p2/k0:b	Landroidx/work/a;
    //   275: invokevirtual 288	java/lang/Object:getClass	()Ljava/lang/Class;
    //   278: pop
    //   279: aload 4
    //   281: athrow
    //   282: astore_2
    //   283: aload_0
    //   284: getfield 61	androidx/work/impl/utils/ForceStopRunnable:b	Lp2/k0;
    //   287: invokevirtual 413	p2/k0:g	()V
    //   290: aload_2
    //   291: athrow
    //   292: astore_2
    //   293: goto -276 -> 17
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	296	0	this	ForceStopRunnable
    //   4	2	1	bool	boolean
    //   43	1	2	localSQLiteAccessPermException	android.database.sqlite.SQLiteAccessPermException
    //   47	1	2	localSQLiteConstraintException	android.database.sqlite.SQLiteConstraintException
    //   51	1	2	localSQLiteTableLockedException	android.database.sqlite.SQLiteTableLockedException
    //   55	1	2	localSQLiteDatabaseLockedException	android.database.sqlite.SQLiteDatabaseLockedException
    //   59	1	2	localSQLiteDatabaseCorruptException	android.database.sqlite.SQLiteDatabaseCorruptException
    //   63	1	2	localSQLiteDiskIOException	android.database.sqlite.SQLiteDiskIOException
    //   67	149	2	localSQLiteCantOpenDatabaseException	android.database.sqlite.SQLiteCantOpenDatabaseException
    //   241	24	2	localSQLiteException	android.database.sqlite.SQLiteException
    //   282	9	2	localObject1	Object
    //   292	1	2	localInterruptedException	InterruptedException
    //   74	152	3	i	int
    //   98	182	4	localObject2	Object
    //   123	77	5	localObject3	Object
    //   149	81	6	l	long
    //   164	50	8	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   36	40	43	android/database/sqlite/SQLiteAccessPermException
    //   36	40	47	android/database/sqlite/SQLiteConstraintException
    //   36	40	51	android/database/sqlite/SQLiteTableLockedException
    //   36	40	55	android/database/sqlite/SQLiteDatabaseLockedException
    //   36	40	59	android/database/sqlite/SQLiteDatabaseCorruptException
    //   36	40	63	android/database/sqlite/SQLiteDiskIOException
    //   36	40	67	android/database/sqlite/SQLiteCantOpenDatabaseException
    //   17	24	241	android/database/sqlite/SQLiteException
    //   0	5	282	finally
    //   17	24	282	finally
    //   24	36	282	finally
    //   36	40	282	finally
    //   68	80	282	finally
    //   85	95	282	finally
    //   108	147	282	finally
    //   151	220	282	finally
    //   220	225	282	finally
    //   229	238	282	finally
    //   242	282	282	finally
    //   229	238	292	java/lang/InterruptedException
  }
  
  public static class BroadcastReceiver
    extends BroadcastReceiver
  {
    public static final String a = o2.j.f("ForceStopRunnable$Rcvr");
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      if ((paramIntent != null) && ("ACTION_FORCE_STOP_RESCHEDULE".equals(paramIntent.getAction())))
      {
        o2.j localj = o2.j.d();
        paramIntent = a;
        if (c <= 2) {
          Log.v(paramIntent, "Rescheduling alarm that keeps track of force-stops.");
        }
        ForceStopRunnable.c(paramContext);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.ForceStopRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */