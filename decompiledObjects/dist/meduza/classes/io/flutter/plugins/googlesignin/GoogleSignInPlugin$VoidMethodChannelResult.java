package io.flutter.plugins.googlesignin;

import io.flutter.plugin.common.MethodChannel.Result;

class GoogleSignInPlugin$VoidMethodChannelResult
  extends GoogleSignInPlugin.ErrorConvertingMethodChannelResult<Void>
{
  public GoogleSignInPlugin$VoidMethodChannelResult(MethodChannel.Result paramResult)
  {
    super(paramResult);
  }
  
  public void success(Void paramVoid)
  {
    result.success(null);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.googlesignin.GoogleSignInPlugin.VoidMethodChannelResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */