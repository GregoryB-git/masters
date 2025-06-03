package com.google.firebase.messaging;

import F2.a;
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
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class c0
  implements Runnable
{
  public final long o;
  public final PowerManager.WakeLock p;
  public final FirebaseMessaging q;
  public ExecutorService r = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("firebase-iid-executor"));
  
  public c0(FirebaseMessaging paramFirebaseMessaging, long paramLong)
  {
    q = paramFirebaseMessaging;
    o = paramLong;
    paramFirebaseMessaging = ((PowerManager)b().getSystemService("power")).newWakeLock(1, "fiid-sync");
    p = paramFirebaseMessaging;
    paramFirebaseMessaging.setReferenceCounted(false);
  }
  
  public static boolean c()
  {
    boolean bool;
    if ((!Log.isLoggable("FirebaseMessaging", 3)) && ((Build.VERSION.SDK_INT != 23) || (!Log.isLoggable("FirebaseMessaging", 3)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public Context b()
  {
    return q.q();
  }
  
  public boolean d()
  {
    Object localObject = (ConnectivityManager)b().getSystemService("connectivity");
    if (localObject != null) {
      localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
    } else {
      localObject = null;
    }
    boolean bool;
    if ((localObject != null) && (((NetworkInfo)localObject).isConnected())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean e()
  {
    for (;;)
    {
      Object localObject;
      try
      {
        if (q.n() == null)
        {
          Log.e("FirebaseMessaging", "Token retrieval failed: null");
          return false;
        }
      }
      catch (IOException localIOException)
      {
        break label56;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
          Log.d("FirebaseMessaging", "Token successfully retrieved");
        }
        return true;
      }
      catch (SecurityException localSecurityException)
      {
        localObject = "Token retrieval failed with SecurityException. Will retry token retrieval";
        Log.w("FirebaseMessaging", (String)localObject);
        return false;
      }
      label56:
      if (F.h(localIOException.getMessage()))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Token retrieval failed: ");
        ((StringBuilder)localObject).append(localIOException.getMessage());
        ((StringBuilder)localObject).append(". Will retry token retrieval");
        localObject = ((StringBuilder)localObject).toString();
      }
      else
      {
        if (localIOException.getMessage() != null) {
          break;
        }
        localObject = "Token retrieval failed without exception message. Will retry token retrieval";
      }
    }
    throw localIOException;
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: invokestatic 171	com/google/firebase/messaging/Y:b	()Lcom/google/firebase/messaging/Y;
    //   3: aload_0
    //   4: invokevirtual 55	com/google/firebase/messaging/c0:b	()Landroid/content/Context;
    //   7: invokevirtual 174	com/google/firebase/messaging/Y:e	(Landroid/content/Context;)Z
    //   10: ifeq +10 -> 20
    //   13: aload_0
    //   14: getfield 73	com/google/firebase/messaging/c0:p	Landroid/os/PowerManager$WakeLock;
    //   17: invokevirtual 177	android/os/PowerManager$WakeLock:acquire	()V
    //   20: aload_0
    //   21: getfield 49	com/google/firebase/messaging/c0:q	Lcom/google/firebase/messaging/FirebaseMessaging;
    //   24: iconst_1
    //   25: invokevirtual 180	com/google/firebase/messaging/FirebaseMessaging:O	(Z)V
    //   28: aload_0
    //   29: getfield 49	com/google/firebase/messaging/c0:q	Lcom/google/firebase/messaging/FirebaseMessaging;
    //   32: invokevirtual 183	com/google/firebase/messaging/FirebaseMessaging:z	()Z
    //   35: ifne +40 -> 75
    //   38: aload_0
    //   39: getfield 49	com/google/firebase/messaging/c0:q	Lcom/google/firebase/messaging/FirebaseMessaging;
    //   42: iconst_0
    //   43: invokevirtual 180	com/google/firebase/messaging/FirebaseMessaging:O	(Z)V
    //   46: invokestatic 171	com/google/firebase/messaging/Y:b	()Lcom/google/firebase/messaging/Y;
    //   49: aload_0
    //   50: invokevirtual 55	com/google/firebase/messaging/c0:b	()Landroid/content/Context;
    //   53: invokevirtual 174	com/google/firebase/messaging/Y:e	(Landroid/content/Context;)Z
    //   56: ifeq +10 -> 66
    //   59: aload_0
    //   60: getfield 73	com/google/firebase/messaging/c0:p	Landroid/os/PowerManager$WakeLock;
    //   63: invokevirtual 186	android/os/PowerManager$WakeLock:release	()V
    //   66: return
    //   67: astore_1
    //   68: goto +179 -> 247
    //   71: astore_2
    //   72: goto +109 -> 181
    //   75: invokestatic 171	com/google/firebase/messaging/Y:b	()Lcom/google/firebase/messaging/Y;
    //   78: aload_0
    //   79: invokevirtual 55	com/google/firebase/messaging/c0:b	()Landroid/content/Context;
    //   82: invokevirtual 188	com/google/firebase/messaging/Y:d	(Landroid/content/Context;)Z
    //   85: ifeq +44 -> 129
    //   88: aload_0
    //   89: invokevirtual 190	com/google/firebase/messaging/c0:d	()Z
    //   92: ifne +37 -> 129
    //   95: new 8	com/google/firebase/messaging/c0$a
    //   98: astore_1
    //   99: aload_1
    //   100: aload_0
    //   101: invokespecial 193	com/google/firebase/messaging/c0$a:<init>	(Lcom/google/firebase/messaging/c0;)V
    //   104: aload_1
    //   105: invokevirtual 195	com/google/firebase/messaging/c0$a:a	()V
    //   108: invokestatic 171	com/google/firebase/messaging/Y:b	()Lcom/google/firebase/messaging/Y;
    //   111: aload_0
    //   112: invokevirtual 55	com/google/firebase/messaging/c0:b	()Landroid/content/Context;
    //   115: invokevirtual 174	com/google/firebase/messaging/Y:e	(Landroid/content/Context;)Z
    //   118: ifeq +10 -> 128
    //   121: aload_0
    //   122: getfield 73	com/google/firebase/messaging/c0:p	Landroid/os/PowerManager$WakeLock;
    //   125: invokevirtual 186	android/os/PowerManager$WakeLock:release	()V
    //   128: return
    //   129: aload_0
    //   130: invokevirtual 197	com/google/firebase/messaging/c0:e	()Z
    //   133: ifeq +14 -> 147
    //   136: aload_0
    //   137: getfield 49	com/google/firebase/messaging/c0:q	Lcom/google/firebase/messaging/FirebaseMessaging;
    //   140: iconst_0
    //   141: invokevirtual 180	com/google/firebase/messaging/FirebaseMessaging:O	(Z)V
    //   144: goto +14 -> 158
    //   147: aload_0
    //   148: getfield 49	com/google/firebase/messaging/c0:q	Lcom/google/firebase/messaging/FirebaseMessaging;
    //   151: aload_0
    //   152: getfield 51	com/google/firebase/messaging/c0:o	J
    //   155: invokevirtual 201	com/google/firebase/messaging/FirebaseMessaging:S	(J)V
    //   158: invokestatic 171	com/google/firebase/messaging/Y:b	()Lcom/google/firebase/messaging/Y;
    //   161: aload_0
    //   162: invokevirtual 55	com/google/firebase/messaging/c0:b	()Landroid/content/Context;
    //   165: invokevirtual 174	com/google/firebase/messaging/Y:e	(Landroid/content/Context;)Z
    //   168: ifeq +78 -> 246
    //   171: aload_0
    //   172: getfield 73	com/google/firebase/messaging/c0:p	Landroid/os/PowerManager$WakeLock;
    //   175: invokevirtual 186	android/os/PowerManager$WakeLock:release	()V
    //   178: goto +68 -> 246
    //   181: new 151	java/lang/StringBuilder
    //   184: astore_1
    //   185: aload_1
    //   186: invokespecial 152	java/lang/StringBuilder:<init>	()V
    //   189: aload_1
    //   190: ldc -53
    //   192: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: pop
    //   196: aload_1
    //   197: aload_2
    //   198: invokevirtual 143	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   201: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: pop
    //   205: aload_1
    //   206: ldc -51
    //   208: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: pop
    //   212: ldc 85
    //   214: aload_1
    //   215: invokevirtual 163	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   218: invokestatic 129	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   221: pop
    //   222: aload_0
    //   223: getfield 49	com/google/firebase/messaging/c0:q	Lcom/google/firebase/messaging/FirebaseMessaging;
    //   226: iconst_0
    //   227: invokevirtual 180	com/google/firebase/messaging/FirebaseMessaging:O	(Z)V
    //   230: invokestatic 171	com/google/firebase/messaging/Y:b	()Lcom/google/firebase/messaging/Y;
    //   233: aload_0
    //   234: invokevirtual 55	com/google/firebase/messaging/c0:b	()Landroid/content/Context;
    //   237: invokevirtual 174	com/google/firebase/messaging/Y:e	(Landroid/content/Context;)Z
    //   240: ifeq +6 -> 246
    //   243: goto -72 -> 171
    //   246: return
    //   247: invokestatic 171	com/google/firebase/messaging/Y:b	()Lcom/google/firebase/messaging/Y;
    //   250: aload_0
    //   251: invokevirtual 55	com/google/firebase/messaging/c0:b	()Landroid/content/Context;
    //   254: invokevirtual 174	com/google/firebase/messaging/Y:e	(Landroid/content/Context;)Z
    //   257: ifeq +10 -> 267
    //   260: aload_0
    //   261: getfield 73	com/google/firebase/messaging/c0:p	Landroid/os/PowerManager$WakeLock;
    //   264: invokevirtual 186	android/os/PowerManager$WakeLock:release	()V
    //   267: aload_1
    //   268: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	269	0	this	c0
    //   67	1	1	localObject1	Object
    //   98	170	1	localObject2	Object
    //   71	127	2	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   20	46	67	finally
    //   75	108	67	finally
    //   129	144	67	finally
    //   147	158	67	finally
    //   181	230	67	finally
    //   20	46	71	java/io/IOException
    //   75	108	71	java/io/IOException
    //   129	144	71	java/io/IOException
    //   147	158	71	java/io/IOException
  }
  
  public static class a
    extends BroadcastReceiver
  {
    public c0 a;
    
    public a(c0 paramc0)
    {
      a = paramc0;
    }
    
    public void a()
    {
      if (c0.c()) {
        Log.d("FirebaseMessaging", "Connectivity change received registered");
      }
      IntentFilter localIntentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
      a.b().registerReceiver(this, localIntentFilter);
    }
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      paramContext = a;
      if (paramContext == null) {
        return;
      }
      if (!paramContext.d()) {
        return;
      }
      if (c0.c()) {
        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
      }
      c0.a(a).p(a, 0L);
      a.b().unregisterReceiver(this);
      a = null;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */