package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

public abstract interface WebMessageCallbackBoundaryInterface
  extends FeatureFlagHolderBoundaryInterface
{
  public abstract void onMessage(InvocationHandler paramInvocationHandler1, InvocationHandler paramInvocationHandler2);
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */