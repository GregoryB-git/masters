package e7;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.SystemClock;
import b.z;
import com.google.android.gms.internal.measurement.zzeb;
import d2.q;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public final class i4
  implements Application.ActivityLifecycleCallbacks
{
  public i4(k3 paramk3) {}
  
  public final void a(zzeb paramzzeb)
  {
    s4 locals4 = a.p();
    synchronized (u)
    {
      if (Objects.equals(p, paramzzeb)) {
        p = null;
      }
      if (locals4.h().A()) {
        o.remove(Integer.valueOf(zza));
      }
      return;
    }
  }
  
  /* Error */
  public final void b(zzeb paramzzeb, Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 12	e7/i4:a	Le7/k3;
    //   4: invokevirtual 80	d2/q:zzj	()Le7/a1;
    //   7: getfield 86	e7/a1:w	Le7/b1;
    //   10: ldc 88
    //   12: invokevirtual 93	e7/b1:b	(Ljava/lang/String;)V
    //   15: aload_1
    //   16: getfield 97	com/google/android/gms/internal/measurement/zzeb:zzc	Landroid/content/Intent;
    //   19: astore_3
    //   20: aload_3
    //   21: ifnonnull +16 -> 37
    //   24: aload_0
    //   25: getfield 12	e7/i4:a	Le7/k3;
    //   28: invokevirtual 23	e7/o0:p	()Le7/s4;
    //   31: aload_1
    //   32: aload_2
    //   33: invokevirtual 99	e7/s4:w	(Lcom/google/android/gms/internal/measurement/zzeb;Landroid/os/Bundle;)V
    //   36: return
    //   37: aload_3
    //   38: invokevirtual 105	android/content/Intent:getData	()Landroid/net/Uri;
    //   41: astore 4
    //   43: aload 4
    //   45: ifnull +14 -> 59
    //   48: aload 4
    //   50: invokevirtual 110	android/net/Uri:isHierarchical	()Z
    //   53: ifeq +6 -> 59
    //   56: goto +44 -> 100
    //   59: aload_3
    //   60: invokevirtual 114	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   63: astore 4
    //   65: aload 4
    //   67: ifnull +30 -> 97
    //   70: aload 4
    //   72: ldc 116
    //   74: invokevirtual 122	android/os/BaseBundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   77: astore 4
    //   79: aload 4
    //   81: invokestatic 128	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   84: ifne +13 -> 97
    //   87: aload 4
    //   89: invokestatic 132	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   92: astore 4
    //   94: goto +6 -> 100
    //   97: aconst_null
    //   98: astore 4
    //   100: aload 4
    //   102: ifnull -78 -> 24
    //   105: aload 4
    //   107: invokevirtual 110	android/net/Uri:isHierarchical	()Z
    //   110: ifne +6 -> 116
    //   113: goto -89 -> 24
    //   116: aload_0
    //   117: getfield 12	e7/i4:a	Le7/k3;
    //   120: invokevirtual 136	d2/q:k	()Le7/r6;
    //   123: pop
    //   124: aload_3
    //   125: invokestatic 142	e7/r6:S	(Landroid/content/Intent;)Z
    //   128: ifeq +9 -> 137
    //   131: ldc -112
    //   133: astore_3
    //   134: goto +6 -> 140
    //   137: ldc -110
    //   139: astore_3
    //   140: aload 4
    //   142: ldc -108
    //   144: invokevirtual 151	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   147: astore 5
    //   149: aload_2
    //   150: ifnonnull +9 -> 159
    //   153: iconst_1
    //   154: istore 6
    //   156: goto +6 -> 162
    //   159: iconst_0
    //   160: istore 6
    //   162: aload_0
    //   163: getfield 12	e7/i4:a	Le7/k3;
    //   166: invokevirtual 155	d2/q:zzl	()Le7/e2;
    //   169: astore 7
    //   171: new 157	e7/n3
    //   174: astore 8
    //   176: aload 8
    //   178: aload_0
    //   179: iload 6
    //   181: aload 4
    //   183: aload_3
    //   184: aload 5
    //   186: invokespecial 160	e7/n3:<init>	(Le7/i4;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    //   189: aload 7
    //   191: aload 8
    //   193: invokevirtual 165	e7/e2:u	(Ljava/lang/Runnable;)V
    //   196: goto -172 -> 24
    //   199: astore 4
    //   201: goto +25 -> 226
    //   204: astore 4
    //   206: aload_0
    //   207: getfield 12	e7/i4:a	Le7/k3;
    //   210: invokevirtual 80	d2/q:zzj	()Le7/a1;
    //   213: getfield 167	e7/a1:o	Le7/b1;
    //   216: ldc -87
    //   218: aload 4
    //   220: invokevirtual 173	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   223: goto -199 -> 24
    //   226: aload_0
    //   227: getfield 12	e7/i4:a	Le7/k3;
    //   230: invokevirtual 23	e7/o0:p	()Le7/s4;
    //   233: aload_1
    //   234: aload_2
    //   235: invokevirtual 99	e7/s4:w	(Lcom/google/android/gms/internal/measurement/zzeb;Landroid/os/Bundle;)V
    //   238: aload 4
    //   240: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	241	0	this	i4
    //   0	241	1	paramzzeb	zzeb
    //   0	241	2	paramBundle	Bundle
    //   19	165	3	localObject1	Object
    //   41	141	4	localObject2	Object
    //   199	1	4	localObject3	Object
    //   204	35	4	localRuntimeException	RuntimeException
    //   147	38	5	str	String
    //   154	26	6	bool	boolean
    //   169	21	7	locale2	e2
    //   174	18	8	localn3	n3
    // Exception table:
    //   from	to	target	type
    //   0	20	199	finally
    //   37	43	199	finally
    //   48	56	199	finally
    //   59	65	199	finally
    //   70	94	199	finally
    //   105	113	199	finally
    //   116	131	199	finally
    //   140	149	199	finally
    //   162	196	199	finally
    //   206	223	199	finally
    //   0	20	204	java/lang/RuntimeException
    //   37	43	204	java/lang/RuntimeException
    //   48	56	204	java/lang/RuntimeException
    //   59	65	204	java/lang/RuntimeException
    //   70	94	204	java/lang/RuntimeException
    //   105	113	204	java/lang/RuntimeException
    //   116	131	204	java/lang/RuntimeException
    //   140	149	204	java/lang/RuntimeException
    //   162	196	204	java/lang/RuntimeException
  }
  
  public final void c(zzeb paramzzeb)
  {
    s4 locals4 = a.p();
    synchronized (u)
    {
      t = false;
      q = true;
      ((z)locals4.zzb()).getClass();
      long l = SystemClock.elapsedRealtime();
      if (!locals4.h().A())
      {
        d = null;
        locals4.zzl().u(new v4(locals4, l));
      }
      else
      {
        paramzzeb = locals4.A(paramzzeb);
        e = d;
        d = null;
        locals4.zzl().u(new s3(locals4, paramzzeb, l));
      }
      paramzzeb = a.r();
      ((z)paramzzeb.zzb()).getClass();
      l = SystemClock.elapsedRealtime();
      paramzzeb.zzl().u(new i0(paramzzeb, l, 1));
      return;
    }
  }
  
  public final void d(zzeb paramzzeb, Bundle paramBundle)
  {
    Object localObject = a.p();
    if ((((q)localObject).h().A()) && (paramBundle != null))
    {
      localObject = (q4)o.get(Integer.valueOf(zza));
      if (localObject != null)
      {
        paramzzeb = new Bundle();
        paramzzeb.putLong("id", c);
        paramzzeb.putString("name", a);
        paramzzeb.putString("referrer_name", b);
        paramBundle.putBundle("com.google.app_measurement.screen_service", paramzzeb);
      }
    }
  }
  
  public final void e(zzeb paramzzeb)
  {
    ??? = a.r();
    ((z)((q)???).zzb()).getClass();
    long l = SystemClock.elapsedRealtime();
    ((q)???).zzl().u(new p5((q5)???, l));
    s4 locals4 = a.p();
    synchronized (u)
    {
      t = true;
      if (!Objects.equals(paramzzeb, p)) {
        synchronized (u)
        {
          p = paramzzeb;
          q = false;
          if (locals4.h().A())
          {
            r = null;
            e2 locale2 = locals4.zzl();
            ??? = new e7/t4;
            ((t4)???).<init>(locals4, 1);
            locale2.u((Runnable)???);
          }
        }
      }
      if (!locals4.h().A())
      {
        d = r;
        locals4.zzl().u(new t4(locals4, 0));
      }
      else
      {
        ??? = locals4.A(paramzzeb);
        locals4.z(zzb, (q4)???, false);
        paramzzeb = b).y;
        if (paramzzeb == null) {
          break label263;
        }
        ((z)paramzzeb.zzb()).getClass();
        l = SystemClock.elapsedRealtime();
        paramzzeb.zzl().u(new i0(paramzzeb, l, 0));
      }
      return;
      label263:
      throw new IllegalStateException("Component not created");
    }
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    b(zzeb.zza(paramActivity), paramBundle);
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    a(zzeb.zza(paramActivity));
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    c(zzeb.zza(paramActivity));
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    e(zzeb.zza(paramActivity));
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    d(zzeb.zza(paramActivity), paramBundle);
  }
  
  public final void onActivityStarted(Activity paramActivity) {}
  
  public final void onActivityStopped(Activity paramActivity) {}
}

/* Location:
 * Qualified Name:     e7.i4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */