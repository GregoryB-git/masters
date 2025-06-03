package com.facebook.soloader;

import javax.annotation.Nullable;
import z2;

class MergedSoMapping
{
  public static void invokeJniOnload(String paramString)
  {
    throw new IllegalArgumentException(z2.o("Unknown library: ", paramString));
  }
  
  @Nullable
  public static String mapLibName(String paramString)
  {
    return null;
  }
}

/* Location:
 * Qualified Name:     com.facebook.soloader.MergedSoMapping
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */