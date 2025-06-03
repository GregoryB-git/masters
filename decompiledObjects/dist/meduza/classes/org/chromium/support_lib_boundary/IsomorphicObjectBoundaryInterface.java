package org.chromium.support_lib_boundary;

import java.util.concurrent.Callable;

public abstract interface IsomorphicObjectBoundaryInterface
{
  public abstract Object getOrCreatePeer(Callable<Object> paramCallable);
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.IsomorphicObjectBoundaryInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */