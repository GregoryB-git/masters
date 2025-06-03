package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

public abstract interface ServiceWorkerControllerBoundaryInterface
{
  public abstract InvocationHandler getServiceWorkerWebSettings();
  
  public abstract void setServiceWorkerClient(InvocationHandler paramInvocationHandler);
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */