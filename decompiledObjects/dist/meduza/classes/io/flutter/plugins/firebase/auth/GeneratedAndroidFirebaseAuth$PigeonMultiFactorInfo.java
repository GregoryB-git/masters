package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

public final class GeneratedAndroidFirebaseAuth$PigeonMultiFactorInfo
{
  private String displayName;
  private Double enrollmentTimestamp;
  private String factorId;
  private String phoneNumber;
  private String uid;
  
  public static PigeonMultiFactorInfo fromList(ArrayList<Object> paramArrayList)
  {
    PigeonMultiFactorInfo localPigeonMultiFactorInfo = new PigeonMultiFactorInfo();
    localPigeonMultiFactorInfo.setDisplayName((String)paramArrayList.get(0));
    localPigeonMultiFactorInfo.setEnrollmentTimestamp((Double)paramArrayList.get(1));
    localPigeonMultiFactorInfo.setFactorId((String)paramArrayList.get(2));
    localPigeonMultiFactorInfo.setUid((String)paramArrayList.get(3));
    localPigeonMultiFactorInfo.setPhoneNumber((String)paramArrayList.get(4));
    return localPigeonMultiFactorInfo;
  }
  
  public String getDisplayName()
  {
    return displayName;
  }
  
  public Double getEnrollmentTimestamp()
  {
    return enrollmentTimestamp;
  }
  
  public String getFactorId()
  {
    return factorId;
  }
  
  public String getPhoneNumber()
  {
    return phoneNumber;
  }
  
  public String getUid()
  {
    return uid;
  }
  
  public void setDisplayName(String paramString)
  {
    displayName = paramString;
  }
  
  public void setEnrollmentTimestamp(Double paramDouble)
  {
    if (paramDouble != null)
    {
      enrollmentTimestamp = paramDouble;
      return;
    }
    throw new IllegalStateException("Nonnull field \"enrollmentTimestamp\" is null.");
  }
  
  public void setFactorId(String paramString)
  {
    factorId = paramString;
  }
  
  public void setPhoneNumber(String paramString)
  {
    phoneNumber = paramString;
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
    ArrayList localArrayList = new ArrayList(5);
    localArrayList.add(displayName);
    localArrayList.add(enrollmentTimestamp);
    localArrayList.add(factorId);
    localArrayList.add(uid);
    localArrayList.add(phoneNumber);
    return localArrayList;
  }
  
  public static final class Builder
  {
    private String displayName;
    private Double enrollmentTimestamp;
    private String factorId;
    private String phoneNumber;
    private String uid;
    
    public GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo build()
    {
      GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo localPigeonMultiFactorInfo = new GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo();
      localPigeonMultiFactorInfo.setDisplayName(displayName);
      localPigeonMultiFactorInfo.setEnrollmentTimestamp(enrollmentTimestamp);
      localPigeonMultiFactorInfo.setFactorId(factorId);
      localPigeonMultiFactorInfo.setUid(uid);
      localPigeonMultiFactorInfo.setPhoneNumber(phoneNumber);
      return localPigeonMultiFactorInfo;
    }
    
    public Builder setDisplayName(String paramString)
    {
      displayName = paramString;
      return this;
    }
    
    public Builder setEnrollmentTimestamp(Double paramDouble)
    {
      enrollmentTimestamp = paramDouble;
      return this;
    }
    
    public Builder setFactorId(String paramString)
    {
      factorId = paramString;
      return this;
    }
    
    public Builder setPhoneNumber(String paramString)
    {
      phoneNumber = paramString;
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
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */