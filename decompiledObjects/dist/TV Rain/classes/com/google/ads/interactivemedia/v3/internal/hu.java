package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;
import android.webkit.WebView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class hu
{
  private final f a;
  private final WebView b;
  private final List<e> c = new ArrayList();
  private final String d;
  private final String e;
  private final d f;
  
  private hu(f paramf, WebView paramWebView, String paramString1, List<e> paramList, String paramString2)
  {
    a = paramf;
    b = paramWebView;
    d = null;
    f = d.a;
    e = paramString2;
  }
  
  public static hu a(f paramf, WebView paramWebView, String paramString)
  {
    h.a(paramf, "Partner is null");
    h.a(paramWebView, "WebView is null");
    if (paramString != null) {
      h.a(paramString, 256, "CustomReferenceData is greater than 256 characters");
    }
    return new hu(paramf, paramWebView, null, null, paramString);
  }
  
  public static UUID a(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new vy(paramArrayOfByte);
    if (paramArrayOfByte.c() < 32) {}
    int i;
    UUID localUUID;
    int j;
    do
    {
      for (;;)
      {
        paramArrayOfByte = null;
        break label178;
        paramArrayOfByte.c(0);
        if ((paramArrayOfByte.l() == paramArrayOfByte.b() + 4) && (paramArrayOfByte.l() == 1886614376))
        {
          i = ha.a(paramArrayOfByte.l());
          if (i <= 1) {
            break;
          }
          paramArrayOfByte = new StringBuilder(37);
          paramArrayOfByte.append("Unsupported pssh version: ");
          paramArrayOfByte.append(i);
          Log.w("PsshAtomUtil", paramArrayOfByte.toString());
        }
      }
      localUUID = new UUID(paramArrayOfByte.m(), paramArrayOfByte.m());
      if (i == 1) {
        paramArrayOfByte.d(paramArrayOfByte.p() * 16);
      }
      j = paramArrayOfByte.p();
    } while (j != paramArrayOfByte.b());
    byte[] arrayOfByte = new byte[j];
    paramArrayOfByte.a(arrayOfByte, 0, j);
    paramArrayOfByte = new hx(localUUID, i, arrayOfByte);
    label178:
    if (paramArrayOfByte == null) {
      return null;
    }
    return hx.a(paramArrayOfByte);
  }
  
  public static byte[] a(UUID paramUUID, UUID[] paramArrayOfUUID, byte[] paramArrayOfByte)
  {
    int i = 0;
    if (paramArrayOfByte != null) {
      j = paramArrayOfByte.length;
    } else {
      j = 0;
    }
    int k = j + 32;
    int j = k;
    if (paramArrayOfUUID != null) {
      j = k + ((paramArrayOfUUID.length << 4) + 4);
    }
    ByteBuffer localByteBuffer = ByteBuffer.allocate(j);
    localByteBuffer.putInt(j);
    localByteBuffer.putInt(1886614376);
    if (paramArrayOfUUID != null) {
      j = 16777216;
    } else {
      j = 0;
    }
    localByteBuffer.putInt(j);
    localByteBuffer.putLong(paramUUID.getMostSignificantBits());
    localByteBuffer.putLong(paramUUID.getLeastSignificantBits());
    if (paramArrayOfUUID != null)
    {
      localByteBuffer.putInt(paramArrayOfUUID.length);
      k = paramArrayOfUUID.length;
      for (j = i; j < k; j++)
      {
        paramUUID = paramArrayOfUUID[j];
        localByteBuffer.putLong(paramUUID.getMostSignificantBits());
        localByteBuffer.putLong(paramUUID.getLeastSignificantBits());
      }
    }
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length != 0))
    {
      localByteBuffer.putInt(paramArrayOfByte.length);
      localByteBuffer.put(paramArrayOfByte);
    }
    return localByteBuffer.array();
  }
  
  public f a()
  {
    return a;
  }
  
  public List<e> b()
  {
    return Collections.unmodifiableList(c);
  }
  
  public WebView c()
  {
    return b;
  }
  
  public String d()
  {
    return e;
  }
  
  public String e()
  {
    return d;
  }
  
  public d f()
  {
    return f;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.hu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */