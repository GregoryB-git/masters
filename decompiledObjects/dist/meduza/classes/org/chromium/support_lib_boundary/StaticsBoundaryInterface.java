package org.chromium.support_lib_boundary;

import android.content.Context;
import android.net.Uri;
import android.webkit.ValueCallback;
import java.util.List;
import java.util.Set;

public abstract interface StaticsBoundaryInterface
{
  public abstract Uri getSafeBrowsingPrivacyPolicyUrl();
  
  public abstract String getVariationsHeader();
  
  public abstract void initSafeBrowsing(Context paramContext, ValueCallback<Boolean> paramValueCallback);
  
  public abstract boolean isMultiProcessEnabled();
  
  public abstract void setSafeBrowsingAllowlist(Set<String> paramSet, ValueCallback<Boolean> paramValueCallback);
  
  public abstract void setSafeBrowsingWhitelist(List<String> paramList, ValueCallback<Boolean> paramValueCallback);
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.StaticsBoundaryInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */