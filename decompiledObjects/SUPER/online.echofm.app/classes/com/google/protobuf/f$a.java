package com.google.protobuf;

import java.util.NoSuchElementException;

public class f$a
  extends f.c
{
  public int o = 0;
  public final int p;
  
  public f$a(f paramf)
  {
    p = paramf.size();
  }
  
  public byte c()
  {
    int i = o;
    if (i < p)
    {
      o = (i + 1);
      return q.q(i);
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
 * Qualified Name:     com.google.protobuf.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */