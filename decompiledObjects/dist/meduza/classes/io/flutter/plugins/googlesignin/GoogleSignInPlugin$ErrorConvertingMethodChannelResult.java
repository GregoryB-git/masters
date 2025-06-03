package io.flutter.plugins.googlesignin;

import io.flutter.plugin.common.MethodChannel.Result;

abstract class GoogleSignInPlugin$ErrorConvertingMethodChannelResult<T>
  implements Messages.Result<T>
{
  public final MethodChannel.Result result;
  
  public GoogleSignInPlugin$ErrorConvertingMethodChannelResult(MethodChannel.Result paramResult)
  {
    result = paramResult;
  }
  
  public void error(Throwable paramThrowable)
  {
    if ((paramThrowable instanceof Messages.FlutterError))
    {
      paramThrowable = (Messages.FlutterError)paramThrowable;
      result.error(code, paramThrowable.getMessage(), details);
    }
    else
    {
      result.error("exception", paramThrowable.getMessage(), null);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.googlesignin.GoogleSignInPlugin.ErrorConvertingMethodChannelResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */