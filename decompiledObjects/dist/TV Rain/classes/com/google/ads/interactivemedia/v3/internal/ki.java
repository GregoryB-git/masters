package com.google.ads.interactivemedia.v3.internal;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class ki
{
  private final ByteArrayOutputStream a;
  private final DataOutputStream b;
  
  public ki()
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(512);
    a = localByteArrayOutputStream;
    b = new DataOutputStream(localByteArrayOutputStream);
  }
  
  private static void a(DataOutputStream paramDataOutputStream, long paramLong)
    throws IOException
  {
    paramDataOutputStream.writeByte((int)(paramLong >>> 24) & 0xFF);
    paramDataOutputStream.writeByte((int)(paramLong >>> 16) & 0xFF);
    paramDataOutputStream.writeByte((int)(paramLong >>> 8) & 0xFF);
    paramDataOutputStream.writeByte((int)paramLong & 0xFF);
  }
  
  private static void a(DataOutputStream paramDataOutputStream, String paramString)
    throws IOException
  {
    paramDataOutputStream.writeBytes(paramString);
    paramDataOutputStream.writeByte(0);
  }
  
  public final byte[] a(kh paramkh)
  {
    a.reset();
    try
    {
      a(b, a);
      String str = b;
      if (str == null) {
        str = "";
      }
      a(b, str);
      a(b, c);
      a(b, d);
      b.write(e);
      b.flush();
      paramkh = a.toByteArray();
      return paramkh;
    }
    catch (IOException paramkh)
    {
      throw new RuntimeException(paramkh);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ki
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */