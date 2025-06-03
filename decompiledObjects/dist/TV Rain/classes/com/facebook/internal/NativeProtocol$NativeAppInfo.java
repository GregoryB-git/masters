package com.facebook.internal;

import java.util.TreeSet;

abstract class NativeProtocol$NativeAppInfo
{
  private TreeSet<Integer> availableVersions;
  
  private void fetchAvailableVersions(boolean paramBoolean)
  {
    if (!paramBoolean) {}
    try
    {
      TreeSet localTreeSet = availableVersions;
      if ((localTreeSet == null) || (localTreeSet.isEmpty())) {
        availableVersions = NativeProtocol.access$000(this);
      }
      return;
    }
    finally {}
  }
  
  public TreeSet<Integer> getAvailableVersions()
  {
    TreeSet localTreeSet = availableVersions;
    if ((localTreeSet == null) || (localTreeSet.isEmpty())) {
      fetchAvailableVersions(false);
    }
    return availableVersions;
  }
  
  public abstract String getLoginActivity();
  
  public abstract String getPackage();
}

/* Location:
 * Qualified Name:     com.facebook.internal.NativeProtocol.NativeAppInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */