package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

public final class t3
  extends v3
{
  public int o = 0;
  public final int p;
  
  public t3(q3 paramq3)
  {
    p = paramq3.S();
  }
  
  public final byte a()
  {
    int i = o;
    if (i < p)
    {
      o = (i + 1);
      return q.M(i);
    }
    throw new NoSuchElementException();
  }
  
  public final boolean hasNext()
  {
    return o < p;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.t3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */