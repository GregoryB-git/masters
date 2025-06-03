package org.chromium.support_lib_boundary;

import java.util.Set;

public abstract interface ServiceWorkerWebSettingsBoundaryInterface
{
  public abstract boolean getAllowContentAccess();
  
  public abstract boolean getAllowFileAccess();
  
  public abstract boolean getBlockNetworkLoads();
  
  public abstract int getCacheMode();
  
  public abstract Set<String> getRequestedWithHeaderOriginAllowList();
  
  public abstract void setAllowContentAccess(boolean paramBoolean);
  
  public abstract void setAllowFileAccess(boolean paramBoolean);
  
  public abstract void setBlockNetworkLoads(boolean paramBoolean);
  
  public abstract void setCacheMode(int paramInt);
  
  public abstract void setRequestedWithHeaderOriginAllowList(Set<String> paramSet);
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */