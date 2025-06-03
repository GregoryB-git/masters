package org.chromium.support_lib_boundary;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public final class ProcessGlobalConfigConstants
{
  public static final String CACHE_DIRECTORY_BASE_PATH = "CACHE_DIRECTORY_BASE_PATH";
  public static final String DATA_DIRECTORY_BASE_PATH = "DATA_DIRECTORY_BASE_PATH";
  public static final String DATA_DIRECTORY_SUFFIX = "DATA_DIRECTORY_SUFFIX";
  
  @Retention(RetentionPolicy.SOURCE)
  @Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD})
  public static @interface ProcessGlobalConfigMapKey {}
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.ProcessGlobalConfigConstants
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */