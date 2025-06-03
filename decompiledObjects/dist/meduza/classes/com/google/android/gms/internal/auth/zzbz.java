package com.google.android.gms.internal.auth;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import t6.a;
import t6.b;

public abstract class zzbz
  extends b
{
  public final byte[] toByteArray()
  {
    try
    {
      byte[] arrayOfByte = toString().getBytes("UTF-8");
      return arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Log.e("AUTH", "Error serializing object.", localUnsupportedEncodingException);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzbz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */