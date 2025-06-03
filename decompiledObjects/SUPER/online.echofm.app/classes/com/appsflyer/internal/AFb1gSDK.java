package com.appsflyer.internal;

import android.os.Bundle;
import com.appsflyer.AppsFlyerProperties;

public final class AFb1gSDK
{
  private static String values = "262";
  private Bundle AFInAppEventParameterName = null;
  public final AFb1dSDK AFInAppEventType;
  public final AFb1bSDK valueOf;
  
  public AFb1gSDK(AFb1bSDK paramAFb1bSDK, AFb1dSDK paramAFb1dSDK)
  {
    valueOf = paramAFb1bSDK;
    AFInAppEventType = paramAFb1dSDK;
  }
  
  public static String AFKeystoreWrapper()
  {
    return AppsFlyerProperties.getInstance().getString("AppUserId");
  }
  
  public static String valueOf()
  {
    StringBuilder localStringBuilder = new StringBuilder("version: 6.12.2 (build ");
    localStringBuilder.append(values);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  /* Error */
  public final String AFInAppEventType(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 23	com/appsflyer/internal/AFb1gSDK:AFInAppEventParameterName	Landroid/os/Bundle;
    //   4: ifnonnull +43 -> 47
    //   7: aload_0
    //   8: aload_0
    //   9: getfield 25	com/appsflyer/internal/AFb1gSDK:valueOf	Lcom/appsflyer/internal/AFb1bSDK;
    //   12: getfield 64	com/appsflyer/internal/AFb1bSDK:AFInAppEventType	Landroid/content/Context;
    //   15: invokevirtual 70	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   18: aload_0
    //   19: getfield 25	com/appsflyer/internal/AFb1gSDK:valueOf	Lcom/appsflyer/internal/AFb1bSDK;
    //   22: getfield 64	com/appsflyer/internal/AFb1bSDK:AFInAppEventType	Landroid/content/Context;
    //   25: invokevirtual 73	android/content/Context:getPackageName	()Ljava/lang/String;
    //   28: sipush 128
    //   31: invokevirtual 79	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   34: getfield 84	android/content/pm/PackageItemInfo:metaData	Landroid/os/Bundle;
    //   37: putfield 23	com/appsflyer/internal/AFb1gSDK:AFInAppEventParameterName	Landroid/os/Bundle;
    //   40: goto +7 -> 47
    //   43: astore_1
    //   44: goto +29 -> 73
    //   47: aload_0
    //   48: getfield 23	com/appsflyer/internal/AFb1gSDK:AFInAppEventParameterName	Landroid/os/Bundle;
    //   51: astore_2
    //   52: aload_2
    //   53: ifnull +18 -> 71
    //   56: aload_2
    //   57: aload_1
    //   58: invokevirtual 90	android/os/BaseBundle:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   61: astore_1
    //   62: aload_1
    //   63: ifnull +8 -> 71
    //   66: aload_1
    //   67: invokevirtual 59	java/lang/Object:toString	()Ljava/lang/String;
    //   70: areturn
    //   71: aconst_null
    //   72: areturn
    //   73: new 43	java/lang/StringBuilder
    //   76: dup
    //   77: ldc 92
    //   79: invokespecial 48	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   82: astore_2
    //   83: aload_2
    //   84: aload_1
    //   85: invokevirtual 97	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   88: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: pop
    //   92: aload_2
    //   93: invokevirtual 59	java/lang/Object:toString	()Ljava/lang/String;
    //   96: aload_1
    //   97: invokestatic 103	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   100: aconst_null
    //   101: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	102	0	this	AFb1gSDK
    //   0	102	1	paramString	String
    //   51	42	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	40	43	finally
  }
  
  public final boolean AFKeystoreWrapper(String paramString)
  {
    paramString = AFInAppEventType(paramString);
    if (paramString != null) {
      return Boolean.parseBoolean(paramString);
    }
    return false;
  }
  
  public final String values()
  {
    Object localObject1 = AppsFlyerProperties.getInstance().getString("channel");
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = AFInAppEventType("CHANNEL");
    }
    localObject1 = localObject2;
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (localObject2.equals("")) {
        localObject1 = null;
      }
    }
    return (String)localObject1;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1gSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */