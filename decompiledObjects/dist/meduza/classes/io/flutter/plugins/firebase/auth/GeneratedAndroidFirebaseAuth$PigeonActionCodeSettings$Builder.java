package io.flutter.plugins.firebase.auth;

public final class GeneratedAndroidFirebaseAuth$PigeonActionCodeSettings$Builder
{
  private Boolean androidInstallApp;
  private String androidMinimumVersion;
  private String androidPackageName;
  private String dynamicLinkDomain;
  private Boolean handleCodeInApp;
  private String iOSBundleId;
  private String linkDomain;
  private String url;
  
  public GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings build()
  {
    GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings localPigeonActionCodeSettings = new GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings();
    localPigeonActionCodeSettings.setUrl(url);
    localPigeonActionCodeSettings.setDynamicLinkDomain(dynamicLinkDomain);
    localPigeonActionCodeSettings.setHandleCodeInApp(handleCodeInApp);
    localPigeonActionCodeSettings.setIOSBundleId(iOSBundleId);
    localPigeonActionCodeSettings.setAndroidPackageName(androidPackageName);
    localPigeonActionCodeSettings.setAndroidInstallApp(androidInstallApp);
    localPigeonActionCodeSettings.setAndroidMinimumVersion(androidMinimumVersion);
    localPigeonActionCodeSettings.setLinkDomain(linkDomain);
    return localPigeonActionCodeSettings;
  }
  
  public Builder setAndroidInstallApp(Boolean paramBoolean)
  {
    androidInstallApp = paramBoolean;
    return this;
  }
  
  public Builder setAndroidMinimumVersion(String paramString)
  {
    androidMinimumVersion = paramString;
    return this;
  }
  
  public Builder setAndroidPackageName(String paramString)
  {
    androidPackageName = paramString;
    return this;
  }
  
  public Builder setDynamicLinkDomain(String paramString)
  {
    dynamicLinkDomain = paramString;
    return this;
  }
  
  public Builder setHandleCodeInApp(Boolean paramBoolean)
  {
    handleCodeInApp = paramBoolean;
    return this;
  }
  
  public Builder setIOSBundleId(String paramString)
  {
    iOSBundleId = paramString;
    return this;
  }
  
  public Builder setLinkDomain(String paramString)
  {
    linkDomain = paramString;
    return this;
  }
  
  public Builder setUrl(String paramString)
  {
    url = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */