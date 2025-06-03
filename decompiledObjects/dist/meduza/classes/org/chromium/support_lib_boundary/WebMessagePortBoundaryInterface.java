package org.chromium.support_lib_boundary;

import android.os.Handler;
import java.lang.reflect.InvocationHandler;

public abstract interface WebMessagePortBoundaryInterface
{
  public abstract void close();
  
  public abstract void postMessage(InvocationHandler paramInvocationHandler);
  
  public abstract void setWebMessageCallback(InvocationHandler paramInvocationHandler);
  
  public abstract void setWebMessageCallback(InvocationHandler paramInvocationHandler, Handler paramHandler);
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */