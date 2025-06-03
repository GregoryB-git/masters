package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import b.a0;
import java.io.IOException;
import r9.h;
import u7.f;

public final class b
  implements Runnable
{
  public final long a;
  public final PowerManager.WakeLock b;
  public final FirebaseInstanceId c;
  
  public b(FirebaseInstanceId paramFirebaseInstanceId, long paramLong)
  {
    a0.x();
    c = paramFirebaseInstanceId;
    a = paramLong;
    paramFirebaseInstanceId = ((PowerManager)a().getSystemService("power")).newWakeLock(1, "fiid-sync");
    b = paramFirebaseInstanceId;
    paramFirebaseInstanceId.setReferenceCounted(false);
  }
  
  public final Context a()
  {
    f localf = c.b;
    localf.a();
    return a;
  }
  
  public final boolean b()
  {
    Object localObject = (ConnectivityManager)a().getSystemService("connectivity");
    if (localObject != null) {
      localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
    } else {
      localObject = null;
    }
    return (localObject != null) && (((NetworkInfo)localObject).isConnected());
  }
  
  public final boolean c()
  {
    Object localObject1 = c;
    Object localObject2 = h.a(b);
    a locala = FirebaseInstanceId.j;
    localObject1 = ((FirebaseInstanceId)localObject1).g();
    String str;
    label230:
    label239:
    try
    {
      localObject2 = a.a.b(a.getString(a.b((String)localObject1, (String)localObject2, "*"), null));
      boolean bool = c.k((a.a)localObject2);
      int i = 1;
      if (!bool) {
        return true;
      }
      try
      {
        if (c.c() == null)
        {
          Log.e("FirebaseInstanceId", "Token retrieval failed: null");
          return false;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
          Log.d("FirebaseInstanceId", "Token successfully retrieved");
        }
        return true;
      }
      catch (SecurityException localSecurityException)
      {
        localObject4 = "Token retrieval failed with SecurityException. Will retry token retrieval";
      }
      catch (IOException localIOException)
      {
        localObject4 = localIOException.getMessage();
        int j = i;
        if (!"SERVICE_NOT_AVAILABLE".equals(localObject4))
        {
          j = i;
          if (!"INTERNAL_SERVER_ERROR".equals(localObject4)) {
            if ("InternalServerError".equals(localObject4)) {
              j = i;
            } else {
              j = 0;
            }
          }
        }
        if (j != 0)
        {
          str = localIOException.getMessage();
          localObject4 = new StringBuilder(String.valueOf(str).length() + 52);
          ((StringBuilder)localObject4).append("Token retrieval failed: ");
          ((StringBuilder)localObject4).append(str);
          ((StringBuilder)localObject4).append(". Will retry token retrieval");
          localObject4 = ((StringBuilder)localObject4).toString();
          break label230;
        }
        if (str.getMessage() != null) {
          break label239;
        }
      }
      localObject4 = "Token retrieval failed without exception message. Will retry token retrieval";
      Log.w("FirebaseInstanceId", (String)localObject4);
      return false;
    }
    finally {}
    throw str;
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: invokestatic 200	r9/j:a	()Lr9/j;
    //   3: aload_0
    //   4: invokevirtual 32	com/google/firebase/iid/b:a	()Landroid/content/Context;
    //   7: invokevirtual 203	r9/j:c	(Landroid/content/Context;)Z
    //   10: ifeq +10 -> 20
    //   13: aload_0
    //   14: getfield 50	com/google/firebase/iid/b:b	Landroid/os/PowerManager$WakeLock;
    //   17: invokevirtual 206	android/os/PowerManager$WakeLock:acquire	()V
    //   20: aload_0
    //   21: getfield 27	com/google/firebase/iid/b:c	Lcom/google/firebase/iid/FirebaseInstanceId;
    //   24: astore_1
    //   25: aload_1
    //   26: monitorenter
    //   27: aload_1
    //   28: iconst_1
    //   29: putfield 209	com/google/firebase/iid/FirebaseInstanceId:g	Z
    //   32: aload_1
    //   33: monitorexit
    //   34: aload_0
    //   35: getfield 27	com/google/firebase/iid/b:c	Lcom/google/firebase/iid/FirebaseInstanceId;
    //   38: invokevirtual 212	com/google/firebase/iid/FirebaseInstanceId:i	()Z
    //   41: ifne +46 -> 87
    //   44: aload_0
    //   45: getfield 27	com/google/firebase/iid/b:c	Lcom/google/firebase/iid/FirebaseInstanceId;
    //   48: astore_1
    //   49: aload_1
    //   50: monitorenter
    //   51: aload_1
    //   52: iconst_0
    //   53: putfield 209	com/google/firebase/iid/FirebaseInstanceId:g	Z
    //   56: aload_1
    //   57: monitorexit
    //   58: invokestatic 200	r9/j:a	()Lr9/j;
    //   61: aload_0
    //   62: invokevirtual 32	com/google/firebase/iid/b:a	()Landroid/content/Context;
    //   65: invokevirtual 203	r9/j:c	(Landroid/content/Context;)Z
    //   68: ifeq +219 -> 287
    //   71: goto +209 -> 280
    //   74: astore_2
    //   75: aload_1
    //   76: monitorexit
    //   77: aload_2
    //   78: athrow
    //   79: astore_1
    //   80: goto +213 -> 293
    //   83: astore_1
    //   84: goto +114 -> 198
    //   87: invokestatic 200	r9/j:a	()Lr9/j;
    //   90: aload_0
    //   91: invokevirtual 32	com/google/firebase/iid/b:a	()Landroid/content/Context;
    //   94: invokevirtual 214	r9/j:b	(Landroid/content/Context;)Z
    //   97: ifeq +40 -> 137
    //   100: aload_0
    //   101: invokevirtual 216	com/google/firebase/iid/b:b	()Z
    //   104: ifne +33 -> 137
    //   107: new 8	com/google/firebase/iid/b$a
    //   110: astore_1
    //   111: aload_1
    //   112: aload_0
    //   113: invokespecial 219	com/google/firebase/iid/b$a:<init>	(Lcom/google/firebase/iid/b;)V
    //   116: aload_1
    //   117: invokevirtual 220	com/google/firebase/iid/b$a:a	()V
    //   120: invokestatic 200	r9/j:a	()Lr9/j;
    //   123: aload_0
    //   124: invokevirtual 32	com/google/firebase/iid/b:a	()Landroid/content/Context;
    //   127: invokevirtual 203	r9/j:c	(Landroid/content/Context;)Z
    //   130: ifeq +6 -> 136
    //   133: goto +147 -> 280
    //   136: return
    //   137: aload_0
    //   138: invokevirtual 222	com/google/firebase/iid/b:c	()Z
    //   141: ifeq +25 -> 166
    //   144: aload_0
    //   145: getfield 27	com/google/firebase/iid/b:c	Lcom/google/firebase/iid/FirebaseInstanceId;
    //   148: astore_2
    //   149: aload_2
    //   150: monitorenter
    //   151: aload_2
    //   152: iconst_0
    //   153: putfield 209	com/google/firebase/iid/FirebaseInstanceId:g	Z
    //   156: aload_2
    //   157: monitorexit
    //   158: goto +19 -> 177
    //   161: astore_1
    //   162: aload_2
    //   163: monitorexit
    //   164: aload_1
    //   165: athrow
    //   166: aload_0
    //   167: getfield 27	com/google/firebase/iid/b:c	Lcom/google/firebase/iid/FirebaseInstanceId;
    //   170: aload_0
    //   171: getfield 29	com/google/firebase/iid/b:a	J
    //   174: invokevirtual 225	com/google/firebase/iid/FirebaseInstanceId:j	(J)V
    //   177: invokestatic 200	r9/j:a	()Lr9/j;
    //   180: aload_0
    //   181: invokevirtual 32	com/google/firebase/iid/b:a	()Landroid/content/Context;
    //   184: invokevirtual 203	r9/j:c	(Landroid/content/Context;)Z
    //   187: ifeq +100 -> 287
    //   190: goto +90 -> 280
    //   193: astore_2
    //   194: aload_1
    //   195: monitorexit
    //   196: aload_2
    //   197: athrow
    //   198: aload_1
    //   199: invokevirtual 153	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   202: astore_2
    //   203: aload_2
    //   204: invokestatic 171	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   207: invokevirtual 175	java/lang/String:length	()I
    //   210: istore_3
    //   211: new 167	java/lang/StringBuilder
    //   214: astore_1
    //   215: aload_1
    //   216: iload_3
    //   217: bipush 93
    //   219: iadd
    //   220: invokespecial 178	java/lang/StringBuilder:<init>	(I)V
    //   223: aload_1
    //   224: ldc -29
    //   226: invokevirtual 184	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: pop
    //   230: aload_1
    //   231: aload_2
    //   232: invokevirtual 184	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: pop
    //   236: aload_1
    //   237: ldc -27
    //   239: invokevirtual 184	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   242: pop
    //   243: ldc -127
    //   245: aload_1
    //   246: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   249: invokestatic 137	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   252: pop
    //   253: aload_0
    //   254: getfield 27	com/google/firebase/iid/b:c	Lcom/google/firebase/iid/FirebaseInstanceId;
    //   257: astore_1
    //   258: aload_1
    //   259: monitorenter
    //   260: aload_1
    //   261: iconst_0
    //   262: putfield 209	com/google/firebase/iid/FirebaseInstanceId:g	Z
    //   265: aload_1
    //   266: monitorexit
    //   267: invokestatic 200	r9/j:a	()Lr9/j;
    //   270: aload_0
    //   271: invokevirtual 32	com/google/firebase/iid/b:a	()Landroid/content/Context;
    //   274: invokevirtual 203	r9/j:c	(Landroid/content/Context;)Z
    //   277: ifeq +10 -> 287
    //   280: aload_0
    //   281: getfield 50	com/google/firebase/iid/b:b	Landroid/os/PowerManager$WakeLock;
    //   284: invokevirtual 232	android/os/PowerManager$WakeLock:release	()V
    //   287: return
    //   288: astore_2
    //   289: aload_1
    //   290: monitorexit
    //   291: aload_2
    //   292: athrow
    //   293: invokestatic 200	r9/j:a	()Lr9/j;
    //   296: aload_0
    //   297: invokevirtual 32	com/google/firebase/iid/b:a	()Landroid/content/Context;
    //   300: invokevirtual 203	r9/j:c	(Landroid/content/Context;)Z
    //   303: ifne +6 -> 309
    //   306: goto +10 -> 316
    //   309: aload_0
    //   310: getfield 50	com/google/firebase/iid/b:b	Landroid/os/PowerManager$WakeLock;
    //   313: invokevirtual 232	android/os/PowerManager$WakeLock:release	()V
    //   316: aload_1
    //   317: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	318	0	this	b
    //   79	1	1	localObject1	Object
    //   83	1	1	localIOException	IOException
    //   110	7	1	locala	a
    //   161	38	1	localObject2	Object
    //   74	4	2	localObject4	Object
    //   193	4	2	localObject5	Object
    //   202	30	2	str	String
    //   288	4	2	localObject6	Object
    //   210	10	3	i	int
    // Exception table:
    //   from	to	target	type
    //   51	56	74	finally
    //   20	27	79	finally
    //   32	51	79	finally
    //   56	58	79	finally
    //   75	79	79	finally
    //   87	120	79	finally
    //   137	151	79	finally
    //   156	158	79	finally
    //   162	166	79	finally
    //   166	177	79	finally
    //   194	198	79	finally
    //   198	260	79	finally
    //   265	267	79	finally
    //   289	293	79	finally
    //   20	27	83	java/io/IOException
    //   32	51	83	java/io/IOException
    //   56	58	83	java/io/IOException
    //   75	79	83	java/io/IOException
    //   87	120	83	java/io/IOException
    //   137	151	83	java/io/IOException
    //   156	158	83	java/io/IOException
    //   162	166	83	java/io/IOException
    //   166	177	83	java/io/IOException
    //   194	198	83	java/io/IOException
    //   151	156	161	finally
    //   27	32	193	finally
    //   260	265	288	finally
  }
  
  public static final class a
    extends BroadcastReceiver
  {
    public b a;
    
    public a(b paramb)
    {
      a = paramb;
    }
    
    public final void a()
    {
      Object localObject = FirebaseInstanceId.j;
      boolean bool = Log.isLoggable("FirebaseInstanceId", 3);
      int i = 0;
      int j;
      if (!bool)
      {
        j = i;
        if (Build.VERSION.SDK_INT == 23)
        {
          j = i;
          if (!Log.isLoggable("FirebaseInstanceId", 3)) {}
        }
      }
      else
      {
        j = 1;
      }
      if (j != 0) {
        Log.d("FirebaseInstanceId", "Connectivity change received registered");
      }
      localObject = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
      a.a().registerReceiver(this, (IntentFilter)localObject);
    }
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      paramContext = a;
      if (paramContext == null) {
        return;
      }
      if (!paramContext.b()) {
        return;
      }
      boolean bool = Log.isLoggable("FirebaseInstanceId", 3);
      int i = 0;
      int j;
      if (!bool)
      {
        j = i;
        if (Build.VERSION.SDK_INT == 23)
        {
          j = i;
          if (!Log.isLoggable("FirebaseInstanceId", 3)) {}
        }
      }
      else
      {
        j = 1;
      }
      if (j != 0) {
        Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
      }
      paramContext = a;
      c.getClass();
      FirebaseInstanceId.e(paramContext, 0L);
      a.a().unregisterReceiver(this);
      a = null;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.iid.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */