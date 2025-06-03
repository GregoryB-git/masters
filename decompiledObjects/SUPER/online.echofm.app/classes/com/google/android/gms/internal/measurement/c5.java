package com.google.android.gms.internal.measurement;

import android.support.v4.media.a;
import java.util.Iterator;
import java.util.Map.Entry;

public final class c5
  extends d5
{
  public c5(int paramInt)
  {
    super(paramInt, null);
  }
  
  public final void f()
  {
    if (!o()) {
      if (g() <= 0)
      {
        Iterator localIterator = j().iterator();
        if (localIterator.hasNext())
        {
          a.a(((Map.Entry)localIterator.next()).getKey());
          throw null;
        }
      }
      else
      {
        a.a(h(0).getKey());
        throw null;
      }
    }
    super.f();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.c5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */