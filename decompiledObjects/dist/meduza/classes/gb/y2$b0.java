package gb;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public final class y2$b0
{
  public final int a;
  public final int b;
  public final int c;
  public final AtomicInteger d;
  
  public y2$b0(float paramFloat1, float paramFloat2)
  {
    AtomicInteger localAtomicInteger = new AtomicInteger();
    d = localAtomicInteger;
    c = ((int)(paramFloat2 * 1000.0F));
    int i = (int)(paramFloat1 * 1000.0F);
    a = i;
    b = (i / 2);
    localAtomicInteger.set(i);
  }
  
  public final boolean a()
  {
    int i;
    boolean bool;
    int j;
    do
    {
      i = d.get();
      bool = false;
      if (i == 0) {
        return false;
      }
      j = i - 1000;
    } while (!d.compareAndSet(i, Math.max(j, 0)));
    if (j > b) {
      bool = true;
    }
    return bool;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof b0)) {
      return false;
    }
    paramObject = (b0)paramObject;
    if ((a != a) || (c != c)) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(a), Integer.valueOf(c) });
  }
}

/* Location:
 * Qualified Name:     gb.y2.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */