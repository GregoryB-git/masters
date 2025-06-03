package com.appsflyer.internal;

 enum AFb1xSDK$AFa1zSDK
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
  
  private AFb1xSDK$AFa1zSDK(String paramString1, String paramString2)
  {
    afErrorLogForExcManagerOnly = paramString1;
    init = paramString2;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1xSDK.AFa1zSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */