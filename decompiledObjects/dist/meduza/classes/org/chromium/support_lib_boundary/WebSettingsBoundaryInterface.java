package org.chromium.support_lib_boundary;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import java.util.Set;

public abstract interface WebSettingsBoundaryInterface
{
  public abstract int getAttributionBehavior();
  
  public abstract int getDisabledActionModeMenuItems();
  
  public abstract boolean getEnterpriseAuthenticationAppLinkPolicyEnabled();
  
  public abstract int getForceDark();
  
  public abstract int getForceDarkBehavior();
  
  public abstract boolean getOffscreenPreRaster();
  
  public abstract Set<String> getRequestedWithHeaderOriginAllowList();
  
  public abstract boolean getSafeBrowsingEnabled();
  
  public abstract Map<String, Object> getUserAgentMetadataMap();
  
  public abstract int getWebViewMediaIntegrityApiDefaultStatus();
  
  public abstract Map<String, Integer> getWebViewMediaIntegrityApiOverrideRules();
  
  public abstract int getWebauthnSupport();
  
  public abstract boolean getWillSuppressErrorPage();
  
  public abstract boolean isAlgorithmicDarkeningAllowed();
  
  public abstract void setAlgorithmicDarkeningAllowed(boolean paramBoolean);
  
  public abstract void setAttributionBehavior(int paramInt);
  
  public abstract void setDisabledActionModeMenuItems(int paramInt);
  
  public abstract void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean paramBoolean);
  
  public abstract void setForceDark(int paramInt);
  
  public abstract void setForceDarkBehavior(int paramInt);
  
  public abstract void setOffscreenPreRaster(boolean paramBoolean);
  
  public abstract void setRequestedWithHeaderOriginAllowList(Set<String> paramSet);
  
  public abstract void setSafeBrowsingEnabled(boolean paramBoolean);
  
  public abstract void setUserAgentMetadataFromMap(Map<String, Object> paramMap);
  
  public abstract void setWebViewMediaIntegrityApiStatus(int paramInt, Map<String, Integer> paramMap);
  
  public abstract void setWebauthnSupport(int paramInt);
  
  public abstract void setWillSuppressErrorPage(boolean paramBoolean);
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface AttributionBehavior
  {
    public static final int APP_SOURCE_AND_APP_TRIGGER = 3;
    public static final int APP_SOURCE_AND_WEB_TRIGGER = 1;
    public static final int DISABLED = 0;
    public static final int WEB_SOURCE_AND_WEB_TRIGGER = 2;
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface ForceDarkBehavior
  {
    public static final int FORCE_DARK_ONLY = 0;
    public static final int MEDIA_QUERY_ONLY = 1;
    public static final int PREFER_MEDIA_QUERY_OVER_FORCE_DARK = 2;
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @Target({java.lang.annotation.ElementType.TYPE_USE})
  public static @interface WebViewMediaIntegrityApiStatus
  {
    public static final int DISABLED = 0;
    public static final int ENABLED = 2;
    public static final int ENABLED_WITHOUT_APP_IDENTITY = 1;
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface WebauthnSupport
  {
    public static final int APP = 1;
    public static final int BROWSER = 2;
    public static final int NONE = 0;
  }
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.WebSettingsBoundaryInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */