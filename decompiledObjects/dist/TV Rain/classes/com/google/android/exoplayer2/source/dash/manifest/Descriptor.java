package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;

public final class Descriptor
{
  @Nullable
  public final String id;
  @NonNull
  public final String schemeIdUri;
  @Nullable
  public final String value;
  
  public Descriptor(@NonNull String paramString1, @Nullable String paramString2, @Nullable String paramString3)
  {
    schemeIdUri = paramString1;
    value = paramString2;
    id = paramString3;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (Descriptor.class == paramObject.getClass()))
    {
      paramObject = (Descriptor)paramObject;
      if ((!Util.areEqual(schemeIdUri, schemeIdUri)) || (!Util.areEqual(value, value)) || (!Util.areEqual(id, id))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    String str = schemeIdUri;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = value;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = id;
    if (str != null) {
      i = str.hashCode();
    }
    return (j * 31 + k) * 31 + i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.manifest.Descriptor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */