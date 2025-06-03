package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class GeneratedAndroidFirebaseAuth$PigeonUserDetails
{
  private List<Map<Object, Object>> providerData;
  private GeneratedAndroidFirebaseAuth.PigeonUserInfo userInfo;
  
  public static PigeonUserDetails fromList(ArrayList<Object> paramArrayList)
  {
    PigeonUserDetails localPigeonUserDetails = new PigeonUserDetails();
    localPigeonUserDetails.setUserInfo((GeneratedAndroidFirebaseAuth.PigeonUserInfo)paramArrayList.get(0));
    localPigeonUserDetails.setProviderData((List)paramArrayList.get(1));
    return localPigeonUserDetails;
  }
  
  public List<Map<Object, Object>> getProviderData()
  {
    return providerData;
  }
  
  public GeneratedAndroidFirebaseAuth.PigeonUserInfo getUserInfo()
  {
    return userInfo;
  }
  
  public void setProviderData(List<Map<Object, Object>> paramList)
  {
    if (paramList != null)
    {
      providerData = paramList;
      return;
    }
    throw new IllegalStateException("Nonnull field \"providerData\" is null.");
  }
  
  public void setUserInfo(GeneratedAndroidFirebaseAuth.PigeonUserInfo paramPigeonUserInfo)
  {
    if (paramPigeonUserInfo != null)
    {
      userInfo = paramPigeonUserInfo;
      return;
    }
    throw new IllegalStateException("Nonnull field \"userInfo\" is null.");
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(2);
    localArrayList.add(userInfo);
    localArrayList.add(providerData);
    return localArrayList;
  }
  
  public static final class Builder
  {
    private List<Map<Object, Object>> providerData;
    private GeneratedAndroidFirebaseAuth.PigeonUserInfo userInfo;
    
    public GeneratedAndroidFirebaseAuth.PigeonUserDetails build()
    {
      GeneratedAndroidFirebaseAuth.PigeonUserDetails localPigeonUserDetails = new GeneratedAndroidFirebaseAuth.PigeonUserDetails();
      localPigeonUserDetails.setUserInfo(userInfo);
      localPigeonUserDetails.setProviderData(providerData);
      return localPigeonUserDetails;
    }
    
    public Builder setProviderData(List<Map<Object, Object>> paramList)
    {
      providerData = paramList;
      return this;
    }
    
    public Builder setUserInfo(GeneratedAndroidFirebaseAuth.PigeonUserInfo paramPigeonUserInfo)
    {
      userInfo = paramPigeonUserInfo;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonUserDetails
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */