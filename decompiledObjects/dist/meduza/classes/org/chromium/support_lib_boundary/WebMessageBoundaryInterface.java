package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

public abstract interface WebMessageBoundaryInterface
  extends FeatureFlagHolderBoundaryInterface
{
  @Deprecated
  public abstract String getData();
  
  public abstract InvocationHandler getMessagePayload();
  
  public abstract InvocationHandler[] getPorts();
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.WebMessageBoundaryInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */