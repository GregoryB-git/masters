package com.google.ads.interactivemedia.v3.internal;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

final class aiu
  extends ait
{
  private final ais a = new ais();
  
  public final void a(Throwable paramThrowable)
  {
    paramThrowable.printStackTrace();
    paramThrowable = a.a(paramThrowable, false);
    if (paramThrowable == null) {
      return;
    }
    try
    {
      Iterator localIterator = paramThrowable.iterator();
      while (localIterator.hasNext())
      {
        Throwable localThrowable = (Throwable)localIterator.next();
        System.err.print("Suppressed: ");
        localThrowable.printStackTrace();
      }
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aiu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */