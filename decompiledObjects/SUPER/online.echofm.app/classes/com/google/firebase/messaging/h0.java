package com.google.firebase.messaging;

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

public class h0
  implements Runnable
{
  public static final Object t = new Object();
  public static Boolean u;
  public static Boolean v;
  public final Context o;
  public final K p;
  public final PowerManager.WakeLock q;
  public final g0 r;
  public final long s;
  
  public h0(g0 paramg0, Context paramContext, K paramK, long paramLong)
  {
    r = paramg0;
    o = paramContext;
    s = paramLong;
    p = paramK;
    q = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
  }
  
  public static String e(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Missing Permission: ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
    return localStringBuilder.toString();
  }
  
  public static boolean f(Context paramContext)
  {
    Boolean localBoolean;
    synchronized (t)
    {
      localBoolean = v;
      if (localBoolean == null) {
        bool = g(paramContext, "android.permission.ACCESS_NETWORK_STATE", localBoolean);
      }
    }
    boolean bool = localBoolean.booleanValue();
    paramContext = Boolean.valueOf(bool);
    v = paramContext;
    bool = paramContext.booleanValue();
    return bool;
  }
  
  public static boolean g(Context paramContext, String paramString, Boolean paramBoolean)
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
    if ((!bool) && (Log.isLoggable("FirebaseMessaging", 3))) {
      Log.d("FirebaseMessaging", e(paramString));
    }
    return bool;
  }
  
  public static boolean h(Context paramContext)
  {
    Boolean localBoolean;
    synchronized (t)
    {
      localBoolean = u;
      if (localBoolean == null) {
        bool = g(paramContext, "android.permission.WAKE_LOCK", localBoolean);
      }
    }
    boolean bool = localBoolean.booleanValue();
    paramContext = Boolean.valueOf(bool);
    u = paramContext;
    bool = paramContext.booleanValue();
    return bool;
  }
  
  public static boolean j()
  {
    boolean bool;
    if ((!Log.isLoggable("FirebaseMessaging", 3)) && ((Build.VERSION.SDK_INT != 23) || (!Log.isLoggable("FirebaseMessaging", 3)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean i()
  {
    try
    {
      Object localObject1 = (ConnectivityManager)o.getSystemService("connectivity");
      if (localObject1 != null) {
        localObject1 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
      }
    }
    finally
    {
      break label57;
    }
    Object localObject3 = null;
    if (localObject3 != null)
    {
      bool = ((NetworkInfo)localObject3).isConnected();
      if (bool)
      {
        bool = true;
        break label53;
      }
    }
    boolean bool = false;
    label53:
    return bool;
    label57:
    throw ((Throwable)localObject3);
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 37	com/google/firebase/messaging/h0:o	Landroid/content/Context;
    //   4: invokestatic 156	com/google/firebase/messaging/h0:h	(Landroid/content/Context;)Z
    //   7: ifeq +13 -> 20
    //   10: aload_0
    //   11: getfield 59	com/google/firebase/messaging/h0:q	Landroid/os/PowerManager$WakeLock;
    //   14: getstatic 160	com/google/firebase/messaging/e:a	J
    //   17: invokevirtual 166	android/os/PowerManager$WakeLock:acquire	(J)V
    //   20: aload_0
    //   21: getfield 35	com/google/firebase/messaging/h0:r	Lcom/google/firebase/messaging/g0;
    //   24: iconst_1
    //   25: invokevirtual 171	com/google/firebase/messaging/g0:o	(Z)V
    //   28: aload_0
    //   29: getfield 41	com/google/firebase/messaging/h0:p	Lcom/google/firebase/messaging/K;
    //   32: invokevirtual 175	com/google/firebase/messaging/K:g	()Z
    //   35: ifne +49 -> 84
    //   38: aload_0
    //   39: getfield 35	com/google/firebase/messaging/h0:r	Lcom/google/firebase/messaging/g0;
    //   42: iconst_0
    //   43: invokevirtual 171	com/google/firebase/messaging/g0:o	(Z)V
    //   46: aload_0
    //   47: getfield 37	com/google/firebase/messaging/h0:o	Landroid/content/Context;
    //   50: invokestatic 156	com/google/firebase/messaging/h0:h	(Landroid/content/Context;)Z
    //   53: ifeq +22 -> 75
    //   56: aload_0
    //   57: getfield 59	com/google/firebase/messaging/h0:q	Landroid/os/PowerManager$WakeLock;
    //   60: invokevirtual 178	android/os/PowerManager$WakeLock:release	()V
    //   63: goto +12 -> 75
    //   66: astore_1
    //   67: ldc 114
    //   69: ldc -76
    //   71: invokestatic 182	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   74: pop
    //   75: return
    //   76: astore_2
    //   77: goto +195 -> 272
    //   80: astore_2
    //   81: goto +130 -> 211
    //   84: aload_0
    //   85: getfield 37	com/google/firebase/messaging/h0:o	Landroid/content/Context;
    //   88: invokestatic 184	com/google/firebase/messaging/h0:f	(Landroid/content/Context;)Z
    //   91: ifeq +54 -> 145
    //   94: aload_0
    //   95: invokevirtual 64	com/google/firebase/messaging/h0:i	()Z
    //   98: ifne +47 -> 145
    //   101: new 8	com/google/firebase/messaging/h0$a
    //   104: astore_1
    //   105: aload_1
    //   106: aload_0
    //   107: aload_0
    //   108: invokespecial 187	com/google/firebase/messaging/h0$a:<init>	(Lcom/google/firebase/messaging/h0;Lcom/google/firebase/messaging/h0;)V
    //   111: aload_1
    //   112: invokevirtual 189	com/google/firebase/messaging/h0$a:a	()V
    //   115: aload_0
    //   116: getfield 37	com/google/firebase/messaging/h0:o	Landroid/content/Context;
    //   119: invokestatic 156	com/google/firebase/messaging/h0:h	(Landroid/content/Context;)Z
    //   122: ifeq +22 -> 144
    //   125: aload_0
    //   126: getfield 59	com/google/firebase/messaging/h0:q	Landroid/os/PowerManager$WakeLock;
    //   129: invokevirtual 178	android/os/PowerManager$WakeLock:release	()V
    //   132: goto +12 -> 144
    //   135: astore_1
    //   136: ldc 114
    //   138: ldc -76
    //   140: invokestatic 182	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   143: pop
    //   144: return
    //   145: aload_0
    //   146: getfield 35	com/google/firebase/messaging/h0:r	Lcom/google/firebase/messaging/g0;
    //   149: invokevirtual 191	com/google/firebase/messaging/g0:s	()Z
    //   152: ifeq +14 -> 166
    //   155: aload_0
    //   156: getfield 35	com/google/firebase/messaging/h0:r	Lcom/google/firebase/messaging/g0;
    //   159: iconst_0
    //   160: invokevirtual 171	com/google/firebase/messaging/g0:o	(Z)V
    //   163: goto +14 -> 177
    //   166: aload_0
    //   167: getfield 35	com/google/firebase/messaging/h0:r	Lcom/google/firebase/messaging/g0;
    //   170: aload_0
    //   171: getfield 39	com/google/firebase/messaging/h0:s	J
    //   174: invokevirtual 193	com/google/firebase/messaging/g0:t	(J)V
    //   177: aload_0
    //   178: getfield 37	com/google/firebase/messaging/h0:o	Landroid/content/Context;
    //   181: invokestatic 156	com/google/firebase/messaging/h0:h	(Landroid/content/Context;)Z
    //   184: ifeq +87 -> 271
    //   187: aload_0
    //   188: getfield 59	com/google/firebase/messaging/h0:q	Landroid/os/PowerManager$WakeLock;
    //   191: astore_1
    //   192: aload_1
    //   193: invokevirtual 178	android/os/PowerManager$WakeLock:release	()V
    //   196: goto +75 -> 271
    //   199: astore_1
    //   200: ldc 114
    //   202: ldc -76
    //   204: invokestatic 182	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   207: pop
    //   208: goto +63 -> 271
    //   211: new 76	java/lang/StringBuilder
    //   214: astore_1
    //   215: aload_1
    //   216: invokespecial 77	java/lang/StringBuilder:<init>	()V
    //   219: aload_1
    //   220: ldc -61
    //   222: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: pop
    //   226: aload_1
    //   227: aload_2
    //   228: invokevirtual 200	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   231: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   234: pop
    //   235: ldc 114
    //   237: aload_1
    //   238: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   241: invokestatic 202	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   244: pop
    //   245: aload_0
    //   246: getfield 35	com/google/firebase/messaging/h0:r	Lcom/google/firebase/messaging/g0;
    //   249: iconst_0
    //   250: invokevirtual 171	com/google/firebase/messaging/g0:o	(Z)V
    //   253: aload_0
    //   254: getfield 37	com/google/firebase/messaging/h0:o	Landroid/content/Context;
    //   257: invokestatic 156	com/google/firebase/messaging/h0:h	(Landroid/content/Context;)Z
    //   260: ifeq +11 -> 271
    //   263: aload_0
    //   264: getfield 59	com/google/firebase/messaging/h0:q	Landroid/os/PowerManager$WakeLock;
    //   267: astore_1
    //   268: goto -76 -> 192
    //   271: return
    //   272: aload_0
    //   273: getfield 37	com/google/firebase/messaging/h0:o	Landroid/content/Context;
    //   276: invokestatic 156	com/google/firebase/messaging/h0:h	(Landroid/content/Context;)Z
    //   279: ifeq +22 -> 301
    //   282: aload_0
    //   283: getfield 59	com/google/firebase/messaging/h0:q	Landroid/os/PowerManager$WakeLock;
    //   286: invokevirtual 178	android/os/PowerManager$WakeLock:release	()V
    //   289: goto +12 -> 301
    //   292: astore_1
    //   293: ldc 114
    //   295: ldc -76
    //   297: invokestatic 182	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   300: pop
    //   301: aload_2
    //   302: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	303	0	this	h0
    //   66	1	1	localRuntimeException1	RuntimeException
    //   104	8	1	locala	a
    //   135	1	1	localRuntimeException2	RuntimeException
    //   191	2	1	localWakeLock	PowerManager.WakeLock
    //   199	1	1	localRuntimeException3	RuntimeException
    //   214	54	1	localObject1	Object
    //   292	1	1	localRuntimeException4	RuntimeException
    //   76	1	2	localObject2	Object
    //   80	222	2	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   56	63	66	java/lang/RuntimeException
    //   20	46	76	finally
    //   84	115	76	finally
    //   145	163	76	finally
    //   166	177	76	finally
    //   211	253	76	finally
    //   20	46	80	java/io/IOException
    //   84	115	80	java/io/IOException
    //   145	163	80	java/io/IOException
    //   166	177	80	java/io/IOException
    //   125	132	135	java/lang/RuntimeException
    //   187	192	199	java/lang/RuntimeException
    //   192	196	199	java/lang/RuntimeException
    //   263	268	199	java/lang/RuntimeException
    //   282	289	292	java/lang/RuntimeException
  }
  
  public class a
    extends BroadcastReceiver
  {
    public h0 a;
    
    public a(h0 paramh0)
    {
      a = paramh0;
    }
    
    public void a()
    {
      if (h0.b()) {
        Log.d("FirebaseMessaging", "Connectivity change received registered");
      }
      h0.d(h0.this).registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      try
      {
        paramIntent = a;
        if (paramIntent == null) {
          return;
        }
        boolean bool = h0.a(paramIntent);
        if (!bool) {
          return;
        }
        if (h0.b()) {
          Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
        }
      }
      finally
      {
        break label75;
      }
      h0.c(a).m(a, 0L);
      paramContext.unregisterReceiver(this);
      a = null;
      return;
      label75:
      throw paramContext;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.h0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */