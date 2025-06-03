package com.pichillilorenzo.flutter_inappwebview_android.types;

public class BaseCallbackResultImpl<T>
  implements ICallbackResult<T>
{
  public T decodeResult(Object paramObject)
  {
    return null;
  }
  
  public void defaultBehaviour(T paramT) {}
  
  public void error(String paramString1, String paramString2, Object paramObject) {}
  
  public boolean nonNullSuccess(T paramT)
  {
    return true;
  }
  
  public void notImplemented()
  {
    defaultBehaviour(null);
  }
  
  public boolean nullSuccess()
  {
    return true;
  }
  
  public void success(Object paramObject)
  {
    paramObject = decodeResult(paramObject);
    boolean bool;
    if (paramObject == null) {
      bool = nullSuccess();
    } else {
      bool = nonNullSuccess(paramObject);
    }
    if (bool) {
      defaultBehaviour(paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */