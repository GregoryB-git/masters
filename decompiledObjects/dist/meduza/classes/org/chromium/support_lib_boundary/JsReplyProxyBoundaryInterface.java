package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

public abstract interface JsReplyProxyBoundaryInterface
  extends IsomorphicObjectBoundaryInterface
{
  public abstract void postMessage(String paramString);
  
  public abstract void postMessageWithPayload(InvocationHandler paramInvocationHandler);
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */