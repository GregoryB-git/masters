package X2;

import W2.m;
import java.util.NoSuchElementException;

public abstract class a
  extends h0
{
  public final int o;
  public int p;
  
  public a(int paramInt1, int paramInt2)
  {
    m.l(paramInt2, paramInt1);
    o = paramInt1;
    p = paramInt2;
  }
  
  public abstract Object b(int paramInt);
  
  public final boolean hasNext()
  {
    boolean bool;
    if (p < o) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean hasPrevious()
  {
    boolean bool;
    if (p > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final Object next()
  {
    if (hasNext())
    {
      int i = p;
      p = (i + 1);
      return b(i);
    }
    throw new NoSuchElementException();
  }
  
  public final int nextIndex()
  {
    return p;
  }
  
  public final Object previous()
  {
    if (hasPrevious())
    {
      int i = p - 1;
      p = i;
      return b(i);
    }
    throw new NoSuchElementException();
  }
  
  public final int previousIndex()
  {
    return p - 1;
  }
}

/* Location:
 * Qualified Name:     X2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */