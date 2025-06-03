package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;
import java.util.Map;

public final class GeneratedAndroidFirebaseAuth$PigeonIdTokenResult
{
  private Long authTimestamp;
  private Map<String, Object> claims;
  private Long expirationTimestamp;
  private Long issuedAtTimestamp;
  private String signInProvider;
  private String signInSecondFactor;
  private String token;
  
  public static PigeonIdTokenResult fromList(ArrayList<Object> paramArrayList)
  {
    PigeonIdTokenResult localPigeonIdTokenResult = new PigeonIdTokenResult();
    localPigeonIdTokenResult.setToken((String)paramArrayList.get(0));
    Object localObject1 = paramArrayList.get(1);
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
    localPigeonIdTokenResult.setExpirationTimestamp((Long)localObject1);
    localObject1 = paramArrayList.get(2);
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
    localPigeonIdTokenResult.setAuthTimestamp((Long)localObject1);
    localObject1 = paramArrayList.get(3);
    if (localObject1 == null)
    {
      localObject1 = localObject2;
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
    localPigeonIdTokenResult.setIssuedAtTimestamp((Long)localObject1);
    localPigeonIdTokenResult.setSignInProvider((String)paramArrayList.get(4));
    localPigeonIdTokenResult.setClaims((Map)paramArrayList.get(5));
    localPigeonIdTokenResult.setSignInSecondFactor((String)paramArrayList.get(6));
    return localPigeonIdTokenResult;
  }
  
  public Long getAuthTimestamp()
  {
    return authTimestamp;
  }
  
  public Map<String, Object> getClaims()
  {
    return claims;
  }
  
  public Long getExpirationTimestamp()
  {
    return expirationTimestamp;
  }
  
  public Long getIssuedAtTimestamp()
  {
    return issuedAtTimestamp;
  }
  
  public String getSignInProvider()
  {
    return signInProvider;
  }
  
  public String getSignInSecondFactor()
  {
    return signInSecondFactor;
  }
  
  public String getToken()
  {
    return token;
  }
  
  public void setAuthTimestamp(Long paramLong)
  {
    authTimestamp = paramLong;
  }
  
  public void setClaims(Map<String, Object> paramMap)
  {
    claims = paramMap;
  }
  
  public void setExpirationTimestamp(Long paramLong)
  {
    expirationTimestamp = paramLong;
  }
  
  public void setIssuedAtTimestamp(Long paramLong)
  {
    issuedAtTimestamp = paramLong;
  }
  
  public void setSignInProvider(String paramString)
  {
    signInProvider = paramString;
  }
  
  public void setSignInSecondFactor(String paramString)
  {
    signInSecondFactor = paramString;
  }
  
  public void setToken(String paramString)
  {
    token = paramString;
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(7);
    localArrayList.add(token);
    localArrayList.add(expirationTimestamp);
    localArrayList.add(authTimestamp);
    localArrayList.add(issuedAtTimestamp);
    localArrayList.add(signInProvider);
    localArrayList.add(claims);
    localArrayList.add(signInSecondFactor);
    return localArrayList;
  }
  
  public static final class Builder
  {
    private Long authTimestamp;
    private Map<String, Object> claims;
    private Long expirationTimestamp;
    private Long issuedAtTimestamp;
    private String signInProvider;
    private String signInSecondFactor;
    private String token;
    
    public GeneratedAndroidFirebaseAuth.PigeonIdTokenResult build()
    {
      GeneratedAndroidFirebaseAuth.PigeonIdTokenResult localPigeonIdTokenResult = new GeneratedAndroidFirebaseAuth.PigeonIdTokenResult();
      localPigeonIdTokenResult.setToken(token);
      localPigeonIdTokenResult.setExpirationTimestamp(expirationTimestamp);
      localPigeonIdTokenResult.setAuthTimestamp(authTimestamp);
      localPigeonIdTokenResult.setIssuedAtTimestamp(issuedAtTimestamp);
      localPigeonIdTokenResult.setSignInProvider(signInProvider);
      localPigeonIdTokenResult.setClaims(claims);
      localPigeonIdTokenResult.setSignInSecondFactor(signInSecondFactor);
      return localPigeonIdTokenResult;
    }
    
    public Builder setAuthTimestamp(Long paramLong)
    {
      authTimestamp = paramLong;
      return this;
    }
    
    public Builder setClaims(Map<String, Object> paramMap)
    {
      claims = paramMap;
      return this;
    }
    
    public Builder setExpirationTimestamp(Long paramLong)
    {
      expirationTimestamp = paramLong;
      return this;
    }
    
    public Builder setIssuedAtTimestamp(Long paramLong)
    {
      issuedAtTimestamp = paramLong;
      return this;
    }
    
    public Builder setSignInProvider(String paramString)
    {
      signInProvider = paramString;
      return this;
    }
    
    public Builder setSignInSecondFactor(String paramString)
    {
      signInSecondFactor = paramString;
      return this;
    }
    
    public Builder setToken(String paramString)
    {
      token = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonIdTokenResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */