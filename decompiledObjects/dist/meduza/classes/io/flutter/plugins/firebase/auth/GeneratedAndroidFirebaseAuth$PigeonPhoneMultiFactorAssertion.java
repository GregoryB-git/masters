package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

public final class GeneratedAndroidFirebaseAuth$PigeonPhoneMultiFactorAssertion
{
  private String verificationCode;
  private String verificationId;
  
  public static PigeonPhoneMultiFactorAssertion fromList(ArrayList<Object> paramArrayList)
  {
    PigeonPhoneMultiFactorAssertion localPigeonPhoneMultiFactorAssertion = new PigeonPhoneMultiFactorAssertion();
    localPigeonPhoneMultiFactorAssertion.setVerificationId((String)paramArrayList.get(0));
    localPigeonPhoneMultiFactorAssertion.setVerificationCode((String)paramArrayList.get(1));
    return localPigeonPhoneMultiFactorAssertion;
  }
  
  public String getVerificationCode()
  {
    return verificationCode;
  }
  
  public String getVerificationId()
  {
    return verificationId;
  }
  
  public void setVerificationCode(String paramString)
  {
    if (paramString != null)
    {
      verificationCode = paramString;
      return;
    }
    throw new IllegalStateException("Nonnull field \"verificationCode\" is null.");
  }
  
  public void setVerificationId(String paramString)
  {
    if (paramString != null)
    {
      verificationId = paramString;
      return;
    }
    throw new IllegalStateException("Nonnull field \"verificationId\" is null.");
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(2);
    localArrayList.add(verificationId);
    localArrayList.add(verificationCode);
    return localArrayList;
  }
  
  public static final class Builder
  {
    private String verificationCode;
    private String verificationId;
    
    public GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion build()
    {
      GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion localPigeonPhoneMultiFactorAssertion = new GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion();
      localPigeonPhoneMultiFactorAssertion.setVerificationId(verificationId);
      localPigeonPhoneMultiFactorAssertion.setVerificationCode(verificationCode);
      return localPigeonPhoneMultiFactorAssertion;
    }
    
    public Builder setVerificationCode(String paramString)
    {
      verificationCode = paramString;
      return this;
    }
    
    public Builder setVerificationId(String paramString)
    {
      verificationId = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */