package j9;

import q0.g;

public abstract class k$c
  implements Comparable<c>
{
  public final int compareTo(Object paramObject)
  {
    paramObject = (c)paramObject;
    int i = f().i(((c)paramObject).f());
    if (i == 0) {
      i = g.a(g(), ((c)paramObject).g());
    }
    return i;
  }
  
  public abstract l f();
  
  public abstract int g();
}

/* Location:
 * Qualified Name:     j9.k.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */