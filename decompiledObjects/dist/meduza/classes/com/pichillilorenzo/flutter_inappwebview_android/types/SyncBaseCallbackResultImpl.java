package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.concurrent.CountDownLatch;

public class SyncBaseCallbackResultImpl<T>
  extends BaseCallbackResultImpl<T>
{
  public final CountDownLatch latch = new CountDownLatch(1);
  public T result = null;
  
  public void defaultBehaviour(T paramT)
  {
    latch.countDown();
  }
  
  public void error(String paramString1, String paramString2, Object paramObject)
  {
    latch.countDown();
  }
  
  public void notImplemented()
  {
    defaultBehaviour(null);
  }
  
  public void success(Object paramObject)
  {
    paramObject = decodeResult(paramObject);
    result = paramObject;
    boolean bool;
    if (paramObject == null) {
      bool = nullSuccess();
    } else {
      bool = nonNullSuccess(paramObject);
    }
    if (bool) {
      defaultBehaviour(paramObject);
    } else {
      latch.countDown();
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */