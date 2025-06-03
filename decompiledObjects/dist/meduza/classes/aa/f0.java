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
import com.google.firebase.messaging.FirebaseMessaging;
import f;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import w6.a;

public final class f0
  implements Runnable
{
  public final long a;
  public final PowerManager.WakeLock b;
  public final FirebaseMessaging c;
  
  public f0(FirebaseMessaging paramFirebaseMessaging, long paramLong)
  {
    new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("firebase-iid-executor"));
    c = paramFirebaseMessaging;
    a = paramLong;
    paramFirebaseMessaging = ((PowerManager)c.getSystemService("power")).newWakeLock(1, "fiid-sync");
    b = paramFirebaseMessaging;
    paramFirebaseMessaging.setReferenceCounted(false);
  }
  
  public final boolean a()
  {
    Object localObject = (ConnectivityManager)c.c.getSystemService("connectivity");
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
  
  public final boolean b()
  {
    int i = 1;
    try
    {
      if (c.a() == null)
      {
        Log.e("FirebaseMessaging", "Token retrieval failed: null");
        return false;
      }
      if (Log.isLoggable("FirebaseMessaging", 3)) {
        Log.d("FirebaseMessaging", "Token successfully retrieved");
      }
      return true;
    }
    catch (SecurityException localSecurityException)
    {
      String str1 = "Token retrieval failed with SecurityException. Will retry token retrieval";
    }
    catch (IOException localIOException)
    {
      Object localObject = localIOException.getMessage();
      int j = i;
      if (!"SERVICE_NOT_AVAILABLE".equals(localObject))
      {
        j = i;
        if (!"INTERNAL_SERVER_ERROR".equals(localObject)) {
          if ("InternalServerError".equals(localObject)) {
            j = i;
          } else {
            j = 0;
          }
        }
      }
      if (j != 0)
      {
        localObject = f.l("Token retrieval failed: ");
        ((StringBuilder)localObject).append(localIOException.getMessage());
        ((StringBuilder)localObject).append(". Will retry token retrieval");
        str2 = ((StringBuilder)localObject).toString();
        break label141;
      }
      if (str2.getMessage() != null) {
        break label150;
      }
    }
    String str2 = "Token retrieval failed without exception message. Will retry token retrieval";
    label141:
    Log.w("FirebaseMessaging", str2);
    return false;
    label150:
    throw str2;
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: invokestatic 164	aa/d0:a	()Laa/d0;
    //   3: aload_0
    //   4: getfield 44	aa/f0:c	Lcom/google/firebase/messaging/FirebaseMessaging;
    //   7: getfield 51	com/google/firebase/messaging/FirebaseMessaging:c	Landroid/content/Context;
    //   10: invokevirtual 167	aa/d0:c	(Landroid/content/Context;)Z
    //   13: ifeq +10 -> 23
    //   16: aload_0
    //   17: getfield 69	aa/f0:b	Landroid/os/PowerManager$WakeLock;
    //   20: invokevirtual 170	android/os/PowerManager$WakeLock:acquire	()V
    //   23: aload_0
    //   24: getfield 44	aa/f0:c	Lcom/google/firebase/messaging/FirebaseMessaging;
    //   27: astore_1
    //   28: aload_1
    //   29: monitorenter
    //   30: aload_1
    //   31: iconst_1
    //   32: putfield 174	com/google/firebase/messaging/FirebaseMessaging:k	Z
    //   35: aload_1
    //   36: monitorexit
    //   37: aload_0
    //   38: getfield 44	aa/f0:c	Lcom/google/firebase/messaging/FirebaseMessaging;
    //   41: getfield 178	com/google/firebase/messaging/FirebaseMessaging:j	Laa/r;
    //   44: invokevirtual 182	aa/r:c	()Z
    //   47: ifne +54 -> 101
    //   50: aload_0
    //   51: getfield 44	aa/f0:c	Lcom/google/firebase/messaging/FirebaseMessaging;
    //   54: astore_1
    //   55: aload_1
    //   56: monitorenter
    //   57: aload_1
    //   58: iconst_0
    //   59: putfield 174	com/google/firebase/messaging/FirebaseMessaging:k	Z
    //   62: aload_1
    //   63: monitorexit
    //   64: invokestatic 164	aa/d0:a	()Laa/d0;
    //   67: aload_0
    //   68: getfield 44	aa/f0:c	Lcom/google/firebase/messaging/FirebaseMessaging;
    //   71: getfield 51	com/google/firebase/messaging/FirebaseMessaging:c	Landroid/content/Context;
    //   74: invokevirtual 167	aa/d0:c	(Landroid/content/Context;)Z
    //   77: ifeq +10 -> 87
    //   80: aload_0
    //   81: getfield 69	aa/f0:b	Landroid/os/PowerManager$WakeLock;
    //   84: invokevirtual 185	android/os/PowerManager$WakeLock:release	()V
    //   87: return
    //   88: astore_2
    //   89: aload_1
    //   90: monitorexit
    //   91: aload_2
    //   92: athrow
    //   93: astore_2
    //   94: goto +215 -> 309
    //   97: astore_1
    //   98: goto +127 -> 225
    //   101: invokestatic 164	aa/d0:a	()Laa/d0;
    //   104: aload_0
    //   105: getfield 44	aa/f0:c	Lcom/google/firebase/messaging/FirebaseMessaging;
    //   108: getfield 51	com/google/firebase/messaging/FirebaseMessaging:c	Landroid/content/Context;
    //   111: invokevirtual 187	aa/d0:b	(Landroid/content/Context;)Z
    //   114: ifeq +47 -> 161
    //   117: aload_0
    //   118: invokevirtual 189	aa/f0:a	()Z
    //   121: ifne +40 -> 161
    //   124: new 8	aa/f0$a
    //   127: astore_2
    //   128: aload_2
    //   129: aload_0
    //   130: invokespecial 192	aa/f0$a:<init>	(Laa/f0;)V
    //   133: aload_2
    //   134: invokevirtual 194	aa/f0$a:a	()V
    //   137: invokestatic 164	aa/d0:a	()Laa/d0;
    //   140: aload_0
    //   141: getfield 44	aa/f0:c	Lcom/google/firebase/messaging/FirebaseMessaging;
    //   144: getfield 51	com/google/firebase/messaging/FirebaseMessaging:c	Landroid/content/Context;
    //   147: invokevirtual 167	aa/d0:c	(Landroid/content/Context;)Z
    //   150: ifeq +10 -> 160
    //   153: aload_0
    //   154: getfield 69	aa/f0:b	Landroid/os/PowerManager$WakeLock;
    //   157: invokevirtual 185	android/os/PowerManager$WakeLock:release	()V
    //   160: return
    //   161: aload_0
    //   162: invokevirtual 196	aa/f0:b	()Z
    //   165: ifeq +25 -> 190
    //   168: aload_0
    //   169: getfield 44	aa/f0:c	Lcom/google/firebase/messaging/FirebaseMessaging;
    //   172: astore_2
    //   173: aload_2
    //   174: monitorenter
    //   175: aload_2
    //   176: iconst_0
    //   177: putfield 174	com/google/firebase/messaging/FirebaseMessaging:k	Z
    //   180: aload_2
    //   181: monitorexit
    //   182: goto +19 -> 201
    //   185: astore_1
    //   186: aload_2
    //   187: monitorexit
    //   188: aload_1
    //   189: athrow
    //   190: aload_0
    //   191: getfield 44	aa/f0:c	Lcom/google/firebase/messaging/FirebaseMessaging;
    //   194: aload_0
    //   195: getfield 46	aa/f0:a	J
    //   198: invokevirtual 200	com/google/firebase/messaging/FirebaseMessaging:n	(J)V
    //   201: invokestatic 164	aa/d0:a	()Laa/d0;
    //   204: aload_0
    //   205: getfield 44	aa/f0:c	Lcom/google/firebase/messaging/FirebaseMessaging;
    //   208: getfield 51	com/google/firebase/messaging/FirebaseMessaging:c	Landroid/content/Context;
    //   211: invokevirtual 167	aa/d0:c	(Landroid/content/Context;)Z
    //   214: ifeq +89 -> 303
    //   217: goto +79 -> 296
    //   220: astore_2
    //   221: aload_1
    //   222: monitorexit
    //   223: aload_2
    //   224: athrow
    //   225: new 145	java/lang/StringBuilder
    //   228: astore_2
    //   229: aload_2
    //   230: invokespecial 201	java/lang/StringBuilder:<init>	()V
    //   233: aload_2
    //   234: ldc -53
    //   236: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   239: pop
    //   240: aload_2
    //   241: aload_1
    //   242: invokevirtual 123	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   245: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   248: pop
    //   249: aload_2
    //   250: ldc -51
    //   252: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: pop
    //   256: ldc 99
    //   258: aload_2
    //   259: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   262: invokestatic 107	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   265: pop
    //   266: aload_0
    //   267: getfield 44	aa/f0:c	Lcom/google/firebase/messaging/FirebaseMessaging;
    //   270: astore_1
    //   271: aload_1
    //   272: monitorenter
    //   273: aload_1
    //   274: iconst_0
    //   275: putfield 174	com/google/firebase/messaging/FirebaseMessaging:k	Z
    //   278: aload_1
    //   279: monitorexit
    //   280: invokestatic 164	aa/d0:a	()Laa/d0;
    //   283: aload_0
    //   284: getfield 44	aa/f0:c	Lcom/google/firebase/messaging/FirebaseMessaging;
    //   287: getfield 51	com/google/firebase/messaging/FirebaseMessaging:c	Landroid/content/Context;
    //   290: invokevirtual 167	aa/d0:c	(Landroid/content/Context;)Z
    //   293: ifeq +10 -> 303
    //   296: aload_0
    //   297: getfield 69	aa/f0:b	Landroid/os/PowerManager$WakeLock;
    //   300: invokevirtual 185	android/os/PowerManager$WakeLock:release	()V
    //   303: return
    //   304: astore_2
    //   305: aload_1
    //   306: monitorexit
    //   307: aload_2
    //   308: athrow
    //   309: invokestatic 164	aa/d0:a	()Laa/d0;
    //   312: aload_0
    //   313: getfield 44	aa/f0:c	Lcom/google/firebase/messaging/FirebaseMessaging;
    //   316: getfield 51	com/google/firebase/messaging/FirebaseMessaging:c	Landroid/content/Context;
    //   319: invokevirtual 167	aa/d0:c	(Landroid/content/Context;)Z
    //   322: ifeq +10 -> 332
    //   325: aload_0
    //   326: getfield 69	aa/f0:b	Landroid/os/PowerManager$WakeLock;
    //   329: invokevirtual 185	android/os/PowerManager$WakeLock:release	()V
    //   332: aload_2
    //   333: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	334	0	this	f0
    //   97	1	1	localIOException	IOException
    //   185	57	1	localObject1	Object
    //   88	4	2	localObject2	Object
    //   93	1	2	localObject3	Object
    //   220	4	2	localObject5	Object
    //   228	31	2	localStringBuilder	StringBuilder
    //   304	29	2	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   57	62	88	finally
    //   23	30	93	finally
    //   35	57	93	finally
    //   62	64	93	finally
    //   89	93	93	finally
    //   101	137	93	finally
    //   161	175	93	finally
    //   180	182	93	finally
    //   186	190	93	finally
    //   190	201	93	finally
    //   221	225	93	finally
    //   225	273	93	finally
    //   278	280	93	finally
    //   305	309	93	finally
    //   23	30	97	java/io/IOException
    //   35	57	97	java/io/IOException
    //   62	64	97	java/io/IOException
    //   89	93	97	java/io/IOException
    //   101	137	97	java/io/IOException
    //   161	175	97	java/io/IOException
    //   180	182	97	java/io/IOException
    //   186	190	97	java/io/IOException
    //   190	201	97	java/io/IOException
    //   221	225	97	java/io/IOException
    //   175	180	185	finally
    //   30	35	220	finally
    //   273	278	304	finally
  }
  
  public static final class a
    extends BroadcastReceiver
  {
    public f0 a;
    
    public a(f0 paramf0)
    {
      a = paramf0;
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
      IntentFilter localIntentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
      a.c.c.registerReceiver(this, localIntentFilter);
    }
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      paramContext = a;
      if (paramContext == null) {
        return;
      }
      if (!paramContext.a()) {
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
      paramContext = a;
      c.getClass();
      FirebaseMessaging.c(paramContext, 0L);
      a.c.c.unregisterReceiver(this);
      a = null;
    }
  }
}

/* Location:
 * Qualified Name:     aa.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */