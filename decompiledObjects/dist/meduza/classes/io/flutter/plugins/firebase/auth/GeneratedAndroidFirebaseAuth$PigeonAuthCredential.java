package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

public final class GeneratedAndroidFirebaseAuth$PigeonAuthCredential
{
  private String accessToken;
  private Long nativeId;
  private String providerId;
  private String signInMethod;
  
  public static PigeonAuthCredential fromList(ArrayList<Object> paramArrayList)
  {
    PigeonAuthCredential localPigeonAuthCredential = new PigeonAuthCredential();
    localPigeonAuthCredential.setProviderId((String)paramArrayList.get(0));
    localPigeonAuthCredential.setSignInMethod((String)paramArrayList.get(1));
    Object localObject = paramArrayList.get(2);
    if (localObject == null)
    {
      localObject = null;
    }
    else
    {
      long l;
      if ((localObject instanceof Integer)) {
        l = ((Integer)localObject).intValue();
      } else {
        l = ((Long)localObject).longValue();
      }
      localObject = Long.valueOf(l);
    }
    localPigeonAuthCredential.setNativeId((Long)localObject);
    localPigeonAuthCredential.setAccessToken((String)paramArrayList.get(3));
    return localPigeonAuthCredential;
  }
  
  public String getAccessToken()
  {
    return accessToken;
  }
  
  public Long getNativeId()
  {
    return nativeId;
  }
  
  public String getProviderId()
  {
    return providerId;
  }
  
  public String getSignInMethod()
  {
    return signInMethod;
  }
  
  public void setAccessToken(String paramString)
  {
    accessToken = paramString;
  }
  
  public void setNativeId(Long paramLong)
  {
    if (paramLong != null)
    {
      nativeId = paramLong;
      return;
    }
    throw new IllegalStateException("Nonnull field \"nativeId\" is null.");
  }
  
  public void setProviderId(String paramString)
  {
    if (paramString != null)
    {
      providerId = paramString;
      return;
    }
    throw new IllegalStateException("Nonnull field \"providerId\" is null.");
  }
  
  public void setSignInMethod(String paramString)
  {
    if (paramString != null)
    {
      signInMethod = paramString;
      return;
    }
    throw new IllegalStateException("Nonnull field \"signInMethod\" is null.");
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(4);
    localArrayList.add(providerId);
    localArrayList.add(signInMethod);
    localArrayList.add(nativeId);
    localArrayList.add(accessToken);
    return localArrayList;
  }
  
  public static final class Builder
  {
    private String accessToken;
    private Long nativeId;
    private String providerId;
    private String signInMethod;
    
    public GeneratedAndroidFirebaseAuth.PigeonAuthCredential build()
    {
      GeneratedAndroidFirebaseAuth.PigeonAuthCredential localPigeonAuthCredential = new GeneratedAndroidFirebaseAuth.PigeonAuthCredential();
      localPigeonAuthCredential.setProviderId(providerId);
      localPigeonAuthCredential.setSignInMethod(signInMethod);
      localPigeonAuthCredential.setNativeId(nativeId);
      localPigeonAuthCredential.setAccessToken(accessToken);
      return localPigeonAuthCredential;
    }
    
    public Builder setAccessToken(String paramString)
    {
      accessToken = paramString;
      return this;
    }
    
    public Builder setNativeId(Long paramLong)
    {
      nativeId = paramLong;
      return this;
    }
    
    public Builder setProviderId(String paramString)
    {
      providerId = paramString;
      return this;
    }
    
    public Builder setSignInMethod(String paramString)
    {
      signInMethod = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonAuthCredential
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */