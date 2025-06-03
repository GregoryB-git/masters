package com.appsflyer.internal;

@Deprecated
public final class AFb1xSDK
  implements AFa1wSDK
{
  private final AFa1wSDK AFInAppEventType = this;
  
  /* Error */
  private boolean values(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 19	com/appsflyer/internal/AFb1xSDK:AFInAppEventType	Lcom/appsflyer/internal/AFb1xSDK$AFa1wSDK;
    //   4: aload_1
    //   5: invokeinterface 28 2 0
    //   10: pop
    //   11: new 30	java/lang/StringBuilder
    //   14: astore_2
    //   15: aload_2
    //   16: ldc 32
    //   18: invokespecial 35	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   21: aload_2
    //   22: aload_1
    //   23: invokevirtual 39	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: pop
    //   27: aload_2
    //   28: ldc 41
    //   30: invokevirtual 39	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: pop
    //   34: aload_2
    //   35: invokevirtual 45	java/lang/Object:toString	()Ljava/lang/String;
    //   38: invokestatic 50	com/appsflyer/AFLogger:afRDLog	(Ljava/lang/String;)V
    //   41: iconst_1
    //   42: ireturn
    //   43: astore_1
    //   44: goto +7 -> 51
    //   47: astore_2
    //   48: goto +13 -> 61
    //   51: aload_1
    //   52: invokevirtual 55	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   55: aload_1
    //   56: invokestatic 59	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   59: iconst_0
    //   60: ireturn
    //   61: new 30	java/lang/StringBuilder
    //   64: dup
    //   65: ldc 32
    //   67: invokespecial 35	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   70: astore_3
    //   71: aload_3
    //   72: aload_1
    //   73: invokevirtual 39	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: pop
    //   77: aload_3
    //   78: ldc 61
    //   80: invokevirtual 39	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: pop
    //   84: aload_3
    //   85: invokevirtual 45	java/lang/Object:toString	()Ljava/lang/String;
    //   88: aload_2
    //   89: iconst_1
    //   90: invokestatic 65	com/appsflyer/AFLogger:afErrorLogForExcManagerOnly	(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    //   93: iconst_0
    //   94: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	95	0	this	AFb1xSDK
    //   0	95	1	paramString	String
    //   14	21	2	localStringBuilder1	StringBuilder
    //   47	42	2	localClassNotFoundException	ClassNotFoundException
    //   70	15	3	localStringBuilder2	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   0	41	43	finally
    //   0	41	47	java/lang/ClassNotFoundException
  }
  
  public final Class<?> AFInAppEventParameterName(String paramString)
  {
    return Class.forName(paramString);
  }
  
  public final String AFInAppEventParameterName()
  {
    for (AFa1zSDK localAFa1zSDK : ) {
      if (values(AFa1zSDK.AFKeystoreWrapper(localAFa1zSDK))) {
        return AFa1zSDK.AFInAppEventParameterName(localAFa1zSDK);
      }
    }
    return AFa1zSDK.AFInAppEventParameterName(AFa1zSDK.AFInAppEventType);
  }
  
  public static abstract interface AFa1wSDK
  {
    public abstract Class<?> AFInAppEventParameterName(String paramString);
  }
  
  public static enum AFa1zSDK
  {
    private final String afErrorLogForExcManagerOnly;
    private final String init;
    
    static
    {
      AFKeystoreWrapper = new AFa1zSDK("ADOBE_MOBILE_SDK", 1, "android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension");
      AFInAppEventParameterName = new AFa1zSDK("COCOS2DX", 2, "android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity");
      valueOf = new AFa1zSDK("CORDOVA", 3, "android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin");
      AFa1zSDK localAFa1zSDK1 = new AFa1zSDK("DEFAULT", 4, "android_native", "android_native");
      AFInAppEventType = localAFa1zSDK1;
      afRDLog = new AFa1zSDK("FLUTTER", 5, "android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin");
      afDebugLog = new AFa1zSDK("M_PARTICLE", 6, "android_mparticle", "com.mparticle.kits.AppsFlyerKit");
      afInfoLog = new AFa1zSDK("NATIVE_SCRIPT", 7, "android_native_script", "com.tns.NativeScriptActivity");
      afErrorLog = new AFa1zSDK("EXPO", 8, "android_expo", "expo.modules.devmenu.react.DevMenuAwareReactActivity");
      AFLogger = new AFa1zSDK("REACT_NATIVE", 9, "android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule");
      afWarnLog = new AFa1zSDK("UNITY", 10, "android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper");
      AFVersionDeclaration = new AFa1zSDK("UNREAL_ENGINE", 11, "android_unreal", "com.epicgames.ue4.GameActivity");
      getLevel = new AFa1zSDK("XAMARIN", 12, "android_xamarin", "mono.android.Runtime");
      AFa1zSDK localAFa1zSDK2 = new AFa1zSDK("CAPACITOR", 13, "android_capacitor", "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin");
      AFLogger$LogLevel = localAFa1zSDK2;
      onInstallConversionDataLoadedNative = new AFa1zSDK[] { values, AFKeystoreWrapper, AFInAppEventParameterName, valueOf, localAFa1zSDK1, afRDLog, afDebugLog, afInfoLog, afErrorLog, AFLogger, afWarnLog, AFVersionDeclaration, getLevel, localAFa1zSDK2 };
    }
    
    private AFa1zSDK(String paramString1, String paramString2)
    {
      afErrorLogForExcManagerOnly = paramString1;
      init = paramString2;
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1xSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */