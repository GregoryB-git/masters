package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class FeatureManager
{
  private static final String FEATURE_MANAGER_STORE = "com.facebook.internal.FEATURE_MANAGER";
  private static final Map<Feature, String[]> featureMapping = new HashMap();
  
  public static void checkFeature(final Feature paramFeature, Callback paramCallback)
  {
    FetchedAppGateKeepersManager.loadAppGateKeepersAsync(new FetchedAppGateKeepersManager.Callback()
    {
      public void onCompleted()
      {
        val$callback.onCompleted(FeatureManager.isEnabled(paramFeature));
      }
    });
  }
  
  private static boolean defaultStatus(Feature paramFeature)
  {
    switch (2.$SwitchMap$com$facebook$internal$FeatureManager$Feature[paramFeature.ordinal()])
    {
    default: 
      return true;
    }
    return false;
  }
  
  public static void disableFeature(Feature paramFeature)
  {
    FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(paramFeature.toKey(), FacebookSdk.getSdkVersion()).apply();
  }
  
  public static Feature getFeature(String paramString)
  {
    initializeFeatureMapping();
    Iterator localIterator = featureMapping.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String[] arrayOfString = (String[])localEntry.getValue();
      int i = arrayOfString.length;
      for (int j = 0; j < i; j++) {
        if (paramString.startsWith(arrayOfString[j])) {
          return (Feature)localEntry.getKey();
        }
      }
    }
    return Feature.Unknown;
  }
  
  private static boolean getGKStatus(Feature paramFeature)
  {
    boolean bool = defaultStatus(paramFeature);
    return FetchedAppGateKeepersManager.getGateKeeperForKey(paramFeature.toKey(), FacebookSdk.getApplicationId(), bool);
  }
  
  private static void initializeFeatureMapping()
  {
    try
    {
      Map localMap = featureMapping;
      boolean bool = localMap.isEmpty();
      if (!bool) {
        return;
      }
      localMap.put(Feature.AAM, new String[] { "com.facebook.appevents.aam." });
      localMap.put(Feature.CodelessEvents, new String[] { "com.facebook.appevents.codeless." });
      localMap.put(Feature.ErrorReport, new String[] { "com.facebook.internal.instrument.errorreport." });
      localMap.put(Feature.PrivacyProtection, new String[] { "com.facebook.appevents.ml." });
      localMap.put(Feature.SuggestedEvents, new String[] { "com.facebook.appevents.suggestedevents." });
      localMap.put(Feature.RestrictiveDataFiltering, new String[] { "com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager" });
      localMap.put(Feature.IntelligentIntegrity, new String[] { "com.facebook.appevents.integrity.IntegrityManager" });
      localMap.put(Feature.EventDeactivation, new String[] { "com.facebook.appevents.eventdeactivation." });
      localMap.put(Feature.OnDeviceEventProcessing, new String[] { "com.facebook.appevents.ondeviceprocessing." });
      localMap.put(Feature.Monitoring, new String[] { "com.facebook.internal.logging.monitor" });
      return;
    }
    finally {}
  }
  
  public static boolean isEnabled(Feature paramFeature)
  {
    Object localObject = Feature.Unknown;
    boolean bool1 = false;
    if (localObject == paramFeature) {
      return false;
    }
    if (Feature.Core == paramFeature) {
      return true;
    }
    localObject = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(paramFeature.toKey(), null);
    if ((localObject != null) && (((String)localObject).equals(FacebookSdk.getSdkVersion()))) {
      return false;
    }
    localObject = paramFeature.getParent();
    if (localObject == paramFeature) {
      return getGKStatus(paramFeature);
    }
    boolean bool2 = bool1;
    if (isEnabled((Feature)localObject))
    {
      bool2 = bool1;
      if (getGKStatus(paramFeature)) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public static abstract interface Callback
  {
    public abstract void onCompleted(boolean paramBoolean);
  }
  
  public static enum Feature
  {
    private final int code;
    
    static
    {
      Feature localFeature1 = new Feature("Unknown", 0, -1);
      Unknown = localFeature1;
      Feature localFeature2 = new Feature("Core", 1, 0);
      Core = localFeature2;
      Feature localFeature3 = new Feature("AppEvents", 2, 65536);
      AppEvents = localFeature3;
      Feature localFeature4 = new Feature("CodelessEvents", 3, 65792);
      CodelessEvents = localFeature4;
      Feature localFeature5 = new Feature("RestrictiveDataFiltering", 4, 66048);
      RestrictiveDataFiltering = localFeature5;
      Feature localFeature6 = new Feature("AAM", 5, 66304);
      AAM = localFeature6;
      Feature localFeature7 = new Feature("PrivacyProtection", 6, 66560);
      PrivacyProtection = localFeature7;
      Feature localFeature8 = new Feature("SuggestedEvents", 7, 66561);
      SuggestedEvents = localFeature8;
      Feature localFeature9 = new Feature("IntelligentIntegrity", 8, 66562);
      IntelligentIntegrity = localFeature9;
      Feature localFeature10 = new Feature("ModelRequest", 9, 66563);
      ModelRequest = localFeature10;
      Feature localFeature11 = new Feature("EventDeactivation", 10, 66816);
      EventDeactivation = localFeature11;
      Feature localFeature12 = new Feature("OnDeviceEventProcessing", 11, 67072);
      OnDeviceEventProcessing = localFeature12;
      Feature localFeature13 = new Feature("OnDevicePostInstallEventProcessing", 12, 67073);
      OnDevicePostInstallEventProcessing = localFeature13;
      Feature localFeature14 = new Feature("Instrument", 13, 131072);
      Instrument = localFeature14;
      Feature localFeature15 = new Feature("CrashReport", 14, 131328);
      CrashReport = localFeature15;
      Feature localFeature16 = new Feature("CrashShield", 15, 131329);
      CrashShield = localFeature16;
      Feature localFeature17 = new Feature("ThreadCheck", 16, 131330);
      ThreadCheck = localFeature17;
      Feature localFeature18 = new Feature("ErrorReport", 17, 131584);
      ErrorReport = localFeature18;
      Feature localFeature19 = new Feature("Monitoring", 18, 196608);
      Monitoring = localFeature19;
      Feature localFeature20 = new Feature("Login", 19, 16777216);
      Login = localFeature20;
      Feature localFeature21 = new Feature("ChromeCustomTabsPrefetching", 20, 16842752);
      ChromeCustomTabsPrefetching = localFeature21;
      Feature localFeature22 = new Feature("IgnoreAppSwitchToLoggedOut", 21, 16908288);
      IgnoreAppSwitchToLoggedOut = localFeature22;
      Feature localFeature23 = new Feature("Share", 22, 33554432);
      Share = localFeature23;
      Feature localFeature24 = new Feature("Places", 23, 50331648);
      Places = localFeature24;
      $VALUES = new Feature[] { localFeature1, localFeature2, localFeature3, localFeature4, localFeature5, localFeature6, localFeature7, localFeature8, localFeature9, localFeature10, localFeature11, localFeature12, localFeature13, localFeature14, localFeature15, localFeature16, localFeature17, localFeature18, localFeature19, localFeature20, localFeature21, localFeature22, localFeature23, localFeature24 };
    }
    
    private Feature(int paramInt)
    {
      code = paramInt;
    }
    
    public static Feature fromInt(int paramInt)
    {
      for (Feature localFeature : ) {
        if (code == paramInt) {
          return localFeature;
        }
      }
      return Unknown;
    }
    
    public Feature getParent()
    {
      int i = code;
      if ((i & 0xFF) > 0) {
        return fromInt(i & 0xFF00);
      }
      if ((0xFF00 & i) > 0) {
        return fromInt(i & 0xFFFF0000);
      }
      if ((0xFF0000 & i) > 0) {
        return fromInt(i & 0xFF000000);
      }
      return fromInt(0);
    }
    
    public String toKey()
    {
      StringBuilder localStringBuilder = z2.t("FBSDKFeature");
      localStringBuilder.append(toString());
      return localStringBuilder.toString();
    }
    
    public String toString()
    {
      String str;
      switch (FeatureManager.2.$SwitchMap$com$facebook$internal$FeatureManager$Feature[ordinal()])
      {
      default: 
        str = "unknown";
        break;
      case 23: 
        str = "PlacesKit";
        break;
      case 22: 
        str = "ShareKit";
        break;
      case 21: 
        str = "LoginKit";
        break;
      case 20: 
        str = "CodelessEvents";
        break;
      case 19: 
        str = "AppEvents";
        break;
      case 18: 
        str = "CoreKit";
        break;
      case 17: 
        str = "IgnoreAppSwitchToLoggedOut";
        break;
      case 16: 
        str = "Monitoring";
        break;
      case 15: 
        str = "ChromeCustomTabsPrefetching";
        break;
      case 14: 
        str = "OnDevicePostInstallEventProcessing";
        break;
      case 13: 
        str = "OnDeviceEventProcessing";
        break;
      case 12: 
        str = "EventDeactivation";
        break;
      case 11: 
        str = "ModelRequest";
        break;
      case 10: 
        str = "IntelligentIntegrity";
        break;
      case 9: 
        str = "SuggestedEvents";
        break;
      case 8: 
        str = "PrivacyProtection";
        break;
      case 7: 
        str = "AAM";
        break;
      case 6: 
        str = "ErrorReport";
        break;
      case 5: 
        str = "ThreadCheck";
        break;
      case 4: 
        str = "CrashShield";
        break;
      case 3: 
        str = "CrashReport";
        break;
      case 2: 
        str = "Instrument";
        break;
      case 1: 
        str = "RestrictiveDataFiltering";
      }
      return str;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.FeatureManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */