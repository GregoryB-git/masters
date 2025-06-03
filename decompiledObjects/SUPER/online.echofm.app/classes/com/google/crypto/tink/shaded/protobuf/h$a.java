package com.google.crypto.tink.shaded.protobuf;

import java.util.NoSuchElementException;

public class h$a
  extends h.c
{
  public int o = 0;
  public final int p;
  
  public h$a(h paramh)
  {
    p = paramh.size();
  }
  
  public byte c()
  {
    int i = o;
    if (i < p)
    {
      o = (i + 1);
      return q.D(i);
    }
    throw new NoSuchElementException();
  }
  
  public boolean hasNext()
  {
    boolean bool;
    if (o < p) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */