package s2;

import A2.n;
import J2.f;
import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

public class a
{
  public x2.a a;
  public f b;
  public boolean c;
  public final Object d = new Object();
  public c e;
  public final Context f;
  public final long g;
  
  public a(Context paramContext, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    n.i(paramContext);
    Object localObject = paramContext;
    if (paramBoolean1)
    {
      Context localContext = paramContext.getApplicationContext();
      localObject = paramContext;
      if (localContext != null) {
        localObject = localContext;
      }
    }
    f = ((Context)localObject);
    c = false;
    g = paramLong;
  }
  
  public static a a(Context paramContext)
  {
    paramContext = new a(paramContext, -1L, true, false);
    try
    {
      long l = SystemClock.elapsedRealtime();
      paramContext.d(false);
      a locala = paramContext.f(-1);
      paramContext.e(locala, true, 0.0F, SystemClock.elapsedRealtime() - l, "", null);
      paramContext.c();
      return locala;
    }
    finally
    {
      try
      {
        paramContext.e(null, true, 0.0F, -1L, "", localThrowable);
        throw localThrowable;
      }
      finally
      {
        paramContext.c();
      }
    }
  }
  
  public static void b(boolean paramBoolean) {}
  
  /* Error */
  public final void c()
  {
    // Byte code:
    //   0: ldc 72
    //   2: invokestatic 76	A2/n:h	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 41	s2/a:f	Landroid/content/Context;
    //   11: ifnull +71 -> 82
    //   14: aload_0
    //   15: getfield 78	s2/a:a	Lx2/a;
    //   18: astore_1
    //   19: aload_1
    //   20: ifnonnull +6 -> 26
    //   23: goto +59 -> 82
    //   26: aload_0
    //   27: getfield 43	s2/a:c	Z
    //   30: ifeq +30 -> 60
    //   33: invokestatic 83	D2/b:b	()LD2/b;
    //   36: aload_0
    //   37: getfield 41	s2/a:f	Landroid/content/Context;
    //   40: aload_0
    //   41: getfield 78	s2/a:a	Lx2/a;
    //   44: invokevirtual 86	D2/b:c	(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    //   47: goto +13 -> 60
    //   50: astore_1
    //   51: ldc 88
    //   53: ldc 90
    //   55: aload_1
    //   56: invokestatic 95	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   59: pop
    //   60: aload_0
    //   61: iconst_0
    //   62: putfield 43	s2/a:c	Z
    //   65: aload_0
    //   66: aconst_null
    //   67: putfield 97	s2/a:b	LJ2/f;
    //   70: aload_0
    //   71: aconst_null
    //   72: putfield 78	s2/a:a	Lx2/a;
    //   75: aload_0
    //   76: monitorexit
    //   77: return
    //   78: astore_1
    //   79: goto +6 -> 85
    //   82: aload_0
    //   83: monitorexit
    //   84: return
    //   85: aload_0
    //   86: monitorexit
    //   87: aload_1
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	a
    //   18	2	1	locala	x2.a
    //   50	6	1	localThrowable	Throwable
    //   78	10	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   26	47	50	finally
    //   7	19	78	finally
    //   51	60	78	finally
    //   60	77	78	finally
    //   82	84	78	finally
    //   85	87	78	finally
  }
  
  /* Error */
  public final void d(boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 72
    //   2: invokestatic 76	A2/n:h	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 43	s2/a:c	Z
    //   11: ifeq +14 -> 25
    //   14: aload_0
    //   15: invokevirtual 70	s2/a:c	()V
    //   18: goto +7 -> 25
    //   21: astore_2
    //   22: goto +211 -> 233
    //   25: aload_0
    //   26: getfield 41	s2/a:f	Landroid/content/Context;
    //   29: astore_2
    //   30: aload_2
    //   31: invokevirtual 105	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   34: ldc 107
    //   36: iconst_0
    //   37: invokevirtual 113	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   40: pop
    //   41: invokestatic 118	x2/k:f	()Lx2/k;
    //   44: aload_2
    //   45: ldc 119
    //   47: invokevirtual 122	x2/k:h	(Landroid/content/Context;I)I
    //   50: istore_3
    //   51: iload_3
    //   52: ifeq +23 -> 75
    //   55: iload_3
    //   56: iconst_2
    //   57: if_icmpne +6 -> 63
    //   60: goto +15 -> 75
    //   63: new 124	java/io/IOException
    //   66: astore_2
    //   67: aload_2
    //   68: ldc 126
    //   70: invokespecial 128	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   73: aload_2
    //   74: athrow
    //   75: new 130	x2/a
    //   78: astore 4
    //   80: aload 4
    //   82: invokespecial 131	x2/a:<init>	()V
    //   85: new 133	android/content/Intent
    //   88: astore 5
    //   90: aload 5
    //   92: ldc -121
    //   94: invokespecial 136	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   97: aload 5
    //   99: ldc -118
    //   101: invokevirtual 142	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   104: pop
    //   105: invokestatic 83	D2/b:b	()LD2/b;
    //   108: aload_2
    //   109: aload 5
    //   111: aload 4
    //   113: iconst_1
    //   114: invokevirtual 145	D2/b:a	(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   117: istore 6
    //   119: iload 6
    //   121: ifeq +73 -> 194
    //   124: aload_0
    //   125: aload 4
    //   127: putfield 78	s2/a:a	Lx2/a;
    //   130: aload 4
    //   132: ldc2_w 146
    //   135: getstatic 153	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   138: invokevirtual 156	x2/a:a	(JLjava/util/concurrent/TimeUnit;)Landroid/os/IBinder;
    //   141: invokestatic 162	J2/e:n	(Landroid/os/IBinder;)LJ2/f;
    //   144: astore_2
    //   145: aload_0
    //   146: aload_2
    //   147: putfield 97	s2/a:b	LJ2/f;
    //   150: aload_0
    //   151: iconst_1
    //   152: putfield 43	s2/a:c	Z
    //   155: iload_1
    //   156: ifeq +7 -> 163
    //   159: aload_0
    //   160: invokevirtual 164	s2/a:g	()V
    //   163: aload_0
    //   164: monitorexit
    //   165: return
    //   166: astore_2
    //   167: new 124	java/io/IOException
    //   170: astore 4
    //   172: aload 4
    //   174: aload_2
    //   175: invokespecial 167	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   178: aload 4
    //   180: athrow
    //   181: astore_2
    //   182: new 124	java/io/IOException
    //   185: astore_2
    //   186: aload_2
    //   187: ldc -87
    //   189: invokespecial 128	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   192: aload_2
    //   193: athrow
    //   194: new 124	java/io/IOException
    //   197: astore_2
    //   198: aload_2
    //   199: ldc -85
    //   201: invokespecial 128	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   204: aload_2
    //   205: athrow
    //   206: astore 4
    //   208: new 124	java/io/IOException
    //   211: astore_2
    //   212: aload_2
    //   213: aload 4
    //   215: invokespecial 167	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   218: aload_2
    //   219: athrow
    //   220: astore_2
    //   221: new 173	x2/l
    //   224: astore_2
    //   225: aload_2
    //   226: bipush 9
    //   228: invokespecial 176	x2/l:<init>	(I)V
    //   231: aload_2
    //   232: athrow
    //   233: aload_0
    //   234: monitorexit
    //   235: aload_2
    //   236: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	237	0	this	a
    //   0	237	1	paramBoolean	boolean
    //   21	1	2	localObject1	Object
    //   29	118	2	localObject2	Object
    //   166	9	2	localThrowable1	Throwable
    //   181	1	2	localInterruptedException	InterruptedException
    //   185	34	2	localIOException	java.io.IOException
    //   220	1	2	localNameNotFoundException	android.content.pm.PackageManager.NameNotFoundException
    //   224	12	2	locall	x2.l
    //   50	8	3	i	int
    //   78	101	4	localObject3	Object
    //   206	8	4	localThrowable2	Throwable
    //   88	22	5	localIntent	android.content.Intent
    //   117	3	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   7	18	21	finally
    //   25	30	21	finally
    //   30	41	21	finally
    //   41	51	21	finally
    //   63	75	21	finally
    //   75	105	21	finally
    //   124	130	21	finally
    //   145	155	21	finally
    //   159	163	21	finally
    //   163	165	21	finally
    //   167	181	21	finally
    //   182	194	21	finally
    //   194	206	21	finally
    //   208	220	21	finally
    //   221	233	21	finally
    //   233	235	21	finally
    //   130	145	166	finally
    //   130	145	181	java/lang/InterruptedException
    //   105	119	206	finally
    //   30	41	220	android/content/pm/PackageManager$NameNotFoundException
  }
  
  public final boolean e(a parama, boolean paramBoolean, float paramFloat, long paramLong, String paramString, Throwable paramThrowable)
  {
    if (Math.random() <= 0.0D)
    {
      HashMap localHashMap = new HashMap();
      paramString = "1";
      localHashMap.put("app_context", "1");
      if (parama != null)
      {
        if (true != parama.b()) {
          paramString = "0";
        }
        localHashMap.put("limit_ad_tracking", paramString);
        parama = parama.a();
        if (parama != null) {
          localHashMap.put("ad_id_size", Integer.toString(parama.length()));
        }
      }
      if (paramThrowable != null) {
        localHashMap.put("error", paramThrowable.getClass().getName());
      }
      localHashMap.put("tag", "AdvertisingIdClient");
      localHashMap.put("time_spent", Long.toString(paramLong));
      new b(this, localHashMap).start();
      return true;
    }
    return false;
  }
  
  /* Error */
  public final a f(int paramInt)
  {
    // Byte code:
    //   0: ldc 72
    //   2: invokestatic 76	A2/n:h	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 43	s2/a:c	Z
    //   11: ifne +96 -> 107
    //   14: aload_0
    //   15: getfield 27	s2/a:d	Ljava/lang/Object;
    //   18: astore_2
    //   19: aload_2
    //   20: monitorenter
    //   21: aload_0
    //   22: getfield 255	s2/a:e	Ls2/c;
    //   25: astore_3
    //   26: aload_3
    //   27: ifnull +63 -> 90
    //   30: aload_3
    //   31: getfield 260	s2/c:r	Z
    //   34: ifeq +56 -> 90
    //   37: aload_2
    //   38: monitorexit
    //   39: aload_0
    //   40: iconst_0
    //   41: invokevirtual 60	s2/a:d	(Z)V
    //   44: aload_0
    //   45: getfield 43	s2/a:c	Z
    //   48: ifeq +6 -> 54
    //   51: goto +56 -> 107
    //   54: new 124	java/io/IOException
    //   57: astore_2
    //   58: aload_2
    //   59: ldc_w 262
    //   62: invokespecial 128	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   65: aload_2
    //   66: athrow
    //   67: astore_2
    //   68: goto +114 -> 182
    //   71: astore_3
    //   72: new 124	java/io/IOException
    //   75: astore_2
    //   76: aload_2
    //   77: ldc_w 262
    //   80: aload_3
    //   81: invokespecial 265	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   84: aload_2
    //   85: athrow
    //   86: astore_3
    //   87: goto +16 -> 103
    //   90: new 124	java/io/IOException
    //   93: astore_3
    //   94: aload_3
    //   95: ldc_w 267
    //   98: invokespecial 128	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   101: aload_3
    //   102: athrow
    //   103: aload_2
    //   104: monitorexit
    //   105: aload_3
    //   106: athrow
    //   107: aload_0
    //   108: getfield 78	s2/a:a	Lx2/a;
    //   111: invokestatic 33	A2/n:i	(Ljava/lang/Object;)Ljava/lang/Object;
    //   114: pop
    //   115: aload_0
    //   116: getfield 97	s2/a:b	LJ2/f;
    //   119: invokestatic 33	A2/n:i	(Ljava/lang/Object;)Ljava/lang/Object;
    //   122: pop
    //   123: new 6	s2/a$a
    //   126: astore_2
    //   127: aload_2
    //   128: aload_0
    //   129: getfield 97	s2/a:b	LJ2/f;
    //   132: invokeinterface 271 1 0
    //   137: aload_0
    //   138: getfield 97	s2/a:b	LJ2/f;
    //   141: iconst_1
    //   142: invokeinterface 275 2 0
    //   147: invokespecial 278	s2/a$a:<init>	(Ljava/lang/String;Z)V
    //   150: aload_0
    //   151: monitorexit
    //   152: aload_0
    //   153: invokevirtual 164	s2/a:g	()V
    //   156: aload_2
    //   157: areturn
    //   158: astore_2
    //   159: ldc 88
    //   161: ldc_w 280
    //   164: aload_2
    //   165: invokestatic 95	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   168: pop
    //   169: new 124	java/io/IOException
    //   172: astore_2
    //   173: aload_2
    //   174: ldc_w 282
    //   177: invokespecial 128	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   180: aload_2
    //   181: athrow
    //   182: aload_0
    //   183: monitorexit
    //   184: aload_2
    //   185: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	186	0	this	a
    //   0	186	1	paramInt	int
    //   18	48	2	localObject1	Object
    //   67	1	2	localObject2	Object
    //   75	82	2	localObject3	Object
    //   158	7	2	localRemoteException	android.os.RemoteException
    //   172	13	2	localIOException1	java.io.IOException
    //   25	6	3	localc	c
    //   71	10	3	localException	Exception
    //   86	1	3	localObject4	Object
    //   93	13	3	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   7	21	67	finally
    //   39	44	67	finally
    //   44	51	67	finally
    //   54	67	67	finally
    //   72	86	67	finally
    //   105	107	67	finally
    //   107	123	67	finally
    //   123	150	67	finally
    //   150	152	67	finally
    //   159	182	67	finally
    //   182	184	67	finally
    //   39	44	71	java/lang/Exception
    //   21	26	86	finally
    //   30	39	86	finally
    //   90	103	86	finally
    //   103	105	86	finally
    //   123	150	158	android/os/RemoteException
  }
  
  public final void finalize()
  {
    c();
    super.finalize();
  }
  
  public final void g()
  {
    synchronized (d)
    {
      c localc1 = e;
      if (localc1 != null) {
        q.countDown();
      }
    }
    long l = g;
    c localc2;
    if (l > 0L)
    {
      localc2 = new s2/c;
      localc2.<init>(this, l);
      e = localc2;
    }
    return;
    throw localc2;
  }
  
  public static final class a
  {
    public final String a;
    public final boolean b;
    
    public a(String paramString, boolean paramBoolean)
    {
      a = paramString;
      b = paramBoolean;
    }
    
    public String a()
    {
      return a;
    }
    
    public boolean b()
    {
      return b;
    }
    
    public String toString()
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
 * Qualified Name:     s2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */