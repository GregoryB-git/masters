package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
import java.util.List;

public abstract interface ProfileStoreBoundaryInterface
{
  public abstract boolean deleteProfile(String paramString);
  
  public abstract List<String> getAllProfileNames();
  
  public abstract InvocationHandler getOrCreateProfile(String paramString);
  
  public abstract InvocationHandler getProfile(String paramString);
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */