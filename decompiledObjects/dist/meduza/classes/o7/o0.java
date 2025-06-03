package o7;

import java.io.Serializable;

public final class o0
  extends k0<Comparable<?>>
  implements Serializable
{
  public static final o0 a = new o0();
  
  public final <S extends Comparable<?>> k0<S> a()
  {
    return j0.a;
  }
  
  public final int compare(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (Comparable)paramObject1;
    paramObject2 = (Comparable)paramObject2;
    paramObject1.getClass();
    int i;
    if (paramObject1 == paramObject2) {
      i = 0;
    } else {
      i = ((Comparable)paramObject2).compareTo(paramObject1);
    }
    return i;
  }
  
  public final String toString()
  {
    return "Ordering.natural().reverse()";
  }
}

/* Location:
 * Qualified Name:     o7.o0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */