package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import p4.b;
import p4.k;
import s3.e;

public class c
  implements Runnable
{
  public final long o;
  public final PowerManager.WakeLock p;
  public final FirebaseInstanceId q;
  public ExecutorService r = b.b();
  
  public c(FirebaseInstanceId paramFirebaseInstanceId, long paramLong)
  {
    q = paramFirebaseInstanceId;
    o = paramLong;
    paramFirebaseInstanceId = ((PowerManager)b().getSystemService("power")).newWakeLock(1, "fiid-sync");
    p = paramFirebaseInstanceId;
    paramFirebaseInstanceId.setReferenceCounted(false);
  }
  
  public Context b()
  {
    return q.h().m();
  }
  
  public boolean c()
  {
    Object localObject = (ConnectivityManager)b().getSystemService("connectivity");
    if (localObject != null) {
      localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
    } else {
      localObject = null;
    }
    return (localObject != null) && (((NetworkInfo)localObject).isConnected());
  }
  
  public boolean d()
  {
    b.a locala = q.p();
    if (!q.F(locala)) {
      return true;
    }
    String str;
    for (;;)
    {
      try
      {
        if (q.d() == null)
        {
          Log.e("FirebaseInstanceId", "Token retrieval failed: null");
          return false;
        }
      }
      catch (IOException localIOException)
      {
        break label77;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
          Log.d("FirebaseInstanceId", "Token successfully retrieved");
        }
        return true;
      }
      catch (SecurityException localSecurityException)
      {
        str = "Token retrieval failed with SecurityException. Will retry token retrieval";
        Log.w("FirebaseInstanceId", str);
        return false;
      }
      label77:
      if (k.g(str.getMessage()))
      {
        str = str.getMessage();
        StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 52);
        localStringBuilder.append("Token retrieval failed: ");
        localStringBuilder.append(str);
        localStringBuilder.append(". Will retry token retrieval");
        str = localStringBuilder.toString();
      }
      else
      {
        if (str.getMessage() != null) {
          break;
        }
        str = "Token retrieval failed without exception message. Will retry token retrieval";
      }
    }
    throw str;
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: invokestatic 172	p4/s:a	()Lp4/s;
    //   3: aload_0
    //   4: invokevirtual 37	com/google/firebase/iid/c:b	()Landroid/content/Context;
    //   7: invokevirtual 175	p4/s:c	(Landroid/content/Context;)Z
    //   10: ifeq +10 -> 20
    //   13: aload_0
    //   14: getfield 55	com/google/firebase/iid/c:p	Landroid/os/PowerManager$WakeLock;
    //   17: invokevirtual 178	android/os/PowerManager$WakeLock:acquire	()V
    //   20: aload_0
    //   21: getfield 32	com/google/firebase/iid/c:q	Lcom/google/firebase/iid/FirebaseInstanceId;
    //   24: iconst_1
    //   25: invokevirtual 181	com/google/firebase/iid/FirebaseInstanceId:C	(Z)V
    //   28: aload_0
    //   29: getfield 32	com/google/firebase/iid/c:q	Lcom/google/firebase/iid/FirebaseInstanceId;
    //   32: invokevirtual 184	com/google/firebase/iid/FirebaseInstanceId:s	()Z
    //   35: ifne +40 -> 75
    //   38: aload_0
    //   39: getfield 32	com/google/firebase/iid/c:q	Lcom/google/firebase/iid/FirebaseInstanceId;
    //   42: iconst_0
    //   43: invokevirtual 181	com/google/firebase/iid/FirebaseInstanceId:C	(Z)V
    //   46: invokestatic 172	p4/s:a	()Lp4/s;
    //   49: aload_0
    //   50: invokevirtual 37	com/google/firebase/iid/c:b	()Landroid/content/Context;
    //   53: invokevirtual 175	p4/s:c	(Landroid/content/Context;)Z
    //   56: ifeq +10 -> 66
    //   59: aload_0
    //   60: getfield 55	com/google/firebase/iid/c:p	Landroid/os/PowerManager$WakeLock;
    //   63: invokevirtual 187	android/os/PowerManager$WakeLock:release	()V
    //   66: return
    //   67: astore_1
    //   68: goto +182 -> 250
    //   71: astore_1
    //   72: goto +98 -> 170
    //   75: invokestatic 172	p4/s:a	()Lp4/s;
    //   78: aload_0
    //   79: invokevirtual 37	com/google/firebase/iid/c:b	()Landroid/content/Context;
    //   82: invokevirtual 189	p4/s:b	(Landroid/content/Context;)Z
    //   85: ifeq +40 -> 125
    //   88: aload_0
    //   89: invokevirtual 191	com/google/firebase/iid/c:c	()Z
    //   92: ifne +33 -> 125
    //   95: new 8	com/google/firebase/iid/c$a
    //   98: astore_1
    //   99: aload_1
    //   100: aload_0
    //   101: invokespecial 194	com/google/firebase/iid/c$a:<init>	(Lcom/google/firebase/iid/c;)V
    //   104: aload_1
    //   105: invokevirtual 196	com/google/firebase/iid/c$a:a	()V
    //   108: invokestatic 172	p4/s:a	()Lp4/s;
    //   111: aload_0
    //   112: invokevirtual 37	com/google/firebase/iid/c:b	()Landroid/content/Context;
    //   115: invokevirtual 175	p4/s:c	(Landroid/content/Context;)Z
    //   118: ifeq +6 -> 124
    //   121: goto -62 -> 59
    //   124: return
    //   125: aload_0
    //   126: invokevirtual 198	com/google/firebase/iid/c:d	()Z
    //   129: ifeq +14 -> 143
    //   132: aload_0
    //   133: getfield 32	com/google/firebase/iid/c:q	Lcom/google/firebase/iid/FirebaseInstanceId;
    //   136: iconst_0
    //   137: invokevirtual 181	com/google/firebase/iid/FirebaseInstanceId:C	(Z)V
    //   140: goto +14 -> 154
    //   143: aload_0
    //   144: getfield 32	com/google/firebase/iid/c:q	Lcom/google/firebase/iid/FirebaseInstanceId;
    //   147: aload_0
    //   148: getfield 34	com/google/firebase/iid/c:o	J
    //   151: invokevirtual 202	com/google/firebase/iid/FirebaseInstanceId:E	(J)V
    //   154: invokestatic 172	p4/s:a	()Lp4/s;
    //   157: aload_0
    //   158: invokevirtual 37	com/google/firebase/iid/c:b	()Landroid/content/Context;
    //   161: invokevirtual 175	p4/s:c	(Landroid/content/Context;)Z
    //   164: ifeq +85 -> 249
    //   167: goto -108 -> 59
    //   170: aload_1
    //   171: invokevirtual 132	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   174: astore_1
    //   175: aload_1
    //   176: invokestatic 146	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   179: invokevirtual 150	java/lang/String:length	()I
    //   182: istore_2
    //   183: new 140	java/lang/StringBuilder
    //   186: astore_3
    //   187: aload_3
    //   188: iload_2
    //   189: bipush 93
    //   191: iadd
    //   192: invokespecial 153	java/lang/StringBuilder:<init>	(I)V
    //   195: aload_3
    //   196: ldc -52
    //   198: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: pop
    //   202: aload_3
    //   203: aload_1
    //   204: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: pop
    //   208: aload_3
    //   209: ldc -50
    //   211: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: pop
    //   215: ldc 106
    //   217: aload_3
    //   218: invokevirtual 164	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   221: invokestatic 114	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   224: pop
    //   225: aload_0
    //   226: getfield 32	com/google/firebase/iid/c:q	Lcom/google/firebase/iid/FirebaseInstanceId;
    //   229: iconst_0
    //   230: invokevirtual 181	com/google/firebase/iid/FirebaseInstanceId:C	(Z)V
    //   233: invokestatic 172	p4/s:a	()Lp4/s;
    //   236: aload_0
    //   237: invokevirtual 37	com/google/firebase/iid/c:b	()Landroid/content/Context;
    //   240: invokevirtual 175	p4/s:c	(Landroid/content/Context;)Z
    //   243: ifeq +6 -> 249
    //   246: goto -187 -> 59
    //   249: return
    //   250: invokestatic 172	p4/s:a	()Lp4/s;
    //   253: aload_0
    //   254: invokevirtual 37	com/google/firebase/iid/c:b	()Landroid/content/Context;
    //   257: invokevirtual 175	p4/s:c	(Landroid/content/Context;)Z
    //   260: ifne +6 -> 266
    //   263: goto +10 -> 273
    //   266: aload_0
    //   267: getfield 55	com/google/firebase/iid/c:p	Landroid/os/PowerManager$WakeLock;
    //   270: invokevirtual 187	android/os/PowerManager$WakeLock:release	()V
    //   273: aload_1
    //   274: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	275	0	this	c
    //   67	1	1	localObject1	Object
    //   71	1	1	localIOException	IOException
    //   98	176	1	localObject2	Object
    //   182	10	2	i	int
    //   186	32	3	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   20	46	67	finally
    //   75	108	67	finally
    //   125	140	67	finally
    //   143	154	67	finally
    //   170	233	67	finally
    //   20	46	71	java/io/IOException
    //   75	108	71	java/io/IOException
    //   125	140	71	java/io/IOException
    //   143	154	71	java/io/IOException
  }
  
  public static class a
    extends BroadcastReceiver
  {
    public c a;
    
    public a(c paramc)
    {
      a = paramc;
    }
    
    public void a()
    {
      if (FirebaseInstanceId.r()) {
        Log.d("FirebaseInstanceId", "Connectivity change received registered");
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
      if (!paramContext.c()) {
        return;
      }
      if (FirebaseInstanceId.r()) {
        Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
      }
      c.a(a).g(a, 0L);
      a.b().unregisterReceiver(this);
      a = null;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.iid.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */