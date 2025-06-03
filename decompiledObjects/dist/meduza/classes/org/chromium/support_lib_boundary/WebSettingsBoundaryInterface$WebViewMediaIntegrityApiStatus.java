package org.chromium.support_lib_boundary;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({java.lang.annotation.ElementType.TYPE_USE})
public @interface WebSettingsBoundaryInterface$WebViewMediaIntegrityApiStatus
{
  public static final int DISABLED = 0;
  public static final int ENABLED = 2;
  public static final int ENABLED_WITHOUT_APP_IDENTITY = 1;
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.WebSettingsBoundaryInterface.WebViewMediaIntegrityApiStatus
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */