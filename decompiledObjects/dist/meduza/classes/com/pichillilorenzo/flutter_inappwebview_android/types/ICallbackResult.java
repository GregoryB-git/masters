package com.pichillilorenzo.flutter_inappwebview_android.types;

import io.flutter.plugin.common.MethodChannel.Result;

public abstract interface ICallbackResult<T>
  extends MethodChannel.Result
{
  public abstract T decodeResult(Object paramObject);
  
  public abstract void defaultBehaviour(T paramT);
  
  public abstract boolean nonNullSuccess(T paramT);
  
  public abstract boolean nullSuccess();
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */