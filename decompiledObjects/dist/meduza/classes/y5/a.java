package y5;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import m6.j;

public final class a
{
  public j6.a a;
  public zzf b;
  public boolean c;
  public final Object d = new Object();
  public c e;
  public final Context f;
  public final long g;
  
  public a(Context paramContext)
  {
    j.i(paramContext);
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null) {
      paramContext = localContext;
    }
    f = paramContext;
    c = false;
    g = -1L;
  }
  
  public static a a(Context paramContext)
  {
    paramContext = new a(paramContext);
    try
    {
      long l = SystemClock.elapsedRealtime();
      paramContext.c();
      a locala = paramContext.e();
      d(locala, SystemClock.elapsedRealtime() - l, null);
      paramContext.b();
      return locala;
    }
    finally
    {
      try
      {
        d(null, -1L, localThrowable);
        throw localThrowable;
      }
      finally
      {
        paramContext.b();
      }
    }
  }
  
  public static void d(a parama, long paramLong, Throwable paramThrowable)
  {
    if (Math.random() <= 0.0D)
    {
      HashMap localHashMap = new HashMap();
      String str = "1";
      localHashMap.put("app_context", "1");
      if (parama != null)
      {
        if (true != b) {
          str = "0";
        }
        localHashMap.put("limit_ad_tracking", str);
        parama = a;
        if (parama != null) {
          localHashMap.put("ad_id_size", Integer.toString(parama.length()));
        }
      }
      if (paramThrowable != null) {
        localHashMap.put("error", paramThrowable.getClass().getName());
      }
      localHashMap.put("tag", "AdvertisingIdClient");
      localHashMap.put("time_spent", Long.toString(paramLong));
      new b(localHashMap).start();
    }
  }
  
  /* Error */
  public final void b()
  {
    // Byte code:
    //   0: ldc -114
    //   2: invokestatic 146	m6/j:h	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 41	y5/a:f	Landroid/content/Context;
    //   11: ifnull +67 -> 78
    //   14: aload_0
    //   15: getfield 148	y5/a:a	Lj6/a;
    //   18: astore_1
    //   19: aload_1
    //   20: ifnonnull +6 -> 26
    //   23: goto +55 -> 78
    //   26: aload_0
    //   27: getfield 43	y5/a:c	Z
    //   30: ifeq +30 -> 60
    //   33: invokestatic 153	u6/a:b	()Lu6/a;
    //   36: aload_0
    //   37: getfield 41	y5/a:f	Landroid/content/Context;
    //   40: aload_0
    //   41: getfield 148	y5/a:a	Lj6/a;
    //   44: invokevirtual 156	u6/a:c	(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    //   47: goto +13 -> 60
    //   50: astore_1
    //   51: ldc 123
    //   53: ldc -98
    //   55: aload_1
    //   56: invokestatic 163	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   59: pop
    //   60: aload_0
    //   61: iconst_0
    //   62: putfield 43	y5/a:c	Z
    //   65: aload_0
    //   66: aconst_null
    //   67: putfield 165	y5/a:b	Lcom/google/android/gms/internal/ads_identifier/zzf;
    //   70: aload_0
    //   71: aconst_null
    //   72: putfield 148	y5/a:a	Lj6/a;
    //   75: aload_0
    //   76: monitorexit
    //   77: return
    //   78: aload_0
    //   79: monitorexit
    //   80: return
    //   81: astore_1
    //   82: aload_0
    //   83: monitorexit
    //   84: aload_1
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	a
    //   18	2	1	locala	j6.a
    //   50	6	1	localThrowable	Throwable
    //   81	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   26	47	50	finally
    //   7	19	81	finally
    //   51	60	81	finally
    //   60	77	81	finally
    //   78	80	81	finally
    //   82	84	81	finally
  }
  
  /* Error */
  public final void c()
  {
    // Byte code:
    //   0: ldc -114
    //   2: invokestatic 146	m6/j:h	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 43	y5/a:c	Z
    //   11: ifeq +7 -> 18
    //   14: aload_0
    //   15: invokevirtual 67	y5/a:b	()V
    //   18: aload_0
    //   19: getfield 41	y5/a:f	Landroid/content/Context;
    //   22: astore_1
    //   23: aload_1
    //   24: invokevirtual 173	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   27: ldc -81
    //   29: iconst_0
    //   30: invokevirtual 181	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   33: pop
    //   34: getstatic 186	j6/f:b	Lj6/f;
    //   37: aload_1
    //   38: ldc -69
    //   40: invokevirtual 190	j6/f:c	(Landroid/content/Context;I)I
    //   43: istore_2
    //   44: iload_2
    //   45: ifeq +23 -> 68
    //   48: iload_2
    //   49: iconst_2
    //   50: if_icmpne +6 -> 56
    //   53: goto +15 -> 68
    //   56: new 192	java/io/IOException
    //   59: astore_3
    //   60: aload_3
    //   61: ldc -62
    //   63: invokespecial 196	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   66: aload_3
    //   67: athrow
    //   68: new 198	j6/a
    //   71: astore_3
    //   72: aload_3
    //   73: invokespecial 199	j6/a:<init>	()V
    //   76: new 201	android/content/Intent
    //   79: astore 4
    //   81: aload 4
    //   83: ldc -53
    //   85: invokespecial 204	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   88: aload 4
    //   90: ldc -50
    //   92: invokevirtual 210	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   95: pop
    //   96: invokestatic 153	u6/a:b	()Lu6/a;
    //   99: aload_1
    //   100: aload 4
    //   102: aload_3
    //   103: iconst_1
    //   104: invokevirtual 213	u6/a:a	(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   107: istore 5
    //   109: iload 5
    //   111: ifeq +59 -> 170
    //   114: aload_0
    //   115: aload_3
    //   116: putfield 148	y5/a:a	Lj6/a;
    //   119: aload_3
    //   120: getstatic 219	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   123: invokevirtual 222	j6/a:b	(Ljava/util/concurrent/TimeUnit;)Landroid/os/IBinder;
    //   126: invokestatic 228	com/google/android/gms/internal/ads_identifier/zze:zza	(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads_identifier/zzf;
    //   129: astore_3
    //   130: aload_0
    //   131: aload_3
    //   132: putfield 165	y5/a:b	Lcom/google/android/gms/internal/ads_identifier/zzf;
    //   135: aload_0
    //   136: iconst_1
    //   137: putfield 43	y5/a:c	Z
    //   140: aload_0
    //   141: monitorexit
    //   142: return
    //   143: astore 4
    //   145: new 192	java/io/IOException
    //   148: astore_3
    //   149: aload_3
    //   150: aload 4
    //   152: invokespecial 231	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   155: aload_3
    //   156: athrow
    //   157: astore_3
    //   158: new 192	java/io/IOException
    //   161: astore_3
    //   162: aload_3
    //   163: ldc -23
    //   165: invokespecial 196	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   168: aload_3
    //   169: athrow
    //   170: new 192	java/io/IOException
    //   173: astore_3
    //   174: aload_3
    //   175: ldc -21
    //   177: invokespecial 196	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   180: aload_3
    //   181: athrow
    //   182: astore_3
    //   183: new 192	java/io/IOException
    //   186: astore 4
    //   188: aload 4
    //   190: aload_3
    //   191: invokespecial 231	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   194: aload 4
    //   196: athrow
    //   197: astore_3
    //   198: new 237	j6/g
    //   201: astore_3
    //   202: aload_3
    //   203: bipush 9
    //   205: invokespecial 240	j6/g:<init>	(I)V
    //   208: aload_3
    //   209: athrow
    //   210: astore_3
    //   211: aload_0
    //   212: monitorexit
    //   213: aload_3
    //   214: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	215	0	this	a
    //   22	78	1	localContext	Context
    //   43	8	2	i	int
    //   59	97	3	localObject1	Object
    //   157	1	3	localInterruptedException	InterruptedException
    //   161	20	3	localIOException1	java.io.IOException
    //   182	9	3	localThrowable1	Throwable
    //   197	1	3	localNameNotFoundException	android.content.pm.PackageManager.NameNotFoundException
    //   201	8	3	localg	j6.g
    //   210	4	3	localObject2	Object
    //   79	22	4	localIntent	android.content.Intent
    //   143	8	4	localThrowable2	Throwable
    //   186	9	4	localIOException2	java.io.IOException
    //   107	3	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   119	130	143	finally
    //   119	130	157	java/lang/InterruptedException
    //   96	109	182	finally
    //   23	34	197	android/content/pm/PackageManager$NameNotFoundException
    //   7	18	210	finally
    //   18	23	210	finally
    //   23	34	210	finally
    //   34	44	210	finally
    //   56	68	210	finally
    //   68	96	210	finally
    //   114	119	210	finally
    //   130	142	210	finally
    //   145	157	210	finally
    //   158	170	210	finally
    //   170	182	210	finally
    //   183	197	210	finally
    //   198	210	210	finally
    //   211	213	210	finally
  }
  
  /* Error */
  public final a e()
  {
    // Byte code:
    //   0: ldc -114
    //   2: invokestatic 146	m6/j:h	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 43	y5/a:c	Z
    //   11: ifne +86 -> 97
    //   14: aload_0
    //   15: getfield 27	y5/a:d	Ljava/lang/Object;
    //   18: astore_1
    //   19: aload_1
    //   20: monitorenter
    //   21: aload_0
    //   22: getfield 246	y5/a:e	Ly5/c;
    //   25: astore_2
    //   26: aload_2
    //   27: ifnull +52 -> 79
    //   30: aload_2
    //   31: getfield 250	y5/c:d	Z
    //   34: ifeq +45 -> 79
    //   37: aload_1
    //   38: monitorexit
    //   39: aload_0
    //   40: invokevirtual 59	y5/a:c	()V
    //   43: aload_0
    //   44: getfield 43	y5/a:c	Z
    //   47: ifeq +6 -> 53
    //   50: goto +47 -> 97
    //   53: new 192	java/io/IOException
    //   56: astore_1
    //   57: aload_1
    //   58: ldc -4
    //   60: invokespecial 196	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   63: aload_1
    //   64: athrow
    //   65: astore_2
    //   66: new 192	java/io/IOException
    //   69: astore_1
    //   70: aload_1
    //   71: ldc -4
    //   73: aload_2
    //   74: invokespecial 255	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   77: aload_1
    //   78: athrow
    //   79: new 192	java/io/IOException
    //   82: astore_2
    //   83: aload_2
    //   84: ldc_w 257
    //   87: invokespecial 196	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   90: aload_2
    //   91: athrow
    //   92: astore_2
    //   93: aload_1
    //   94: monitorexit
    //   95: aload_2
    //   96: athrow
    //   97: aload_0
    //   98: getfield 148	y5/a:a	Lj6/a;
    //   101: invokestatic 33	m6/j:i	(Ljava/lang/Object;)V
    //   104: aload_0
    //   105: getfield 165	y5/a:b	Lcom/google/android/gms/internal/ads_identifier/zzf;
    //   108: invokestatic 33	m6/j:i	(Ljava/lang/Object;)V
    //   111: new 6	y5/a$a
    //   114: astore_1
    //   115: aload_1
    //   116: aload_0
    //   117: getfield 165	y5/a:b	Lcom/google/android/gms/internal/ads_identifier/zzf;
    //   120: invokeinterface 262 1 0
    //   125: aload_0
    //   126: getfield 165	y5/a:b	Lcom/google/android/gms/internal/ads_identifier/zzf;
    //   129: iconst_1
    //   130: invokeinterface 266 2 0
    //   135: invokespecial 269	y5/a$a:<init>	(Ljava/lang/String;Z)V
    //   138: aload_0
    //   139: monitorexit
    //   140: aload_0
    //   141: invokevirtual 271	y5/a:f	()V
    //   144: aload_1
    //   145: areturn
    //   146: astore_1
    //   147: ldc 123
    //   149: ldc_w 273
    //   152: aload_1
    //   153: invokestatic 163	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   156: pop
    //   157: new 192	java/io/IOException
    //   160: astore_1
    //   161: aload_1
    //   162: ldc_w 275
    //   165: invokespecial 196	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   168: aload_1
    //   169: athrow
    //   170: astore_1
    //   171: aload_0
    //   172: monitorexit
    //   173: aload_1
    //   174: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	175	0	this	a
    //   146	7	1	localRemoteException	android.os.RemoteException
    //   160	9	1	localIOException1	java.io.IOException
    //   170	4	1	localObject2	Object
    //   25	6	2	localc	c
    //   65	9	2	localException	Exception
    //   82	9	2	localIOException2	java.io.IOException
    //   92	4	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   39	43	65	java/lang/Exception
    //   21	26	92	finally
    //   30	39	92	finally
    //   79	92	92	finally
    //   93	95	92	finally
    //   111	138	146	android/os/RemoteException
    //   7	21	170	finally
    //   39	43	170	finally
    //   43	50	170	finally
    //   53	65	170	finally
    //   66	79	170	finally
    //   95	97	170	finally
    //   97	111	170	finally
    //   111	138	170	finally
    //   138	140	170	finally
    //   147	170	170	finally
    //   171	173	170	finally
  }
  
  public final void f()
  {
    c localc;
    synchronized (d)
    {
      localc = e;
      if (localc != null) {
        c.countDown();
      }
    }
    try
    {
      e.join();
      long l = g;
      if (l > 0L)
      {
        localc = new y5/c;
        localc.<init>(this, l);
        e = localc;
      }
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public final void finalize()
  {
    b();
    super.finalize();
  }
  
  public static final class a
  {
    public final String a;
    public final boolean b;
    
    @Deprecated
    public a(String paramString, boolean paramBoolean)
    {
      a = paramString;
      b = paramBoolean;
    }
    
    public final String toString()
    {
      String str = a;
      boolean bool = b;
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 7);
      localStringBuilder.append("{");
      localStringBuilder.append(str);
      localStringBuilder.append("}");
      localStringBuilder.append(bool);
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     y5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */