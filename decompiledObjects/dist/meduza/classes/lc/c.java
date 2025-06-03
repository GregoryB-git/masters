package lc;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class c
  implements Iterator<String>
{
  public final CharSequence a;
  public int b;
  public int c;
  public int d;
  public int e;
  
  public c(CharSequence paramCharSequence)
  {
    a = paramCharSequence;
  }
  
  public final boolean hasNext()
  {
    int i = b;
    boolean bool = false;
    if (i != 0)
    {
      if (i == 1) {
        bool = true;
      }
      return bool;
    }
    i = e;
    int j = 2;
    if (i < 0)
    {
      b = 2;
      return false;
    }
    int k = -1;
    int m = a.length();
    i = c;
    int n = a.length();
    for (;;)
    {
      i1 = k;
      i2 = m;
      if (i >= n) {
        break label172;
      }
      i2 = a.charAt(i);
      if ((i2 == 10) || (i2 == 13)) {
        break;
      }
      i++;
    }
    if (i2 == 13)
    {
      i2 = i + 1;
      if ((i2 < a.length()) && (a.charAt(i2) == '\n'))
      {
        i2 = j;
        break label165;
      }
    }
    int i2 = 1;
    label165:
    int i1 = i2;
    i2 = i;
    label172:
    b = 1;
    e = i1;
    d = i2;
    return true;
  }
  
  public final Object next()
  {
    if (hasNext())
    {
      b = 0;
      int i = d;
      int j = c;
      c = (e + i);
      return a.subSequence(j, i).toString();
    }
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}

/* Location:
 * Qualified Name:     lc.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */