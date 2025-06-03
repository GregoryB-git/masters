package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

public final class GeneratedAndroidFirebaseAuth$PigeonFirebaseAuthSettings
{
  private Boolean appVerificationDisabledForTesting;
  private Boolean forceRecaptchaFlow;
  private String phoneNumber;
  private String smsCode;
  private String userAccessGroup;
  
  public static PigeonFirebaseAuthSettings fromList(ArrayList<Object> paramArrayList)
  {
    PigeonFirebaseAuthSettings localPigeonFirebaseAuthSettings = new PigeonFirebaseAuthSettings();
    localPigeonFirebaseAuthSettings.setAppVerificationDisabledForTesting((Boolean)paramArrayList.get(0));
    localPigeonFirebaseAuthSettings.setUserAccessGroup((String)paramArrayList.get(1));
    localPigeonFirebaseAuthSettings.setPhoneNumber((String)paramArrayList.get(2));
    localPigeonFirebaseAuthSettings.setSmsCode((String)paramArrayList.get(3));
    localPigeonFirebaseAuthSettings.setForceRecaptchaFlow((Boolean)paramArrayList.get(4));
    return localPigeonFirebaseAuthSettings;
  }
  
  public Boolean getAppVerificationDisabledForTesting()
  {
    return appVerificationDisabledForTesting;
  }
  
  public Boolean getForceRecaptchaFlow()
  {
    return forceRecaptchaFlow;
  }
  
  public String getPhoneNumber()
  {
    return phoneNumber;
  }
  
  public String getSmsCode()
  {
    return smsCode;
  }
  
  public String getUserAccessGroup()
  {
    return userAccessGroup;
  }
  
  public void setAppVerificationDisabledForTesting(Boolean paramBoolean)
  {
    if (paramBoolean != null)
    {
      appVerificationDisabledForTesting = paramBoolean;
      return;
    }
    throw new IllegalStateException("Nonnull field \"appVerificationDisabledForTesting\" is null.");
  }
  
  public void setForceRecaptchaFlow(Boolean paramBoolean)
  {
    forceRecaptchaFlow = paramBoolean;
  }
  
  public void setPhoneNumber(String paramString)
  {
    phoneNumber = paramString;
  }
  
  public void setSmsCode(String paramString)
  {
    smsCode = paramString;
  }
  
  public void setUserAccessGroup(String paramString)
  {
    userAccessGroup = paramString;
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(5);
    localArrayList.add(appVerificationDisabledForTesting);
    localArrayList.add(userAccessGroup);
    localArrayList.add(phoneNumber);
    localArrayList.add(smsCode);
    localArrayList.add(forceRecaptchaFlow);
    return localArrayList;
  }
  
  public static final class Builder
  {
    private Boolean appVerificationDisabledForTesting;
    private Boolean forceRecaptchaFlow;
    private String phoneNumber;
    private String smsCode;
    private String userAccessGroup;
    
    public GeneratedAndroidFirebaseAuth.PigeonFirebaseAuthSettings build()
    {
      GeneratedAndroidFirebaseAuth.PigeonFirebaseAuthSettings localPigeonFirebaseAuthSettings = new GeneratedAndroidFirebaseAuth.PigeonFirebaseAuthSettings();
      localPigeonFirebaseAuthSettings.setAppVerificationDisabledForTesting(appVerificationDisabledForTesting);
      localPigeonFirebaseAuthSettings.setUserAccessGroup(userAccessGroup);
      localPigeonFirebaseAuthSettings.setPhoneNumber(phoneNumber);
      localPigeonFirebaseAuthSettings.setSmsCode(smsCode);
      localPigeonFirebaseAuthSettings.setForceRecaptchaFlow(forceRecaptchaFlow);
      return localPigeonFirebaseAuthSettings;
    }
    
    public Builder setAppVerificationDisabledForTesting(Boolean paramBoolean)
    {
      appVerificationDisabledForTesting = paramBoolean;
      return this;
    }
    
    public Builder setForceRecaptchaFlow(Boolean paramBoolean)
    {
      forceRecaptchaFlow = paramBoolean;
      return this;
    }
    
    public Builder setPhoneNumber(String paramString)
    {
      phoneNumber = paramString;
      return this;
    }
    
    public Builder setSmsCode(String paramString)
    {
      smsCode = paramString;
      return this;
    }
    
    public Builder setUserAccessGroup(String paramString)
    {
      userAccessGroup = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonFirebaseAuthSettings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */