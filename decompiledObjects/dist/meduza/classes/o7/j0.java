package o7;

import java.io.Serializable;

public final class j0
  extends k0<Comparable<?>>
  implements Serializable
{
  public static final j0 a = new j0();
  
  public final <S extends Comparable<?>> k0<S> a()
  {
    return o0.a;
  }
  
  public final int compare(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (Comparable)paramObject1;
    paramObject2 = (Comparable)paramObject2;
    paramObject1.getClass();
    paramObject2.getClass();
    return ((Comparable)paramObject1).compareTo(paramObject2);
  }
  
  public final String toString()
  {
    return "Ordering.natural()";
  }
}

/* Location:
 * Qualified Name:     o7.j0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */