package com.google.android.recaptcha.internal;

import java.io.IOException;

public final class zzll
  extends IOException
{
  public zzll()
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.");
  }
  
  public zzll(String paramString, Throwable paramThrowable)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(paramString)), paramThrowable);
  }
  
  public zzll(Throwable paramThrowable)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.", paramThrowable);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzll
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */