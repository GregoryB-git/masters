package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

public final class GeneratedAndroidFirebaseAuth$PigeonUserInfo
{
  private Long creationTimestamp;
  private String displayName;
  private String email;
  private Boolean isAnonymous;
  private Boolean isEmailVerified;
  private Long lastSignInTimestamp;
  private String phoneNumber;
  private String photoUrl;
  private String providerId;
  private String refreshToken;
  private String tenantId;
  private String uid;
  
  public static PigeonUserInfo fromList(ArrayList<Object> paramArrayList)
  {
    PigeonUserInfo localPigeonUserInfo = new PigeonUserInfo();
    localPigeonUserInfo.setUid((String)paramArrayList.get(0));
    localPigeonUserInfo.setEmail((String)paramArrayList.get(1));
    localPigeonUserInfo.setDisplayName((String)paramArrayList.get(2));
    localPigeonUserInfo.setPhotoUrl((String)paramArrayList.get(3));
    localPigeonUserInfo.setPhoneNumber((String)paramArrayList.get(4));
    localPigeonUserInfo.setIsAnonymous((Boolean)paramArrayList.get(5));
    localPigeonUserInfo.setIsEmailVerified((Boolean)paramArrayList.get(6));
    localPigeonUserInfo.setProviderId((String)paramArrayList.get(7));
    localPigeonUserInfo.setTenantId((String)paramArrayList.get(8));
    localPigeonUserInfo.setRefreshToken((String)paramArrayList.get(9));
    Object localObject1 = paramArrayList.get(10);
    Object localObject2 = null;
    long l;
    if (localObject1 == null)
    {
      localObject1 = null;
    }
    else
    {
      if ((localObject1 instanceof Integer)) {
        l = ((Integer)localObject1).intValue();
      } else {
        l = ((Long)localObject1).longValue();
      }
      localObject1 = Long.valueOf(l);
    }
    localPigeonUserInfo.setCreationTimestamp((Long)localObject1);
    paramArrayList = paramArrayList.get(11);
    if (paramArrayList == null)
    {
      paramArrayList = (ArrayList<Object>)localObject2;
    }
    else
    {
      if ((paramArrayList instanceof Integer)) {
        l = ((Integer)paramArrayList).intValue();
      } else {
        l = ((Long)paramArrayList).longValue();
      }
      paramArrayList = Long.valueOf(l);
    }
    localPigeonUserInfo.setLastSignInTimestamp(paramArrayList);
    return localPigeonUserInfo;
  }
  
  public Long getCreationTimestamp()
  {
    return creationTimestamp;
  }
  
  public String getDisplayName()
  {
    return displayName;
  }
  
  public String getEmail()
  {
    return email;
  }
  
  public Boolean getIsAnonymous()
  {
    return isAnonymous;
  }
  
  public Boolean getIsEmailVerified()
  {
    return isEmailVerified;
  }
  
  public Long getLastSignInTimestamp()
  {
    return lastSignInTimestamp;
  }
  
  public String getPhoneNumber()
  {
    return phoneNumber;
  }
  
  public String getPhotoUrl()
  {
    return photoUrl;
  }
  
  public String getProviderId()
  {
    return providerId;
  }
  
  public String getRefreshToken()
  {
    return refreshToken;
  }
  
  public String getTenantId()
  {
    return tenantId;
  }
  
  public String getUid()
  {
    return uid;
  }
  
  public void setCreationTimestamp(Long paramLong)
  {
    creationTimestamp = paramLong;
  }
  
  public void setDisplayName(String paramString)
  {
    displayName = paramString;
  }
  
  public void setEmail(String paramString)
  {
    email = paramString;
  }
  
  public void setIsAnonymous(Boolean paramBoolean)
  {
    if (paramBoolean != null)
    {
      isAnonymous = paramBoolean;
      return;
    }
    throw new IllegalStateException("Nonnull field \"isAnonymous\" is null.");
  }
  
  public void setIsEmailVerified(Boolean paramBoolean)
  {
    if (paramBoolean != null)
    {
      isEmailVerified = paramBoolean;
      return;
    }
    throw new IllegalStateException("Nonnull field \"isEmailVerified\" is null.");
  }
  
  public void setLastSignInTimestamp(Long paramLong)
  {
    lastSignInTimestamp = paramLong;
  }
  
  public void setPhoneNumber(String paramString)
  {
    phoneNumber = paramString;
  }
  
  public void setPhotoUrl(String paramString)
  {
    photoUrl = paramString;
  }
  
  public void setProviderId(String paramString)
  {
    providerId = paramString;
  }
  
  public void setRefreshToken(String paramString)
  {
    refreshToken = paramString;
  }
  
  public void setTenantId(String paramString)
  {
    tenantId = paramString;
  }
  
  public void setUid(String paramString)
  {
    if (paramString != null)
    {
      uid = paramString;
      return;
    }
    throw new IllegalStateException("Nonnull field \"uid\" is null.");
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(12);
    localArrayList.add(uid);
    localArrayList.add(email);
    localArrayList.add(displayName);
    localArrayList.add(photoUrl);
    localArrayList.add(phoneNumber);
    localArrayList.add(isAnonymous);
    localArrayList.add(isEmailVerified);
    localArrayList.add(providerId);
    localArrayList.add(tenantId);
    localArrayList.add(refreshToken);
    localArrayList.add(creationTimestamp);
    localArrayList.add(lastSignInTimestamp);
    return localArrayList;
  }
  
  public static final class Builder
  {
    private Long creationTimestamp;
    private String displayName;
    private String email;
    private Boolean isAnonymous;
    private Boolean isEmailVerified;
    private Long lastSignInTimestamp;
    private String phoneNumber;
    private String photoUrl;
    private String providerId;
    private String refreshToken;
    private String tenantId;
    private String uid;
    
    public GeneratedAndroidFirebaseAuth.PigeonUserInfo build()
    {
      GeneratedAndroidFirebaseAuth.PigeonUserInfo localPigeonUserInfo = new GeneratedAndroidFirebaseAuth.PigeonUserInfo();
      localPigeonUserInfo.setUid(uid);
      localPigeonUserInfo.setEmail(email);
      localPigeonUserInfo.setDisplayName(displayName);
      localPigeonUserInfo.setPhotoUrl(photoUrl);
      localPigeonUserInfo.setPhoneNumber(phoneNumber);
      localPigeonUserInfo.setIsAnonymous(isAnonymous);
      localPigeonUserInfo.setIsEmailVerified(isEmailVerified);
      localPigeonUserInfo.setProviderId(providerId);
      localPigeonUserInfo.setTenantId(tenantId);
      localPigeonUserInfo.setRefreshToken(refreshToken);
      localPigeonUserInfo.setCreationTimestamp(creationTimestamp);
      localPigeonUserInfo.setLastSignInTimestamp(lastSignInTimestamp);
      return localPigeonUserInfo;
    }
    
    public Builder setCreationTimestamp(Long paramLong)
    {
      creationTimestamp = paramLong;
      return this;
    }
    
    public Builder setDisplayName(String paramString)
    {
      displayName = paramString;
      return this;
    }
    
    public Builder setEmail(String paramString)
    {
      email = paramString;
      return this;
    }
    
    public Builder setIsAnonymous(Boolean paramBoolean)
    {
      isAnonymous = paramBoolean;
      return this;
    }
    
    public Builder setIsEmailVerified(Boolean paramBoolean)
    {
      isEmailVerified = paramBoolean;
      return this;
    }
    
    public Builder setLastSignInTimestamp(Long paramLong)
    {
      lastSignInTimestamp = paramLong;
      return this;
    }
    
    public Builder setPhoneNumber(String paramString)
    {
      phoneNumber = paramString;
      return this;
    }
    
    public Builder setPhotoUrl(String paramString)
    {
      photoUrl = paramString;
      return this;
    }
    
    public Builder setProviderId(String paramString)
    {
      providerId = paramString;
      return this;
    }
    
    public Builder setRefreshToken(String paramString)
    {
      refreshToken = paramString;
      return this;
    }
    
    public Builder setTenantId(String paramString)
    {
      tenantId = paramString;
      return this;
    }
    
    public Builder setUid(String paramString)
    {
      uid = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonUserInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */