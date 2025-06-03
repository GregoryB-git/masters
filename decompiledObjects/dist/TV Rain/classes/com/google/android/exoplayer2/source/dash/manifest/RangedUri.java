package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.UriUtil;
import z2;

public final class RangedUri
{
  private int hashCode;
  public final long length;
  private final String referenceUri;
  public final long start;
  
  public RangedUri(@Nullable String paramString, long paramLong1, long paramLong2)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    referenceUri = str;
    start = paramLong1;
    length = paramLong2;
  }
  
  @Nullable
  public RangedUri attemptMerge(@Nullable RangedUri paramRangedUri, String paramString)
  {
    String str = resolveUriString(paramString);
    if ((paramRangedUri != null) && (str.equals(paramRangedUri.resolveUriString(paramString))))
    {
      long l1 = length;
      long l2 = -1L;
      long l3;
      if (l1 != -1L)
      {
        l3 = start;
        if (l3 + l1 == start)
        {
          l4 = length;
          if (l4 != -1L) {
            l2 = l1 + l4;
          }
          return new RangedUri(str, l3, l2);
        }
      }
      long l4 = length;
      if (l4 != -1L)
      {
        l3 = start;
        if (l3 + l4 == start)
        {
          if (l1 != -1L) {
            l2 = l4 + l1;
          }
          return new RangedUri(str, l3, l2);
        }
      }
    }
    return null;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (RangedUri.class == paramObject.getClass()))
    {
      paramObject = (RangedUri)paramObject;
      if ((start != start) || (length != length) || (!referenceUri.equals(referenceUri))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    if (hashCode == 0)
    {
      int i = (int)start;
      int j = (int)length;
      hashCode = (referenceUri.hashCode() + ((527 + i) * 31 + j) * 31);
    }
    return hashCode;
  }
  
  public Uri resolveUri(String paramString)
  {
    return UriUtil.resolveToUri(paramString, referenceUri);
  }
  
  public String resolveUriString(String paramString)
  {
    return UriUtil.resolve(paramString, referenceUri);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("RangedUri(referenceUri=");
    localStringBuilder.append(referenceUri);
    localStringBuilder.append(", start=");
    localStringBuilder.append(start);
    localStringBuilder.append(", length=");
    return z2.r(localStringBuilder, length, ")");
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.manifest.RangedUri
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */