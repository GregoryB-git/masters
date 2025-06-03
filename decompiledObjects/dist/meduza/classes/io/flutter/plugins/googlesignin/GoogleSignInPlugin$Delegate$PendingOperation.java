package io.flutter.plugins.googlesignin;

class GoogleSignInPlugin$Delegate$PendingOperation
{
  public final Messages.Result<Boolean> boolResult;
  public final Object data;
  public final String method;
  public final Messages.Result<String> stringResult;
  public final Messages.Result<Messages.UserData> userDataResult;
  public final Messages.Result<Void> voidResult;
  
  public GoogleSignInPlugin$Delegate$PendingOperation(String paramString, Messages.Result<Messages.UserData> paramResult, Messages.Result<Void> paramResult1, Messages.Result<Boolean> paramResult2, Messages.Result<String> paramResult3, Object paramObject)
  {
    method = paramString;
    userDataResult = paramResult;
    voidResult = paramResult1;
    boolResult = paramResult2;
    stringResult = paramResult3;
    data = paramObject;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.googlesignin.GoogleSignInPlugin.Delegate.PendingOperation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */