package org.chromium.support_lib_boundary;

import java.io.OutputStream;
import java.util.Collection;
import java.util.concurrent.Executor;

public abstract interface TracingControllerBoundaryInterface
{
  public abstract boolean isTracing();
  
  public abstract void start(int paramInt1, Collection<String> paramCollection, int paramInt2);
  
  public abstract boolean stop(OutputStream paramOutputStream, Executor paramExecutor);
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.TracingControllerBoundaryInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */