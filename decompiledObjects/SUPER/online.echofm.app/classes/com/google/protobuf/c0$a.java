package com.google.protobuf;

import android.support.v4.media.a;
import java.util.Iterator;
import java.util.Map.Entry;

public class c0$a
  extends c0
{
  public c0$a(int paramInt)
  {
    super(paramInt, null);
  }
  
  public void p()
  {
    if (!o()) {
      if (k() <= 0)
      {
        Iterator localIterator = m().iterator();
        if (localIterator.hasNext())
        {
          a.a(((Map.Entry)localIterator.next()).getKey());
          throw null;
        }
      }
      else
      {
        a.a(j(0).getKey());
        throw null;
      }
    }
    super.p();
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.c0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */