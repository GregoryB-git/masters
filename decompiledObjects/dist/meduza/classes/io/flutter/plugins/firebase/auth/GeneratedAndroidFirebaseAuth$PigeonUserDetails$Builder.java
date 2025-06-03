package io.flutter.plugins.firebase.auth;

import java.util.List;
import java.util.Map;

public final class GeneratedAndroidFirebaseAuth$PigeonUserDetails$Builder
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

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonUserDetails.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */