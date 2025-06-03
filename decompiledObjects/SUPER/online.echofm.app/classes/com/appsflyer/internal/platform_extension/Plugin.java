package com.appsflyer.internal.platform_extension;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public enum Plugin
{
  @NotNull
  private final String AFKeystoreWrapper;
  
  static
  {
    Plugin localPlugin1 = new Plugin("NATIVE", 0, "android_native");
    NATIVE = localPlugin1;
    Plugin localPlugin2 = new Plugin("UNITY", 1, "android_unity");
    UNITY = localPlugin2;
    Plugin localPlugin3 = new Plugin("FLUTTER", 2, "android_flutter");
    FLUTTER = localPlugin3;
    Plugin localPlugin4 = new Plugin("REACT_NATIVE", 3, "android_react_native");
    REACT_NATIVE = localPlugin4;
    Plugin localPlugin5 = new Plugin("ADOBE_AIR", 4, "android_adobe_air");
    ADOBE_AIR = localPlugin5;
    Plugin localPlugin6 = new Plugin("ADOBE_MOBILE", 5, "android_adobe_mobile");
    ADOBE_MOBILE = localPlugin6;
    Plugin localPlugin7 = new Plugin("COCOS_2DX", 6, "android_cocos2dx");
    COCOS_2DX = localPlugin7;
    Plugin localPlugin8 = new Plugin("CORDOVA", 7, "android_cordova");
    CORDOVA = localPlugin8;
    Plugin localPlugin9 = new Plugin("MPARTICLE", 8, "android_mparticle");
    MPARTICLE = localPlugin9;
    Plugin localPlugin10 = new Plugin("NATIVE_SCRIPT", 9, "android_native_script");
    NATIVE_SCRIPT = localPlugin10;
    Plugin localPlugin11 = new Plugin("EXPO", 10, "android_expo");
    EXPO = localPlugin11;
    Plugin localPlugin12 = new Plugin("UNREAL", 11, "android_unreal");
    UNREAL = localPlugin12;
    Plugin localPlugin13 = new Plugin("XAMARIN", 12, "android_xamarin");
    XAMARIN = localPlugin13;
    Plugin localPlugin14 = new Plugin("CAPACITOR", 13, "android_capacitor");
    CAPACITOR = localPlugin14;
    Plugin localPlugin15 = new Plugin("SEGMENT", 14, "android_segment");
    SEGMENT = localPlugin15;
    AFInAppEventParameterName = new Plugin[] { localPlugin1, localPlugin2, localPlugin3, localPlugin4, localPlugin5, localPlugin6, localPlugin7, localPlugin8, localPlugin9, localPlugin10, localPlugin11, localPlugin12, localPlugin13, localPlugin14, localPlugin15 };
  }
  
  private Plugin(String paramString)
  {
    AFKeystoreWrapper = paramString;
  }
  
  @NotNull
  public final String getPluginName()
  {
    return AFKeystoreWrapper;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.platform_extension.Plugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */