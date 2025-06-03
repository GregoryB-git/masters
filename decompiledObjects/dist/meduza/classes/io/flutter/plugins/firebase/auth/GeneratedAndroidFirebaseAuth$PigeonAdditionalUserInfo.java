package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;
import java.util.Map;

public final class GeneratedAndroidFirebaseAuth$PigeonAdditionalUserInfo
{
  private String authorizationCode;
  private Boolean isNewUser;
  private Map<String, Object> profile;
  private String providerId;
  private String username;
  
  public static PigeonAdditionalUserInfo fromList(ArrayList<Object> paramArrayList)
  {
    PigeonAdditionalUserInfo localPigeonAdditionalUserInfo = new PigeonAdditionalUserInfo();
    localPigeonAdditionalUserInfo.setIsNewUser((Boolean)paramArrayList.get(0));
    localPigeonAdditionalUserInfo.setProviderId((String)paramArrayList.get(1));
    localPigeonAdditionalUserInfo.setUsername((String)paramArrayList.get(2));
    localPigeonAdditionalUserInfo.setAuthorizationCode((String)paramArrayList.get(3));
    localPigeonAdditionalUserInfo.setProfile((Map)paramArrayList.get(4));
    return localPigeonAdditionalUserInfo;
  }
  
  public String getAuthorizationCode()
  {
    return authorizationCode;
  }
  
  public Boolean getIsNewUser()
  {
    return isNewUser;
  }
  
  public Map<String, Object> getProfile()
  {
    return profile;
  }
  
  public String getProviderId()
  {
    return providerId;
  }
  
  public String getUsername()
  {
    return username;
  }
  
  public void setAuthorizationCode(String paramString)
  {
    authorizationCode = paramString;
  }
  
  public void setIsNewUser(Boolean paramBoolean)
  {
    if (paramBoolean != null)
    {
      isNewUser = paramBoolean;
      return;
    }
    throw new IllegalStateException("Nonnull field \"isNewUser\" is null.");
  }
  
  public void setProfile(Map<String, Object> paramMap)
  {
    profile = paramMap;
  }
  
  public void setProviderId(String paramString)
  {
    providerId = paramString;
  }
  
  public void setUsername(String paramString)
  {
    username = paramString;
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(5);
    localArrayList.add(isNewUser);
    localArrayList.add(providerId);
    localArrayList.add(username);
    localArrayList.add(authorizationCode);
    localArrayList.add(profile);
    return localArrayList;
  }
  
  public static final class Builder
  {
    private String authorizationCode;
    private Boolean isNewUser;
    private Map<String, Object> profile;
    private String providerId;
    private String username;
    
    public GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo build()
    {
      GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo localPigeonAdditionalUserInfo = new GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo();
      localPigeonAdditionalUserInfo.setIsNewUser(isNewUser);
      localPigeonAdditionalUserInfo.setProviderId(providerId);
      localPigeonAdditionalUserInfo.setUsername(username);
      localPigeonAdditionalUserInfo.setAuthorizationCode(authorizationCode);
      localPigeonAdditionalUserInfo.setProfile(profile);
      return localPigeonAdditionalUserInfo;
    }
    
    public Builder setAuthorizationCode(String paramString)
    {
      authorizationCode = paramString;
      return this;
    }
    
    public Builder setIsNewUser(Boolean paramBoolean)
    {
      isNewUser = paramBoolean;
      return this;
    }
    
    public Builder setProfile(Map<String, Object> paramMap)
    {
      profile = paramMap;
      return this;
    }
    
    public Builder setProviderId(String paramString)
    {
      providerId = paramString;
      return this;
    }
    
    public Builder setUsername(String paramString)
    {
      username = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */