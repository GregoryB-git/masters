package io.flutter.plugins.firebase.core;

public final class GeneratedAndroidFirebaseCore$PigeonFirebaseOptions$Builder
{
  private String androidClientId;
  private String apiKey;
  private String appGroupId;
  private String appId;
  private String authDomain;
  private String databaseURL;
  private String deepLinkURLScheme;
  private String iosBundleId;
  private String iosClientId;
  private String measurementId;
  private String messagingSenderId;
  private String projectId;
  private String storageBucket;
  private String trackingId;
  
  public GeneratedAndroidFirebaseCore.PigeonFirebaseOptions build()
  {
    GeneratedAndroidFirebaseCore.PigeonFirebaseOptions localPigeonFirebaseOptions = new GeneratedAndroidFirebaseCore.PigeonFirebaseOptions();
    localPigeonFirebaseOptions.setApiKey(apiKey);
    localPigeonFirebaseOptions.setAppId(appId);
    localPigeonFirebaseOptions.setMessagingSenderId(messagingSenderId);
    localPigeonFirebaseOptions.setProjectId(projectId);
    localPigeonFirebaseOptions.setAuthDomain(authDomain);
    localPigeonFirebaseOptions.setDatabaseURL(databaseURL);
    localPigeonFirebaseOptions.setStorageBucket(storageBucket);
    localPigeonFirebaseOptions.setMeasurementId(measurementId);
    localPigeonFirebaseOptions.setTrackingId(trackingId);
    localPigeonFirebaseOptions.setDeepLinkURLScheme(deepLinkURLScheme);
    localPigeonFirebaseOptions.setAndroidClientId(androidClientId);
    localPigeonFirebaseOptions.setIosClientId(iosClientId);
    localPigeonFirebaseOptions.setIosBundleId(iosBundleId);
    localPigeonFirebaseOptions.setAppGroupId(appGroupId);
    return localPigeonFirebaseOptions;
  }
  
  public Builder setAndroidClientId(String paramString)
  {
    androidClientId = paramString;
    return this;
  }
  
  public Builder setApiKey(String paramString)
  {
    apiKey = paramString;
    return this;
  }
  
  public Builder setAppGroupId(String paramString)
  {
    appGroupId = paramString;
    return this;
  }
  
  public Builder setAppId(String paramString)
  {
    appId = paramString;
    return this;
  }
  
  public Builder setAuthDomain(String paramString)
  {
    authDomain = paramString;
    return this;
  }
  
  public Builder setDatabaseURL(String paramString)
  {
    databaseURL = paramString;
    return this;
  }
  
  public Builder setDeepLinkURLScheme(String paramString)
  {
    deepLinkURLScheme = paramString;
    return this;
  }
  
  public Builder setIosBundleId(String paramString)
  {
    iosBundleId = paramString;
    return this;
  }
  
  public Builder setIosClientId(String paramString)
  {
    iosClientId = paramString;
    return this;
  }
  
  public Builder setMeasurementId(String paramString)
  {
    measurementId = paramString;
    return this;
  }
  
  public Builder setMessagingSenderId(String paramString)
  {
    messagingSenderId = paramString;
    return this;
  }
  
  public Builder setProjectId(String paramString)
  {
    projectId = paramString;
    return this;
  }
  
  public Builder setStorageBucket(String paramString)
  {
    storageBucket = paramString;
    return this;
  }
  
  public Builder setTrackingId(String paramString)
  {
    trackingId = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.PigeonFirebaseOptions.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */