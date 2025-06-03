package io.flutter.plugins.googlesignin;

import io.flutter.plugin.common.MethodChannel.Result;
import java.util.HashMap;

class GoogleSignInPlugin$UserDataMethodChannelResult
  extends GoogleSignInPlugin.ErrorConvertingMethodChannelResult<Messages.UserData>
{
  public GoogleSignInPlugin$UserDataMethodChannelResult(MethodChannel.Result paramResult)
  {
    super(paramResult);
  }
  
  public void success(Messages.UserData paramUserData)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("email", paramUserData.getEmail());
    localHashMap.put("id", paramUserData.getId());
    localHashMap.put("idToken", paramUserData.getIdToken());
    localHashMap.put("serverAuthCode", paramUserData.getServerAuthCode());
    localHashMap.put("displayName", paramUserData.getDisplayName());
    if (paramUserData.getPhotoUrl() != null) {
      localHashMap.put("photoUrl", paramUserData.getPhotoUrl());
    }
    result.success(localHashMap);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.googlesignin.GoogleSignInPlugin.UserDataMethodChannelResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */