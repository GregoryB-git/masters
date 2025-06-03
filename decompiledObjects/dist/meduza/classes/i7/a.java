package i7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import b.z;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import e7.j5;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import m6.j;
import v6.g;
import v6.i;
import x6.d;

public final class a
{
  public static final long n = TimeUnit.DAYS.toMillis(366L);
  public static volatile ScheduledExecutorService o = null;
  public static final Object p = new Object();
  public final Object a = new Object();
  public final PowerManager.WakeLock b;
  public int c = 0;
  public ScheduledFuture d;
  public long e;
  public final HashSet f = new HashSet();
  public boolean g = true;
  public zzb h;
  public z i = z.p;
  public final String j;
  public final HashMap k = new HashMap();
  public AtomicInteger l = new AtomicInteger(0);
  public final ScheduledExecutorService m;
  
  public a(Context paramContext)
  {
    j.f("WakeLock: wakeLockName must not be empty", "wake:com.google.firebase.iid.WakeLockHolder");
    paramContext.getApplicationContext();
    Object localObject2 = null;
    h = null;
    if (!"com.google.android.gms".equals(paramContext.getPackageName()))
    {
      if ("wake:com.google.firebase.iid.WakeLockHolder".length() != 0) {
        localObject3 = "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
      } else {
        localObject3 = new String("*gcore*:");
      }
      j = ((String)localObject3);
    }
    else
    {
      j = "wake:com.google.firebase.iid.WakeLockHolder";
    }
    Object localObject3 = (PowerManager)paramContext.getSystemService("power");
    if (localObject3 != null)
    {
      b = ((PowerManager)localObject3).newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
      localObject3 = i.a;
      try
      {
        localObject3 = i.c;
        if (localObject3 == null)
        {
          if (v.a.checkSelfPermission(paramContext, "android.permission.UPDATE_DEVICE_STATS") == 0) {
            bool = true;
          } else {
            bool = false;
          }
          localObject3 = Boolean.valueOf(bool);
          i.c = (Boolean)localObject3;
        }
        boolean bool = ((Boolean)localObject3).booleanValue();
        if (bool)
        {
          localObject3 = ???;
          if (g.b((String)???)) {
            localObject3 = paramContext.getPackageName();
          }
          ??? = localObject2;
          if (paramContext.getPackageManager() != null)
          {
            ??? = localObject2;
            if (localObject3 != null) {
              try
              {
                paramContext = d.a(paramContext).a(0, (String)localObject3);
                if (paramContext == null)
                {
                  paramContext = "Could not get applicationInfo from package: ";
                }
                else
                {
                  int i1 = uid;
                  paramContext = new WorkSource();
                  ??? = i.b;
                  if (??? != null) {}
                  try
                  {
                    ((Method)???).invoke(paramContext, new Object[] { Integer.valueOf(i1), localObject3 });
                    ??? = paramContext;
                  }
                  catch (Exception localException)
                  {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", localException);
                    ??? = paramContext;
                  }
                  localObject3 = i.a;
                  ??? = paramContext;
                  if (localObject3 == null) {
                    break label416;
                  }
                  ((Method)localObject3).invoke(paramContext, new Object[] { Integer.valueOf(i1) });
                  ??? = paramContext;
                }
              }
              catch (PackageManager.NameNotFoundException paramContext)
              {
                paramContext = "Could not find package: ";
                Log.e("WorkSourceUtil", paramContext.concat(localException));
                ??? = localObject2;
              }
            }
          }
          label416:
          if (??? != null)
          {
            paramContext = b;
            try
            {
              paramContext.setWorkSource((WorkSource)???);
            }
            catch (ArrayIndexOutOfBoundsException paramContext) {}catch (IllegalArgumentException paramContext) {}
            Log.wtf("WakeLock", paramContext.toString());
          }
        }
        ScheduledExecutorService localScheduledExecutorService = o;
        paramContext = localScheduledExecutorService;
        if (localScheduledExecutorService == null) {
          synchronized (p)
          {
            localScheduledExecutorService = o;
            paramContext = localScheduledExecutorService;
            if (localScheduledExecutorService == null)
            {
              zzh.zza();
              paramContext = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
              o = paramContext;
            }
          }
        }
        m = paramContext;
        return;
      }
      finally {}
    }
    paramContext = new StringBuilder(29);
    paramContext.append("expected a non-null reference", 0, 29);
    throw new zzi(paramContext.toString());
  }
  
  public final void a(long paramLong)
  {
    l.incrementAndGet();
    long l1 = n;
    long l2 = Long.MAX_VALUE;
    long l3 = Math.max(Math.min(Long.MAX_VALUE, l1), 1L);
    l1 = l3;
    if (paramLong > 0L) {
      l1 = Math.min(paramLong, l3);
    }
    synchronized (a)
    {
      if (!b())
      {
        h = zzb.zza(false, null);
        b.acquire();
        i.getClass();
        SystemClock.elapsedRealtime();
      }
      c += 1;
      if (g) {
        TextUtils.isEmpty(null);
      }
    }
    Object localObject4 = (b)k.get(null);
    Object localObject3 = localObject4;
    if (localObject4 == null)
    {
      localObject3 = new i7/b;
      ((b)localObject3).<init>(0);
      k.put(null, localObject3);
    }
    a += 1;
    i.getClass();
    l3 = SystemClock.elapsedRealtime();
    paramLong = l2;
    if (Long.MAX_VALUE - l3 > l1) {
      paramLong = l3 + l1;
    }
    if (paramLong > e)
    {
      e = paramLong;
      localObject3 = d;
      if (localObject3 != null) {
        ((Future)localObject3).cancel(false);
      }
      localObject4 = m;
      localObject3 = new e7/j5;
      ((j5)localObject3).<init>(this, 1);
      d = ((ScheduledExecutorService)localObject4).schedule((Runnable)localObject3, l1, TimeUnit.MILLISECONDS);
    }
    return;
    throw ((Throwable)localObject3);
  }
  
  public final boolean b()
  {
    synchronized (a)
    {
      boolean bool;
      if (c > 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public final void c()
  {
    if (l.decrementAndGet() < 0) {
      Log.e("WakeLock", String.valueOf(j).concat(" release without a matched acquire!"));
    }
    synchronized (a)
    {
      if (g) {
        TextUtils.isEmpty(null);
      }
    }
    if (k.containsKey(null))
    {
      localb = (b)k.get(null);
      if (localb != null)
      {
        int i1 = a - 1;
        a = i1;
        if (i1 == 0) {
          k.remove(null);
        }
      }
    }
    else
    {
      Log.w("WakeLock", String.valueOf(j).concat(" counter does not exist"));
    }
    e();
  }
  
  public final void d()
  {
    if (f.isEmpty()) {
      return;
    }
    Object localObject = new ArrayList(f);
    f.clear();
    if (((ArrayList)localObject).size() <= 0) {
      return;
    }
    localObject = (c)((ArrayList)localObject).get(0);
    throw null;
  }
  
  /* Error */
  public final void e()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 74	i7/a:a	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: invokevirtual 297	i7/a:b	()Z
    //   11: ifne +6 -> 17
    //   14: aload_1
    //   15: monitorexit
    //   16: return
    //   17: aload_0
    //   18: getfield 83	i7/a:g	Z
    //   21: ifeq +25 -> 46
    //   24: aload_0
    //   25: getfield 76	i7/a:c	I
    //   28: iconst_1
    //   29: isub
    //   30: istore_2
    //   31: aload_0
    //   32: iload_2
    //   33: putfield 76	i7/a:c	I
    //   36: iload_2
    //   37: ifgt +6 -> 43
    //   40: goto +11 -> 51
    //   43: aload_1
    //   44: monitorexit
    //   45: return
    //   46: aload_0
    //   47: iconst_0
    //   48: putfield 76	i7/a:c	I
    //   51: aload_0
    //   52: invokevirtual 401	i7/a:d	()V
    //   55: aload_0
    //   56: getfield 94	i7/a:k	Ljava/util/HashMap;
    //   59: invokevirtual 405	java/util/HashMap:values	()Ljava/util/Collection;
    //   62: invokeinterface 411 1 0
    //   67: astore_3
    //   68: aload_3
    //   69: invokeinterface 416 1 0
    //   74: ifeq +19 -> 93
    //   77: aload_3
    //   78: invokeinterface 420 1 0
    //   83: checkcast 327	i7/b
    //   86: iconst_0
    //   87: putfield 334	i7/b:a	I
    //   90: goto -22 -> 68
    //   93: aload_0
    //   94: getfield 94	i7/a:k	Ljava/util/HashMap;
    //   97: invokevirtual 421	java/util/HashMap:clear	()V
    //   100: aload_0
    //   101: getfield 338	i7/a:d	Ljava/util/concurrent/ScheduledFuture;
    //   104: astore_3
    //   105: aload_3
    //   106: ifnull +21 -> 127
    //   109: aload_3
    //   110: iconst_0
    //   111: invokeinterface 344 2 0
    //   116: pop
    //   117: aload_0
    //   118: aconst_null
    //   119: putfield 338	i7/a:d	Ljava/util/concurrent/ScheduledFuture;
    //   122: aload_0
    //   123: lconst_0
    //   124: putfield 336	i7/a:e	J
    //   127: aload_0
    //   128: getfield 153	i7/a:b	Landroid/os/PowerManager$WakeLock;
    //   131: invokevirtual 424	android/os/PowerManager$WakeLock:isHeld	()Z
    //   134: istore 4
    //   136: iload 4
    //   138: ifeq +91 -> 229
    //   141: aload_0
    //   142: getfield 153	i7/a:b	Landroid/os/PowerManager$WakeLock;
    //   145: invokevirtual 427	android/os/PowerManager$WakeLock:release	()V
    //   148: aload_0
    //   149: getfield 116	i7/a:h	Lcom/google/android/gms/internal/stats/zzb;
    //   152: astore_3
    //   153: aload_3
    //   154: ifnull +94 -> 248
    //   157: goto +48 -> 205
    //   160: astore_3
    //   161: goto +54 -> 215
    //   164: astore_3
    //   165: aload_3
    //   166: invokevirtual 309	java/lang/Object:getClass	()Ljava/lang/Class;
    //   169: ldc_w 399
    //   172: invokevirtual 428	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   175: ifeq +38 -> 213
    //   178: ldc -12
    //   180: aload_0
    //   181: getfield 139	i7/a:j	Ljava/lang/String;
    //   184: invokestatic 364	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   187: ldc_w 430
    //   190: invokevirtual 134	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   193: aload_3
    //   194: invokestatic 432	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   197: pop
    //   198: aload_0
    //   199: getfield 116	i7/a:h	Lcom/google/android/gms/internal/stats/zzb;
    //   202: ifnull +46 -> 248
    //   205: aload_0
    //   206: aconst_null
    //   207: putfield 116	i7/a:h	Lcom/google/android/gms/internal/stats/zzb;
    //   210: goto +38 -> 248
    //   213: aload_3
    //   214: athrow
    //   215: aload_0
    //   216: getfield 116	i7/a:h	Lcom/google/android/gms/internal/stats/zzb;
    //   219: ifnull +8 -> 227
    //   222: aload_0
    //   223: aconst_null
    //   224: putfield 116	i7/a:h	Lcom/google/android/gms/internal/stats/zzb;
    //   227: aload_3
    //   228: athrow
    //   229: ldc -12
    //   231: aload_0
    //   232: getfield 139	i7/a:j	Ljava/lang/String;
    //   235: invokestatic 364	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   238: ldc_w 434
    //   241: invokevirtual 134	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   244: invokestatic 236	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   247: pop
    //   248: aload_1
    //   249: monitorexit
    //   250: return
    //   251: astore_3
    //   252: aload_1
    //   253: monitorexit
    //   254: aload_3
    //   255: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	256	0	this	a
    //   4	249	1	localObject1	Object
    //   30	7	2	i1	int
    //   67	87	3	localObject2	Object
    //   160	1	3	localObject3	Object
    //   164	64	3	localRuntimeException	RuntimeException
    //   251	4	3	localObject4	Object
    //   134	3	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   141	148	160	finally
    //   165	198	160	finally
    //   213	215	160	finally
    //   141	148	164	java/lang/RuntimeException
    //   7	16	251	finally
    //   17	36	251	finally
    //   43	45	251	finally
    //   46	51	251	finally
    //   51	68	251	finally
    //   68	90	251	finally
    //   93	105	251	finally
    //   109	127	251	finally
    //   127	136	251	finally
    //   148	153	251	finally
    //   198	205	251	finally
    //   205	210	251	finally
    //   215	227	251	finally
    //   227	229	251	finally
    //   229	248	251	finally
    //   248	250	251	finally
    //   252	254	251	finally
  }
}

/* Location:
 * Qualified Name:     i7.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */