package g0;

import java.util.NoSuchElementException;

public final class q
{
  public int a;
  public int b;
  public int c;
  public long[] d;
  public int e;
  
  public q()
  {
    this(16);
  }
  
  public q(int paramInt)
  {
    boolean bool;
    if ((paramInt >= 0) && (paramInt <= 1073741824)) {
      bool = true;
    } else {
      bool = false;
    }
    a.a(bool);
    int i = paramInt;
    if (paramInt == 0) {
      i = 1;
    }
    paramInt = i;
    if (Integer.bitCount(i) != 1) {
      paramInt = Integer.highestOneBit(i - 1) << 1;
    }
    a = 0;
    b = -1;
    c = 0;
    long[] arrayOfLong = new long[paramInt];
    d = arrayOfLong;
    e = (arrayOfLong.length - 1);
  }
  
  public void a()
  {
    a = 0;
    b = -1;
    c = 0;
  }
  
  public long b()
  {
    if (c != 0) {
      return d[a];
    }
    throw new NoSuchElementException();
  }
  
  public boolean c()
  {
    boolean bool;
    if (c == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public long d()
  {
    int i = c;
    if (i != 0)
    {
      long[] arrayOfLong = d;
      int j = a;
      long l = arrayOfLong[j];
      a = (e & j + 1);
      c = (i - 1);
      return l;
    }
    throw new NoSuchElementException();
  }
}

/* Location:
 * Qualified Name:     g0.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */