package io.flutter.plugins.googlesignin;

import io.flutter.plugin.common.MethodChannel.Result;
import java.util.HashMap;

class GoogleSignInPlugin$Delegate$2
  extends GoogleSignInPlugin.ErrorConvertingMethodChannelResult<String>
{
  public GoogleSignInPlugin$Delegate$2(GoogleSignInPlugin.Delegate paramDelegate, MethodChannel.Result paramResult)
  {
    super(paramResult);
  }
  
  public void success(String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("accessToken", paramString);
    result.success(localHashMap);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.googlesignin.GoogleSignInPlugin.Delegate.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */