package org.chromium.support_lib_boundary;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface WebSettingsBoundaryInterface$AttributionBehavior
{
  public static final int APP_SOURCE_AND_APP_TRIGGER = 3;
  public static final int APP_SOURCE_AND_WEB_TRIGGER = 1;
  public static final int DISABLED = 0;
  public static final int WEB_SOURCE_AND_WEB_TRIGGER = 2;
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.WebSettingsBoundaryInterface.AttributionBehavior
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */