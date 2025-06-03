package org.chromium.support_lib_boundary;

import java.util.concurrent.Executor;

public abstract interface ProxyControllerBoundaryInterface
{
  public abstract void clearProxyOverride(Runnable paramRunnable, Executor paramExecutor);
  
  public abstract void setProxyOverride(String[][] paramArrayOfString, String[] paramArrayOfString1, Runnable paramRunnable, Executor paramExecutor);
  
  public abstract void setProxyOverride(String[][] paramArrayOfString, String[] paramArrayOfString1, Runnable paramRunnable, Executor paramExecutor, boolean paramBoolean);
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */