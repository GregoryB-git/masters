package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

public final class GeneratedAndroidFirebaseAuth$PigeonActionCodeSettings
{
  private Boolean androidInstallApp;
  private String androidMinimumVersion;
  private String androidPackageName;
  private String dynamicLinkDomain;
  private Boolean handleCodeInApp;
  private String iOSBundleId;
  private String linkDomain;
  private String url;
  
  public static PigeonActionCodeSettings fromList(ArrayList<Object> paramArrayList)
  {
    PigeonActionCodeSettings localPigeonActionCodeSettings = new PigeonActionCodeSettings();
    localPigeonActionCodeSettings.setUrl((String)paramArrayList.get(0));
    localPigeonActionCodeSettings.setDynamicLinkDomain((String)paramArrayList.get(1));
    localPigeonActionCodeSettings.setHandleCodeInApp((Boolean)paramArrayList.get(2));
    localPigeonActionCodeSettings.setIOSBundleId((String)paramArrayList.get(3));
    localPigeonActionCodeSettings.setAndroidPackageName((String)paramArrayList.get(4));
    localPigeonActionCodeSettings.setAndroidInstallApp((Boolean)paramArrayList.get(5));
    localPigeonActionCodeSettings.setAndroidMinimumVersion((String)paramArrayList.get(6));
    localPigeonActionCodeSettings.setLinkDomain((String)paramArrayList.get(7));
    return localPigeonActionCodeSettings;
  }
  
  public Boolean getAndroidInstallApp()
  {
    return androidInstallApp;
  }
  
  public String getAndroidMinimumVersion()
  {
    return androidMinimumVersion;
  }
  
  public String getAndroidPackageName()
  {
    return androidPackageName;
  }
  
  public String getDynamicLinkDomain()
  {
    return dynamicLinkDomain;
  }
  
  public Boolean getHandleCodeInApp()
  {
    return handleCodeInApp;
  }
  
  public String getIOSBundleId()
  {
    return iOSBundleId;
  }
  
  public String getLinkDomain()
  {
    return linkDomain;
  }
  
  public String getUrl()
  {
    return url;
  }
  
  public void setAndroidInstallApp(Boolean paramBoolean)
  {
    if (paramBoolean != null)
    {
      androidInstallApp = paramBoolean;
      return;
    }
    throw new IllegalStateException("Nonnull field \"androidInstallApp\" is null.");
  }
  
  public void setAndroidMinimumVersion(String paramString)
  {
    androidMinimumVersion = paramString;
  }
  
  public void setAndroidPackageName(String paramString)
  {
    androidPackageName = paramString;
  }
  
  public void setDynamicLinkDomain(String paramString)
  {
    dynamicLinkDomain = paramString;
  }
  
  public void setHandleCodeInApp(Boolean paramBoolean)
  {
    if (paramBoolean != null)
    {
      handleCodeInApp = paramBoolean;
      return;
    }
    throw new IllegalStateException("Nonnull field \"handleCodeInApp\" is null.");
  }
  
  public void setIOSBundleId(String paramString)
  {
    iOSBundleId = paramString;
  }
  
  public void setLinkDomain(String paramString)
  {
    linkDomain = paramString;
  }
  
  public void setUrl(String paramString)
  {
    if (paramString != null)
    {
      url = paramString;
      return;
    }
    throw new IllegalStateException("Nonnull field \"url\" is null.");
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(8);
    localArrayList.add(url);
    localArrayList.add(dynamicLinkDomain);
    localArrayList.add(handleCodeInApp);
    localArrayList.add(iOSBundleId);
    localArrayList.add(androidPackageName);
    localArrayList.add(androidInstallApp);
    localArrayList.add(androidMinimumVersion);
    localArrayList.add(linkDomain);
    return localArrayList;
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */