package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

public final class GeneratedAndroidFirebaseAuth$PigeonVerifyPhoneNumberRequest
{
  private String autoRetrievedSmsCodeForTesting;
  private Long forceResendingToken;
  private String multiFactorInfoId;
  private String multiFactorSessionId;
  private String phoneNumber;
  private Long timeout;
  
  public static PigeonVerifyPhoneNumberRequest fromList(ArrayList<Object> paramArrayList)
  {
    PigeonVerifyPhoneNumberRequest localPigeonVerifyPhoneNumberRequest = new PigeonVerifyPhoneNumberRequest();
    localPigeonVerifyPhoneNumberRequest.setPhoneNumber((String)paramArrayList.get(0));
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
    localPigeonVerifyPhoneNumberRequest.setTimeout((Long)localObject1);
    localObject1 = paramArrayList.get(2);
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
    localPigeonVerifyPhoneNumberRequest.setForceResendingToken((Long)localObject1);
    localPigeonVerifyPhoneNumberRequest.setAutoRetrievedSmsCodeForTesting((String)paramArrayList.get(3));
    localPigeonVerifyPhoneNumberRequest.setMultiFactorInfoId((String)paramArrayList.get(4));
    localPigeonVerifyPhoneNumberRequest.setMultiFactorSessionId((String)paramArrayList.get(5));
    return localPigeonVerifyPhoneNumberRequest;
  }
  
  public String getAutoRetrievedSmsCodeForTesting()
  {
    return autoRetrievedSmsCodeForTesting;
  }
  
  public Long getForceResendingToken()
  {
    return forceResendingToken;
  }
  
  public String getMultiFactorInfoId()
  {
    return multiFactorInfoId;
  }
  
  public String getMultiFactorSessionId()
  {
    return multiFactorSessionId;
  }
  
  public String getPhoneNumber()
  {
    return phoneNumber;
  }
  
  public Long getTimeout()
  {
    return timeout;
  }
  
  public void setAutoRetrievedSmsCodeForTesting(String paramString)
  {
    autoRetrievedSmsCodeForTesting = paramString;
  }
  
  public void setForceResendingToken(Long paramLong)
  {
    forceResendingToken = paramLong;
  }
  
  public void setMultiFactorInfoId(String paramString)
  {
    multiFactorInfoId = paramString;
  }
  
  public void setMultiFactorSessionId(String paramString)
  {
    multiFactorSessionId = paramString;
  }
  
  public void setPhoneNumber(String paramString)
  {
    phoneNumber = paramString;
  }
  
  public void setTimeout(Long paramLong)
  {
    if (paramLong != null)
    {
      timeout = paramLong;
      return;
    }
    throw new IllegalStateException("Nonnull field \"timeout\" is null.");
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(6);
    localArrayList.add(phoneNumber);
    localArrayList.add(timeout);
    localArrayList.add(forceResendingToken);
    localArrayList.add(autoRetrievedSmsCodeForTesting);
    localArrayList.add(multiFactorInfoId);
    localArrayList.add(multiFactorSessionId);
    return localArrayList;
  }
  
  public static final class Builder
  {
    private String autoRetrievedSmsCodeForTesting;
    private Long forceResendingToken;
    private String multiFactorInfoId;
    private String multiFactorSessionId;
    private String phoneNumber;
    private Long timeout;
    
    public GeneratedAndroidFirebaseAuth.PigeonVerifyPhoneNumberRequest build()
    {
      GeneratedAndroidFirebaseAuth.PigeonVerifyPhoneNumberRequest localPigeonVerifyPhoneNumberRequest = new GeneratedAndroidFirebaseAuth.PigeonVerifyPhoneNumberRequest();
      localPigeonVerifyPhoneNumberRequest.setPhoneNumber(phoneNumber);
      localPigeonVerifyPhoneNumberRequest.setTimeout(timeout);
      localPigeonVerifyPhoneNumberRequest.setForceResendingToken(forceResendingToken);
      localPigeonVerifyPhoneNumberRequest.setAutoRetrievedSmsCodeForTesting(autoRetrievedSmsCodeForTesting);
      localPigeonVerifyPhoneNumberRequest.setMultiFactorInfoId(multiFactorInfoId);
      localPigeonVerifyPhoneNumberRequest.setMultiFactorSessionId(multiFactorSessionId);
      return localPigeonVerifyPhoneNumberRequest;
    }
    
    public Builder setAutoRetrievedSmsCodeForTesting(String paramString)
    {
      autoRetrievedSmsCodeForTesting = paramString;
      return this;
    }
    
    public Builder setForceResendingToken(Long paramLong)
    {
      forceResendingToken = paramLong;
      return this;
    }
    
    public Builder setMultiFactorInfoId(String paramString)
    {
      multiFactorInfoId = paramString;
      return this;
    }
    
    public Builder setMultiFactorSessionId(String paramString)
    {
      multiFactorSessionId = paramString;
      return this;
    }
    
    public Builder setPhoneNumber(String paramString)
    {
      phoneNumber = paramString;
      return this;
    }
    
    public Builder setTimeout(Long paramLong)
    {
      timeout = paramLong;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonVerifyPhoneNumberRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */