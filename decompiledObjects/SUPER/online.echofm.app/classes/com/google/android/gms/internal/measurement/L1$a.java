package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class L1$a
  extends Y3.b
  implements K4
{
  public L1$a()
  {
    super(L1.O());
  }
  
  public final String A()
  {
    return ((L1)p).T();
  }
  
  public final List B()
  {
    return Collections.unmodifiableList(((L1)p).U());
  }
  
  public final List C()
  {
    return Collections.unmodifiableList(((L1)p).V());
  }
  
  public final int w()
  {
    return ((L1)p).K();
  }
  
  public final K1 x(int paramInt)
  {
    return ((L1)p).G(paramInt);
  }
  
  public final a y(int paramInt, K1.a parama)
  {
    s();
    L1.J((L1)p, paramInt, (K1)parama.p());
    return this;
  }
  
  public final a z()
  {
    s();
    L1.I((L1)p);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.L1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */