package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

public final class GeneratedAndroidFirebaseAuth$AuthPigeonFirebaseApp
{
  private String appName;
  private String customAuthDomain;
  private String tenantId;
  
  public static AuthPigeonFirebaseApp fromList(ArrayList<Object> paramArrayList)
  {
    AuthPigeonFirebaseApp localAuthPigeonFirebaseApp = new AuthPigeonFirebaseApp();
    localAuthPigeonFirebaseApp.setAppName((String)paramArrayList.get(0));
    localAuthPigeonFirebaseApp.setTenantId((String)paramArrayList.get(1));
    localAuthPigeonFirebaseApp.setCustomAuthDomain((String)paramArrayList.get(2));
    return localAuthPigeonFirebaseApp;
  }
  
  public String getAppName()
  {
    return appName;
  }
  
  public String getCustomAuthDomain()
  {
    return customAuthDomain;
  }
  
  public String getTenantId()
  {
    return tenantId;
  }
  
  public void setAppName(String paramString)
  {
    if (paramString != null)
    {
      appName = paramString;
      return;
    }
    throw new IllegalStateException("Nonnull field \"appName\" is null.");
  }
  
  public void setCustomAuthDomain(String paramString)
  {
    customAuthDomain = paramString;
  }
  
  public void setTenantId(String paramString)
  {
    tenantId = paramString;
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(3);
    localArrayList.add(appName);
    localArrayList.add(tenantId);
    localArrayList.add(customAuthDomain);
    return localArrayList;
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */