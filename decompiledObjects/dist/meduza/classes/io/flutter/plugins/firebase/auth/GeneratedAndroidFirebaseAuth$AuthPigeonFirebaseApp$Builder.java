package io.flutter.plugins.firebase.auth;

public final class GeneratedAndroidFirebaseAuth$AuthPigeonFirebaseApp$Builder
{
  private String appName;
  private String customAuthDomain;
  private String tenantId;
  
  public GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp build()
  {
    GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp localAuthPigeonFirebaseApp = new GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp();
    localAuthPigeonFirebaseApp.setAppName(appName);
    localAuthPigeonFirebaseApp.setTenantId(tenantId);
    localAuthPigeonFirebaseApp.setCustomAuthDomain(customAuthDomain);
    return localAuthPigeonFirebaseApp;
  }
  
  public Builder setAppName(String paramString)
  {
    appName = paramString;
    return this;
  }
  
  public Builder setCustomAuthDomain(String paramString)
  {
    customAuthDomain = paramString;
    return this;
  }
  
  public Builder setTenantId(String paramString)
  {
    tenantId = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */