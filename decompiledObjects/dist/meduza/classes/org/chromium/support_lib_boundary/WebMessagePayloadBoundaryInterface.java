package org.chromium.support_lib_boundary;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract interface WebMessagePayloadBoundaryInterface
  extends FeatureFlagHolderBoundaryInterface
{
  public abstract byte[] getAsArrayBuffer();
  
  public abstract String getAsString();
  
  public abstract int getType();
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface WebMessagePayloadType
  {
    public static final int TYPE_ARRAY_BUFFER = 1;
    public static final int TYPE_STRING = 0;
  }
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */