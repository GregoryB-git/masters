package org.chromium.support_lib_boundary;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface WebSettingsBoundaryInterface$ForceDarkBehavior
{
  public static final int FORCE_DARK_ONLY = 0;
  public static final int MEDIA_QUERY_ONLY = 1;
  public static final int PREFER_MEDIA_QUERY_OVER_FORCE_DARK = 2;
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.WebSettingsBoundaryInterface.ForceDarkBehavior
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */