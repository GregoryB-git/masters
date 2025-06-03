package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.UUID;

public abstract class agp
{
  public DisplayMetrics a;
  public agv b;
  private agu c;
  
  public agp(Context paramContext, agv paramagv, agu paramagu)
  {
    b = paramagv;
    c = paramagu;
    try
    {
      a = paramContext.getResources().getDisplayMetrics();
      return;
    }
    catch (UnsupportedOperationException paramContext)
    {
      paramContext = new DisplayMetrics();
      a = paramContext;
      density = 1.0F;
    }
  }
  
  private String a(Context paramContext, String paramString, boolean paramBoolean)
  {
    try
    {
      try
      {
        a();
        if (paramBoolean) {
          b(paramContext);
        } else {
          a(paramContext);
        }
        paramContext = b();
        if (paramContext.length == 0) {
          paramContext = Integer.toString(5);
        } else {
          paramContext = a(paramContext, paramString);
        }
      }
      finally {}
      return paramContext;
    }
    catch (IOException paramContext)
    {
      paramContext = Integer.toString(3);
    }
    catch (UnsupportedEncodingException paramContext)
    {
      paramContext = Integer.toString(7);
    }
    catch (NoSuchAlgorithmException paramContext)
    {
      paramContext = Integer.toString(7);
    }
  }
  
  private void a()
  {
    c.a();
  }
  
  public static void a(String paramString, byte[] paramArrayOfByte)
    throws UnsupportedEncodingException
  {
    String str = paramString;
    if (paramString.length() > 32) {
      str = paramString.substring(0, 32);
    }
    new ajc(str.getBytes("UTF-8")).a(paramArrayOfByte);
  }
  
  private byte[] b()
    throws IOException
  {
    return c.b();
  }
  
  public String a(String paramString)
  {
    Object localObject = paramString;
    if (paramString != null)
    {
      localObject = paramString;
      if (paramString.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$"))
      {
        paramString = UUID.fromString(paramString);
        localObject = new byte[16];
        ByteBuffer localByteBuffer = ByteBuffer.wrap((byte[])localObject);
        localByteBuffer.putLong(paramString.getMostSignificantBits());
        localByteBuffer.putLong(paramString.getLeastSignificantBits());
        localObject = b.a((byte[])localObject, true);
      }
    }
    return (String)localObject;
  }
  
  public String a(byte[] paramArrayOfByte, String paramString)
    throws NoSuchAlgorithmException, UnsupportedEncodingException, IOException
  {
    Object localObject = paramArrayOfByte;
    if (paramArrayOfByte.length > 239)
    {
      a();
      a(20, 1L);
      localObject = b();
    }
    if (localObject.length < 239)
    {
      paramArrayOfByte = new byte[239 - localObject.length];
      new SecureRandom().nextBytes(paramArrayOfByte);
      paramArrayOfByte = ByteBuffer.allocate(240).put((byte)localObject.length).put((byte[])localObject).put(paramArrayOfByte).array();
    }
    else
    {
      paramArrayOfByte = ByteBuffer.allocate(240).put((byte)localObject.length).put((byte[])localObject).array();
    }
    localObject = MessageDigest.getInstance("MD5");
    ((MessageDigest)localObject).update(paramArrayOfByte);
    localObject = ((MessageDigest)localObject).digest();
    paramArrayOfByte = ByteBuffer.allocate(256).put((byte[])localObject).put(paramArrayOfByte).array();
    localObject = new byte['Ā'];
    aga[] arrayOfaga = agbcN;
    int i = arrayOfaga.length;
    for (int j = 0; j < i; j++) {
      arrayOfaga[j].a(paramArrayOfByte, (byte[])localObject);
    }
    if ((paramString != null) && (paramString.length() > 0)) {
      a(paramString, (byte[])localObject);
    }
    return b.a((byte[])localObject, true);
  }
  
  public void a(int paramInt, long paramLong)
    throws IOException
  {
    c.a(paramInt, paramLong);
  }
  
  public void a(int paramInt, String paramString)
    throws IOException
  {
    c.a(paramInt, paramString);
  }
  
  public abstract void a(Context paramContext);
  
  public abstract void b(Context paramContext);
  
  public String d(Context paramContext)
  {
    return a(paramContext, null, false);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.agp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */