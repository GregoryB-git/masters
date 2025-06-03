package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

public final class GeneratedAndroidFirebaseAuth$PigeonUserCredential
{
  private GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo additionalUserInfo;
  private GeneratedAndroidFirebaseAuth.PigeonAuthCredential credential;
  private GeneratedAndroidFirebaseAuth.PigeonUserDetails user;
  
  public static PigeonUserCredential fromList(ArrayList<Object> paramArrayList)
  {
    PigeonUserCredential localPigeonUserCredential = new PigeonUserCredential();
    localPigeonUserCredential.setUser((GeneratedAndroidFirebaseAuth.PigeonUserDetails)paramArrayList.get(0));
    localPigeonUserCredential.setAdditionalUserInfo((GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo)paramArrayList.get(1));
    localPigeonUserCredential.setCredential((GeneratedAndroidFirebaseAuth.PigeonAuthCredential)paramArrayList.get(2));
    return localPigeonUserCredential;
  }
  
  public GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo getAdditionalUserInfo()
  {
    return additionalUserInfo;
  }
  
  public GeneratedAndroidFirebaseAuth.PigeonAuthCredential getCredential()
  {
    return credential;
  }
  
  public GeneratedAndroidFirebaseAuth.PigeonUserDetails getUser()
  {
    return user;
  }
  
  public void setAdditionalUserInfo(GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo paramPigeonAdditionalUserInfo)
  {
    additionalUserInfo = paramPigeonAdditionalUserInfo;
  }
  
  public void setCredential(GeneratedAndroidFirebaseAuth.PigeonAuthCredential paramPigeonAuthCredential)
  {
    credential = paramPigeonAuthCredential;
  }
  
  public void setUser(GeneratedAndroidFirebaseAuth.PigeonUserDetails paramPigeonUserDetails)
  {
    user = paramPigeonUserDetails;
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(3);
    localArrayList.add(user);
    localArrayList.add(additionalUserInfo);
    localArrayList.add(credential);
    return localArrayList;
  }
  
  public static final class Builder
  {
    private GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo additionalUserInfo;
    private GeneratedAndroidFirebaseAuth.PigeonAuthCredential credential;
    private GeneratedAndroidFirebaseAuth.PigeonUserDetails user;
    
    public GeneratedAndroidFirebaseAuth.PigeonUserCredential build()
    {
      GeneratedAndroidFirebaseAuth.PigeonUserCredential localPigeonUserCredential = new GeneratedAndroidFirebaseAuth.PigeonUserCredential();
      localPigeonUserCredential.setUser(user);
      localPigeonUserCredential.setAdditionalUserInfo(additionalUserInfo);
      localPigeonUserCredential.setCredential(credential);
      return localPigeonUserCredential;
    }
    
    public Builder setAdditionalUserInfo(GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo paramPigeonAdditionalUserInfo)
    {
      additionalUserInfo = paramPigeonAdditionalUserInfo;
      return this;
    }
    
    public Builder setCredential(GeneratedAndroidFirebaseAuth.PigeonAuthCredential paramPigeonAuthCredential)
    {
      credential = paramPigeonAuthCredential;
      return this;
    }
    
    public Builder setUser(GeneratedAndroidFirebaseAuth.PigeonUserDetails paramPigeonUserDetails)
    {
      user = paramPigeonUserDetails;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonUserCredential
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */