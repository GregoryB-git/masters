package io.flutter.plugins.googlesignin;

import io.flutter.plugin.common.MethodChannel.Result;

class GoogleSignInPlugin$Delegate$1
  extends GoogleSignInPlugin.ErrorConvertingMethodChannelResult<Boolean>
{
  public GoogleSignInPlugin$Delegate$1(GoogleSignInPlugin.Delegate paramDelegate, MethodChannel.Result paramResult)
  {
    super(paramResult);
  }
  
  public void success(Boolean paramBoolean)
  {
    result.success(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.googlesignin.GoogleSignInPlugin.Delegate.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */