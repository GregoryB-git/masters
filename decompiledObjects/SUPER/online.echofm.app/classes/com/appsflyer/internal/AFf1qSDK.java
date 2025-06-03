package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerClient.Builder;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class AFf1qSDK
  extends AFf1uSDK
{
  @NonNull
  private final ExecutorService AFInAppEventType;
  public final Map<String, Object> valueOf = new HashMap();
  
  public AFf1qSDK(@NonNull Runnable paramRunnable, @NonNull ExecutorService paramExecutorService)
  {
    super("store", "google", paramRunnable);
    AFInAppEventType = paramExecutorService;
  }
  
  /* Error */
  private static boolean AFInAppEventType(@NonNull Context paramContext)
  {
    // Byte code:
    //   0: invokestatic 38	com/appsflyer/internal/AFf1uSDK:valueOf	()Z
    //   3: ifne +5 -> 8
    //   6: iconst_0
    //   7: ireturn
    //   8: aload_0
    //   9: ldc 40
    //   11: invokestatic 46	com/appsflyer/internal/AFa1fSDK:values	(Landroid/content/Context;Ljava/lang/String;)Z
    //   14: ifeq +18 -> 32
    //   17: ldc 48
    //   19: invokestatic 54	com/appsflyer/AFLogger:afDebugLog	(Ljava/lang/String;)V
    //   22: iconst_1
    //   23: ireturn
    //   24: astore_0
    //   25: goto +14 -> 39
    //   28: astore_0
    //   29: goto +23 -> 52
    //   32: ldc 56
    //   34: invokestatic 54	com/appsflyer/AFLogger:afDebugLog	(Ljava/lang/String;)V
    //   37: iconst_0
    //   38: ireturn
    //   39: ldc 58
    //   41: ldc 60
    //   43: invokevirtual 66	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   46: aload_0
    //   47: invokestatic 70	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   50: iconst_0
    //   51: ireturn
    //   52: ldc 72
    //   54: aload_0
    //   55: invokestatic 75	com/appsflyer/AFLogger:afErrorLogForExcManagerOnly	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   58: new 77	java/lang/StringBuilder
    //   61: dup
    //   62: ldc 79
    //   64: invokespecial 81	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   67: astore_0
    //   68: aload_0
    //   69: ldc 60
    //   71: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: pop
    //   75: aload_0
    //   76: ldc 87
    //   78: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: aload_0
    //   83: invokevirtual 93	java/lang/Object:toString	()Ljava/lang/String;
    //   86: invokestatic 96	com/appsflyer/AFLogger:afRDLog	(Ljava/lang/String;)V
    //   89: iconst_0
    //   90: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	paramContext	Context
    // Exception table:
    //   from	to	target	type
    //   8	22	24	finally
    //   8	22	28	java/lang/ClassNotFoundException
  }
  
  public final void valueOf(Context paramContext)
  {
    if (!AFInAppEventType(paramContext)) {
      return;
    }
    afInfoLog = System.currentTimeMillis();
    afDebugLog = AFf1pSDK.AFa1zSDK.AFInAppEventType;
    addObserver(new AFf1pSDK.1(this));
    try
    {
      InstallReferrerClient localInstallReferrerClient = InstallReferrerClient.newBuilder(paramContext).build();
      AFLogger.afDebugLog("Connecting to Install Referrer Library...");
      InstallReferrerStateListener local5 = new com/appsflyer/internal/AFf1qSDK$5;
      local5.<init>(this, localInstallReferrerClient, paramContext);
      localInstallReferrerClient.startConnection(local5);
      return;
    }
    finally
    {
      AFLogger.afErrorLog("referrerClient -> startConnection", paramContext);
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1qSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */