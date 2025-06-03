package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
import java.io.IOException;

public final class ba
  extends Exception
{
  private ba(int paramInt1, Throwable paramThrowable, int paramInt2)
  {
    super(paramThrowable);
    SystemClock.elapsedRealtime();
  }
  
  public static ba a(IOException paramIOException)
  {
    return new ba(0, paramIOException, -1);
  }
  
  public static ba a(Exception paramException, int paramInt)
  {
    return new ba(1, paramException, paramInt);
  }
  
  public static ba a(OutOfMemoryError paramOutOfMemoryError)
  {
    return new ba(4, paramOutOfMemoryError, -1);
  }
  
  public static ba a(RuntimeException paramRuntimeException)
  {
    return new ba(2, paramRuntimeException, -1);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ba
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */