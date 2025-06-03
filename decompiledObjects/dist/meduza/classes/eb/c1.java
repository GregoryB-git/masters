package eb;

import java.util.Comparator;

public final class c1
  implements Comparator<Object>
{
  public c1(d1.a parama) {}
  
  public final int compare(Object paramObject1, Object paramObject2)
  {
    int i = a.b(paramObject1) - a.b(paramObject2);
    if (i != 0) {
      return i;
    }
    return paramObject1.getClass().getName().compareTo(paramObject2.getClass().getName());
  }
}

/* Location:
 * Qualified Name:     eb.c1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */