package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

final class qs
  extends LinkedHashMap<Uri, byte[]>
{
  public qs()
  {
    super(8, 1.0F, false);
  }
  
  public final byte[] a(Uri paramUri, byte[] paramArrayOfByte)
  {
    return (byte[])super.put(paramUri, (byte[])rp.a(paramArrayOfByte));
  }
  
  public final byte[] a(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    return (byte[])super.get(paramObject);
  }
  
  public final boolean removeEldestEntry(Map.Entry<Uri, byte[]> paramEntry)
  {
    return size() > 4;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.qs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */