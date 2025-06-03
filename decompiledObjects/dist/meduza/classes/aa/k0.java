package aa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class k0
  implements Runnable
{
  public static final Object f = new Object();
  public static Boolean o;
  public static Boolean p;
  public final Context a;
  public final r b;
  public final PowerManager.WakeLock c;
  public final j0 d;
  public final long e;
  
  public k0(j0 paramj0, Context paramContext, r paramr, long paramLong)
  {
    d = paramj0;
    a = paramContext;
    e = paramLong;
    b = paramr;
    c = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
  }
  
  public static boolean a(Context paramContext)
  {
    synchronized (f)
    {
      Boolean localBoolean = p;
      if (localBoolean == null) {
        bool = b(paramContext, "android.permission.ACCESS_NETWORK_STATE", localBoolean);
      } else {
        bool = localBoolean.booleanValue();
      }
      paramContext = Boolean.valueOf(bool);
      p = paramContext;
      boolean bool = paramContext.booleanValue();
      return bool;
    }
  }
  
  public static boolean b(Context paramContext, String paramString, Boolean paramBoolean)
  {
    if (paramBoolean != null) {
      return paramBoolean.booleanValue();
    }
    boolean bool;
    if (paramContext.checkCallingOrSelfPermission(paramString) == 0) {
      bool = true;
    } else {
      bool = false;
    }
    if ((!bool) && (Log.isLoggable("FirebaseMessaging", 3)))
    {
      paramContext = new StringBuilder();
      paramContext.append("Missing Permission: ");
      paramContext.append(paramString);
      paramContext.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
      Log.d("FirebaseMessaging", paramContext.toString());
    }
    return bool;
  }
  
  public static boolean c(Context paramContext)
  {
    synchronized (f)
    {
      Boolean localBoolean = o;
      if (localBoolean == null) {
        bool = b(paramContext, "android.permission.WAKE_LOCK", localBoolean);
      } else {
        bool = localBoolean.booleanValue();
      }
      paramContext = Boolean.valueOf(bool);
      o = paramContext;
      boolean bool = paramContext.booleanValue();
      return bool;
    }
  }
  
  public final boolean d()
  {
    try
    {
      Object localObject1 = (ConnectivityManager)a.getSystemService("connectivity");
      if (localObject1 != null) {
        localObject1 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
      } else {
        localObject1 = null;
      }
      if (localObject1 != null)
      {
        bool = ((NetworkInfo)localObject1).isConnected();
        if (bool)
        {
          bool = true;
          break label49;
        }
      }
      boolean bool = false;
      label49:
      return bool;
    }
    finally {}
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 36	aa/k0:a	Landroid/content/Context;
    //   4: invokestatic 130	aa/k0:c	(Landroid/content/Context;)Z
    //   7: ifeq +13 -> 20
    //   10: aload_0
    //   11: getfield 58	aa/k0:c	Landroid/os/PowerManager$WakeLock;
    //   14: getstatic 134	aa/f:a	J
    //   17: invokevirtual 140	android/os/PowerManager$WakeLock:acquire	(J)V
    //   20: aload_0
    //   21: getfield 34	aa/k0:d	Laa/j0;
    //   24: astore_1
    //   25: aload_1
    //   26: monitorenter
    //   27: aload_1
    //   28: iconst_1
    //   29: putfield 146	aa/j0:g	Z
    //   32: aload_1
    //   33: monitorexit
    //   34: aload_0
    //   35: getfield 40	aa/k0:b	Laa/r;
    //   38: invokevirtual 150	aa/r:c	()Z
    //   41: ifne +60 -> 101
    //   44: aload_0
    //   45: getfield 34	aa/k0:d	Laa/j0;
    //   48: astore_1
    //   49: aload_1
    //   50: monitorenter
    //   51: aload_1
    //   52: iconst_0
    //   53: putfield 146	aa/j0:g	Z
    //   56: aload_1
    //   57: monitorexit
    //   58: aload_0
    //   59: getfield 36	aa/k0:a	Landroid/content/Context;
    //   62: invokestatic 130	aa/k0:c	(Landroid/content/Context;)Z
    //   65: ifeq +22 -> 87
    //   68: aload_0
    //   69: getfield 58	aa/k0:c	Landroid/os/PowerManager$WakeLock;
    //   72: invokevirtual 153	android/os/PowerManager$WakeLock:release	()V
    //   75: goto +12 -> 87
    //   78: astore_1
    //   79: ldc 82
    //   81: ldc -101
    //   83: invokestatic 158	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   86: pop
    //   87: return
    //   88: astore_2
    //   89: aload_1
    //   90: monitorexit
    //   91: aload_2
    //   92: athrow
    //   93: astore_1
    //   94: goto +217 -> 311
    //   97: astore_2
    //   98: goto +130 -> 228
    //   101: aload_0
    //   102: getfield 36	aa/k0:a	Landroid/content/Context;
    //   105: invokestatic 160	aa/k0:a	(Landroid/content/Context;)Z
    //   108: ifeq +54 -> 162
    //   111: aload_0
    //   112: invokevirtual 162	aa/k0:d	()Z
    //   115: ifne +47 -> 162
    //   118: new 8	aa/k0$a
    //   121: astore_1
    //   122: aload_1
    //   123: aload_0
    //   124: aload_0
    //   125: invokespecial 165	aa/k0$a:<init>	(Laa/k0;Laa/k0;)V
    //   128: aload_1
    //   129: invokevirtual 167	aa/k0$a:a	()V
    //   132: aload_0
    //   133: getfield 36	aa/k0:a	Landroid/content/Context;
    //   136: invokestatic 130	aa/k0:c	(Landroid/content/Context;)Z
    //   139: ifeq +22 -> 161
    //   142: aload_0
    //   143: getfield 58	aa/k0:c	Landroid/os/PowerManager$WakeLock;
    //   146: invokevirtual 153	android/os/PowerManager$WakeLock:release	()V
    //   149: goto +12 -> 161
    //   152: astore_1
    //   153: ldc 82
    //   155: ldc -101
    //   157: invokestatic 158	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   160: pop
    //   161: return
    //   162: aload_0
    //   163: getfield 34	aa/k0:d	Laa/j0;
    //   166: invokevirtual 169	aa/j0:g	()Z
    //   169: ifeq +25 -> 194
    //   172: aload_0
    //   173: getfield 34	aa/k0:d	Laa/j0;
    //   176: astore_2
    //   177: aload_2
    //   178: monitorenter
    //   179: aload_2
    //   180: iconst_0
    //   181: putfield 146	aa/j0:g	Z
    //   184: aload_2
    //   185: monitorexit
    //   186: goto +19 -> 205
    //   189: astore_1
    //   190: aload_2
    //   191: monitorexit
    //   192: aload_1
    //   193: athrow
    //   194: aload_0
    //   195: getfield 34	aa/k0:d	Laa/j0;
    //   198: aload_0
    //   199: getfield 38	aa/k0:e	J
    //   202: invokevirtual 172	aa/j0:h	(J)V
    //   205: aload_0
    //   206: getfield 36	aa/k0:a	Landroid/content/Context;
    //   209: invokestatic 130	aa/k0:c	(Landroid/content/Context;)Z
    //   212: ifeq +93 -> 305
    //   215: aload_0
    //   216: getfield 58	aa/k0:c	Landroid/os/PowerManager$WakeLock;
    //   219: astore_1
    //   220: goto +69 -> 289
    //   223: astore_2
    //   224: aload_1
    //   225: monitorexit
    //   226: aload_2
    //   227: athrow
    //   228: new 90	java/lang/StringBuilder
    //   231: astore_1
    //   232: aload_1
    //   233: invokespecial 91	java/lang/StringBuilder:<init>	()V
    //   236: aload_1
    //   237: ldc -82
    //   239: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   242: pop
    //   243: aload_1
    //   244: aload_2
    //   245: invokevirtual 179	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   248: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   251: pop
    //   252: ldc 82
    //   254: aload_1
    //   255: invokevirtual 103	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   258: invokestatic 181	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   261: pop
    //   262: aload_0
    //   263: getfield 34	aa/k0:d	Laa/j0;
    //   266: astore_2
    //   267: aload_2
    //   268: monitorenter
    //   269: aload_2
    //   270: iconst_0
    //   271: putfield 146	aa/j0:g	Z
    //   274: aload_2
    //   275: monitorexit
    //   276: aload_0
    //   277: getfield 36	aa/k0:a	Landroid/content/Context;
    //   280: invokestatic 130	aa/k0:c	(Landroid/content/Context;)Z
    //   283: ifeq +22 -> 305
    //   286: goto -71 -> 215
    //   289: aload_1
    //   290: invokevirtual 153	android/os/PowerManager$WakeLock:release	()V
    //   293: goto +12 -> 305
    //   296: astore_1
    //   297: ldc 82
    //   299: ldc -101
    //   301: invokestatic 158	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   304: pop
    //   305: return
    //   306: astore_1
    //   307: aload_2
    //   308: monitorexit
    //   309: aload_1
    //   310: athrow
    //   311: aload_0
    //   312: getfield 36	aa/k0:a	Landroid/content/Context;
    //   315: invokestatic 130	aa/k0:c	(Landroid/content/Context;)Z
    //   318: ifeq +22 -> 340
    //   321: aload_0
    //   322: getfield 58	aa/k0:c	Landroid/os/PowerManager$WakeLock;
    //   325: invokevirtual 153	android/os/PowerManager$WakeLock:release	()V
    //   328: goto +12 -> 340
    //   331: astore_2
    //   332: ldc 82
    //   334: ldc -101
    //   336: invokestatic 158	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   339: pop
    //   340: aload_1
    //   341: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	342	0	this	k0
    //   24	33	1	localj01	j0
    //   78	12	1	localRuntimeException1	RuntimeException
    //   93	1	1	localObject1	Object
    //   121	8	1	locala	a
    //   152	1	1	localRuntimeException2	RuntimeException
    //   189	4	1	localObject2	Object
    //   219	71	1	localObject3	Object
    //   296	1	1	localRuntimeException3	RuntimeException
    //   306	35	1	localObject4	Object
    //   88	4	2	localObject5	Object
    //   97	1	2	localIOException	java.io.IOException
    //   176	15	2	localj02	j0
    //   223	22	2	localObject6	Object
    //   331	1	2	localRuntimeException4	RuntimeException
    // Exception table:
    //   from	to	target	type
    //   68	75	78	java/lang/RuntimeException
    //   51	56	88	finally
    //   20	27	93	finally
    //   32	51	93	finally
    //   56	58	93	finally
    //   89	93	93	finally
    //   101	132	93	finally
    //   162	179	93	finally
    //   184	186	93	finally
    //   190	194	93	finally
    //   194	205	93	finally
    //   224	228	93	finally
    //   228	269	93	finally
    //   274	276	93	finally
    //   307	311	93	finally
    //   20	27	97	java/io/IOException
    //   32	51	97	java/io/IOException
    //   56	58	97	java/io/IOException
    //   89	93	97	java/io/IOException
    //   101	132	97	java/io/IOException
    //   162	179	97	java/io/IOException
    //   184	186	97	java/io/IOException
    //   190	194	97	java/io/IOException
    //   194	205	97	java/io/IOException
    //   224	228	97	java/io/IOException
    //   142	149	152	java/lang/RuntimeException
    //   179	184	189	finally
    //   27	32	223	finally
    //   215	220	296	java/lang/RuntimeException
    //   289	293	296	java/lang/RuntimeException
    //   269	274	306	finally
    //   321	328	331	java/lang/RuntimeException
  }
  
  public final class a
    extends BroadcastReceiver
  {
    public k0 a;
    
    public a(k0 paramk0)
    {
      a = paramk0;
    }
    
    public final void a()
    {
      int i;
      if ((!Log.isLoggable("FirebaseMessaging", 3)) && ((Build.VERSION.SDK_INT != 23) || (!Log.isLoggable("FirebaseMessaging", 3)))) {
        i = 0;
      } else {
        i = 1;
      }
      if (i != 0) {
        Log.d("FirebaseMessaging", "Connectivity change received registered");
      }
      a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      try
      {
        paramIntent = a;
        if (paramIntent == null) {
          return;
        }
        boolean bool = paramIntent.d();
        if (!bool) {
          return;
        }
        int i;
        if ((!Log.isLoggable("FirebaseMessaging", 3)) && ((Build.VERSION.SDK_INT != 23) || (!Log.isLoggable("FirebaseMessaging", 3)))) {
          i = 0;
        } else {
          i = 1;
        }
        if (i != 0) {
          Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
        }
        paramIntent = a;
        d.f.schedule(paramIntent, 0L, TimeUnit.SECONDS);
        paramContext.unregisterReceiver(this);
        a = null;
        return;
      }
      finally {}
    }
  }
}

/* Location:
 * Qualified Name:     aa.k0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */