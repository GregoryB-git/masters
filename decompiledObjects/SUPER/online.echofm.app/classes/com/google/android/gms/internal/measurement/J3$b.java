package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class J3$b
  extends IOException
{
  public J3$b(String paramString, Throwable paramThrowable)
  {
    super(localStringBuilder.toString(), paramThrowable);
  }
  
  public J3$b(Throwable paramThrowable)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.", paramThrowable);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.J3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */