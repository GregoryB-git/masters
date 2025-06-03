package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
public abstract class GooglePlayServicesManifestException
  extends IllegalStateException
{
  public final int o;
  
  public GooglePlayServicesManifestException(int paramInt, String paramString)
  {
    super(paramString);
    o = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.GooglePlayServicesManifestException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */