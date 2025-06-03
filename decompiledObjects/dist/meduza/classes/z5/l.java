package z5;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.internal.auth.zzby;
import com.google.android.gms.internal.auth.zzdc;
import com.google.android.gms.internal.auth.zzhs;
import com.google.android.gms.internal.auth.zzht;
import com.google.android.gms.internal.auth.zzhw;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j6.g;
import j6.h;
import j6.j;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import k6.b;
import p6.a;
import z3.f;

public class l
{
  public static final String[] a = { "com.google", "com.google.work", "cn.google" };
  public static final ComponentName b = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
  public static final a c = new a("Auth", new String[] { "GoogleAuthUtil" });
  
  public static TokenData a(Context paramContext, Bundle paramBundle)
  {
    Object localObject1 = TokenData.class.getClassLoader();
    if (localObject1 != null) {
      paramBundle.setClassLoader((ClassLoader)localObject1);
    }
    Object localObject2 = paramBundle.getBundle("tokenDetails");
    if (localObject2 == null)
    {
      localObject2 = null;
    }
    else
    {
      if (localObject1 != null) {
        ((Bundle)localObject2).setClassLoader((ClassLoader)localObject1);
      }
      localObject2 = (TokenData)((Bundle)localObject2).getParcelable("TokenData");
    }
    if (localObject2 != null) {
      return (TokenData)localObject2;
    }
    localObject1 = paramBundle.getString("Error");
    localObject2 = (Intent)paramBundle.getParcelable("userRecoveryIntent");
    PendingIntent localPendingIntent = (PendingIntent)paramBundle.getParcelable("userRecoveryPendingIntent");
    Object localObject3 = zzby.zza((String)localObject1);
    paramBundle = c;
    paramBundle.f(String.format("[GoogleAuthUtil] error status:%s with method:%s", new Object[] { localObject3, "getTokenWithDetails" }), new Object[0]);
    if ((!zzby.zzi.equals(localObject3)) && (!zzby.zzs.equals(localObject3)) && (!zzby.zzw.equals(localObject3)) && (!zzby.zzx.equals(localObject3)) && (!zzby.zzn.equals(localObject3)) && (!zzby.zzz.equals(localObject3)) && (!zzby.zzN.equals(localObject3)) && (!zzby.zzF.equals(localObject3)) && (!zzby.zzG.equals(localObject3)) && (!zzby.zzH.equals(localObject3)) && (!zzby.zzI.equals(localObject3)) && (!zzby.zzJ.equals(localObject3)) && (!zzby.zzK.equals(localObject3)) && (!zzby.zzM.equals(localObject3)) && (!zzby.zzE.equals(localObject3)) && (!zzby.zzL.equals(localObject3)))
    {
      if ((!zzby.zze.equals(localObject3)) && (!zzby.zzf.equals(localObject3)) && (!zzby.zzg.equals(localObject3)) && (!zzby.zzaf.equals(localObject3)) && (!zzby.zzah.equals(localObject3))) {
        throw new f((String)localObject1);
      }
      throw new IOException((String)localObject1);
    }
    zzdc.zzd(paramContext);
    if (zzht.zzc())
    {
      if ((localPendingIntent != null) && (localObject2 != null)) {
        throw new UserRecoverableAuthException((String)localObject1, (Intent)localObject2, 2);
      }
      j6.e.d.getClass();
      localObject3 = j.a;
      int i;
      try
      {
        paramContext = paramContext.getPackageManager().getPackageInfo("com.google.android.gms", 0);
        i = versionCode;
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
        i = 0;
      }
      if ((i >= Integer.MAX_VALUE) && (localPendingIntent == null))
      {
        paramContext = Integer.valueOf(Integer.MAX_VALUE);
        paramBundle.c(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", new Object[] { paramContext, "getTokenWithDetails", paramContext }), new Object[0]);
      }
      if (localObject2 == null) {
        paramBundle.c(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", new Object[] { localObject1, "getTokenWithDetails" }), new Object[0]);
      }
      throw new UserRecoverableAuthException((String)localObject1, (Intent)localObject2, 1);
    }
    throw new UserRecoverableAuthException((String)localObject1, (Intent)localObject2, 1);
  }
  
  /* Error */
  public static Object b(Context paramContext, ComponentName paramComponentName, k paramk)
  {
    // Byte code:
    //   0: new 269	j6/a
    //   3: dup
    //   4: invokespecial 271	j6/a:<init>	()V
    //   7: astore_3
    //   8: aload_0
    //   9: invokestatic 276	m6/c:a	(Landroid/content/Context;)Lm6/s0;
    //   12: astore 4
    //   14: aload 4
    //   16: invokevirtual 212	java/lang/Object:getClass	()Ljava/lang/Class;
    //   19: pop
    //   20: new 278	m6/p0
    //   23: astore_0
    //   24: aload_0
    //   25: aload_1
    //   26: invokespecial 281	m6/p0:<init>	(Landroid/content/ComponentName;)V
    //   29: aload 4
    //   31: aload_0
    //   32: aload_3
    //   33: ldc 40
    //   35: aconst_null
    //   36: invokevirtual 286	m6/s0:b	(Lm6/p0;Landroid/content/ServiceConnection;Ljava/lang/String;Ljava/util/concurrent/Executor;)Lj6/b;
    //   39: invokevirtual 291	j6/b:D	()Z
    //   42: istore 5
    //   44: iload 5
    //   46: ifeq +83 -> 129
    //   49: aload_2
    //   50: aload_3
    //   51: invokevirtual 294	j6/a:a	()Landroid/os/IBinder;
    //   54: invokeinterface 299 2 0
    //   59: astore_0
    //   60: aload 4
    //   62: new 278	m6/p0
    //   65: dup
    //   66: aload_1
    //   67: invokespecial 281	m6/p0:<init>	(Landroid/content/ComponentName;)V
    //   70: aload_3
    //   71: invokevirtual 302	m6/s0:c	(Lm6/p0;Landroid/content/ServiceConnection;)V
    //   74: aload_0
    //   75: areturn
    //   76: astore_0
    //   77: goto +36 -> 113
    //   80: astore_0
    //   81: goto +8 -> 89
    //   84: astore_0
    //   85: goto +4 -> 89
    //   88: astore_0
    //   89: ldc 40
    //   91: ldc_w 304
    //   94: aload_0
    //   95: invokestatic 308	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   98: pop
    //   99: new 184	java/io/IOException
    //   102: astore_2
    //   103: aload_2
    //   104: ldc_w 304
    //   107: aload_0
    //   108: invokespecial 311	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   111: aload_2
    //   112: athrow
    //   113: aload 4
    //   115: new 278	m6/p0
    //   118: dup
    //   119: aload_1
    //   120: invokespecial 281	m6/p0:<init>	(Landroid/content/ComponentName;)V
    //   123: aload_3
    //   124: invokevirtual 302	m6/s0:c	(Lm6/p0;Landroid/content/ServiceConnection;)V
    //   127: aload_0
    //   128: athrow
    //   129: new 184	java/io/IOException
    //   132: dup
    //   133: ldc_w 313
    //   136: invokespecial 185	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   139: athrow
    //   140: astore_0
    //   141: ldc 40
    //   143: ldc_w 315
    //   146: iconst_1
    //   147: anewarray 4	java/lang/Object
    //   150: dup
    //   151: iconst_0
    //   152: aload_0
    //   153: invokevirtual 321	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   156: aastore
    //   157: invokestatic 105	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   160: invokestatic 245	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   163: pop
    //   164: new 184	java/io/IOException
    //   167: dup
    //   168: ldc_w 323
    //   171: aload_0
    //   172: invokespecial 311	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   175: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	176	0	paramContext	Context
    //   0	176	1	paramComponentName	ComponentName
    //   0	176	2	paramk	k
    //   7	117	3	locala	j6.a
    //   12	102	4	locals0	m6.s0
    //   42	3	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   49	60	76	finally
    //   89	113	76	finally
    //   49	60	80	java/lang/InterruptedException
    //   49	60	84	android/os/RemoteException
    //   49	60	88	java/util/concurrent/TimeoutException
    //   14	44	140	java/lang/SecurityException
  }
  
  public static Object c(Task paramTask, String paramString)
  {
    try
    {
      paramTask = Tasks.await(paramTask);
      return paramTask;
    }
    catch (CancellationException paramTask)
    {
      paramString = String.format("Canceled while waiting for the task of %s to finish.", new Object[] { paramString });
      c.f(paramString, new Object[0]);
      throw new IOException(paramString, paramTask);
    }
    catch (InterruptedException paramTask)
    {
      paramString = String.format("Interrupted while waiting for the task of %s to finish.", new Object[] { paramString });
      c.f(paramString, new Object[0]);
      throw new IOException(paramString, paramTask);
    }
    catch (ExecutionException paramTask)
    {
      Throwable localThrowable = paramTask.getCause();
      if ((localThrowable instanceof b)) {
        throw ((b)localThrowable);
      }
      paramString = String.format("Unable to get a result for %s due to ExecutionException.", new Object[] { paramString });
      c.f(paramString, new Object[0]);
      throw new IOException(paramString, paramTask);
    }
  }
  
  public static void d(Context paramContext)
  {
    try
    {
      try
      {
        j.a(paramContext.getApplicationContext(), 8400000);
        return;
      }
      catch (GooglePlayServicesIncorrectManifestValueException paramContext) {}catch (g paramContext) {}
      throw new f(paramContext.getMessage(), paramContext);
    }
    catch (h paramContext)
    {
      throw new e(paramContext.getMessage(), new Intent(a));
    }
  }
  
  public static void e(Context paramContext, Bundle paramBundle)
  {
    paramContext = getApplicationInfopackageName;
    paramBundle.putString("clientPackageName", paramContext);
    if (TextUtils.isEmpty(paramBundle.getString("androidPackageName"))) {
      paramBundle.putString("androidPackageName", paramContext);
    }
    paramBundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
  }
  
  public static void f(Account paramAccount)
  {
    if (!TextUtils.isEmpty(name))
    {
      String[] arrayOfString = a;
      for (int i = 0; i < 3; i++) {
        if (arrayOfString[i].equals(type)) {
          return;
        }
      }
      throw new IllegalArgumentException("Account type not supported");
    }
    throw new IllegalArgumentException("Account name cannot be empty!");
  }
  
  public static boolean g(Context paramContext)
  {
    int i = j6.e.d.c(paramContext, 17895000);
    boolean bool = false;
    if (i != 0) {
      return false;
    }
    Object localObject = zzhw.zzb().zzq();
    paramContext = getApplicationInfopackageName;
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      if (((String)((Iterator)localObject).next()).equals(paramContext)) {
        return bool;
      }
    }
    bool = true;
    return bool;
  }
}

/* Location:
 * Qualified Name:     z5.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */