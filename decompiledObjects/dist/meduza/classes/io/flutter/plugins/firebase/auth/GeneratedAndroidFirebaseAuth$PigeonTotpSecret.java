package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

public final class GeneratedAndroidFirebaseAuth$PigeonTotpSecret
{
  private Long codeIntervalSeconds;
  private Long codeLength;
  private Long enrollmentCompletionDeadline;
  private String hashingAlgorithm;
  private String secretKey;
  
  public static PigeonTotpSecret fromList(ArrayList<Object> paramArrayList)
  {
    PigeonTotpSecret localPigeonTotpSecret = new PigeonTotpSecret();
    Object localObject1 = paramArrayList.get(0);
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
    localPigeonTotpSecret.setCodeIntervalSeconds((Long)localObject1);
    localObject1 = paramArrayList.get(1);
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
    localPigeonTotpSecret.setCodeLength((Long)localObject1);
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
    localPigeonTotpSecret.setEnrollmentCompletionDeadline((Long)localObject1);
    localPigeonTotpSecret.setHashingAlgorithm((String)paramArrayList.get(3));
    localPigeonTotpSecret.setSecretKey((String)paramArrayList.get(4));
    return localPigeonTotpSecret;
  }
  
  public Long getCodeIntervalSeconds()
  {
    return codeIntervalSeconds;
  }
  
  public Long getCodeLength()
  {
    return codeLength;
  }
  
  public Long getEnrollmentCompletionDeadline()
  {
    return enrollmentCompletionDeadline;
  }
  
  public String getHashingAlgorithm()
  {
    return hashingAlgorithm;
  }
  
  public String getSecretKey()
  {
    return secretKey;
  }
  
  public void setCodeIntervalSeconds(Long paramLong)
  {
    codeIntervalSeconds = paramLong;
  }
  
  public void setCodeLength(Long paramLong)
  {
    codeLength = paramLong;
  }
  
  public void setEnrollmentCompletionDeadline(Long paramLong)
  {
    enrollmentCompletionDeadline = paramLong;
  }
  
  public void setHashingAlgorithm(String paramString)
  {
    hashingAlgorithm = paramString;
  }
  
  public void setSecretKey(String paramString)
  {
    if (paramString != null)
    {
      secretKey = paramString;
      return;
    }
    throw new IllegalStateException("Nonnull field \"secretKey\" is null.");
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(5);
    localArrayList.add(codeIntervalSeconds);
    localArrayList.add(codeLength);
    localArrayList.add(enrollmentCompletionDeadline);
    localArrayList.add(hashingAlgorithm);
    localArrayList.add(secretKey);
    return localArrayList;
  }
  
  public static final class Builder
  {
    private Long codeIntervalSeconds;
    private Long codeLength;
    private Long enrollmentCompletionDeadline;
    private String hashingAlgorithm;
    private String secretKey;
    
    public GeneratedAndroidFirebaseAuth.PigeonTotpSecret build()
    {
      GeneratedAndroidFirebaseAuth.PigeonTotpSecret localPigeonTotpSecret = new GeneratedAndroidFirebaseAuth.PigeonTotpSecret();
      localPigeonTotpSecret.setCodeIntervalSeconds(codeIntervalSeconds);
      localPigeonTotpSecret.setCodeLength(codeLength);
      localPigeonTotpSecret.setEnrollmentCompletionDeadline(enrollmentCompletionDeadline);
      localPigeonTotpSecret.setHashingAlgorithm(hashingAlgorithm);
      localPigeonTotpSecret.setSecretKey(secretKey);
      return localPigeonTotpSecret;
    }
    
    public Builder setCodeIntervalSeconds(Long paramLong)
    {
      codeIntervalSeconds = paramLong;
      return this;
    }
    
    public Builder setCodeLength(Long paramLong)
    {
      codeLength = paramLong;
      return this;
    }
    
    public Builder setEnrollmentCompletionDeadline(Long paramLong)
    {
      enrollmentCompletionDeadline = paramLong;
      return this;
    }
    
    public Builder setHashingAlgorithm(String paramString)
    {
      hashingAlgorithm = paramString;
      return this;
    }
    
    public Builder setSecretKey(String paramString)
    {
      secretKey = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonTotpSecret
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */