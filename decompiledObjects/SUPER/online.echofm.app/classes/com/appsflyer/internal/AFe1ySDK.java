package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import java.util.concurrent.Executor;

public final class AFe1ySDK
{
  public static String valueOf;
  public final AFb1dSDK values;
  
  static
  {
    StringBuilder localStringBuilder = new StringBuilder("https://%sregister.%s/api/v");
    localStringBuilder.append(AFa1eSDK.AFInAppEventType);
    valueOf = localStringBuilder.toString();
  }
  
  public AFe1ySDK(@NonNull Context paramContext)
  {
    values = AFa1eSDK.valueOf().values(paramContext);
  }
  
  public static boolean AFInAppEventType(@NonNull AFb1dSDK paramAFb1dSDK)
  {
    return paramAFb1dSDK.valueOf("sentRegisterRequestToAF");
  }
  
  public static void valueOf(String paramString)
  {
    Object localObject = AFa1eSDK.valueOf().AFInAppEventType();
    paramString = new AFd1eSDK(paramString, (AFc1xSDK)localObject);
    localObject = ((AFc1xSDK)localObject).AFVersionDeclaration();
    AFKeystoreWrapper.execute(new AFc1bSDK.4((AFc1bSDK)localObject, paramString));
  }
  
  /* Error */
  public static boolean values(Context paramContext)
  {
    // Byte code:
    //   0: invokestatic 95	com/appsflyer/AppsFlyerLib:getInstance	()Lcom/appsflyer/AppsFlyerLib;
    //   3: invokevirtual 99	com/appsflyer/AppsFlyerLib:isStopped	()Z
    //   6: ifeq +5 -> 11
    //   9: iconst_0
    //   10: ireturn
    //   11: getstatic 104	com/google/firebase/messaging/FirebaseMessagingService:ACTION_DIRECT_BOOT_REMOTE_INTENT	Ljava/lang/String;
    //   14: astore_1
    //   15: new 106	android/content/Intent
    //   18: astore_1
    //   19: aload_1
    //   20: ldc 108
    //   22: aconst_null
    //   23: aload_0
    //   24: ldc 110
    //   26: invokespecial 113	android/content/Intent:<init>	(Ljava/lang/String;Landroid/net/Uri;Landroid/content/Context;Ljava/lang/Class;)V
    //   29: aload_0
    //   30: aload_1
    //   31: invokestatic 118	com/appsflyer/internal/AFa1fSDK:values	(Landroid/content/Context;Landroid/content/Intent;)Z
    //   34: istore_2
    //   35: iload_2
    //   36: ifeq +12 -> 48
    //   39: iconst_1
    //   40: ireturn
    //   41: astore_0
    //   42: ldc 120
    //   44: aload_0
    //   45: invokestatic 126	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   48: iconst_0
    //   49: ireturn
    //   50: astore_0
    //   51: goto -3 -> 48
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	paramContext	Context
    //   14	17	1	localObject	Object
    //   34	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   11	35	41	finally
    //   11	35	50	java/lang/ClassNotFoundException
  }
  
  public final AFb1uSDK AFInAppEventParameterName()
  {
    Object localObject1 = values.values("afUninstallToken", null);
    long l1 = values.valueOf("afUninstallToken_received_time", 0L);
    boolean bool = values.valueOf("afUninstallToken_queued");
    values.values("afUninstallToken_queued", false);
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      String str = AppsFlyerProperties.getInstance().getString("afUninstallToken");
      localObject2 = localObject1;
      if (str != null)
      {
        localObject2 = str.split(",");
        localObject2 = localObject2[(localObject2.length - 1)];
      }
    }
    long l2 = l1;
    if (l1 == 0L)
    {
      localObject1 = AppsFlyerProperties.getInstance().getString("afUninstallToken");
      l2 = l1;
      if (localObject1 != null)
      {
        localObject1 = ((String)localObject1).split(",");
        l2 = l1;
        if (localObject1.length < 2) {}
      }
    }
    try
    {
      l2 = Long.parseLong(localObject1[(localObject1.length - 2)]);
      if (localObject2 != null) {
        return new AFb1uSDK((String)localObject2, l2, bool);
      }
      return null;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        l2 = l1;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFe1ySDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */